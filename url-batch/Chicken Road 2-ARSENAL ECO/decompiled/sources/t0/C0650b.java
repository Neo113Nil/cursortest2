package t0;

import T0.A;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import i6.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.RunnableC0460t;
import l0.i;
import l0.q;
import m0.j;
import m0.o;
import q0.InterfaceC0594b;
import u0.C0680j;
import u0.C0686p;
import v0.l;
import x0.InterfaceC0725a;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650b implements InterfaceC0594b, m0.c {

    /* renamed from: o, reason: collision with root package name */
    public static final String f5944o = q.f("SystemFgDispatcher");

    /* renamed from: f, reason: collision with root package name */
    public final o f5945f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0725a f5946g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5947h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public C0680j f5948i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f5949j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f5950k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f5951l;

    /* renamed from: m, reason: collision with root package name */
    public final B0.c f5952m;

    /* renamed from: n, reason: collision with root package name */
    public SystemForegroundService f5953n;

    public C0650b(Context context) {
        o a7 = o.a(context);
        this.f5945f = a7;
        this.f5946g = a7.f5376d;
        this.f5948i = null;
        this.f5949j = new LinkedHashMap();
        this.f5951l = new HashSet();
        this.f5950k = new HashMap();
        this.f5952m = new B0.c(a7.f5382j, this);
        a7.f5378f.a(this);
    }

    public static Intent a(Context context, C0680j c0680j, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f5274a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f5275b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f5276c);
        intent.putExtra("KEY_WORKSPEC_ID", c0680j.f5985a);
        intent.putExtra("KEY_GENERATION", c0680j.f5986b);
        return intent;
    }

    public static Intent b(Context context, C0680j c0680j, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c0680j.f5985a);
        intent.putExtra("KEY_GENERATION", c0680j.f5986b);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f5274a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f5275b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f5276c);
        return intent;
    }

    @Override // q0.InterfaceC0594b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C0686p c0686p = (C0686p) obj;
            String str = c0686p.f6000a;
            q.d().a(f5944o, "Constraints unmet for WorkSpec " + str);
            C0680j n7 = g.n(c0686p);
            o oVar = this.f5945f;
            oVar.f5376d.a(new l(oVar, new j(n7), true));
        }
    }

    public final void e(Intent intent) {
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C0680j c0680j = new C0680j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q.d().a(f5944o, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f5953n == null) {
            return;
        }
        i iVar = new i(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f5949j;
        linkedHashMap.put(c0680j, iVar);
        if (this.f5948i == null) {
            this.f5948i = c0680j;
            SystemForegroundService systemForegroundService = this.f5953n;
            systemForegroundService.f3589g.post(new RunnableC0651c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f5953n;
        systemForegroundService2.f3589g.post(new RunnableC0460t(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i7 |= ((i) ((Map.Entry) it.next()).getValue()).f5275b;
        }
        i iVar2 = (i) linkedHashMap.get(this.f5948i);
        if (iVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f5953n;
            systemForegroundService3.f3589g.post(new RunnableC0651c(systemForegroundService3, iVar2.f5274a, iVar2.f5276c, i7));
        }
    }

    @Override // m0.c
    public final void f(C0680j c0680j, boolean z5) {
        Map.Entry entry;
        synchronized (this.f5947h) {
            try {
                C0686p c0686p = (C0686p) this.f5950k.remove(c0680j);
                if (c0686p != null ? this.f5951l.remove(c0686p) : false) {
                    this.f5952m.w(this.f5951l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = (i) this.f5949j.remove(c0680j);
        if (c0680j.equals(this.f5948i) && this.f5949j.size() > 0) {
            Iterator it = this.f5949j.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f5948i = (C0680j) entry.getKey();
            if (this.f5953n != null) {
                i iVar2 = (i) entry.getValue();
                SystemForegroundService systemForegroundService = this.f5953n;
                systemForegroundService.f3589g.post(new RunnableC0651c(systemForegroundService, iVar2.f5274a, iVar2.f5276c, iVar2.f5275b));
                SystemForegroundService systemForegroundService2 = this.f5953n;
                systemForegroundService2.f3589g.post(new A(systemForegroundService2, iVar2.f5274a, 1));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f5953n;
        if (iVar == null || systemForegroundService3 == null) {
            return;
        }
        q.d().a(f5944o, "Removing Notification (id: " + iVar.f5274a + ", workSpecId: " + c0680j + ", notificationType: " + iVar.f5275b);
        systemForegroundService3.f3589g.post(new A(systemForegroundService3, iVar.f5274a, 1));
    }

    public final void g() {
        this.f5953n = null;
        synchronized (this.f5947h) {
            this.f5952m.x();
        }
        this.f5945f.f5378f.d(this);
    }

    @Override // q0.InterfaceC0594b
    public final void d(List list) {
    }
}
