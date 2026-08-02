package j$.io;

import j$.util.Objects;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class DesugarInputStream {
    public static long transferTo(InputStream inputStream, OutputStream outputStream) {
        Objects.a(outputStream, "out");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read < 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}
