package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class w0 extends r1 {
    private final u0 handle;

    public w0(u0 u0Var) {
        this.handle = u0Var;
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        this.handle.dispose();
    }
}
