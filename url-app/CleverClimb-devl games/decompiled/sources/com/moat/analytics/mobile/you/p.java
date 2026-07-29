package com.moat.analytics.mobile.you;

import android.util.Log;
import android.view.View;
import com.mopub.mobileads.VastExtensionXmlManager;

/* loaded from: classes2.dex */
class p {
    p() {
    }

    static String a(View view) {
        if (view == null) {
            return "null";
        }
        return view.getClass().getSimpleName() + "@" + view.hashCode();
    }

    private static String a(String str) {
        return VastExtensionXmlManager.MOAT + str;
    }

    static void a(int i, String str, Object obj, String str2) {
        String a2;
        String format;
        if (w.a().f7539b) {
            if (obj == null) {
                a2 = a(str);
                format = String.format("message = %s", str2);
            } else {
                a2 = a(str);
                format = String.format("id = %s, message = %s", Integer.valueOf(obj.hashCode()), str2);
            }
            Log.println(i, a2, format);
        }
    }

    static void a(String str, int i, String str2, Object obj, String str3) {
        a(i, str2, obj, str3);
        a(str, str3);
    }

    static void a(String str, Object obj, String str2, Throwable th) {
        if (w.a().f7539b) {
            Log.e(a(str), String.format("id = %s, message = %s", Integer.valueOf(obj.hashCode()), str2), th);
        }
    }

    static void a(String str, String str2) {
        if (w.a().f7539b || !((k) MoatAnalytics.getInstance()).f7499a) {
            return;
        }
        Log.println(str.equals("[ERROR] ") ? 6 : 2, "MoatAnalytics", str + str2);
    }

    static void b(int i, String str, Object obj, String str2) {
        if (w.a().f7540c) {
            String a2 = a(str);
            Object[] objArr = new Object[2];
            objArr[0] = obj == null ? "null" : Integer.valueOf(obj.hashCode());
            objArr[1] = str2;
            Log.println(i, a2, String.format("id = %s, message = %s", objArr));
        }
    }
}
