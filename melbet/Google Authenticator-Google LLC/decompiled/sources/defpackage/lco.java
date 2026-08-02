package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lco extends kvj implements kvu {
    public final kvj a;
    public final kui d;
    public final Object e;
    private final /* synthetic */ kvu f;
    private final int g;
    private final bst h;

    /* JADX WARN: Multi-variable type inference failed */
    public lco(kvj kvjVar, int i) {
        kvu kvuVar = kvjVar instanceof kvu ? (kvu) kvjVar : null;
        this.f = kvuVar == null ? kvr.a : kvuVar;
        this.a = kvjVar;
        this.g = i;
        this.d = new kui(0, kul.a);
        this.h = new bst((char[]) null);
        this.e = new Object();
    }

    private final boolean i() {
        synchronized (this.e) {
            kui kuiVar = this.d;
            if (kuiVar.b >= this.g) {
                return false;
            }
            kuiVar.c();
            return true;
        }
    }

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        Runnable e;
        this.h.z(runnable);
        if (this.d.b >= this.g || !i() || (e = e()) == null) {
            return;
        }
        try {
            lcd.b(this.a, this, new lcn(this, e));
        } catch (Throwable th) {
            this.d.a();
            throw th;
        }
    }

    @Override // defpackage.kvu
    public final void c(long j, kuv kuvVar) {
        this.f.c(j, kuvVar);
    }

    public final Runnable e() {
        while (true) {
            bst bstVar = this.h;
            Runnable runnable = (Runnable) bstVar.x();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.e) {
                kui kuiVar = this.d;
                kuiVar.a();
                if (bstVar.w() == 0) {
                    return null;
                }
                kuiVar.c();
            }
        }
    }

    @Override // defpackage.kvj
    public final void f(kqn kqnVar, Runnable runnable) {
        Runnable e;
        this.h.z(runnable);
        if (this.d.b >= this.g || !i() || (e = e()) == null) {
            return;
        }
        try {
            this.a.f(this, new lcn(this, e));
        } catch (Throwable th) {
            this.d.a();
            throw th;
        }
    }

    @Override // defpackage.kvu
    public final kwc h(long j, Runnable runnable, kqn kqnVar) {
        return this.f.h(j, runnable, kqnVar);
    }

    @Override // defpackage.kvj
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.g + ")";
    }
}
