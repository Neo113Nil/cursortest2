package org.apache.commons.imaging.formats.icns;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;

/* loaded from: classes9.dex */
public class IcnsImageParser extends ImageParser {
    static final int ICNS_MAGIC = IcnsType.typeAsInt("icns");
    private static final String DEFAULT_EXTENSION = ".icns";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    public static class IcnsContents {
        public final IcnsElement[] icnsElements;
        public final IcnsHeader icnsHeader;

        public IcnsContents(IcnsHeader icnsHeader, IcnsElement[] icnsElementArr) {
            this.icnsHeader = icnsHeader;
            this.icnsElements = icnsElementArr;
        }
    }

    public static class IcnsElement {
        public final byte[] data;
        public final int elementSize;

        /* renamed from: type, reason: collision with root package name */
        public final int f1549type;

        public IcnsElement(int i, int i2, byte[] bArr) {
            this.f1549type = i;
            this.elementSize = i2;
            this.data = bArr;
        }

        public void dump(PrintWriter printWriter) {
            String str;
            printWriter.println("IcnsElement");
            IcnsType findAnyType = IcnsType.findAnyType(this.f1549type);
            if (findAnyType == null) {
                str = "";
            } else {
                str = " " + findAnyType.toString();
            }
            StringBuilder sb = new StringBuilder("Type: 0x");
            NavAction$$ExternalSyntheticOutline0.m(this.f1549type, " (", sb);
            sb.append(IcnsType.describeType(this.f1549type));
            sb.append(")");
            sb.append(str);
            printWriter.println(sb.toString());
            printWriter.println("ElementSize: " + this.elementSize);
            printWriter.println("");
        }
    }

    public static class IcnsHeader {
        public final int fileSize;
        public final int magic;

        public IcnsHeader(int i, int i2) {
            this.magic = i;
            this.fileSize = i2;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("IcnsHeader");
            StringBuilder sb = new StringBuilder("Magic: 0x");
            NavAction$$ExternalSyntheticOutline0.m(this.magic, " (", sb);
            sb.append(IcnsType.describeType(this.magic));
            sb.append(")");
            printWriter.println(sb.toString());
            printWriter.println("FileSize: " + this.fileSize);
            printWriter.println("");
        }
    }

