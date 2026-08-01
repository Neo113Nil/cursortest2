package androidx.fragment.app;

import M.C;
import M.P;
import M.t0;
import Y.a;
import Z.AbstractComponentCallbacksC0053q;
import Z.C0037a;
import Z.C0056u;
import Z.I;
import Z.O;
import a0.AbstractC0062d;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.winpower.neonfit.R;
import h.AbstractActivityC0132i;
import j1.h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1896a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1897b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1898c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        h.e(context, "context");
        this.f1896a = new ArrayList();
        this.f1897b = new ArrayList();
        this.f1899d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1389b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f1897b.contains(view)) {
            this.f1896a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        h.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0053q ? (AbstractComponentCallbacksC0053q) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        t0 t0Var;
        h.e(windowInsets, "insets");
        t0 g2 = t0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1898c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            h.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            t0Var = t0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = P.f711a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = C.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = t0.g(this, b2);
                }
            }
            t0Var = g2;
        }
        if (!t0Var.f794a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = P.f711a;
                WindowInsets f3 = t0Var.f();
                if (f3 != null) {
                    WindowInsets a2 = C.a(childAt, f3);
                    if (!a2.equals(f3)) {
                        t0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        if (this.f1899d) {
            Iterator it = this.f1896a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h.e(canvas, "canvas");
        h.e(view, "child");
        if (this.f1899d) {
            ArrayList arrayList = this.f1896a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        h.e(view, "view");
        this.f1897b.remove(view);
        if (this.f1896a.remove(view)) {
            this.f1899d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0053q> F getFragment() {
        AbstractActivityC0132i abstractActivityC0132i;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q;
        I i;
        View view = this;
        while (true) {
            abstractActivityC0132i = null;
            if (view == null) {
                abstractComponentCallbacksC0053q = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0053q = tag instanceof AbstractComponentCallbacksC0053q ? (AbstractComponentCallbacksC0053q) tag : null;
            if (abstractComponentCallbacksC0053q != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0053q == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0132i) {
                    abstractActivityC0132i = (AbstractActivityC0132i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0132i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            i = ((C0056u) abstractActivityC0132i.f2802s.f145b).e;
        } else {
            if (!abstractComponentCallbacksC0053q.m()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0053q + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            i = abstractComponentCallbacksC0053q.g();
        }
        return (F) i.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        h.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                h.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        h.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            h.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            h.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1899d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        h.e(onApplyWindowInsetsListener, "listener");
        this.f1898c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        h.e(view, "view");
        if (view.getParent() == this) {
            this.f1897b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, I i) {
        super(context, attributeSet);
        View view;
        h.e(context, "context");
        h.e(attributeSet, "attrs");
        h.e(i, "fm");
        this.f1896a = new ArrayList();
        this.f1897b = new ArrayList();
        this.f1899d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1389b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0053q A2 = i.A(id);
        if (classAttribute != null && A2 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            Z.C C2 = i.C();
            context.getClassLoader();
            AbstractComponentCallbacksC0053q a2 = C2.a(classAttribute);
            h.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1593C = true;
            C0056u c0056u = a2.f1623s;
            if ((c0056u == null ? null : c0056u.f1637b) != null) {
                a2.f1593C = true;
            }
            C0037a c0037a = new C0037a(i);
            c0037a.f1530o = true;
            a2.f1594D = this;
            int id2 = getId();
            String str = a2.f1600K;
            if (str != null) {
                AbstractC0062d.c(a2, str);
            }
            Class<?> cls = a2.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = a2.f1628x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + a2 + ": was " + a2.f1628x + " now " + string);
                    }
                    a2.f1628x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + a2 + " with tag " + string + " to container view with no id");
                    }
                    int i2 = a2.f1626v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + a2 + ": was " + a2.f1626v + " now " + id2);
                    }
                    a2.f1626v = id2;
                    a2.f1627w = id2;
                }
                c0037a.b(new Z.P(1, a2));
                I i3 = c0037a.f1531p;
                a2.f1622r = i3;
                if (!c0037a.f1524g) {
                    if (i3.f1461t != null && !i3.f1439G) {
                        i3.x(true);
                        c0037a.a(i3.f1440I, i3.f1441J);
                        i3.f1446b = true;
                        try {
                            i3.P(i3.f1440I, i3.f1441J);
                            i3.d();
                            i3.a0();
                            i3.u();
                            ((HashMap) i3.f1447c.f1306b).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            i3.d();
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            } else {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
        }
        Iterator it = i.f1447c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
            if (abstractComponentCallbacksC0053q.f1627w == getId() && (view = abstractComponentCallbacksC0053q.f1595E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0053q.f1594D = this;
                o2.b();
            }
        }
    }
}
