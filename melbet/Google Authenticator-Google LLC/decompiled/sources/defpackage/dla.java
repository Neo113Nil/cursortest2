package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.apps.authenticator2.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dla implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {
    private static final hkh i = hkh.l("com/google/android/libraries/logging/ve/ViewNode");
    public final View a;
    public final dks b;
    public ViewGroup d;
    public final dmi f;
    public final cka h;
    private dks j;
    private final ViewTreeObserver.OnDrawListener o;
    private boolean k = false;
    public boolean c = false;
    private boolean l = false;
    public dks e = null;
    private int p = 2;
    private final Rect m = new Rect();
    public Runnable g = null;
    private boolean n = false;

    public dla(View view, dks dksVar) {
        this.a = view;
        this.b = dksVar;
        this.h = dksVar.d;
        jkl jklVar = dksVar.c;
        iwq iwqVar = dmh.a;
        jkm jkmVar = (jkm) jklVar.b;
        jkmVar.g(iwqVar);
        Object j = jkmVar.l.j((jko) iwqVar.c);
        if (j == null) {
            j = iwqVar.b;
        } else {
            iwqVar.c(j);
        }
        dmi dmiVar = (dmi) j;
        this.f = dmiVar;
        int x = a.x(dmiVar.b);
        if (x != 0 && x == 3) {
            this.o = new ViewTreeObserver.OnDrawListener() { // from class: dkz
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    dla dlaVar = dla.this;
                    if (dlaVar.d.isDirty() && dlaVar.g == null) {
                        dlaVar.g = new ath(dlaVar, 18);
                        fao.d(dlaVar.g, dlaVar.f.c);
                    }
                }
            };
        } else {
            this.o = null;
        }
    }

    public static View a(dks dksVar) {
        dla dlaVar = dksVar.b;
        if (dlaVar instanceof dla) {
            return dlaVar.a;
        }
        return null;
    }

    public static dks b(View view) {
        return (dks) view.getTag(R.id.ve_tag);
    }

    public static boolean i(View view) {
        return view.getId() == 16908290;
    }

    private final void l() {
        Runnable runnable = this.g;
        if (runnable != null) {
            fao.f(runnable);
            this.g = null;
        }
    }

    private final void m() {
        int x;
        l();
        dmi dmiVar = this.f;
        int x2 = a.x(dmiVar.b);
        if (x2 != 0 && x2 == 3) {
            this.a.getViewTreeObserver().removeOnDrawListener(this.o);
        }
        if (this.d == null || ((x = a.x(dmiVar.b)) != 0 && x == 2)) {
            this.a.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.d = null;
        }
    }

    private final void n() {
        ViewGroup viewGroup;
        int x;
        hoq.H(this.k);
        boolean z = this.l;
        View view = this.a;
        if (z) {
            viewGroup = (ViewGroup) view.getRootView().findViewById(android.R.id.content);
            viewGroup.getClass();
            this.d = viewGroup;
        } else {
            viewGroup = (ViewGroup) view.getParent();
            this.d = viewGroup;
        }
        if (viewGroup != null) {
            viewGroup.addOnLayoutChangeListener(this);
        }
        if (this.d == null || ((x = a.x(this.f.b)) != 0 && x == 2)) {
            this.a.addOnLayoutChangeListener(this);
        }
        int x2 = a.x(this.f.b);
        if (x2 != 0 && x2 == 3) {
            this.a.getViewTreeObserver().addOnDrawListener(this.o);
        }
    }

    private static void o(View view, dlh dlhVar) {
        dks b = b(view);
        if (b != null) {
            dla dlaVar = b.b;
            if (dlaVar instanceof dla) {
                dks dksVar = dlaVar.j;
                if (dlaVar.l) {
                    return;
                }
            }
            dlhVar.b(b);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                o(viewGroup.getChildAt(i2), dlhVar);
            }
        }
    }

    public final dks c() {
        if (!h() && !this.l) {
            dks dksVar = this.e;
            if (dksVar != null) {
                return dksVar;
            }
            for (ViewParent parent = this.a.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
                View view = (View) parent;
                dks b = b(view);
                if (b != null) {
                    if (this.k) {
                        this.e = b;
                    }
                    return b;
                }
                if (i(view)) {
                    break;
                }
            }
        }
        return null;
    }

    public final void d() {
        if (!this.k || this.c) {
            return;
        }
        this.c = true;
        this.h.d(this.b);
    }

    public final void e() {
        if (this.c) {
            this.c = false;
            this.h.e(this.b);
            this.e = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    public final void f() {
        l();
        int k = k();
        if (k != this.p) {
            this.p = k;
            if (this.c) {
                cka ckaVar = this.h;
                dks dksVar = this.b;
                ?? r1 = ckaVar.a;
                if (!r1.isEmpty()) {
                    Iterator it = r1.iterator();
                    while (it.hasNext()) {
                        Object obj = ((kee) it.next()).a;
                        long c = dih.c();
                        if (c != -1) {
                            jkl jklVar = dksVar.c;
                            long j = c * 1000;
                            if (!jklVar.b.M()) {
                                jklVar.t();
                            }
                            dkx dkxVar = (dkx) jklVar.b;
                            dkx dkxVar2 = dkx.a;
                            dkxVar.b |= 4;
                            dkxVar.f = j;
                        }
                        dlk dlkVar = (dlk) obj;
                        if (dlkVar.c.d(dksVar, k)) {
                            dlkVar.b();
                        }
                    }
                }
            }
        }
        this.g = null;
    }

    public final void g(dlh dlhVar) {
        View view = this.a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                o(viewGroup.getChildAt(i2), dlhVar);
            }
        }
    }

    public final boolean h() {
        return i(this.a) || this.l;
    }

    public final void j(boolean z) {
        if (this.l == z) {
            return;
        }
        boolean z2 = true;
        if (z && i(this.a)) {
            z2 = false;
        }
        hoq.x(z2);
        ((hkf) ((hkf) i.b()).i("com/google/android/libraries/logging/ve/ViewNode", "setIsolated", 155, "ViewNode.java")).u("setIsolated %s", this.a);
        if (this.k) {
            m();
        }
        this.l = z;
        if (this.k) {
            n();
        }
    }

    public final int k() {
        View view = this.a;
        if (view.getVisibility() != 0) {
            return 2;
        }
        if (this.l && !view.isShown()) {
            return 2;
        }
        dmi dmiVar = this.f;
        int x = a.x(dmiVar.b);
        if (x != 0 && x != 1) {
            ViewGroup viewGroup = this.d;
            if (viewGroup == null) {
                return 2;
            }
            Rect rect = this.m;
            rect.set(viewGroup.getScrollX(), this.d.getScrollY(), this.d.getWidth() + this.d.getScrollX(), this.d.getHeight() + this.d.getScrollY());
            if (view.getLeft() > rect.left || view.getTop() > rect.top || view.getRight() < rect.right || view.getBottom() < rect.bottom) {
                if (rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.toString();
                    int width = ((rect.width() * rect.height()) * 100) / (view.getWidth() * view.getHeight());
                    dmg dmgVar = dmiVar.d;
                    if (dmgVar == null) {
                        dmgVar = dmg.a;
                    }
                    if (width < dmgVar.b) {
                    }
                }
                return 2;
            }
        }
        return 1;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int x = a.x(this.f.b);
        if (x == 0 || x != 2) {
            View view2 = this.a;
            if (view == view2) {
                hoq.H(this.d == null);
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                this.d = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
                view2.removeOnLayoutChangeListener(this);
            }
        } else {
            if (this.n && view == this.d) {
                this.n = false;
                return;
            }
            View view3 = this.a;
            boolean z = view != view3;
            if (view == view3) {
                this.n = true;
            } else {
                this.n = false;
            }
            if (this.d == null) {
                hoq.H(!z);
                ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                this.d = viewGroup2;
                viewGroup2.addOnLayoutChangeListener(this);
            }
        }
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((hkf) ((hkf) i.b()).i("com/google/android/libraries/logging/ve/ViewNode", "onViewAttachedToWindow", 392, "ViewNode.java")).w("onViewAttachedToWindow self=%s, view=%s", this.a, view);
        cka.g(!this.k);
        this.k = true;
        n();
        d();
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((hkf) ((hkf) i.b()).i("com/google/android/libraries/logging/ve/ViewNode", "onViewDetachedFromWindow", 408, "ViewNode.java")).w("onViewDetachedToWindow self=%s, view=%s", this.a, view);
        cka.g(this.k);
        this.k = false;
        m();
        e();
    }
}
