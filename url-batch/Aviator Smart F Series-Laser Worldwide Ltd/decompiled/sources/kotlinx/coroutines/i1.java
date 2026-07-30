package kotlinx.coroutines;

/* loaded from: classes3.dex */
final class i1 extends l {
    private final f6.l handler;

    public i1(f6.l lVar) {
        this.handler = lVar;
    }

    @Override // kotlinx.coroutines.l, kotlinx.coroutines.m, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    public String toString() {
        return "InvokeOnCancel[" + k0.getClassSimpleName(this.handler) + '@' + k0.getHexAddress(this) + ']';
    }

    @Override // kotlinx.coroutines.m
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
