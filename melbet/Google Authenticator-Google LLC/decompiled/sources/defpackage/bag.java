package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bag implements bjv {
    final /* synthetic */ bah a;
    private final bkl b;

    public bag(bah bahVar, bkl bklVar) {
        this.a = bahVar;
        this.b = bklVar;
    }

    @Override // defpackage.bjv
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                bkl bklVar = this.b;
                for (blb blbVar : bmi.e(bklVar.a)) {
                    if (!blbVar.l() && !blbVar.k()) {
                        blbVar.c();
                        if (bklVar.c) {
                            bklVar.b.add(blbVar);
                        } else {
                            blbVar.b();
                        }
                    }
                }
            }
        }
    }
}
