package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ww2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, String> f13956a;

    /* renamed from: b, reason: collision with root package name */
    private final dx2 f13957b;

    private ww2() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f13956a = hashMap;
        this.f13957b = new dx2(y2.t.a());
        hashMap.put("new_csi", "1");
    }

    public static ww2 b(String str) {
        ww2 ww2Var = new ww2();
        ww2Var.f13956a.put("action", str);
        return ww2Var;
    }

    public static ww2 c(String str) {
        ww2 ww2Var = new ww2();
        ww2Var.f13956a.put("request_id", str);
        return ww2Var;
    }

    public final ww2 a(String str, String str2) {
        this.f13956a.put(str, str2);
        return this;
    }

    public final ww2 d(String str) {
        this.f13957b.b(str);
        return this;
    }

    public final ww2 e(String str, String str2) {
        this.f13957b.c(str, str2);
        return this;
    }

    public final ww2 f(rr2 rr2Var) {
        this.f13956a.put("aai", rr2Var.f11401x);
        return this;
    }

    public final ww2 g(ur2 ur2Var) {
        if (!TextUtils.isEmpty(ur2Var.f12947b)) {
            this.f13956a.put("gqi", ur2Var.f12947b);
        }
        return this;
    }

    public final ww2 h(ds2 ds2Var, xn0 xn0Var) {
        HashMap<String, String> hashMap;
        String str;
        cs2 cs2Var = ds2Var.f4313b;
        g(cs2Var.f3934b);
        if (!cs2Var.f3933a.isEmpty()) {
            switch (cs2Var.f3933a.get(0).f11369b) {
                case 1:
                    hashMap = this.f13956a;
                    str = "banner";
                    hashMap.put("ad_format", str);
                    break;
                case 2:
                    hashMap = this.f13956a;
                    str = "interstitial";
                    hashMap.put("ad_format", str);
                    break;
                case 3:
                    hashMap = this.f13956a;
                    str = "native_express";
                    hashMap.put("ad_format", str);
                    break;
                case 4:
                    hashMap = this.f13956a;
                    str = "native_advanced";
                    hashMap.put("ad_format", str);
                    break;
                case 5:
                    hashMap = this.f13956a;
                    str = "rewarded";
                    hashMap.put("ad_format", str);
                    break;
                case 6:
                    this.f13956a.put("ad_format", "app_open_ad");
                    if (xn0Var != null) {
                        this.f13956a.put("as", true != xn0Var.j() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    hashMap = this.f13956a;
                    str = "unknown";
                    hashMap.put("ad_format", str);
                    break;
            }
        }
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            boolean d7 = g3.o.d(ds2Var);
            this.f13956a.put("scar", String.valueOf(d7));
            if (d7) {
                String b7 = g3.o.b(ds2Var);
                if (!TextUtils.isEmpty(b7)) {
                    this.f13956a.put("ragent", b7);
                }
                String a7 = g3.o.a(ds2Var);
                if (!TextUtils.isEmpty(a7)) {
                    this.f13956a.put("rtype", a7);
                }
            }
        }
        return this;
    }

    public final ww2 i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f13956a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f13956a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map<String, String> j() {
        HashMap hashMap = new HashMap(this.f13956a);
        for (cx2 cx2Var : this.f13957b.a()) {
            hashMap.put(cx2Var.f3978a, cx2Var.f3979b);
        }
        return hashMap;
    }
}
