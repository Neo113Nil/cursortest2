package androidx.fragment.app;

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
import com.moontiko.really.admiralcasino.R;
import defpackage.en;
import defpackage.f60;
import defpackage.g9;
import defpackage.ic0;
import defpackage.ln;
import defpackage.m3;
import defpackage.o7;
import defpackage.pm;
import defpackage.rm;
import defpackage.w00;
import defpackage.ye0;
import defpackage.zm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList f;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, en enVar) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w00.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        pm A = enVar.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                g9.s(f60.f("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            zm D = enVar.D();
            context.getClassLoader();
            pm a = D.a(classAttribute);
            a.getClass();
            a.H = true;
            rm rmVar = a.x;
            if ((rmVar == null ? null : rmVar.r) != null) {
                a.H = true;
            }
            o7 o7Var = new o7(enVar);
            o7Var.o = true;
            a.I = this;
            o7Var.e(getId(), a, string, 1);
            if (o7Var.g) {
                g9.s("This transaction is already being added to the back stack");
                throw null;
            }
            en enVar2 = o7Var.p;
            if (enVar2.t != null && !enVar2.G) {
                enVar2.x(true);
                o7Var.a(enVar2.I, enVar2.J);
                enVar2.b = true;
                try {
                    enVar2.R(enVar2.I, enVar2.J);
                    enVar2.d();
                    enVar2.c0();
                    enVar2.u();
                    ((HashMap) enVar2.c.g).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    enVar2.d();
                    throw th;
                }
            }
        }
        ArrayList l = enVar.c.l();
        int size = l.size();
        while (i < size) {
            Object obj = l.get(i);
            i++;
            ln lnVar = (ln) obj;
            pm pmVar = lnVar.c;
            if (pmVar.B == getId() && (view = pmVar.J) != null && view.getParent() == null) {
                pmVar.I = this;
                lnVar.b();
            }
        }
    }

    public final void a(View view) {
        if (this.g.contains(view)) {
            this.f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof pm ? (pm) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            g9.q(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ye0 ye0Var;
        windowInsets.getClass();
        ye0 g = ye0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            ye0Var = ye0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = ic0.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = ye0.g(this, f);
            }
            ye0Var = g;
        }
        if (!ye0Var.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ic0.b(getChildAt(i), ye0Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.i) {
            ArrayList arrayList = this.f;
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
        if (this.i) {
            ArrayList arrayList = this.f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.g.remove(view);
        if (this.f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends pm> F getFragment() {
        pm pmVar;
        m3 m3Var;
        en k;
        View view = this;
        while (true) {
            if (view == null) {
                pmVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            pmVar = tag instanceof pm ? (pm) tag : null;
            if (pmVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (pmVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    m3Var = null;
                    break;
                }
                if (context instanceof m3) {
                    m3Var = (m3) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (m3Var == null) {
                g9.g(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            k = m3Var.k();
        } else {
            if (pmVar.x == null || !pmVar.p) {
                throw new IllegalStateException("The Fragment " + pmVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            k = pmVar.g();
        }
        return (F) k.A(getId());
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
        this.i = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        context.getClass();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w00.b, 0, 0);
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
}
