package b;

import android.window.OnBackInvokedDispatcher;
import c5.x;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1019a;

    /* renamed from: b, reason: collision with root package name */
    public final x f1020b;

    public t(Runnable runnable) {
        this.f1019a = runnable;
        q qVar = new q(this);
        x xVar = new x();
        xVar.f1737d = qVar;
        xVar.f1738e = new s4.f();
        new LinkedHashSet();
        xVar.f1739f = new LinkedHashSet();
        xVar.f1740g = new LinkedHashSet();
        this.f1020b = xVar;
        xVar.c(new r());
    }

    public final void a(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        s4.j jVar = new s4.j(onBackInvokedDispatcher, 0);
        x xVar = this.f1020b;
        xVar.d(jVar, 1);
        xVar.d(new s4.j(onBackInvokedDispatcher, 1000000), 0);
    }
}
