package G1;

import R1.y;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f2110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f2111c;

    public /* synthetic */ k(m mVar, n nVar, int i3) {
        this.f2109a = i3;
        this.f2111c = mVar;
        this.f2110b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AppDatabase_Impl appDatabase_Impl;
        switch (this.f2109a) {
            case 0:
                m mVar = this.f2111c;
                appDatabase_Impl = (AppDatabase_Impl) mVar.f2116b;
                appDatabase_Impl.b();
                try {
                    c cVar = (c) mVar.f2117c;
                    n nVar = this.f2110b;
                    cVar.f9876a.a();
                    A1.k b3 = cVar.f9877b.compareAndSet(false, true) ? (A1.k) cVar.f9878c.getValue() : cVar.b();
                    try {
                        cVar.a(b3, nVar);
                        long a3 = b3.a();
                        cVar.e(b3);
                        Long valueOf = Long.valueOf(a3);
                        appDatabase_Impl.g().t().r();
                        return valueOf;
                    } catch (Throwable th) {
                        cVar.e(b3);
                        throw th;
                    }
                } finally {
                }
            default:
                m mVar2 = this.f2111c;
                appDatabase_Impl = (AppDatabase_Impl) mVar2.f2116b;
                appDatabase_Impl.b();
                try {
                    ((d) mVar2.f2118d).d(this.f2110b);
                    appDatabase_Impl.g().t().r();
                    appDatabase_Impl.e();
                    return y.f4171a;
                } finally {
                }
        }
    }
}
