package f1;

import E.AbstractC0005f;
import T.C0096n;
import T.C0097o;
import a.AbstractC0124a;
import java.util.List;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8503a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8504b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.F[] f8505c;

    /* renamed from: d, reason: collision with root package name */
    public final K3.n f8506d;

    public B(int i4, List list) {
        this.f8503a = i4;
        switch (i4) {
            case 1:
                this.f8504b = list;
                this.f8505c = new y0.F[list.size()];
                K3.n nVar = new K3.n(new D0.a(29, this));
                this.f8506d = nVar;
                nVar.i(3);
                break;
            default:
                this.f8504b = list;
                this.f8505c = new y0.F[list.size()];
                this.f8506d = new K3.n(new D0.a(28, this));
                break;
        }
    }

    public void a(long j4, W.u uVar) {
        if (uVar.a() < 9) {
            return;
        }
        int m4 = uVar.m();
        int m5 = uVar.m();
        int z = uVar.z();
        if (m4 == 434 && m5 == 1195456820 && z == 3) {
            this.f8506d.a(j4, uVar);
        }
    }

    public final void b(y0.p pVar, E e4) {
        switch (this.f8503a) {
            case 0:
                int i4 = 0;
                while (true) {
                    y0.F[] fArr = this.f8505c;
                    if (i4 >= fArr.length) {
                        break;
                    } else {
                        e4.a();
                        e4.c();
                        y0.F z = pVar.z(e4.f8529c, 3);
                        C0097o c0097o = (C0097o) this.f8504b.get(i4);
                        String str = c0097o.n;
                        AbstractC0124a.k("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                        String str2 = c0097o.f2856a;
                        if (str2 == null) {
                            e4.c();
                            str2 = (String) e4.f8531e;
                        }
                        C0096n c0096n = new C0096n();
                        c0096n.f2819a = str2;
                        c0096n.f2830l = T.F.n("video/mp2t");
                        c0096n.f2831m = T.F.n(str);
                        c0096n.f2823e = c0097o.f2860e;
                        c0096n.f2822d = c0097o.f2859d;
                        c0096n.f2815J = c0097o.f2851K;
                        c0096n.f2832p = c0097o.f2870q;
                        AbstractC0005f.w(c0096n, z);
                        fArr[i4] = z;
                        i4++;
                    }
                }
                break;
            default:
                int i5 = 0;
                while (true) {
                    y0.F[] fArr2 = this.f8505c;
                    if (i5 >= fArr2.length) {
                        break;
                    } else {
                        e4.a();
                        e4.c();
                        y0.F z4 = pVar.z(e4.f8529c, 3);
                        C0097o c0097o2 = (C0097o) this.f8504b.get(i5);
                        String str3 = c0097o2.n;
                        AbstractC0124a.k("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                        C0096n c0096n2 = new C0096n();
                        e4.c();
                        c0096n2.f2819a = (String) e4.f8531e;
                        c0096n2.f2830l = T.F.n("video/mp2t");
                        c0096n2.f2831m = T.F.n(str3);
                        c0096n2.f2823e = c0097o2.f2860e;
                        c0096n2.f2822d = c0097o2.f2859d;
                        c0096n2.f2815J = c0097o2.f2851K;
                        c0096n2.f2832p = c0097o2.f2870q;
                        AbstractC0005f.w(c0096n2, z4);
                        fArr2[i5] = z4;
                        i5++;
                    }
                }
                break;
        }
    }
}
