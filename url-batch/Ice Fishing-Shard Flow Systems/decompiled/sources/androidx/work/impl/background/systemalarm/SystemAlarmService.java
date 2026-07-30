package androidx.work.impl.background.systemalarm;

import G0.s;
import J0.j;
import Q0.o;
import Q0.p;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0259z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0259z {

    /* renamed from: l, reason: collision with root package name */
    public static final String f4109l = s.f("SystemAlarmService");

    /* renamed from: e, reason: collision with root package name */
    public j f4110e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4111i;

    public final void a() {
        this.f4111i = true;
        s.d().a(f4109l, "All commands completed in dispatcher");
        String str = o.f2319a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (p.f2320a) {
            linkedHashMap.putAll(p.f2321b);
            Unit unit = Unit.f6114a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s.d().g(o.f2319a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0259z, android.app.Service
    public final void onCreate() {
        super.onCreate();
        j jVar = new j(this);
        this.f4110e = jVar;
        if (jVar.f1359q != null) {
            s.d().b(j.f1350r, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jVar.f1359q = this;
        }
        this.f4111i = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0259z, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4111i = true;
        j jVar = this.f4110e;
        jVar.getClass();
        s.d().a(j.f1350r, "Destroying SystemAlarmDispatcher");
        jVar.f1354l.e(jVar);
        jVar.f1359q = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i5) {
        super.onStartCommand(intent, i2, i5);
        if (this.f4111i) {
            s.d().e(f4109l, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            j jVar = this.f4110e;
            jVar.getClass();
            s d7 = s.d();
            String str = j.f1350r;
            d7.a(str, "Destroying SystemAlarmDispatcher");
            jVar.f1354l.e(jVar);
            jVar.f1359q = null;
            j jVar2 = new j(this);
            this.f4110e = jVar2;
            if (jVar2.f1359q != null) {
                s.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jVar2.f1359q = this;
            }
            this.f4111i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4110e.a(i5, intent);
        return 3;
    }
}
