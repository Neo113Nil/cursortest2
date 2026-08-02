package androidx.fragment.app;

import E.AbstractC0024z;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.rockchicken.pump.up.road.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class O extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4767a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4768b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4769c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Context context, AttributeSet attrs, f0 f0Var) {
        super(context, attrs);
        View view;
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(attrs, "attrs");
        this.f4767a = new ArrayList();
        this.f4768b = new ArrayList();
        this.f4770d = true;
        String classAttribute = attrs.getClassAttribute();
        int i4 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, P.a.f2084b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        F B4 = f0Var.B(id);
        if (classAttribute != null && B4 == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC1514c.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Y G4 = f0Var.G();
            context.getClassLoader();
            F instantiate = F.instantiate(G4.f4786a.v.f4773b, classAttribute, null);
            kotlin.jvm.internal.i.d(instantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            instantiate.mFragmentId = id;
            instantiate.mContainerId = id;
            instantiate.mTag = string;
            instantiate.mFragmentManager = f0Var;
            instantiate.mHost = f0Var.v;
            instantiate.onInflate(context, attrs, (Bundle) null);
            C0193a c0193a = new C0193a(f0Var);
            c0193a.o = true;
            instantiate.mContainer = this;
            c0193a.e(getId(), instantiate, string);
            if (c0193a.f4794g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            f0 f0Var2 = c0193a.f4801p;
            n0 n0Var = f0Var2.f4849c;
            if (f0Var2.v != null && !f0Var2.f4841I) {
                f0Var2.y(true);
                c0193a.a(f0Var2.f4843K, f0Var2.L);
                f0Var2.f4848b = true;
                try {
                    f0Var2.S(f0Var2.f4843K, f0Var2.L);
                    f0Var2.d();
                    f0Var2.c0();
                    if (f0Var2.f4842J) {
                        f0Var2.f4842J = false;
                        ArrayList d4 = n0Var.d();
                        int size = d4.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = d4.get(i5);
                            i5++;
                            m0 m0Var = (m0) obj;
                            F f4 = m0Var.f4925c;
                            if (f4.mDeferStart) {
                                if (f0Var2.f4848b) {
                                    f0Var2.f4842J = true;
                                } else {
                                    f4.mDeferStart = false;
                                    m0Var.k();
                                }
                            }
                        }
                    }
                    n0Var.f4932b.values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    f0Var2.d();
                    throw th;
                }
            }
        }
        ArrayList d5 = f0Var.f4849c.d();
        int size2 = d5.size();
        while (i4 < size2) {
            Object obj2 = d5.get(i4);
            i4++;
            m0 m0Var2 = (m0) obj2;
            F f5 = m0Var2.f4925c;
            if (f5.mContainerId == getId() && (view = f5.mView) != null && view.getParent() == null) {
                f5.mContainer = this;
                m0Var2.b();
            }
        }
    }

    public final void a(View view) {
        if (this.f4768b.contains(view)) {
            this.f4767a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i4, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.i.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof F ? (F) tag : null) != null) {
            super.addView(child, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.i.e(insets, "insets");
        E.e0 a3 = E.e0.a(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4769c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.i.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            a3 = E.e0.a(null, onApplyWindowInsets);
        } else {
            Field field = E.H.f375a;
            E.a0 a0Var = a3.f416a;
            WindowInsets windowInsets = a0Var instanceof E.T ? ((E.T) a0Var).f390c : null;
            if (windowInsets != null) {
                WindowInsets b4 = AbstractC0024z.b(this, windowInsets);
                if (!b4.equals(windowInsets)) {
                    a3 = E.e0.a(this, b4);
                }
            }
        }
        E.a0 a0Var2 = a3.f416a;
        if (!a0Var2.k()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                Field field2 = E.H.f375a;
                int i5 = Build.VERSION.SDK_INT;
                WindowInsets windowInsets2 = a0Var2 instanceof E.T ? ((E.T) a0Var2).f390c : null;
                if (windowInsets2 != null) {
                    WindowInsets a4 = i5 >= 30 ? E.F.a(childAt, windowInsets2) : AbstractC0024z.a(childAt, windowInsets2);
                    if (!a4.equals(windowInsets2)) {
                        E.e0.a(childAt, a4);
                    }
                }
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.i.e(canvas, "canvas");
        if (this.f4770d) {
            ArrayList arrayList = this.f4767a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j4) {
        kotlin.jvm.internal.i.e(canvas, "canvas");
        kotlin.jvm.internal.i.e(child, "child");
        if (this.f4770d) {
            ArrayList arrayList = this.f4767a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        this.f4768b.remove(view);
        if (this.f4767a.remove(view)) {
            this.f4770d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends F> F getFragment() {
        K k4;
        F f4;
        f0 supportFragmentManager;
        View view = this;
        while (true) {
            k4 = null;
            if (view == null) {
                f4 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            f4 = tag instanceof F ? (F) tag : null;
            if (f4 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (f4 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof K) {
                    k4 = (K) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (k4 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = k4.getSupportFragmentManager();
        } else {
            if (!f4.isAdded()) {
                throw new IllegalStateException("The Fragment " + f4 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = f4.getChildFragmentManager();
        }
        return (F) supportFragmentManager.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.i.e(insets, "insets");
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
                kotlin.jvm.internal.i.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        View view = getChildAt(i4);
        kotlin.jvm.internal.i.d(view, "view");
        a(view);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View view = getChildAt(i7);
            kotlin.jvm.internal.i.d(view, "view");
            a(view);
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View view = getChildAt(i7);
            kotlin.jvm.internal.i.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i4, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f4770d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        this.f4769c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.i.e(view, "view");
        if (view.getParent() == this) {
            this.f4768b.add(view);
        }
        super.startViewTransition(view);
    }
}
