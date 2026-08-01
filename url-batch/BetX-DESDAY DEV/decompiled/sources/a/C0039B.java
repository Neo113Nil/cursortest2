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
    public final Runnable f893a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.f f894b = new O0.f();

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.C f895c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f896d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f897e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f898f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f899g;

    public C0039B(Runnable runnable) {
        this.f893a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f896d = i >= 34 ? x.f942a.a(new s(0, this), new s(1, this), new t(this, 0), new t(this, 1)) : v.f937a.a(new t(this, 2));
        }
    }

    public final void a() {
        Object obj;
        if (this.f895c == null) {
            O0.f fVar = this.f894b;
            ListIterator<E> listIterator = fVar.listIterator(fVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((androidx.fragment.app.C) obj).f1195a) {
                        break;
                    }
                }
            }
        }
        this.f895c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        androidx.fragment.app.C c2;
        androidx.fragment.app.C c3 = this.f895c;
        if (c3 == null) {
            O0.f fVar = this.f894b;
            fVar.getClass();
            ListIterator listIterator = fVar.listIterator(fVar.f691c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c2 = 0;
                    break;
                } else {
                    c2 = listIterator.previous();
                    if (((androidx.fragment.app.C) c2).f1195a) {
                        break;
                    }
                }
            }
            c3 = c2;
        }
        this.f895c = null;
        if (c3 == null) {
            this.f893a.run();
            return;
        }
        K k2 = c3.f1198d;
        k2.y(true);
        if (k2.h.f1195a) {
            k2.L();
        } else {
            k2.f1230g.b();
        }
    }

    public final void c(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f897e;
        OnBackInvokedCallback onBackInvokedCallback = this.f896d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        v vVar = v.f937a;
        if (z2 && !this.f898f) {
            vVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f898f = true;
        } else {
            if (z2 || !this.f898f) {
                return;
            }
            vVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f898f = false;
        }
    }

    public final void d() {
        boolean z2 = this.f899g;
        boolean z3 = false;
        O0.f fVar = this.f894b;
        if (fVar == null || !fVar.isEmpty()) {
            Iterator<E> it = fVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.C) it.next()).f1195a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f899g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
