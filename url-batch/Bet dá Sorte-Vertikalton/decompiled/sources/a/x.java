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
    public final Runnable f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.f f1173b = new T0.f();

    /* renamed from: c, reason: collision with root package name */
    public A f1174c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1175e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1176f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1177g;

    public x(Runnable runnable) {
        this.f1172a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1162a.a(new o(0, this), new o(1, this), new p(this, 0), new p(this, 1)) : r.f1158a.a(new p(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f1174c == null) {
            T0.f fVar = this.f1173b;
            ListIterator<E> listIterator = fVar.listIterator(fVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f873a) {
                        break;
                    }
                }
            }
        }
        this.f1174c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        A a2;
        A a3 = this.f1174c;
        if (a3 == null) {
            T0.f fVar = this.f1173b;
            fVar.getClass();
            ListIterator listIterator = fVar.listIterator(fVar.f840c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f873a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1174c = null;
        if (a3 == null) {
            this.f1172a.run();
            return;
        }
        I i = a3.d;
        i.y(true);
        if (i.h.f873a) {
            i.L();
        } else {
            i.f902g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1175e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1158a;
        if (z2 && !this.f1176f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1176f = true;
        } else {
            if (z2 || !this.f1176f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1176f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f1177g;
        boolean z3 = false;
        T0.f fVar = this.f1173b;
        if (fVar == null || !fVar.isEmpty()) {
            Iterator<E> it = fVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f873a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1177g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
