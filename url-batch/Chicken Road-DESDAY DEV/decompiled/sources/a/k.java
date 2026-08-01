package a;

import a1.InterfaceC0059a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0133i;

/* loaded from: classes.dex */
public final class k extends b1.e implements InterfaceC0059a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0133i f1116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0133i abstractActivityC0133i, int i) {
        super(0);
        this.f1115b = i;
        this.f1116c = abstractActivityC0133i;
    }

    @Override // a1.InterfaceC0059a
    public final Object a() {
        switch (this.f1115b) {
            case 0:
                this.f1116c.reportFullyDrawn();
                return S0.f.f759c;
            case 1:
                AbstractActivityC0133i abstractActivityC0133i = this.f1116c;
                return new n(abstractActivityC0133i.f1122f, new k(abstractActivityC0133i, 0));
            default:
                AbstractActivityC0133i abstractActivityC0133i2 = this.f1116c;
                x xVar = new x(new d(abstractActivityC0133i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (b1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0133i2.f1118a.a(new f(xVar, abstractActivityC0133i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0133i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
