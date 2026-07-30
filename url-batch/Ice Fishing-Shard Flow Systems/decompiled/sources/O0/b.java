package O0;

import G0.s;
import H0.p;
import J0.i;
import P0.j;
import Q0.n;
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
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class b implements L0.b, H0.c {

    /* renamed from: r, reason: collision with root package name */
    public static final String f1903r = s.f("SystemFgDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final p f1904d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.a f1905e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1906i = new Object();

    /* renamed from: l, reason: collision with root package name */
    public j f1907l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f1908m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f1909n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f1910o;

    /* renamed from: p, reason: collision with root package name */
    public final D0.j f1911p;

    /* renamed from: q, reason: collision with root package name */
    public SystemForegroundService f1912q;

    public b(Context context) {
        p a7 = p.a(context);
        this.f1904d = a7;
        this.f1905e = a7.f921d;
        this.f1907l = null;
        this.f1908m = new LinkedHashMap();
        this.f1910o = new HashSet();
        this.f1909n = new HashMap();
        this.f1911p = new D0.j(a7.j, this);
        a7.f923f.a(this);
    }

    public static Intent a(Context context, j jVar, G0.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f813a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f814b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f815c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2204a);
        intent.putExtra("KEY_GENERATION", jVar.f2205b);
        return intent;
    }

    public static Intent e(Context context, j jVar, G0.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2204a);
        intent.putExtra("KEY_GENERATION", jVar.f2205b);
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f813a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f814b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f815c);
        return intent;
    }

    @Override // L0.b
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            P0.p pVar = (P0.p) obj;
            String str = pVar.f2220a;
            s.d().a(f1903r, "Constraints unmet for WorkSpec " + str);
            j x7 = AbstractC1053a.x(pVar);
            p pVar2 = this.f1904d;
            pVar2.f921d.r(new n(pVar2, new H0.j(x7), true));
        }
    }

    @Override // H0.c
    public final void c(j jVar, boolean z7) {
        Map.Entry entry;
        synchronized (this.f1906i) {
            try {
                P0.p pVar = (P0.p) this.f1909n.remove(jVar);
                if (pVar != null ? this.f1910o.remove(pVar) : false) {
                    this.f1911p.Y(this.f1910o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G0.j jVar2 = (G0.j) this.f1908m.remove(jVar);
        if (jVar.equals(this.f1907l) && this.f1908m.size() > 0) {
            Iterator it = this.f1908m.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f1907l = (j) entry.getKey();
            if (this.f1912q != null) {
                G0.j jVar3 = (G0.j) entry.getValue();
                SystemForegroundService systemForegroundService = this.f1912q;
                systemForegroundService.f4118e.post(new c(systemForegroundService, jVar3.f813a, jVar3.f815c, jVar3.f814b));
                SystemForegroundService systemForegroundService2 = this.f1912q;
                systemForegroundService2.f4118e.post(new d(systemForegroundService2, jVar3.f813a, 0));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f1912q;
        if (jVar2 == null || systemForegroundService3 == null) {
            return;
        }
        s.d().a(f1903r, "Removing Notification (id: " + jVar2.f813a + ", workSpecId: " + jVar + ", notificationType: " + jVar2.f814b);
        systemForegroundService3.f4118e.post(new d(systemForegroundService3, jVar2.f813a, 0));
    }

    public final void f(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s.d().a(f1903r, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f1912q == null) {
            return;
        }
        G0.j jVar2 = new G0.j(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f1908m;
        linkedHashMap.put(jVar, jVar2);
        if (this.f1907l == null) {
            this.f1907l = jVar;
            SystemForegroundService systemForegroundService = this.f1912q;
            systemForegroundService.f4118e.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f1912q;
        systemForegroundService2.f4118e.post(new i(systemForegroundService2, intExtra, notification, 1));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i2 |= ((G0.j) ((Map.Entry) it.next()).getValue()).f814b;
        }
        G0.j jVar3 = (G0.j) linkedHashMap.get(this.f1907l);
        if (jVar3 != null) {
            SystemForegroundService systemForegroundService3 = this.f1912q;
            systemForegroundService3.f4118e.post(new c(systemForegroundService3, jVar3.f813a, jVar3.f815c, i2));
        }
    }

    public final void g() {
        this.f1912q = null;
        synchronized (this.f1906i) {
            this.f1911p.Z();
        }
        this.f1904d.f923f.e(this);
    }

    @Override // L0.b
    public final void d(List list) {
    }
}
