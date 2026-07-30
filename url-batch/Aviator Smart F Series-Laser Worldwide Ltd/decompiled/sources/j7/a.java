package j7;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.io.StreamOverflowException;

/* loaded from: classes5.dex */
public final class a {
    private static int BUFFER_SIZE = 4096;

    public static void drain(InputStream inputStream) {
        int i8 = BUFFER_SIZE;
        while (inputStream.read(new byte[i8], 0, i8) >= 0) {
        }
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) {
        int i8 = BUFFER_SIZE;
        byte[] bArr = new byte[i8];
        while (true) {
            int read = inputStream.read(bArr, 0, i8);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static long pipeAllLimited(InputStream inputStream, long j8, OutputStream outputStream) {
        int i8 = BUFFER_SIZE;
        byte[] bArr = new byte[i8];
        long j9 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i8);
            if (read < 0) {
                return j9;
            }
            long j10 = read;
            if (j8 - j9 < j10) {
                throw new StreamOverflowException("Data Overflow");
            }
            j9 += j10;
            outputStream.write(bArr, 0, read);
        }
    }

    public static byte[] readAll(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i8, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr) {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i8 + i10, i9 - i10);
            if (read < 0) {
                break;
            }
            i10 += read;
        }
        return i10;
    }
}
