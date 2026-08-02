package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ken extends jzh {
    final jyz a;
    final jyp b;
    final kew c;
    final kex d;
    List e;
    khu f;
    boolean g;
    boolean h;
    final /* synthetic */ kiq i;
    kuq j;

    public ken(kiq kiqVar, jyz jyzVar) {
        this.i = kiqVar;
        this.e = jyzVar.a;
        this.a = jyzVar;
        jyp b = jyp.b("Subchannel", kiqVar.a());
        this.b = b;
        kex kexVar = new kex(b, kiqVar.l.a(), "Subchannel for ".concat(jyzVar.a.toString()));
        this.d = kexVar;
        this.c = new kew(kexVar, kiqVar.l);
    }

    @Override // defpackage.jzh
    public final void a() {
        this.i.m.c();
        hoq.I(this.g, "not started");
        if (this.h) {
            return;
        }
        this.f.a();
    }

    @Override // defpackage.jzh
    public final void b() {
        kuq kuqVar;
        kiq kiqVar = this.i;
        kbw kbwVar = kiqVar.m;
        kbwVar.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!kiqVar.B || (kuqVar = this.j) == null) {
                return;
            }
            kuqVar.c();
            this.j = null;
        }
        if (kiqVar.B) {
            this.f.f(kiq.b);
        } else {
            this.j = kbwVar.d(new khw(new kgf(this, 16)), 5L, TimeUnit.SECONDS, kiqVar.i.a());
        }
    }

    @Override // defpackage.jzh
    public final void c(jzj jzjVar) {
        kiq kiqVar = this.i;
        kbw kbwVar = kiqVar.m;
        kbwVar.c();
        hoq.I(!this.g, "already started");
        hoq.I(!this.h, "already shutdown");
        hoq.I(!kiqVar.B, "Channel is being terminated");
        this.g = true;
        String a = kiqVar.a();
        kfl kflVar = kiqVar.i;
        ScheduledExecutorService a2 = kflVar.a();
        khq khqVar = new khq(this, jzjVar);
        kev a3 = kiqVar.D.a();
        kag kagVar = kiqVar.t.b.S;
        jyp jypVar = this.b;
        kew kewVar = this.c;
        List list = kiqVar.p;
        jyz jyzVar = this.a;
        String str = kiqVar.q;
        jyl jylVar = kiqVar.H;
        khu khuVar = new khu(jyzVar, a, str, kflVar, a2, kbwVar, khqVar, jylVar, a3, jypVar, kewVar, list, kiqVar.h, kagVar);
        jyh jyhVar = new jyh();
        jyhVar.a = "Child Subchannel started";
        jyhVar.b = jyi.b;
        jyhVar.b(kiqVar.l.a());
        jyhVar.d = khuVar;
        kiqVar.F.b(jyhVar.a());
        this.f = khuVar;
        jyl.b(jylVar.d, khuVar);
        kiqVar.v.add(khuVar);
    }

    @Override // defpackage.jzh
    public final void d(List list) {
        this.i.m.c();
        this.e = list;
        khu khuVar = this.f;
        list.getClass();
        khu.i(list);
        hoq.y(!list.isEmpty(), "newAddressGroups is empty");
        khuVar.g.execute(new kga(khuVar, DesugarCollections.unmodifiableList(new ArrayList(list)), 11));
    }

    public final String toString() {
        return this.b.toString();
    }
}
