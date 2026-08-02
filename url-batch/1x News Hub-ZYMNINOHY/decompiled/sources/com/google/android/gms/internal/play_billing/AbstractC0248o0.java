package com.google.android.gms.internal.play_billing;

import a0.C0130a;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import n0.C1147i;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0248o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2894a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            g(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            f(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        g(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, long j3) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j3);
    }

    public static Bundle c(boolean z, boolean z2, boolean z3, String str, long j3) {
        Bundle bundle = new Bundle();
        b(bundle, str, j3);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z3) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static C1147i d(Intent intent, String str) {
        if (intent != null) {
            C0130a a3 = C1147i.a();
            a3.f1920b = a(intent.getExtras(), str);
            a3.f1919a = e(intent.getExtras(), str);
            return a3.a();
        }
        g("BillingHelper", "Got null intent!");
        C0130a a4 = C1147i.a();
        a4.f1920b = 6;
        a4.f1919a = "An internal error occurred.";
        return a4.a();
    }

    public static String e(Bundle bundle, String str) {
        if (bundle == null) {
            g(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            f(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        g(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i3 = 40000;
            while (!str2.isEmpty() && i3 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i3));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i3 -= min;
            }
        }
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle i(C1147i c1147i, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c1147i.f10092a);
        bundle.putString("DEBUG_MESSAGE", c1147i.f10093b);
        bundle.putInt("LOG_REASON", i3 - 1);
        return bundle;
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            f("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e3) {
            g("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e3.toString()));
            return null;
        }
    }
}
