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
    public final Runnable f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final W0.e f1292b = new W0.e();

    /* renamed from: c, reason: collision with root package name */
    public A f1293c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1294e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1295f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1296g;

    public x(Runnable runnable) {
        this.f1291a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1281a.a(new o(0, this), new o(1, this), new p(this, 0), new p(this, 1)) : r.f1277a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1293c == null) {
            W0.e eVar = this.f1292b;
            ListIterator<E> listIterator = eVar.listIterator(eVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f989a) {
                        break;
                    }
                }
            }
        }
        this.f1293c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1293c;
        if (a3 == null) {
            W0.e eVar = this.f1292b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.f955c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f989a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1293c = null;
        if (a3 == null) {
            this.f1291a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.f1019h.f989a) {
            i.L();
        } else {
            i.f1018g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1294e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1277a;
        if (z2 && !this.f1295f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1295f = true;
        } else {
            if (z2 || !this.f1295f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1295f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1296g;
        boolean z3 = false;
        W0.e eVar = this.f1292b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator<E> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f989a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1296g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
