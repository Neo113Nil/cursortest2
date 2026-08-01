package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import h.AbstractActivityC0132i;
import i1.InterfaceC0181a;

/* loaded from: classes.dex */
public final class k extends j1.i implements InterfaceC0181a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f2175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0132i abstractActivityC0132i, int i) {
        super(0);
        this.f2174b = i;
        this.f2175c = abstractActivityC0132i;
    }

    @Override // i1.InterfaceC0181a
    public final Object c() {
        switch (this.f2174b) {
            case 0:
                this.f2175c.reportFullyDrawn();
                return W0.i.f1345a;
            case 1:
                AbstractActivityC0132i abstractActivityC0132i = this.f2175c;
                return new n(abstractActivityC0132i.f2181f, new k(abstractActivityC0132i, 0));
            default:
                AbstractActivityC0132i abstractActivityC0132i2 = this.f2175c;
                w wVar = new w(new RunnableC0091d(abstractActivityC0132i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (j1.h.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0132i2.f2177a.a(new C0093f(wVar, abstractActivityC0132i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new D.n(abstractActivityC0132i2, 2, wVar));
                    }
                }
                return wVar;
        }
    }
}
