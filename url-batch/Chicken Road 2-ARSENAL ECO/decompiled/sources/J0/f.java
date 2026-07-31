package J0;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f1251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D0.j f1252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f1254i;

    public /* synthetic */ f(k kVar, D0.j jVar, int i7, Runnable runnable) {
        this.f1251f = kVar;
        this.f1252g = jVar;
        this.f1253h = i7;
        this.f1254i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final D0.j jVar = this.f1252g;
        final int i7 = this.f1253h;
        Runnable runnable = this.f1254i;
        final k kVar = this.f1251f;
        L0.c cVar = kVar.f1274f;
        try {
            try {
                K0.d dVar = kVar.f1271c;
                Objects.requireNonNull(dVar);
                ((K0.h) cVar).m(new B0.b(7, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) kVar.f1269a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((K0.h) cVar).m(new L0.b() { // from class: J0.g
                        @Override // L0.b
                        public final Object c() {
                            k.this.f1272d.a(jVar, i7 + 1, false);
                            return null;
                        }
                    });
                } else {
                    kVar.a(jVar, i7);
                }
                runnable.run();
            } catch (L0.a unused) {
                kVar.f1272d.a(jVar, i7 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
