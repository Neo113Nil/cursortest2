package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klp implements kmb {
    public final jxk a;
    private final Executor b;
    private final Executor c;
    private final kma d;
    private kmb e;

    public klp(Executor executor, Executor executor2, kma kmaVar, jxk jxkVar) {
        this.b = executor;
        this.c = executor2;
        this.d = kmaVar;
        this.a = jxkVar;
    }

    @Override // defpackage.kmb
    public final void a(kbq kbqVar) {
        int i = kob.a;
        if (!kbqVar.g()) {
            Throwable th = kbqVar.q;
            if (th == null) {
                kbq e = kbq.c.e("RPC cancelled");
                jzw jzwVar = jyt.a;
                th = new jyu(e);
            }
            this.c.execute(new auf(this.a, th, 3));
        }
        this.b.execute(new kll(this, kbqVar));
    }

    @Override // defpackage.kmb
    public final void b() {
        int i = kob.a;
        this.b.execute(new klm(this));
    }

    public final kmb c() {
        kmb kmbVar = this.e;
        if (kmbVar != null) {
            return kmbVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.kmp
    public final void d(kmo kmoVar) {
        int i = kob.a;
        this.b.execute(new kln(this, kmoVar));
    }

    @Override // defpackage.kmp
    public final void e() {
        int i = kob.a;
        this.b.execute(new klo(this));
    }

    public final void f(Throwable th) {
        this.d.d(kbq.d.e("Application error processing RPC").d(th), new kaa());
    }

    final void g(kmb kmbVar) {
        kmbVar.getClass();
        hoq.I(this.e == null, "Listener already set");
        this.e = kmbVar;
    }
}
