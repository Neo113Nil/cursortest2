package androidx.work.impl.background.systemalarm;

import C0.q;
import C0.r;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0253x;
import java.util.LinkedHashMap;
import java.util.Map;
import s0.s;
import v0.C1494i;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0253x {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4738d = s.f("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public C1494i f4739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4740c;

    public final void a() {
        this.f4740c = true;
        s.d().a(f4738d, "All commands completed in dispatcher");
        String str = q.f352a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (r.f353a) {
            linkedHashMap.putAll(r.f354b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s.d().g(q.f352a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0253x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1494i c1494i = new C1494i(this);
        this.f4739b = c1494i;
        if (c1494i.f12092i != null) {
            s.d().b(C1494i.f12083j, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            c1494i.f12092i = this;
        }
        this.f4740c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0253x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4740c = true;
        C1494i c1494i = this.f4739b;
        c1494i.getClass();
        s.d().a(C1494i.f12083j, "Destroying SystemAlarmDispatcher");
        c1494i.f12087d.e(c1494i);
        c1494i.f12092i = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f4740c) {
            s.d().e(f4738d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            C1494i c1494i = this.f4739b;
            c1494i.getClass();
            s d6 = s.d();
            String str = C1494i.f12083j;
            d6.a(str, "Destroying SystemAlarmDispatcher");
            c1494i.f12087d.e(c1494i);
            c1494i.f12092i = null;
            C1494i c1494i2 = new C1494i(this);
            this.f4739b = c1494i2;
            if (c1494i2.f12092i != null) {
                s.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                c1494i2.f12092i = this;
            }
            this.f4740c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4739b.a(i3, intent);
        return 3;
    }
}
