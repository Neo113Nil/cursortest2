package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gy implements yv {
    int a;
    final /* synthetic */ gz b;
    private boolean c = false;

    protected gy(gz gzVar) {
        this.b = gzVar;
    }

    @Override // defpackage.yv
    public final void a() {
        if (this.c) {
            return;
        }
        gz gzVar = this.b;
        gzVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.yv
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.yv
    public final void c() {
        this.c = true;
    }

    public final void d(brn brnVar, int i) {
        this.b.f = brnVar;
        this.a = i;
    }
}
