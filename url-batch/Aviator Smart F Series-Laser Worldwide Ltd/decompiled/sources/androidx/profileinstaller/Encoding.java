package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    static int bitsToBytes(int i8) {
        return ((i8 + 7) & (-8)) / 8;
    }

    static byte[] compress(@NonNull byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    @NonNull
    static RuntimeException error(@Nullable String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    static byte[] read(@NonNull InputStream inputStream, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read < 0) {
                throw error("Not enough bytes to read: " + i8);
            }
            i9 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        throw error("Inflater did not finish");
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] readCompressed(@NonNull InputStream inputStream, int i8, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i8) {
                int read = inputStream.read(bArr2);
                if (read < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i8 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i11 += inflater.inflate(bArr, i11, i9 - i11);
                    i10 += read;
                } catch (DataFormatException e8) {
                    throw error(e8.getMessage());
                }
            }
            throw error("Didn't read enough bytes during decompression. expected=" + i8 + " actual=" + i10);
        } finally {
            inflater.end();
        }
    }

    @NonNull
    static String readString(InputStream inputStream, int i8) {
        return new String(read(inputStream, i8), StandardCharsets.UTF_8);
    }

    static long readUInt(@NonNull InputStream inputStream, int i8) {
        byte[] read = read(inputStream, i8);
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j8 += (read[i9] & 255) << (i9 * 8);
        }
        return j8;
    }

    static int readUInt16(@NonNull InputStream inputStream) {
        return (int) readUInt(inputStream, 2);
    }

    static long readUInt32(@NonNull InputStream inputStream) {
        return readUInt(inputStream, 4);
    }

    static int readUInt8(@NonNull InputStream inputStream) {
        return (int) readUInt(inputStream, 1);
    }

    static int utf8Length(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void writeAll(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, @Nullable FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    static void writeCompressed(@NonNull OutputStream outputStream, byte[] bArr) {
        writeUInt32(outputStream, bArr.length);
        byte[] compress = compress(bArr);
        writeUInt32(outputStream, compress.length);
        outputStream.write(compress);
    }

    static void writeString(@NonNull OutputStream outputStream, @NonNull String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void writeUInt(@NonNull OutputStream outputStream, long j8, int i8) {
        byte[] bArr = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = (byte) ((j8 >> (i9 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void writeUInt16(@NonNull OutputStream outputStream, int i8) {
        writeUInt(outputStream, i8, 2);
    }

    static void writeUInt32(@NonNull OutputStream outputStream, long j8) {
        writeUInt(outputStream, j8, 4);
    }

    static void writeUInt8(@NonNull OutputStream outputStream, int i8) {
        writeUInt(outputStream, i8, 1);
    }
}
