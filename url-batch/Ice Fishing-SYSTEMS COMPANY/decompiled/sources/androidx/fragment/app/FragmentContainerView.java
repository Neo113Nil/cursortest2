package androidx.fragment.app;

import O.A0;
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
import com.icefishing.icefishingliveapp.C5284R;
import e0.AbstractC4467a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4938n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4939u;

    /* renamed from: v, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4940v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        kotlin.jvm.internal.h.e(context, "context");
        this.f4938n = new ArrayList();
        this.f4939u = new ArrayList();
        this.f4941w = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4467a.f37234b, 0, 0);
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
        if (this.f4939u.contains(view)) {
            this.f4938n.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(child, "child");
        Object tag = child.getTag(C5284R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0485s ? (AbstractComponentCallbacksC0485s) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        A0 j9;
        kotlin.jvm.internal.h.e(insets, "insets");
        A0 h9 = A0.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4940v;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.h.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.h.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            j9 = A0.h(null, onApplyWindowInsets);
        } else {
            j9 = O.X.j(this, h9);
        }
        kotlin.jvm.internal.h.d(j9, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!j9.f2213a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                O.X.b(getChildAt(i), j9);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.h.e(canvas, "canvas");
        if (this.f4941w) {
            Iterator it = this.f4938n.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j9) {
        kotlin.jvm.internal.h.e(canvas, "canvas");
        kotlin.jvm.internal.h.e(child, "child");
        if (this.f4941w) {
            ArrayList arrayList = this.f4938n;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j9);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        this.f4939u.remove(view);
        if (this.f4938n.remove(view)) {
            this.f4941w = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0485s> F getFragment() {
        AbstractActivityC0490x abstractActivityC0490x;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s;
        N supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC0490x = null;
            if (view == null) {
                abstractComponentCallbacksC0485s = null;
                break;
            }
            Object tag = view.getTag(C5284R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0485s = tag instanceof AbstractComponentCallbacksC0485s ? (AbstractComponentCallbacksC0485s) tag : null;
            if (abstractComponentCallbacksC0485s != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0485s == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0490x) {
                    abstractActivityC0490x = (AbstractActivityC0490x) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0490x == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC0490x.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC0485s.i()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0485s + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC0485s.c();
        }
        return (F) supportFragmentManager.z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.h.e(insets, "insets");
        return insets;
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
                View view = getChildAt(childCount);
                kotlin.jvm.internal.h.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        kotlin.jvm.internal.h.d(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i4) {
        int i9 = i + i4;
        for (int i10 = i; i10 < i9; i10++) {
            View view = getChildAt(i10);
            kotlin.jvm.internal.h.d(view, "view");
            a(view);
        }
        super.removeViews(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i4) {
        int i9 = i + i4;
        for (int i10 = i; i10 < i9; i10++) {
            View view = getChildAt(i10);
            kotlin.jvm.internal.h.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z8) {
        this.f4941w = z8;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f4940v = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        if (view.getParent() == this) {
            this.f4939u.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, N fm) {
        super(context, attrs);
        View view;
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(attrs, "attrs");
        kotlin.jvm.internal.h.e(fm, "fm");
        this.f4938n = new ArrayList();
        this.f4939u = new ArrayList();
        this.f4941w = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC4467a.f37234b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0485s z8 = fm.z(id);
        if (classAttribute != null && z8 == null) {
            if (id == -1) {
                throw new IllegalStateException(D.y.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            G B8 = fm.B();
            context.getClassLoader();
            AbstractComponentCallbacksC0485s a9 = B8.a(classAttribute);
            kotlin.jvm.internal.h.d(a9, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a9.f5160V = true;
            C0489w c0489w = a9.f5150L;
            if ((c0489w == null ? null : c0489w.f5187n) != null) {
                a9.f5160V = true;
            }
            C0468a c0468a = new C0468a(fm);
            c0468a.f5054o = true;
            a9.f5161W = this;
            c0468a.e(getId(), a9, string, 1);
            if (!c0468a.f5047g) {
                N n9 = c0468a.f5055p;
                if (n9.f4980t != null && !n9.f4956G) {
                    n9.w(true);
                    c0468a.a(n9.f4958I, n9.J);
                    n9.f4963b = true;
                    try {
                        n9.P(n9.f4958I, n9.J);
                        n9.d();
                        n9.a0();
                        if (n9.f4957H) {
                            n9.f4957H = false;
                            n9.Y();
                        }
                        ((HashMap) n9.f4964c.f2902v).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        n9.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm.f4964c.i().iterator();
        while (it.hasNext()) {
            V v6 = (V) it.next();
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
            if (abstractComponentCallbacksC0485s.f5154P == getId() && (view = abstractComponentCallbacksC0485s.f5162X) != null && view.getParent() == null) {
                abstractComponentCallbacksC0485s.f5161W = this;
                v6.b();
            }
        }
    }
}
