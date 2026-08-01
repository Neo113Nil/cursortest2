package b;

import Z.A;
import Z.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2213a;

    /* renamed from: b, reason: collision with root package name */
    public final X0.i f2214b = new X0.i();

    /* renamed from: c, reason: collision with root package name */
    public A f2215c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f2216d;
    public OnBackInvokedDispatcher e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2217f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2218g;

    public w(Runnable runnable) {
        this.f2213a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f2216d = i >= 34 ? s.f2206a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : q.f2201a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f2215c == null) {
            X0.i iVar = this.f2214b;
            ListIterator<E> listIterator = iVar.listIterator(iVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f1420a) {
                        break;
                    }
                }
            }
        }
        this.f2215c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f2215c;
        if (a3 == null) {
            X0.i iVar = this.f2214b;
            ListIterator listIterator = iVar.listIterator(iVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f1420a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f2215c = null;
        if (a3 == null) {
            this.f2213a.run();
            return;
        }
        I i = a3.f1423d;
        i.y(true);
        if (i.f1451h.f1420a) {
            i.L();
        } else {
            i.f1450g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.f2216d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        q qVar = q.f2201a;
        if (z2 && !this.f2217f) {
            qVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2217f = true;
        } else {
            if (z2 || !this.f2217f) {
                return;
            }
            qVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2217f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f2218g;
        boolean z3 = false;
        X0.i iVar = this.f2214b;
        if (iVar == null || !iVar.isEmpty()) {
            Iterator<E> it = iVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f1420a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f2218g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
