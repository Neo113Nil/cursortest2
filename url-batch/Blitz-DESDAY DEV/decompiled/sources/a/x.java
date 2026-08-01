package a;

import Z.A;
import Z.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1300a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.h f1301b;

    /* renamed from: c, reason: collision with root package name */
    public A f1302c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1303e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1304f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1305g;

    public x(Runnable runnable) {
        this.f1300a = runnable;
        X0.h hVar = new X0.h();
        hVar.f987b = X0.h.d;
        this.f1301b = hVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1290a.a(new o(0, this), new o(1, this), new p(this, 0), new p(this, 1)) : r.f1286a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1302c == null) {
            X0.h hVar = this.f1301b;
            ListIterator<E> listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f1008a) {
                        break;
                    }
                }
            }
        }
        this.f1302c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1302c;
        if (a3 == null) {
            X0.h hVar = this.f1301b;
            ListIterator listIterator = hVar.listIterator(hVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f1008a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1302c = null;
        if (a3 == null) {
            this.f1300a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f1008a) {
            i.L();
        } else {
            i.f1037g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1303e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1286a;
        if (z2 && !this.f1304f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1304f = true;
        } else {
            if (z2 || !this.f1304f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1304f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1305g;
        boolean z3 = false;
        X0.h hVar = this.f1301b;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator<E> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f1008a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1305g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
