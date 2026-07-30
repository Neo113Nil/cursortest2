package L6;

import J6.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j extends J6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1775b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1776c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1777d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1778e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(k kVar, byte[] bArr, List list) {
        super(r1 + r3);
        int b9 = J6.k.b(R6.c.f2814c, bArr) + J6.k.d(R6.c.f2812a, kVar);
        int i = R6.c.f2813b.f1402c;
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int a9 = ((J6.f) it.next()).a();
            i4 += J6.d.b(a9) + i + a9;
        }
        this.f1777d = kVar;
        this.f1776c = bArr;
        this.f1778e = list;
    }

    @Override // J6.f
    public final void c(o oVar) {
        switch (this.f1775b) {
            case 0:
                oVar.n(Q6.c.f2725a, this.f1776c);
                oVar.n(Q6.c.f2726b, (byte[]) this.f1777d);
                oVar.j(Q6.c.f2727c, (m[]) this.f1778e);
                break;
            case 1:
                oVar.a(R6.c.f2812a, (k) this.f1777d);
                oVar.i(R6.c.f2813b, (List) this.f1778e);
                oVar.n(R6.c.f2814c, this.f1776c);
                break;
            default:
                oVar.a(R6.b.f2809a, (n) this.f1777d);
                oVar.j(R6.b.f2810b, (j[]) this.f1778e);
                oVar.n(R6.b.f2811c, this.f1776c);
                break;
        }
    }

    public j(n nVar, byte[] bArr, j[] jVarArr) {
        super(J6.k.e(R6.b.f2810b, jVarArr) + J6.k.b(R6.b.f2811c, bArr) + J6.k.d(R6.b.f2809a, nVar));
        this.f1777d = nVar;
        this.f1776c = bArr;
        this.f1778e = jVarArr;
    }

    public j(byte[] bArr, byte[] bArr2, m[] mVarArr) {
        super(J6.k.e(Q6.c.f2727c, mVarArr) + J6.k.b(Q6.c.f2726b, bArr2) + J6.k.b(Q6.c.f2725a, bArr));
        this.f1776c = bArr;
        this.f1777d = bArr2;
        this.f1778e = mVarArr;
    }
}
