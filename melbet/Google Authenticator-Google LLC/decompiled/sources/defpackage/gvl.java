package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gvl implements gtt {
    public final /* synthetic */ guq a;
    public final /* synthetic */ guq b;
    private final /* synthetic */ int c;

    public /* synthetic */ gvl(guq guqVar, guq guqVar2, int i) {
        this.c = i;
        this.a = guqVar;
        this.b = guqVar2;
    }

    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.c;
        guq guqVar = this.a;
        if (i != 0) {
            guqVar.close();
            gta.f(this.b);
        } else {
            guqVar.close();
            gta.f(this.b);
        }
    }
}
