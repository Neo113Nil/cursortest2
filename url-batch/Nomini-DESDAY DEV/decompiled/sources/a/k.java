package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0125i;

/* loaded from: classes.dex */
public final class k extends X0.f implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0125i f1052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0125i abstractActivityC0125i, int i) {
        super(0);
        this.f1051b = i;
        this.f1052c = abstractActivityC0125i;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1051b) {
            case 0:
                this.f1052c.reportFullyDrawn();
                return P0.d.f626c;
            case 1:
                AbstractActivityC0125i abstractActivityC0125i = this.f1052c;
                return new n(abstractActivityC0125i.f1058f, new k(abstractActivityC0125i, 0));
            default:
                AbstractActivityC0125i abstractActivityC0125i2 = this.f1052c;
                x xVar = new x(new d(abstractActivityC0125i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (X0.e.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0125i2.f1054a.a(new f(xVar, abstractActivityC0125i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0125i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