    public IcnsImageParser() {
        super.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    private IcnsElement readIcnsElement(InputStream inputStream, int i) {
        int read4Bytes = BinaryFunctions.read4Bytes("Type", inputStream, "Not a valid ICNS file", getByteOrder());
        int read4Bytes2 = BinaryFunctions.read4Bytes("ElementSize", inputStream, "Not a valid ICNS file", getByteOrder());
        if (read4Bytes2 <= i) {
            return new IcnsElement(read4Bytes, read4Bytes2, BinaryFunctions.readBytes("Data", inputStream, read4Bytes2 - 8, "Not a valid ICNS file"));
        }
        throw new IOException(String.format("Corrupted ICNS file: element size %d is greater than remaining size %d", Integer.valueOf(read4Bytes2), Integer.valueOf(i)));
    }

    private IcnsHeader readIcnsHeader(InputStream inputStream) {
        int read4Bytes = BinaryFunctions.read4Bytes("Magic", inputStream, "Not a Valid ICNS File", getByteOrder());
        int read4Bytes2 = BinaryFunctions.read4Bytes("FileSize", inputStream, "Not a Valid ICNS File", getByteOrder());
        if (read4Bytes == ICNS_MAGIC) {
            return new IcnsHeader(read4Bytes, read4Bytes2);
        }
        throw new ImageReadException(Recorder$$ExternalSyntheticOutline1.m(read4Bytes, new StringBuilder("Not a Valid ICNS File: magic is 0x")));
    }

    private IcnsContents readImage(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            IcnsHeader readIcnsHeader = readIcnsHeader(inputStream);
            ArrayList arrayList = new ArrayList();
            int i = readIcnsHeader.fileSize - 8;
            while (i > 0) {
                IcnsElement readIcnsElement = readIcnsElement(inputStream, i);
                arrayList.add(readIcnsElement);
                i -= readIcnsElement.elementSize;
            }
            int size = arrayList.size();
            IcnsElement[] icnsElementArr = new IcnsElement[size];
            for (int i2 = 0; i2 < size; i2++) {
                icnsElementArr[i2] = (IcnsElement) arrayList.get(i2);
            }
            IcnsContents icnsContents = new IcnsContents(readIcnsHeader, icnsElementArr);
            if (inputStream != null) {
                inputStream.close();
            }
            return icnsContents;
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
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        IcnsContents readImage = readImage(byteSource);
        readImage.icnsHeader.dump(printWriter);
        for (IcnsElement icnsElement : readImage.icnsElements) {
            icnsElement.dump(printWriter);
        }
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.ICNS};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource) {
        return IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        List<BufferedImage> decodeAllImages = IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
        if (!decodeAllImages.isEmpty()) {
            return decodeAllImages.get(0);
        }
        f$$ExternalSyntheticLambda0.m("No icons in ICNS file");
        return null;
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
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new ImageReadException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        List<BufferedImage> decodeAllImages = IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
        if (decodeAllImages.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("No icons in ICNS file");
            return null;
        }
        BufferedImage bufferedImage = decodeAllImages.get(0);
        return new ImageInfo("Icns", 32, new ArrayList(), ImageFormats.ICNS, "ICNS Apple Icon Image", bufferedImage.getHeight(), "image/x-icns", decodeAllImages.size(), 0, RecyclerView.DECELERATION_RATE, 0, RecyclerView.DECELERATION_RATE, bufferedImage.getWidth(), false, true, false, ImageInfo.ColorType.RGB, ImageInfo.CompressionAlgorithm.UNKNOWN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (!hashMap.isEmpty()) {
            throw new ImageReadException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        List<BufferedImage> decodeAllImages = IcnsDecoder.decodeAllImages(readImage(byteSource).icnsElements);
        if (decodeAllImages.isEmpty()) {
            f$$ExternalSyntheticLambda0.m("No icons in ICNS file");
            return null;
        }
        BufferedImage bufferedImage = decodeAllImages.get(0);
        return new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight());
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Apple Icon Image";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        IcnsType icnsType;
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        if (bufferedImage.getWidth() == 16 && bufferedImage.getHeight() == 16) {
            icnsType = IcnsType.ICNS_16x16_32BIT_IMAGE;
        } else if (bufferedImage.getWidth() == 32 && bufferedImage.getHeight() == 32) {
            icnsType = IcnsType.ICNS_32x32_32BIT_IMAGE;
        } else if (bufferedImage.getWidth() == 48 && bufferedImage.getHeight() == 48) {
            icnsType = IcnsType.ICNS_48x48_32BIT_IMAGE;
        } else {
            if (bufferedImage.getWidth() != 128 || bufferedImage.getHeight() != 128) {
                throw new ImageWriteException("Invalid/unsupported source width " + bufferedImage.getWidth() + " and height " + bufferedImage.getHeight());
            }
            icnsType = IcnsType.ICNS_128x128_32BIT_IMAGE;
        }
        BinaryOutputStream binaryOutputStream = new BinaryOutputStream(outputStream, ByteOrder.BIG_ENDIAN);
        try {
            binaryOutputStream.write4Bytes(ICNS_MAGIC);
            binaryOutputStream.write4Bytes((icnsType.getWidth() * icnsType.getHeight()) + (icnsType.getWidth() * 4 * icnsType.getHeight()) + 24);
            binaryOutputStream.write4Bytes(icnsType.getType());
            binaryOutputStream.write4Bytes((icnsType.getWidth() * 4 * icnsType.getHeight()) + 8);
            for (int i = 0; i < bufferedImage.getHeight(); i++) {
                for (int i2 = 0; i2 < bufferedImage.getWidth(); i2++) {
                    int rgb = bufferedImage.getRGB(i2, i);
                    binaryOutputStream.write(0);
                    binaryOutputStream.write(rgb >> 16);
                    binaryOutputStream.write(rgb >> 8);
                    binaryOutputStream.write(rgb);
                }
            }
            binaryOutputStream.write4Bytes(IcnsType.find8BPPMaskType(icnsType).getType());
            binaryOutputStream.write4Bytes((icnsType.getWidth() * icnsType.getWidth()) + 8);
            for (int i3 = 0; i3 < bufferedImage.getHeight(); i3++) {
                for (int i4 = 0; i4 < bufferedImage.getWidth(); i4++) {
                    binaryOutputStream.write(bufferedImage.getRGB(i4, i3) >> 24);
                }
            }
            binaryOutputStream.close();
        } finally {
        }
    }
}
