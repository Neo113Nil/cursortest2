package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evl {
    private final AtomicReferenceArray a;
    private final fwm b;

    public evl(fwm fwmVar, int i) {
        this.b = fwmVar;
        this.a = new AtomicReferenceArray(i);
    }

    public final eva a(int i, String str, long j) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        eva evaVar = (eva) atomicReferenceArray.get(i);
        if (evaVar != null) {
            return evaVar;
        }
        eva m = this.b.m(str, j);
        if (eos.K(atomicReferenceArray, i, m)) {
            return m;
        }
        eva evaVar2 = (eva) atomicReferenceArray.get(i);
        evaVar2.getClass();
        return evaVar2;
    }

    public final eva b(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        eva evaVar = (eva) atomicReferenceArray.get(i);
        if (evaVar != null) {
            return evaVar;
        }
        eva n = this.b.n(str, z);
        if (eos.K(atomicReferenceArray, i, n)) {
            return n;
        }
        eva evaVar2 = (eva) atomicReferenceArray.get(i);
        evaVar2.getClass();
        return evaVar2;
    }

    public final eva c(int i, String str, eum eumVar, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        eva evaVar = (eva) atomicReferenceArray.get(i);
        if (evaVar != null) {
            return evaVar;
        }
        eva o = this.b.o(str, eumVar, str2);
        if (eos.K(atomicReferenceArray, i, o)) {
            return o;
        }
        eva evaVar2 = (eva) atomicReferenceArray.get(i);
        evaVar2.getClass();
        return evaVar2;
    }
}
