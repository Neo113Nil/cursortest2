package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0106i;
import g1.InterfaceC0110a;

/* loaded from: classes.dex */
public final class k extends h1.e implements InterfaceC0110a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f1248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0106i abstractActivityC0106i, int i) {
        super(0);
        this.f1247b = i;
        this.f1248c = abstractActivityC0106i;
    }

    @Override // g1.InterfaceC0110a
    public final Object b() {
        switch (this.f1247b) {
            case 0:
                this.f1248c.reportFullyDrawn();
                return V0.e.f946c;
            case 1:
                AbstractActivityC0106i abstractActivityC0106i = this.f1248c;
                return new n(abstractActivityC0106i.f1254f, new k(abstractActivityC0106i, 0));
            default:
                AbstractActivityC0106i abstractActivityC0106i2 = this.f1248c;
                x xVar = new x(new RunnableC0059d(abstractActivityC0106i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (h1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0106i2.f1250a.a(new C0061f(xVar, abstractActivityC0106i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new C.o(abstractActivityC0106i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
