package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ee implements go {
    final /* synthetic */ ef a;
    private boolean b;

    public ee(ef efVar) {
        this.a = efVar;
    }

    @Override // defpackage.go
    public final void a(gd gdVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        ef efVar = this.a;
        efVar.c.c();
        efVar.a.onPanelClosed(108, gdVar);
        this.b = false;
    }

    @Override // defpackage.go
    public final boolean b(gd gdVar) {
        this.a.a.onMenuOpened(108, gdVar);
        return true;
    }
}
