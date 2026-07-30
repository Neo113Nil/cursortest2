package g0;

import I.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0440t {

    /* renamed from: a, reason: collision with root package name */
    public D0.j f4962a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f4963b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.c f4964c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.c f4965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4966e;

    /* renamed from: f, reason: collision with root package name */
    public int f4967f;

    /* renamed from: g, reason: collision with root package name */
    public int f4968g;

    public AbstractC0440t() {
        B.f fVar = new B.f(24, this);
        l2.c cVar = new l2.c(this);
        this.f4964c = new P0.c(fVar);
        this.f4965d = new P0.c(cVar);
        this.f4966e = false;
    }

    public static int e(int i2, int i5, int i7) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i7) : size : Math.min(size, Math.max(i5, i7));
    }

    public static void v(View view) {
        ((C0441u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0433m w(Context context, AttributeSet attributeSet, int i2, int i5) {
        C0433m c0433m = new C0433m(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.a.f4762a, i2, i5);
        c0433m.f4949b = obtainStyledAttributes.getInt(0, 1);
        c0433m.f4950c = obtainStyledAttributes.getInt(9, 1);
        c0433m.f4951d = obtainStyledAttributes.getBoolean(8, false);
        c0433m.f4952e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0433m;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f4963b;
        D6.n nVar = recyclerView.f3980d;
        C0409B c0409b = recyclerView.f3984f0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z7 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f4963b.canScrollVertically(-1) && !this.f4963b.canScrollHorizontally(-1) && !this.f4963b.canScrollHorizontally(1)) {
            z7 = false;
        }
        accessibilityEvent.setScrollable(z7);
        this.f4963b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p7 = p() - 1;
        if (p7 < 0) {
            return;
        }
        RecyclerView.j(o(p7));
        throw null;
    }

    public final void F(D6.n nVar) {
        ArrayList arrayList = (ArrayList) nVar.f542i;
        int size = arrayList.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            throw C4.p.f(arrayList, i2);
        }
        arrayList.clear();
        if (size > 0) {
            this.f4963b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
        boolean z9;
        boolean z10;
        int s7 = s();
        int u7 = u();
        int t6 = this.f4967f - t();
        int r7 = this.f4968g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - s7;
        int min = Math.min(0, i2);
        int i5 = top - u7;
        int min2 = Math.min(0, i5);
        int i7 = width - t6;
        int max = Math.max(0, i7);
        int max2 = Math.max(0, height - r7);
        RecyclerView recyclerView2 = this.f4963b;
        WeakHashMap weakHashMap = T.f1153a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i2, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i7);
        }
        if (min2 == 0) {
            min2 = Math.min(i5, max2);
        }
        int[] iArr = {max, min2};
        int i8 = iArr[0];
        int i9 = iArr[1];
        if (z8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s8 = s();
            int u8 = u();
            int t7 = this.f4967f - t();
            int r8 = this.f4968g - r();
            Rect rect2 = this.f4963b.f3997o;
            int[] iArr2 = RecyclerView.f3952p0;
            C0441u c0441u = (C0441u) focusedChild.getLayoutParams();
            Rect rect3 = c0441u.f4969a;
            z9 = false;
            z10 = true;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) c0441u).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) c0441u).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) c0441u).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) c0441u).bottomMargin);
            if (rect2.left - i8 >= t7 || rect2.right - i8 <= s8 || rect2.top - i9 >= r8 || rect2.bottom - i9 <= u8) {
                return false;
            }
        } else {
            z9 = false;
            z10 = true;
        }
        if (i8 == 0 && i9 == 0) {
            return z9;
        }
        if (z7) {
            recyclerView.scrollBy(i8, i9);
            return z10;
        }
        recyclerView.r(i8, i9);
        return z10;
    }

    public final void H() {
        RecyclerView recyclerView = this.f4963b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f4963b = null;
            this.f4962a = null;
            this.f4967f = 0;
            this.f4968g = 0;
            return;
        }
        this.f4963b = recyclerView;
        this.f4962a = recyclerView.f3991l;
        this.f4967f = recyclerView.getWidth();
        this.f4968g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(C0441u c0441u) {
        return c0441u != null;
    }

    public abstract int f(C0409B c0409b);

    public abstract void g(C0409B c0409b);

    public abstract int h(C0409B c0409b);

    public abstract int i(C0409B c0409b);

    public abstract void j(C0409B c0409b);

    public abstract int k(C0409B c0409b);

    public abstract C0441u l();

    public C0441u m(Context context, AttributeSet attributeSet) {
        return new C0441u(context, attributeSet);
    }

    public C0441u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0441u ? new C0441u((C0441u) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0441u((ViewGroup.MarginLayoutParams) layoutParams) : new C0441u(layoutParams);
    }

    public final View o(int i2) {
        D0.j jVar = this.f4962a;
        if (jVar == null) {
            return null;
        }
        J6.a aVar = (J6.a) jVar.f331i;
        int i5 = -1;
        if (i2 >= 0) {
            int childCount = ((RecyclerView) ((l2.c) jVar.f330e).f6269d).getChildCount();
            int i7 = i2;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                int a7 = i2 - (i7 - aVar.a(i7));
                if (a7 == 0) {
                    i5 = i7;
                    while (aVar.b(i5)) {
                        i5++;
                    }
                } else {
                    i7 += a7;
                }
            }
        }
        return ((RecyclerView) ((l2.c) jVar.f330e).f6269d).getChildAt(i5);
    }

    public final int p() {
        D0.j jVar = this.f4962a;
        if (jVar != null) {
            return ((RecyclerView) ((l2.c) jVar.f330e).f6269d).getChildCount() - ((ArrayList) jVar.f332l).size();
        }
        return 0;
    }

    public int q(D6.n nVar, C0409B c0409b) {
        RecyclerView recyclerView = this.f4963b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f4963b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f4963b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f4963b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f4963b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(D6.n nVar, C0409B c0409b) {
        RecyclerView recyclerView = this.f4963b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i2) {
    }
}
