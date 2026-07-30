package L6;

import J6.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes2.dex */
public final class k extends J6.l {

    /* renamed from: d, reason: collision with root package name */
    public static final m6.f f1779d = new m6.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1780b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1781c;

    public k(byte[] bArr, String str) {
        super(bArr.length);
        this.f1780b = bArr;
        this.f1781c = str;
    }

    public static k d(U6.a aVar) {
        m6.f fVar = f1779d;
        k kVar = (k) fVar.a(aVar);
        if (kVar != null) {
            return kVar;
        }
        j jVar = new j(J6.k.f(aVar.f3301a), J6.k.f(aVar.f3302b), m.d(aVar.f3304d));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(jVar.f1439a);
        try {
            jVar.b(byteArrayOutputStream);
            k kVar2 = new k(byteArrayOutputStream.toByteArray(), J6.k.a(jVar));
            fVar.d(aVar, kVar2);
            return kVar2;
        } catch (IOException e6) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e6);
        }
    }

    @Override // J6.f
    public final void c(o oVar) {
        oVar.H(this.f1781c, this.f1780b);
    }
}
