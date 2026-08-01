package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import f1.InterfaceC0090a;
import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final class k extends g1.e implements InterfaceC0090a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0108i f1203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0108i abstractActivityC0108i, int i) {
        super(0);
        this.f1202b = i;
        this.f1203c = abstractActivityC0108i;
    }

    @Override // f1.InterfaceC0090a
    public final Object b() {
        switch (this.f1202b) {
            case 0:
                this.f1203c.reportFullyDrawn();
                return U0.f.f904c;
            case 1:
                AbstractActivityC0108i abstractActivityC0108i = this.f1203c;
                return new n(abstractActivityC0108i.f1209f, new k(abstractActivityC0108i, 0));
            default:
                AbstractActivityC0108i abstractActivityC0108i2 = this.f1203c;
                x xVar = new x(new d(abstractActivityC0108i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (g1.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0108i2.f1205a.a(new f(xVar, abstractActivityC0108i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0108i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
