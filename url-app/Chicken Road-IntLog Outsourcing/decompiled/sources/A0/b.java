package A0;

import B0.j;
import B0.q;
import B4.i;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s0.s;
import t0.InterfaceC1425d;
import t0.o;
import u1.AbstractC1477a;
import x0.InterfaceC1536b;

/* loaded from: classes.dex */
public final class b implements InterfaceC1536b, InterfaceC1425d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f6j = s.f("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final o f7a;

    /* renamed from: b, reason: collision with root package name */
    public final i f8b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public j f10d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f11e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f12f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f13g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.c f14h;

    /* renamed from: i, reason: collision with root package name */
    public SystemForegroundService f15i;

    public b(Context context) {
        o a6 = o.a(context);
        this.f7a = a6;
        this.f8b = a6.f11885d;
        this.f10d = null;
        this.f11e = new LinkedHashMap();
        this.f13g = new HashSet();
        this.f12f = new HashMap();
        this.f14h = new x0.c(a6.f11891j, this);
        a6.f11887f.a(this);
    }

    public static Intent a(Context context, j jVar, s0.i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f11781a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f11782b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f11783c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f157a);
        intent.putExtra("KEY_GENERATION", jVar.f158b);
        return intent;
    }

    public static Intent e(Context context, j jVar, s0.i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f157a);
        intent.putExtra("KEY_GENERATION", jVar.f158b);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f11781a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f11782b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f11783c);
        return intent;
    }

    @Override // x0.InterfaceC1536b
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            String str = qVar.f173a;
            s.d().a(f6j, B0.o.i("Constraints unmet for WorkSpec ", str));
            j p5 = AbstractC1477a.p(qVar);
            o oVar = this.f7a;
            oVar.f11885d.o(new C0.o(oVar, new t0.j(p5), true));
        }
    }

    @Override // t0.InterfaceC1425d
    public final void d(j jVar, boolean z) {
        Map.Entry entry;
        synchronized (this.f9c) {
            try {
                q qVar = (q) this.f12f.remove(jVar);
                if (qVar != null ? this.f13g.remove(qVar) : false) {
                    this.f14h.d(this.f13g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s0.i iVar = (s0.i) this.f11e.remove(jVar);
        if (jVar.equals(this.f10d) && this.f11e.size() > 0) {
            Iterator it = this.f11e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f10d = (j) entry.getKey();
            if (this.f15i != null) {
                s0.i iVar2 = (s0.i) entry.getValue();
                SystemForegroundService systemForegroundService = this.f15i;
                systemForegroundService.f4747b.post(new c(systemForegroundService, iVar2.f11781a, iVar2.f11783c, iVar2.f11782b));
                SystemForegroundService systemForegroundService2 = this.f15i;
                systemForegroundService2.f4747b.post(new e(iVar2.f11781a, 0, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f15i;
        if (iVar == null || systemForegroundService3 == null) {
            return;
        }
        s.d().a(f6j, "Removing Notification (id: " + iVar.f11781a + ", workSpecId: " + jVar + ", notificationType: " + iVar.f11782b);
        systemForegroundService3.f4747b.post(new e(iVar.f11781a, 0, systemForegroundService3));
    }

    public final void f(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s.d().a(f6j, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f15i == null) {
            return;
        }
        s0.i iVar = new s0.i(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f11e;
        linkedHashMap.put(jVar, iVar);
        if (this.f10d == null) {
            this.f10d = jVar;
            SystemForegroundService systemForegroundService = this.f15i;
            systemForegroundService.f4747b.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f15i;
        systemForegroundService2.f4747b.post(new d(intExtra, 0, systemForegroundService2, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i2 |= ((s0.i) ((Map.Entry) it.next()).getValue()).f11782b;
        }
        s0.i iVar2 = (s0.i) linkedHashMap.get(this.f10d);
        if (iVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f15i;
            systemForegroundService3.f4747b.post(new c(systemForegroundService3, iVar2.f11781a, iVar2.f11783c, i2));
        }
    }

    public final void g() {
        this.f15i = null;
        synchronized (this.f9c) {
            this.f14h.e();
        }
        this.f7a.f11887f.e(this);
    }

    @Override // x0.InterfaceC1536b
    public final void c(List list) {
    }
}
