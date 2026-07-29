package com.dancingbogo.skyrolline.cloud;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.dancingbogo.skyrolline.util.m;

/* compiled from: CloudConfigUpdater.java */
/* loaded from: classes.dex */
public class b {
    private static b e;

    /* renamed from: a, reason: collision with root package name */
    private Context f4561a;

    /* renamed from: b, reason: collision with root package name */
    private AlarmManager f4562b;

    /* renamed from: c, reason: collision with root package name */
    private a f4563c;

    /* renamed from: d, reason: collision with root package name */
    private PendingIntent f4564d;

    public static b a(Context context) {
        if (e == null) {
            synchronized (b.class) {
                if (e == null) {
                    e = new b(context);
                }
            }
        }
        return e;
    }

    private b(Context context) {
        this.f4561a = context;
        com.dancingbogo.skyrolline.util.b.b("CloudConfigUpdater", "CloudConfigUpdater");
        if (com.dancingbogo.skyrolline.c.a.a()) {
            f();
        }
    }

    public void a() {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            g();
            e();
        } else {
            com.dancingbogo.skyrolline.cloud.a.a().a(this.f4561a);
        }
    }

    public void b() {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            com.dancingbogo.skyrolline.util.a.a(new Runnable() { // from class: com.dancingbogo.skyrolline.cloud.b.1
                @Override // java.lang.Runnable
                public void run() {
                    com.ijinshan.cloudconfig.c.a.a(b.this.f4561a);
                    com.ijinshan.cloudconfig.deepcloudconfig.c.a().a(com.ijinshan.cloudconfig.b.a.a().b("local_version", "none"));
                }
            });
            e();
        } else {
            com.dancingbogo.skyrolline.cloud.a.a().b(this.f4561a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Intent intent = new Intent();
        intent.setAction("rolling_sky_cloudconfig_delay_task_action");
        intent.setPackage(this.f4561a.getPackageName());
        this.f4564d = PendingIntent.getBroadcast(this.f4561a, 0, intent, 134217728);
        this.f4562b.cancel(this.f4564d);
        this.f4562b.set(1, System.currentTimeMillis() + 21600000, this.f4564d);
    }

    private void f() {
        if (this.f4563c == null) {
            com.dancingbogo.skyrolline.util.b.b("CloudConfigUpdater", "mDelayTaskReceiver registerReceiver");
            this.f4563c = new a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("rolling_sky_cloudconfig_delay_task_action");
            this.f4561a.registerReceiver(this.f4563c, intentFilter);
        }
        if (this.f4562b == null) {
            this.f4562b = (AlarmManager) this.f4561a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        }
    }

    public void c() {
        com.dancingbogo.skyrolline.util.a.a(new Runnable() { // from class: com.dancingbogo.skyrolline.cloud.b.2
            @Override // java.lang.Runnable
            public void run() {
                String b2 = m.b(b.this.f4561a);
                if (TextUtils.isEmpty(b2)) {
                    return;
                }
                com.dancingbogo.skyrolline.b.d.a("key_cloud_update_app_version", b2);
            }
        });
    }

    /* compiled from: CloudConfigUpdater.java */
    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.dancingbogo.skyrolline.util.b.b("CloudConfigUpdater", "onReceive DelayTaskReceiver ");
            if (intent == null || !"rolling_sky_cloudconfig_delay_task_action".equals(intent.getAction())) {
                return;
            }
            b.this.g();
            b.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.dancingbogo.skyrolline.util.a.a(new Runnable() { // from class: com.dancingbogo.skyrolline.cloud.b.3
            @Override // java.lang.Runnable
            public void run() {
                com.ijinshan.cloudconfig.c.a.a(b.this.f4561a);
                com.dancingbogo.skyrolline.util.b.b("CloudConfigUpdater", "executeTask pullCloudConfig");
                b.this.d();
            }
        });
    }

    public void d() {
        String b2 = com.ijinshan.cloudconfig.b.a.a().b("local_version", "none");
        String b3 = m.b(this.f4561a);
        String a2 = com.dancingbogo.skyrolline.b.d.a("key_cloud_update_app_version");
        com.dancingbogo.skyrolline.util.b.b("CloudConfigUpdater", "cloudVersion = " + b2 + " localVersion = " + b3 + " lastAppVersion = " + a2);
        if (TextUtils.isEmpty(b2) || TextUtils.equals(b2, "none") || TextUtils.equals(b3, a2)) {
            com.ijinshan.cloudconfig.deepcloudconfig.c.a().a(false);
        } else {
            com.ijinshan.cloudconfig.deepcloudconfig.c.a().a(b2);
        }
    }
}
