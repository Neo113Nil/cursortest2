package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class js {

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16874a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16875b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16876c;

        a(String str, boolean z4, int i4) {
            this.f16874a = str;
            this.f16875b = z4;
            this.f16876c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            js.c(this.f16874a, this.f16875b, this.f16876c);
        }
    }

    public static void b(String str, boolean z4, int i4) {
        Thread thread = new Thread(new a(str, z4, i4), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, boolean z4, int i4) {
        try {
            new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z4, i4)));
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, "callRequestURL(reqUrl:" + str + ", hit:" + z4 + ")", 1);
        } catch (Throwable th) {
            o9.d().a(th);
            StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(", hit:");
            sb.append(z4);
            sb.append(")");
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NETWORK, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }
}
