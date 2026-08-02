package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfa implements hut {
    final /* synthetic */ dfb a;
    final /* synthetic */ long b;

    public dfa(dfb dfbVar, long j) {
        this.a = dfbVar;
        this.b = j;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        th.getClass();
        ((hkf) ((hkf) dfb.a.f()).h(th).i("com/google/android/libraries/androidatgoogle/privacy/lifecycle/PrivacyScreenProcessObserver$onStop$<anonymous>", "onFailure", 58, "PrivacyScreenProcessObserver.kt")).s("Failed to set Privacy Screen 'user exited' timestamp");
    }

    @Override // defpackage.hut
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dfe dfeVar = (dfe) obj;
        dfeVar.getClass();
        dfg dfgVar = dfeVar.c;
        if (dfgVar == null) {
            dfgVar = dfg.a;
        }
        final long j = dfgVar.c ? this.b : 0L;
        hnu.aS(dih.t(((dev) this.a.b.a).e().f(), new ccb(new krt() { // from class: dex
            @Override // defpackage.krt
            public final Object a(Object obj2) {
                dfe dfeVar2 = (dfe) obj2;
                dfeVar2.getClass();
                jkj C = dfeVar2.C();
                if (!C.b.M()) {
                    C.t();
                }
                long j2 = j;
                dfe dfeVar3 = (dfe) C.b;
                dfeVar3.b |= 2;
                dfeVar3.d = j2;
                return (dfe) C.q();
            }
        }, 15)), new dkp(1), huf.a);
    }
}
