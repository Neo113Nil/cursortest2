package com.anythink.core.c.b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bu;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cd;
import com.anythink.core.common.k;
import com.anythink.core.common.v.af;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f12206b = "PlacementStatisticRecord";

    /* renamed from: a, reason: collision with root package name */
    a f12207a;

    /* renamed from: c, reason: collision with root package name */
    private final n f12208c = n.a(t.b().g());

    /* renamed from: d, reason: collision with root package name */
    private final e f12209d;

    /* renamed from: e, reason: collision with root package name */
    private final f f12210e;

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.anythink.core.c.a.b> f12211f;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<String, Boolean> f12212g;

    public d() {
        e a9 = e.a();
        this.f12209d = a9;
        this.f12210e = new f(a9);
        this.f12211f = new ConcurrentHashMap<>();
        this.f12212g = new ConcurrentHashMap<>();
        this.f12207a = new a(a9);
    }

    private com.anythink.core.c.a.b c(String str) {
        l b9 = this.f12208c.b(str);
        com.anythink.core.c.a.b bVar = this.f12211f.get(str);
        if (bVar == null) {
            bVar = new com.anythink.core.c.a.b();
            String c4 = af.c(t.b().g(), u.b.f13005b, str, "");
            if (!TextUtils.isEmpty(c4)) {
                try {
                    bVar.a(Double.parseDouble(c4));
                } catch (Exception e6) {
                    e6.getMessage();
                }
            }
            this.f12211f.put(str, bVar);
        }
        if (b9 != null) {
            bVar.a(b9.aV());
            bVar.a(b9.aY());
            bVar.b(b9.aX());
            bVar.c(b9.bc());
            bVar.d(b9.j() != null ? 1 : 2);
        }
        return bVar;
    }

    private void d(final String str) {
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.c.b.d.1
            @Override // java.lang.Runnable
            public final void run() {
                d.this.f12211f.remove(str);
                d.this.f12209d.a(str);
            }
        }, 13);
    }

    @Override // com.anythink.core.c.b.b
    public final void a(String str, String str2, int i, ATAdRequest aTAdRequest, bv bvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ((bvVar == null || !bvVar.br()) && b(str, 10)) {
            com.anythink.core.c.a.a aVar = new com.anythink.core.c.a.a();
            if (bvVar != null) {
                aVar.b(bvVar.z());
                ad R8 = bvVar.R();
                if (R8 != null) {
                    cd cdVar = R8.f13596v;
                    aVar.c(cdVar != null ? cdVar.f() : "");
                }
                aVar.a(bvVar.D());
                aVar.b(bvVar.g());
            }
            aVar.a(str2);
            aVar.d(t.b().r());
            aVar.a(System.currentTimeMillis());
            aVar.e(str);
            aVar.c(10);
            aVar.a(i);
            if (bvVar != null) {
                com.anythink.core.c.a.c cVar = this.f12207a.f12191a.get(str);
                aVar.a();
                aVar.toString();
                if (cVar != null) {
                    cVar.a(aVar);
                }
            }
            a(aVar, aTAdRequest);
        }
    }

    @Override // com.anythink.core.c.b.b
    public final void b(String str) {
        a(str, c(str));
    }

    private boolean b(String str, int i) {
        com.anythink.core.c.a.b c4 = c(str);
        boolean z8 = c4.c() || c4.h();
        Boolean bool = this.f12212g.get(str);
        if (bool != null) {
            boolean equals = Boolean.TRUE.equals(bool);
            if (!z8 && equals) {
                d(str);
            }
        } else if (!z8) {
            d(str);
        }
        this.f12212g.put(str, Boolean.valueOf(z8));
        return i == 4 ? c4.c() : z8;
    }

    private JSONArray b(int i, String str, int i4) {
        List<com.anythink.core.c.a.a> a9 = a(i, str, i4);
        if (a9 == null || a9.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<com.anythink.core.c.a.a> it = a9.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().i());
        }
        return jSONArray;
    }

    private static com.anythink.core.c.a.a b(bu buVar, bv bvVar) {
        com.anythink.core.c.a.a aVar = new com.anythink.core.c.a.a();
        if (buVar != null) {
            aVar.a(buVar.aJ());
            aVar.e(buVar.aI());
            if (buVar instanceof com.anythink.core.common.h.n) {
                aVar.a(((com.anythink.core.common.h.n) buVar).Z());
            }
        }
        if (bvVar != null) {
            aVar.b(bvVar.z());
            ad R8 = bvVar.R();
            if (R8 != null) {
                cd cdVar = R8.f13596v;
                aVar.c(cdVar != null ? cdVar.f() : "");
            }
            aVar.a(bvVar.aC() > 0.0d ? bvVar.aC() : bvVar.D());
            aVar.b(bvVar.g());
        }
        aVar.d(t.b().r());
        aVar.a(System.currentTimeMillis());
        aVar.c(4);
        return aVar;
    }

    @Override // com.anythink.core.c.b.b
    public final void a(bu buVar, bv bvVar) {
        ATAdRequest aTAdRequest;
        if (buVar == null || bvVar == null || bvVar.br()) {
            return;
        }
        String aI = buVar.aI();
        if (!TextUtils.isEmpty(aI) && b(aI, 4)) {
            try {
                aTAdRequest = ((com.anythink.core.common.h.n) buVar).a();
            } catch (Exception unused) {
                aTAdRequest = null;
            }
            com.anythink.core.c.a.a aVar = new com.anythink.core.c.a.a();
            aVar.a(buVar.aJ());
            aVar.e(buVar.aI());
            if (buVar instanceof com.anythink.core.common.h.n) {
                aVar.a(((com.anythink.core.common.h.n) buVar).Z());
            }
            aVar.b(bvVar.z());
            ad R8 = bvVar.R();
            if (R8 != null) {
                cd cdVar = R8.f13596v;
                aVar.c(cdVar != null ? cdVar.f() : "");
            }
            aVar.a(bvVar.aC() > 0.0d ? bvVar.aC() : bvVar.D());
            aVar.b(bvVar.g());
            aVar.d(t.b().r());
            aVar.a(System.currentTimeMillis());
            aVar.c(4);
            a(aVar, aTAdRequest);
        }
    }

    @Override // com.anythink.core.c.b.b
    public final List<com.anythink.core.c.a.a> a(int i, String str, int i4) {
        e eVar = this.f12209d;
        if (eVar != null) {
            return eVar.a(i, str, i4);
        }
        return null;
    }

    @Override // com.anythink.core.c.b.b
    public final JSONObject a(String str) {
        return a(str, 0);
    }

    @Override // com.anythink.core.c.b.b
    public final JSONObject a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.anythink.core.c.a.b c4 = c(str);
        if (c4.b()) {
            return a(str, i, c4.a());
        }
        return null;
    }

    @Override // com.anythink.core.c.b.b
    public final JSONObject a(String str, int i, int i4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (i == 4) {
                JSONArray b9 = b(4, str, i4);
                if (b9 != null) {
                    jSONObject.put("imp", b9);
                }
            } else if (i == 10) {
                JSONArray b10 = b(10, str, i4);
                if (b10 != null) {
                    jSONObject.put("fill", b10);
                }
            } else {
                JSONArray b11 = b(10, str, i4);
                if (b11 != null) {
                    jSONObject.put("fill", b11);
                }
                JSONArray b12 = b(4, str, i4);
                if (b12 != null) {
                    jSONObject.put("imp", b12);
                }
                jSONObject.put("def_ecpm", String.valueOf(a(str, b12)));
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e6) {
            e6.getMessage();
            return null;
        }
    }

    @Override // com.anythink.core.c.b.b
    public final com.anythink.core.c.a.d a(String str, int i, com.anythink.core.d.f fVar) {
        a aVar = this.f12207a;
        com.anythink.core.c.a.c cVar = aVar.f12191a.get(str);
        int i4 = fVar.a() == 1 ? i : -1;
        if (cVar != null && cVar.b(fVar) && cVar.a(i4) != null) {
            cVar.c(i);
        } else {
            cVar = new com.anythink.core.c.a.c();
            cVar.a(fVar);
            int c4 = fVar.c();
            long currentTimeMillis = System.currentTimeMillis() - ((fVar.b() * 86400) * 1000);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            cVar.a(i4, aVar.f12192b.a(str, i4, calendar.getTimeInMillis(), c4));
            aVar.f12191a.put(str, cVar);
        }
        return cVar.b(i4);
    }

    private void a(com.anythink.core.c.a.a aVar, ATAdRequest aTAdRequest) {
        aVar.toString();
        String j9 = aVar.j();
        com.anythink.core.c.a.b c4 = c(j9);
        e eVar = this.f12209d;
        if (eVar != null) {
            eVar.a(aVar);
        }
        if (aVar.k() == 4) {
            a(j9, c4, aTAdRequest);
        }
    }

    private double a(String str, JSONArray jSONArray) {
        com.anythink.core.c.a.b c4 = c(str);
        if (!c4.e()) {
            c4.g();
            return c4.g();
        }
        if (jSONArray == null) {
            return -1.0d;
        }
        try {
            if (jSONArray.length() > 0) {
                return jSONArray.getJSONObject(0).getDouble(k.f14442H);
            }
            return -1.0d;
        } catch (Exception e6) {
            e6.getMessage();
            return -1.0d;
        }
    }

    private void a(String str, com.anythink.core.c.a.b bVar, ATAdRequest aTAdRequest) {
        double[][] f6;
        if (bVar == null || (f6 = bVar.f()) == null) {
            return;
        }
        if (bVar.e()) {
            a(str, aTAdRequest);
            return;
        }
        double[] a9 = a(str, bVar);
        double d2 = a9[0];
        double d3 = a9[1];
        if (d2 == d3) {
            return;
        }
        double[] a10 = d2 > 0.0d ? a(f6, d2) : null;
        double[] a11 = d3 > 0.0d ? a(f6, d3) : null;
        if (a10 == null) {
            if (a11 == null) {
                return;
            }
        } else if (a11 != null && a10[0] == a11[0] && a10[1] == a11[1]) {
            return;
        }
        a(str, aTAdRequest);
    }

    private static com.anythink.core.c.a.a a(String str, String str2, int i, bv bvVar) {
        com.anythink.core.c.a.a aVar = new com.anythink.core.c.a.a();
        if (bvVar != null) {
            aVar.b(bvVar.z());
            ad R8 = bvVar.R();
            if (R8 != null) {
                cd cdVar = R8.f13596v;
                aVar.c(cdVar != null ? cdVar.f() : "");
            }
            aVar.a(bvVar.D());
            aVar.b(bvVar.g());
        }
        aVar.a(str);
        aVar.d(t.b().r());
        aVar.a(System.currentTimeMillis());
        aVar.e(str2);
        aVar.c(10);
        aVar.a(i);
        return aVar;
    }

    private double[] a(String str, com.anythink.core.c.a.b bVar) {
        if (bVar != null && !bVar.e()) {
            double a9 = this.f12210e.a(bVar.d(), str);
            double g9 = bVar.g();
            if (g9 != a9) {
                bVar.a(a9);
                this.f12211f.put(str, bVar);
                af.b(t.b().g(), u.b.f13005b, str, String.valueOf(a9));
            }
            return new double[]{a9, g9};
        }
        return new double[]{-1.0d, -1.0d};
    }

    private static double[] a(double[][] dArr, double d2) {
        for (double[] dArr2 : dArr) {
            if (dArr2.length == 2) {
                double d3 = dArr2[0];
                double d9 = dArr2[1];
                if (d2 >= d3 && d2 <= d9) {
                    return dArr2;
                }
            }
        }
        return null;
    }

    private void a(String str, ATAdRequest aTAdRequest) {
        t b9 = t.b();
        this.f12208c.a(this.f12208c.e(str), b9.p(), b9.q(), str, null, null, 2, true, aTAdRequest);
    }
}
