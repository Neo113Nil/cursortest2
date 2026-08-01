package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.x;
import d6.p;
import java.util.LinkedHashMap;
import java.util.Map;
import t5.o;
import w5.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class SystemAlarmService extends x {

    /* renamed from: r, reason: collision with root package name */
    public static final String f775r = o.f("SystemAlarmService");

    /* renamed from: e, reason: collision with root package name */
    public i f776e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f777i;

    public final void c() {
        this.f777i = true;
        o.d().a(f775r, "All commands completed in dispatcher");
        String str = d6.o.f3651a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (p.f3652a) {
            linkedHashMap.putAll(p.f3653b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                o.d().g(d6.o.f3651a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f776e = iVar;
        if (iVar.f10116w != null) {
            o.d().b(i.f10107x, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            iVar.f10116w = this;
        }
        this.f777i = false;
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f777i = true;
        i iVar = this.f776e;
        iVar.getClass();
        o.d().a(i.f10107x, "Destroying SystemAlarmDispatcher");
        iVar.f10111r.d(iVar);
        iVar.f10116w = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        super.onStartCommand(intent, i3, i10);
        if (this.f777i) {
            o.d().e(f775r, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            i iVar = this.f776e;
            iVar.getClass();
            o d10 = o.d();
            String str = i.f10107x;
            d10.a(str, "Destroying SystemAlarmDispatcher");
            iVar.f10111r.d(iVar);
            iVar.f10116w = null;
            i iVar2 = new i(this);
            this.f776e = iVar2;
            if (iVar2.f10116w != null) {
                o.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                iVar2.f10116w = this;
            }
            this.f777i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f776e.a(i10, intent);
        return 3;
    }
}
