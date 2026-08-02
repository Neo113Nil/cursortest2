package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jjb implements jlr {
    private static final jkd a = jkd.a;

    private static final void j(jll jllVar) {
        if (jllVar != null && !jllVar.u()) {
            throw new jmi().a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jll] */
    @Override // defpackage.jlr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jll g(InputStream inputStream, jkd jkdVar) {
        jju L = jju.L(inputStream, 4096);
        ?? i = i(L, jkdVar);
        L.D(0);
        j(i);
        return i;
    }

    public final jll b(byte[] bArr, int i, int i2, jkd jkdVar) {
        jll c = c(bArr, i, i2, jkdVar);
        j(c);
        return c;
    }

    public jll c(byte[] bArr, int i, int i2, jkd jkdVar) {
        throw null;
    }

    @Override // defpackage.jlr
    public final /* bridge */ /* synthetic */ Object d(InputStream inputStream) {
        return g(inputStream, a);
    }

    @Override // defpackage.jlr
    public final /* bridge */ /* synthetic */ Object e(byte[] bArr) {
        return b(bArr, 0, bArr.length, a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jll] */
    @Override // defpackage.jlr
    public final /* bridge */ /* synthetic */ Object f(jju jjuVar, jkd jkdVar) {
        ?? i = i(jjuVar, jkdVar);
        j(i);
        return i;
    }

    @Override // defpackage.jlr
    public final /* bridge */ /* synthetic */ Object h(byte[] bArr, int i, jkd jkdVar) {
        return b(bArr, 1, i, jkdVar);
    }
}
