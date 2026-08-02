package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbu implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public kbu(kbw kbwVar, kbv kbvVar, Runnable runnable, int i) {
        this.d = i;
        this.a = kbvVar;
        this.b = runnable;
        this.c = kbwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            ((kbw) this.c).execute(this.a);
        } else {
            if (((gwm) ((ksw) this.b).a) != null) {
                throw null;
            }
            ?? r0 = this.a;
            ?? r2 = this.c;
            guq g = gta.g(gta.a(), r0);
            try {
                r2.run();
            } finally {
            }
        }
    }

    public final String toString() {
        if (this.d == 0) {
            return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
        }
        return "propagating=[" + this.c + "]";
    }

    public kbu(ksw kswVar, guq guqVar, Runnable runnable, int i) {
        this.d = i;
        this.b = kswVar;
        this.a = guqVar;
        this.c = runnable;
    }
}
