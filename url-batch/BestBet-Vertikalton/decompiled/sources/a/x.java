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
    public final Runnable f1616a;

    /* renamed from: b, reason: collision with root package name */
    public final Y0.h f1617b = new Y0.h();

    /* renamed from: c, reason: collision with root package name */
    public A f1618c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1619e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1620f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1621g;

    public x(Runnable runnable) {
        this.f1616a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1609a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.f1605a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1618c == null) {
            Y0.h hVar = this.f1617b;
            ListIterator<E> listIterator = hVar.listIterator(hVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f1279a) {
                        break;
                    }
                }
            }
        }
        this.f1618c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1618c;
        if (a3 == null) {
            Y0.h hVar = this.f1617b;
            ListIterator listIterator = hVar.listIterator(hVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f1279a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1618c = null;
        if (a3 == null) {
            this.f1616a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f1279a) {
            i.L();
        } else {
            i.f1307g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1619e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1605a;
        if (z2 && !this.f1620f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1620f = true;
        } else {
            if (z2 || !this.f1620f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1620f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1621g;
        boolean z3 = false;
        Y0.h hVar = this.f1617b;
        if (hVar == null || !hVar.isEmpty()) {
            Iterator<E> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f1279a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1621g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
