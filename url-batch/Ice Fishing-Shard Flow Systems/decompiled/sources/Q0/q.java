package Q0;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final String f2322o = G0.s.f("WorkForegroundRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final R0.k f2323d = new R0.k();

    /* renamed from: e, reason: collision with root package name */
    public final Context f2324e;

    /* renamed from: i, reason: collision with root package name */
    public final P0.p f2325i;

    /* renamed from: l, reason: collision with root package name */
    public final G0.r f2326l;

    /* renamed from: m, reason: collision with root package name */
    public final s f2327m;

    /* renamed from: n, reason: collision with root package name */
    public final S0.a f2328n;

    public q(Context context, P0.p pVar, G0.r rVar, s sVar, D0.j jVar) {
        this.f2324e = context;
        this.f2325i = pVar;
        this.f2326l = rVar;
        this.f2327m = sVar;
        this.f2328n = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f2325i.f2235q || Build.VERSION.SDK_INT >= 31) {
            this.f2323d.i(null);
            return;
        }
        R0.k kVar = new R0.k();
        D0.j jVar = (D0.j) this.f2328n;
        ((K1.o) jVar.f332l).execute(new A.j(this, 6, kVar));
        kVar.a(new F.a(19, this, kVar, false), (K1.o) jVar.f332l);
    }
}
