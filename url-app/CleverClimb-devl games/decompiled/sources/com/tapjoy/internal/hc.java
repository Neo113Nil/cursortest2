package com.tapjoy.internal;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyReceiver;
import com.tapjoy.internal.jj;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class hc extends p {

    /* renamed from: c, reason: collision with root package name */
    private static hc f8258c;

    public static synchronized hc b(Context context) {
        hc hcVar;
        synchronized (hc.class) {
            if (f8258c == null) {
                f8258c = new hc(context);
            }
            hcVar = f8258c;
        }
        return hcVar;
    }

    private hc(Context context) {
        super(context, new r() { // from class: com.tapjoy.internal.hc.1
            @Override // com.tapjoy.internal.r
            public final String a(Context context2) {
                return hk.a(context2).f8287b.getString("gcm.senderIds", "");
            }

            @Override // com.tapjoy.internal.r
            public final void a(Context context2, String str) {
                n.a(hk.a(context2).f8287b, "gcm.senderIds", str);
            }

            @Override // com.tapjoy.internal.r
            public final String b(Context context2) {
                return hk.a(context2).f8287b.getString("gcm.regId", "");
            }

            @Override // com.tapjoy.internal.r
            public final void b(Context context2, String str) {
                n.a(hk.a(context2).f8287b, "gcm.regId", str);
            }

            @Override // com.tapjoy.internal.r
            public final boolean c(Context context2) {
                return hk.a(context2).f8287b.getBoolean("gcm.stale", true);
            }

            @Override // com.tapjoy.internal.r
            public final void a(Context context2, boolean z) {
                n.a(hk.a(context2).f8287b, "gcm.stale", z);
            }

            @Override // com.tapjoy.internal.r
            public final int d(Context context2) {
                return hk.a(context2).f8287b.getInt("gcm.appVersion", Integer.MIN_VALUE);
            }

            @Override // com.tapjoy.internal.r
            public final void a(Context context2, int i) {
                n.a(hk.a(context2).f8287b, "gcm.appVersion", i);
            }

            @Override // com.tapjoy.internal.r
            public final boolean e(Context context2) {
                return hk.a(context2).f8287b.getBoolean("gcm.onServer", false);
            }

            @Override // com.tapjoy.internal.r
            public final void b(Context context2, boolean z) {
                hk.a(context2).a(z);
            }

            @Override // com.tapjoy.internal.r
            public final long f(Context context2) {
                return hk.a(context2).f8287b.getLong("gcm.onServerExpirationTime", 0L);
            }

            @Override // com.tapjoy.internal.r
            public final void a(Context context2, long j) {
                SharedPreferences.Editor edit = hk.a(context2).f8287b.edit();
                edit.putLong("gcm.onServerExpirationTime", j);
                edit.apply();
            }

            @Override // com.tapjoy.internal.r
            public final int g(Context context2) {
                return hk.a(context2).f8287b.getInt("gcm.backoff", 0);
            }

            @Override // com.tapjoy.internal.r
            public final void b(Context context2, int i) {
                n.a(hk.a(context2).f8287b, "gcm.backoff", i);
            }
        });
    }

    final void e(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        super.a(this.f8510a);
        super.a(new String[]{str}[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.q
    public final void a(Context context, String str) {
        new Object[1][0] = str;
        ha.a(context).a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.q
    public final void b(String str) {
        new Object[1][0] = str;
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.q
    public final boolean a(Context context, Intent intent) {
        Object[] objArr = {intent, intent.getExtras()};
        String stringExtra = intent.getStringExtra("fiverocks");
        if (stringExtra == null) {
            return false;
        }
        if (hd.a(context).f()) {
            ha.a(context).b(stringExtra);
            return true;
        }
        String stringExtra2 = intent.getStringExtra(TJAdUnitConstants.String.TITLE);
        String stringExtra3 = intent.getStringExtra(TJAdUnitConstants.String.MESSAGE);
        if (stringExtra3 != null) {
            Bundle extras = intent.getExtras();
            Object obj = extras.get("rich");
            Object obj2 = extras.get("sound");
            String string = extras.getString("payload");
            Object obj3 = extras.get("always");
            boolean z = "true".equals(obj3) || Boolean.TRUE.equals(obj3);
            Object obj4 = extras.get("repeatable");
            boolean z2 = "true".equals(obj4) || Boolean.TRUE.equals(obj4);
            String string2 = extras.getString("placement");
            int b2 = b(extras.get("nid"));
            String string3 = extras.getString("channel_id");
            if (z || !ha.a(context).d()) {
                Notification a2 = a(context, stringExtra, jr.a(stringExtra2), stringExtra3, a(obj), a(obj2), string, string2, b2, string3);
                if (ha.a(context).a(context, stringExtra, z2)) {
                    a(context, b2, a2);
                }
            }
        }
        return true;
    }

    public static boolean a(Object obj) {
        return Boolean.TRUE.equals(obj) || "true".equals(obj);
    }

    public static int b(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.q
    public final void a(int i) {
        new Object[1][0] = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.q
    public final boolean c(String str) {
        new Object[1][0] = str;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.q
    public final boolean d(String str) {
        new Object[1][0] = str;
        return false;
    }

    public static void a(Context context, int i, Notification notification) {
        ((NotificationManager) context.getSystemService("notification")).notify(i, notification);
    }

    private static int a(Bundle bundle, String str, Context context) {
        if (bundle != null) {
            Object obj = bundle.get(str);
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                try {
                    if ("drawable".equals(context.getResources().getResourceTypeName(intValue))) {
                        return intValue;
                    }
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (obj != null) {
                Object[] objArr = {str};
                if (gx.f8223a) {
                    x.a(4, "Tapjoy", "meta-data of {} invalid", objArr);
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.tapjoy.internal.jj$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.tapjoy.internal.jj$b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.text.Spanned] */
    @Nullable
    public static Notification a(Context context, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, int i, String str6) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) TapjoyReceiver.class);
        intent.setAction("com.tapjoy.PUSH_CLICK");
        intent.putExtra("com.tapjoy.PUSH_ID", str);
        if (str4 != null) {
            intent.putExtra(Tapjoy.INTENT_EXTRA_PUSH_PAYLOAD, str4);
        }
        if (str5 != null) {
            intent.putExtra("com.tapjoy.PUSH_PLACEMENT", str5);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context.getApplicationContext(), i, intent, Build.VERSION.SDK_INT == 19 ? 268435456 : 134217728);
        String str7 = null;
        if (broadcast == null) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            int length = str2.length();
            CharSequence charSequence = str2;
            if (length == 0) {
                charSequence = packageManager.getApplicationLabel(applicationInfo);
            } else if (z) {
                charSequence = Html.fromHtml(str2);
            }
            if (z) {
                str3 = Html.fromHtml(str3);
            }
            int a2 = a(applicationInfo.metaData, "com.tapjoy.notification.icon", context);
            if (a2 == 0) {
                a2 = applicationInfo.icon != 0 ? applicationInfo.icon : R.drawable.sym_def_app_icon;
            }
            int a3 = a(applicationInfo.metaData, "com.tapjoy.notification.icon.large", context);
            Bitmap decodeResource = a3 != 0 ? BitmapFactory.decodeResource(context.getResources(), a3) : null;
            if (str6 == null && applicationInfo.metaData != null) {
                str6 = applicationInfo.metaData.getString("com.tapjoy.notification.default_channel_id", "tapjoy");
            }
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (str6 == null || notificationManager.getNotificationChannel(str6) == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("tapjoy", "Tapjoy", 3));
                    str7 = "tapjoy";
                } else {
                    str7 = str6;
                }
            }
            jj.c a4 = new jj.c(context, str7).a(a2).c(charSequence).a(charSequence).b(str3).a(broadcast).a().c().a(new jj.b().a(charSequence).b(str3));
            if (z2) {
                a4.b();
            }
            if (decodeResource != null) {
                a4.a(decodeResource);
            }
            return a4.d();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
