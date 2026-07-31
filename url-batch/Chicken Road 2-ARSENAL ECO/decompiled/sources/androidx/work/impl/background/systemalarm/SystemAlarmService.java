package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0256x;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.q;
import o0.i;
import v0.m;
import v0.n;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0256x {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3580i = q.f("SystemAlarmService");

    /* renamed from: g, reason: collision with root package name */
    public i f3581g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3582h;

    public final void a() {
        this.f3582h = true;
        q.d().a(f3580i, "All commands completed in dispatcher");
        String str = m.f6078a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (n.f6079a) {
            linkedHashMap.putAll(n.f6080b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                q.d().g(m.f6078a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0256x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        i iVar = new i(this);
        this.f3581g = iVar;
        if (iVar.f5603n != null) {
            q.d().b(i.f5594o, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            iVar.f5603n = this;
        }
        this.f3582h = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0256x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3582h = true;
        i iVar = this.f3581g;
        iVar.getClass();
        q.d().a(i.f5594o, "Destroying SystemAlarmDispatcher");
        iVar.f5598i.d(iVar);
        iVar.f5603n = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f3582h) {
            q.d().e(f3580i, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            i iVar = this.f3581g;
            iVar.getClass();
            q d7 = q.d();
            String str = i.f5594o;
            d7.a(str, "Destroying SystemAlarmDispatcher");
            iVar.f5598i.d(iVar);
            iVar.f5603n = null;
            i iVar2 = new i(this);
            this.f3581g = iVar2;
            if (iVar2.f5603n != null) {
                q.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                iVar2.f5603n = this;
            }
            this.f3582h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3581g.a(i8, intent);
        return 3;
    }
}
