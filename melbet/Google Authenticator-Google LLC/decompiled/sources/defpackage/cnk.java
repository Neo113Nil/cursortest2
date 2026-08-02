package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cnk implements ddc {
    public final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public /* synthetic */ cnk(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // defpackage.ddc
    public final void a(ddi ddiVar) {
        int i = this.b;
        Runnable runnable = this.a;
        if (i != 0) {
            runnable.run();
        } else {
            runnable.run();
        }
    }
}
