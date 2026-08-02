package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvs implements Runnable {
    final /* synthetic */ gut a;
    final /* synthetic */ Runnable b;

    public gvs(gut gutVar, Runnable runnable) {
        this.a = gutVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [guq, gut] */
    @Override // java.lang.Runnable
    public final void run() {
        guq g = gta.g(gta.a(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
