package org.apache.commons.imaging.formats.png;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.InflaterInputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ColorTools;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.XmpEmbeddable;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.png.chunks.PngChunk;
import org.apache.commons.imaging.formats.png.chunks.PngChunkGama;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIccp;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIdat;
import org.apache.commons.imaging.formats.png.chunks.PngChunkIhdr;
import org.apache.commons.imaging.formats.png.chunks.PngChunkItxt;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPhys;
import org.apache.commons.imaging.formats.png.chunks.PngChunkPlte;
import org.apache.commons.imaging.formats.png.chunks.PngChunkScal;
import org.apache.commons.imaging.formats.png.chunks.PngChunkText;
import org.apache.commons.imaging.formats.png.chunks.PngChunkZtxt;
import org.apache.commons.imaging.formats.png.chunks.PngTextChunk;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterGrayscale;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor;
import org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterTrueColor;
import org.apache.commons.imaging.icc.IccProfileParser;

/* loaded from: classes9.dex */
public class PngImageParser extends ImageParser implements XmpEmbeddable {
    private static final Logger LOGGER = Logger.getLogger(PngImageParser.class.getName());
    private static final String DEFAULT_EXTENSION = ".png";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    /* renamed from: org.apache.commons.imaging.formats.png.PngImageParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod;
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType;

        static {
            int[] iArr = new int[InterlaceMethod.values().length];
            $SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod = iArr;
            try {
                iArr[InterlaceMethod.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod[InterlaceMethod.ADAM7.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PngColorType.values().length];
            $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType = iArr2;
            try {
                iArr2[PngColorType.GREYSCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[PngColorType.TRUE_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[PngColorType.INDEXED_COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[PngColorType.GREYSCALE_WITH_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[PngColorType.TRUE_COLOR_WITH_ALPHA.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private List<PngChunk> filterChunks(List<PngChunk> list, ChunkType chunkType) {
        ArrayList arrayList = new ArrayList();
        for (PngChunk pngChunk : list) {
            if (pngChunk.chunkType == chunkType.value) {
                arrayList.add(pngChunk);
            }
        }
        return arrayList;
    }

    public static String getChunkTypeName(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    private TransparencyFilter getTransparencyFilter(PngColorType pngColorType, PngChunk pngChunk) {
        int i = AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[pngColorType.ordinal()];
        if (i == 1) {
            return new TransparencyFilterGrayscale(pngChunk.getBytes());
        }
        if (i == 2) {
            return new TransparencyFilterTrueColor(pngChunk.getBytes());
        }
        if (i == 3) {
            return new TransparencyFilterIndexedColor(pngChunk.getBytes());
        }
        throw new ImageReadException("Simple Transparency not compatible with ColorType: " + pngColorType);
    }

    private boolean keepChunk(int i, ChunkType[] chunkTypeArr) {
        if (chunkTypeArr == null) {
            return true;
        }
        for (ChunkType chunkType : chunkTypeArr) {
            if (chunkType.value == i) {
                return true;
            }
        }
        return false;
    }

    private List<PngChunk> readChunks(InputStream inputStream, ChunkType[] chunkTypeArr, boolean z) {
        int read4Bytes;
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        do {
            int read4Bytes2 = BinaryFunctions.read4Bytes("Length", inputStream, "Not a Valid PNG File", getByteOrder());
            if (read4Bytes2 < 0) {
                throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(read4Bytes2, "Invalid PNG chunk length: "));
            }
            read4Bytes = BinaryFunctions.read4Bytes("ChunkType", inputStream, "Not a Valid PNG File", getByteOrder());
            Logger logger = LOGGER;
            Level level = Level.FINEST;
            if (logger.isLoggable(level)) {
                BinaryFunctions.printCharQuad("ChunkType", read4Bytes);
                debugNumber("Length", read4Bytes2, 4);
            }
            boolean keepChunk = keepChunk(read4Bytes, chunkTypeArr);
            if (keepChunk) {
                bArr = BinaryFunctions.readBytes("Chunk Data", inputStream, read4Bytes2, "Not a Valid PNG File: Couldn't read Chunk Data.");
            } else {
                BinaryFunctions.skipBytes(inputStream, read4Bytes2, "Not a Valid PNG File");
                bArr = null;
            }
            if (logger.isLoggable(level) && bArr != null) {
                debugNumber("bytes", bArr.length, 4);
            }
            int read4Bytes3 = BinaryFunctions.read4Bytes("CRC", inputStream, "Not a Valid PNG File", getByteOrder());
            if (keepChunk) {
                if (read4Bytes == ChunkType.iCCP.value) {
                    arrayList.add(new PngChunkIccp(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.tEXt.value) {
                    arrayList.add(new PngChunkText(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.zTXt.value) {
                    arrayList.add(new PngChunkZtxt(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.IHDR.value) {
                    arrayList.add(new PngChunkIhdr(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.PLTE.value) {
                    arrayList.add(new PngChunkPlte(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.pHYs.value) {
                    arrayList.add(new PngChunkPhys(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.sCAL.value) {
                    arrayList.add(new PngChunkScal(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.IDAT.value) {
                    arrayList.add(new PngChunkIdat(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.gAMA.value) {
                    arrayList.add(new PngChunkGama(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else if (read4Bytes == ChunkType.iTXt.value) {
                    arrayList.add(new PngChunkItxt(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                } else {
                    arrayList.add(new PngChunk(read4Bytes2, read4Bytes, read4Bytes3, bArr));
                }
                if (z) {
                    break;
                }
            }
        } while (read4Bytes != ChunkType.IEND.value);
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        ImageInfo imageInfo = getImageInfo(byteSource);
        if (imageInfo == null) {
            return false;
        }
        imageInfo.toString(printWriter, "");
        List<PngChunk> readChunks = readChunks(byteSource, (ChunkType[]) null, false);
        List<PngChunk> filterChunks = filterChunks(readChunks, ChunkType.IHDR);
        if (filterChunks.size() != 1) {
            Logger logger = LOGGER;
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("PNG contains more than one Header");
            }
            return false;
        }
        printWriter.println("Color: " + ((PngChunkIhdr) filterChunks.get(0)).pngColorType.name());
        printWriter.println("chunks: " + readChunks.size());
        if (readChunks.isEmpty()) {
            return false;
        }
        for (int i = 0; i < readChunks.size(); i++) {
            BinaryFunctions.printCharQuad(printWriter, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "\t", ": "), readChunks.get(i).chunkType);
        }
        printWriter.println("");
        printWriter.flush();
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return (String[]) ACCEPTED_EXTENSIONS.clone();
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.PNG};
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d7  */
    @Override // org.apache.commons.imaging.ImageParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        GammaCorrection gammaCorrection;
        ScanExpediter scanExpediterSimple;
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        ChunkType chunkType = ChunkType.IHDR;
        ChunkType chunkType2 = ChunkType.PLTE;
        ChunkType chunkType3 = ChunkType.IDAT;
        List<PngChunk> readChunks = readChunks(byteSource, new ChunkType[]{chunkType, chunkType2, chunkType3, ChunkType.tRNS, ChunkType.iCCP, ChunkType.gAMA, ChunkType.sRGB}, false);
        ICC_Profile iCC_Profile = null;
        if (readChunks == null || readChunks.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("PNG: no chunks");
            return null;
        }
        List<PngChunk> filterChunks = filterChunks(readChunks, chunkType);
        if (filterChunks.size() != 1) {
            f$$ExternalSyntheticLambda0.m("PNG contains more than one Header");
            return null;
        }
        PngChunkIhdr pngChunkIhdr = (PngChunkIhdr) filterChunks.get(0);
        List<PngChunk> filterChunks2 = filterChunks(readChunks, chunkType2);
        if (filterChunks2.size() > 1) {
            f$$ExternalSyntheticLambda0.m("PNG contains more than one Palette");
            return null;
        }
        PngChunkPlte pngChunkPlte = filterChunks2.size() == 1 ? (PngChunkPlte) filterChunks2.get(0) : null;
        List<PngChunk> filterChunks3 = filterChunks(readChunks, chunkType3);
        if (filterChunks3.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("PNG missing image data");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator<PngChunk> it = filterChunks3.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(((PngChunkIdat) it.next()).getBytes());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        List<PngChunk> filterChunks4 = filterChunks(readChunks, ChunkType.tRNS);
        TransparencyFilter transparencyFilter = !filterChunks4.isEmpty() ? getTransparencyFilter(pngChunkIhdr.pngColorType, filterChunks4.get(0)) : null;
        List<PngChunk> filterChunks5 = filterChunks(readChunks, ChunkType.sRGB);
        List<PngChunk> filterChunks6 = filterChunks(readChunks, ChunkType.gAMA);
        List<PngChunk> filterChunks7 = filterChunks(readChunks, ChunkType.iCCP);
        if (filterChunks5.size() > 1) {
            f$$ExternalSyntheticLambda0.m("PNG: unexpected sRGB chunk");
            return null;
        }
        if (filterChunks6.size() > 1) {
            f$$ExternalSyntheticLambda0.m("PNG: unexpected gAMA chunk");
            return null;
        }
        if (filterChunks7.size() > 1) {
            f$$ExternalSyntheticLambda0.m("PNG: unexpected iCCP chunk");
            return null;
        }
        if (filterChunks5.size() != 1) {
            if (filterChunks7.size() == 1) {
                Logger logger = LOGGER;
                if (logger.isLoggable(Level.FINEST)) {
                    logger.finest("iCCP.");
                }
                gammaCorrection = null;
                iCC_Profile = ICC_Profile.getInstance(((PngChunkIccp) filterChunks7.get(0)).getUncompressedProfile());
            } else if (filterChunks6.size() == 1) {
                double gamma = ((PngChunkGama) filterChunks6.get(0)).getGamma();
                GammaCorrection gammaCorrection2 = Math.abs(1.0d - gamma) >= 0.5d ? new GammaCorrection(gamma, 1.0d) : null;
                if (gammaCorrection2 != null && pngChunkPlte != null) {
                    pngChunkPlte.correct(gammaCorrection2);
                }
                gammaCorrection = gammaCorrection2;
            }
            int i = pngChunkIhdr.width;
            int i2 = pngChunkIhdr.height;
            PngColorType pngColorType = pngChunkIhdr.pngColorType;
            int i3 = pngChunkIhdr.bitDepth;
            if (pngChunkIhdr.filterMethod == 0) {
                throw new ImageReadException("PNG: unknown FilterMethod: " + pngChunkIhdr.filterMethod);
            }
            int samplesPerPixel = pngColorType.getSamplesPerPixel() * i3;
            boolean z = pngColorType.hasAlpha() || transparencyFilter != null;
            BufferedImage grayscaleBufferedImage = pngColorType.isGreyscale() ? getBufferedImageFactory(hashMap).getGrayscaleBufferedImage(i, i2, z) : getBufferedImageFactory(hashMap).getColorBufferedImage(i, i2, z);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(byteArray));
            int i4 = AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$InterlaceMethod[pngChunkIhdr.interlaceMethod.ordinal()];
            if (i4 == 1) {
                scanExpediterSimple = new ScanExpediterSimple(i, i2, inflaterInputStream, grayscaleBufferedImage, pngColorType, i3, samplesPerPixel, pngChunkPlte, gammaCorrection, transparencyFilter);
            } else {
                if (i4 != 2) {
                    throw new ImageReadException("Unknown InterlaceMethod: " + pngChunkIhdr.interlaceMethod);
                }
                scanExpediterSimple = new ScanExpediterInterlaced(i, i2, inflaterInputStream, grayscaleBufferedImage, pngColorType, i3, samplesPerPixel, pngChunkPlte, gammaCorrection, transparencyFilter);
            }
            scanExpediterSimple.drive();
            if (iCC_Profile == null || new IccProfileParser().issRGB(iCC_Profile)) {
                return grayscaleBufferedImage;
            }
            return new ColorTools().convertBetweenColorSpaces(grayscaleBufferedImage, new ICC_ColorSpace(iCC_Profile), ColorModel.getRGBdefault().getColorSpace());
        }
        Logger logger2 = LOGGER;
        if (logger2.isLoggable(Level.FINEST)) {
            logger2.finest("sRGB, no color management necessary.");
        }
        gammaCorrection = null;
        int i5 = pngChunkIhdr.width;
        int i22 = pngChunkIhdr.height;
        PngColorType pngColorType2 = pngChunkIhdr.pngColorType;
        int i32 = pngChunkIhdr.bitDepth;
        if (pngChunkIhdr.filterMethod == 0) {
        }
    }

    public List<String> getChunkTypes(InputStream inputStream) {
        List<PngChunk> readChunks = readChunks(inputStream, (ChunkType[]) null, false);
        ArrayList arrayList = new ArrayList(readChunks.size());
        Iterator<PngChunk> it = readChunks.iterator();
        while (it.hasNext()) {
            arrayList.add(getChunkTypeName(it.next().chunkType));
        }
        return arrayList;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        List<PngChunk> readChunks = readChunks(byteSource, new ChunkType[]{ChunkType.iCCP}, true);
        if (readChunks != null && !readChunks.isEmpty()) {
            if (readChunks.size() <= 1) {
                return ((PngChunkIccp) readChunks.get(0)).getUncompressedProfile();
            }
            f$$ExternalSyntheticLambda0.m("PNG contains more than one ICC Profile ");
        }
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        int i;
        int i2;
        float f;
        float f2;
        ImageInfo.ColorType colorType;
        ChunkType chunkType = ChunkType.IHDR;
        ChunkType chunkType2 = ChunkType.pHYs;
        ChunkType chunkType3 = ChunkType.sCAL;
        ChunkType chunkType4 = ChunkType.tEXt;
        ChunkType chunkType5 = ChunkType.zTXt;
        ChunkType chunkType6 = ChunkType.tRNS;
        ChunkType chunkType7 = ChunkType.PLTE;
        ChunkType chunkType8 = ChunkType.iTXt;
        List<PngChunk> readChunks = readChunks(byteSource, new ChunkType[]{chunkType, chunkType2, chunkType3, chunkType4, chunkType5, chunkType6, chunkType7, chunkType8}, false);
        if (readChunks == null || readChunks.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("PNG: no chunks");
            return null;
        }
        List<PngChunk> filterChunks = filterChunks(readChunks, chunkType);
        if (filterChunks.size() != 1) {
            f$$ExternalSyntheticLambda0.m("PNG contains more than one Header");
            return null;
        }
        PngChunkIhdr pngChunkIhdr = (PngChunkIhdr) filterChunks.get(0);
        boolean hasAlpha = !filterChunks(readChunks, chunkType6).isEmpty() ? true : pngChunkIhdr.pngColorType.hasAlpha();
        List<PngChunk> filterChunks2 = filterChunks(readChunks, chunkType2);
        if (filterChunks2.size() > 1) {
            throw new ImageReadException("PNG contains more than one pHYs: " + filterChunks2.size());
        }
        PngChunkPhys pngChunkPhys = filterChunks2.size() == 1 ? (PngChunkPhys) filterChunks2.get(0) : null;
        PhysicalScale physicalScale = PhysicalScale.UNDEFINED;
        List<PngChunk> filterChunks3 = filterChunks(readChunks, chunkType3);
        if (filterChunks3.size() > 1) {
            throw new ImageReadException("PNG contains more than one sCAL:" + filterChunks3.size());
        }
        if (filterChunks3.size() == 1) {
            PngChunkScal pngChunkScal = (PngChunkScal) filterChunks3.get(0);
            int i3 = pngChunkScal.unitSpecifier;
            double d = pngChunkScal.unitsPerPixelXAxis;
            physicalScale = i3 == 1 ? PhysicalScale.createFromMeters(d, pngChunkScal.unitsPerPixelYAxis) : PhysicalScale.createFromRadians(d, pngChunkScal.unitsPerPixelYAxis);
        }
        PhysicalScale physicalScale2 = physicalScale;
        List<PngChunk> filterChunks4 = filterChunks(readChunks, chunkType4);
        List<PngChunk> filterChunks5 = filterChunks(readChunks, chunkType5);
        List<PngChunk> filterChunks6 = filterChunks(readChunks, chunkType8);
        int size = filterChunks6.size() + filterChunks5.size() + filterChunks4.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        Iterator<PngChunk> it = filterChunks4.iterator();
        while (it.hasNext()) {
            PngChunkText pngChunkText = (PngChunkText) it.next();
            arrayList.add(pngChunkText.keyword + ": " + pngChunkText.text);
            arrayList2.add(pngChunkText.getContents());
        }
        Iterator<PngChunk> it2 = filterChunks5.iterator();
        while (it2.hasNext()) {
            PngChunkZtxt pngChunkZtxt = (PngChunkZtxt) it2.next();
            arrayList.add(pngChunkZtxt.keyword + ": " + pngChunkZtxt.text);
            arrayList2.add(pngChunkZtxt.getContents());
        }
        Iterator<PngChunk> it3 = filterChunks6.iterator();
        while (it3.hasNext()) {
            PngChunkItxt pngChunkItxt = (PngChunkItxt) it3.next();
            arrayList.add(pngChunkItxt.keyword + ": " + pngChunkItxt.text);
            arrayList2.add(pngChunkItxt.getContents());
        }
        int samplesPerPixel = pngChunkIhdr.pngColorType.getSamplesPerPixel() * pngChunkIhdr.bitDepth;
        ImageFormats imageFormats = ImageFormats.PNG;
        int i4 = pngChunkIhdr.height;
        int i5 = pngChunkIhdr.width;
        boolean isProgressive = pngChunkIhdr.interlaceMethod.isProgressive();
        if (pngChunkPhys == null || pngChunkPhys.unitSpecifier != 1) {
            i = -1;
            i2 = -1;
            f = -1.0f;
            f2 = -1.0f;
        } else {
            int round = (int) Math.round(pngChunkPhys.pixelsPerUnitXAxis * 0.0254d);
            i2 = round;
            f2 = (float) (i5 / (pngChunkPhys.pixelsPerUnitXAxis * 0.0254d));
            f = (float) (i4 / (pngChunkPhys.pixelsPerUnitYAxis * 0.0254d));
            i = (int) Math.round(pngChunkPhys.pixelsPerUnitYAxis * 0.0254d);
        }
        boolean z = filterChunks(readChunks, ChunkType.PLTE).size() > 1;
        int i6 = AnonymousClass1.$SwitchMap$org$apache$commons$imaging$formats$png$PngColorType[pngChunkIhdr.pngColorType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2 && i6 != 3) {
                if (i6 != 4) {
                    if (i6 != 5) {
                        throw new ImageReadException("Png: Unknown ColorType: " + pngChunkIhdr.pngColorType);
                    }
                }
            }
            colorType = ImageInfo.ColorType.RGB;
            return new PngImageInfo("Png", samplesPerPixel, arrayList, imageFormats, "PNG Portable Network Graphics", i4, "image/png", 1, i, f, i2, f2, i5, isProgressive, hasAlpha, z, colorType, ImageInfo.CompressionAlgorithm.PNG_FILTER, arrayList2, physicalScale2);
        }
        colorType = ImageInfo.ColorType.GRAYSCALE;
        return new PngImageInfo("Png", samplesPerPixel, arrayList, imageFormats, "PNG Portable Network Graphics", i4, "image/png", 1, i, f, i2, f2, i5, isProgressive, hasAlpha, z, colorType, ImageInfo.CompressionAlgorithm.PNG_FILTER, arrayList2, physicalScale2);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        List<PngChunk> readChunks = readChunks(byteSource, new ChunkType[]{ChunkType.IHDR}, true);
        if (readChunks == null || readChunks.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("Png: No chunks");
            return null;
        }
        if (readChunks.size() <= 1) {
            PngChunkIhdr pngChunkIhdr = (PngChunkIhdr) readChunks.get(0);
            return new Dimension(pngChunkIhdr.width, pngChunkIhdr.height);
        }
        f$$ExternalSyntheticLambda0.m("PNG contains more than one Header");
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        List<PngChunk> readChunks = readChunks(byteSource, new ChunkType[]{ChunkType.tEXt, ChunkType.zTXt}, false);
        if (readChunks == null || readChunks.isEmpty()) {
            return null;
        }
        GenericImageMetadata genericImageMetadata = new GenericImageMetadata();
        Iterator<PngChunk> it = readChunks.iterator();
        while (it.hasNext()) {
            PngTextChunk pngTextChunk = (PngTextChunk) it.next();
            genericImageMetadata.add(pngTextChunk.getKeyword(), pngTextChunk.getText());
        }
        return genericImageMetadata;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Png-Custom";
    }

    @Override // org.apache.commons.imaging.common.XmpEmbeddable
    public String getXmpXml(ByteSource byteSource, Map<String, Object> map) {
        List<PngChunk> readChunks = readChunks(byteSource, new ChunkType[]{ChunkType.iTXt}, false);
        if (readChunks != null && !readChunks.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<PngChunk> it = readChunks.iterator();
            while (it.hasNext()) {
                PngChunkItxt pngChunkItxt = (PngChunkItxt) it.next();
                if (pngChunkItxt.getKeyword().equals(PngConstants.XMP_KEYWORD)) {
                    arrayList.add(pngChunkItxt);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() <= 1) {
                return ((PngChunkItxt) arrayList.get(0)).getText();
            }
            f$$ExternalSyntheticLambda0.m("PNG contains more than one XMP chunk.");
        }
        return null;
    }

    public boolean hasChunkType(ByteSource byteSource, ChunkType chunkType) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            readSignature(inputStream);
            boolean z = !readChunks(inputStream, new ChunkType[]{chunkType}, true).isEmpty();
            if (inputStream != null) {
                inputStream.close();
            }
            return z;
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

    public void readSignature(InputStream inputStream) {
        BinaryFunctions.readAndVerifyBytes(inputStream, PngConstants.PNG_SIGNATURE, "Not a Valid PNG Segment: Incorrect Signature");
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        new PngWriter().writeImage(bufferedImage, outputStream, map);
    }

    private List<PngChunk> readChunks(ByteSource byteSource, ChunkType[] chunkTypeArr, boolean z) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            readSignature(inputStream);
            List<PngChunk> readChunks = readChunks(inputStream, chunkTypeArr, z);
            if (inputStream != null) {
                inputStream.close();
            }
            return readChunks;
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
