package b;

import E.C0009j;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.H;
import c3.C0297i;
import o3.InterfaceC1328a;

/* renamed from: b.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252m extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0253n f5231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0252m(AbstractActivityC0253n abstractActivityC0253n, int i4) {
        super(0);
        this.f5230e = i4;
        this.f5231f = abstractActivityC0253n;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        InterfaceExecutorC0249j interfaceExecutorC0249j;
        switch (this.f5230e) {
            case 0:
                AbstractActivityC0253n abstractActivityC0253n = this.f5231f;
                return new H(abstractActivityC0253n.getApplication(), abstractActivityC0253n, abstractActivityC0253n.getIntent() != null ? abstractActivityC0253n.getIntent().getExtras() : null);
            case 1:
                this.f5231f.reportFullyDrawn();
                return C0297i.f5732a;
            case 2:
                AbstractActivityC0253n abstractActivityC0253n2 = this.f5231f;
                interfaceExecutorC0249j = abstractActivityC0253n2.reportFullyDrawnExecutor;
                return new p(interfaceExecutorC0249j, new C0252m(abstractActivityC0253n2, 1));
            default:
                AbstractActivityC0253n abstractActivityC0253n3 = this.f5231f;
                C0238A c0238a = new C0238A(new RunnableC0243d(abstractActivityC0253n3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0253n3.getLifecycle().a(new C0009j(c0238a, 1, abstractActivityC0253n3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new R1.e(abstractActivityC0253n3, 12, c0238a));
                    }
                }
                return c0238a;
        }
    }
}
