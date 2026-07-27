package W;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b2.AbstractC0279e;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public B4.i f3367a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3368b;

    /* renamed from: c, reason: collision with root package name */
    public final B0.t f3369c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.t f3370d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3371e;

    /* renamed from: f, reason: collision with root package name */
    public int f3372f;

    /* renamed from: g, reason: collision with root package name */
    public int f3373g;

    public t() {
        V0.j jVar = new V0.j(2, this);
        U.e eVar = new U.e(this);
        this.f3369c = new B0.t(jVar);
        this.f3370d = new B0.t(eVar);
        this.f3371e = false;
    }

    public static int e(int i2, int i3, int i6) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i6) : size : Math.min(size, Math.max(i3, i6));
    }

    public static void v(View view) {
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0168m w(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0168m c0168m = new C0168m(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V.a.f3181a, i2, i3);
        c0168m.f3354b = obtainStyledAttributes.getInt(0, 1);
        c0168m.f3355c = obtainStyledAttributes.getInt(9, 1);
        c0168m.f3356d = obtainStyledAttributes.getBoolean(8, false);
        c0168m.f3357e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0168m;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3368b;
        T4.l lVar = recyclerView.f4646a;
        B b6 = recyclerView.f4655e0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3368b.canScrollVertically(-1) && !this.f3368b.canScrollHorizontally(-1) && !this.f3368b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        this.f3368b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p5 = p() - 1;
        if (p5 < 0) {
            return;
        }
        RecyclerView.j(o(p5));
        throw null;
    }

    public final void F(T4.l lVar) {
        int size = ((ArrayList) lVar.f2903c).size();
        int i2 = size - 1;
        ArrayList arrayList = (ArrayList) lVar.f2903c;
        if (i2 >= 0) {
            AbstractC0279e.o(arrayList.get(i2));
            throw null;
        }
        arrayList.clear();
        if (size > 0) {
            this.f3368b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z5) {
        int s2 = s();
        int u5 = u();
        int t5 = this.f3372f - t();
        int r5 = this.f3373g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - s2;
        int min = Math.min(0, i2);
        int i3 = top - u5;
        int min2 = Math.min(0, i3);
        int i6 = width - t5;
        int max = Math.max(0, i6);
        int max2 = Math.max(0, height - r5);
        RecyclerView recyclerView2 = this.f3368b;
        Field field = E.G.f566a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i2, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i6);
        }
        if (min2 == 0) {
            min2 = Math.min(i3, max2);
        }
        int[] iArr = {max, min2};
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (z5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s4 = s();
            int u6 = u();
            int t6 = this.f3372f - t();
            int r6 = this.f3373g - r();
            Rect rect2 = this.f3368b.f4658g;
            int[] iArr2 = RecyclerView.f4627o0;
            u uVar = (u) focusedChild.getLayoutParams();
            Rect rect3 = uVar.f3374a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) uVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) uVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin);
            if (rect2.left - i7 >= t6 || rect2.right - i7 <= s4 || rect2.top - i8 >= r6 || rect2.bottom - i8 <= u6) {
                return false;
            }
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        if (z) {
            recyclerView.scrollBy(i7, i8);
            return true;
        }
        recyclerView.r(i7, i8);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f3368b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3368b = null;
            this.f3367a = null;
            this.f3372f = 0;
            this.f3373g = 0;
            return;
        }
        this.f3368b = recyclerView;
        this.f3367a = recyclerView.f4652d;
        this.f3372f = recyclerView.getWidth();
        this.f3373g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(u uVar) {
        return uVar != null;
    }

    public abstract int f(B b6);

    public abstract void g(B b6);

    public abstract int h(B b6);

    public abstract int i(B b6);

    public abstract void j(B b6);

    public abstract int k(B b6);

    public abstract u l();

    public u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u ? new u((u) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new u((ViewGroup.MarginLayoutParams) layoutParams) : new u(layoutParams);
    }

    public final View o(int i2) {
        B4.i iVar = this.f3367a;
        if (iVar == null) {
            return null;
        }
        int i3 = -1;
        if (i2 >= 0) {
            int childCount = ((RecyclerView) ((U.e) iVar.f311b).f3053a).getChildCount();
            int i6 = i2;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                C0157b c0157b = (C0157b) iVar.f312c;
                int a6 = i2 - (i6 - c0157b.a(i6));
                if (a6 == 0) {
                    i3 = i6;
                    while (c0157b.b(i3)) {
                        i3++;
                    }
                } else {
                    i6 += a6;
                }
            }
        }
        return ((RecyclerView) ((U.e) iVar.f311b).f3053a).getChildAt(i3);
    }

    public final int p() {
        B4.i iVar = this.f3367a;
        if (iVar != null) {
            return ((RecyclerView) ((U.e) iVar.f311b).f3053a).getChildCount() - ((ArrayList) iVar.f313d).size();
        }
        return 0;
    }

    public int q(T4.l lVar, B b6) {
        RecyclerView recyclerView = this.f3368b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f3368b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f3368b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f3368b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f3368b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(T4.l lVar, B b6) {
        RecyclerView recyclerView = this.f3368b;
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
