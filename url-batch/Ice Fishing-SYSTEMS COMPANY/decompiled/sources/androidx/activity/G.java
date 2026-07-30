package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0507o;
import androidx.lifecycle.InterfaceC0513v;
import java.util.Iterator;
import java.util.ListIterator;
import r7.C4977h;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4538a;

    /* renamed from: b, reason: collision with root package name */
    public final C4977h f4539b = new C4977h();

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.E f4540c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4541d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4542e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4543f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4544g;

    public G(Runnable runnable) {
        this.f4538a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f4541d = i >= 34 ? new D(new A(this, 0), new A(this, 1), new B(this, 0), new B(this, 1)) : new C(0, new B(this, 2));
        }
    }

    public final void a(InterfaceC0513v interfaceC0513v, androidx.fragment.app.E onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0508p lifecycle = interfaceC0513v.getLifecycle();
        if (((C0515x) lifecycle).f5290d == EnumC0507o.f5276n) {
            return;
        }
        onBackPressedCallback.f4933b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f4934c = new F(0, this, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object obj;
        if (this.f4540c == null) {
            C4977h c4977h = this.f4539b;
            ListIterator<E> listIterator = c4977h.listIterator(c4977h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (((androidx.fragment.app.E) obj).f4932a) {
                        break;
                    }
                }
            }
        }
        this.f4540c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        androidx.fragment.app.E e6;
        androidx.fragment.app.E e9 = this.f4540c;
        if (e9 == null) {
            C4977h c4977h = this.f4539b;
            ListIterator listIterator = c4977h.listIterator(c4977h.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    e6 = 0;
                    break;
                } else {
                    e6 = listIterator.previous();
                    if (((androidx.fragment.app.E) e6).f4932a) {
                        break;
                    }
                }
            }
            e9 = e6;
        }
        this.f4540c = null;
        if (e9 == null) {
            this.f4538a.run();
            return;
        }
        N n9 = e9.f4935d;
        n9.x(true);
        if (n9.f4969h.f4932a) {
            n9.L();
        } else {
            n9.f4968g.c();
        }
    }

    public final void d(boolean z8) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4542e;
        OnBackInvokedCallback onBackInvokedCallback = this.f4541d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z8 && !this.f4543f) {
            AbstractC0466h.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4543f = true;
        } else {
            if (z8 || !this.f4543f) {
                return;
            }
            AbstractC0466h.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4543f = false;
        }
    }

    public final void e() {
        boolean z8 = this.f4544g;
        boolean z9 = false;
        C4977h c4977h = this.f4539b;
        if (c4977h == null || !c4977h.isEmpty()) {
            Iterator<E> it = c4977h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((androidx.fragment.app.E) it.next()).f4932a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.f4544g = z9;
        if (z9 == z8 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z9);
    }
}
