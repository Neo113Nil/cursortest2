package m5;

import java.util.Iterator;
import java.util.List;
import k5.AbstractC0605e;
import k5.C0603c;
import r5.AbstractC0850c;
import s5.AbstractC0895b;
import s5.AbstractC0896c;

/* loaded from: classes.dex */
public final class j extends k5.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6569b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6570c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6571d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6572e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(k kVar, byte[] bArr, List list) {
        super(r1 + r3);
        int b7 = k5.h.b(AbstractC0896c.f7793c, bArr) + k5.h.d(AbstractC0896c.f7791a, kVar);
        int i2 = AbstractC0896c.f7792b.f6058c;
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            int a7 = ((AbstractC0605e) it.next()).a();
            i5 += C0603c.b(a7) + i2 + a7;
        }
        this.f6571d = kVar;
        this.f6570c = bArr;
        this.f6572e = list;
    }

    @Override // k5.AbstractC0605e
    public final void c(k5.l lVar) {
        switch (this.f6569b) {
            case 0:
                lVar.B(AbstractC0850c.f7535a, this.f6570c);
                lVar.B(AbstractC0850c.f7536b, (byte[]) this.f6571d);
                lVar.j(AbstractC0850c.f7537c, (m[]) this.f6572e);
                break;
            case 1:
                lVar.a(AbstractC0896c.f7791a, (k) this.f6571d);
                lVar.h(AbstractC0896c.f7792b, (List) this.f6572e);
                lVar.B(AbstractC0896c.f7793c, this.f6570c);
                break;
            default:
                lVar.a(AbstractC0895b.f7788a, (n) this.f6571d);
                lVar.j(AbstractC0895b.f7789b, (j[]) this.f6572e);
                lVar.B(AbstractC0895b.f7790c, this.f6570c);
                break;
        }
    }

    public j(n nVar, byte[] bArr, j[] jVarArr) {
        super(k5.h.e(AbstractC0895b.f7789b, jVarArr) + k5.h.b(AbstractC0895b.f7790c, bArr) + k5.h.d(AbstractC0895b.f7788a, nVar));
        this.f6571d = nVar;
        this.f6570c = bArr;
        this.f6572e = jVarArr;
    }

    public j(byte[] bArr, byte[] bArr2, m[] mVarArr) {
        super(k5.h.e(AbstractC0850c.f7537c, mVarArr) + k5.h.b(AbstractC0850c.f7536b, bArr2) + k5.h.b(AbstractC0850c.f7535a, bArr));
        this.f6570c = bArr;
        this.f6571d = bArr2;
        this.f6572e = mVarArr;
    }
}
