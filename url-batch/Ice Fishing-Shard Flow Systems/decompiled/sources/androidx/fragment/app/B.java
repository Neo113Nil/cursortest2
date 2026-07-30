package androidx.fragment.app;

import I.v0;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3574d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3575e;

    /* renamed from: i, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f3576i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3577l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Context context, AttributeSet attrs, Q fm) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f3574d = new ArrayList();
        this.f3575e = new ArrayList();
        this.f3577l = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = Y.a.f2894b;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC0228t C7 = fm.C(id);
        if (classAttribute != null && C7 == null) {
            if (id == -1) {
                throw new IllegalStateException(r4.f.d("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            J G4 = fm.G();
            context.getClassLoader();
            ComponentCallbacksC0228t a7 = G4.a(classAttribute);
            Intrinsics.checkNotNullExpressionValue(a7, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a7.f3779E = id;
            a7.f3780F = id;
            a7.f3781G = string;
            a7.f3775A = fm;
            C0232x c0232x = fm.f3633v;
            a7.f3776B = c0232x;
            a7.f3786L = true;
            if ((c0232x == null ? null : c0232x.f3822d) != null) {
                a7.f3786L = true;
            }
            C0210a c0210a = new C0210a(fm);
            c0210a.f3695o = true;
            a7.f3787M = this;
            c0210a.e(getId(), a7, string);
            if (c0210a.f3688g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            Q q4 = c0210a.f3696p;
            if (q4.f3633v != null && !q4.f3606I) {
                q4.z(true);
                c0210a.a(q4.f3608K, q4.f3609L);
                q4.f3614b = true;
                try {
                    q4.T(q4.f3608K, q4.f3609L);
                    q4.d();
                    q4.e0();
                    q4.v();
                    ((HashMap) q4.f3615c.f2201b).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    q4.d();
                    throw th;
                }
            }
        }
        ArrayList e7 = fm.f3615c.e();
        int size = e7.size();
        while (i2 < size) {
            Object obj = e7.get(i2);
            i2++;
            int i5 = ((Y) obj).f3670c.f3780F;
            getId();
        }
    }

    public final void a(View view) {
        if (this.f3575e.contains(view)) {
            this.f3574d.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i2, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC0228t ? (ComponentCallbacksC0228t) tag : null) != null) {
            super.addView(child, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        v0 v0Var;
        Intrinsics.checkNotNullParameter(insets, "insets");
        v0 c7 = v0.c(insets, null);
        Intrinsics.checkNotNullExpressionValue(c7, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3576i;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(this, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            v0Var = v0.c(onApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = I.T.f1153a;
            WindowInsets b7 = c7.b();
            if (b7 != null) {
                onApplyWindowInsets(b7);
                if (!b7.equals(b7)) {
                    c7 = v0.c(b7, this);
                }
            }
            v0Var = c7;
        }
        Intrinsics.checkNotNullExpressionValue(v0Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!v0Var.f1239a.p()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                I.T.b(getChildAt(i2), v0Var);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f3577l) {
            ArrayList arrayList = this.f3574d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f3577l) {
            ArrayList arrayList = this.f3574d;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f3575e.remove(view);
        if (this.f3574d.remove(view)) {
            this.f3577l = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends ComponentCallbacksC0228t> F getFragment() {
        AbstractActivityC0233y abstractActivityC0233y;
        ComponentCallbacksC0228t componentCallbacksC0228t;
        Q supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC0233y = null;
            if (view == null) {
                componentCallbacksC0228t = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            componentCallbacksC0228t = tag instanceof ComponentCallbacksC0228t ? (ComponentCallbacksC0228t) tag : null;
            if (componentCallbacksC0228t != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (componentCallbacksC0228t == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0233y) {
                    abstractActivityC0233y = (AbstractActivityC0233y) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0233y == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC0233y.getSupportFragmentManager();
        } else {
            if (!componentCallbacksC0228t.h()) {
                throw new IllegalStateException("The Fragment " + componentCallbacksC0228t + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = componentCallbacksC0228t.c();
        }
        return (F) supportFragmentManager.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
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
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View view = getChildAt(i2);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i5) {
        int i7 = i2 + i5;
        for (int i8 = i2; i8 < i7; i8++) {
            View view = getChildAt(i8);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i2, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i5) {
        int i7 = i2 + i5;
        for (int i8 = i2; i8 < i7; i8++) {
            View view = getChildAt(i8);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i2, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z7) {
        this.f3577l = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f3576i = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f3575e.add(view);
        }
        super.startViewTransition(view);
    }
}
