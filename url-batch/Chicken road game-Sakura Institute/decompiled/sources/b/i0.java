package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1161a;

    /* renamed from: b, reason: collision with root package name */
    public final e6.j f1162b = new e6.j();

    /* renamed from: c, reason: collision with root package name */
    public y f1163c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f1164d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1165e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1166f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1167g;

    public i0(Runnable runnable) {
        OnBackInvokedCallback a3;
        this.f1161a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (i7 >= 34) {
                a3 = e0.f1149a.a(new z(this, 0), new z(this, 1), new a0(this, 0), new a0(this, 1));
            } else {
                a3 = c0.f1140a.a(new a0(this, 2));
            }
            this.f1164d = a3;
        }
    }

    public final void a(androidx.lifecycle.v vVar, y yVar) {
        r6.k.f(vVar, "owner");
        r6.k.f(yVar, "onBackPressedCallback");
        androidx.lifecycle.x f9 = vVar.f();
        if (f9.f1046d == androidx.lifecycle.o.f1007f) {
            return;
        }
        yVar.f1221b.add(new f0(this, f9, yVar));
        e();
        yVar.f1222c = new h0(0, this, i0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        y yVar;
        y yVar2 = this.f1163c;
        if (yVar2 == null) {
            e6.j jVar = this.f1162b;
            ListIterator listIterator = jVar.listIterator(jVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    yVar = 0;
                    break;
                } else {
                    yVar = listIterator.previous();
                    if (((y) yVar).f1220a) {
                        break;
                    }
                }
            }
            yVar2 = yVar;
        }
        this.f1163c = null;
        if (yVar2 != null) {
            yVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        y yVar;
        y yVar2 = this.f1163c;
        if (yVar2 == null) {
            e6.j jVar = this.f1162b;
            ListIterator listIterator = jVar.listIterator(jVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    yVar = 0;
                    break;
                } else {
                    yVar = listIterator.previous();
                    if (((y) yVar).f1220a) {
                        break;
                    }
                }
            }
            yVar2 = yVar;
        }
        this.f1163c = null;
        if (yVar2 != null) {
            yVar2.b();
        } else {
            this.f1161a.run();
        }
    }

    public final void d(boolean z8) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1165e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f1164d) == null) {
            return;
        }
        c0 c0Var = c0.f1140a;
        if (z8 && !this.f1166f) {
            c0Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1166f = true;
        } else {
            if (z8 || !this.f1166f) {
                return;
            }
            c0Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1166f = false;
        }
    }

    public final void e() {
        boolean z8 = this.f1167g;
        boolean z9 = false;
        e6.j jVar = this.f1162b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((y) it.next()).f1220a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f1167g = z9;
        if (z9 == z8 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z9);
    }
}
