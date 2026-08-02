package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gvm extends gup {
    final /* synthetic */ guq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvm(gty gtyVar, guq guqVar) {
        super(gtyVar);
        this.a = guqVar;
    }

    @Override // defpackage.gup, defpackage.gut, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        guq guqVar = this.a;
        if (guqVar != null) {
            gta.f(guqVar);
        }
    }
}
