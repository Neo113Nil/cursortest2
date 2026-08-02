package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dth implements kzr {
    final /* synthetic */ dtj a;
    final /* synthetic */ kvm b;

    public dth(dtj dtjVar, kvm kvmVar) {
        this.a = dtjVar;
        this.b = kvmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.concurrent.CancellationException, kqj, kqn] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.kzr
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(ehv ehvVar, kqj kqjVar) {
        dtg dtgVar;
        int i;
        ?? r5;
        eht ehtVar;
        lao laoVar;
        ehv ehvVar2;
        jfr jfrVar;
        jfr jfrVar2;
        if (kqjVar instanceof dtg) {
            dtgVar = (dtg) kqjVar;
            int i2 = dtgVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dtgVar.d = i2 - Integer.MIN_VALUE;
                Object obj = dtgVar.b;
                kqp kqpVar = kqp.a;
                i = dtgVar.d;
                if (i != 0) {
                    ixc.Y(obj);
                    dtj dtjVar = this.a;
                    dtjVar.b = ehvVar;
                    if (ehvVar instanceof eht) {
                        dui duiVar = dtjVar.a;
                        duq duqVar = duiVar.a;
                        jfr jfrVar3 = duqVar.h().k;
                        Object b = duqVar.d.b();
                        b.getClass();
                        kvm kvmVar = this.b;
                        fym fymVar = (fym) b;
                        eht ehtVar2 = (eht) ehvVar;
                        dvq b2 = duqVar.b();
                        dvi a = duqVar.a();
                        kvmVar.getClass();
                        ehtVar2.getClass();
                        ehs ehsVar = ehtVar2.a;
                        ehr ehrVar = ehsVar != null ? ehsVar.a : null;
                        gjl gjlVar = duiVar.d;
                        if (jtp.e((Context) fymVar.a)) {
                            r5 = 0;
                            laoVar = new dvv(fymVar, kvmVar, ehtVar2, gjlVar, ehrVar, a).d;
                            ehtVar = ehtVar2;
                        } else {
                            r5 = 0;
                            ehtVar = ehtVar2;
                            laoVar = new dvu(fymVar, kvmVar, ehrVar, ehtVar2.b, gjlVar, b2).g;
                        }
                        kwu kwuVar = dtjVar.e;
                        if (kwuVar != 0) {
                            kwuVar.s(r5);
                        }
                        dtjVar.e = ixg.i(kvmVar, r5, 0, new alg(laoVar, dtjVar, (kqj) r5, 8), 3);
                        dtd h = duqVar.h();
                        dtgVar.a = ehvVar;
                        dtgVar.e = jfrVar3;
                        dtgVar.d = 1;
                        obj = h.a(ehtVar, dtgVar);
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                        ehvVar2 = ehvVar;
                        jfrVar = jfrVar3;
                    }
                    return kow.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jfrVar = dtgVar.e;
                Object obj2 = dtgVar.a;
                ixc.Y(obj);
                ehvVar2 = obj2;
                jfrVar2 = (jfr) obj;
                if (!ksp.b(jfrVar2, jfrVar)) {
                    dtj.a(this.a, ehvVar2, jfrVar2, null, null, null, null, 60);
                }
                return kow.a;
            }
        }
        dtgVar = new dtg(this, kqjVar);
        Object obj3 = dtgVar.b;
        kqp kqpVar2 = kqp.a;
        i = dtgVar.d;
        if (i != 0) {
        }
        jfrVar2 = (jfr) obj3;
        if (!ksp.b(jfrVar2, jfrVar)) {
        }
        return kow.a;
    }
}
