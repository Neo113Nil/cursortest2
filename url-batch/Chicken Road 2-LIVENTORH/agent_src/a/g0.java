package a;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f24a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.j f25b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f26c;

    public g0(Runnable runnable) {
        this.f24a = runnable;
        a0.j jVar = new a0.j(new e0(0, this));
        this.f25b = jVar;
        f0 f0Var = new f0(this);
        this.f26c = f0Var;
        jVar.b(f0Var);
    }

    public final void a(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c1.j jVar = new c1.j(onBackInvokedDispatcher, 0);
        a0.j jVar2 = this.f25b;
        jVar2.c(jVar, 1);
        jVar2.c(new c1.j(onBackInvokedDispatcher, 1000000), 0);
    }
}
