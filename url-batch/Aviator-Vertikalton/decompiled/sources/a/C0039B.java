package a;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.K;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: a.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039B {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f892a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.f f893b = new O0.f();

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.C f894c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f895d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f896e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f897f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f898g;

    public C0039B(Runnable runnable) {
        this.f892a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f895d = i >= 34 ? x.f941a.a(new s(0, this), new s(1, this), new t(this, 0), new t(this, 1)) : v.f936a.a(new t(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f894c == null) {
            O0.f fVar = this.f893b;
            ListIterator<E> listIterator = fVar.listIterator(fVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((androidx.fragment.app.C) obj).f1194a) {
                        break;
                    }
                }
            }
        }
        this.f894c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        androidx.fragment.app.C c2;
        androidx.fragment.app.C c3 = this.f894c;
        if (c3 == null) {
            O0.f fVar = this.f893b;
            fVar.getClass();
            ListIterator listIterator = fVar.listIterator(fVar.f690c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c2 = 0;
                    break;
                } else {
                    c2 = listIterator.previous();
                    if (((androidx.fragment.app.C) c2).f1194a) {
                        break;
                    }
                }
            }
            c3 = c2;
        }
        this.f894c = null;
        if (c3 == null) {
            this.f892a.run();
            return;
        }
        K k2 = c3.f1197d;
        k2.y(true);
        if (k2.h.f1194a) {
            k2.L();
        } else {
            k2.f1229g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f896e;
        OnBackInvokedCallback onBackInvokedCallback = this.f895d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        v vVar = v.f936a;
        if (z2 && !this.f897f) {
            vVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f897f = true;
        } else {
            if (z2 || !this.f897f) {
                return;
            }
            vVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f897f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f898g;
        boolean z3 = false;
        O0.f fVar = this.f893b;
        if (fVar == null || !fVar.isEmpty()) {
            Iterator<E> it = fVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.C) it.next()).f1194a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f898g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
