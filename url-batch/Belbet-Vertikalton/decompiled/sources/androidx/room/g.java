package androidx.room;

import android.os.CancellationSignal;
import i1.InterfaceC0192l;
import r1.a0;

/* loaded from: classes.dex */
public final class g extends j1.i implements InterfaceC0192l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f2098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f2099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CancellationSignal cancellationSignal, a0 a0Var) {
        super(1);
        this.f2098b = cancellationSignal;
        this.f2099c = a0Var;
    }

    @Override // i1.InterfaceC0192l
    public final Object g(Object obj) {
        this.f2098b.cancel();
        this.f2099c.g(null);
        return W0.i.f1345a;
    }
}
