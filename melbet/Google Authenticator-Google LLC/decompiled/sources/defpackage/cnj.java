package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnj extends cnh {
    public final bvw b;

    public cnj(bvw bvwVar, bst bstVar) {
        super(3, bstVar);
        this.b = bvwVar;
    }

    @Override // defpackage.cng
    public final int a(coc cocVar) {
        return ((cou) this.b.c).c;
    }

    @Override // defpackage.cng
    public final boolean c(coc cocVar) {
        return ((cou) this.b.c).b;
    }

    @Override // defpackage.cng
    public final cli[] d(coc cocVar) {
        return ((cou) this.b.c).a;
    }

    @Override // defpackage.cnh
    public final void e(coc cocVar) {
        bvw bvwVar = this.b;
        cou couVar = (cou) bvwVar.c;
        couVar.b(cocVar.b, this.a);
        cop a = couVar.a();
        if (a != null) {
            cocVar.e.put(a, bvwVar);
        }
    }

    @Override // defpackage.cnh, defpackage.cnn
    public final /* bridge */ /* synthetic */ void i(fwm fwmVar, boolean z) {
    }
}
