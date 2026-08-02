package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hov implements hpb {
    @Override // defpackage.hpb
    public final hpa a(byte[] bArr) {
        return c(bArr, bArr.length);
    }

    @Override // defpackage.hpb
    public hpa b(CharSequence charSequence, Charset charset) {
        throw null;
    }

    public hpa c(byte[] bArr, int i) {
        hoq.G(0, i, bArr.length);
        hoq.A(true, "expectedInputSize must be >= 0 but was %s", i);
        hpc d = d();
        d.b(bArr, i);
        return d.k();
    }
}
