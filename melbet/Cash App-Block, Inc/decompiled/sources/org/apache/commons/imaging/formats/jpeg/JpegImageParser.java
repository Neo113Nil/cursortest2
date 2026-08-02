package org.apache.commons.imaging.formats.jpeg;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.apache.commons.imaging.formats.jpeg.decoder.JpegDecoder;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcParser;
import org.apache.commons.imaging.formats.jpeg.iptc.PhotoshopApp13Data;
import org.apache.commons.imaging.formats.jpeg.segments.App13Segment;
import org.apache.commons.imaging.formats.jpeg.segments.App14Segment;
import org.apache.commons.imaging.formats.jpeg.segments.App2Segment;
import org.apache.commons.imaging.formats.jpeg.segments.ComSegment;
import org.apache.commons.imaging.formats.jpeg.segments.DqtSegment;
import org.apache.commons.imaging.formats.jpeg.segments.GenericSegment;
import org.apache.commons.imaging.formats.jpeg.segments.JfifSegment;
import org.apache.commons.imaging.formats.jpeg.segments.Segment;
import org.apache.commons.imaging.formats.jpeg.segments.SofnSegment;
import org.apache.commons.imaging.formats.jpeg.segments.UnknownSegment;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegXmpParser;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.internal.Debug;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public class JpegImageParser extends ImageParser implements XmpEmbeddable {
    private static final Logger LOGGER = Logger.getLogger(JpegImageParser.class.getName());
    private static final String DEFAULT_EXTENSION = ".jpg";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION, ".jpeg"};

    public JpegImageParser() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    private byte[] assembleSegments(List<App2Segment> list, boolean z) {
        if (list.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("No App2 Segments Found.");
            return null;
        }
        int i = list.get(0).numMarkers;
        if (list.size() != i) {
            throw new ImageReadException("App2 Segments Missing.  Found: " + list.size() + ", Expected: " + i + ".");
        }
        Collections.sort(list);
        int i2 = !z ? 1 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            App2Segment app2Segment = list.get(i4);
            if (i4 + i2 != app2Segment.curMarker) {
                dumpSegments(list);
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(app2Segment.curMarker, ".", Recorder$$ExternalSyntheticOutline2.m107m(i4, i4, "Incoherent App2 Segment Ordering.  i: ", ", segment[", "].curMarker: ")));
            }
            if (i != app2Segment.numMarkers) {
                dumpSegments(list);
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(app2Segment.numMarkers, ".", Recorder$$ExternalSyntheticOutline2.m107m(i, i4, "Inconsistent App2 Segment Count info.  markerCount: ", ", segment[", "].numMarkers: ")));
            }
            i3 += app2Segment.getIccBytes().length;
        }
        byte[] bArr = new byte[i3];
        int i5 = 0;
        for (App2Segment app2Segment2 : list) {
            System.arraycopy(app2Segment2.getIccBytes(), 0, bArr, i5, app2Segment2.getIccBytes().length);
            i5 += app2Segment2.getIccBytes().length;
        }
        return bArr;
    }

    private void dumpSegments(List<? extends Segment> list) {
        Debug.debug();
        Debug.debug("dumpSegments: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            App2Segment app2Segment = (App2Segment) list.get(i);
            Debug.debug(i + ": " + app2Segment.curMarker + " / " + app2Segment.numMarkers);
        }
        Debug.debug();
    }

    private List<Segment> filterAPP1Segments(List<Segment> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Segment> it = list.iterator();
        while (it.hasNext()) {
            GenericSegment genericSegment = (GenericSegment) it.next();
            if (isExifAPP1Segment(genericSegment)) {
                arrayList.add(genericSegment);
            }
        }
        return arrayList;
    }

    public static boolean isExifAPP1Segment(GenericSegment genericSegment) {
        return BinaryFunctions.startsWith(genericSegment.getSegmentData(), JpegConstants.EXIF_IDENTIFIER_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean keepMarker(int i, int[] iArr) {
        if (iArr == null) {
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        printWriter.println("jpeg.dumpImageFile");
        ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        printWriter.println("");
        List<Segment> readSegments = readSegments(byteSource, null, false);
        if (readSegments == null) {
            f$$ExternalSyntheticLambda0.m("No Segments Found.");
            return false;
        }
        for (int i = 0; i < readSegments.size(); i++) {
            Segment segment = readSegments.get(i);
            printWriter.println(i + ": marker: " + Integer.toHexString(segment.marker) + ", " + segment.getDescription() + " (length: " + NumberFormat.getIntegerInstance().format(segment.length) + ")");
            segment.dump(printWriter);
        }
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.JPEG};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        return new JpegDecoder().decode(byteSource);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    public TiffImageMetadata getExifMetadata(ByteSource byteSource, Map<String, Object> map) {
        byte[] exifRawData = getExifRawData(byteSource);
        if (exifRawData == null) {
            return null;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey(ImagingConstants.PARAM_KEY_READ_THUMBNAILS)) {
            map.put(ImagingConstants.PARAM_KEY_READ_THUMBNAILS, Boolean.TRUE);
        }
        return (TiffImageMetadata) new TiffImageParser().getMetadata(exifRawData, map);
    }

    public byte[] getExifRawData(ByteSource byteSource) {
        List<Segment> readSegments = readSegments(byteSource, new int[]{JpegConstants.JPEG_APP1_MARKER}, false);
        if (readSegments != null && !readSegments.isEmpty()) {
            List<Segment> filterAPP1Segments = filterAPP1Segments(readSegments);
            Logger logger = LOGGER;
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("exif_segments.size: " + filterAPP1Segments.size());
            }
            if (filterAPP1Segments.isEmpty()) {
                return null;
            }
            if (filterAPP1Segments.size() <= 1) {
                return BinaryFunctions.remainingBytes("trimmed exif bytes", ((GenericSegment) filterAPP1Segments.get(0)).getSegmentData(), 6);
            }
            f$$ExternalSyntheticLambda0.m("Imaging currently can't parse EXIF metadata split across multiple APP1 segments.  Please send this image to the Imaging project.");
        }
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        List<Segment> readSegments = readSegments(byteSource, new int[]{JpegConstants.JPEG_APP2_MARKER}, false);
        ArrayList arrayList = new ArrayList();
        if (readSegments != null) {
            Iterator<Segment> it = readSegments.iterator();
            while (it.hasNext()) {
                App2Segment app2Segment = (App2Segment) it.next();
                if (app2Segment.getIccBytes() != null) {
                    arrayList.add(app2Segment);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        byte[] assembleSegments = assembleSegments(arrayList);
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("bytes: " + assembleSegments.length);
        }
        return assembleSegments;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        double d;
        double d2;
        double d3;
        String str;
        double d4;
        App14Segment app14Segment;
        float f;
        float f2;
        int i;
        int i2;
        ImageInfo.ColorType colorType;
        ImageInfo.ColorType colorType2;
        ImageInfo.ColorType colorType3;
        ImageInfo.ColorType colorType4;
        boolean z;
        List<Segment> readSegments = readSegments(byteSource, new int[]{JpegConstants.SOF0_MARKER, JpegConstants.SOF1_MARKER, JpegConstants.SOF2_MARKER, JpegConstants.SOF3_MARKER, JpegConstants.SOF5_MARKER, JpegConstants.SOF6_MARKER, JpegConstants.SOF7_MARKER, JpegConstants.SOF9_MARKER, JpegConstants.SOF10_MARKER, JpegConstants.SOF11_MARKER, JpegConstants.SOF13_MARKER, JpegConstants.SOF14_MARKER, JpegConstants.SOF15_MARKER}, false);
        App14Segment app14Segment2 = null;
        if (readSegments == null) {
            f$$ExternalSyntheticLambda0.m("No SOFN Data Found.");
            return null;
        }
        List<Segment> readSegments2 = readSegments(byteSource, new int[]{65504}, true);
        SofnSegment sofnSegment = (SofnSegment) readSegments.get(0);
        if (sofnSegment == null) {
            f$$ExternalSyntheticLambda0.m("No SOFN Data Found.");
            return null;
        }
        int i3 = sofnSegment.width;
        int i4 = sofnSegment.height;
        JfifSegment jfifSegment = (readSegments2 == null || readSegments2.isEmpty()) ? null : (JfifSegment) readSegments2.get(0);
        List<Segment> readSegments3 = readSegments(byteSource, new int[]{JpegConstants.JPEG_APP14_MARKER}, true);
        if (readSegments3 != null && !readSegments3.isEmpty()) {
            app14Segment2 = (App14Segment) readSegments3.get(0);
        }
        int i5 = 2;
        if (jfifSegment != null) {
            double d5 = jfifSegment.xDensity;
            double d6 = jfifSegment.yDensity;
            int i6 = jfifSegment.densityUnits;
            str = "Jpeg/JFIF v." + jfifSegment.jfifMajorVersion + "." + jfifSegment.jfifMinorVersion;
            d = i6 != 1 ? i6 != 2 ? -1.0d : 2.54d : 1.0d;
            d4 = d6;
            d3 = d5;
        } else {
            JpegImageMetadata jpegImageMetadata = (JpegImageMetadata) getMetadata(byteSource, map);
            if (jpegImageMetadata != null) {
                TiffField findEXIFValue = jpegImageMetadata.findEXIFValue(TiffTagConstants.TIFF_TAG_XRESOLUTION);
                double doubleValue = findEXIFValue != null ? ((Number) findEXIFValue.getValue()).doubleValue() : -1.0d;
                TiffField findEXIFValue2 = jpegImageMetadata.findEXIFValue(TiffTagConstants.TIFF_TAG_YRESOLUTION);
                d2 = findEXIFValue2 != null ? ((Number) findEXIFValue2.getValue()).doubleValue() : -1.0d;
                TiffField findEXIFValue3 = jpegImageMetadata.findEXIFValue(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
                if (findEXIFValue3 != null) {
                    int intValue = ((Number) findEXIFValue3.getValue()).intValue();
                    if (intValue == 2) {
                        d3 = doubleValue;
                        d = 1.0d;
                    } else if (intValue == 3) {
                        d3 = doubleValue;
                        d = 2.54d;
                    }
                }
                d3 = doubleValue;
                d = -1.0d;
            } else {
                d = -1.0d;
                d2 = -1.0d;
                d3 = -1.0d;
            }
            str = "Jpeg/DCM";
            d4 = d2;
        }
        double d7 = d;
        String str2 = str;
        if (d7 > 0.0d) {
            double d8 = d3 * d7;
            int round = (int) Math.round(d8);
            app14Segment = app14Segment2;
            double d9 = d4 * d7;
            f2 = (float) (i3 / d8);
            i = (int) Math.round(d9);
            i2 = round;
            f = (float) (i4 / d9);
        } else {
            app14Segment = app14Segment2;
            f = -1.0f;
            f2 = -1.0f;
            i = -1;
            i2 = -1;
        }
        List<Segment> readSegments4 = readSegments(byteSource, new int[]{JpegConstants.COM_MARKER}, false);
        ArrayList arrayList = new ArrayList(readSegments4.size());
        Iterator<Segment> it = readSegments4.iterator();
        while (it.hasNext()) {
            arrayList.add(new String(((ComSegment) it.next()).getComment(), StandardCharsets.UTF_8));
        }
        int i7 = sofnSegment.numberOfComponents;
        int i8 = i7 * sofnSegment.precision;
        ImageFormats imageFormats = ImageFormats.JPEG;
        boolean z2 = sofnSegment.marker == 65474;
        ImageInfo.ColorType colorType5 = ImageInfo.ColorType.UNKNOWN;
        if (app14Segment == null || !app14Segment.isAdobeJpegSegment()) {
            if (jfifSegment == null) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        colorType3 = ImageInfo.ColorType.GRAYSCALE;
                    } else {
                        if (i7 == 3 || i7 == 4) {
                            SofnSegment.Component[] components = sofnSegment.getComponents();
                            int length = components.length;
                            int i9 = 0;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            boolean z6 = false;
                            boolean z7 = false;
                            while (i9 < length) {
                                int i10 = components[i9].componentIdentifier;
                                if (i10 == 1) {
                                    z3 = true;
                                } else if (i10 == i5) {
                                    z4 = true;
                                } else {
                                    if (i10 == 3) {
                                        z5 = true;
                                    } else if (i10 == 4) {
                                        z6 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    i9++;
                                    i5 = 2;
                                }
                                i9++;
                                i5 = 2;
                            }
                            if (i7 == 3 && z3 && z4 && z5 && !z6 && !z7) {
                                colorType2 = ImageInfo.ColorType.YCbCr;
                            } else if (i7 == 4 && z3 && z4 && z5 && z6 && !z7) {
                                colorType3 = ImageInfo.ColorType.YCbCr;
                            } else {
                                SofnSegment.Component[] components2 = sofnSegment.getComponents();
                                int length2 = components2.length;
                                colorType = colorType5;
                                int i11 = 0;
                                boolean z8 = false;
                                boolean z9 = false;
                                boolean z10 = false;
                                boolean z11 = false;
                                boolean z12 = false;
                                boolean z13 = false;
                                boolean z14 = false;
                                while (i11 < length2) {
                                    int i12 = i11;
                                    int i13 = components2[i12].componentIdentifier;
                                    SofnSegment sofnSegment2 = sofnSegment;
                                    if (i13 == 82) {
                                        z8 = true;
                                    } else if (i13 == 71) {
                                        z9 = true;
                                    } else if (i13 == 66) {
                                        z10 = true;
                                    } else if (i13 == 65) {
                                        z11 = true;
                                    } else if (i13 == 67) {
                                        z12 = true;
                                    } else if (i13 == 99) {
                                        z13 = true;
                                    } else if (i13 == 89) {
                                        z14 = true;
                                    }
                                    i11 = i12 + 1;
                                    sofnSegment = sofnSegment2;
                                }
                                SofnSegment sofnSegment3 = sofnSegment;
                                if (z8 && z9 && z10 && !z11 && !z12 && !z13 && !z14) {
                                    colorType2 = ImageInfo.ColorType.RGB;
                                } else if (z8 && z9 && z10 && z11 && !z12 && !z13 && !z14) {
                                    colorType3 = ImageInfo.ColorType.RGB;
                                } else if (z14 && z12 && z13 && !z8 && !z9 && !z10 && !z11) {
                                    colorType2 = ImageInfo.ColorType.YCC;
                                } else if (z14 && z12 && z13 && z11 && !z8 && !z9 && !z10) {
                                    colorType3 = ImageInfo.ColorType.YCC;
                                } else {
                                    SofnSegment.Component[] components3 = sofnSegment3.getComponents();
                                    int i14 = PKIFailureInfo.systemUnavail;
                                    int i15 = Integer.MAX_VALUE;
                                    int i16 = Integer.MAX_VALUE;
                                    int i17 = Integer.MIN_VALUE;
                                    for (SofnSegment.Component component : components3) {
                                        int i18 = component.horizontalSamplingFactor;
                                        if (i15 > i18) {
                                            i15 = i18;
                                        }
                                        if (i14 < i18) {
                                            i14 = i18;
                                        }
                                        int i19 = component.verticalSamplingFactor;
                                        if (i16 > i19) {
                                            i16 = i19;
                                        }
                                        if (i17 < i19) {
                                            i17 = i19;
                                        }
                                    }
                                    boolean z15 = (i15 == i14 && i16 == i17) ? false : true;
                                    if (i7 == 3) {
                                        colorType2 = z15 ? ImageInfo.ColorType.YCbCr : ImageInfo.ColorType.RGB;
                                    } else {
                                        if (i7 == 4) {
                                            colorType2 = z15 ? ImageInfo.ColorType.YCCK : ImageInfo.ColorType.CMYK;
                                        }
                                        colorType4 = colorType;
                                    }
                                }
                            }
                            colorType4 = colorType2;
                        }
                        colorType = colorType5;
                        colorType4 = colorType;
                    }
                    colorType4 = colorType3;
                    z = true;
                    return new ImageInfo(str2, i8, arrayList, imageFormats, "JPEG (Joint Photographic Experts Group) Format", i4, "image/jpeg", 1, i, f, i2, f2, i3, z2, z, false, colorType4, ImageInfo.CompressionAlgorithm.JPEG);
                }
                colorType5 = ImageInfo.ColorType.GRAYSCALE;
            } else if (i7 == 1) {
                colorType5 = ImageInfo.ColorType.GRAYSCALE;
            } else {
                if (i7 == 3) {
                    colorType5 = ImageInfo.ColorType.YCbCr;
                }
                colorType = colorType5;
                colorType4 = colorType;
            }
            z = false;
            return new ImageInfo(str2, i8, arrayList, imageFormats, "JPEG (Joint Photographic Experts Group) Format", i4, "image/jpeg", 1, i, f, i2, f2, i3, z2, z, false, colorType4, ImageInfo.CompressionAlgorithm.JPEG);
        }
        int adobeColorTransform = app14Segment.getAdobeColorTransform();
        if (adobeColorTransform == 0) {
            if (i7 == 3) {
                colorType5 = ImageInfo.ColorType.RGB;
            } else if (i7 == 4) {
                colorType5 = ImageInfo.ColorType.CMYK;
            }
        } else if (adobeColorTransform == 1) {
            colorType5 = ImageInfo.ColorType.YCbCr;
        } else if (adobeColorTransform == 2) {
            colorType5 = ImageInfo.ColorType.YCCK;
        }
        colorType4 = colorType5;
        z = false;
        return new ImageInfo(str2, i8, arrayList, imageFormats, "JPEG (Joint Photographic Experts Group) Format", i4, "image/jpeg", 1, i, f, i2, f2, i3, z2, z, false, colorType4, ImageInfo.CompressionAlgorithm.JPEG);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        List<Segment> readSegments = readSegments(byteSource, new int[]{JpegConstants.SOF0_MARKER, JpegConstants.SOF1_MARKER, JpegConstants.SOF2_MARKER, JpegConstants.SOF3_MARKER, JpegConstants.SOF5_MARKER, JpegConstants.SOF6_MARKER, JpegConstants.SOF7_MARKER, JpegConstants.SOF9_MARKER, JpegConstants.SOF10_MARKER, JpegConstants.SOF11_MARKER, JpegConstants.SOF13_MARKER, JpegConstants.SOF14_MARKER, JpegConstants.SOF15_MARKER}, true);
        if (readSegments == null || readSegments.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("No JFIF Data Found.");
            return null;
        }
        if (readSegments.size() <= 1) {
            SofnSegment sofnSegment = (SofnSegment) readSegments.get(0);
            return new Dimension(sofnSegment.width, sofnSegment.height);
        }
        f$$ExternalSyntheticLambda0.m("Redundant JFIF Data Found.");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        TiffImageMetadata exifMetadata = getExifMetadata(byteSource, map);
        JpegPhotoshopMetadata photoshopMetadata = getPhotoshopMetadata(byteSource, map);
        if (exifMetadata == null && photoshopMetadata == null) {
            return null;
        }
        return new JpegImageMetadata(photoshopMetadata, exifMetadata);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Jpeg-Custom";
    }

    public JpegPhotoshopMetadata getPhotoshopMetadata(ByteSource byteSource, Map<String, Object> map) {
        List<Segment> readSegments = readSegments(byteSource, new int[]{JpegConstants.JPEG_APP13_MARKER}, false);
        if (readSegments == null || readSegments.isEmpty()) {
            return null;
        }
        Iterator<Segment> it = readSegments.iterator();
        PhotoshopApp13Data photoshopApp13Data = null;
        while (it.hasNext()) {
            PhotoshopApp13Data parsePhotoshopSegment = ((App13Segment) it.next()).parsePhotoshopSegment(map);
            if (parsePhotoshopSegment != null) {
                if (photoshopApp13Data != null) {
                    f$$ExternalSyntheticLambda0.m("Jpeg contains more than one Photoshop App13 segment.");
                    return null;
                }
                photoshopApp13Data = parsePhotoshopSegment;
            }
        }
        if (photoshopApp13Data == null) {
            return null;
        }
        return new JpegPhotoshopMetadata(photoshopApp13Data);
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public String getXmpXml(ByteSource byteSource, Map<String, Object> map) {
        final ArrayList arrayList = new ArrayList();
        new JpegUtils().traverseJFIF(byteSource, new JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.5
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                if (i == 65497) {
                    return false;
                }
                if (i != 65505 || !new JpegXmpParser().isXmpJpegSegment(bArr3)) {
                    return true;
                }
                arrayList.add(new JpegXmpParser().parseXmpJpegSegment(bArr3));
                return false;
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() <= 1) {
            return (String) arrayList.get(0);
        }
        f$$ExternalSyntheticLambda0.m("Jpeg file contains more than one XMP segment.");
        return null;
    }

    public boolean hasExifSegment(ByteSource byteSource) {
        final boolean[] zArr = {false};
        new JpegUtils().traverseJFIF(byteSource, new JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.2
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                if (i == 65497) {
                    return false;
                }
                if (i != 65505 || !BinaryFunctions.startsWith(bArr3, JpegConstants.EXIF_IDENTIFIER_CODE)) {
                    return true;
                }
                zArr[0] = true;
                return false;
            }
        });
        return zArr[0];
    }

    public boolean hasIptcSegment(ByteSource byteSource) {
        final boolean[] zArr = {false};
        new JpegUtils().traverseJFIF(byteSource, new JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.3
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                if (i == 65497) {
                    return false;
                }
                if (i != 65517 || !new IptcParser().isPhotoshopJpegSegment(bArr3)) {
                    return true;
                }
                zArr[0] = true;
                return false;
            }
        });
        return zArr[0];
    }

    public boolean hasXmpSegment(ByteSource byteSource) {
        final boolean[] zArr = {false};
        new JpegUtils().traverseJFIF(byteSource, new JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.4
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                if (i == 65497) {
                    return false;
                }
                if (i != 65505 || !new JpegXmpParser().isXmpJpegSegment(bArr3)) {
                    return true;
                }
                zArr[0] = true;
                return false;
            }
        });
        return zArr[0];
    }

    public List<Segment> readSegments(ByteSource byteSource, final int[] iArr, final boolean z, boolean z2) {
        final ArrayList arrayList = new ArrayList();
        final int[] iArr2 = {JpegConstants.SOF0_MARKER, JpegConstants.SOF1_MARKER, JpegConstants.SOF2_MARKER, JpegConstants.SOF3_MARKER, JpegConstants.SOF5_MARKER, JpegConstants.SOF6_MARKER, JpegConstants.SOF7_MARKER, JpegConstants.SOF9_MARKER, JpegConstants.SOF10_MARKER, JpegConstants.SOF11_MARKER, JpegConstants.SOF13_MARKER, JpegConstants.SOF14_MARKER, JpegConstants.SOF15_MARKER};
        new JpegUtils().traverseJFIF(byteSource, new JpegUtils.Visitor() { // from class: org.apache.commons.imaging.formats.jpeg.JpegImageParser.1
            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean beginSOS() {
                return false;
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public void visitSOS(int i, byte[] bArr, byte[] bArr2) {
            }

            @Override // org.apache.commons.imaging.formats.jpeg.JpegUtils.Visitor
            public boolean visitSegment(int i, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3) {
                if (i == 65497) {
                    return false;
                }
                if (!JpegImageParser.this.keepMarker(i, iArr)) {
                    return true;
                }
                if (i == 65517) {
                    arrayList.add(new App13Segment(this, i, bArr3));
                } else if (i == 65518) {
                    arrayList.add(new App14Segment(i, bArr3));
                } else if (i == 65506) {
                    arrayList.add(new App2Segment(i, bArr3));
                } else if (i == 65504) {
                    arrayList.add(new JfifSegment(i, bArr3));
                } else if (Arrays.binarySearch(iArr2, i) >= 0) {
                    arrayList.add(new SofnSegment(i, bArr3));
                } else if (i == 65499) {
                    arrayList.add(new DqtSegment(i, bArr3));
                } else if (i >= 65505 && i <= 65519) {
                    arrayList.add(new UnknownSegment(i, bArr3));
                } else if (i == 65534) {
                    arrayList.add(new ComSegment(i, bArr3));
                }
                return !z;
            }
        });
        return arrayList;
    }

    public List<Segment> readSegments(ByteSource byteSource, int[] iArr, boolean z) {
        return readSegments(byteSource, iArr, z, false);
    }

    private byte[] assembleSegments(List<App2Segment> list) {
        try {
            return assembleSegments(list, false);
        } catch (ImageReadException unused) {
            return this.assembleSegments(list, true);
        }
    }
}
