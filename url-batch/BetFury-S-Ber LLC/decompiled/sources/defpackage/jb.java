package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jb extends iw {
    public final /* synthetic */ int j;
    public final Object k;

    public /* synthetic */ jb(int i, Object obj) {
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.iw
    public final boolean k() {
        switch (this.j) {
        }
        return false;
    }

    @Override // defpackage.iw
    public final void l(Throwable th) {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                ka kaVar = (ka) obj;
                Throwable t = kaVar.t(j());
                if (kaVar.x()) {
                    ek ekVar = (ek) kaVar.i;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ek.m;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater.get(ekVar);
                        lm lmVar = mv.i;
                        if (mv.c(obj2, lmVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(ekVar, lmVar, t)) {
                                if (atomicReferenceFieldUpdater.get(ekVar) != lmVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj2 instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(ekVar, obj2, null)) {
                                if (atomicReferenceFieldUpdater.get(ekVar) != obj2) {
                                    break;
                                }
                            }
                        }
                    }
                }
                kaVar.q(t);
                if (!kaVar.x()) {
                    kaVar.r();
                    break;
                }
                break;
            case 1:
                ((nk) obj).a();
                break;
            case 2:
                ((tv) obj).h(th);
                break;
            default:
                Object obj3 = mw.f.get(j());
                jw jwVar = (jw) obj;
                if (!(obj3 instanceof ld)) {
                    jwVar.e(n9.T(obj3));
                    break;
                } else {
                    Throwable th2 = ((ld) obj3).a;
                    th2.getClass();
                    jwVar.e(new z90(th2));
                    break;
                }
        }
    }
}
