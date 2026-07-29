package com.dancingbogo.skyrolline;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.multidex.MultiDexApplication;
import com.appsflyer.g;
import com.appsflyer.i;
import com.cmplay.internalpush.f;
import com.dancingbogo.skyrolline.b.c;
import com.dancingbogo.skyrolline.b.d;
import com.dancingbogo.skyrolline.cloud.CloudUpdateReceiver;
import com.dancingbogo.skyrolline.cloud.b;
import com.dancingbogo.skyrolline.commons.RollingSkyService;
import com.facebook.l;
import com.tencent.bugly.crashreport.CrashReport;
import java.util.Map;

/* loaded from: classes.dex */
public class GameApp extends MultiDexApplication {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4485a;

    /* renamed from: b, reason: collision with root package name */
    private static GameApp f4486b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f4487c = new Handler(Looper.getMainLooper());

    @Override // android.app.Application
    public void onCreate() {
        System.currentTimeMillis();
        super.onCreate();
        f4485a = getApplicationContext();
        f4486b = this;
        b();
        System.currentTimeMillis();
    }

    private void b() {
        com.dancingbogo.skyrolline.c.a.a(f4485a);
        d.a(this, new c(f4485a, d.a()));
        c();
        l.a(getApplicationContext());
        e();
        d();
        f.a(this);
    }

    private void c() {
        CrashReport.initCrashReport(getApplicationContext(), "89f3bf446b", false);
    }

    private void d() {
        if (com.dancingbogo.skyrolline.c.a.a()) {
            CloudUpdateReceiver.a(f4485a);
            b.a(f4485a);
            com.dancingbogo.skyrolline.cloud.d.a().b();
        }
    }

    private void e() {
        if (com.dancingbogo.skyrolline.c.a.b()) {
            f();
            CloudUpdateReceiver.a(f4485a);
            b.a(f4485a);
            g();
        }
    }

    private void f() {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) RollingSkyService.class);
        intent.putExtra("command_start_key", "command_start_getclouddata");
        com.dancingbogo.skyrolline.util.d.b(this, intent);
    }

    private void g() {
        g gVar = new g() { // from class: com.dancingbogo.skyrolline.GameApp.1
            @Override // com.appsflyer.g
            public void a(String str) {
            }

            @Override // com.appsflyer.g
            public void a(Map<String, String> map) {
            }

            @Override // com.appsflyer.g
            public void b(String str) {
            }

            @Override // com.appsflyer.g
            public void b(Map<String, String> map) {
            }
        };
        i.c().b(false);
        i.c().a(false);
        i.c().a("JS4D7K6orQauKANLStD2nb", gVar, getApplicationContext());
        i.c().a((Application) this);
        i.c().a("CNY");
    }

    public void a(Runnable runnable) {
        this.f4487c.post(runnable);
    }

    public void a(Runnable runnable, long j) {
        this.f4487c.postDelayed(runnable, j);
    }

    public static GameApp a() {
        return f4486b;
    }
}
