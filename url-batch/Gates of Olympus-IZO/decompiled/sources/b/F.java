package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.InterfaceC0236v;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4132a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.j f4133b = new M1.j();

    /* renamed from: c, reason: collision with root package name */
    public w f4134c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f4135d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f4136e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4137f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4138g;

    public F(Runnable runnable) {
        this.f4132a = runnable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f4135d = i3 >= 34 ? C.f4125a.a(new x(this, 0), new x(this, 1), new y(this, 0), new y(this, 1)) : A.f4120a.a(new y(this, 2));
        }
    }

    public final void a(InterfaceC0236v interfaceC0236v, w wVar) {
        Z1.i.f(interfaceC0236v, "owner");
        Z1.i.f(wVar, "onBackPressedCallback");
        C0238x e3 = interfaceC0236v.e();
        if (e3.f4041d == EnumC0230o.f4025d) {
            return;
        }
        wVar.f4201b.add(new D(this, e3, wVar));
        e();
        wVar.f4202c = new Z.d(0, this, F.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        w wVar;
        w wVar2 = this.f4134c;
        if (wVar2 == null) {
            M1.j jVar = this.f4133b;
            ListIterator listIterator = jVar.listIterator(jVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    wVar = 0;
                    break;
                } else {
                    wVar = listIterator.previous();
                    if (((w) wVar).f4200a) {
                        break;
                    }
                }
            }
            wVar2 = wVar;
        }
        this.f4134c = null;
        if (wVar2 != null) {
            wVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        w wVar;
        w wVar2 = this.f4134c;
        if (wVar2 == null) {
            M1.j jVar = this.f4133b;
            ListIterator listIterator = jVar.listIterator(jVar.b());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    wVar = 0;
                    break;
                } else {
                    wVar = listIterator.previous();
                    if (((w) wVar).f4200a) {
                        break;
                    }
                }
            }
            wVar2 = wVar;
        }
        this.f4134c = null;
        if (wVar2 != null) {
            wVar2.b();
        } else {
            this.f4132a.run();
        }
    }

    public final void d(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4136e;
        OnBackInvokedCallback onBackInvokedCallback = this.f4135d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        A a3 = A.f4120a;
        if (z3 && !this.f4137f) {
            a3.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f4137f = true;
        } else {
            if (z3 || !this.f4137f) {
                return;
            }
            a3.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4137f = false;
        }
    }

    public final void e() {
        boolean z3 = this.f4138g;
        boolean z4 = false;
        M1.j jVar = this.f4133b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((w) it.next()).f4200a) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f4138g = z4;
        if (z4 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z4);
    }
}
