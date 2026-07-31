package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class oa1 extends yy {

    /* renamed from: f, reason: collision with root package name */
    private final String f9574f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9575g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9576h;

    /* renamed from: i, reason: collision with root package name */
    private final List<tv> f9577i;

    /* renamed from: j, reason: collision with root package name */
    private final long f9578j;

    /* renamed from: k, reason: collision with root package name */
    private final String f9579k;

    public oa1(rr2 rr2Var, String str, f52 f52Var, ur2 ur2Var) {
        String str2 = null;
        this.f9575g = rr2Var == null ? null : rr2Var.Y;
        this.f9576h = ur2Var == null ? null : ur2Var.f12947b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str2 = rr2Var.f11400w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f9574f = str2 != null ? str2 : str;
        this.f9577i = f52Var.b();
        this.f9578j = y2.t.a().b() / 1000;
        this.f9579k = (!((Boolean) sw.c().b(m10.R6)).booleanValue() || ur2Var == null || TextUtils.isEmpty(ur2Var.f12953h)) ? "" : ur2Var.f12953h;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final String b() {
        return this.f9574f;
    }

    public final long c() {
        return this.f9578j;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final String d() {
        return this.f9575g;
    }

    @Override // com.google.android.gms.internal.ads.zy
    public final List<tv> e() {
        if (((Boolean) sw.c().b(m10.f8191e6)).booleanValue()) {
            return this.f9577i;
        }
        return null;
    }

    public final String f() {
        return this.f9576h;
    }

    public final String g() {
        return this.f9579k;
    }
}
