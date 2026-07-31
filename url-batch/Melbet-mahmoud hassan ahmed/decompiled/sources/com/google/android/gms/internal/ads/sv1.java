package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes.dex */
public final class sv1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f11979a;

    /* renamed from: b, reason: collision with root package name */
    private final xn0 f11980b;

    public sv1(cw1 cw1Var, xn0 xn0Var) {
        this.f11979a = new ConcurrentHashMap<>(cw1Var.f4785b);
        this.f11980b = xn0Var;
    }

    public final Map<String, String> a() {
        return this.f11979a;
    }

    public final void b(ds2 ds2Var) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str;
        if (ds2Var.f4313b.f3933a.size() > 0) {
            switch (ds2Var.f4313b.f3933a.get(0).f11369b) {
                case 1:
                    concurrentHashMap = this.f11979a;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = this.f11979a;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = this.f11979a;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = this.f11979a;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = this.f11979a;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    this.f11979a.put("ad_format", "app_open_ad");
                    this.f11979a.put("as", true != this.f11980b.j() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.f11979a;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        if (!TextUtils.isEmpty(ds2Var.f4313b.f3934b.f12947b)) {
            this.f11979a.put("gqi", ds2Var.f4313b.f3934b.f12947b);
        }
        if (((Boolean) sw.c().b(m10.f8302s5)).booleanValue()) {
            boolean d7 = g3.o.d(ds2Var);
            this.f11979a.put("scar", String.valueOf(d7));
            if (d7) {
                String b7 = g3.o.b(ds2Var);
                if (!TextUtils.isEmpty(b7)) {
                    this.f11979a.put("ragent", b7);
                }
                String a7 = g3.o.a(ds2Var);
                if (TextUtils.isEmpty(a7)) {
                    return;
                }
                this.f11979a.put("rtype", a7);
            }
        }
    }

    public final void c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f11979a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f11979a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
