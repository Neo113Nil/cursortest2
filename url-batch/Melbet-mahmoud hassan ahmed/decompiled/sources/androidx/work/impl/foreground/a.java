package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import d0.e;
import d0.j;
import e0.i;
import h0.c;
import h0.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l0.p;

/* loaded from: classes.dex */
public class a implements c, e0.b {

    /* renamed from: p, reason: collision with root package name */
    static final String f1535p = j.f("SystemFgDispatcher");

    /* renamed from: f, reason: collision with root package name */
    private Context f1536f;

    /* renamed from: g, reason: collision with root package name */
    private i f1537g;

    /* renamed from: h, reason: collision with root package name */
    private final n0.a f1538h;

    /* renamed from: i, reason: collision with root package name */
    final Object f1539i = new Object();

    /* renamed from: j, reason: collision with root package name */
    String f1540j;

    /* renamed from: k, reason: collision with root package name */
    final Map<String, e> f1541k;

    /* renamed from: l, reason: collision with root package name */
    final Map<String, p> f1542l;

    /* renamed from: m, reason: collision with root package name */
    final Set<p> f1543m;

    /* renamed from: n, reason: collision with root package name */
    final d f1544n;

    /* renamed from: o, reason: collision with root package name */
    private b f1545o;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0031a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f1546f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f1547g;

        RunnableC0031a(WorkDatabase workDatabase, String str) {
            this.f1546f = workDatabase;
            this.f1547g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p l7 = this.f1546f.B().l(this.f1547g);
            if (l7 == null || !l7.b()) {
                return;
            }
            synchronized (a.this.f1539i) {
                a.this.f1542l.put(this.f1547g, l7);
                a.this.f1543m.add(l7);
                a aVar = a.this;
                aVar.f1544n.d(aVar.f1543m);
            }
        }
    }

    interface b {
        void B();

        void c(int i7);

        void d(int i7, int i8, Notification notification);

        void e(int i7, Notification notification);
    }

    a(Context context) {
        this.f1536f = context;
        i k7 = i.k(context);
        this.f1537g = k7;
        n0.a p7 = k7.p();
        this.f1538h = p7;
        this.f1540j = null;
        this.f1541k = new LinkedHashMap();
        this.f1543m = new HashSet();
        this.f1542l = new HashMap();
        this.f1544n = new d(this.f1536f, p7, this);
        this.f1537g.m().d(this);
    }

    public static Intent b(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent f(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        j.c().d(f1535p, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f1537g.f(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.c().a(f1535p, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f1545o == null) {
            return;
        }
        this.f1541k.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f1540j)) {
            this.f1540j = stringExtra;
            this.f1545o.d(intExtra, intExtra2, notification);
            return;
        }
        this.f1545o.e(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, e>> it = this.f1541k.entrySet().iterator();
        while (it.hasNext()) {
            i7 |= it.next().getValue().a();
        }
        e eVar = this.f1541k.get(this.f1540j);
        if (eVar != null) {
            this.f1545o.d(eVar.c(), i7, eVar.b());
        }
    }

    private void i(Intent intent) {
        j.c().d(f1535p, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f1538h.b(new RunnableC0031a(this.f1537g.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // e0.b
    public void a(String str, boolean z6) {
        Map.Entry<String, e> next;
        synchronized (this.f1539i) {
            p remove = this.f1542l.remove(str);
            if (remove != null ? this.f1543m.remove(remove) : false) {
                this.f1544n.d(this.f1543m);
            }
        }
        e remove2 = this.f1541k.remove(str);
        if (str.equals(this.f1540j) && this.f1541k.size() > 0) {
            Iterator<Map.Entry<String, e>> it = this.f1541k.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f1540j = next.getKey();
            if (this.f1545o != null) {
                e value = next.getValue();
                this.f1545o.d(value.c(), value.a(), value.b());
                this.f1545o.c(value.c());
            }
        }
        b bVar = this.f1545o;
        if (remove2 == null || bVar == null) {
            return;
        }
        j.c().a(f1535p, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.c(remove2.c());
    }

    @Override // h0.c
    public void c(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            j.c().a(f1535p, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f1537g.w(str);
        }
    }

    @Override // h0.c
    public void e(List<String> list) {
    }

    void j(Intent intent) {
        j.c().d(f1535p, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f1545o;
        if (bVar != null) {
            bVar.B();
        }
    }

    void k() {
        this.f1545o = null;
        synchronized (this.f1539i) {
            this.f1544n.e();
        }
        this.f1537g.m().i(this);
    }

    void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                g(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    j(intent);
                    return;
                }
                return;
            }
        }
        h(intent);
    }

    void m(b bVar) {
        if (this.f1545o != null) {
            j.c().b(f1535p, "A callback already exists.", new Throwable[0]);
        } else {
            this.f1545o = bVar;
        }
    }
}
