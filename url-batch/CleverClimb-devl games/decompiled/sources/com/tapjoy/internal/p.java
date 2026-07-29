package com.tapjoy.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.tapjoy.TapjoyConstants;
import java.sql.Timestamp;

/* loaded from: classes.dex */
public abstract class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8510a;

    /* renamed from: b, reason: collision with root package name */
    public final r f8511b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8512c = false;

    public p(Context context, r rVar) {
        this.f8510a = context.getApplicationContext();
        this.f8511b = rVar;
    }

    private boolean b() {
        boolean e = this.f8511b.e(this.f8510a);
        if (e) {
            long f = this.f8511b.f(this.f8510a);
            if (f != 0 && System.currentTimeMillis() > f) {
                new Object[1][0] = new Timestamp(f);
                return false;
            }
        }
        return e;
    }

    public final boolean a() {
        String a2 = this.f8511b.a(this.f8510a);
        if (jr.c(a2)) {
            return false;
        }
        a(a2);
        return true;
    }

    protected final void a(String str) {
        String b2 = this.f8511b.b(this.f8510a);
        if (b2.length() == 0) {
            e(str);
            return;
        }
        String a2 = this.f8511b.a(this.f8510a);
        if (!str.equals(a2)) {
            Object[] objArr = {a2, str, b2};
            e(str);
            return;
        }
        int d2 = this.f8511b.d(this.f8510a);
        int a3 = z.a(this.f8510a);
        if (d2 != Integer.MIN_VALUE && d2 != a3) {
            Object[] objArr2 = {Integer.valueOf(d2), Integer.valueOf(a3), b2};
            e(str);
        } else if (this.f8511b.c(this.f8510a)) {
            new Object[1][0] = b2;
            e(str);
        } else if (!b()) {
            Object[] objArr3 = {str, b2};
            a(this.f8510a, b2);
        } else {
            Object[] objArr4 = {str, b2};
        }
    }

    private void e(String str) {
        this.f8511b.a(this.f8510a, str);
        this.f8511b.a(this.f8510a, true);
        if ((this.f8512c || !b(this.f8510a, str)) && c(this.f8510a, str)) {
        }
    }

    private static boolean b(Context context, String str) {
        int b2;
        try {
            b2 = z.b(context.getPackageManager(), "com.google.android.gms");
        } catch (RuntimeException unused) {
        }
        if (b2 >= 3159130) {
            Object[] objArr = {Integer.valueOf(b2), str};
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            b(context, intent);
            intent.putExtra("sender", str);
            return context.startService(intent) != null;
        }
        new Object[1][0] = Integer.valueOf(b2);
        return false;
    }

    private static boolean c(Context context, String str) {
        try {
            Object[] objArr = {Integer.valueOf(z.b(context.getPackageManager(), "com.google.android.gsf")), str};
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gsf");
            b(context, intent);
            intent.putExtra("sender", str);
            return context.startService(intent) != null;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private static void b(Context context, Intent intent) {
        intent.putExtra(TapjoyConstants.TJC_APP_PLACEMENT, PendingIntent.getBroadcast(context, 0, new Intent(), 0));
    }

    protected final void a(Context context) {
        this.f8511b.b(context, GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
    }

    public final boolean a(Intent intent) {
        boolean d2;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra = intent.getStringExtra("registration_id");
            String stringExtra2 = intent.getStringExtra("unregistered");
            String stringExtra3 = intent.getStringExtra("error");
            if (stringExtra != null) {
                if (stringExtra.length() > 0) {
                    if (stringExtra.startsWith("|")) {
                        return false;
                    }
                    f(stringExtra);
                    return false;
                }
                if (stringExtra2 == null && stringExtra3 == null && !this.f8512c) {
                    this.f8512c = true;
                    a();
                    return true;
                }
            }
            if (stringExtra2 != null) {
                String b2 = this.f8511b.b(this.f8510a);
                a(this.f8510a);
                this.f8511b.b(this.f8510a, false);
                this.f8511b.b(this.f8510a, "");
                this.f8511b.a(this.f8510a, true);
                b(b2);
                return false;
            }
            if (stringExtra3 == null) {
                return false;
            }
            if ("SERVICE_NOT_AVAILABLE".equals(stringExtra3)) {
                d2 = c(stringExtra3);
            } else {
                if (!this.f8512c) {
                    c(stringExtra3);
                    this.f8512c = true;
                    a();
                    return true;
                }
                d2 = d(stringExtra3);
            }
            if (d2) {
                int g = this.f8511b.g(this.f8510a);
                new Object[1][0] = Integer.valueOf(g);
                Intent intent2 = new Intent("com.google.android.gcm.intent.RETRY");
                intent2.setPackage(this.f8510a.getPackageName());
                ((AlarmManager) this.f8510a.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(3, SystemClock.elapsedRealtime() + g, PendingIntent.getBroadcast(this.f8510a, 0, intent2, 0));
                if (g < 3600000) {
                    this.f8511b.b(this.f8510a, g * 2);
                }
            }
            return true;
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {
            String stringExtra4 = intent.getStringExtra("message_type");
            if (stringExtra4 != null) {
                if (GoogleCloudMessaging.MESSAGE_TYPE_DELETED.equals(stringExtra4)) {
                    String stringExtra5 = intent.getStringExtra("total_deleted");
                    if (stringExtra5 != null) {
                        try {
                            int parseInt = Integer.parseInt(stringExtra5);
                            new Object[1][0] = Integer.valueOf(parseInt);
                            a(parseInt);
                        } catch (NumberFormatException unused) {
                            new Object[1][0] = stringExtra5;
                        }
                    }
                } else {
                    new Object[1][0] = stringExtra4;
                }
                return false;
            }
            return a(this.f8510a, intent);
        }
        if (!"com.google.android.gcm.intent.RETRY".equals(action)) {
            new Object[1][0] = action;
            return false;
        }
        String str = intent.getPackage();
        if (str == null || !str.equals(this.f8510a.getPackageName())) {
            new Object[1][0] = str;
            return false;
        }
        a();
        return true;
    }

    private synchronized void f(String str) {
        a(this.f8510a);
        this.f8511b.a(this.f8510a, false);
        this.f8511b.a(this.f8510a, z.a(this.f8510a));
        if (!str.equals(this.f8511b.b(this.f8510a))) {
            new Object[1][0] = str;
            this.f8511b.b(this.f8510a, false);
            this.f8511b.b(this.f8510a, str);
            a(this.f8510a, str);
            return;
        }
        if (!b()) {
            new Object[1][0] = str;
            a(this.f8510a, str);
        } else {
            new Object[1][0] = str;
        }
    }
}
