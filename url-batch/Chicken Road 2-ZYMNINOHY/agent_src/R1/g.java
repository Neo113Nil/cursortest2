package R1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f2342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1.j f2343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f2345d;

    public /* synthetic */ g(m mVar, L1.j jVar, int i4, Runnable runnable) {
        this.f2342a = mVar;
        this.f2343b = jVar;
        this.f2344c = i4;
        this.f2345d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L1.j jVar = this.f2343b;
        int i4 = this.f2344c;
        Runnable runnable = this.f2345d;
        m mVar = this.f2342a;
        T1.c cVar = mVar.f2367f;
        try {
            try {
                S1.d dVar = mVar.f2364c;
                Objects.requireNonNull(dVar);
                ((S1.j) cVar).n(new D0.a(3, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) mVar.f2362a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((S1.j) cVar).n(new h(mVar, jVar, i4));
                } else {
                    mVar.a(jVar, i4);
                }
                runnable.run();
            } catch (T1.a unused) {
                mVar.f2365d.a(jVar, i4 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
