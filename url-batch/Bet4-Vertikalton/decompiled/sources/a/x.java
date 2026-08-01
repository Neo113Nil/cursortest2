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
    public final Runnable f1215a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.e f1216b = new S0.e();

    /* renamed from: c, reason: collision with root package name */
    public A f1217c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1218e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1219f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1220g;

    public x(Runnable runnable) {
        this.f1215a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1205a.a(new o(0, this), new o(1, this), new p(this, 0), new p(this, 1)) : r.f1201a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1217c == null) {
            S0.e eVar = this.f1216b;
            ListIterator<E> listIterator = eVar.listIterator(eVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f919a) {
                        break;
                    }
                }
            }
        }
        this.f1217c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1217c;
        if (a3 == null) {
            S0.e eVar = this.f1216b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.f791c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f919a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1217c = null;
        if (a3 == null) {
            this.f1215a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f919a) {
            i.L();
        } else {
            i.f948g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1218e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1201a;
        if (z2 && !this.f1219f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1219f = true;
        } else {
            if (z2 || !this.f1219f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1219f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1220g;
        boolean z3 = false;
        S0.e eVar = this.f1216b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator<E> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f919a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1220g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
