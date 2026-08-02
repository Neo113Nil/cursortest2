package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnm extends cnh {
    public final cop b;

    public cnm(cop copVar, bst bstVar) {
        super(4, bstVar);
        this.b = copVar;
    }

    @Override // defpackage.cng
    public final int a(coc cocVar) {
        bvw bvwVar = (bvw) cocVar.e.get(this.b);
        if (bvwVar != null) {
            return ((cou) bvwVar.c).c;
        }
        return -1;
    }

    @Override // defpackage.cng
    public final boolean c(coc cocVar) {
        bvw bvwVar = (bvw) cocVar.e.get(this.b);
        return bvwVar != null && ((cou) bvwVar.c).b;
    }

    @Override // defpackage.cng
    public final cli[] d(coc cocVar) {
        bvw bvwVar = (bvw) cocVar.e.get(this.b);
        if (bvwVar == null) {
            return null;
        }
        return ((cou) bvwVar.c).a;
    }

    @Override // defpackage.cnh
    public final void e(coc cocVar) {
        bvw bvwVar = (bvw) cocVar.e.remove(this.b);
        if (bvwVar == null) {
            this.a.e(false);
            return;
        }
        ((cow) ((kee) bvwVar.a).a).b.a(cocVar.b, this.a);
        ((cou) bvwVar.c).e.c();
    }

    @Override // defpackage.cnh, defpackage.cnn
    public final /* bridge */ /* synthetic */ void i(fwm fwmVar, boolean z) {
    }
}
