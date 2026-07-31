package o0;

import H1.A;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k.RunnableC0460t;
import l0.q;
import m0.j;
import q0.InterfaceC0594b;
import u0.C0680j;
import u0.C0686p;
import v0.k;
import v0.m;
import v0.s;

/* loaded from: classes.dex */
public final class g implements InterfaceC0594b, s {

    /* renamed from: r, reason: collision with root package name */
    public static final String f5579r = q.f("DelayMetCommandHandler");

    /* renamed from: f, reason: collision with root package name */
    public final Context f5580f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5581g;

    /* renamed from: h, reason: collision with root package name */
    public final C0680j f5582h;

    /* renamed from: i, reason: collision with root package name */
    public final i f5583i;

    /* renamed from: j, reason: collision with root package name */
    public final B0.c f5584j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5585k;

    /* renamed from: l, reason: collision with root package name */
    public int f5586l;

    /* renamed from: m, reason: collision with root package name */
    public final k f5587m;

    /* renamed from: n, reason: collision with root package name */
    public final D0.q f5588n;

    /* renamed from: o, reason: collision with root package name */
    public PowerManager.WakeLock f5589o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5590p;

    /* renamed from: q, reason: collision with root package name */
    public final j f5591q;

    public g(Context context, int i7, i iVar, j jVar) {
        this.f5580f = context;
        this.f5581g = i7;
        this.f5583i = iVar;
        this.f5582h = jVar.f5358a;
        this.f5591q = jVar;
        A a7 = iVar.f5599j.f5382j;
        B0.c cVar = (B0.c) iVar.f5596g;
        this.f5587m = (k) cVar.f72h;
        this.f5588n = (D0.q) cVar.f71g;
        this.f5584j = new B0.c(a7, this);
        this.f5590p = false;
        this.f5586l = 0;
        this.f5585k = new Object();
    }

    public static void a(g gVar) {
        int i7 = gVar.f5581g;
        D0.q qVar = gVar.f5588n;
        Context context = gVar.f5580f;
        i iVar = gVar.f5583i;
        C0680j c0680j = gVar.f5582h;
        String str = c0680j.f5985a;
        int i8 = gVar.f5586l;
        String str2 = f5579r;
        if (i8 >= 2) {
            q.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f5586l = 2;
        q.d().a(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.c(intent, c0680j);
        qVar.execute(new RunnableC0460t(iVar, intent, i7, 1));
        if (!iVar.f5598i.c(str)) {
            q.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        q.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.c(intent2, c0680j);
        qVar.execute(new RunnableC0460t(iVar, intent2, i7, 1));
    }

    public final void b() {
        synchronized (this.f5585k) {
            try {
                this.f5584j.x();
                this.f5583i.f5597h.a(this.f5582h);
                PowerManager.WakeLock wakeLock = this.f5589o;
                if (wakeLock != null && wakeLock.isHeld()) {
                    q.d().a(f5579r, "Releasing wakelock " + this.f5589o + "for WorkSpec " + this.f5582h);
                    this.f5589o.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q0.InterfaceC0594b
    public final void c(ArrayList arrayList) {
        this.f5587m.execute(new f(this, 0));
    }

    @Override // q0.InterfaceC0594b
    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (i6.g.n((C0686p) it.next()).equals(this.f5582h)) {
                this.f5587m.execute(new f(this, 1));
                return;
            }
        }
    }

    public final void e() {
        String str = this.f5582h.f5985a;
        this.f5589o = m.a(this.f5580f, str + " (" + this.f5581g + ")");
        q d7 = q.d();
        String str2 = "Acquiring wakelock " + this.f5589o + "for WorkSpec " + str;
        String str3 = f5579r;
        d7.a(str3, str2);
        this.f5589o.acquire();
        C0686p g7 = this.f5583i.f5599j.f5375c.t().g(str);
        if (g7 == null) {
            this.f5587m.execute(new f(this, 0));
            return;
        }
        boolean b7 = g7.b();
        this.f5590p = b7;
        if (b7) {
            this.f5584j.w(Collections.singletonList(g7));
            return;
        }
        q.d().a(str3, "No constraints for " + str);
        d(Collections.singletonList(g7));
    }

    public final void f(boolean z5) {
        q d7 = q.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        C0680j c0680j = this.f5582h;
        sb.append(c0680j);
        sb.append(", ");
        sb.append(z5);
        d7.a(f5579r, sb.toString());
        b();
        int i7 = this.f5581g;
        i iVar = this.f5583i;
        D0.q qVar = this.f5588n;
        Context context = this.f5580f;
        if (z5) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.c(intent, c0680j);
            qVar.execute(new RunnableC0460t(iVar, intent, i7, 1));
        }
        if (this.f5590p) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            qVar.execute(new RunnableC0460t(iVar, intent2, i7, 1));
        }
    }
}
