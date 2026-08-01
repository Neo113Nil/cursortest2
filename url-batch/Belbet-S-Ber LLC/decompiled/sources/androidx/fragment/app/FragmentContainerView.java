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
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f491f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f492g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        i3.d.e(context, "context");
        this.f491f = new ArrayList();
        this.f492g = new ArrayList();
        this.i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4096b, 0, 0);
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
        if (this.f492g.contains(view)) {
            this.f491f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i3.d.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof u ? (u) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        v1 v1Var;
        i3.d.e(windowInsets, "insets");
        v1 g3 = v1.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            i3.d.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            v1Var = v1.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = n0.p0.f2816a;
            WindowInsets f5 = g3.f();
            if (f5 != null) {
                onApplyWindowInsets(f5);
                if (!f5.equals(f5)) {
                    g3 = v1.g(this, f5);
                }
            }
            v1Var = g3;
        }
        if (!v1Var.f2842a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                n0.p0.b(getChildAt(i), v1Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i3.d.e(canvas, "canvas");
        if (this.i) {
            ArrayList arrayList = this.f491f;
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
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        i3.d.e(canvas, "canvas");
        i3.d.e(view, "child");
        if (this.i) {
            ArrayList arrayList = this.f491f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i3.d.e(view, "view");
        this.f492g.remove(view);
        if (this.f491f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends u> F getFragment() {
        g.i iVar;
        u uVar;
        k0 k0Var;
        View view = this;
        while (true) {
            iVar = null;
            if (view == null) {
                uVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            uVar = tag instanceof u ? (u) tag : null;
            if (uVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (uVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof g.i) {
                    iVar = (g.i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (iVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            k0Var = ((w) iVar.f1527z.f79g).f676r;
        } else {
            if (uVar.f660x == null || !uVar.f652p) {
                throw new IllegalStateException("The Fragment " + uVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            k0Var = uVar.g();
        }
        return (F) k0Var.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i3.d.e(windowInsets, "insets");
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
                i3.d.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i3.d.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        i3.d.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i3.d.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i4) {
        int i5 = i + i4;
        for (int i6 = i; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            i3.d.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i4) {
        int i5 = i + i4;
        for (int i6 = i; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            i3.d.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.i = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        i3.d.e(onApplyWindowInsetsListener, "listener");
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i3.d.e(view, "view");
        if (view.getParent() == this) {
            this.f492g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, k0 k0Var) {
        super(context, attributeSet);
        View view;
        i3.d.e(context, "context");
        i3.d.e(attributeSet, "attrs");
        this.f491f = new ArrayList();
        this.f492g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4096b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        u B = k0Var.B(id);
        if (classAttribute != null && B == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            e0 E = k0Var.E();
            context.getClassLoader();
            u a5 = E.a(classAttribute);
            i3.d.d(a5, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a5.H = true;
            w wVar = a5.f660x;
            if ((wVar == null ? null : wVar.f673o) != null) {
                a5.H = true;
            }
            a aVar = new a(k0Var);
            aVar.f504o = true;
            a5.I = this;
            aVar.e(getId(), a5, string, 1);
            if (!aVar.f498g) {
                aVar.f505p.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList k4 = k0Var.f556c.k();
        int size = k4.size();
        while (i < size) {
            Object obj = k4.get(i);
            i++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.f623c;
            if (uVar.B == getId() && (view = uVar.J) != null && view.getParent() == null) {
                uVar.I = this;
                q0Var.b();
            }
        }
    }
}
