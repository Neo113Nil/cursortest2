package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class gx2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5923a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5924b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5925c;

    public gx2(Context context, po0 po0Var) {
        this.f5923a = context;
        this.f5924b = context.getPackageName();
        this.f5925c = po0Var.f10301f;
    }

    public final void a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        y2.t.q();
        map.put("device", a3.g2.f0());
        map.put("app", this.f5924b);
        y2.t.q();
        map.put("is_lite_sdk", true != a3.g2.i(this.f5923a) ? "0" : "1");
        List<String> b7 = m10.b();
        if (((Boolean) sw.c().b(m10.f8254m5)).booleanValue()) {
            b7.addAll(y2.t.p().h().e().d());
        }
        map.put("e", TextUtils.join(",", b7));
        map.put("sdkVersion", this.f5925c);
    }
}
