package P;

import B0.C0031i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public C0031i f948a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f949b;

    /* renamed from: c, reason: collision with root package name */
    public final O f950c;

    /* renamed from: d, reason: collision with root package name */
    public final O f951d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f952e;

    /* renamed from: f, reason: collision with root package name */
    public int f953f;

    /* renamed from: g, reason: collision with root package name */
    public int f954g;

    public v() {
        u uVar = new u(this, 0);
        u uVar2 = new u(this, 1);
        this.f950c = new O(uVar);
        this.f951d = new O(uVar2);
        this.f952e = false;
    }

    public static int e(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    public static void v(View view) {
        ((w) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0103m w(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0103m c0103m = new C0103m(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O.a.f824a, i2, i3);
        c0103m.f933b = obtainStyledAttributes.getInt(0, 1);
        c0103m.f934c = obtainStyledAttributes.getInt(9, 1);
        c0103m.f935d = obtainStyledAttributes.getBoolean(8, false);
        c0103m.f936e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0103m;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f949b;
        B b2 = recyclerView.f1852e;
        E e2 = recyclerView.f1849b0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f949b.canScrollVertically(-1) && !this.f949b.canScrollHorizontally(-1) && !this.f949b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f949b.getClass();
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

    public final void F(B b2) {
        int size = ((ArrayList) b2.f829c).size();
        int i2 = size - 1;
        ArrayList arrayList = (ArrayList) b2.f829c;
        if (i2 >= 0) {
            arrayList.get(i2).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f949b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int s2 = s();
        int u2 = u();
        int t2 = this.f953f - t();
        int r2 = this.f954g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - s2;
        int min = Math.min(0, i2);
        int i3 = top - u2;
        int min2 = Math.min(0, i3);
        int i4 = width - t2;
        int max = Math.max(0, i4);
        int max2 = Math.max(0, height - r2);
        RecyclerView recyclerView2 = this.f949b;
        Field field = A.z.f58a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i2, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i4);
        }
        if (min2 == 0) {
            min2 = Math.min(i3, max2);
        }
        int[] iArr = {max, min2};
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s3 = s();
            int u3 = u();
            int t3 = this.f953f - t();
            int r3 = this.f954g - r();
            Rect rect2 = this.f949b.f1863k;
            int[] iArr2 = RecyclerView.f1821l0;
            w wVar = (w) focusedChild.getLayoutParams();
            Rect rect3 = wVar.f955a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) wVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) wVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) wVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) wVar).bottomMargin);
            if (rect2.left - i5 >= t3 || rect2.right - i5 <= s3 || rect2.top - i6 >= r3 || rect2.bottom - i6 <= u3) {
                return false;
            }
        }
        if (i5 == 0 && i6 == 0) {
            return false;
        }
        if (z2) {
            recyclerView.scrollBy(i5, i6);
            return true;
        }
        recyclerView.r(i5, i6);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f949b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f949b = null;
            this.f948a = null;
            this.f953f = 0;
            this.f954g = 0;
            return;
        }
        this.f949b = recyclerView;
        this.f948a = recyclerView.f1857h;
        this.f953f = recyclerView.getWidth();
        this.f954g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(w wVar) {
        return wVar != null;
    }

    public abstract int f(E e2);

    public abstract void g(E e2);

    public abstract int h(E e2);

    public abstract int i(E e2);

    public abstract void j(E e2);

    public abstract int k(E e2);

    public abstract w l();

    public w m(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    public w n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w ? new w((w) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new w((ViewGroup.MarginLayoutParams) layoutParams) : new w(layoutParams);
    }

    public final View o(int i2) {
        C0031i c0031i = this.f948a;
        if (c0031i == null) {
            return null;
        }
        int i3 = -1;
        if (i2 >= 0) {
            int childCount = ((RecyclerView) ((B.m) c0031i.f154f).f78f).getChildCount();
            int i4 = i2;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                C0092b c0092b = (C0092b) c0031i.f155g;
                int a2 = i2 - (i4 - c0092b.a(i4));
                if (a2 == 0) {
                    i3 = i4;
                    while (c0092b.b(i3)) {
                        i3++;
                    }
                } else {
                    i4 += a2;
                }
            }
        }
        return ((RecyclerView) ((B.m) c0031i.f154f).f78f).getChildAt(i3);
    }

    public final int p() {
        C0031i c0031i = this.f948a;
        if (c0031i != null) {
            return ((RecyclerView) ((B.m) c0031i.f154f).f78f).getChildCount() - ((ArrayList) c0031i.f156h).size();
        }
        return 0;
    }

    public int q(B b2, E e2) {
        RecyclerView recyclerView = this.f949b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f949b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f949b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f949b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f949b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(B b2, E e2) {
        RecyclerView recyclerView = this.f949b;
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
