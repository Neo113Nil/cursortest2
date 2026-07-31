package D4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f544a = d.b(16) + 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f545b = d.b(8) + 8;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f546c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f547d;

    static {
        boolean z5;
        try {
            Class.forName("com.fasterxml.jackson.core.JsonFactory");
            z5 = true;
        } catch (ClassNotFoundException unused) {
            z5 = false;
        }
        f546c = z5;
        f547d = new byte[0];
    }

    public static String a(k kVar) {
        if (!f546c) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e eVar = new e(byteArrayOutputStream);
            try {
                eVar.a0(kVar);
                eVar.close();
                return new String(byteArrayOutputStream.toByteArray(), 1, r4.length - 2, StandardCharsets.UTF_8);
            } finally {
            }
        } catch (IOException e4) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e4);
        }
    }

    public static int b(b bVar, byte[] bArr) {
        if (bArr.length == 0) {
            return 0;
        }
        int i7 = bVar.f512c;
        int length = bArr.length;
        return d.b(length) + length + i7;
    }

    public static int c(b bVar, long j4) {
        if (j4 == 0) {
            return 0;
        }
        int i7 = bVar.f512c;
        int i8 = d.f518e;
        return i7 + 8;
    }

    public static int d(b bVar, f fVar) {
        int a7 = fVar.a();
        return d.b(a7) + bVar.f512c + a7;
    }

    public static int e(b bVar, f[] fVarArr) {
        int i7 = bVar.f512c;
        int i8 = 0;
        for (f fVar : fVarArr) {
            int a7 = fVar.a();
            i8 += d.b(a7) + i7 + a7;
        }
        return i8;
    }

    public static byte[] f(String str) {
        return (str == null || str.isEmpty()) ? f547d : str.getBytes(StandardCharsets.UTF_8);
    }
}
