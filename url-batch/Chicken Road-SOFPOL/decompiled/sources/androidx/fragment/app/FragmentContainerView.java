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
import com.snovikpovik.vuevnxsj.R;
import g4.a;
import h4.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import q3.a0;
import q3.k0;
import q3.l1;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f804d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f805e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f806f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f807g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        i.e(context, "context");
        this.f804d = new ArrayList();
        this.f805e = new ArrayList();
        this.f807g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3030a, 0, 0);
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
        if (this.f805e.contains(view)) {
            this.f804d.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof f ? (f) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        l1 l1Var;
        i.e(windowInsets, "insets");
        l1 d8 = l1.d(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f806f;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            i.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            l1Var = l1.d(null, onApplyWindowInsets);
        } else {
            Field field = k0.f6120a;
            WindowInsets c8 = d8.c();
            if (c8 != null) {
                WindowInsets b8 = a0.b(this, c8);
                if (!b8.equals(c8)) {
                    d8 = l1.d(this, b8);
                }
            }
            l1Var = d8;
        }
        if (!l1Var.f6127a.n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                k0.a(getChildAt(i), l1Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        if (this.f807g) {
            ArrayList arrayList = this.f804d;
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
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        i.e(canvas, "canvas");
        i.e(view, "child");
        if (this.f807g) {
            ArrayList arrayList = this.f804d;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i.e(view, "view");
        this.f805e.remove(view);
        if (this.f804d.remove(view)) {
            this.f807g = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends f> F getFragment() {
        f fVar;
        View view = this;
        while (true) {
            fVar = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            f fVar2 = tag instanceof f ? (f) tag : null;
            if (fVar2 != null) {
                fVar = fVar2;
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fVar != null) {
            throw new IllegalStateException("The Fragment " + fVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
        }
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i.e(windowInsets, "insets");
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
                i.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        i.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i8) {
        int i9 = i + i8;
        for (int i10 = i; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            i.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i8) {
        int i9 = i + i8;
        for (int i10 = i; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            i.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f807g = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        i.e(onApplyWindowInsetsListener, "listener");
        this.f806f = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i.e(view, "view");
        if (view.getParent() == this) {
            this.f805e.add(view);
        }
        super.startViewTransition(view);
    }
}
