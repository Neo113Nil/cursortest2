package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdk implements Runnable {
    final /* synthetic */ bdn a;
    private final blg b;
    private final /* synthetic */ int c;

    public bdk(bdn bdnVar, blg blgVar, int i) {
        this.c = i;
        this.a = bdnVar;
        this.b = blgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bcs bcsVar;
        int i = this.c;
        blg blgVar = this.b;
        if (i != 0) {
            synchronized (blgVar.a()) {
                bdn bdnVar = this.a;
                synchronized (bdnVar) {
                    if (bdnVar.a.d(blgVar)) {
                        try {
                            blgVar.d(bdnVar.g, 5);
                        } finally {
                        }
                    }
                    bdnVar.c();
                }
            }
            return;
        }
        synchronized (blgVar.a()) {
            bdn bdnVar2 = this.a;
            synchronized (bdnVar2) {
                if (bdnVar2.a.d(blgVar)) {
                    bdnVar2.i.d();
                    try {
                        blgVar.g(bdnVar2.i, bdnVar2.k);
                        this.a.h(this.b);
                    } finally {
                    }
                }
                this.a.c();
            }
        }
    }
}
