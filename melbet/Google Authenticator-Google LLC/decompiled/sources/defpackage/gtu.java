package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gtu implements gut {
    public final /* synthetic */ gut a;
    public final /* synthetic */ gut b;
    public final /* synthetic */ guq c;

    public /* synthetic */ gtu(gut gutVar, gut gutVar2, guq guqVar) {
        this.a = gutVar;
        this.b = gutVar2;
        this.c = guqVar;
    }

    @Override // defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        gut gutVar = this.b;
        if (gutVar != null) {
            gutVar.close();
        }
        gta.f(this.c);
    }
}
