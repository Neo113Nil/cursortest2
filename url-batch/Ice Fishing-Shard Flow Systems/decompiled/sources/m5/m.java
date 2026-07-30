package m5;

import k5.AbstractC0605e;
import r5.AbstractC0851d;

/* loaded from: classes.dex */
public final class m extends k5.i {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f6577d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final m[] f6578e = new m[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6579b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0605e f6580c;

    public m(byte[] bArr, k5.i iVar) {
        super(k5.h.d(AbstractC0851d.f7539b, iVar) + k5.h.b(AbstractC0851d.f7538a, bArr));
        this.f6579b = bArr;
        this.f6580c = iVar;
    }

    public static m[] d(C4.f fVar) {
        if (fVar.isEmpty()) {
            return f6578e;
        }
        m[] mVarArr = new m[fVar.size()];
        fVar.forEach(new h(mVarArr, 1));
        return mVarArr;
    }

    @Override // k5.AbstractC0605e
    public final void c(k5.l lVar) {
        lVar.B(AbstractC0851d.f7538a, this.f6579b);
        lVar.a(AbstractC0851d.f7539b, this.f6580c);
    }
}
