package org.apache.commons.imaging.formats.tiff;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCmyk;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes9.dex */
public class TiffImageParser extends ImageParser implements XmpEmbeddable {
    private static final String DEFAULT_EXTENSION = ".tif";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION, ".tiff"};

    private Rectangle checkForSubImage(Map<String, Object> map) {
        Integer integerParameter = getIntegerParameter(TiffConstants.PARAM_KEY_SUBIMAGE_X, map);
        Integer integerParameter2 = getIntegerParameter(TiffConstants.PARAM_KEY_SUBIMAGE_Y, map);
        Integer integerParameter3 = getIntegerParameter(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, map);
        Integer integerParameter4 = getIntegerParameter(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, map);
        if (integerParameter == null && integerParameter2 == null && integerParameter3 == null && integerParameter4 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        if (integerParameter == null) {
            sb.append(" x0,");
        }
        if (integerParameter2 == null) {
            sb.append(" y0,");
        }
        if (integerParameter3 == null) {
            sb.append(" width,");
        }
        if (integerParameter4 == null) {
            sb.append(" height,");
        }
        if (sb.length() <= 0) {
            return new Rectangle(integerParameter.intValue(), integerParameter2.intValue(), integerParameter3.intValue(), integerParameter4.intValue());
        }
        sb.setLength(sb.length() - 1);
        throw new ImageReadException("Incomplete subimage parameters, missing".concat(sb.toString()));
    }

    private Integer getIntegerParameter(String str, Map<String, Object> map) {
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        throw new ImageReadException(Recorder$$ExternalSyntheticOutline2.m("Non-Integer parameter ", str));
    }

    private PhotometricInterpreter getPhotometricInterpreter(TiffDirectory tiffDirectory, int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
        if (i == 0 || i == 1) {
            return new PhotometricInterpreterBiLevel(i4, iArr, i3, i5, i6, i == 0);
        }
        if (i == 2) {
            return new PhotometricInterpreterRgb(i4, iArr, i3, i5, i6);
        }
        if (i == 3) {
            int[] intArrayValue = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_COLOR_MAP, true).getIntArrayValue();
            int i7 = (1 << i2) * 3;
            if (intArrayValue.length == i7) {
                return new PhotometricInterpreterPalette(i4, iArr, i3, i5, i6, intArrayValue);
            }
            throw new ImageReadException(Recorder$$ExternalSyntheticOutline1.m(intArrayValue.length, i7, ")!=expectedColormapSize (", ")", new StringBuilder("Tiff: fColorMap.length (")));
        }
        if (i == 5) {
            return new PhotometricInterpreterCmyk(i4, iArr, i3, i5, i6);
        }
        if (i == 6) {
            return new PhotometricInterpreterYCbCr(i4, iArr, i3, i5, i6);
        }
        if (i == 8) {
            return new PhotometricInterpreterCieLab(i4, iArr, i3, i5, i6);
        }
        switch (i) {
            case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L /* 32844 */:
            case TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV /* 32845 */:
                return new PhotometricInterpreterLogLuv(i4, iArr, i3, i5, i6);
            default:
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "TIFF: Unknown fPhotometricInterpretation: "));
        }
    }

    public List<byte[]> collectRawImageData(ByteSource byteSource, Map<String, Object> map) {
        TiffContents readDirectories = new TiffReader(ImageParser.isStrict(map)).readDirectories(byteSource, true, FormatCompliance.getDefault());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readDirectories.directories.size(); i++) {
            for (TiffDirectory.ImageDataElement imageDataElement : readDirectories.directories.get(i).getTiffRawImageDataElements()) {
                arrayList.add(byteSource.getBlock(imageDataElement.offset, imageDataElement.length));
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        try {
            printWriter.println("tiff.dumpImageFile");
            ImageInfo imageInfo = getImageInfo(byteSource);
            if (imageInfo == null) {
                printWriter.println("");
                return false;
            }
            imageInfo.toString(printWriter, "");
            printWriter.println("");
            List<TiffDirectory> list = new TiffReader(true).readContents(byteSource, null, FormatCompliance.getDefault()).directories;
            if (list == null) {
                printWriter.println("");
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                List<TiffField> list2 = list.get(i).entries;
                if (list2 == null) {
                    printWriter.println("");
                    return false;
                }
                Iterator<TiffField> it = list2.iterator();
                while (it.hasNext()) {
                    it.next().dump(printWriter, Integer.toString(i));
                }
            }
            printWriter.println("");
            printWriter.println("");
            return true;
        } catch (Throwable th) {
            printWriter.println("");
            throw th;
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.TIFF};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource) {
        FormatCompliance formatCompliance = FormatCompliance.getDefault();
        TiffReader tiffReader = new TiffReader(true);
        TiffContents readDirectories = tiffReader.readDirectories(byteSource, true, formatCompliance);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readDirectories.directories.size(); i++) {
            BufferedImage tiffImage = readDirectories.directories.get(i).getTiffImage(tiffReader.getByteOrder(), null);
            if (tiffImage != null) {
                arrayList.add(tiffImage);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BufferedImage getBufferedImage(TiffDirectory tiffDirectory, ByteOrder byteOrder, Map<String, Object> map) {
        Rectangle rectangle;
        int intValue;
        int[] iArr;
        TiffField findField;
        int i;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        PhotometricInterpreter photometricInterpreter;
        if (tiffDirectory.entries == null) {
            f$$ExternalSyntheticLambda0.m("TIFF missing entries");
            return null;
        }
        int fieldValue = tiffDirectory.getFieldValue(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION) & HPKE.aead_EXPORT_ONLY;
        TagInfoShort tagInfoShort = TiffTagConstants.TIFF_TAG_COMPRESSION;
        int fieldValue2 = (tiffDirectory.findField(tagInfoShort) != null ? tiffDirectory.getFieldValue(tagInfoShort) : 1) & 65535;
        int singleFieldValue = tiffDirectory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        int singleFieldValue2 = tiffDirectory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
        Rectangle checkForSubImage = checkForSubImage(map);
        if (checkForSubImage != null) {
            if (checkForSubImage.width <= 0) {
                f$$ExternalSyntheticLambda0.m("negative or zero subimage width");
                return null;
            }
            if (checkForSubImage.height <= 0) {
                f$$ExternalSyntheticLambda0.m("negative or zero subimage height");
                return null;
            }
            if (checkForSubImage.x < 0 || checkForSubImage.x >= singleFieldValue) {
                f$$ExternalSyntheticLambda0.m("subimage x is outside raster");
                return null;
            }
            if (checkForSubImage.x + checkForSubImage.width > singleFieldValue) {
                f$$ExternalSyntheticLambda0.m("subimage (x+width) is outside raster");
                return null;
            }
            if (checkForSubImage.y < 0 || checkForSubImage.y >= singleFieldValue2) {
                f$$ExternalSyntheticLambda0.m("subimage y is outside raster");
                return null;
            }
            if (checkForSubImage.y + checkForSubImage.height > singleFieldValue2) {
                f$$ExternalSyntheticLambda0.m("subimage (y+height) is outside raster");
                return null;
            }
            if (checkForSubImage.x == 0 && checkForSubImage.y == 0 && checkForSubImage.width == singleFieldValue && checkForSubImage.height == singleFieldValue2) {
                rectangle = null;
                TiffField findField2 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
                intValue = findField2 == null ? findField2.getIntValue() : 1;
                iArr = new int[]{1};
                findField = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
                if (findField == null) {
                    iArr = findField.getIntArrayValue();
                    i = findField.getIntValueOrArraySum();
                } else {
                    i = intValue;
                }
                TiffField findField3 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_PREDICTOR);
                int intValueOrArraySum = findField3 == null ? findField3.getIntValueOrArraySum() : -1;
                if (intValue == iArr.length) {
                    throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(iArr.length, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(intValue, "Tiff: samplesPerPixel (", ")!=fBitsPerSample.length (")));
                }
                Object obj = map != null ? map.get(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER) : null;
                if (obj instanceof PhotometricInterpreter) {
                    photometricInterpreter = (PhotometricInterpreter) obj;
                    i2 = i;
                    i3 = singleFieldValue;
                    iArr2 = iArr;
                    i4 = intValueOrArraySum;
                } else {
                    i2 = i;
                    i3 = singleFieldValue;
                    iArr2 = iArr;
                    i4 = intValueOrArraySum;
                    photometricInterpreter = getPhotometricInterpreter(tiffDirectory, fieldValue, i2, iArr2, i4, intValue, i3, singleFieldValue2);
                }
                ImageDataReader dataReader = tiffDirectory.getTiffImageData().getDataReader(tiffDirectory, photometricInterpreter, i2, iArr2, i4, intValue, i3, singleFieldValue2, fieldValue2, byteOrder);
                if (rectangle != null) {
                    return dataReader.readImageData(rectangle);
                }
                ImageBuilder imageBuilder = new ImageBuilder(i3, singleFieldValue2, false);
                dataReader.readImageData(imageBuilder);
                return imageBuilder.getBufferedImage();
            }
        }
        rectangle = checkForSubImage;
        TiffField findField22 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        if (findField22 == null) {
        }
        iArr = new int[]{1};
        findField = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (findField == null) {
        }
        TiffField findField32 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_PREDICTOR);
        if (findField32 == null) {
        }
        if (intValue == iArr.length) {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TiffRasterData getFloatingPointRasterData(TiffDirectory tiffDirectory, ByteOrder byteOrder, Map<String, Object> map) {
        int[] iArr;
        int i;
        int i2;
        Rectangle rectangle;
        int intValueOrArraySum;
        if (tiffDirectory.entries == null) {
            f$$ExternalSyntheticLambda0.m("TIFF missing entries");
            return null;
        }
        if (tiffDirectory.getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, true)[0] != 3) {
            f$$ExternalSyntheticLambda0.m("TIFF does not provide floating-point data");
            return null;
        }
        TiffField findField = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL);
        int intValue = findField != null ? findField.getIntValue() : 1;
        if (intValue != 1) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "TIFF floating-point data uses unsupported samples per pixel: "));
        }
        int[] iArr2 = {1};
        TiffField findField2 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        if (findField2 != null) {
            int[] intArrayValue = findField2.getIntArrayValue();
            int intValueOrArraySum2 = findField2.getIntValueOrArraySum();
            iArr = intArrayValue;
            i = 1;
            i2 = intValueOrArraySum2;
        } else {
            iArr = iArr2;
            i = 1;
            i2 = intValue;
        }
        if (i2 != 32 && i2 != 64) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "TIFF floating-point data uses unsupported bits-per-pixel: "));
        }
        TagInfoShort tagInfoShort = TiffTagConstants.TIFF_TAG_COMPRESSION;
        if (tiffDirectory.findField(tagInfoShort) != null) {
            i = tiffDirectory.getFieldValue(tagInfoShort);
        }
        int i3 = i & 65535;
        int singleFieldValue = tiffDirectory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH);
        int singleFieldValue2 = tiffDirectory.getSingleFieldValue(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH);
        Rectangle checkForSubImage = checkForSubImage(map);
        if (checkForSubImage != null) {
            if (checkForSubImage.width <= 0) {
                f$$ExternalSyntheticLambda0.m("negative or zero subimage width");
                return null;
            }
            if (checkForSubImage.height <= 0) {
                f$$ExternalSyntheticLambda0.m("negative or zero subimage height");
                return null;
            }
            if (checkForSubImage.x < 0 || checkForSubImage.x >= singleFieldValue) {
                f$$ExternalSyntheticLambda0.m("subimage x is outside raster");
                return null;
            }
            if (checkForSubImage.x + checkForSubImage.width > singleFieldValue) {
                f$$ExternalSyntheticLambda0.m("subimage (x+width) is outside raster");
                return null;
            }
            if (checkForSubImage.y < 0 || checkForSubImage.y >= singleFieldValue2) {
                f$$ExternalSyntheticLambda0.m("subimage y is outside raster");
                return null;
            }
            if (checkForSubImage.y + checkForSubImage.height > singleFieldValue2) {
                f$$ExternalSyntheticLambda0.m("subimage (y+height) is outside raster");
                return null;
            }
            if (checkForSubImage.x == 0 && checkForSubImage.y == 0 && checkForSubImage.width == singleFieldValue && checkForSubImage.height == singleFieldValue2) {
                rectangle = null;
                TiffField findField3 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_PREDICTOR);
                intValueOrArraySum = findField3 == null ? findField3.getIntValueOrArraySum() : -1;
                if (intValueOrArraySum == 2) {
                    int i4 = intValueOrArraySum;
                    return tiffDirectory.getTiffImageData().getDataReader(tiffDirectory, new PhotometricInterpreterBiLevel(intValue, iArr, i4, singleFieldValue, singleFieldValue2, false), i2, iArr, i4, intValue, singleFieldValue, singleFieldValue2, i3, byteOrder).readRasterData(rectangle);
                }
                f$$ExternalSyntheticLambda0.m("TIFF floating-point data uses unsupported horizontal-differencing predictor");
                return null;
            }
        }
        rectangle = checkForSubImage;
        TiffField findField32 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_PREDICTOR);
        if (findField32 == null) {
        }
        if (intValueOrArraySum == 2) {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public FormatCompliance getFormatCompliance(ByteSource byteSource) {
        FormatCompliance formatCompliance = FormatCompliance.getDefault();
        new TiffReader(ImageParser.isStrict(null)).readContents(byteSource, null, formatCompliance);
        return formatCompliance;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return new TiffReader(ImageParser.isStrict(map)).readFirstDirectory(byteSource, map, false, FormatCompliance.getDefault()).directories.get(0).getFieldValue((TagInfoBytes) TiffEpTagConstants.EXIF_TAG_INTER_COLOR_PROFILE, false);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        float f;
        float f2;
        int i;
        int i2;
        ImageInfo.CompressionAlgorithm compressionAlgorithm;
        double d;
        float f3;
        int i3;
        TiffContents readDirectories = new TiffReader(ImageParser.isStrict(map)).readDirectories(byteSource, false, FormatCompliance.getDefault());
        TiffDirectory tiffDirectory = readDirectories.directories.get(0);
        TiffField findField = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        TiffField findField2 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);
        if (findField == null || findField2 == null) {
            f$$ExternalSyntheticLambda0.m("TIFF image missing size info.");
            return null;
        }
        int intValue = findField2.getIntValue();
        int intValue2 = findField.getIntValue();
        TiffField findField3 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_RESOLUTION_UNIT);
        int intValue3 = (findField3 == null || findField3.getValue() == null) ? 2 : findField3.getIntValue();
        double d2 = intValue3 != 2 ? intValue3 != 3 ? -1.0d : 2.54d : 1.0d;
        float f4 = -1.0f;
        int i4 = -1;
        if (d2 > 0.0d) {
            TiffField findField4 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_XRESOLUTION);
            TiffField findField5 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_YRESOLUTION);
            if (findField4 == null || findField4.getValue() == null) {
                d = d2;
                f3 = -1.0f;
                i3 = -1;
            } else {
                double doubleValue = findField4.getDoubleValue() * d2;
                d = d2;
                i3 = (int) Math.round(doubleValue);
                f3 = (float) (intValue2 / doubleValue);
            }
            if (findField5 != null && findField5.getValue() != null) {
                double doubleValue2 = findField5.getDoubleValue() * d;
                i4 = (int) Math.round(doubleValue2);
                f4 = (float) (intValue / doubleValue2);
            }
            i2 = i3;
            f2 = f3;
            f = f4;
            i = i4;
        } else {
            f = -1.0f;
            f2 = -1.0f;
            i = -1;
            i2 = -1;
        }
        TiffField findField6 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE);
        int intValueOrArraySum = (findField6 == null || findField6.getValue() == null) ? 1 : findField6.getIntValueOrArraySum();
        List<TiffField> list = tiffDirectory.entries;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TiffField> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        ImageFormats imageFormats = ImageFormats.TIFF;
        int size = readDirectories.directories.size();
        String str = "Tiff v." + readDirectories.header.tiffVersion;
        boolean z = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_COLOR_MAP) != null;
        ImageInfo.ColorType colorType = ImageInfo.ColorType.RGB;
        TagInfoShort tagInfoShort = TiffTagConstants.TIFF_TAG_COMPRESSION;
        int fieldValue = 65535 & (tiffDirectory.findField(tagInfoShort) != null ? tiffDirectory.getFieldValue(tagInfoShort) : (short) 1);
        if (fieldValue == 32771) {
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.NONE;
        } else if (fieldValue != 32773) {
            switch (fieldValue) {
                case 1:
                    compressionAlgorithm = ImageInfo.CompressionAlgorithm.NONE;
                    break;
                case 2:
                    compressionAlgorithm = ImageInfo.CompressionAlgorithm.CCITT_1D;
                    break;
                case 3:
                    compressionAlgorithm = ImageInfo.CompressionAlgorithm.CCITT_GROUP_3;
                    break;
                case 4:
                    compressionAlgorithm = ImageInfo.CompressionAlgorithm.CCITT_GROUP_4;
                    break;
                case 5:
                    compressionAlgorithm = ImageInfo.CompressionAlgorithm.LZW;
                    break;
                case 6:
                    compressionAlgorithm = ImageInfo.CompressionAlgorithm.JPEG;
                    break;
                default:
                    compressionAlgorithm = ImageInfo.CompressionAlgorithm.UNKNOWN;
                    break;
            }
        } else {
            compressionAlgorithm = ImageInfo.CompressionAlgorithm.PACKBITS;
        }
        return new ImageInfo(str, intValueOrArraySum, arrayList, imageFormats, "TIFF Tag-based Image File Format", intValue, "image/tiff", size, i, f, i2, f2, intValue2, false, false, z, colorType, compressionAlgorithm);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        TiffDirectory tiffDirectory = new TiffReader(ImageParser.isStrict(map)).readFirstDirectory(byteSource, map, false, FormatCompliance.getDefault()).directories.get(0);
        TiffField findField = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, true);
        TiffField findField2 = tiffDirectory.findField(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, true);
        if (findField == null || findField2 == null) {
            f$$ExternalSyntheticLambda0.m("TIFF image missing size info.");
            return null;
        }
        return new Dimension(findField.getIntValue(), findField2.getIntValue());
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        FormatCompliance formatCompliance = FormatCompliance.getDefault();
        TiffReader tiffReader = new TiffReader(ImageParser.isStrict(map));
        TiffContents readContents = tiffReader.readContents(byteSource, map, formatCompliance);
        List<TiffDirectory> list = readContents.directories;
        TiffImageMetadata tiffImageMetadata = new TiffImageMetadata(readContents);
        for (TiffDirectory tiffDirectory : list) {
            TiffImageMetadata.Directory directory = new TiffImageMetadata.Directory(tiffReader.getByteOrder(), tiffDirectory);
            Iterator<TiffField> it = tiffDirectory.getDirectoryEntries().iterator();
            while (it.hasNext()) {
                directory.add(it.next());
            }
            tiffImageMetadata.add(directory);
        }
        return tiffImageMetadata;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Tiff-Custom";
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public String getXmpXml(ByteSource byteSource, Map<String, Object> map) {
        byte[] fieldValue = new TiffReader(ImageParser.isStrict(map)).readDirectories(byteSource, false, FormatCompliance.getDefault()).directories.get(0).getFieldValue(TiffTagConstants.TIFF_TAG_XMP, false);
        if (fieldValue == null) {
            return null;
        }
        return new String(fieldValue, StandardCharsets.UTF_8);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        new TiffImageWriterLossy().writeImage(bufferedImage, outputStream, map);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        FormatCompliance formatCompliance = FormatCompliance.getDefault();
        TiffReader tiffReader = new TiffReader(ImageParser.isStrict(map));
        TiffContents readFirstDirectory = tiffReader.readFirstDirectory(byteSource, map, true, formatCompliance);
        BufferedImage tiffImage = readFirstDirectory.directories.get(0).getTiffImage(tiffReader.getByteOrder(), map);
        if (tiffImage != null) {
            return tiffImage;
        }
        f$$ExternalSyntheticLambda0.m("TIFF does not contain an image.");
        return null;
    }
}
