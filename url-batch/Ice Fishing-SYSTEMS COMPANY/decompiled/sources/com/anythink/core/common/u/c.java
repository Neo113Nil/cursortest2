package com.anythink.core.common.u;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bu;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.o;
import com.anythink.core.common.m;
import com.anythink.core.common.m.d.d;
import com.anythink.core.common.m.v;
import com.anythink.core.common.q;
import com.anythink.core.common.u;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.p;
import com.anythink.core.common.w;
import com.anythink.core.d.l;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c extends m<o> {

    /* renamed from: g, reason: collision with root package name */
    private static volatile c f16613g;

    private c(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private o b(int i, bu buVar, bv bvVar, long j9) {
        com.anythink.core.d.b k6;
        List<String> S8;
        List<com.anythink.core.common.h.c> a9;
        ad R8;
        a(i, bvVar, false);
        if (i == 4) {
            ad R9 = bvVar != null ? bvVar.R() : null;
            if (R9 != null) {
                com.anythink.core.b.d.c.a(R9, true, R9.getSortPrice(), true, false);
            }
            if (buVar instanceof n) {
                n nVar = (n) buVar;
                String aI = nVar.aI();
                l a10 = com.anythink.core.d.n.a(this.f14551d).a(aI);
                if (a10 != null && (S8 = a10.S()) != null && S8.size() != 0 && (a9 = com.anythink.core.common.a.a().a(aI)) != null) {
                    for (com.anythink.core.common.h.c cVar : a9) {
                        if (cVar != null && cVar.c() == 0) {
                            n i4 = cVar.i();
                            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                            boolean s3 = (!ak.b(unitGroupInfo) || unitGroupInfo.R() == null) ? false : unitGroupInfo.R().s();
                            if (S8.contains(String.valueOf(unitGroupInfo.g())) && !TextUtils.equals(nVar.x(), i4.x()) && (R8 = unitGroupInfo.R()) != null) {
                                com.anythink.core.b.d.c.a(R8, false, p.a(bvVar), nVar.J() == 1, s3);
                            }
                        }
                    }
                }
                if (i == 4) {
                    if (buVar instanceof n) {
                        if (bvVar != null) {
                            n nVar2 = (n) buVar;
                            com.anythink.core.c.a.a().a(nVar2, bvVar);
                            if (bvVar.Q() && bvVar.aC() > 0.0d) {
                                nVar2.e(bvVar.aC());
                            }
                        }
                        n nVar3 = (n) buVar;
                        if (nVar3.i() == 2) {
                            w.a().a(buVar.aI(), nVar3.a());
                        }
                        com.anythink.core.common.d.a().a(buVar.aI(), buVar.aJ(), nVar3.M());
                    }
                    com.anythink.core.c.b.a().a(buVar, bvVar);
                }
                if (i == 6 && (buVar instanceof n)) {
                    com.anythink.core.common.d.a().b(buVar.aI(), buVar.aJ(), ((n) buVar).M());
                }
                k6 = i.k(i.l());
                o oVar = new o();
                oVar.f14189a = i;
                oVar.f14190b = buVar;
                oVar.f14191c = j9 <= 0 ? j9 : System.currentTimeMillis();
                q.a(t.b().g()).a(i, oVar, k6);
                if (4 == i && (buVar instanceof n)) {
                    com.anythink.core.common.p.a();
                    com.anythink.core.common.p.a((n) buVar);
                }
                if (a(i, buVar, k6)) {
                    return oVar;
                }
                return null;
            }
        }
        if (i == 4) {
        }
        if (i == 6) {
            com.anythink.core.common.d.a().b(buVar.aI(), buVar.aJ(), ((n) buVar).M());
        }
        k6 = i.k(i.l());
        o oVar2 = new o();
        oVar2.f14189a = i;
        oVar2.f14190b = buVar;
        oVar2.f14191c = j9 <= 0 ? j9 : System.currentTimeMillis();
        q.a(t.b().g()).a(i, oVar2, k6);
        if (4 == i) {
            com.anythink.core.common.p.a();
            com.anythink.core.common.p.a((n) buVar);
        }
        if (a(i, buVar, k6)) {
        }
    }

    private static boolean c(int i, bu buVar) {
        if (!(buVar instanceof n)) {
            return false;
        }
        n nVar = (n) buVar;
        if (nVar.Y() == 67) {
            return true;
        }
        if (nVar.Y() == 0 || TextUtils.isEmpty(buVar.aK())) {
            return false;
        }
        if (!TextUtils.isEmpty(nVar.au()) || !TextUtils.isEmpty(nVar.av())) {
            return true;
        }
        Map<String, String> a9 = i.l().b(t.b().p()).a(i);
        if (a9 != null) {
            if (a9.containsKey("0")) {
                String str = a9.get("0");
                return !TextUtils.isEmpty(str) && str.contains(buVar.aK());
            }
            if (a9.containsKey(String.valueOf(nVar.Y()))) {
                String str2 = a9.get(String.valueOf(nVar.Y()));
                if (!TextUtils.isEmpty(str2) && str2.contains(buVar.aK())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void d(int i, bu buVar) {
        if (4 == i && (buVar instanceof n)) {
            com.anythink.core.common.p.a();
            com.anythink.core.common.p.a((n) buVar);
        }
    }

    private static void e(int i, bu buVar) {
        if (buVar instanceof n) {
            if (i == 4) {
                n nVar = (n) buVar;
                nVar.m();
                u.a().b(buVar.aI(), buVar.aJ(), nVar.M());
            } else if (i == 6) {
                ((n) buVar).n();
            } else if (i == 10) {
                n nVar2 = (n) buVar;
                com.anythink.core.common.e.a(buVar.ay(), com.anythink.core.common.e.f13041c, nVar2);
                a(buVar);
                e.b(nVar2, 1);
            } else if (i == 21) {
                t.b().S();
            }
            b.a().a(i, (n) buVar);
        }
    }

    @Override // com.anythink.core.common.m
    public final void a(List<o> list) {
        com.anythink.core.d.b k6 = i.k(i.l());
        if (k6 == null) {
            new v(this.f14551d, 0, list).a(0, (com.anythink.core.common.m.q) null);
            return;
        }
        int G7 = k6.G();
        if (G7 == 1) {
            com.anythink.core.common.m.d.f fVar = new com.anythink.core.common.m.d.f(list);
            fVar.a(1, k6.F());
            fVar.a((d.a) null);
        } else {
            if (G7 != 2) {
                new v(this.f14551d, k6.G(), list).a(0, (com.anythink.core.common.m.q) null);
                return;
            }
            new v(this.f14551d, k6.G(), list).a(0, (com.anythink.core.common.m.q) null);
            com.anythink.core.common.m.d.f fVar2 = new com.anythink.core.common.m.d.f(list);
            fVar2.a(2, k6.F());
            fVar2.a((d.a) null);
        }
    }

    private static void c(int i, bu buVar, bv bvVar) {
        if (i == 4) {
            if (buVar instanceof n) {
                if (bvVar != null) {
                    n nVar = (n) buVar;
                    com.anythink.core.c.a.a().a(nVar, bvVar);
                    if (bvVar.Q() && bvVar.aC() > 0.0d) {
                        nVar.e(bvVar.aC());
                    }
                }
                n nVar2 = (n) buVar;
                if (nVar2.i() == 2) {
                    w.a().a(buVar.aI(), nVar2.a());
                }
                com.anythink.core.common.d.a().a(buVar.aI(), buVar.aJ(), nVar2.M());
            }
            com.anythink.core.c.b.a().a(buVar, bvVar);
        }
    }

    public static c a(Context context) {
        if (f16613g == null) {
            synchronized (c.class) {
                try {
                    if (f16613g == null) {
                        f16613g = new c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16613g;
    }

    public final void a(int i, bu buVar) {
        a(i, buVar, null, -1L);
    }

    public final void a(int i, bu buVar, bv bvVar) {
        a(i, buVar, bvVar, -1L);
    }

    public final void a(final int i, final bu buVar, final bv bvVar, final long j9) {
        if (buVar == null) {
            return;
        }
        synchronized (buVar) {
            a(i, bvVar, true);
            e(i, buVar);
        }
        Handler handler = this.f14552e;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.anythink.core.common.u.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    o a9 = c.a(c.this, i, buVar, bvVar, j9);
                    if (a9 == null) {
                        return;
                    }
                    c.this.a((c) a9, c.b(i, buVar));
                }
            });
        }
    }

    private static void a(int i, bv bvVar, boolean z8) {
        if (bvVar != null) {
            int g9 = bvVar.g();
            if (z8) {
                if (g9 == 79 || (g9 == 50 && bvVar.bg() == 1)) {
                    a(i, bvVar);
                    return;
                }
                return;
            }
            if (g9 == 79) {
                return;
            }
            if (g9 == 50 && bvVar.bg() == 1) {
                return;
            }
            a(i, bvVar);
        }
    }

    private static void a(int i, bv bvVar) {
        if (i == 13) {
            ad R8 = bvVar != null ? bvVar.R() : null;
            if (R8 != null) {
                com.anythink.core.b.d.c.a(R8, bvVar, 1);
            }
        }
    }

    private static boolean a(int i, bu buVar, com.anythink.core.d.b bVar) {
        if (t.b().z()) {
            return true;
        }
        String az = bVar.az();
        if (!TextUtils.isEmpty(az) && (buVar instanceof n)) {
            try {
                JSONArray jSONArray = new JSONArray(az);
                int length = jSONArray.length();
                String valueOf = String.valueOf(((n) buVar).Y());
                for (int i4 = 0; i4 < length; i4++) {
                    if (TextUtils.equals(valueOf, jSONArray.optString(i4))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Map<String, String> ax = bVar.ax();
        if (ax != null && ax.containsKey(String.valueOf(i))) {
            String str = ax.get(String.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                String aK = buVar.aK();
                if (TextUtils.isEmpty(aK) || str.contains(aK)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void b(int i, bu buVar, bv bvVar) {
        n nVar;
        String aI;
        l a9;
        List<String> S8;
        List<com.anythink.core.common.h.c> a10;
        ad R8;
        if (i == 4) {
            ad R9 = bvVar != null ? bvVar.R() : null;
            if (R9 != null) {
                com.anythink.core.b.d.c.a(R9, true, R9.getSortPrice(), true, false);
            }
            if (!(buVar instanceof n) || (a9 = com.anythink.core.d.n.a(this.f14551d).a((aI = (nVar = (n) buVar).aI()))) == null || (S8 = a9.S()) == null || S8.size() == 0 || (a10 = com.anythink.core.common.a.a().a(aI)) == null) {
                return;
            }
            for (com.anythink.core.common.h.c cVar : a10) {
                if (cVar != null && cVar.c() == 0) {
                    n i4 = cVar.i();
                    bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                    boolean s3 = (!ak.b(unitGroupInfo) || unitGroupInfo.R() == null) ? false : unitGroupInfo.R().s();
                    if (S8.contains(String.valueOf(unitGroupInfo.g())) && !TextUtils.equals(nVar.x(), i4.x()) && (R8 = unitGroupInfo.R()) != null) {
                        com.anythink.core.b.d.c.a(R8, false, p.a(bvVar), nVar.J() == 1, s3);
                    }
                }
            }
        }
    }

    private void a(n nVar, bv bvVar) {
        List<String> S8;
        List<com.anythink.core.common.h.c> a9;
        ad R8;
        String aI = nVar.aI();
        l a10 = com.anythink.core.d.n.a(this.f14551d).a(aI);
        if (a10 == null || (S8 = a10.S()) == null || S8.size() == 0 || (a9 = com.anythink.core.common.a.a().a(aI)) == null) {
            return;
        }
        for (com.anythink.core.common.h.c cVar : a9) {
            if (cVar != null && cVar.c() == 0) {
                n i = cVar.i();
                bv unitGroupInfo = cVar.e().getUnitGroupInfo();
                boolean s3 = (!ak.b(unitGroupInfo) || unitGroupInfo.R() == null) ? false : unitGroupInfo.R().s();
                if (S8.contains(String.valueOf(unitGroupInfo.g())) && !TextUtils.equals(nVar.x(), i.x()) && (R8 = unitGroupInfo.R()) != null) {
                    com.anythink.core.b.d.c.a(R8, false, p.a(bvVar), nVar.J() == 1, s3);
                }
            }
        }
    }

    public static /* synthetic */ boolean b(int i, bu buVar) {
        if (buVar instanceof n) {
            n nVar = (n) buVar;
            if (nVar.Y() == 67) {
                return true;
            }
            if (nVar.Y() != 0 && !TextUtils.isEmpty(buVar.aK())) {
                if (!TextUtils.isEmpty(nVar.au()) || !TextUtils.isEmpty(nVar.av())) {
                    return true;
                }
                Map<String, String> a9 = i.l().b(t.b().p()).a(i);
                if (a9 != null) {
                    if (a9.containsKey("0")) {
                        String str = a9.get("0");
                        return !TextUtils.isEmpty(str) && str.contains(buVar.aK());
                    }
                    if (a9.containsKey(String.valueOf(nVar.Y()))) {
                        String str2 = a9.get(String.valueOf(nVar.Y()));
                        return !TextUtils.isEmpty(str2) && str2.contains(buVar.aK());
                    }
                }
            }
        }
        return false;
    }

    private static void a(bu buVar) {
        if (buVar instanceof n) {
            e.b((n) buVar);
        }
    }

    public static /* synthetic */ o a(c cVar, int i, bu buVar, bv bvVar, long j9) {
        n nVar;
        String aI;
        l a9;
        List<String> S8;
        List<com.anythink.core.common.h.c> a10;
        ad R8;
        a(i, bvVar, false);
        if (i == 4) {
            ad R9 = bvVar != null ? bvVar.R() : null;
            if (R9 != null) {
                com.anythink.core.b.d.c.a(R9, true, R9.getSortPrice(), true, false);
            }
            if ((buVar instanceof n) && (a9 = com.anythink.core.d.n.a(cVar.f14551d).a((aI = (nVar = (n) buVar).aI()))) != null && (S8 = a9.S()) != null && S8.size() != 0 && (a10 = com.anythink.core.common.a.a().a(aI)) != null) {
                for (com.anythink.core.common.h.c cVar2 : a10) {
                    if (cVar2 != null && cVar2.c() == 0) {
                        n i4 = cVar2.i();
                        bv unitGroupInfo = cVar2.e().getUnitGroupInfo();
                        boolean s3 = (!ak.b(unitGroupInfo) || unitGroupInfo.R() == null) ? false : unitGroupInfo.R().s();
                        if (S8.contains(String.valueOf(unitGroupInfo.g())) && !TextUtils.equals(nVar.x(), i4.x()) && (R8 = unitGroupInfo.R()) != null) {
                            com.anythink.core.b.d.c.a(R8, false, p.a(bvVar), nVar.J() == 1, s3);
                        }
                    }
                }
            }
        }
        if (i == 4) {
            if (buVar instanceof n) {
                if (bvVar != null) {
                    n nVar2 = (n) buVar;
                    com.anythink.core.c.a.a().a(nVar2, bvVar);
                    if (bvVar.Q() && bvVar.aC() > 0.0d) {
                        nVar2.e(bvVar.aC());
                    }
                }
                n nVar3 = (n) buVar;
                if (nVar3.i() == 2) {
                    w.a().a(buVar.aI(), nVar3.a());
                }
                com.anythink.core.common.d.a().a(buVar.aI(), buVar.aJ(), nVar3.M());
            }
            com.anythink.core.c.b.a().a(buVar, bvVar);
        }
        if (i == 6 && (buVar instanceof n)) {
            com.anythink.core.common.d.a().b(buVar.aI(), buVar.aJ(), ((n) buVar).M());
        }
        com.anythink.core.d.b k6 = i.k(i.l());
        o oVar = new o();
        oVar.f14189a = i;
        oVar.f14190b = buVar;
        oVar.f14191c = j9 > 0 ? j9 : System.currentTimeMillis();
        q.a(t.b().g()).a(i, oVar, k6);
        if (4 == i && (buVar instanceof n)) {
            com.anythink.core.common.p.a();
            com.anythink.core.common.p.a((n) buVar);
        }
        if (a(i, buVar, k6)) {
            return null;
        }
        return oVar;
    }
}
