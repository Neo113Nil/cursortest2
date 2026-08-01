package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final class k extends Z0.e implements Y0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0131i f1091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0131i abstractActivityC0131i, int i) {
        super(0);
        this.f1090b = i;
        this.f1091c = abstractActivityC0131i;
    }

    @Override // Y0.a
    public final Object a() {
        switch (this.f1090b) {
            case 0:
                this.f1091c.reportFullyDrawn();
                return Q0.e.f694c;
            case 1:
                AbstractActivityC0131i abstractActivityC0131i = this.f1091c;
                return new n(abstractActivityC0131i.f1097f, new k(abstractActivityC0131i, 0));
            default:
                AbstractActivityC0131i abstractActivityC0131i2 = this.f1091c;
                x xVar = new x(new d(abstractActivityC0131i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Z0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0131i2.f1093a.a(new f(xVar, abstractActivityC0131i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0131i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
