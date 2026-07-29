package com.ironsource.b.g;

import android.util.Log;
import com.ironsource.b.d.c;
import com.ironsource.b.d.d;
import com.ironsource.b.d.g;
import org.json.JSONObject;

/* compiled from: Server.java */
/* loaded from: classes2.dex */
public class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, boolean z, int i) {
        try {
            new JSONObject(a.a(c.a(str, z, i)));
            d.c().a(c.a.NETWORK, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            sb.append(", hit:");
            sb.append(z);
            sb.append(")");
            d.c().a(c.a.NETWORK, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }

    public static void a(final String str, final boolean z, final int i) {
        Thread thread = new Thread(new Runnable() { // from class: com.ironsource.b.g.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.c(str, z, i);
            }
        }, "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new g());
        thread.start();
    }
}
