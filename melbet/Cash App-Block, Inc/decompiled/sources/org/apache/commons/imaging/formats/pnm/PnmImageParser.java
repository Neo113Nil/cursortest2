package org.apache.commons.imaging.formats.pnm;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.palette.PaletteFactory;

/* loaded from: classes9.dex */
public class PnmImageParser extends ImageParser {
    public static final String PARAM_KEY_PNM_RAWBITS = "PNM_RAWBITS";
    public static final String PARAM_VALUE_PNM_RAWBITS_NO = "NO";
    public static final String PARAM_VALUE_PNM_RAWBITS_YES = "YES";
    private static final String DEFAULT_EXTENSION = ".pnm";
    private static final String[] ACCEPTED_EXTENSIONS = {".pbm", ".pgm", ".ppm", DEFAULT_EXTENSION, ".pam"};

    public PnmImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x011f, code lost:
    
        if (r2 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
    
        if (r3 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        if (r5 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
    
        if (r6 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (r7 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
    
        return new org.apache.commons.imaging.formats.pnm.PamFileInfo(r12, r13, r14, r15, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m("PAM header has no TUPLTYPE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0139, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m("PAM header has no MAXVAL");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013f, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m("PAM header has no DEPTH");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0144, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m("PAM header has no HEIGHT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m("PAM header has no WIDTH");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        return r17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private FileInfo readHeader(InputStream inputStream) {
        FileInfo fileInfo;
        FileInfo fileInfo2;
        byte readByte = BinaryFunctions.readByte("Identifier1", inputStream, "Not a Valid PNM File");
        byte readByte2 = BinaryFunctions.readByte("Identifier2", inputStream, "Not a Valid PNM File");
        if (readByte != 80) {
            f$$ExternalSyntheticLambda0.m("PNM file has invalid prefix byte 1");
            return null;
        }
        WhiteSpaceReader whiteSpaceReader = new WhiteSpaceReader(inputStream);
        if (readByte2 == 49 || readByte2 == 52 || readByte2 == 50 || readByte2 == 53 || readByte2 == 51 || readByte2 == 54) {
            fileInfo = null;
            try {
                int parseInt = Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
                try {
                    int parseInt2 = Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
                    if (readByte2 == 49) {
                        return new PbmFileInfo(parseInt, parseInt2, false);
                    }
                    if (readByte2 == 52) {
                        return new PbmFileInfo(parseInt, parseInt2, true);
                    }
                    if (readByte2 == 50) {
                        return new PgmFileInfo(parseInt, parseInt2, false, Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                    if (readByte2 == 53) {
                        return new PgmFileInfo(parseInt, parseInt2, true, Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                    if (readByte2 == 51) {
                        return new PpmFileInfo(parseInt, parseInt2, false, Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                    if (readByte2 == 54) {
                        return new PpmFileInfo(parseInt, parseInt2, true, Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()));
                    }
                } catch (NumberFormatException e) {
                    throw new ImageReadException("Invalid height specified.", e);
                }
            } catch (NumberFormatException e2) {
                throw new ImageReadException("Invalid width specified.", e2);
            }
        } else if (readByte2 == 55) {
            StringBuilder sb = new StringBuilder();
            whiteSpaceReader.readLine();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                String readLine = whiteSpaceReader.readLine();
                if (readLine == null) {
                    fileInfo2 = null;
                    break;
                }
                String trim = readLine.trim();
                fileInfo2 = null;
                if (trim.charAt(0) != '#') {
                    StringTokenizer stringTokenizer = new StringTokenizer(trim, " ", false);
                    String nextToken = stringTokenizer.nextToken();
                    if ("WIDTH".equals(nextToken)) {
                        if (!stringTokenizer.hasMoreTokens()) {
                            f$$ExternalSyntheticLambda0.m("PAM header has no WIDTH value");
                            return null;
                        }
                        i = Integer.parseInt(stringTokenizer.nextToken());
                        z = true;
                    } else if ("HEIGHT".equals(nextToken)) {
                        if (!stringTokenizer.hasMoreTokens()) {
                            f$$ExternalSyntheticLambda0.m("PAM header has no HEIGHT value");
                            return null;
                        }
                        i2 = Integer.parseInt(stringTokenizer.nextToken());
                        z2 = true;
                    } else if ("DEPTH".equals(nextToken)) {
                        if (!stringTokenizer.hasMoreTokens()) {
                            f$$ExternalSyntheticLambda0.m("PAM header has no DEPTH value");
                            return null;
                        }
                        i3 = Integer.parseInt(stringTokenizer.nextToken());
                        z3 = true;
                    } else if ("MAXVAL".equals(nextToken)) {
                        if (!stringTokenizer.hasMoreTokens()) {
                            f$$ExternalSyntheticLambda0.m("PAM header has no MAXVAL value");
                            return null;
                        }
                        i4 = Integer.parseInt(stringTokenizer.nextToken());
                        z4 = true;
                    } else if ("TUPLTYPE".equals(nextToken)) {
                        if (!stringTokenizer.hasMoreTokens()) {
                            f$$ExternalSyntheticLambda0.m("PAM header has no TUPLTYPE value");
                            return null;
                        }
                        sb.append(stringTokenizer.nextToken());
                        z5 = true;
                    } else if (!"ENDHDR".equals(nextToken)) {
                        throw new ImageReadException(Recorder$$ExternalSyntheticOutline2.m("Invalid PAM file header type ", nextToken));
                    }
                }
            }
        } else {
            fileInfo = null;
        }
        f$$ExternalSyntheticLambda0.m("PNM file has invalid prefix byte 2");
        return fileInfo;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        printWriter.println("pnm.dumpImageFile");
        ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        printWriter.println("");
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.PBM, ImageFormats.PGM, ImageFormats.PPM, ImageFormats.PNM, ImageFormats.PAM};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            FileInfo readHeader = readHeader(inputStream);
            ImageBuilder imageBuilder = new ImageBuilder(readHeader.width, readHeader.height, readHeader.hasAlpha());
            readHeader.readImage(imageBuilder, inputStream);
            BufferedImage bufferedImage = imageBuilder.getBufferedImage();
            if (inputStream != null) {
                inputStream.close();
            }
            return bufferedImage;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        FileInfo readHeader = readHeader(byteSource);
        if (readHeader == null) {
            f$$ExternalSyntheticLambda0.m("PNM: Couldn't read Header");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        return new ImageInfo(readHeader.getImageTypeDescription(), readHeader.getBitDepth() * readHeader.getNumComponents(), arrayList, readHeader.getImageType(), readHeader.getImageTypeDescription(), readHeader.height, readHeader.getMIMEType(), 1, 72, (float) (readHeader.height / 72.0d), 72, (float) (readHeader.width / 72.0d), readHeader.width, false, readHeader.hasAlpha(), false, readHeader.getColorType(), ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        FileInfo readHeader = readHeader(byteSource);
        if (readHeader != null) {
            return new Dimension(readHeader.width, readHeader.height);
        }
        f$$ExternalSyntheticLambda0.m("PNM: Couldn't read Header");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Pbm-Custom";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        PnmWriter pnmWriter = null;
        boolean z = true;
        if (map != null) {
            Object obj = map.get(PARAM_KEY_PNM_RAWBITS);
            if (obj != null && obj.equals(PARAM_VALUE_PNM_RAWBITS_NO)) {
                z = false;
            }
            Object obj2 = map.get(ImagingConstants.PARAM_KEY_FORMAT);
            if (obj2 != null) {
                if (obj2.equals(ImageFormats.PBM)) {
                    pnmWriter = new PbmWriter(z);
                } else if (obj2.equals(ImageFormats.PGM)) {
                    pnmWriter = new PgmWriter(z);
                } else if (obj2.equals(ImageFormats.PPM)) {
                    pnmWriter = new PpmWriter(z);
                } else if (obj2.equals(ImageFormats.PAM)) {
                    pnmWriter = new PamWriter();
                }
            }
        }
        if (pnmWriter == null) {
            pnmWriter = new PaletteFactory().hasTransparency(bufferedImage) ? new PamWriter() : new PpmWriter(z);
        }
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (hashMap.containsKey(PARAM_KEY_PNM_RAWBITS)) {
            hashMap.remove(PARAM_KEY_PNM_RAWBITS);
        }
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", (Object) hashMap.keySet().iterator().next()));
        }
        pnmWriter.writeImage(bufferedImage, outputStream, hashMap);
    }

    private FileInfo readHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            FileInfo readHeader = readHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readHeader;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
