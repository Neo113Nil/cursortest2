package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import d0.j;
import java.util.HashMap;
import java.util.Map;
import l0.p;

/* loaded from: classes.dex */
public class b implements e0.b {

    /* renamed from: i, reason: collision with root package name */
    private static final String f1479i = j.f("CommandHandler");

    /* renamed from: f, reason: collision with root package name */
    private final Context f1480f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, e0.b> f1481g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f1482h = new Object();

    b(Context context) {
        this.f1480f = context;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z6) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i7, e eVar) {
        j.c().a(f1479i, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f1480f, i7, eVar).a();
    }

    private void i(Intent intent, int i7, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f1482h) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            j c7 = j.c();
            String str = f1479i;
            c7.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f1481g.containsKey(string)) {
                j.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                d dVar = new d(this.f1480f, i7, string, eVar);
                this.f1481g.put(string, dVar);
                dVar.f();
            }
        }
    }

    private void j(Intent intent, int i7) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z6 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        j.c().a(f1479i, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
        a(string, z6);
    }

    private void k(Intent intent, int i7, e eVar) {
        j.c().a(f1479i, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
        eVar.g().s();
    }

    private void l(Intent intent, int i7, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j c7 = j.c();
        String str = f1479i;
        c7.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase o7 = eVar.g().o();
        o7.c();
        try {
            p l7 = o7.B().l(string);
            if (l7 == null) {
                j.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (l7.f18478b.b()) {
                j.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long a7 = l7.a();
            if (l7.b()) {
                j.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a7)), new Throwable[0]);
                a.c(this.f1480f, eVar.g(), string, a7);
                eVar.k(new e.b(eVar, b(this.f1480f), i7));
            } else {
                j.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a7)), new Throwable[0]);
                a.c(this.f1480f, eVar.g(), string, a7);
            }
            o7.r();
        } finally {
            o7.g();
        }
    }

    private void m(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j.c().a(f1479i, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().x(string);
        a.a(this.f1480f, eVar.g(), string);
        eVar.a(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // e0.b
    public void a(String str, boolean z6) {
        synchronized (this.f1482h) {
            e0.b remove = this.f1481g.remove(str);
            if (remove != null) {
                remove.a(str, z6);
            }
        }
    }

    boolean o() {
        boolean z6;
        synchronized (this.f1482h) {
            z6 = !this.f1481g.isEmpty();
        }
        return z6;
    }

    void p(Intent intent, int i7, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i7, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i7, eVar);
            return;
        }
        if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            j.c().b(f1479i, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i7, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i7, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i7);
        } else {
            j.c().h(f1479i, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
