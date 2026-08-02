package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkr extends jxb {
    long a;
    final /* synthetic */ kky b;
    private final kkw c;

    public kkr(kky kkyVar, kkw kkwVar) {
        this.b = kkyVar;
        this.c = kkwVar;
    }

    @Override // defpackage.ixj
    public final void c(long j) {
        kky kkyVar = this.b;
        if (kkyVar.r.f != null) {
            return;
        }
        synchronized (kkyVar.m) {
            if (kkyVar.r.f == null) {
                kkw kkwVar = this.c;
                if (!kkwVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    long j3 = kkyVar.v;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > kkyVar.n) {
                        kkwVar.c = true;
                    } else {
                        long B = kkyVar.G.B(j2 - j3);
                        kkyVar.v = this.a;
                        if (B > kkyVar.o) {
                            kkwVar.c = true;
                        }
                    }
                    Runnable c = kkwVar.c ? kkyVar.c(kkwVar) : null;
                    if (c != null) {
                        c.run();
                    }
                }
            }
        }
    }
}
