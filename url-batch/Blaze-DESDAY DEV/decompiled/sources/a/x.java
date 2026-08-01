package a;

import Y.A;
import Y.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1245a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.e f1246b = new V0.e();

    /* renamed from: c, reason: collision with root package name */
    public A f1247c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1248e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1249f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1250g;

    public x(Runnable runnable) {
        this.f1245a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1235a.a(new o(0, this), new o(1, this), new p(this, 0), new p(this, 1)) : r.f1231a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1247c == null) {
            V0.e eVar = this.f1246b;
            ListIterator<E> listIterator = eVar.listIterator(eVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f946a) {
                        break;
                    }
                }
            }
        }
        this.f1247c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1247c;
        if (a3 == null) {
            V0.e eVar = this.f1246b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.f913c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f946a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1247c = null;
        if (a3 == null) {
            this.f1245a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f946a) {
            i.L();
        } else {
            i.f975g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1248e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1231a;
        if (z2 && !this.f1249f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1249f = true;
        } else {
            if (z2 || !this.f1249f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1249f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1250g;
        boolean z3 = false;
        V0.e eVar = this.f1246b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator<E> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f946a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1250g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
