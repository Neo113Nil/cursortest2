package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.z;
import com.anythink.core.common.v.ae;
import com.anythink.core.common.v.p;
import com.anythink.core.d.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    protected com.anythink.core.common.h.a f11893f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f11894g;
    protected long i;

    /* renamed from: a, reason: collision with root package name */
    private final String f11892a = getClass().getSimpleName().concat(":");

    /* renamed from: h, reason: collision with root package name */
    protected AtomicBoolean f11895h = new AtomicBoolean(false);

    public d(com.anythink.core.common.h.a aVar) {
        this.f11893f = aVar;
    }

    public static JSONArray b(List<JSONObject> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (JSONObject jSONObject : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("network_firm_id", 67);
                if (jSONObject.has("unit_ids")) {
                    jSONObject2.put("unit_ids", jSONObject.get("unit_ids"));
                }
                jSONArray.put(jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public abstract void a();

    public abstract void a(com.anythink.core.b.b.b bVar);

    public abstract void a(bv bvVar, z zVar, long j9);

    public void a(boolean z8) {
        this.f11894g = z8;
    }

    public final boolean c() {
        return this.f11895h.get();
    }

    public static JSONArray a(List<bv> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (bv bvVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("network_firm_id", bvVar.g());
                jSONObject.put("ad_source_id", bvVar.z());
                jSONObject.put("content", bvVar.k());
                if (!TextUtils.isEmpty(bvVar.F())) {
                    jSONObject.put("error", bvVar.F());
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public final void b(ad adVar, bv bvVar) {
        com.anythink.core.b.d.c.a(adVar, new aw(9, bvVar, this.f11893f.f13500s, adVar.getSortPrice()), true, 33);
    }

    public static void a(bv bvVar, String str, long j9, int i) {
        bvVar.c(j9);
        bvVar.b(0.0d);
        bvVar.e(0.0d);
        bvVar.g(i);
        bvVar.f();
        if (TextUtils.isEmpty(str)) {
            bvVar.h("bid error");
        } else {
            bvVar.h(str);
        }
    }

    public static boolean a(boolean z8, bv bvVar, z zVar) {
        double ar = bvVar.ar();
        if (z8 && ar > 0.0d) {
            zVar.getPrice();
            if (zVar.getPrice() < ar) {
                return true;
            }
        }
        return false;
    }

    public final void a(ad adVar, bv bvVar) {
        com.anythink.core.b.d.c.a(adVar, new aw(6, bvVar, this.f11893f.f13500s, bvVar.ar()), true, 23);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(bv bvVar, ad adVar) {
        bv bvVar2;
        double sortPrice;
        boolean z8;
        double d2;
        double d3;
        if (adVar == null) {
            return;
        }
        adVar.b(this.f11893f.f13486d);
        adVar.setOriginRequestId(this.f11893f.f13486d);
        ad a9 = f.a().a(this.f11893f.f13487e, bvVar);
        if (a9 != null) {
            boolean a10 = a9.a();
            if (!a10 && adVar.getSortPrice() <= a9.getSortPrice()) {
                d3 = a9.getSortPrice();
                bvVar2 = bvVar;
                z8 = false;
            } else {
                sortPrice = adVar.getSortPrice();
                if (a10) {
                    bvVar2 = bvVar;
                    com.anythink.core.b.d.c.a(a9, new aw(1, bvVar, this.f11893f.f13500s, sortPrice), true, 25);
                } else {
                    bvVar2 = bvVar;
                    z8 = true;
                    d3 = sortPrice;
                }
            }
            d2 = d3;
            if (!z8) {
                if (a9 != null) {
                    try {
                        com.anythink.core.b.d.c.a(a9, new aw(2, bvVar2, this.f11893f.f13500s, d2), true, 26);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                bvVar2.a(adVar, 2, 0, 1);
                if (bvVar2.P() != 2) {
                    f a11 = f.a();
                    String str = this.f11893f.f13487e;
                    ConcurrentHashMap<String, ad> concurrentHashMap = a11.f11999a;
                    StringBuilder b9 = AbstractC5088e.b(str);
                    b9.append(adVar.f13585k);
                    concurrentHashMap.put(b9.toString(), adVar);
                    if (bvVar2.am()) {
                        com.anythink.core.common.a.a.a().a(str, adVar);
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                com.anythink.core.b.d.c.a(adVar, new aw(2, bvVar2, this.f11893f.f13500s, d2), false, 27);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            bvVar2.a(a9, 1, 0, 1);
            return;
        }
        bvVar2 = bvVar;
        sortPrice = adVar.getSortPrice();
        z8 = true;
        d2 = sortPrice;
        if (!z8) {
        }
    }

    public final boolean a(bv bvVar, String str, int i) {
        return a(bvVar, str, i, 0);
    }

    public final boolean a(bv bvVar, String str, int i, int i4) {
        if (ae.a(0, this.f11893f.f13500s, bvVar, (z) null) != null) {
            return false;
        }
        ad a9 = f.a().a(this.f11893f.f13487e, bvVar);
        if (a9 != null && !a9.a()) {
            bvVar.a(a9, 0, i, i4);
            bvVar.h(str);
            return true;
        }
        if (a9 != null) {
            try {
                n af = this.f11893f.f13500s.af();
                af.J(a9.c());
                af.D(a9.x());
                af.L(a9.getOriginRequestId());
                com.anythink.core.b.d.c.a(a9, new aw(1, bvVar, af), true, 25);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r0 <= 1.0d) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, z zVar, double d2, boolean z8) {
        double d3;
        if (i != 28) {
            return;
        }
        JSONObject C7 = this.f11893f.f13495n.a().C();
        if (C7 != null) {
            d3 = C7.optDouble(String.valueOf(i));
            if (d3 > 0.0d) {
            }
        }
        d3 = 0.95d;
        double d9 = zVar.originPrice * d3;
        com.anythink.core.common.w.i iVar = this.f11893f.f13506y;
        List<bv> a9 = iVar != null ? iVar.a() : null;
        if (a9 != null) {
            Iterator<bv> it = a9.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                double a10 = p.a(it.next());
                if (a10 < zVar.originPrice) {
                    d9 = Math.max(d9, a10);
                    break;
                }
            }
        }
        double max = Math.max(d9, d2);
        double random = (Math.random() * (zVar.originPrice - max)) + max;
        zVar.setPrice(random);
        if (z8) {
            zVar.setSortPrice(random);
        }
    }

    public final double a(bv bvVar) {
        if (bvVar.ap() == null) {
            return 1.0d;
        }
        double a9 = a(this.f11893f.f13495n.a(), bvVar.ap());
        bvVar.h();
        return a9;
    }

    private double a(double d2, ATAdConst.CURRENCY currency) {
        if (currency == null) {
            return d2;
        }
        double a9 = a(this.f11893f.f13495n.a(), currency);
        String.valueOf(d2);
        String.valueOf(a9);
        double d3 = d2 * a9;
        String.valueOf(d3);
        return d3;
    }

    private static double a(l lVar, ATAdConst.CURRENCY currency) {
        if (lVar == null) {
            return 1.0d;
        }
        if (currency == ATAdConst.CURRENCY.RMB_CENT) {
            return (1.0d / lVar.L()) * 100.0d;
        }
        if (currency == ATAdConst.CURRENCY.RMB) {
            return 1.0d / lVar.L();
        }
        return 1.0d;
    }

    public final double a(double d2, bv bvVar) {
        double L8;
        if (bvVar.ap() != null) {
            l a9 = this.f11893f.f13495n.a();
            if (bvVar.ap() == ATAdConst.CURRENCY.RMB) {
                L8 = a9.L();
            } else if (bvVar.ap() == ATAdConst.CURRENCY.RMB_CENT) {
                d2 /= 100.0d;
                L8 = a9.L();
            }
            return L8 * d2;
        }
        return d2;
    }

    public final void a(long j9) {
        this.i = j9;
    }
}
