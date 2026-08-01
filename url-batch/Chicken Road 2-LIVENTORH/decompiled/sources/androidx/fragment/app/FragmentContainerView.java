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
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import n0.q1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f374f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f375g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f376h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        f3.d.e(context, "context");
        this.f374f = new ArrayList();
        this.f375g = new ArrayList();
        this.i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0.a.f3613b, 0, 0);
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
        if (this.f375g.contains(view)) {
            this.f374f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f3.d.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof u ? (u) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        q1 q1Var;
        f3.d.e(windowInsets, "insets");
        q1 g4 = q1.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f376h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            f3.d.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            q1Var = q1.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = n0.l0.f2757a;
            WindowInsets f2 = g4.f();
            if (f2 != null) {
                WindowInsets b4 = n0.b0.b(this, f2);
                if (!b4.equals(f2)) {
                    g4 = q1.g(this, b4);
                }
            }
            q1Var = g4;
        }
        if (!q1Var.f2775a.n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                n0.l0.b(getChildAt(i), q1Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f3.d.e(canvas, "canvas");
        if (this.i) {
            ArrayList arrayList = this.f374f;
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
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        f3.d.e(canvas, "canvas");
        f3.d.e(view, "child");
        if (this.i) {
            ArrayList arrayList = this.f374f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        f3.d.e(view, "view");
        this.f375g.remove(view);
        if (this.f374f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends u> F getFragment() {
        g.j jVar;
        u uVar;
        k0 k0Var;
        View view = this;
        while (true) {
            jVar = null;
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
                if (context instanceof g.j) {
                    jVar = (g.j) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (jVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            k0Var = ((w) jVar.f1650y.f81g).f570q;
        } else {
            if (uVar.f552x == null || !uVar.f544p) {
                throw new IllegalStateException("The Fragment " + uVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            k0Var = uVar.g();
        }
        return (F) k0Var.z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f3.d.e(windowInsets, "insets");
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
                f3.d.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        f3.d.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        f3.d.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        f3.d.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i4) {
        int i5 = i + i4;
        for (int i6 = i; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            f3.d.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i4) {
        int i5 = i + i4;
        for (int i6 = i; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            f3.d.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.i = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f3.d.e(onApplyWindowInsetsListener, "listener");
        this.f376h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        f3.d.e(view, "view");
        if (view.getParent() == this) {
            this.f375g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, k0 k0Var) {
        super(context, attributeSet);
        View view;
        f3.d.e(context, "context");
        f3.d.e(attributeSet, "attrs");
        this.f374f = new ArrayList();
        this.f375g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x0.a.f3613b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        u z3 = k0Var.z(id);
        if (classAttribute != null && z3 == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            e0 B = k0Var.B();
            context.getClassLoader();
            u a2 = B.a(classAttribute);
            f3.d.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.H = true;
            w wVar = a2.f552x;
            if ((wVar == null ? null : wVar.f567n) != null) {
                a2.H = true;
            }
            a aVar = new a(k0Var);
            aVar.f389o = true;
            a2.I = this;
            aVar.f(getId(), a2, string, 1);
            if (!aVar.f382g) {
                k0 k0Var2 = aVar.f390p;
                if (k0Var2.f458t != null && !k0Var2.G) {
                    k0Var2.w(true);
                    aVar.a(k0Var2.I, k0Var2.J);
                    k0Var2.f442b = true;
                    try {
                        k0Var2.P(k0Var2.I, k0Var2.J);
                        k0Var2.d();
                        k0Var2.a0();
                        if (k0Var2.H) {
                            k0Var2.H = false;
                            k0Var2.Y();
                        }
                        ((HashMap) k0Var2.f443c.f100f).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        k0Var2.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList i4 = k0Var.f443c.i();
        int size = i4.size();
        while (i < size) {
            Object obj = i4.get(i);
            i++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.f511c;
            if (uVar.B == getId() && (view = uVar.J) != null && view.getParent() == null) {
                uVar.I = this;
                q0Var.b();
            }
        }
    }
}
