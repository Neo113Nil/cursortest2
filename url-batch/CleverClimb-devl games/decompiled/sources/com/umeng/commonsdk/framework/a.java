package com.umeng.commonsdk.framework;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import org.json.JSONObject;

/* compiled from: UMEnvelopeBuildImpl.java */
/* loaded from: classes2.dex */
public class a {
    public static long a(Context context) {
        if (context == null) {
            return 0L;
        }
        return b.i(context.getApplicationContext());
    }

    public static boolean a(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        boolean z = false;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            boolean b2 = b.b(applicationContext);
            int c2 = b.c(applicationContext);
            if (b2 && !b.a(applicationContext, uMBusinessType)) {
                z = true;
            }
            if (b2 && c2 > 0) {
                c.b();
            }
        }
        return z;
    }

    public static JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        com.umeng.commonsdk.statistics.common.d.b("--->>> buildEnvelopeFile Enter.");
        return new com.umeng.commonsdk.statistics.b().a(context.getApplicationContext(), jSONObject, jSONObject2);
    }

    public static String a(Context context, String str, String str2) {
        return context == null ? str2 : ImprintHandler.getImprintService(context.getApplicationContext()).b().a(str, str2);
    }

    public static long b(Context context) {
        if (context == null) {
            return 0L;
        }
        return com.umeng.commonsdk.statistics.b.a(context.getApplicationContext());
    }
}
