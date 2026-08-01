package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.k0;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f107a;

    /* renamed from: b, reason: collision with root package name */
    public final n2.e f108b = new n2.e();
    public androidx.fragment.app.c0 c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f109d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f110e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111f;
    public boolean g;

    public h0(Runnable runnable) {
        this.f107a = runnable;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            this.f109d = i4 >= 34 ? new e0(new b0(this, 0), new b0(this, 1), new c0(this, 0), new c0(this, 1)) : new d0(0, new c0(this, 2));
        }
    }

    public final void a(androidx.lifecycle.r rVar, androidx.fragment.app.c0 c0Var) {
        u2.c.e(c0Var, "onBackPressedCallback");
        androidx.lifecycle.t f4 = rVar.f();
        if (f4.c == androidx.lifecycle.m.f590f) {
            return;
        }
        c0Var.f411b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, f4, c0Var));
        e();
        c0Var.c = new g0(0, this);
    }

    public final void b() {
        Object obj;
        if (this.c == null) {
            n2.e eVar = this.f108b;
            ListIterator<E> listIterator = eVar.listIterator(eVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((androidx.fragment.app.c0) obj).f410a) {
                        break;
                    }
                }
            }
        }
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        androidx.fragment.app.c0 c0Var;
        androidx.fragment.app.c0 c0Var2 = this.c;
        if (c0Var2 == null) {
            n2.e eVar = this.f108b;
            eVar.getClass();
            ListIterator listIterator = eVar.listIterator(eVar.h);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0Var = 0;
                    break;
                } else {
                    c0Var = listIterator.previous();
                    if (((androidx.fragment.app.c0) c0Var).f410a) {
                        break;
                    }
                }
            }
            c0Var2 = c0Var;
        }
        this.c = null;
        if (c0Var2 == null) {
            this.f107a.run();
            return;
        }
        k0 k0Var = c0Var2.f412d;
        k0Var.y(true);
        if (k0Var.h.f410a) {
            k0Var.N();
        } else {
            k0Var.g.c();
        }
    }

    public final void d(boolean z3) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f110e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f109d) == null) {
            return;
        }
        if (z3 && !this.f111f) {
            i.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f111f = true;
        } else {
            if (z3 || !this.f111f) {
                return;
            }
            i.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f111f = false;
        }
    }

    public final void e() {
        boolean z3 = this.g;
        boolean z4 = false;
        n2.e eVar = this.f108b;
        if (eVar == null || !eVar.isEmpty()) {
            Iterator<E> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.c0) it.next()).f410a) {
                    z4 = true;
                    break;
                }
            }
        }
        this.g = z4;
        if (z4 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z4);
    }
}
