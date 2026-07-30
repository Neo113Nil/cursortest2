package t3;

import a0.x0;
import com.android.installreferrer.api.InstallReferrerClient;
import s1.g1;
import s1.h2;
import w.j0;
import w.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8819g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8820h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8821i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8822j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8823k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f8824l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r6.r rVar, r6.r rVar2, b0 b0Var, boolean z8, e6.j jVar) {
        super(1);
        this.f8821i = rVar;
        this.f8822j = rVar2;
        this.f8823k = b0Var;
        this.f8820h = z8;
        this.f8824l = jVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f8819g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h hVar = (h) obj;
                r6.k.f(hVar, "entry");
                ((r6.r) this.f8821i).f7964f = true;
                ((r6.r) this.f8822j).f7964f = true;
                ((b0) this.f8823k).l(hVar, this.f8820h, (e6.j) this.f8824l);
                break;
            default:
                long j8 = ((y0.c) obj).f9778a;
                j0 j0Var = (j0) this.f8821i;
                x0.n nVar = (x0.n) this.f8822j;
                if (j0Var.b()) {
                    h2 h2Var = j0Var.f9257c;
                    if (h2Var != null) {
                        ((g1) h2Var).b();
                    }
                } else {
                    nVar.a(x0.h.f9609k);
                }
                if (j0Var.b() && this.f8820h) {
                    if (j0Var.a() != w.a0.f9184g) {
                        z0 d8 = j0Var.d();
                        if (d8 != null) {
                            g2.q qVar = (g2.q) this.f8824l;
                            androidx.room.c cVar = j0Var.f9258d;
                            w.p pVar = j0Var.f9274t;
                            int a3 = qVar.a(d8.b(j8, true));
                            pVar.f(g2.w.a((g2.w) cVar.f1069g, null, r4.a.h(a3, a3), 5));
                            if (j0Var.f9255a.f9329a.f373f.length() > 0) {
                                j0Var.f9265k.setValue(w.a0.f9185h);
                            }
                        }
                    } else {
                        ((x0) this.f8823k).e(new y0.c(j8));
                    }
                }
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j0 j0Var, x0.n nVar, boolean z8, x0 x0Var, g2.q qVar) {
        super(1);
        this.f8821i = j0Var;
        this.f8822j = nVar;
        this.f8820h = z8;
        this.f8823k = x0Var;
        this.f8824l = qVar;
    }
}
