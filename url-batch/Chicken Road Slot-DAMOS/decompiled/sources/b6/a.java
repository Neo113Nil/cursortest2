package b6;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import c6.j;
import c6.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t5.g;
import t5.o;
import u5.i;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements y5.b, u5.c {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1215x = o.f("SystemFgDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final m f1216d;

    /* renamed from: e, reason: collision with root package name */
    public final f6.a f1217e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1218i = new Object();

    /* renamed from: r, reason: collision with root package name */
    public j f1219r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f1220s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f1221t;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f1222u;

    /* renamed from: v, reason: collision with root package name */
    public final p.e f1223v;

    /* renamed from: w, reason: collision with root package name */
    public SystemForegroundService f1224w;

    public a(Context context) {
        m a9 = m.a(context);
        this.f1216d = a9;
        this.f1217e = a9.f9652d;
        this.f1219r = null;
        this.f1220s = new LinkedHashMap();
        this.f1222u = new HashSet();
        this.f1221t = new HashMap();
        this.f1223v = new p.e(a9.j, this);
        a9.f9654f.a(this);
    }

    public static Intent a(Context context, j jVar, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f9305a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f9306b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f9307c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f1824a);
        intent.putExtra("KEY_GENERATION", jVar.f1825b);
        return intent;
    }

    public static Intent d(Context context, j jVar, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f1824a);
        intent.putExtra("KEY_GENERATION", jVar.f1825b);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f9305a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f9306b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f9307c);
        return intent;
    }

    @Override // y5.b
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            p pVar = (p) obj;
            String str = pVar.f1839a;
            o.d().a(f1215x, "Constraints unmet for WorkSpec " + str);
            j A = g8.b.A(pVar);
            m mVar = this.f1216d;
            mVar.f9652d.a(new d6.m(mVar, new i(A), true));
        }
    }

    public final void e(Intent intent) {
        int i3 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o.d().a(f1215x, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f1224w == null) {
            return;
        }
        g gVar = new g(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f1220s;
        linkedHashMap.put(jVar, gVar);
        if (this.f1219r == null) {
            this.f1219r = jVar;
            SystemForegroundService systemForegroundService = this.f1224w;
            systemForegroundService.f784e.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f1224w;
        systemForegroundService2.f784e.post(new c(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i3 |= ((g) ((Map.Entry) it.next()).getValue()).f9306b;
        }
        g gVar2 = (g) linkedHashMap.get(this.f1219r);
        if (gVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f1224w;
            systemForegroundService3.f784e.post(new b(systemForegroundService3, gVar2.f9305a, gVar2.f9307c, i3));
        }
    }

    @Override // u5.c
    public final void f(j jVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f1218i) {
            try {
                p pVar = (p) this.f1221t.remove(jVar);
                if (pVar != null ? this.f1222u.remove(pVar) : false) {
                    this.f1223v.g(this.f1222u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = (g) this.f1220s.remove(jVar);
        if (jVar.equals(this.f1219r) && this.f1220s.size() > 0) {
            Iterator it = this.f1220s.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f1219r = (j) entry.getKey();
            if (this.f1224w != null) {
                g gVar2 = (g) entry.getValue();
                SystemForegroundService systemForegroundService = this.f1224w;
                systemForegroundService.f784e.post(new b(systemForegroundService, gVar2.f9305a, gVar2.f9307c, gVar2.f9306b));
                SystemForegroundService systemForegroundService2 = this.f1224w;
                systemForegroundService2.f784e.post(new d(gVar2.f9305a, 0, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f1224w;
        if (gVar == null || systemForegroundService3 == null) {
            return;
        }
        o.d().a(f1215x, "Removing Notification (id: " + gVar.f9305a + ", workSpecId: " + jVar + ", notificationType: " + gVar.f9306b);
        systemForegroundService3.f784e.post(new d(gVar.f9305a, 0, systemForegroundService3));
    }

    public final void g() {
        this.f1224w = null;
        synchronized (this.f1218i) {
            this.f1223v.h();
        }
        this.f1216d.f9654f.d(this);
    }

    @Override // y5.b
    public final void c(List list) {
    }
}
