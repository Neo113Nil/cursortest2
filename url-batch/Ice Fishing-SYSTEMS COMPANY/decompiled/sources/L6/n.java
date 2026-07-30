package L6;

import J6.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import l7.C4707a;

/* loaded from: classes2.dex */
public final class n extends J6.l {

    /* renamed from: d, reason: collision with root package name */
    public static final m6.f f1787d = new m6.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1788b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1789c;

    public n(byte[] bArr, String str) {
        super(bArr.length);
        this.f1788b = bArr;
        this.f1789c = str;
    }

    public static n d(C4707a c4707a) {
        m6.f fVar = f1787d;
        n nVar = (n) fVar.a(c4707a);
        if (nVar != null) {
            return nVar;
        }
        c cVar = new c(m.d(c4707a.f39082b));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(cVar.f1439a);
        try {
            cVar.b(byteArrayOutputStream);
            n nVar2 = new n(byteArrayOutputStream.toByteArray(), J6.k.a(cVar));
            fVar.d(c4707a, nVar2);
            return nVar2;
        } catch (IOException e6) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e6);
        }
    }

    @Override // J6.f
    public final void c(o oVar) {
        oVar.H(this.f1789c, this.f1788b);
    }
}
