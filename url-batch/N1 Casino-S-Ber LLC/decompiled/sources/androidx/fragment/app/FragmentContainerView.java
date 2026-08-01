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
import com.derinko.gbini.n1casino.R;
import defpackage.bl;
import defpackage.c3;
import defpackage.e7;
import defpackage.mk;
import defpackage.ok;
import defpackage.rb0;
import defpackage.t8;
import defpackage.tx;
import defpackage.wk;
import defpackage.x80;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList f;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, bl blVar) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        mk A = blVar.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                t8.h(classAttribute, string != null ? " with tag ".concat(string) : "", "FragmentContainerView must have an android:id to add Fragment ");
                throw null;
            }
            wk D = blVar.D();
            context.getClassLoader();
            mk a = D.a(classAttribute);
            a.getClass();
            a.H = true;
            ok okVar = a.x;
            if ((okVar == null ? null : okVar.o) != null) {
                a.H = true;
            }
            e7 e7Var = new e7(blVar);
            e7Var.o = true;
            a.I = this;
            e7Var.e(getId(), a, string, 1);
            if (e7Var.g) {
                t8.t("This transaction is already being added to the back stack");
                throw null;
            }
            bl blVar2 = e7Var.p;
            if (blVar2.t != null && !blVar2.G) {
                blVar2.x(true);
                e7Var.a(blVar2.I, blVar2.J);
                blVar2.b = true;
                try {
                    blVar2.R(blVar2.I, blVar2.J);
                    blVar2.d();
                    blVar2.c0();
                    blVar2.u();
                    ((HashMap) blVar2.c.g).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    blVar2.d();
                    throw th;
                }
            }
        }
        ArrayList l = blVar.c.l();
        int size = l.size();
        while (i < size) {
            Object obj = l.get(i);
            i++;
            a aVar = (a) obj;
            mk mkVar = aVar.c;
            if (mkVar.B == getId() && (view = mkVar.J) != null && view.getParent() == null) {
                mkVar.I = this;
                aVar.b();
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
        if ((tag instanceof mk ? (mk) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            t8.r(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        rb0 rb0Var;
        windowInsets.getClass();
        rb0 g = rb0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            rb0Var = rb0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = x80.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = rb0.g(this, f);
            }
            rb0Var = g;
        }
        if (!rb0Var.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                x80.b(getChildAt(i), rb0Var);
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

    public final <F extends mk> F getFragment() {
        mk mkVar;
        c3 c3Var;
        bl blVar;
        View view = this;
        while (true) {
            if (view == null) {
                mkVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            mkVar = tag instanceof mk ? (mk) tag : null;
            if (mkVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (mkVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    c3Var = null;
                    break;
                }
                if (context instanceof c3) {
                    c3Var = (c3) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (c3Var == null) {
                t8.h(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            blVar = ((ok) c3Var.z.g).r;
        } else {
            if (mkVar.x == null || !mkVar.p) {
                throw new IllegalStateException("The Fragment " + mkVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            blVar = mkVar.g();
        }
        return (F) blVar.A(getId());
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx.b, 0, 0);
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
