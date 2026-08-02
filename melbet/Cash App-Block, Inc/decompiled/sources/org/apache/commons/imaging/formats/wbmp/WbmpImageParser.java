package org.apache.commons.imaging.formats.wbmp;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class WbmpImageParser extends ImageParser {
    private static final String DEFAULT_EXTENSION = ".wbmp";
    private static final String[] ACCEPTED_EXTENSIONS = {DEFAULT_EXTENSION};

    public static class WbmpHeader {
        byte fixHeaderField;
        int height;
        int typeField;
        int width;

        public WbmpHeader(int i, byte b, int i2, int i3) {
            this.typeField = i;
            this.fixHeaderField = b;
            this.width = i2;
            this.height = i3;
        }

        public void dump(PrintWriter printWriter) {
            printWriter.println("WbmpHeader");
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("TypeField: "), this.typeField, printWriter, "FixHeaderField: 0x");
            m.append(Integer.toHexString(this.fixHeaderField & 255));
            printWriter.println(m.toString());
            StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Width: "), this.width, printWriter, "Height: ");
            m2.append(this.height);
            printWriter.println(m2.toString());
        }
    }

    private BufferedImage readImage(WbmpHeader wbmpHeader, InputStream inputStream) {
        byte[] readBytes = BinaryFunctions.readBytes("Pixels", inputStream, ((wbmpHeader.width + 7) / 8) * wbmpHeader.height, "Error reading image pixels");
        WritableRaster createPackedRaster = Raster.createPackedRaster(new DataBufferByte(readBytes, readBytes.length), wbmpHeader.width, wbmpHeader.height, 1, (Point) null);
        IndexColorModel indexColorModel = new IndexColorModel(1, 2, new int[]{0, 16777215}, 0, false, -1, 0);
        return new BufferedImage(indexColorModel, createPackedRaster, indexColorModel.isAlphaPremultiplied(), new Properties());
    }

    private int readMultiByteInteger(InputStream inputStream) {
        byte readByte;
        int i = 0;
        int i2 = 0;
        do {
            readByte = BinaryFunctions.readByte("Header", inputStream, "Error reading WBMP header");
            i = (i << 7) | (readByte & Byte.MAX_VALUE);
            i2 += 7;
            if (i2 > 31) {
                f$$ExternalSyntheticLambda0.m("Overflow reading WBMP multi-byte field");
                return 0;
            }
        } while ((readByte & 128) != 0);
        return i;
    }

    private WbmpHeader readWbmpHeader(InputStream inputStream) {
        int readMultiByteInteger = readMultiByteInteger(inputStream);
        if (readMultiByteInteger != 0) {
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readMultiByteInteger, "Invalid/unsupported WBMP type "));
        }
        byte readByte = BinaryFunctions.readByte("FixHeaderField", inputStream, "Invalid WBMP File");
        if ((readByte & 159) == 0) {
            return new WbmpHeader(readMultiByteInteger, readByte, readMultiByteInteger(inputStream), readMultiByteInteger(inputStream));
        }
        throw new ImageReadException(Recorder$$ExternalSyntheticOutline1.m(readByte & 255, new StringBuilder("Invalid/unsupported WBMP FixHeaderField 0x")));
    }

    private void writeMultiByteInteger(OutputStream outputStream, int i) {
        boolean z = false;
        for (int i2 = 28; i2 > 0; i2 -= 7) {
            int i3 = (i >>> i2) & 127;
            if (i3 != 0 || z) {
                outputStream.write(i3 | 128);
                z = true;
            }
        }
        outputStream.write(i & 127);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public boolean dumpImageFile(PrintWriter printWriter, ByteSource byteSource) {
        readWbmpHeader(byteSource).dump(printWriter);
        return true;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.WBMP};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public final BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            BufferedImage readImage = readImage(readWbmpHeader(inputStream), inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readImage;
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
        WbmpHeader readWbmpHeader = readWbmpHeader(byteSource);
        return new ImageInfo("WBMP", 1, new ArrayList(), ImageFormats.WBMP, "Wireless Application Protocol Bitmap", readWbmpHeader.height, "image/vnd.wap.wbmp", 1, 0, RecyclerView.DECELERATION_RATE, 0, RecyclerView.DECELERATION_RATE, readWbmpHeader.width, false, false, false, ImageInfo.ColorType.BW, ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        WbmpHeader readWbmpHeader = readWbmpHeader(byteSource);
        return new Dimension(readWbmpHeader.width, readWbmpHeader.height);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Wireless Application Protocol Bitmap Format";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public void writeImage(BufferedImage bufferedImage, OutputStream outputStream, Map<String, Object> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        if (hashMap.containsKey(ImagingConstants.PARAM_KEY_FORMAT)) {
            hashMap.remove(ImagingConstants.PARAM_KEY_FORMAT);
        }
        if (!hashMap.isEmpty()) {
            throw new ImageWriteException(Boxes$$ExternalSyntheticOutline1.m("Unknown parameter: ", hashMap.keySet().iterator().next()));
        }
        writeMultiByteInteger(outputStream, 0);
        outputStream.write(0);
        writeMultiByteInteger(outputStream, bufferedImage.getWidth());
        writeMultiByteInteger(outputStream, bufferedImage.getHeight());
        for (int i = 0; i < bufferedImage.getHeight(); i++) {
            int i2 = 0;
            int i3 = 128;
            for (int i4 = 0; i4 < bufferedImage.getWidth(); i4++) {
                int rgb = bufferedImage.getRGB(i4, i);
                if (((((rgb >> 16) & 255) + ((rgb >> 8) & 255)) + (rgb & 255)) / 3 > 127) {
                    i2 |= i3;
                }
                i3 >>>= 1;
                if (i3 == 0) {
                    outputStream.write(i2);
                    i2 = 0;
                    i3 = 128;
                }
            }
            if (i3 != 128) {
                outputStream.write(i2);
            }
        }
    }

    private WbmpHeader readWbmpHeader(ByteSource byteSource) {
        InputStream inputStream = byteSource.getInputStream();
        try {
            WbmpHeader readWbmpHeader = readWbmpHeader(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return readWbmpHeader;
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
