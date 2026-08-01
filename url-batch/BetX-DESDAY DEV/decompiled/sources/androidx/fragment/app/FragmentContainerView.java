package androidx.fragment.app;

import K.B0;
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
import com.luckyarcade.spinthrow.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1203a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1204b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1205c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        X0.f.e(context, "context");
        this.f1203a = new ArrayList();
        this.f1204b = new ArrayList();
        this.f1206d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W.a.f861b, 0, 0);
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
        if (this.f1204b.contains(view)) {
            this.f1203a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        X0.f.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0060q ? (AbstractComponentCallbacksC0060q) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        B0 b02;
        X0.f.e(windowInsets, "insets");
        B0 g2 = B0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1205c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            X0.f.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            b02 = B0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = K.X.f419a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = K.J.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = B0.g(this, b2);
                }
            }
            b02 = g2;
        }
        if (!b02.f396a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = K.X.f419a;
                WindowInsets f3 = b02.f();
                if (f3 != null) {
                    WindowInsets a2 = K.J.a(childAt, f3);
                    if (!a2.equals(f3)) {
                        B0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        X0.f.e(canvas, "canvas");
        if (this.f1206d) {
            Iterator it = this.f1203a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        X0.f.e(canvas, "canvas");
        X0.f.e(view, "child");
        if (this.f1206d) {
            ArrayList arrayList = this.f1203a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        X0.f.e(view, "view");
        this.f1204b.remove(view);
        if (this.f1203a.remove(view)) {
            this.f1206d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0060q> F getFragment() {
        AbstractActivityC0064v abstractActivityC0064v;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q;
        K supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC0064v = null;
            if (view == null) {
                abstractComponentCallbacksC0060q = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0060q = tag instanceof AbstractComponentCallbacksC0060q ? (AbstractComponentCallbacksC0060q) tag : null;
            if (abstractComponentCallbacksC0060q != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0060q == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0064v) {
                    abstractActivityC0064v = (AbstractActivityC0064v) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0064v == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC0064v.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC0060q.i()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0060q + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC0060q.c();
        }
        return (F) supportFragmentManager.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        X0.f.e(windowInsets, "insets");
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
                X0.f.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        X0.f.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        X0.f.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        X0.f.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            X0.f.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            X0.f.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1206d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        X0.f.e(onApplyWindowInsetsListener, "listener");
        this.f1205c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        X0.f.e(view, "view");
        if (view.getParent() == this) {
            this.f1204b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, K k2) {
        super(context, attributeSet);
        View view;
        X0.f.e(context, "context");
        X0.f.e(attributeSet, "attrs");
        X0.f.e(k2, "fm");
        this.f1203a = new ArrayList();
        this.f1204b = new ArrayList();
        this.f1206d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W.a.f861b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0060q A2 = k2.A(id);
        if (classAttribute != null && A2 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            E C2 = k2.C();
            context.getClassLoader();
            AbstractComponentCallbacksC0060q a2 = C2.a(classAttribute);
            X0.f.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1380C = true;
            C0063u c0063u = a2.f1411s;
            if ((c0063u == null ? null : c0063u.f1424g) != null) {
                a2.f1380C = true;
            }
            C0044a c0044a = new C0044a(k2);
            c0044a.f1313o = true;
            a2.f1381D = this;
            int id2 = getId();
            String str = a2.f1387K;
            if (str != null) {
                X.d.c(a2, str);
            }
            Class<?> cls = a2.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = a2.f1416x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + a2 + ": was " + a2.f1416x + " now " + string);
                    }
                    a2.f1416x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + a2 + " with tag " + string + " to container view with no id");
                    }
                    int i = a2.f1414v;
                    if (i != 0 && i != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + a2 + ": was " + a2.f1414v + " now " + id2);
                    }
                    a2.f1414v = id2;
                    a2.f1415w = id2;
                }
                c0044a.b(new T(1, a2));
                K k3 = c0044a.f1314p;
                a2.f1410r = k3;
                if (!c0044a.f1307g) {
                    if (k3.f1241t != null && !k3.f1217G) {
                        k3.x(true);
                        c0044a.a(k3.f1219I, k3.f1220J);
                        k3.f1225b = true;
                        try {
                            k3.P(k3.f1219I, k3.f1220J);
                            k3.d();
                            k3.a0();
                            k3.u();
                            ((HashMap) k3.f1226c.f825b).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            k3.d();
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
        Iterator it = k2.f1226c.m().iterator();
        while (it.hasNext()) {
            S s2 = (S) it.next();
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
            if (abstractComponentCallbacksC0060q.f1415w == getId() && (view = abstractComponentCallbacksC0060q.f1382E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0060q.f1381D = this;
                s2.b();
            }
        }
    }
}
