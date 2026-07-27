package A3;

import b3.C0285f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes.dex */
public final class l extends y3.i {

    /* renamed from: d, reason: collision with root package name */
    public static final C0285f f72d = new C0285f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f73b;

    /* renamed from: c, reason: collision with root package name */
    public final String f74c;

    public l(String str, byte[] bArr) {
        super(bArr.length);
        this.f73b = bArr;
        this.f74c = str;
    }

    public static l d(J3.a aVar) {
        C0285f c0285f = f72d;
        l lVar = (l) c0285f.b(aVar);
        if (lVar != null) {
            return lVar;
        }
        k kVar = new k(y3.h.f(aVar.f1352a), y3.h.f(aVar.f1353b), n.d(aVar.f1355d));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(kVar.f12413a);
        try {
            kVar.b(byteArrayOutputStream);
            l lVar2 = new l(y3.h.a(kVar), byteArrayOutputStream.toByteArray());
            c0285f.d(aVar, lVar2);
            return lVar2;
        } catch (IOException e3) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e3);
        }
    }

    @Override // y3.AbstractC1571e
    public final void c(y3.m mVar) {
        mVar.M(this.f74c, this.f73b);
    }
}
