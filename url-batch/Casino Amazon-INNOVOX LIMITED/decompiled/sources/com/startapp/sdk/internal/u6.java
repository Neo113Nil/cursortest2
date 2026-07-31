package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class u6 {
    public static void a(String str, boolean z, String str2, String str3) {
        AdCallbacksConfig a2;
        try {
            AnalyticsConfig g = MetaData.A().g();
            if (g != null && (a2 = g.a()) != null) {
                if ((a2.a() || z) && a2.a(str)) {
                    n8 n8Var = new n8(o8.d);
                    n8Var.d = "adCallback";
                    n8Var.i = str;
                    n8Var.g = str2;
                    n8Var.e = str3;
                    n8Var.a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
