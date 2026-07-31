package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.l;
import androidx.work.impl.background.systemalarm.e;
import d0.j;

/* loaded from: classes.dex */
public class SystemAlarmService extends l implements e.c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f1475i = j.f("SystemAlarmService");

    /* renamed from: g, reason: collision with root package name */
    private e f1476g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1477h;

    private void f() {
        e eVar = new e(this);
        this.f1476g = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f1477h = true;
        j.c().a(f1475i, "All commands completed in dispatcher", new Throwable[0]);
        m0.j.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.f1477h = false;
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f1477h = true;
        this.f1476g.j();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f1477h) {
            j.c().d(f1475i, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1476g.j();
            f();
            this.f1477h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1476g.b(intent, i8);
        return 3;
    }
}
