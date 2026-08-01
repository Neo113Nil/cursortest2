package a;

import K.C0017m;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC0064v;
import androidx.lifecycle.N;

/* loaded from: classes.dex */
public final class o extends X0.g implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0064v f924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(AbstractActivityC0064v abstractActivityC0064v, int i) {
        super(0);
        this.f923b = i;
        this.f924c = abstractActivityC0064v;
    }

    @Override // W0.a
    public final Object a() {
        k kVar;
        switch (this.f923b) {
            case 0:
                AbstractActivityC0064v abstractActivityC0064v = this.f924c;
                return new N(abstractActivityC0064v.getApplication(), abstractActivityC0064v, abstractActivityC0064v.getIntent() != null ? abstractActivityC0064v.getIntent().getExtras() : null);
            case 1:
                this.f924c.reportFullyDrawn();
                return N0.f.f677c;
            case 2:
                AbstractActivityC0064v abstractActivityC0064v2 = this.f924c;
                kVar = ((p) abstractActivityC0064v2).reportFullyDrawnExecutor;
                return new r(kVar, new o(abstractActivityC0064v2, 1));
            default:
                AbstractActivityC0064v abstractActivityC0064v3 = this.f924c;
                C0039B c0039b = new C0039B(new d(abstractActivityC0064v3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (X0.f.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0064v3.getLifecycle().a(new C0017m(c0039b, 1, abstractActivityC0064v3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0064v3, 1, c0039b));
                    }
                }
                return c0039b;
        }
    }
}
