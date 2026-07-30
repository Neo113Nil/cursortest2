package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class s extends m1 {
    public final o child;

    public s(o oVar) {
        this.child = oVar;
    }

    @Override // kotlinx.coroutines.m1, kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        o oVar = this.child;
        oVar.parentCancelled$kotlinx_coroutines_core(oVar.getContinuationCancellationCause(getJob()));
    }
}
