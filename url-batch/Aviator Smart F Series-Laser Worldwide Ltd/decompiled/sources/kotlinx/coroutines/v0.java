package kotlinx.coroutines;

/* loaded from: classes3.dex */
final class v0 extends l {
    private final u0 handle;

    public v0(u0 u0Var) {
        this.handle = u0Var;
    }

    @Override // kotlinx.coroutines.l, kotlinx.coroutines.m, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.handle + ']';
    }

    @Override // kotlinx.coroutines.m
    public void invoke(Throwable th) {
        this.handle.dispose();
    }
}
