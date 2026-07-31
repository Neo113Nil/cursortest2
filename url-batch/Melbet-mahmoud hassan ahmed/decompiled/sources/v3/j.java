package v3;

import androidx.annotation.RecentlyNonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes.dex */
public final class j {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream) {
        return c(inputStream, outputStream, false, 1024);
    }

    @Deprecated
    public static long c(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, boolean z6, int i7) {
        byte[] bArr = new byte[i7];
        long j7 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i7);
                if (read == -1) {
                    break;
                }
                j7 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z6) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z6) {
            a(inputStream);
            a(outputStream);
        }
        return j7;
    }

    @RecentlyNonNull
    @Deprecated
    public static byte[] d(@RecentlyNonNull InputStream inputStream, boolean z6) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z6, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
