package k5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6082a = C0603c.b(16) + 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6083b = C0603c.b(8) + 8;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f6084c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f6085d;

    static {
        boolean z7;
        try {
            Class.forName("com.fasterxml.jackson.core.JsonFactory");
            z7 = true;
        } catch (ClassNotFoundException unused) {
            z7 = false;
        }
        f6084c = z7;
        f6085d = new byte[0];
    }

    public static String a(i iVar) {
        if (!f6084c) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0604d c0604d = new C0604d(byteArrayOutputStream);
            try {
                c0604d.a0(iVar);
                c0604d.close();
                return new String(byteArrayOutputStream.toByteArray(), 1, r4.length - 2, StandardCharsets.UTF_8);
            } finally {
            }
        } catch (IOException e7) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e7);
        }
    }

    public static int b(C0602b c0602b, byte[] bArr) {
        if (bArr.length == 0) {
            return 0;
        }
        int i2 = c0602b.f6058c;
        int length = bArr.length;
        return C0603c.b(length) + length + i2;
    }

    public static int c(C0602b c0602b, long j) {
        if (j == 0) {
            return 0;
        }
        int i2 = c0602b.f6058c;
        int i5 = C0603c.f6060e;
        return i2 + 8;
    }

    public static int d(C0602b c0602b, AbstractC0605e abstractC0605e) {
        int a7 = abstractC0605e.a();
        return C0603c.b(a7) + c0602b.f6058c + a7;
    }

    public static int e(C0602b c0602b, AbstractC0605e[] abstractC0605eArr) {
        int i2 = c0602b.f6058c;
        int i5 = 0;
        for (AbstractC0605e abstractC0605e : abstractC0605eArr) {
            int a7 = abstractC0605e.a();
            i5 += C0603c.b(a7) + i2 + a7;
        }
        return i5;
    }

    public static byte[] f(String str) {
        return (str == null || str.isEmpty()) ? f6085d : str.getBytes(StandardCharsets.UTF_8);
    }
}
