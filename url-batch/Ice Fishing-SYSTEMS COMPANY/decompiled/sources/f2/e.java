package f2;

import F3.l;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import h2.C4564a;
import h2.InterfaceC4565b;
import h2.InterfaceC4566c;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f37673n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z1.i f37674u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f37675v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Runnable f37676w;

    public /* synthetic */ e(i iVar, Z1.i iVar2, int i, Runnable runnable) {
        this.f37673n = iVar;
        this.f37674u = iVar2;
        this.f37675v = i;
        this.f37676w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Z1.i iVar = this.f37674u;
        final int i = this.f37675v;
        Runnable runnable = this.f37676w;
        final i iVar2 = this.f37673n;
        InterfaceC4566c interfaceC4566c = iVar2.f37691f;
        try {
            try {
                g2.d dVar = iVar2.f37688c;
                Objects.requireNonNull(dVar);
                ((g2.h) interfaceC4566c).m(new l(7, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar2.f37686a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((g2.h) interfaceC4566c).m(new InterfaceC4565b() { // from class: f2.f
                        @Override // h2.InterfaceC4565b
                        public final Object d() {
                            i.this.f37689d.a(iVar, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    iVar2.a(iVar, i);
                }
                runnable.run();
            } catch (C4564a unused) {
                iVar2.f37689d.a(iVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
