package l1;

import E.AbstractC0005f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import d2.C0389g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k1.AbstractC1241a;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public B1.j f14255a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f14256b;

    /* renamed from: c, reason: collision with root package name */
    public final C0389g f14257c;

    /* renamed from: d, reason: collision with root package name */
    public final C0389g f14258d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14259e;

    /* renamed from: f, reason: collision with root package name */
    public int f14260f;

    /* renamed from: g, reason: collision with root package name */
    public int f14261g;

    public t() {
        s sVar = new s(this, 0);
        s sVar2 = new s(this, 1);
        this.f14257c = new C0389g(sVar);
        this.f14258d = new C0389g(sVar2);
        this.f14259e = false;
    }

    public static int e(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
    }

    public static void v(View view) {
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C1264k w(Context context, AttributeSet attributeSet, int i4, int i5) {
        C1264k c1264k = new C1264k(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f14146a, i4, i5);
        c1264k.f14241b = obtainStyledAttributes.getInt(0, 1);
        c1264k.f14242c = obtainStyledAttributes.getInt(9, 1);
        c1264k.f14243d = obtainStyledAttributes.getBoolean(8, false);
        c1264k.f14244e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c1264k;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f14256b;
        c0.F f4 = recyclerView.f5159a;
        C1245B c1245b = recyclerView.f5156U;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f14256b.canScrollVertically(-1) && !this.f14256b.canScrollHorizontally(-1) && !this.f14256b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        this.f14256b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p2 = p() - 1;
        if (p2 < 0) {
            return;
        }
        RecyclerView.j(o(p2));
        throw null;
    }

    public final void F(c0.F f4) {
        ArrayList arrayList = (ArrayList) f4.f5439c;
        int size = arrayList.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            throw AbstractC0005f.g(i4, arrayList);
        }
        arrayList.clear();
        if (size > 0) {
            this.f14256b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z4) {
        boolean z5;
        boolean z6;
        int s4 = s();
        int u4 = u();
        int t4 = this.f14260f - t();
        int r4 = this.f14261g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i4 = left - s4;
        int min = Math.min(0, i4);
        int i5 = top - u4;
        int min2 = Math.min(0, i5);
        int i6 = width - t4;
        int max = Math.max(0, i6);
        int max2 = Math.max(0, height - r4);
        RecyclerView recyclerView2 = this.f14256b;
        Field field = E.H.f375a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i4, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i6);
        }
        if (min2 == 0) {
            min2 = Math.min(i5, max2);
        }
        int[] iArr = {max, min2};
        int i7 = iArr[0];
        int i8 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s5 = s();
            int u5 = u();
            int t5 = this.f14260f - t();
            int r5 = this.f14261g - r();
            Rect rect2 = this.f14256b.f5171g;
            int[] iArr2 = RecyclerView.f5133h0;
            u uVar = (u) focusedChild.getLayoutParams();
            Rect rect3 = uVar.f14262a;
            z5 = false;
            z6 = true;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) uVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) uVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin);
            if (rect2.left - i7 >= t5 || rect2.right - i7 <= s5 || rect2.top - i8 >= r5 || rect2.bottom - i8 <= u5) {
                return false;
            }
        } else {
            z5 = false;
            z6 = true;
        }
        if (i7 == 0 && i8 == 0) {
            return z5;
        }
        if (z) {
            recyclerView.scrollBy(i7, i8);
            return z6;
        }
        recyclerView.r(i7, i8);
        return z6;
    }

    public final void H() {
        RecyclerView recyclerView = this.f14256b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f14256b = null;
            this.f14255a = null;
            this.f14260f = 0;
            this.f14261g = 0;
            return;
        }
        this.f14256b = recyclerView;
        this.f14255a = recyclerView.f5165d;
        this.f14260f = recyclerView.getWidth();
        this.f14261g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(u uVar) {
        return uVar != null;
    }

    public abstract int f(C1245B c1245b);

    public abstract void g(C1245B c1245b);

    public abstract int h(C1245B c1245b);

    public abstract int i(C1245B c1245b);

    public abstract void j(C1245B c1245b);

    public abstract int k(C1245B c1245b);

    public abstract u l();

    public u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u ? new u((u) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new u((ViewGroup.MarginLayoutParams) layoutParams) : new u(layoutParams);
    }

    public final View o(int i4) {
        B1.j jVar = this.f14255a;
        if (jVar == null) {
            return null;
        }
        G0.c cVar = (G0.c) jVar.f202c;
        int i5 = -1;
        if (i4 >= 0) {
            int childCount = ((RecyclerView) ((e0.t) jVar.f201b).f8416a).getChildCount();
            int i6 = i4;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                int F4 = i4 - (i6 - cVar.F(i6));
                if (F4 == 0) {
                    i5 = i6;
                    while (cVar.G(i5)) {
                        i5++;
                    }
                } else {
                    i6 += F4;
                }
            }
        }
        return ((RecyclerView) ((e0.t) jVar.f201b).f8416a).getChildAt(i5);
    }

    public final int p() {
        B1.j jVar = this.f14255a;
        if (jVar != null) {
            return ((RecyclerView) ((e0.t) jVar.f201b).f8416a).getChildCount() - ((ArrayList) jVar.f203d).size();
        }
        return 0;
    }

    public int q(c0.F f4, C1245B c1245b) {
        RecyclerView recyclerView = this.f14256b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f14256b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f14256b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f14256b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f14256b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(c0.F f4, C1245B c1245b) {
        RecyclerView recyclerView = this.f14256b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i4) {
    }
}
