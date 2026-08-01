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
import com.gglhk.bofio.fortunetiger.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import k0.m1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f376f;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f377i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        u2.c.e(context, "context");
        this.f376f = new ArrayList();
        this.g = new ArrayList();
        this.f377i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f3399b, 0, 0);
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
        if (this.g.contains(view)) {
            this.f376f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        u2.c.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof u ? (u) tag : null) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        m1 m1Var;
        u2.c.e(windowInsets, "insets");
        m1 g = m1.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            u2.c.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            m1Var = m1.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = k0.j0.f2752a;
            WindowInsets f4 = g.f();
            if (f4 != null) {
                WindowInsets b2 = k0.z.b(this, f4);
                if (!b2.equals(f4)) {
                    g = m1.g(this, b2);
                }
            }
            m1Var = g;
        }
        if (!m1Var.f2760a.n()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                k0.j0.b(getChildAt(i4), m1Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u2.c.e(canvas, "canvas");
        if (this.f377i) {
            ArrayList arrayList = this.f376f;
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
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        u2.c.e(canvas, "canvas");
        u2.c.e(view, "child");
        if (this.f377i) {
            ArrayList arrayList = this.f376f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        u2.c.e(view, "view");
        this.g.remove(view);
        if (this.f376f.remove(view)) {
            this.f377i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends u> F getFragment() {
        f.i iVar;
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
                if (context instanceof f.i) {
                    iVar = (f.i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (iVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            k0Var = ((w) iVar.f1605x.g).f550n;
        } else {
            if (uVar.f536x == null || !uVar.f528p) {
                throw new IllegalStateException("The Fragment " + uVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            k0Var = uVar.g();
        }
        return (F) k0Var.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        u2.c.e(windowInsets, "insets");
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
                u2.c.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        u2.c.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        View childAt = getChildAt(i4);
        u2.c.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        u2.c.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            u2.c.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            u2.c.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i4, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f377i = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        u2.c.e(onApplyWindowInsetsListener, "listener");
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        u2.c.e(view, "view");
        if (view.getParent() == this) {
            this.g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, k0 k0Var) {
        super(context, attributeSet);
        View view;
        u2.c.e(context, "context");
        u2.c.e(attributeSet, "attrs");
        this.f376f = new ArrayList();
        this.g = new ArrayList();
        this.f377i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i4 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f3399b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        u A = k0Var.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag ".concat(string) : ""));
            }
            e0 D = k0Var.D();
            context.getClassLoader();
            u a4 = D.a(classAttribute);
            u2.c.d(a4, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a4.H = true;
            w wVar = a4.f536x;
            if ((wVar == null ? null : wVar.f547k) != null) {
                a4.H = true;
            }
            a aVar = new a(k0Var);
            aVar.f389o = true;
            a4.I = this;
            int id2 = getId();
            String str = a4.P;
            if (str != null) {
                v0.c.c(a4, str);
            }
            Class<?> cls = a4.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = a4.C;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + a4 + ": was " + a4.C + " now " + string);
                    }
                    a4.C = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + a4 + " with tag " + string + " to container view with no id");
                    }
                    int i5 = a4.A;
                    if (i5 != 0 && i5 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + a4 + ": was " + a4.A + " now " + id2);
                    }
                    a4.A = id2;
                    a4.B = id2;
                }
                aVar.b(new r0(1, a4));
                k0 k0Var2 = aVar.f390p;
                a4.f535w = k0Var2;
                if (!aVar.g) {
                    if (k0Var2.f451t != null && !k0Var2.G) {
                        k0Var2.x(true);
                        aVar.a(k0Var2.I, k0Var2.J);
                        k0Var2.f436b = true;
                        try {
                            k0Var2.R(k0Var2.I, k0Var2.J);
                            k0Var2.d();
                            k0Var2.c0();
                            k0Var2.u();
                            ((HashMap) k0Var2.c.g).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            k0Var2.d();
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
        ArrayList h = k0Var.c.h();
        int size = h.size();
        while (i4 < size) {
            Object obj = h.get(i4);
            i4++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.c;
            if (uVar.B == getId() && (view = uVar.J) != null && view.getParent() == null) {
                uVar.I = this;
                q0Var.b();
            }
        }
    }
}
