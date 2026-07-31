package androidx.work.impl.background.systemalarm;

import android.content.Context;
import d0.j;
import l0.p;

/* loaded from: classes.dex */
public class f implements e0.e {

    /* renamed from: g, reason: collision with root package name */
    private static final String f1514g = j.f("SystemAlarmScheduler");

    /* renamed from: f, reason: collision with root package name */
    private final Context f1515f;

    public f(Context context) {
        this.f1515f = context.getApplicationContext();
    }

    private void a(p pVar) {
        j.c().a(f1514g, String.format("Scheduling work with workSpecId %s", pVar.f18477a), new Throwable[0]);
        this.f1515f.startService(b.f(this.f1515f, pVar.f18477a));
    }

    @Override // e0.e
    public void b(String str) {
        this.f1515f.startService(b.g(this.f1515f, str));
    }

    @Override // e0.e
    public void d(p... pVarArr) {
        for (p pVar : pVarArr) {
            a(pVar);
        }
    }

    @Override // e0.e
    public boolean f() {
        return true;
    }
}
