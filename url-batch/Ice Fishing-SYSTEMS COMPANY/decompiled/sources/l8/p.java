package l8;

import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39152n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f39153u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f39154v;

    public /* synthetic */ p(int i, Object obj, Object obj2) {
        this.f39152n = i;
        this.f39153u = obj;
        this.f39154v = obj2;
    }

    @Override // E7.a
    public final Object invoke() {
        long a9;
        int i;
        z[] zVarArr;
        switch (this.f39152n) {
            case 0:
                r rVar = (r) this.f39153u;
                z zVar = (z) this.f39154v;
                try {
                    rVar.f39175n.b(zVar);
                } catch (IOException e6) {
                    o8.f fVar = o8.f.f39739a;
                    o8.f.f39739a.j(4, "Http2Connection.Listener failure for " + rVar.f39177v, e6);
                    try {
                        zVar.d(EnumC4710b.f39100w, e6);
                    } catch (IOException unused) {
                    }
                }
                return q7.v.f40183a;
            case 1:
                q qVar = (q) this.f39153u;
                D d2 = (D) this.f39154v;
                kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                r rVar3 = qVar.f39156u;
                synchronized (rVar3.f39172P) {
                    synchronized (rVar3) {
                        try {
                            D d3 = rVar3.f39167K;
                            D d9 = new D();
                            d9.b(d3);
                            d9.b(d2);
                            rVar2.f38861n = d9;
                            a9 = d9.a() - d3.a();
                            if (a9 != 0 && !rVar3.f39176u.isEmpty()) {
                                zVarArr = (z[]) rVar3.f39176u.values().toArray(new z[0]);
                                D d10 = (D) rVar2.f38861n;
                                kotlin.jvm.internal.h.e(d10, "<set-?>");
                                rVar3.f39167K = d10;
                                h8.c.c(rVar3.f39160C, rVar3.f39177v + " onSettings", new p(2, rVar3, rVar2));
                            }
                            zVarArr = null;
                            D d102 = (D) rVar2.f38861n;
                            kotlin.jvm.internal.h.e(d102, "<set-?>");
                            rVar3.f39167K = d102;
                            h8.c.c(rVar3.f39160C, rVar3.f39177v + " onSettings", new p(2, rVar3, rVar2));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar3.f39172P.a((D) rVar2.f38861n);
                    } catch (IOException e9) {
                        EnumC4710b enumC4710b = EnumC4710b.f39100w;
                        rVar3.a(enumC4710b, enumC4710b, e9);
                    }
                }
                if (zVarArr != null) {
                    for (z zVar2 : zVarArr) {
                        synchronized (zVar2) {
                            zVar2.f39221x += a9;
                            if (a9 > 0) {
                                zVar2.notifyAll();
                            }
                        }
                    }
                }
                return q7.v.f40183a;
            default:
                r rVar4 = (r) this.f39153u;
                rVar4.f39175n.a(rVar4, (D) ((kotlin.jvm.internal.r) this.f39154v).f38861n);
                return q7.v.f40183a;
        }
    }
}
