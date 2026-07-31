package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class iy1 implements ya1, td1, pc1 {

    /* renamed from: f, reason: collision with root package name */
    private final uy1 f6851f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6852g;

    /* renamed from: h, reason: collision with root package name */
    private int f6853h = 0;

    /* renamed from: i, reason: collision with root package name */
    private hy1 f6854i = hy1.AD_REQUESTED;

    /* renamed from: j, reason: collision with root package name */
    private oa1 f6855j;

    /* renamed from: k, reason: collision with root package name */
    private cv f6856k;

    iy1(uy1 uy1Var, ks2 ks2Var) {
        this.f6851f = uy1Var;
        this.f6852g = ks2Var.f7620f;
    }

    private static JSONObject c(cv cvVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", cvVar.f3956h);
        jSONObject.put("errorCode", cvVar.f3954f);
        jSONObject.put("errorDescription", cvVar.f3955g);
        cv cvVar2 = cvVar.f3957i;
        jSONObject.put("underlyingError", cvVar2 == null ? null : c(cvVar2));
        return jSONObject;
    }

    private static JSONObject e(oa1 oa1Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", oa1Var.b());
        jSONObject.put("responseSecsSinceEpoch", oa1Var.c());
        jSONObject.put("responseId", oa1Var.d());
        if (((Boolean) sw.c().b(m10.R6)).booleanValue()) {
            String g7 = oa1Var.g();
            if (!TextUtils.isEmpty(g7)) {
                String valueOf = String.valueOf(g7);
                io0.b(valueOf.length() != 0 ? "Bidding data: ".concat(valueOf) : new String("Bidding data: "));
                jSONObject.put("biddingData", new JSONObject(g7));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<tv> e7 = oa1Var.e();
        if (e7 != null) {
            for (tv tvVar : e7) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", tvVar.f12383f);
                jSONObject2.put("latencyMillis", tvVar.f12384g);
                cv cvVar = tvVar.f12385h;
                jSONObject2.put("error", cvVar == null ? null : c(cvVar));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.pc1
    public final void X(v61 v61Var) {
        this.f6855j = v61Var.c();
        this.f6854i = hy1.AD_LOADED;
    }

    public final JSONObject a() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f6854i);
        jSONObject.put("format", rr2.a(this.f6853h));
        oa1 oa1Var = this.f6855j;
        JSONObject jSONObject2 = null;
        if (oa1Var != null) {
            jSONObject2 = e(oa1Var);
        } else {
            cv cvVar = this.f6856k;
            if (cvVar != null && (iBinder = cvVar.f3958j) != null) {
                oa1 oa1Var2 = (oa1) iBinder;
                jSONObject2 = e(oa1Var2);
                List<tv> e7 = oa1Var2.e();
                if (e7 != null && e7.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f6856k));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final boolean b() {
        return this.f6854i != hy1.AD_REQUESTED;
    }

    @Override // com.google.android.gms.internal.ads.ya1
    public final void d(cv cvVar) {
        this.f6854i = hy1.AD_LOAD_FAILED;
        this.f6856k = cvVar;
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
        this.f6851f.e(this.f6852g, this);
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(ds2 ds2Var) {
        if (ds2Var.f4313b.f3933a.isEmpty()) {
            return;
        }
        this.f6853h = ds2Var.f4313b.f3933a.get(0).f11369b;
    }
}
