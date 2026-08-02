package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mj extends yw {
    final /* synthetic */ int a;
    final /* synthetic */ mk b;
    private boolean c = false;

    public mj(mk mkVar, int i) {
        this.b = mkVar;
        this.a = i;
    }

    @Override // defpackage.yw, defpackage.yv
    public final void a() {
        if (this.c) {
            return;
        }
        mk mkVar = this.b;
        mkVar.a.setVisibility(this.a);
    }

    @Override // defpackage.yw, defpackage.yv
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.yw, defpackage.yv
    public final void c() {
        this.c = true;
    }
}
