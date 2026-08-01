package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0128i;
import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final class k extends k1.f implements InterfaceC0170a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f1577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0128i abstractActivityC0128i, int i) {
        super(0);
        this.f1576b = i;
        this.f1577c = abstractActivityC0128i;
    }

    @Override // j1.InterfaceC0170a
    public final Object c() {
        switch (this.f1576b) {
            case 0:
                this.f1577c.reportFullyDrawn();
                return X0.g.f1277c;
            case 1:
                AbstractActivityC0128i abstractActivityC0128i = this.f1577c;
                return new n(abstractActivityC0128i.f1583f, new k(abstractActivityC0128i, 0));
            default:
                AbstractActivityC0128i abstractActivityC0128i2 = this.f1577c;
                x xVar = new x(new d(abstractActivityC0128i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (k1.e.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0128i2.f1579a.a(new f(xVar, abstractActivityC0128i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.n(abstractActivityC0128i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
