package androidx.fragment.app;

import K.D;
import K.Q;
import K.w0;
import X.a;
import Y.AbstractComponentCallbacksC0050q;
import Y.C;
import Y.C0034a;
import Y.C0053u;
import Y.I;
import Y.O;
import Y.P;
import Z.d;
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
import com.fortunequest.neontrack.R;
import g.AbstractActivityC0128i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.e;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1850a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1851b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1852c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        e.e(context, "context");
        this.f1850a = new ArrayList();
        this.f1851b = new ArrayList();
        this.d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1269b, 0, 0);
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
        if (this.f1851b.contains(view)) {
            this.f1850a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0050q ? (AbstractComponentCallbacksC0050q) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        w0 w0Var;
        e.e(windowInsets, "insets");
        w0 g2 = w0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1852c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            e.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            w0Var = w0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = Q.f578a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = D.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = w0.g(this, b2);
                }
            }
            w0Var = g2;
        }
        if (!w0Var.f668a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = Q.f578a;
                WindowInsets f3 = w0Var.f();
                if (f3 != null) {
                    WindowInsets a2 = D.a(childAt, f3);
                    if (!a2.equals(f3)) {
                        w0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e.e(canvas, "canvas");
        if (this.d) {
            Iterator it = this.f1850a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        e.e(canvas, "canvas");
        e.e(view, "child");
        if (this.d) {
            ArrayList arrayList = this.f1850a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        e.e(view, "view");
        this.f1851b.remove(view);
        if (this.f1850a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0050q> F getFragment() {
        AbstractActivityC0128i abstractActivityC0128i;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q;
        I i;
        View view = this;
        while (true) {
            abstractActivityC0128i = null;
            if (view == null) {
                abstractComponentCallbacksC0050q = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0050q = tag instanceof AbstractComponentCallbacksC0050q ? (AbstractComponentCallbacksC0050q) tag : null;
            if (abstractComponentCallbacksC0050q != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0050q == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0128i) {
                    abstractActivityC0128i = (AbstractActivityC0128i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0128i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            i = ((C0053u) abstractActivityC0128i.f2672s.f6b).d;
        } else {
            if (!abstractComponentCallbacksC0050q.m()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0050q + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            i = abstractComponentCallbacksC0050q.g();
        }
        return (F) i.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        e.e(windowInsets, "insets");
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
                e.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        e.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        e.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        e.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            e.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            e.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        e.e(onApplyWindowInsetsListener, "listener");
        this.f1852c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        e.e(view, "view");
        if (view.getParent() == this) {
            this.f1851b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, I i) {
        super(context, attributeSet);
        View view;
        e.e(context, "context");
        e.e(attributeSet, "attrs");
        e.e(i, "fm");
        this.f1850a = new ArrayList();
        this.f1851b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1269b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0050q A2 = i.A(id);
        if (classAttribute != null && A2 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            C C2 = i.C();
            context.getClassLoader();
            AbstractComponentCallbacksC0050q a2 = C2.a(classAttribute);
            e.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1444C = true;
            C0053u c0053u = a2.f1474s;
            if ((c0053u == null ? null : c0053u.f1488a) != null) {
                a2.f1444C = true;
            }
            C0034a c0034a = new C0034a(i);
            c0034a.f1382o = true;
            a2.f1445D = this;
            int id2 = getId();
            String str = a2.f1451K;
            if (str != null) {
                d.c(a2, str);
            }
            Class<?> cls = a2.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = a2.f1479x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + a2 + ": was " + a2.f1479x + " now " + string);
                    }
                    a2.f1479x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + a2 + " with tag " + string + " to container view with no id");
                    }
                    int i2 = a2.f1477v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + a2 + ": was " + a2.f1477v + " now " + id2);
                    }
                    a2.f1477v = id2;
                    a2.f1478w = id2;
                }
                c0034a.b(new P(1, a2));
                I i3 = c0034a.f1383p;
                a2.f1473r = i3;
                if (!c0034a.f1376g) {
                    if (i3.f1318t != null && !i3.f1295G) {
                        i3.x(true);
                        c0034a.a(i3.f1297I, i3.f1298J);
                        i3.f1303b = true;
                        try {
                            i3.P(i3.f1297I, i3.f1298J);
                            i3.d();
                            i3.a0();
                            i3.u();
                            ((HashMap) i3.f1304c.f1074b).values().removeAll(Collections.singleton(null));
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
        Iterator it = i.f1304c.i().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
            if (abstractComponentCallbacksC0050q.f1478w == getId() && (view = abstractComponentCallbacksC0050q.f1446E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0050q.f1445D = this;
                o2.b();
            }
        }
    }
}
