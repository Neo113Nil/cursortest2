package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.InterfaceC0292v;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: b.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301E {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f5267a;

    /* renamed from: b, reason: collision with root package name */
    public final S1.j f5268b = new S1.j();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0327w f5269c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f5270d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f5271e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5272f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5273g;

    public C0301E(Runnable runnable) {
        this.f5267a = runnable;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f5270d = i3 >= 34 ? C0298B.f5260a.a(new C0328x(this, 0), new C0328x(this, 1), new C0329y(this, 0), new C0329y(this, 1)) : C0330z.f5344a.a(new C0329y(this, 2));
        }
    }

    public final void a(InterfaceC0292v interfaceC0292v, AbstractC0327w abstractC0327w) {
        f2.j.f(interfaceC0292v, "owner");
        f2.j.f(abstractC0327w, "onBackPressedCallback");
        C0294x e3 = interfaceC0292v.e();
        if (e3.f5242d == EnumC0286o.f5226d) {
            return;
        }
        abstractC0327w.f5338b.add(new C0299C(this, e3, abstractC0327w));
        e();
        abstractC0327w.f5339c = new Z.e(0, this, C0301E.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        AbstractC0327w abstractC0327w;
        AbstractC0327w abstractC0327w2 = this.f5269c;
        if (abstractC0327w2 == null) {
            S1.j jVar = this.f5268b;
            ListIterator listIterator = jVar.listIterator(jVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0327w = 0;
                    break;
                } else {
                    abstractC0327w = listIterator.previous();
                    if (((AbstractC0327w) abstractC0327w).f5337a) {
                        break;
                    }
                }
            }
            abstractC0327w2 = abstractC0327w;
        }
        this.f5269c = null;
        if (abstractC0327w2 != null) {
            abstractC0327w2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        AbstractC0327w abstractC0327w;
        AbstractC0327w abstractC0327w2 = this.f5269c;
        if (abstractC0327w2 == null) {
            S1.j jVar = this.f5268b;
            ListIterator listIterator = jVar.listIterator(jVar.b());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0327w = 0;
                    break;
                } else {
                    abstractC0327w = listIterator.previous();
                    if (((AbstractC0327w) abstractC0327w).f5337a) {
                        break;
                    }
                }
            }
            abstractC0327w2 = abstractC0327w;
        }
        this.f5269c = null;
        if (abstractC0327w2 != null) {
            abstractC0327w2.b();
        } else {
            this.f5267a.run();
        }
    }

    public final void d(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f5271e;
        OnBackInvokedCallback onBackInvokedCallback = this.f5270d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0330z c0330z = C0330z.f5344a;
        if (z3 && !this.f5272f) {
            c0330z.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f5272f = true;
        } else {
            if (z3 || !this.f5272f) {
                return;
            }
            c0330z.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5272f = false;
        }
    }

    public final void e() {
        boolean z3 = this.f5273g;
        boolean z4 = false;
        S1.j jVar = this.f5268b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0327w) it.next()).f5337a) {
                    z4 = true;
                    break;
                }
            }
        }
        this.f5273g = z4;
        if (z4 == z3 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z4);
    }
}
