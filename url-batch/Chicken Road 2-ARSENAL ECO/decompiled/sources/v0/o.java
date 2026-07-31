package v0;

import android.content.Context;
import android.os.Build;
import u0.C0686p;
import x0.InterfaceC0725a;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final String f6081l = l0.q.f("WorkForegroundRunnable");

    /* renamed from: f, reason: collision with root package name */
    public final w0.j f6082f = new w0.j();

    /* renamed from: g, reason: collision with root package name */
    public final Context f6083g;

    /* renamed from: h, reason: collision with root package name */
    public final C0686p f6084h;

    /* renamed from: i, reason: collision with root package name */
    public final l0.p f6085i;

    /* renamed from: j, reason: collision with root package name */
    public final q f6086j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0725a f6087k;

    public o(Context context, C0686p c0686p, l0.p pVar, q qVar, B0.c cVar) {
        this.f6083g = context;
        this.f6084h = c0686p;
        this.f6085i = pVar;
        this.f6086j = qVar;
        this.f6087k = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f6084h.f6016q || Build.VERSION.SDK_INT >= 31) {
            this.f6082f.i(null);
            return;
        }
        w0.j jVar = new w0.j();
        B0.c cVar = (B0.c) this.f6087k;
        ((D0.q) cVar.f71g).execute(new G4.c(this, 13, jVar));
        jVar.a(new A.a(this, jVar, 28, false), (D0.q) cVar.f71g);
    }
}
