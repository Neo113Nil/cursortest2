package m5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes.dex */
public final class n extends k5.i {

    /* renamed from: d, reason: collision with root package name */
    public static final N4.f f6581d = new N4.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6582b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6583c;

    public n(byte[] bArr, String str) {
        super(bArr.length);
        this.f6582b = bArr;
        this.f6583c = str;
    }

    public static n d(M5.a aVar) {
        N4.f fVar = f6581d;
        n nVar = (n) fVar.a(aVar);
        if (nVar != null) {
            return nVar;
        }
        c cVar = new c(m.d(aVar.f1771b));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(cVar.f6086a);
        try {
            cVar.b(byteArrayOutputStream);
            n nVar2 = new n(byteArrayOutputStream.toByteArray(), k5.h.a(cVar));
            fVar.c(aVar, nVar2);
            return nVar2;
        } catch (IOException e7) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e7);
        }
    }

    @Override // k5.AbstractC0605e
    public final void c(k5.l lVar) {
        lVar.P(this.f6582b, this.f6583c);
    }
}
