package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class u extends m1 implements t {
    public final v childJob;

    public u(v vVar) {
        this.childJob = vVar;
    }

    @Override // kotlinx.coroutines.t
    public boolean childCancelled(Throwable th) {
        return getJob().childCancelled(th);
    }

    @Override // kotlinx.coroutines.t
    public l1 getParent() {
        return getJob();
    }

    @Override // kotlinx.coroutines.m1, kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        this.childJob.parentCancelled(getJob());
    }
}
