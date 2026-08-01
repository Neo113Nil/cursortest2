package androidx.room;

import android.os.CancellationSignal;
import o1.N;
import o1.Z;

/* loaded from: classes.dex */
public final class d extends g1.g implements f1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f1649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f1650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CancellationSignal cancellationSignal, Z z2) {
        super(1);
        this.f1649b = cancellationSignal;
        this.f1650c = z2;
    }

    @Override // f1.l
    public final Object g(Object obj) {
        this.f1649b.cancel();
        Z z2 = this.f1650c;
        z2.i(new N(z2.m(), null, z2));
        return U0.i.f864a;
    }
}
