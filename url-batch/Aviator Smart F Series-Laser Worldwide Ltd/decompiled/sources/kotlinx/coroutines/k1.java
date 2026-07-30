package kotlinx.coroutines;

/* loaded from: classes3.dex */
final class k1 extends r1 {
    private final f6.l handler;

    public k1(f6.l lVar) {
        this.handler = lVar;
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
