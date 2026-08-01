package a;

import X.A;
import X.I;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0072m;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.ResultActivity;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1236a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.c f1237b = new V0.c();

    /* renamed from: c, reason: collision with root package name */
    public A f1238c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f1239e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1240f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1241g;

    public x(Runnable runnable) {
        this.f1236a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? t.f1229a.a(new o(this, 0), new o(this, 1), new p(this, 0), new p(this, 1)) : r.f1225a.a(new p(this, 2));
        }
    }

    public final void a(androidx.lifecycle.t tVar, A a2) {
        g1.f.e(a2, "onBackPressedCallback");
        androidx.lifecycle.v d = tVar.d();
        if (d.d == EnumC0072m.f1503a) {
            return;
        }
        a2.f925b.add(new u(this, d, a2));
        e();
        a2.f926c = new w(0, this, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final void b() {
        Object obj;
        if (this.f1238c == null) {
            V0.c cVar = this.f1237b;
            ListIterator<E> listIterator = cVar.listIterator(cVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((A) obj).f924a) {
                        break;
                    }
                }
            }
        }
        this.f1238c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        A a2;
        A a3 = this.f1238c;
        if (a3 == null) {
            V0.c cVar = this.f1237b;
            ListIterator listIterator = cVar.listIterator(cVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    a2 = 0;
                    break;
                } else {
                    a2 = listIterator.previous();
                    if (((A) a2).f924a) {
                        break;
                    }
                }
            }
            a3 = a2;
        }
        this.f1238c = null;
        if (a3 == null) {
            this.f1236a.run();
            return;
        }
        switch (a3.d) {
            case 0:
                I i = (I) a3.f927e;
                i.y(true);
                if (!i.h.f924a) {
                    i.f954g.c();
                    break;
                } else {
                    i.L();
                    break;
                }
            case 1:
                ((GameActivity) a3.f927e).finish();
                break;
            default:
                ((ResultActivity) a3.f927e).finish();
                break;
        }
    }

    public final void d(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1239e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        r rVar = r.f1225a;
        if (z2 && !this.f1240f) {
            rVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1240f = true;
        } else {
            if (z2 || !this.f1240f) {
                return;
            }
            rVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1240f = false;
        }
    }

    public final void e() {
        boolean z2 = this.f1241g;
        boolean z3 = false;
        V0.c cVar = this.f1237b;
        if (cVar == null || !cVar.isEmpty()) {
            Iterator<E> it = cVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((A) it.next()).f924a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f1241g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z3);
    }
}
