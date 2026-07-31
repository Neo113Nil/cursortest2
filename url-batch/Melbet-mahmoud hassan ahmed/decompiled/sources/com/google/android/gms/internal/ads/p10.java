package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class p10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9988a = w20.f13665b.e();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f9989b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9990c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9991d;

    public p10(Context context, String str) {
        this.f9990c = context;
        this.f9991d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9989b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        y2.t.q();
        linkedHashMap.put("device", a3.g2.f0());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        y2.t.q();
        linkedHashMap.put("is_lite_sdk", true != a3.g2.i(context) ? "0" : "1");
        Future<aj0> b7 = y2.t.n().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(b7.get().f2838k));
            linkedHashMap.put("network_fine", Integer.toString(b7.get().f2839l));
        } catch (Exception e7) {
            y2.t.p().s(e7, "CsiConfiguration.CsiConfiguration");
        }
    }

    final Context a() {
        return this.f9990c;
    }

    final String b() {
        return this.f9991d;
    }

    final String c() {
        return this.f9988a;
    }

    final Map<String, String> d() {
        return this.f9989b;
    }
}
