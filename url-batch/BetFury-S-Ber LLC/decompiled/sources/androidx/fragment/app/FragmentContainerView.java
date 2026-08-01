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
import com.trembin.nirefon.betfury.R;
import defpackage.a70;
import defpackage.a8;
import defpackage.dp0;
import defpackage.fq;
import defpackage.hm0;
import defpackage.r7;
import defpackage.s9;
import defpackage.xp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList f;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, c cVar) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a70.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        a A = cVar.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                s9.u(r7.c("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            fq D = cVar.D();
            context.getClassLoader();
            a a = D.a(classAttribute);
            a.getClass();
            a.H = true;
            xp xpVar = a.x;
            if ((xpVar == null ? null : xpVar.o) != null) {
                a.H = true;
            }
            a8 a8Var = new a8(cVar);
            a8Var.o = true;
            a.I = this;
            a8Var.e(getId(), a, string, 1);
            if (a8Var.g) {
                s9.u("This transaction is already being added to the back stack");
                throw null;
            }
            c cVar2 = a8Var.p;
            if (cVar2.t != null && !cVar2.G) {
                cVar2.x(true);
                a8Var.a(cVar2.I, cVar2.J);
                cVar2.b = true;
                try {
                    cVar2.R(cVar2.I, cVar2.J);
                    cVar2.d();
                    cVar2.c0();
                    cVar2.u();
                    cVar2.c.b.values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    cVar2.d();
                    throw th;
                }
            }
        }
        ArrayList d = cVar.c.d();
        int size = d.size();
        while (i < size) {
            Object obj = d.get(i);
            i++;
            e eVar = (e) obj;
            a aVar = eVar.c;
            if (aVar.B == getId() && (view = aVar.J) != null && view.getParent() == null) {
                aVar.I = this;
                eVar.b();
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
        if ((tag instanceof a ? (a) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            s9.s(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        dp0 dp0Var;
        windowInsets.getClass();
        dp0 g = dp0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            dp0Var = dp0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = hm0.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = dp0.g(this, f);
            }
            dp0Var = g;
        }
        if (!dp0Var.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                hm0.b(getChildAt(i), dp0Var);
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

    public final <F extends a> F getFragment() {
        a aVar;
        b bVar;
        c cVar;
        View view = this;
        while (true) {
            if (view == null) {
                aVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            aVar = tag instanceof a ? (a) tag : null;
            if (aVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (aVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    bVar = null;
                    break;
                }
                if (context instanceof b) {
                    bVar = (b) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (bVar == null) {
                s9.h(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            cVar = ((xp) bVar.z.g).r;
        } else {
            if (aVar.x == null || !aVar.p) {
                throw new IllegalStateException("The Fragment " + aVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            cVar = aVar.g();
        }
        return (F) cVar.A(getId());
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a70.b, 0, 0);
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
