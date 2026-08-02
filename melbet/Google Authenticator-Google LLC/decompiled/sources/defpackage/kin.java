package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kin extends jwx {
    public final String b;
    final /* synthetic */ kiq c;
    public final AtomicReference a = new AtomicReference(kiq.e);
    private final jwx d = new kik(this);

    public kin(kiq kiqVar, String str) {
        this.c = kiqVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.jwx
    public final String a() {
        return this.b;
    }

    @Override // defpackage.jwx
    public final iws b(kae kaeVar, jww jwwVar) {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        jym jymVar = kiq.e;
        if (obj != jymVar) {
            return d(kaeVar, jwwVar);
        }
        kiq kiqVar = this.c;
        kgf kgfVar = new kgf(this, 14);
        kbw kbwVar = kiqVar.m;
        kbwVar.execute(kgfVar);
        if (atomicReference.get() != jymVar) {
            return d(kaeVar, jwwVar);
        }
        if (kiqVar.A.get()) {
            return new kil();
        }
        kim kimVar = new kim(this, jxr.k(), kaeVar, jwwVar);
        kbwVar.execute(new kga(this, kimVar, 15, null));
        return kimVar;
    }

    final void c(jym jymVar) {
        Collection collection;
        AtomicReference atomicReference = this.a;
        jym jymVar2 = (jym) atomicReference.get();
        atomicReference.set(jymVar);
        if (jymVar2 != kiq.e || (collection = this.c.w) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((kim) it.next()).k();
        }
    }

    public final iws d(kae kaeVar, jww jwwVar) {
        jym jymVar = (jym) this.a.get();
        if (jymVar == null) {
            return this.d.b(kaeVar, jwwVar);
        }
        if (!(jymVar instanceof kiy)) {
            return new kie(jymVar, this.d, this.c.k, kaeVar, jwwVar);
        }
        kix b = ((kiy) jymVar).b.b(kaeVar);
        if (b != null) {
            jwwVar = jwwVar.d(kix.a, b);
        }
        return this.d.b(kaeVar, jwwVar);
    }
}
