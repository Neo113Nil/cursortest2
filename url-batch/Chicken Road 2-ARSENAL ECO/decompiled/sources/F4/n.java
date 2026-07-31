package F4;

import f5.C0387a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes.dex */
public final class n extends D4.k {

    /* renamed from: d, reason: collision with root package name */
    public static final g4.f f782d = new g4.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f783b;

    /* renamed from: c, reason: collision with root package name */
    public final String f784c;

    public n(byte[] bArr, String str) {
        super(bArr.length);
        this.f783b = bArr;
        this.f784c = str;
    }

    public static n d(C0387a c0387a) {
        g4.f fVar = f782d;
        n nVar = (n) fVar.a(c0387a);
        if (nVar != null) {
            return nVar;
        }
        c cVar = new c(m.d(c0387a.f4250b));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(cVar.f548a);
        try {
            cVar.b(byteArrayOutputStream);
            n nVar2 = new n(byteArrayOutputStream.toByteArray(), D4.j.a(cVar));
            fVar.c(c0387a, nVar2);
            return nVar2;
        } catch (IOException e4) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e4);
        }
    }

    @Override // D4.f
    public final void c(D4.n nVar) {
        nVar.P(this.f783b, this.f784c);
    }
}
