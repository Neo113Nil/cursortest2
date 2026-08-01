package d6;

import android.content.Context;
import android.os.Build;
import f8.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final String f3654u = t5.o.f("WorkForegroundRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final e6.j f3655d = new e6.j();

    /* renamed from: e, reason: collision with root package name */
    public final Context f3656e;

    /* renamed from: i, reason: collision with root package name */
    public final c6.p f3657i;

    /* renamed from: r, reason: collision with root package name */
    public final t5.n f3658r;

    /* renamed from: s, reason: collision with root package name */
    public final s f3659s;

    /* renamed from: t, reason: collision with root package name */
    public final f6.a f3660t;

    public q(Context context, c6.p pVar, t5.n nVar, s sVar, a1.n nVar2) {
        this.f3656e = context;
        this.f3657i = pVar;
        this.f3658r = nVar;
        this.f3659s = sVar;
        this.f3660t = nVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3657i.f1853q || Build.VERSION.SDK_INT >= 31) {
            this.f3655d.i(null);
            return;
        }
        e6.j jVar = new e6.j();
        a1.n nVar = (a1.n) this.f3660t;
        ((f6.b) nVar.f42r).execute(new a6.f(6, this, jVar));
        jVar.a(new j0(6, this, jVar, false), (f6.b) nVar.f42r);
    }
}
