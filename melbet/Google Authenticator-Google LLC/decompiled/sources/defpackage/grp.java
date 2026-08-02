package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grp implements grn {
    final /* synthetic */ gpt a;
    final /* synthetic */ ldt b;
    final /* synthetic */ ikj c;

    public grp(ldt ldtVar, gpt gptVar, ikj ikjVar) {
        this.b = ldtVar;
        this.a = gptVar;
        this.c = ikjVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.grn
    public final hvi a(hvi hviVar, Duration duration) {
        String b = this.a.b();
        ldt ldtVar = this.b;
        return !((Boolean) ldtVar.a).booleanValue() ? hve.a : hti.f(((gnp) ldtVar.e).a(), gvx.a(new gcw(ldtVar, hviVar, duration, b, 2)), ldtVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.grn
    public final hvi b() {
        ldt ldtVar = this.b;
        if (!((Boolean) ldtVar.a).booleanValue()) {
            return hve.a;
        }
        return hti.f(((gnp) ldtVar.e).a(), gvx.a(new grt(ldtVar, this.a, this.c, 0)), ldtVar.d);
    }
}
