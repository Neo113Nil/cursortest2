package h0;

import android.os.CancellationSignal;
import s1.M;
import s1.U;

/* loaded from: classes.dex */
public final class c extends k1.f implements j1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f2960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f2961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CancellationSignal cancellationSignal, M m2) {
        super(1);
        this.f2960b = cancellationSignal;
        this.f2961c = m2;
    }

    @Override // j1.l
    public final Object g(Object obj) {
        CancellationSignal cancellationSignal = this.f2960b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        ((U) this.f2961c).l(null);
        return X0.g.f1277c;
    }
}
