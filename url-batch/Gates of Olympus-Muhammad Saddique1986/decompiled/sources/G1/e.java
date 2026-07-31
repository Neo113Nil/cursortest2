package G1;

import R1.y;
import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f2088c;

    public /* synthetic */ e(g gVar, h hVar, int i3) {
        this.f2086a = i3;
        this.f2088c = gVar;
        this.f2087b = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AppDatabase_Impl appDatabase_Impl;
        switch (this.f2086a) {
            case 0:
                g gVar = this.f2088c;
                appDatabase_Impl = (AppDatabase_Impl) gVar.f2093e;
                appDatabase_Impl.b();
                try {
                    c cVar = (c) gVar.f2094f;
                    h hVar = this.f2087b;
                    cVar.f9876a.a();
                    A1.k b3 = cVar.f9877b.compareAndSet(false, true) ? (A1.k) cVar.f9878c.getValue() : cVar.b();
                    try {
                        cVar.a(b3, hVar);
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
            case 1:
                g gVar2 = this.f2088c;
                appDatabase_Impl = (AppDatabase_Impl) gVar2.f2093e;
                appDatabase_Impl.b();
                try {
                    ((d) gVar2.f2095g).d(this.f2087b);
                    appDatabase_Impl.g().t().r();
                    appDatabase_Impl.e();
                    return y.f4171a;
                } finally {
                }
            default:
                g gVar3 = this.f2088c;
                appDatabase_Impl = (AppDatabase_Impl) gVar3.f2093e;
                appDatabase_Impl.b();
                try {
                    ((d) gVar3.f2096h).d(this.f2087b);
                    appDatabase_Impl.g().t().r();
                    appDatabase_Impl.e();
                    return y.f4171a;
                } finally {
                }
        }
    }
}
