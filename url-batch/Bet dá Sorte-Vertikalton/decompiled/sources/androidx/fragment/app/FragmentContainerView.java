package androidx.fragment.app;

import K.E;
import K.S;
import K.w0;
import W.a;
import X.AbstractComponentCallbacksC0047q;
import X.C;
import X.C0031a;
import X.C0050u;
import X.I;
import X.O;
import X.P;
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
import b1.d;
import com.glasspulse.glasspulse.R;
import g.AbstractActivityC0128i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1404a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1405b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1406c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        d.e(context, "context");
        this.f1404a = new ArrayList();
        this.f1405b = new ArrayList();
        this.d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f871b, 0, 0);
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
        if (this.f1405b.contains(view)) {
            this.f1404a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0047q ? (AbstractComponentCallbacksC0047q) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        w0 w0Var;
        d.e(windowInsets, "insets");
        w0 g2 = w0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1406c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            d.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            w0Var = w0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = S.f351a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = E.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = w0.g(this, b2);
                }
            }
            w0Var = g2;
        }
        if (!w0Var.f438a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = S.f351a;
                WindowInsets f3 = w0Var.f();
                if (f3 != null) {
                    WindowInsets a2 = E.a(childAt, f3);
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
        d.e(canvas, "canvas");
        if (this.d) {
            Iterator it = this.f1404a.iterator();
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
            ArrayList arrayList = this.f1404a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        d.e(view, "view");
        this.f1405b.remove(view);
        if (this.f1404a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0047q> F getFragment() {
        AbstractActivityC0128i abstractActivityC0128i;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q;
        I i;
        View view = this;
        while (true) {
            abstractActivityC0128i = null;
            if (view == null) {
                abstractComponentCallbacksC0047q = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0047q = tag instanceof AbstractComponentCallbacksC0047q ? (AbstractComponentCallbacksC0047q) tag : null;
            if (abstractComponentCallbacksC0047q != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0047q == null) {
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
            i = ((C0050u) abstractActivityC0128i.f2433s.f150b).h;
        } else {
            if (!abstractComponentCallbacksC0047q.m()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0047q + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            i = abstractComponentCallbacksC0047q.g();
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
        this.f1406c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        d.e(view, "view");
        if (view.getParent() == this) {
            this.f1405b.add(view);
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
        this.f1404a = new ArrayList();
        this.f1405b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f871b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0047q A2 = i.A(id);
        if (classAttribute != null && A2 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            C C2 = i.C();
            context.getClassLoader();
            AbstractComponentCallbacksC0047q a2 = C2.a(classAttribute);
            d.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1039C = true;
            C0050u c0050u = a2.f1069s;
            if ((c0050u == null ? null : c0050u.f1083e) != null) {
                a2.f1039C = true;
            }
            C0031a c0031a = new C0031a(i);
            c0031a.f977o = true;
            a2.f1040D = this;
            int id2 = getId();
            String str = a2.f1046K;
            if (str != null) {
                Y.d.c(a2, str);
            }
            Class<?> cls = a2.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = a2.f1074x;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + a2 + ": was " + a2.f1074x + " now " + string);
                    }
                    a2.f1074x = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + a2 + " with tag " + string + " to container view with no id");
                    }
                    int i2 = a2.f1072v;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + a2 + ": was " + a2.f1072v + " now " + id2);
                    }
                    a2.f1072v = id2;
                    a2.f1073w = id2;
                }
                c0031a.b(new P(1, a2));
                I i3 = c0031a.f978p;
                a2.f1068r = i3;
                if (!c0031a.f971g) {
                    if (i3.f913t != null && !i3.f890G) {
                        i3.x(true);
                        c0031a.a(i3.f892I, i3.f893J);
                        i3.f898b = true;
                        try {
                            i3.P(i3.f892I, i3.f893J);
                            i3.d();
                            i3.a0();
                            i3.u();
                            ((HashMap) i3.f899c.f817b).values().removeAll(Collections.singleton(null));
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
        Iterator it = i.f899c.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
            if (abstractComponentCallbacksC0047q.f1073w == getId() && (view = abstractComponentCallbacksC0047q.f1041E) != null && view.getParent() == null) {
                abstractComponentCallbacksC0047q.f1040D = this;
                o2.b();
            }
        }
    }
}
