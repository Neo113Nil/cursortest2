package a;

import X.A;
import X.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1133a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.f f1134b = new R0.f();

    /* renamed from: c, reason: collision with root package name */
    public A f1135c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1136e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1137f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1138g;

    public x(Runnable runnable) {
        this.f1133a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1123a.a(new o(0, this), new o(1, this), new p(this, 0), new p(this, 1)) : r.f1119a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1135c == null) {
            R0.f fVar = this.f1134b;
            ListIterator<E> listIterator = fVar.listIterator(fVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f830a) {
                        break;
                    }
                }
            }
        }
        this.f1135c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1135c;
        if (a3 == null) {
            R0.f fVar = this.f1134b;
            fVar.getClass();
            ListIterator listIterator = fVar.listIterator(fVar.f708c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f830a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1135c = null;
        if (a3 == null) {
            this.f1133a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f830a) {
            i.L();
        } else {
            i.f859g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1136e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1119a;
        if (z2 && !this.f1137f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1137f = true;
        } else {
            if (z2 || !this.f1137f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1137f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1138g;
        boolean z3 = false;
        R0.f fVar = this.f1134b;
        if (fVar == null || !fVar.isEmpty()) {
            Iterator<E> it = fVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f830a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1138g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
