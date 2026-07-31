package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x72 implements r72<mm1> {

    /* renamed from: a, reason: collision with root package name */
    private final dl1 f14069a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f14070b;

    /* renamed from: c, reason: collision with root package name */
    private final fp1 f14071c;

    /* renamed from: d, reason: collision with root package name */
    private final bt2<rr1> f14072d;

    /* renamed from: e, reason: collision with root package name */
    private final yr1 f14073e;

    public x72(dl1 dl1Var, dc3 dc3Var, fp1 fp1Var, bt2<rr1> bt2Var, yr1 yr1Var) {
        this.f14069a = dl1Var;
        this.f14070b = dc3Var;
        this.f14071c = fp1Var;
        this.f14072d = bt2Var;
        this.f14073e = yr1Var;
    }

    private final cc3<mm1> g(final ds2 ds2Var, final rr2 rr2Var, final JSONObject jSONObject) {
        final cc3<rr1> a7 = this.f14072d.a();
        final cc3<rm1> a8 = this.f14071c.a(ds2Var, rr2Var, jSONObject);
        return rb3.d(a7, a8).a(new Callable() { // from class: com.google.android.gms.internal.ads.w72
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return x72.this.c(a8, a7, ds2Var, rr2Var, jSONObject);
            }
        }, this.f14070b);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<List<cc3<mm1>>> a(final ds2 ds2Var, final rr2 rr2Var) {
        return rb3.n(rb3.n(this.f14072d.a(), new xa3() { // from class: com.google.android.gms.internal.ads.u72
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return x72.this.e(rr2Var, (rr1) obj);
            }
        }, this.f14070b), new xa3() { // from class: com.google.android.gms.internal.ads.v72
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return x72.this.f(ds2Var, rr2Var, (JSONArray) obj);
            }
        }, this.f14070b);
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var = rr2Var.f11397t;
        return (wr2Var == null || wr2Var.f13928c == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ mm1 c(cc3 cc3Var, cc3 cc3Var2, ds2 ds2Var, rr2 rr2Var, JSONObject jSONObject) {
        rm1 rm1Var = (rm1) cc3Var.get();
        rr1 rr1Var = (rr1) cc3Var2.get();
        sm1 c7 = this.f14069a.c(new l71(ds2Var, rr2Var, null), new dn1(rm1Var), new tl1(jSONObject, rr1Var));
        c7.j().b();
        c7.k().a(rr1Var);
        c7.i().a(rm1Var.Z());
        c7.l().a(this.f14073e);
        return c7.h();
    }

    final /* synthetic */ cc3 d(rr1 rr1Var, JSONObject jSONObject) {
        this.f14072d.b(rb3.i(rr1Var));
        if (jSONObject.optBoolean("success")) {
            return rb3.i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new qb0("process json failed");
    }

    final /* synthetic */ cc3 e(rr2 rr2Var, final rr1 rr1Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) sw.c().b(m10.f8263n6)).booleanValue() && v3.l.k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", rr2Var.f11397t.f13928c);
        jSONObject2.put("sdk_params", jSONObject);
        return rb3.n(rr1Var.d("google.afma.nativeAds.preProcessJson", jSONObject2), new xa3() { // from class: com.google.android.gms.internal.ads.t72
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return x72.this.d(rr1Var, (JSONObject) obj);
            }
        }, this.f14070b);
    }

    final /* synthetic */ cc3 f(ds2 ds2Var, rr2 rr2Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return rb3.h(new fz1(3));
        }
        int i7 = 0;
        if (ds2Var.f4312a.f2953a.f7625k <= 1) {
            return rb3.m(g(ds2Var, rr2Var, jSONArray.getJSONObject(0)), new e43() { // from class: com.google.android.gms.internal.ads.s72
                @Override // com.google.android.gms.internal.ads.e43
                public final Object apply(Object obj) {
                    return Collections.singletonList(rb3.i((mm1) obj));
                }
            }, this.f14070b);
        }
        int length = jSONArray.length();
        this.f14072d.c(Math.min(length, ds2Var.f4312a.f2953a.f7625k));
        ArrayList arrayList = new ArrayList(ds2Var.f4312a.f2953a.f7625k);
        while (i7 < ds2Var.f4312a.f2953a.f7625k) {
            arrayList.add(i7 < length ? g(ds2Var, rr2Var, jSONArray.getJSONObject(i7)) : rb3.h(new fz1(3)));
            i7++;
        }
        return rb3.i(arrayList);
    }
}
