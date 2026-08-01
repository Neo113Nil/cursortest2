package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0125i;

/* loaded from: classes.dex */
public final class k extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0125i f1056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0125i abstractActivityC0125i, int i) {
        super(0);
        this.f1055b = i;
        this.f1056c = abstractActivityC0125i;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1055b) {
            case 0:
                this.f1056c.reportFullyDrawn();
                return P0.d.f627c;
            case 1:
                AbstractActivityC0125i abstractActivityC0125i = this.f1056c;
                return new n(abstractActivityC0125i.f1062f, new k(abstractActivityC0125i, 0));
            default:
                AbstractActivityC0125i abstractActivityC0125i2 = this.f1056c;
                x xVar = new x(new d(abstractActivityC0125i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (X0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0125i2.f1058a.a(new f(xVar, abstractActivityC0125i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0125i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
