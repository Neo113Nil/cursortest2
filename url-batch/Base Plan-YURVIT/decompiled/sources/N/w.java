package N;

import B0.C0008i;
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
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public C0008i f774a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f775b;

    /* renamed from: c, reason: collision with root package name */
    public final P f776c;

    /* renamed from: d, reason: collision with root package name */
    public final P f777d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f778e;

    /* renamed from: f, reason: collision with root package name */
    public int f779f;

    /* renamed from: g, reason: collision with root package name */
    public int f780g;

    public w() {
        v vVar = new v(this, 0);
        v vVar2 = new v(this, 1);
        this.f776c = new P(vVar);
        this.f777d = new P(vVar2);
        this.f778e = false;
    }

    public static int e(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
    }

    public static void v(View view) {
        ((x) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0057n w(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0057n c0057n = new C0057n(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.a.f647a, i2, i3);
        c0057n.f759b = obtainStyledAttributes.getInt(0, 1);
        c0057n.f760c = obtainStyledAttributes.getInt(9, 1);
        c0057n.f761d = obtainStyledAttributes.getBoolean(8, false);
        c0057n.f762e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0057n;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f775b;
        C c2 = recyclerView.f1683e;
        F f2 = recyclerView.b0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f775b.canScrollVertically(-1) && !this.f775b.canScrollHorizontally(-1) && !this.f775b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f775b.getClass();
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

    public final void F(C c2) {
        ArrayList arrayList = c2.f650a;
        int size = arrayList.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            arrayList.get(i2).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f775b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        int s2 = s();
        int u2 = u();
        int t = this.f779f - t();
        int r2 = this.f780g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i2 = left - s2;
        int min = Math.min(0, i2);
        int i3 = top - u2;
        int min2 = Math.min(0, i3);
        int i4 = width - t;
        int max = Math.max(0, i4);
        int max2 = Math.max(0, height - r2);
        RecyclerView recyclerView2 = this.f775b;
        Field field = y.x.f3160a;
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
            int t2 = this.f779f - t();
            int r3 = this.f780g - r();
            Rect rect2 = this.f775b.f1694k;
            int[] iArr2 = RecyclerView.f1655l0;
            x xVar = (x) focusedChild.getLayoutParams();
            Rect rect3 = xVar.f781a;
            z4 = false;
            z5 = true;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) xVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) xVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin);
            if (rect2.left - i5 >= t2 || rect2.right - i5 <= s3 || rect2.top - i6 >= r3 || rect2.bottom - i6 <= u3) {
                return false;
            }
        } else {
            z4 = false;
            z5 = true;
        }
        if (i5 == 0 && i6 == 0) {
            return z4;
        }
        if (z2) {
            recyclerView.scrollBy(i5, i6);
            return z5;
        }
        recyclerView.r(i5, i6);
        return z5;
    }

    public final void H() {
        RecyclerView recyclerView = this.f775b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f775b = null;
            this.f774a = null;
            this.f779f = 0;
            this.f780g = 0;
            return;
        }
        this.f775b = recyclerView;
        this.f774a = recyclerView.f1689h;
        this.f779f = recyclerView.getWidth();
        this.f780g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(x xVar) {
        return xVar != null;
    }

    public abstract int f(F f2);

    public abstract void g(F f2);

    public abstract int h(F f2);

    public abstract int i(F f2);

    public abstract void j(F f2);

    public abstract int k(F f2);

    public abstract x l();

    public x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    public x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x ? new x((x) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new x((ViewGroup.MarginLayoutParams) layoutParams) : new x(layoutParams);
    }

    public final View o(int i2) {
        C0008i c0008i = this.f774a;
        if (c0008i == null) {
            return null;
        }
        C0045b c0045b = (C0045b) c0008i.f85g;
        int i3 = -1;
        if (i2 >= 0) {
            int childCount = ((RecyclerView) ((B0.E) c0008i.f84f).f20f).getChildCount();
            int i4 = i2;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                int a2 = i2 - (i4 - c0045b.a(i4));
                if (a2 == 0) {
                    i3 = i4;
                    while (c0045b.b(i3)) {
                        i3++;
                    }
                } else {
                    i4 += a2;
                }
            }
        }
        return ((RecyclerView) ((B0.E) c0008i.f84f).f20f).getChildAt(i3);
    }

    public final int p() {
        C0008i c0008i = this.f774a;
        if (c0008i != null) {
            return ((RecyclerView) ((B0.E) c0008i.f84f).f20f).getChildCount() - ((ArrayList) c0008i.f86h).size();
        }
        return 0;
    }

    public int q(C c2, F f2) {
        RecyclerView recyclerView = this.f775b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f775b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f775b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f775b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f775b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(C c2, F f2) {
        RecyclerView recyclerView = this.f775b;
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
