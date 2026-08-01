package a;

import a1.InterfaceC0058a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final class k extends b1.e implements InterfaceC0058a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f1130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0128i abstractActivityC0128i, int i) {
        super(0);
        this.f1129b = i;
        this.f1130c = abstractActivityC0128i;
    }

    @Override // a1.InterfaceC0058a
    public final Object a() {
        switch (this.f1129b) {
            case 0:
                this.f1130c.reportFullyDrawn();
                return S0.d.f774c;
            case 1:
                AbstractActivityC0128i abstractActivityC0128i = this.f1130c;
                return new n(abstractActivityC0128i.f1136f, new k(abstractActivityC0128i, 0));
            default:
                AbstractActivityC0128i abstractActivityC0128i2 = this.f1130c;
                x xVar = new x(new d(abstractActivityC0128i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (b1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0128i2.f1132a.a(new f(xVar, abstractActivityC0128i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0128i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
