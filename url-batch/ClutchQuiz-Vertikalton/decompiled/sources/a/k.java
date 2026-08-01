package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0136i;

/* loaded from: classes.dex */
public final class k extends g1.g implements f1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0136i f1197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0136i abstractActivityC0136i, int i) {
        super(0);
        this.f1196b = i;
        this.f1197c = abstractActivityC0136i;
    }

    @Override // f1.a
    public final Object c() {
        switch (this.f1196b) {
            case 0:
                this.f1197c.reportFullyDrawn();
                return U0.i.f864a;
            case 1:
                AbstractActivityC0136i abstractActivityC0136i = this.f1197c;
                return new n(abstractActivityC0136i.f1203f, new k(abstractActivityC0136i, 0));
            default:
                AbstractActivityC0136i abstractActivityC0136i2 = this.f1197c;
                x xVar = new x(new d(abstractActivityC0136i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (g1.f.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0136i2.f1199a.a(new f(xVar, abstractActivityC0136i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0136i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
