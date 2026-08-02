package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public abstract class v6 {
    public static void a(String str, boolean z, String str2, String str3) {
        AdCallbacksConfig a3;
        try {
            AnalyticsConfig h2 = MetaData.E().h();
            if (h2 != null && (a3 = h2.a()) != null) {
                if ((a3.a() || z) && a3.a(str)) {
                    d9 d9Var = new d9(e9.f6838d);
                    d9Var.f6792d = "adCallback";
                    d9Var.f6797i = str;
                    d9Var.f6795g = str2;
                    d9Var.f6793e = str3;
                    d9Var.a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
