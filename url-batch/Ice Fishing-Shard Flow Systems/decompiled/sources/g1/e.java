package g1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import i1.C0541a;
import i1.InterfaceC0542b;
import i1.InterfaceC0543c;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f4985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1.i f4986e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4987i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Runnable f4988l;

    public /* synthetic */ e(i iVar, a1.i iVar2, int i2, Runnable runnable) {
        this.f4985d = iVar;
        this.f4986e = iVar2;
        this.f4987i = i2;
        this.f4988l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final a1.i iVar = this.f4986e;
        final int i2 = this.f4987i;
        Runnable runnable = this.f4988l;
        final i iVar2 = this.f4985d;
        InterfaceC0543c interfaceC0543c = iVar2.f5003f;
        try {
            try {
                h1.d dVar = iVar2.f5000c;
                Objects.requireNonNull(dVar);
                ((h1.h) interfaceC0543c).s(new A4.b(10, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar2.f4998a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((h1.h) interfaceC0543c).s(new InterfaceC0542b() { // from class: g1.f
                        @Override // i1.InterfaceC0542b
                        public final Object b() {
                            i.this.f5001d.a(iVar, i2 + 1, false);
                            return null;
                        }
                    });
                } else {
                    iVar2.a(iVar, i2);
                }
                runnable.run();
            } catch (C0541a unused) {
                iVar2.f5001d.a(iVar, i2 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
