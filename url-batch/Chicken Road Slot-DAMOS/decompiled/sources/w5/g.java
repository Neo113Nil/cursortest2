package w5;

import a1.n;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c6.j;
import c6.p;
import d6.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements y5.b {
    public static final String A = o.f("DelayMetCommandHandler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f10093d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10094e;

    /* renamed from: i, reason: collision with root package name */
    public final j f10095i;

    /* renamed from: r, reason: collision with root package name */
    public final i f10096r;

    /* renamed from: s, reason: collision with root package name */
    public final p.e f10097s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f10098t;

    /* renamed from: u, reason: collision with root package name */
    public int f10099u;

    /* renamed from: v, reason: collision with root package name */
    public final l f10100v;

    /* renamed from: w, reason: collision with root package name */
    public final f6.b f10101w;

    /* renamed from: x, reason: collision with root package name */
    public PowerManager.WakeLock f10102x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10103y;

    /* renamed from: z, reason: collision with root package name */
    public final u5.i f10104z;

    public g(Context context, int i3, i iVar, u5.i iVar2) {
        this.f10093d = context;
        this.f10094e = i3;
        this.f10096r = iVar;
        this.f10095i = iVar2.f9636a;
        this.f10104z = iVar2;
        c6.i iVar3 = iVar.f10112s.j;
        n nVar = (n) iVar.f10109e;
        this.f10100v = (l) nVar.f41i;
        this.f10101w = (f6.b) nVar.f42r;
        this.f10097s = new p.e(iVar3, this);
        this.f10103y = false;
        this.f10099u = 0;
        this.f10098t = new Object();
    }

    public static void a(g gVar) {
        int i3 = gVar.f10094e;
        f6.b bVar = gVar.f10101w;
        Context context = gVar.f10093d;
        i iVar = gVar.f10096r;
        j jVar = gVar.f10095i;
        String str = jVar.f1824a;
        int i10 = gVar.f10099u;
        String str2 = A;
        if (i10 >= 2) {
            o.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f10099u = 2;
        o.d().a(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.c(intent, jVar);
        bVar.execute(new b6.c(i3, 2, iVar, intent));
        if (!iVar.f10111r.c(str)) {
            o.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        o.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.c(intent2, jVar);
        bVar.execute(new b6.c(i3, 2, iVar, intent2));
    }

    @Override // y5.b
    public final void b(ArrayList arrayList) {
        this.f10100v.execute(new f(this, 0));
    }

    @Override // y5.b
    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (g8.b.A((p) it.next()).equals(this.f10095i)) {
                this.f10100v.execute(new f(this, 1));
                return;
            }
        }
    }

    public final void d() {
        synchronized (this.f10098t) {
            try {
                this.f10097s.h();
                this.f10096r.f10110i.a(this.f10095i);
                PowerManager.WakeLock wakeLock = this.f10102x;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.d().a(A, "Releasing wakelock " + this.f10102x + "for WorkSpec " + this.f10095i);
                    this.f10102x.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        String str = this.f10095i.f1824a;
        this.f10102x = d6.o.a(this.f10093d, str + " (" + this.f10094e + ")");
        o d10 = o.d();
        String str2 = "Acquiring wakelock " + this.f10102x + "for WorkSpec " + str;
        String str3 = A;
        d10.a(str3, str2);
        this.f10102x.acquire();
        p k10 = this.f10096r.f10112s.f9651c.B().k(str);
        if (k10 == null) {
            this.f10100v.execute(new f(this, 0));
            return;
        }
        boolean b10 = k10.b();
        this.f10103y = b10;
        if (b10) {
            this.f10097s.g(Collections.singletonList(k10));
            return;
        }
        o.d().a(str3, "No constraints for " + str);
        c(Collections.singletonList(k10));
    }

    public final void f(boolean z10) {
        o d10 = o.d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        j jVar = this.f10095i;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z10);
        d10.a(A, sb2.toString());
        d();
        int i3 = this.f10094e;
        i iVar = this.f10096r;
        f6.b bVar = this.f10101w;
        Context context = this.f10093d;
        if (z10) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.c(intent, jVar);
            bVar.execute(new b6.c(i3, 2, iVar, intent));
        }
        if (this.f10103y) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            bVar.execute(new b6.c(i3, 2, iVar, intent2));
        }
    }
}
