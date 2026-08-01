package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d1.InterfaceC0081a;
import g.AbstractActivityC0132i;

/* loaded from: classes.dex */
public final class k extends e1.e implements InterfaceC0081a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f1160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0132i abstractActivityC0132i, int i) {
        super(0);
        this.f1159b = i;
        this.f1160c = abstractActivityC0132i;
    }

    @Override // d1.InterfaceC0081a
    public final Object a() {
        switch (this.f1159b) {
            case 0:
                this.f1160c.reportFullyDrawn();
                return V0.e.f878c;
            case 1:
                AbstractActivityC0132i abstractActivityC0132i = this.f1160c;
                return new n(abstractActivityC0132i.f1166f, new k(abstractActivityC0132i, 0));
            default:
                AbstractActivityC0132i abstractActivityC0132i2 = this.f1160c;
                x xVar = new x(new d(abstractActivityC0132i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (e1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0132i2.f1162a.a(new f(xVar, abstractActivityC0132i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0132i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
