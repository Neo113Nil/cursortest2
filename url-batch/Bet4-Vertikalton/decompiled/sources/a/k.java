package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c1.InterfaceC0085a;
import g.AbstractActivityC0106i;

/* loaded from: classes.dex */
public final class k extends d1.e implements InterfaceC0085a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f1173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0106i abstractActivityC0106i, int i) {
        super(0);
        this.f1172b = i;
        this.f1173c = abstractActivityC0106i;
    }

    @Override // c1.InterfaceC0085a
    public final Object b() {
        switch (this.f1172b) {
            case 0:
                this.f1173c.reportFullyDrawn();
                return R0.f.f780c;
            case 1:
                AbstractActivityC0106i abstractActivityC0106i = this.f1173c;
                return new n(abstractActivityC0106i.f1179f, new k(abstractActivityC0106i, 0));
            default:
                AbstractActivityC0106i abstractActivityC0106i2 = this.f1173c;
                x xVar = new x(new d(abstractActivityC0106i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (d1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0106i2.f1175a.a(new f(xVar, abstractActivityC0106i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0106i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
