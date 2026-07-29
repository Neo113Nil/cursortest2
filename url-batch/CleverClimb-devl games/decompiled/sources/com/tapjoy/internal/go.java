package com.tapjoy.internal;

import android.app.Activity;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class go {
    public static void a(Activity activity) {
        ha a2 = ha.a();
        if (gx.a(activity, "onActivityStart: The given activity was null")) {
            gx.c("onActivityStart");
            b.a(activity.getApplication());
            b.b(activity);
            if (a2.c("onActivityStart") && a2.e()) {
                gu.b(activity);
            }
        }
    }

    public static void b(Activity activity) {
        ha a2 = ha.a();
        if (gx.a(activity, "onActivityStop: The given activity was null")) {
            gx.c("onActivityStop");
            b.c(activity);
            if (!a2.c("onActivityStop") || b.b()) {
                return;
            }
            a2.h.a();
        }
    }

    public static void a() {
        ha a2 = ha.a();
        if (a2.c("startSession") && a2.e()) {
            gu.b(null);
        }
    }

    public static void b() {
        ha a2 = ha.a();
        if (a2.c("endSession")) {
            a2.h.a();
        }
    }

    public static void a(String str, String str2, String str3, String str4, long j) {
        ha a2 = ha.a();
        if (a2.d("trackEvent") && gx.a(str2, "trackEvent: name was null")) {
            LinkedHashMap linkedHashMap = null;
            if (j != 0) {
                linkedHashMap = jv.b();
                linkedHashMap.put("value", Long.valueOf(j));
            }
            a2.g.a(str, str2, str3, str4, linkedHashMap);
            gx.a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, linkedHashMap);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        ha a2 = ha.a();
        if (a2.d("trackEvent") && gx.a(str2, "trackEvent: name was null")) {
            LinkedHashMap b2 = jv.b();
            if (str5 != null && j != 0) {
                b2.put(str5, Long.valueOf(j));
            }
            if (str6 != null && j2 != 0) {
                b2.put(str6, Long.valueOf(j2));
            }
            if (str7 != null && j3 != 0) {
                b2.put(str7, Long.valueOf(j3));
            }
            if (b2.isEmpty()) {
                b2 = null;
            }
            a2.g.a(str, str2, str3, str4, b2);
            gx.a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, b2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        ha a2 = ha.a();
        if (a2.c("trackPurchase")) {
            try {
                e eVar = new e(str);
                String b2 = gv.b(eVar.f7977a);
                String b3 = gv.b(eVar.f);
                if (b2 == null || b3 == null) {
                    gx.a("trackPurchase", "skuDetails", "insufficient fields");
                    return;
                }
                if (b3.length() != 3) {
                    gx.a("trackPurchase", "skuDetails", "invalid currency code");
                    return;
                }
                String b4 = gv.b(str2);
                String b5 = gv.b(str3);
                if (b4 != null) {
                    if (b5 != null) {
                        try {
                            f fVar = new f(b4);
                            if (jr.c(fVar.f8057a) || jr.c(fVar.f8058b) || jr.c(fVar.f8059c) || fVar.f8060d == 0) {
                                gx.a("trackPurchase", "purchaseData", "insufficient fields");
                            }
                        } catch (IOException unused) {
                            gx.a("trackPurchase", "purchaseData", "invalid PurchaseData JSON");
                        }
                    } else {
                        gx.a("trackPurchase", "dataSignature", "is null, skipping purchase validation");
                    }
                } else if (b5 != null) {
                    gx.a("trackPurchase", "purchaseData", "is null. skipping purchase validation");
                }
                String upperCase = b3.toUpperCase(Locale.US);
                String b6 = gv.b(str4);
                gz gzVar = a2.g;
                double d2 = eVar.g;
                Double.isNaN(d2);
                gzVar.a(b2, upperCase, d2 / 1000000.0d, b4, b5, b6);
                if (b4 != null && b5 != null) {
                    gx.a("trackPurchase with purchaseData called");
                } else {
                    gx.a("trackPurchase without purchaseData called");
                }
            } catch (IOException unused2) {
                gx.a("trackPurchase", "skuDetails", "invalid SkuDetails JSON");
            }
        }
    }
}
