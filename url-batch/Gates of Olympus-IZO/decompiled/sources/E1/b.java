package E1;

import L1.z;
import h.AbstractC0416e;
import q1.C0775D;
import q1.H;
import q1.L;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Y1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0775D f738e;

    public /* synthetic */ b(C0775D c0775d, int i3) {
        this.f737d = i3;
        this.f738e = c0775d;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        z zVar = z.f2729a;
        C0775D c0775d = this.f738e;
        switch (this.f737d) {
            case 0:
                H h3 = (H) obj;
                Z1.i.f(h3, "$this$navigate");
                int i3 = q1.z.f6978q;
                h3.f6870d = AbstractC0416e.s(c0775d.f()).f6967i;
                L l3 = new L();
                l3.f6876a = true;
                h3.f6871e = l3.f6876a;
                h3.f6868b = true;
                h3.f6869c = true;
                break;
            case 1:
                String str = (String) obj;
                Z1.i.f(str, "it");
                C0775D.k(c0775d, "detail/".concat(str), null, 6);
                break;
            default:
                String str2 = (String) obj;
                Z1.i.f(str2, "it");
                C0775D.k(c0775d, "detail/".concat(str2), null, 6);
                break;
        }
        return zVar;
    }
}
