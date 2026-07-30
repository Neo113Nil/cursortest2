package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nr0 extends FrameLayout {
    public final ArrayList m;
    public final ArrayList n;
    public View.OnApplyWindowInsetsListener o;
    public boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(Context context, AttributeSet attributeSet, as0 as0Var) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.p = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a62.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        fr0 A = as0Var.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                lh.g(q40.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : BuildConfig.FLAVOR));
                throw null;
            }
            vr0 D = as0Var.D();
            context.getClassLoader();
            fr0 instantiate = fr0.instantiate(D.a.t.n, classAttribute, null);
            instantiate.getClass();
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            wm wmVar = new wm(as0Var);
            wmVar.o = true;
            instantiate.mContainer = this;
            wmVar.c(getId(), instantiate, string);
            if (wmVar.g) {
                lh.g("This transaction is already being added to the back stack");
                throw null;
            }
            wmVar.p.y(wmVar, true);
        }
        ArrayList s = as0Var.c.s();
        int size = s.size();
        while (i < size) {
            Object obj = s.get(i);
            i++;
            is0 is0Var = (is0) obj;
            fr0 fr0Var = is0Var.c;
            if (fr0Var.mContainerId == getId() && (view = fr0Var.mView) != null && view.getParent() == null) {
                fr0Var.mContainer = this;
                is0Var.a();
            }
        }
    }

    public final void a(View view) {
        if (this.n.contains(view)) {
            this.m.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof fr0 ? (fr0) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            ey.f(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        c83 c83Var;
        windowInsets.getClass();
        c83 c = c83.c(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.o;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            c83Var = c83.c(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = e53.a;
            WindowInsets b = c.b();
            if (b != null && !b.equals(b)) {
                c = c83.c(this, b);
            }
            c83Var = c;
        }
        if (!c83Var.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                e53.b(getChildAt(i), c83Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.p) {
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.p) {
            ArrayList arrayList = this.m;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.n.remove(view);
        if (this.m.remove(view)) {
            this.p = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends fr0> F getFragment() {
        kr0 kr0Var;
        fr0 fr0Var;
        as0 supportFragmentManager;
        View view = this;
        while (true) {
            kr0Var = null;
            if (view == null) {
                fr0Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fr0Var = tag instanceof fr0 ? (fr0) tag : null;
            if (fr0Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fr0Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof kr0) {
                    kr0Var = (kr0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (kr0Var == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = kr0Var.getSupportFragmentManager();
        } else {
            if (!fr0Var.isAdded()) {
                throw new IllegalStateException("The Fragment " + fr0Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fr0Var.getChildFragmentManager();
        }
        return (F) supportFragmentManager.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
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
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.p = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.o = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.n.add(view);
        }
        super.startViewTransition(view);
    }
}
