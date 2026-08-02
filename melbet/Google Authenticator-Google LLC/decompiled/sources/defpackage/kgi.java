package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgi implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kgi(Object obj, boolean z, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [bjv, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            bmi.f();
            boolean z = this.a;
            giq giqVar = ((bko) this.b).a;
            boolean z2 = giqVar.a;
            giqVar.a = z;
            if (z2 != z) {
                giqVar.b.a(z);
                return;
            }
            return;
        }
        if (this.a) {
            kgm kgmVar = ((kgj) this.b).a;
            kgmVar.p = true;
            if (kgmVar.l > 0) {
                hab habVar = kgmVar.o;
                habVar.d();
                habVar.e();
            }
        }
        ((kgj) this.b).a.q = false;
    }
}
