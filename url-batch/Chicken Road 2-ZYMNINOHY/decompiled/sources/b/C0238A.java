package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0230i;
import androidx.lifecycle.InterfaceC0235n;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: b.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238A {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f5205a;

    /* renamed from: b, reason: collision with root package name */
    public final d3.f f5206b = new d3.f();

    /* renamed from: c, reason: collision with root package name */
    public q f5207c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f5208d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f5209e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5210f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5211g;

    public C0238A(Runnable runnable) {
        OnBackInvokedCallback a3;
        this.f5205a = runnable;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (i4 >= 34) {
                a3 = w.f5249a.a(new r(this, 0), new r(this, 1), new s(this, 0), new s(this, 1));
            } else {
                a3 = u.f5244a.a(new s(this, 2));
            }
            this.f5208d = a3;
        }
    }

    public final void a(InterfaceC0235n interfaceC0235n, q onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0231j lifecycle = interfaceC0235n.getLifecycle();
        if (((C0237p) lifecycle).f5052c == EnumC0230i.f5041a) {
            return;
        }
        onBackPressedCallback.addCancellable(new x(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new z(0, this, C0238A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        q qVar;
        q qVar2 = this.f5207c;
        if (qVar2 == null) {
            d3.f fVar = this.f5206b;
            ListIterator listIterator = fVar.listIterator(fVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVar = 0;
                    break;
                } else {
                    qVar = listIterator.previous();
                    if (((q) qVar).isEnabled()) {
                        break;
                    }
                }
            }
            qVar2 = qVar;
        }
        this.f5207c = null;
        if (qVar2 != null) {
            qVar2.handleOnBackCancelled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        q qVar;
        q qVar2 = this.f5207c;
        if (qVar2 == null) {
            d3.f fVar = this.f5206b;
            fVar.getClass();
            ListIterator listIterator = fVar.listIterator(fVar.f8329c);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qVar = 0;
                    break;
                } else {
                    qVar = listIterator.previous();
                    if (((q) qVar).isEnabled()) {
                        break;
                    }
                }
            }
            qVar2 = qVar;
        }
        this.f5207c = null;
        if (qVar2 != null) {
            qVar2.handleOnBackPressed();
        } else {
            this.f5205a.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f5209e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f5208d) == null) {
            return;
        }
        u uVar = u.f5244a;
        if (z && !this.f5210f) {
            uVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f5210f = true;
        } else {
            if (z || !this.f5210f) {
                return;
            }
            uVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5210f = false;
        }
    }

    public final void e() {
        boolean z = this.f5211g;
        boolean z4 = false;
        d3.f fVar = this.f5206b;
        if (fVar == null || !fVar.isEmpty()) {
            Iterator<E> it = fVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((q) it.next()).isEnabled()) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f5211g = z4;
        if (z4 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z4);
    }
}
