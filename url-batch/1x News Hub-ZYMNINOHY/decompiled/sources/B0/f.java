package B0;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.i f127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f129d;

    public /* synthetic */ f(m mVar, v0.i iVar, int i3, Runnable runnable) {
        this.f126a = mVar;
        this.f127b = iVar;
        this.f128c = i3;
        this.f129d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final v0.i iVar = this.f127b;
        final int i3 = this.f128c;
        Runnable runnable = this.f129d;
        final m mVar = this.f126a;
        D0.c cVar = mVar.f;
        try {
            try {
                C0.d dVar = mVar.f150c;
                Objects.requireNonNull(dVar);
                ((C0.k) cVar).f(new g(1, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) mVar.f148a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((C0.k) cVar).f(new D0.b() { // from class: B0.h
                        @Override // D0.b
                        public final Object execute() {
                            m.this.f151d.a(iVar, i3 + 1, false);
                            return null;
                        }
                    });
                } else {
                    mVar.a(iVar, i3);
                }
                runnable.run();
            } catch (D0.a unused) {
                mVar.f151d.a(iVar, i3 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
