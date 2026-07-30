package m5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import v5.C0975a;

/* loaded from: classes.dex */
public final class k extends k5.i {

    /* renamed from: d, reason: collision with root package name */
    public static final N4.f f6573d = new N4.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6575c;

    public k(byte[] bArr, String str) {
        super(bArr.length);
        this.f6574b = bArr;
        this.f6575c = str;
    }

    public static k d(C0975a c0975a) {
        N4.f fVar = f6573d;
        k kVar = (k) fVar.a(c0975a);
        if (kVar != null) {
            return kVar;
        }
        j jVar = new j(k5.h.f(c0975a.f8220a), k5.h.f(c0975a.f8221b), m.d(c0975a.f8223d));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(jVar.f6086a);
        try {
            jVar.b(byteArrayOutputStream);
            k kVar2 = new k(byteArrayOutputStream.toByteArray(), k5.h.a(jVar));
            fVar.c(c0975a, kVar2);
            return kVar2;
        } catch (IOException e7) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e7);
        }
    }

    @Override // k5.AbstractC0605e
    public final void c(k5.l lVar) {
        lVar.P(this.f6574b, this.f6575c);
    }
}
