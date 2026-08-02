package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifr extends jya {
    private final AtomicReference a;

    public ifr(iws iwsVar) {
        super(iwsVar);
        this.a = new AtomicReference(new bsh(1, (Object) null));
    }

    @Override // defpackage.jyb, defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        AtomicReference atomicReference;
        bsh bshVar;
        int i;
        do {
            atomicReference = this.a;
            bshVar = (bsh) atomicReference.get();
            i = bshVar.a;
        } while (!a.a(atomicReference, bshVar, i == 1 ? new bsh(2, (Object) null) : bshVar));
        if (i == 1) {
            this.c.a(iwrVar, kaaVar);
        } else if (i == 4) {
            iwrVar.a((kbq) bshVar.b, new kaa());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.c.r("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.kau, defpackage.iws
    public final void c() {
        AtomicReference atomicReference;
        bsh bshVar;
        do {
            atomicReference = this.a;
            bshVar = (bsh) atomicReference.get();
            if (bshVar.a != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!a.a(atomicReference, bshVar, new bsh(3, (Object) null)));
        this.c.c();
    }

    @Override // defpackage.kau, defpackage.iws
    public final void d(int i) {
        int i2 = ((bsh) this.a.get()).a;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        this.c.d(i);
    }

    @Override // defpackage.jyb, defpackage.iws
    public final void e(Object obj) {
        obj.getClass();
        int i = ((bsh) this.a.get()).a;
        if (i == 2) {
            this.c.e(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }

    @Override // defpackage.kau, defpackage.iws
    public final void r(String str, Throwable th) {
        AtomicReference atomicReference;
        bsh bshVar;
        int i;
        kbq kbqVar = kbq.c;
        if (str != null) {
            kbqVar = kbqVar.e(str);
        }
        if (th != null) {
            kbqVar = kbqVar.d(th);
        }
        do {
            atomicReference = this.a;
            bshVar = (bsh) atomicReference.get();
            i = bshVar.a;
        } while (!a.a(atomicReference, bshVar, i == 4 ? bshVar : i == 1 ? bsh.f(4, kbqVar) : bsh.f(5, kbqVar)));
        this.c.r(str, th);
    }
}
