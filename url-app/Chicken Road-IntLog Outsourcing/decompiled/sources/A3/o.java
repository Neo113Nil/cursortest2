package A3;

import a4.AbstractC0197c;
import a4.C0195a;
import b3.C0285f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes.dex */
public final class o extends y3.i {

    /* renamed from: d, reason: collision with root package name */
    public static final C0285f f80d = new C0285f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f81b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82c;

    public o(String str, byte[] bArr) {
        super(bArr.length);
        this.f81b = bArr;
        this.f82c = str;
    }

    public static o d(AbstractC0197c abstractC0197c) {
        C0285f c0285f = f80d;
        o oVar = (o) c0285f.b(abstractC0197c);
        if (oVar != null) {
            return oVar;
        }
        d dVar = new d(n.d(((C0195a) abstractC0197c).f3885c));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(dVar.f12413a);
        try {
            dVar.b(byteArrayOutputStream);
            o oVar2 = new o(y3.h.a(dVar), byteArrayOutputStream.toByteArray());
            c0285f.d(abstractC0197c, oVar2);
            return oVar2;
        } catch (IOException e3) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e3);
        }
    }

    @Override // y3.AbstractC1571e
    public final void c(y3.m mVar) {
        mVar.M(this.f82c, this.f81b);
    }
}
