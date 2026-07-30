package com.feathherdashh.dashgame.startup;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.feathherdashh.dashgame.MainActivity;
import com.feathherdashh.dashgame.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.ca0;
import defpackage.cn;
import defpackage.d;
import defpackage.dn;
import defpackage.dq0;
import defpackage.eq0;
import defpackage.fq;
import defpackage.gq0;
import defpackage.i31;
import defpackage.i8;
import defpackage.j31;
import defpackage.k31;
import defpackage.kf1;
import defpackage.la0;
import defpackage.ls;
import defpackage.mq0;
import defpackage.nq;
import defpackage.o21;
import defpackage.op;
import defpackage.s9;
import defpackage.uq1;
import defpackage.zh;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class FeatherFirebaseMessagingService extends FirebaseMessagingService {
    public static final cn d;
    public static final List e;

    static {
        kf1 c = ca0.c();
        nq nqVar = ls.a;
        d = la0.f(e.c(c, fq.g));
        e = zh.e("image", "image_url", "imageUrl", "picture", "big_picture", "bigPicture", "notification_image", "gcm.notification.image");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r3 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMessageReceived(o21 o21Var) {
        String str;
        String str2;
        String str3;
        j31 j31Var;
        IconCompat iconCompat;
        Object j31Var2;
        Object j31Var3;
        o21Var.getClass();
        String str4 = (String) ((s9) o21Var.a()).get("url");
        if (str4 == null || StringsKt.n(str4)) {
            str4 = null;
        }
        i8 b = o21Var.b();
        if (b != null) {
            String str5 = (String) b.h;
            Uri parse = str5 != null ? Uri.parse(str5) : null;
            if (parse != null) {
                str = parse.toString();
            }
        }
        Map a = o21Var.a();
        a.getClass();
        Iterator it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            String str6 = (String) ((s9) a).get((String) it.next());
            if (str6 == null || StringsKt.n(str6)) {
                str6 = null;
            }
            if (str6 != null) {
                str = str6;
                break;
            }
        }
        if (str4 != null) {
            StringsKt.n(str4);
        }
        if (str != null) {
            StringsKt.n(str);
        }
        Objects.toString(((s9) o21Var.a()).keySet());
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        if (str4 != null && !StringsKt.n(str4)) {
            intent.putExtra("com.feathherdashh.dashgame.extra.PUSH_URL", str4);
            intent.putExtra("url", str4);
        }
        PendingIntent activity = PendingIntent.getActivity(this, str4 != null ? str4.hashCode() : (int) System.currentTimeMillis(), intent, 201326592);
        NotificationChannel notificationChannel = new NotificationChannel("feather_dash_rewards", "Feather Dash rewards", 3);
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        i8 b2 = o21Var.b();
        if ((b2 == null || (str2 = (String) b2.e) == null) && (str2 = (String) ((s9) o21Var.a()).get("title")) == null) {
            str2 = getString(R.string.app_name);
            str2.getClass();
        }
        i8 b3 = o21Var.b();
        if ((b3 == null || (str3 = (String) b3.g) == null) && (str3 = (String) ((s9) o21Var.a()).get("body")) == null) {
            str3 = "Open your feather bonus";
        }
        gq0 gq0Var = new gq0(this, "feather_dash_rewards");
        gq0Var.s.icon = R.drawable.ic_notification_feather;
        try {
            i31 i31Var = k31.d;
            Drawable drawable = getDrawable(R.drawable.ic_notification_flame_large);
            if (drawable == null) {
                j31Var = null;
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth < 1) {
                    intrinsicWidth = 1;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight < 1) {
                    intrinsicHeight = 1;
                }
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                j31Var = createBitmap;
            }
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        boolean z = j31Var instanceof j31;
        Object obj = j31Var;
        if (z) {
            obj = null;
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            iconCompat = new IconCompat(1);
            iconCompat.b = bitmap;
        }
        gq0Var.h = iconCompat;
        gq0Var.o = Color.rgb(255, 0, 0);
        gq0Var.e = gq0.b(str2);
        gq0Var.f = gq0.b(str3);
        gq0Var.g = activity;
        gq0Var.c(true);
        gq0Var.j = 0;
        if (str != null) {
            if (StringsKt.n(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    URLConnection openConnection = new URL(str).openConnection();
                    openConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        j31Var3 = BitmapFactory.decodeStream(inputStream);
                        op.u(inputStream, null);
                    } finally {
                    }
                } catch (Throwable th2) {
                    i31 i31Var3 = k31.d;
                    j31Var3 = new j31(th2);
                }
                Throwable a2 = k31.a(j31Var3);
                if (a2 != null) {
                    a2.getMessage();
                }
                r2 = (Bitmap) (j31Var3 instanceof j31 ? null : j31Var3);
            }
        }
        if (r2 != null) {
            dq0 dq0Var = new dq0();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = r2;
            dq0Var.e = iconCompat2;
            dq0Var.b = gq0.b(str2);
            dq0Var.c = gq0.b(str3);
            dq0Var.d = true;
            gq0Var.d(dq0Var);
        } else if (!StringsKt.n(str3)) {
            eq0 eq0Var = new eq0();
            eq0Var.e = gq0.b(str3);
            gq0Var.d(eq0Var);
        }
        Notification a3 = gq0Var.a();
        a3.getClass();
        try {
            new mq0(this).a(str4 != null ? str4.hashCode() : (int) System.currentTimeMillis(), a3);
            j31Var2 = Unit.a;
        } catch (Throwable th3) {
            i31 i31Var4 = k31.d;
            j31Var2 = new j31(th3);
        }
        Throwable a4 = k31.a(j31Var2);
        if (a4 != null) {
            a4.getMessage();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        getApplicationContext().getSharedPreferences("feather_firebase_push_token", 0).edit().putString("push_token", str).apply();
        uq1.N(d, null, new d(this, str, (dn) null, 9), 3);
    }
}
