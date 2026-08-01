package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class de {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(de.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(de.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public de(uc0 uc0Var) {
        this._prev$volatile = uc0Var;
    }

    public abstract boolean a();

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj = atomicReferenceFieldUpdater.get(this);
        lm lmVar = d50.b;
        if ((obj == lmVar ? null : (de) obj) == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            de deVar = (de) atomicReferenceFieldUpdater2.get(this);
            while (deVar != null && deVar.a()) {
                deVar = (de) atomicReferenceFieldUpdater2.get(deVar);
            }
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            de deVar2 = obj2 == lmVar ? null : (de) obj2;
            deVar2.getClass();
            while (deVar2.a()) {
                Object obj3 = atomicReferenceFieldUpdater.get(deVar2);
                de deVar3 = obj3 == lmVar ? null : (de) obj3;
                if (deVar3 == null) {
                    break;
                } else {
                    deVar2 = deVar3;
                }
            }
            while (true) {
                Object obj4 = atomicReferenceFieldUpdater2.get(deVar2);
                de deVar4 = ((de) obj4) == null ? null : deVar;
                while (!atomicReferenceFieldUpdater2.compareAndSet(deVar2, obj4, deVar4)) {
                    if (atomicReferenceFieldUpdater2.get(deVar2) != obj4) {
                        break;
                    }
                }
            }
            if (deVar != null) {
                atomicReferenceFieldUpdater.set(deVar, deVar2);
            }
            if (deVar2.a()) {
                Object obj5 = atomicReferenceFieldUpdater.get(deVar2);
                if ((obj5 == lmVar ? null : (de) obj5) != null) {
                    continue;
                }
            }
            if (deVar == null || !deVar.a()) {
                return;
            }
        }
    }
}
