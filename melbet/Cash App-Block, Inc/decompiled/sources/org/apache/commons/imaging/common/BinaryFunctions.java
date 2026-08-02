package org.apache.commons.imaging.common;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.util.logging.Logger;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class BinaryFunctions {
    private static final Logger LOGGER = Logger.getLogger(BinaryFunctions.class.getName());

    private BinaryFunctions() {
    }

    public static int charsToQuad(char c, char c2, char c3, char c4) {
        return ((c & 255) << 24) | ((c2 & 255) << 16) | ((c3 & 255) << 8) | (c4 & 255);
    }

    public static boolean compareBytes(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length < i + i3 || bArr2.length < i2 + i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i + i4] != bArr2[i2 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static void copyStreamToStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static int findNull(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static byte[] getRAFBytes(RandomAccessFile randomAccessFile, long j, int i, String str) {
        byte[] bArr = new byte[i];
        randomAccessFile.seek(j);
        int i2 = 0;
        while (i2 < i) {
            int read = randomAccessFile.read(bArr, i2, i - i2);
            if (read < 0) {
                a$$ExternalSyntheticBUOutline0.m$4(str);
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static byte[] getStreamBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStreamToStream(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] head(byte[] bArr, int i) {
        if (i > bArr.length) {
            i = bArr.length;
        }
        return slice(bArr, 0, i);
    }

    public static void printByteBits(String str, byte b) {
        Logger logger = LOGGER;
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": '");
        m108m.append(Integer.toBinaryString(b & 255));
        logger.finest(m108m.toString());
    }

    public static void printCharQuad(String str, int i) {
        Logger logger = LOGGER;
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": '");
        m108m.append((char) ((i >> 24) & 255));
        m108m.append((char) ((i >> 16) & 255));
        m108m.append((char) ((i >> 8) & 255));
        m108m.append((char) (i & 255));
        m108m.append("'");
        logger.finest(m108m.toString());
    }

    public static byte[] quadsToByteArray(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static int read2Bytes(String str, InputStream inputStream, String str2, ByteOrder byteOrder) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) >= 0) {
            return byteOrder == ByteOrder.BIG_ENDIAN ? (read << 8) | read2 : read | (read2 << 8);
        }
        a$$ExternalSyntheticBUOutline0.m$4(str2);
        return 0;
    }

    public static int read3Bytes(String str, InputStream inputStream, String str2, ByteOrder byteOrder) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if ((read | read2 | read3) >= 0) {
            return byteOrder == ByteOrder.BIG_ENDIAN ? (read << 16) | (read2 << 8) | read3 : read | (read3 << 16) | (read2 << 8);
        }
        a$$ExternalSyntheticBUOutline0.m$4(str2);
        return 0;
    }

    public static int read4Bytes(String str, InputStream inputStream, String str2, ByteOrder byteOrder) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return byteOrder == ByteOrder.BIG_ENDIAN ? (read << 24) | (read2 << 16) | (read3 << 8) | read4 : read | (read4 << 24) | (read3 << 16) | (read2 << 8);
        }
        a$$ExternalSyntheticBUOutline0.m$4(str2);
        return 0;
    }

    public static void readAndVerifyBytes(InputStream inputStream, BinaryConstant binaryConstant, String str) {
        for (int i = 0; i < binaryConstant.size(); i++) {
            int read = inputStream.read();
            byte b = (byte) (read & 255);
            if (read < 0) {
                f$$ExternalSyntheticLambda0.m("Unexpected EOF.");
                return;
            } else {
                if (b != binaryConstant.get(i)) {
                    f$$ExternalSyntheticLambda0.m(str);
                    return;
                }
            }
        }
    }

    public static byte readByte(String str, InputStream inputStream, String str2) {
        int read = inputStream.read();
        if (read >= 0) {
            return (byte) (read & 255);
        }
        a$$ExternalSyntheticBUOutline0.m$4(str2);
        return (byte) 0;
    }

    public static byte[] readBytes(String str, InputStream inputStream, int i, String str2) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" count: ");
                sb.append(read);
                sb.append(" read: ");
                sb.append(i2);
                a$$ExternalSyntheticBUOutline0.m$4(Boxes$$ExternalSyntheticOutline1.m(i, " length: ", sb));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static byte[] remainingBytes(String str, byte[] bArr, int i) {
        return slice(bArr, i, bArr.length - i);
    }

    public static boolean searchQuad(int i, InputStream inputStream) {
        byte[] quadsToByteArray = quadsToByteArray(i);
        while (true) {
            int i2 = 0;
            do {
                int read = inputStream.read();
                if (read == -1) {
                    return false;
                }
                if (quadsToByteArray[i2] == read) {
                    i2++;
                }
            } while (i2 != quadsToByteArray.length);
            return true;
        }
    }

    public static void skipBytes(InputStream inputStream, long j, String str) {
        long j2 = 0;
        while (j != j2) {
            long skip = inputStream.skip(j - j2);
            if (skip < 1) {
                throw new IOException(str + " (" + skip + ")");
            }
            j2 += skip;
        }
    }

    public static byte[] slice(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static boolean startsWith(byte[] bArr, BinaryConstant binaryConstant) {
        if (bArr == null || bArr.length < binaryConstant.size()) {
            return false;
        }
        for (int i = 0; i < binaryConstant.size(); i++) {
            if (bArr[i] != binaryConstant.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static int findNull(byte[] bArr) {
        return findNull(bArr, 0);
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void readAndVerifyBytes(InputStream inputStream, byte[] bArr, String str) {
        for (byte b : bArr) {
            int read = inputStream.read();
            byte b2 = (byte) (read & 255);
            if (read < 0) {
                f$$ExternalSyntheticLambda0.m("Unexpected EOF.");
                return;
            } else {
                if (b2 != b) {
                    f$$ExternalSyntheticLambda0.m(str);
                    return;
                }
            }
        }
    }

    public static byte[] readBytes(String str, InputStream inputStream, int i) {
        return readBytes(str, inputStream, i, str + " could not be read.");
    }

    public static void printCharQuad(PrintWriter printWriter, String str, int i) {
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": '");
        m108m.append((char) ((i >> 24) & 255));
        m108m.append((char) ((i >> 16) & 255));
        m108m.append((char) ((i >> 8) & 255));
        m108m.append((char) (i & 255));
        m108m.append("'");
        printWriter.println(m108m.toString());
    }

    public static byte[] readBytes(InputStream inputStream, int i) {
        return readBytes("", inputStream, i, "Unexpected EOF");
    }

    public static void skipBytes(InputStream inputStream, long j) {
        skipBytes(inputStream, j, "Couldn't skip bytes");
    }
}
