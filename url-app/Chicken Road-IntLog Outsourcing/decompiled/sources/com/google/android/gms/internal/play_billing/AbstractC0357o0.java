package com.google.android.gms.internal.play_billing;

import G0.C0058h;
import G0.C0060j;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0357o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5220a = Runtime.getRuntime().availableProcessors();

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

    public static void b(Bundle bundle, String str, long j2) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j2);
    }

    public static Bundle c(boolean z, boolean z5, boolean z6, String str, long j2) {
        Bundle bundle = new Bundle();
        b(bundle, str, j2);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z5 && z6) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static C0060j d(Intent intent, String str) {
        if (intent != null) {
            C0058h b6 = C0060j.b();
            b6.f854a = a(intent.getExtras(), str);
            b6.f855b = e(intent.getExtras(), str);
            return b6.a();
        }
        g("BillingHelper", "Got null intent!");
        C0058h b7 = C0060j.b();
        b7.f854a = 6;
        b7.f855b = "An internal error occurred.";
        return b7.a();
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
            int i2 = 40000;
            while (!str2.isEmpty() && i2 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i2));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i2 -= min;
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

    public static Bundle i(C0060j c0060j, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c0060j.f862a);
        bundle.putString("DEBUG_MESSAGE", c0060j.f863b);
        bundle.putInt("LOG_REASON", i2 - 1);
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
