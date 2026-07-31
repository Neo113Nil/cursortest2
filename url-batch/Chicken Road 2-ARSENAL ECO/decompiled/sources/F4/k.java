package F4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes.dex */
public final class k extends D4.k {

    /* renamed from: d, reason: collision with root package name */
    public static final g4.f f774d = new g4.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f775b;

    /* renamed from: c, reason: collision with root package name */
    public final String f776c;

    public k(byte[] bArr, String str) {
        super(bArr.length);
        this.f775b = bArr;
        this.f776c = str;
    }

    public static k d(O4.a aVar) {
        g4.f fVar = f774d;
        k kVar = (k) fVar.a(aVar);
        if (kVar != null) {
            return kVar;
        }
        j jVar = new j(D4.j.f(aVar.f1778a), D4.j.f(aVar.f1779b), m.d(aVar.f1781d));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(jVar.f548a);
        try {
            jVar.b(byteArrayOutputStream);
            k kVar2 = new k(byteArrayOutputStream.toByteArray(), D4.j.a(jVar));
            fVar.c(aVar, kVar2);
            return kVar2;
        } catch (IOException e4) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e4);
        }
    }

    @Override // D4.f
    public final void c(D4.n nVar) {
        nVar.P(this.f775b, this.f776c);
    }
}
