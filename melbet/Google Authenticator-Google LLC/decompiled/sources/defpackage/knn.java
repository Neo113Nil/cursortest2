package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class knn extends iwr {
    public final knm a;
    private Object b;
    private boolean c = false;

    public knn(knm knmVar) {
        this.a = knmVar;
    }

    @Override // defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        if (!kbqVar.g()) {
            this.a.p(new kbt(kbqVar, kaaVar));
            return;
        }
        if (!this.c) {
            this.a.p(new kbt(kbq.k.e("No value received for unary call"), kaaVar));
        }
        this.a.o(this.b);
    }

    @Override // defpackage.iwr
    public final void c(Object obj) {
        if (this.c) {
            throw new kbt(kbq.k.e("More than one value received for unary call"), null);
        }
        this.b = obj;
        this.c = true;
    }

    @Override // defpackage.iwr
    public final void b(kaa kaaVar) {
    }
}
