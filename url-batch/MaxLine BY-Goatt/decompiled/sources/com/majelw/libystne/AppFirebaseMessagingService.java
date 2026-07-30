package com.majelw.libystne;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.at1;
import defpackage.bt1;
import defpackage.ct1;
import defpackage.ft1;
import defpackage.gt1;
import defpackage.ih1;
import defpackage.ll3;
import defpackage.o70;
import defpackage.up2;
import defpackage.zs1;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.text.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bc, code lost:
    
        if (r10 == null) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        int i;
        Bitmap bitmap;
        int currentTimeMillis;
        gt1 gt1Var;
        Notification a;
        Bundle bundle;
        Integer f;
        HttpURLConnection httpURLConnection;
        int responseCode;
        remoteMessage.getClass();
        super.onMessageReceived(remoteMessage);
        Map<String, String> data = remoteMessage.getData();
        data.getClass();
        String str = data.get("log_url");
        if (str == null || str.length() == 0) {
            Log.d("FCM_SERVICE", "Push delivered without log_url messageId=" + remoteMessage.getMessageId());
        } else {
            Log.d("FCM_SERVICE", "Push delivered log_url=" + str + " messageId=" + remoteMessage.getMessageId());
            new Thread(new ih1(0, str, "delivered")).start();
        }
        String str2 = data.get("title");
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        String str3 = data.get(SDKConstants.PARAM_A2U_BODY);
        if (str3 == null) {
            str3 = BuildConfig.FLAVOR;
        }
        if (str2.length() == 0 && str3.length() == 0) {
            Log.d("FCM_SERVICE", "Skip notification without title and body");
            return;
        }
        if (!new gt1(this).a.areNotificationsEnabled() || ((i = Build.VERSION.SDK_INT) >= 33 && o70.s(this, "android.permission.POST_NOTIFICATIONS") != 0)) {
            Log.d("FCM_SERVICE", "Skip notification because notifications are disabled");
            return;
        }
        if (i >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager.getNotificationChannel("push") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("push", getString(R.string.app_name), 4));
            }
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        String str4 = data.get("url");
        if (str4 != null) {
            intent.putExtra("url", str4);
        }
        String str5 = data.get("log_url");
        if (str5 != null) {
            intent.putExtra("log_url", str5);
        }
        String str6 = data.get("log_id");
        if (str6 != null) {
            intent.putExtra("log_id", str6);
        }
        String str7 = data.get("log_id");
        PendingIntent activity = PendingIntent.getActivity(this, str7 != null ? str7.hashCode() : (int) System.currentTimeMillis(), intent, 201326592);
        String str8 = data.get("image");
        HttpURLConnection httpURLConnection2 = null;
        if (str8 != null) {
            ?? y = up2.y(str8);
            try {
                if (y == 0) {
                    try {
                        URLConnection openConnection = new URL(str8).openConnection();
                        openConnection.getClass();
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.setReadTimeout(5000);
                        httpURLConnection.setDoInput(true);
                        try {
                            responseCode = httpURLConnection.getResponseCode();
                        } catch (Exception e) {
                            e = e;
                            Log.e("FCM_SERVICE", "Image load error: " + e.getMessage(), e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        httpURLConnection = null;
                    } catch (Throwable th) {
                        th = th;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        throw th;
                    }
                    if (200 <= responseCode && responseCode < 300) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            bitmap = BitmapFactory.decodeStream(inputStream);
                            ll3.y(inputStream, null);
                            httpURLConnection.disconnect();
                            bt1 bt1Var = new bt1(this, "push");
                            bt1Var.s.icon = R.mipmap.ic_launcher;
                            bt1Var.e = bt1.b(str2);
                            bt1Var.f = bt1.b(str3);
                            bt1Var.g = activity;
                            bt1Var.c(true);
                            bt1Var.j = 1;
                            if (bitmap == null) {
                                bt1Var.d(bitmap);
                                zs1 zs1Var = new zs1();
                                IconCompat iconCompat = new IconCompat(1);
                                iconCompat.b = bitmap;
                                zs1Var.n = iconCompat;
                                zs1Var.o = null;
                                zs1Var.p = true;
                                bt1Var.e(zs1Var);
                            } else {
                                at1 at1Var = new at1();
                                at1Var.n = bt1.b(str3);
                                bt1Var.e(at1Var);
                            }
                            String str9 = data.get("log_id");
                            currentTimeMillis = (str9 != null || (f = b.f(str9)) == null) ? (int) System.currentTimeMillis() : f.intValue();
                            gt1Var = new gt1(this);
                            a = bt1Var.a();
                            bundle = a.extras;
                            if (bundle != null || !bundle.getBoolean("android.support.useSideChannel")) {
                                gt1Var.a.notify(null, currentTimeMillis, a);
                            }
                            ct1 ct1Var = new ct1(getPackageName(), currentTimeMillis, a);
                            synchronized (gt1.e) {
                                try {
                                    if (gt1.f == null) {
                                        gt1.f = new ft1(getApplicationContext());
                                    }
                                    gt1.f.n.obtainMessage(0, ct1Var).sendToTarget();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            gt1Var.a.cancel(null, currentTimeMillis);
                            return;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                ll3.y(inputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    Log.d("FCM_SERVICE", "Image load failed code=" + httpURLConnection.getResponseCode() + " url=" + str8);
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection2 = y;
            }
        }
        bitmap = null;
        bt1 bt1Var2 = new bt1(this, "push");
        bt1Var2.s.icon = R.mipmap.ic_launcher;
        bt1Var2.e = bt1.b(str2);
        bt1Var2.f = bt1.b(str3);
        bt1Var2.g = activity;
        bt1Var2.c(true);
        bt1Var2.j = 1;
        if (bitmap == null) {
        }
        String str92 = data.get("log_id");
        if (str92 != null) {
        }
        gt1Var = new gt1(this);
        a = bt1Var2.a();
        bundle = a.extras;
        if (bundle != null) {
        }
        gt1Var.a.notify(null, currentTimeMillis, a);
    }
}
