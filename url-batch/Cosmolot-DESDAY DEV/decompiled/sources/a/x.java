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
    public final Runnable f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0.b f1096b = new Q0.b();

    /* renamed from: c, reason: collision with root package name */
    public A f1097c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1098e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1099f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1100g;

    public x(Runnable runnable) {
        this.f1095a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1085a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.f1081a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1097c == null) {
            Q0.b bVar = this.f1096b;
            ListIterator<E> listIterator = bVar.listIterator(bVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f782a) {
                        break;
                    }
                }
            }
        }
        this.f1097c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1097c;
        if (a3 == null) {
            Q0.b bVar = this.f1096b;
            bVar.getClass();
            ListIterator listIterator = bVar.listIterator(bVar.f661c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f782a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1097c = null;
        if (a3 == null) {
            this.f1095a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f782a) {
            i.L();
        } else {
            i.f811g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1098e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1081a;
        if (z2 && !this.f1099f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1099f = true;
        } else {
            if (z2 || !this.f1099f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1099f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1100g;
        boolean z3 = false;
        Q0.b bVar = this.f1096b;
        if (bVar == null || !bVar.isEmpty()) {
            Iterator<E> it = bVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f782a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1100g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
