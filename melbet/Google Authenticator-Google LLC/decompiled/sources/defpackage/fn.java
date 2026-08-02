package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fn extends yw {
    final /* synthetic */ fo a;
    private boolean b = false;
    private int c = 0;

    public fn(fo foVar) {
        this.a = foVar;
    }

    @Override // defpackage.yw, defpackage.yv
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        fo foVar = this.a;
        if (i == foVar.a.size()) {
            yv yvVar = foVar.b;
            if (yvVar != null) {
                yvVar.a();
            }
            this.c = 0;
            this.b = false;
            foVar.c = false;
        }
    }

    @Override // defpackage.yw, defpackage.yv
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        yv yvVar = this.a.b;
        if (yvVar != null) {
            yvVar.b();
        }
    }
}
