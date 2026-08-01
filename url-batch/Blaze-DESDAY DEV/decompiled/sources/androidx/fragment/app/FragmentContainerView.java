package androidx.fragment.app;

import K.F;
import K.T;
import K.z0;
import X.a;
import Y.AbstractComponentCallbacksC0051q;
import Y.C;
import Y.C0035a;
import Y.C0054u;
import Y.I;
import Y.O;
import Y.P;
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
import com.winworm.neongrid.R;
import g.AbstractActivityC0108i;
import g1.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1477a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1478b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1479c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        d.e(context, "context");
        this.f1477a = new ArrayList();
        this.f1478b = new ArrayList();
        this.d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f944b, 0, 0);
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
        if (this.f1478b.contains(view)) {
            this.f1477a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0051q ? (AbstractComponentCallbacksC0051q) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        z0 z0Var;
        d.e(windowInsets, "insets");
        z0 g2 = z0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1479c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            d.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            z0Var = z0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = T.f440a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = F.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = z0.g(this, b2);
                }
            }
            z0Var = g2;
        }
        if (!z0Var.f536a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = T.f440a;
                WindowInsets f3 = z0Var.f();
                if (f3 != null) {
                    WindowInsets a2 = F.a(childAt, f3);
                    if (!a2.equals(f3)) {
                        z0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d.e(canvas, "canvas");
        if (this.d) {
            Iterator it = this.f1477a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        d.e(canvas, "canvas");
        d.e(view, "child");
        if (this.d) {
            ArrayList arrayList = this.f1477a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        d.e(view, "view");
        this.f1478b.remove(view);
        if (this.f1477a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0051q> F getFragment() {
        AbstractActivityC0108i abstractActivityC0108i;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q;
        I i;
        View view = this;
        while (true) {
            abstractActivityC0108i = null;
            if (view == null) {
                abstractComponentCallbacksC0051q = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0051q = tag instanceof AbstractComponentCallbacksC0051q ? (AbstractComponentCallbacksC0051q) tag : null;
            if (abstractComponentCallbacksC0051q != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0051q == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0108i) {
                    abstractActivityC0108i = (AbstractActivityC0108i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0108i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            i = ((C0054u) abstractActivityC0108i.f2255s.f80b).d;
        } else {
            if (!abstractComponentCallbacksC0051q.m()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0051q + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            i = abstractComponentCallbacksC0051q.g();
        }
        return (F) i.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d.e(windowInsets, "insets");
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
                d.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        d.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        d.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        d.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            d.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            d.d(childAt, "view");
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
        d.e(onApplyWindowInsetsListener, "listener");
        this.f1479c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        d.e(view, "view");
        if (view.getParent() == this) {
            this.f1478b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, I i) {
        super(context, attributeSet);
        View view;
        d.e(context, "context");
        d.e(attributeSet, "attrs");
        d.e(i, "fm");
        this.f1477a = new ArrayList();
        this.f1478b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f944b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0051q A2 = i.A(id);
        if (classAttribute != null && A2 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            C C2 = i.C();
            context.getClassLoader();
            AbstractComponentCallbacksC0051q a2 = C2.a(classAttribute);
            d.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1112C = true;
            C0054u c0054u = a2.f1142s;
            if ((c0054u == null ? null : c0054u.f1156a) != null) {
                a2.f1112C = true;
            }
            C0035a c0035a = new C0035a(i);
            c0035a.f1050o = true;
            a2.f1113D = this;
            int id2 = getId();
            String str = a2.f1119K;
            if (str != null) {
                Z.d.c(a2, str);
            }
            Class<?> cls = a2.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = a2.f1147x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + a2 + ": was " + a2.f1147x + " now " + string);
                    }
                    a2.f1147x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + a2 + " with tag " + string + " to container view with no id");
                    }
                    int i2 = a2.f1145v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + a2 + ": was " + a2.f1145v + " now " + id2);
                    }
                    a2.f1145v = id2;
                    a2.f1146w = id2;
                }
                c0035a.b(new P(1, a2));
                I i3 = c0035a.f1051p;
                a2.f1141r = i3;
                if (!c0035a.f1044g) {
                    if (i3.f986t != null && !i3.f963G) {
                        i3.x(true);
                        c0035a.a(i3.f965I, i3.f966J);
                        i3.f971b = true;
                        try {
                            i3.P(i3.f965I, i3.f966J);
                            i3.d();
                            i3.a0();
                            i3.u();
                            ((HashMap) i3.f972c.f884b).values().removeAll(Collections.singleton(null));
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
        Iterator it = i.f972c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
            if (abstractComponentCallbacksC0051q.f1146w == getId() && (view = abstractComponentCallbacksC0051q.f1114E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0051q.f1113D = this;
                o2.b();
            }
        }
    }
}
