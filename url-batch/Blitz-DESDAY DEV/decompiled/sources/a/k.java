package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import f1.InterfaceC0099a;
import g.AbstractActivityC0110i;

/* loaded from: classes.dex */
public final class k extends g1.e implements InterfaceC0099a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0110i f1258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0110i abstractActivityC0110i, int i) {
        super(0);
        this.f1257b = i;
        this.f1258c = abstractActivityC0110i;
    }

    @Override // f1.InterfaceC0099a
    public final Object a() {
        switch (this.f1257b) {
            case 0:
                this.f1258c.reportFullyDrawn();
                return W0.e.f956c;
            case 1:
                AbstractActivityC0110i abstractActivityC0110i = this.f1258c;
                return new n(abstractActivityC0110i.f1264f, new k(abstractActivityC0110i, 0));
            default:
                AbstractActivityC0110i abstractActivityC0110i2 = this.f1258c;
                x xVar = new x(new d(abstractActivityC0110i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (g1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0110i2.f1260a.a(new f(xVar, abstractActivityC0110i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new D.o(abstractActivityC0110i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
