package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.appsflyer.internal.AFa1dSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.facebook.appevents.iap.InAppPurchaseAutoLogger;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.bolts.CancellationToken;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.Utility;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.google.firebase.messaging.EnhancedIntentService;
import com.majelw.libystne.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class s50 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ s50(u80 u80Var, gm gmVar, ch2 ch2Var, wl wlVar) {
        this.m = 1;
        this.n = u80Var;
        this.o = gmVar;
        this.p = wlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        switch (this.m) {
            case 0:
                CustomTabLoginMethodHandler.onCustomTabComplete$lambda$0((CustomTabLoginMethodHandler) this.n, (LoginClient.Request) this.o, (Bundle) this.p);
                return;
            case 1:
                u80 u80Var = (u80) this.n;
                gm gmVar = (gm) this.o;
                String str = gmVar.a;
                wl wlVar = (wl) this.p;
                u80Var.getClass();
                Logger logger = u80.f;
                try {
                    mz2 a = u80Var.c.a(str);
                    if (a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        u80Var.e.p(new s80(u80Var, gmVar, ((ct) a).a(wlVar), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 2:
                u9 u9Var = (u9) this.n;
                s93 s93Var = (s93) this.o;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.p;
                try {
                    tp0 q = iv1.q(u9Var.m);
                    if (q == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    sp0 sp0Var = (sp0) ((zf0) q.b);
                    synchronized (sp0Var.p) {
                        sp0Var.r = threadPoolExecutor;
                    }
                    ((zf0) q.b).a(new cg0(s93Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    s93Var.K(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                ((EnhancedIntentService) this.n).lambda$processIntent$0((Intent) this.o, (kt2) this.p);
                return;
            case 4:
                InAppPurchaseAutoLogger.startIapLogging$lambda$1((c82) this.n, (InAppPurchaseUtils.BillingClientVersion) this.o, (Context) this.p);
                return;
            case 5:
                String str3 = (String) this.n;
                MainActivity mainActivity = (MainActivity) this.o;
                String str4 = (String) this.p;
                int i = MainActivity.w;
                HttpURLConnection httpURLConnection2 = null;
                try {
                    try {
                        URLConnection openConnection = new URL(str3).openConnection();
                        openConnection.getClass();
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setDoOutput(true);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    String str5 = "user_id=" + mainActivity.n + "&device_token=" + str4 + "&language=" + Locale.getDefault().getLanguage();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        byte[] bytes = str5.getBytes(yt.b);
                        bytes.getClass();
                        outputStream.write(bytes);
                        Unit unit = Unit.a;
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            inputStream.getClass();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(Utility.DEFAULT_STREAM_BUFFER_SIZE, inputStream.available()));
                            bd3.o(inputStream, byteArrayOutputStream);
                            byteArrayOutputStream.toByteArray().getClass();
                            inputStream.close();
                            Log.d("PUSH_SUBSCRIBE", "subscribe code=" + responseCode);
                            httpURLConnection.disconnect();
                            return;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                ll3.y(inputStream, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            ll3.y(outputStream, th5);
                            throw th6;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection2 = httpURLConnection;
                    Log.e("PUSH_SUBSCRIBE", "subscribe error: " + e.getMessage());
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                        return;
                    }
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            case 6:
                NativeAppLoginMethodHandler.processSuccessResponse$lambda$0((NativeAppLoginMethodHandler) this.n, (LoginClient.Request) this.o, (Bundle) this.p);
                return;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                Task.Companion.call$lambda$2((CancellationToken) this.n, (TaskCompletionSource) this.o, (Callable) this.p);
                return;
            case 8:
                ((AFa1dSDK) this.n).AFInAppEventParameterName((Context) this.o, (Intent) this.p);
                return;
            default:
                AFc1wSDK.valueOf((AFc1wSDK) this.n, (Throwable) this.o, (String) this.p);
                return;
        }
    }

    public /* synthetic */ s50(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }
}
