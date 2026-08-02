package U;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0178i;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public A0.f f1451a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1452b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.e f1453c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.e f1454d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1455e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1456g;

    public u() {
        C0178i c0178i = new C0178i(25, this);
        C0.e eVar = new C0.e(24, this);
        this.f1453c = new V0.e((N) c0178i);
        this.f1454d = new V0.e((N) eVar);
        this.f1455e = false;
    }

    public static int e(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
    }

    public static void v(View view) {
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0077m w(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0077m c0077m = new C0077m(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T.a.f1341a, i3, i4);
        c0077m.f1439b = obtainStyledAttributes.getInt(0, 1);
        c0077m.f1440c = obtainStyledAttributes.getInt(9, 1);
        c0077m.f1441d = obtainStyledAttributes.getBoolean(8, false);
        c0077m.f1442e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0077m;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1452b;
        A a3 = recyclerView.f2469a;
        D d3 = recyclerView.f2466U;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1452b.canScrollVertically(-1) && !this.f1452b.canScrollHorizontally(-1) && !this.f1452b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        this.f1452b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p3 = p() - 1;
        if (p3 < 0) {
            return;
        }
        RecyclerView.j(o(p3));
        throw null;
    }

    public final void F(A a3) {
        int size = ((ArrayList) a3.f1348c).size();
        int i3 = size - 1;
        ArrayList arrayList = (ArrayList) a3.f1348c;
        if (i3 >= 0) {
            arrayList.get(i3).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f1452b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int s3 = s();
        int u3 = u();
        int t3 = this.f - t();
        int r3 = this.f1456g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i3 = left - s3;
        int min = Math.min(0, i3);
        int i4 = top - u3;
        int min2 = Math.min(0, i4);
        int i5 = width - t3;
        int max = Math.max(0, i5);
        int max2 = Math.max(0, height - r3);
        RecyclerView recyclerView2 = this.f1452b;
        Field field = E.A.f243a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i3, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i5);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s4 = s();
            int u4 = u();
            int t4 = this.f - t();
            int r4 = this.f1456g - r();
            Rect rect2 = this.f1452b.f2480g;
            int[] iArr2 = RecyclerView.f2443h0;
            v vVar = (v) focusedChild.getLayoutParams();
            Rect rect3 = vVar.f1457a;
            z3 = false;
            z4 = true;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) vVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) vVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) vVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin);
            if (rect2.left - i6 >= t4 || rect2.right - i6 <= s4 || rect2.top - i7 >= r4 || rect2.bottom - i7 <= u4) {
                return false;
            }
        } else {
            z3 = false;
            z4 = true;
        }
        if (i6 == 0 && i7 == 0) {
            return z3;
        }
        if (z) {
            recyclerView.scrollBy(i6, i7);
            return z4;
        }
        recyclerView.r(i6, i7);
        return z4;
    }

    public final void H() {
        RecyclerView recyclerView = this.f1452b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1452b = null;
            this.f1451a = null;
            this.f = 0;
            this.f1456g = 0;
            return;
        }
        this.f1452b = recyclerView;
        this.f1451a = recyclerView.f2475d;
        this.f = recyclerView.getWidth();
        this.f1456g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(v vVar) {
        return vVar != null;
    }

    public abstract int f(D d3);

    public abstract void g(D d3);

    public abstract int h(D d3);

    public abstract int i(D d3);

    public abstract void j(D d3);

    public abstract int k(D d3);

    public abstract v l();

    public v m(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    public v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v ? new v((v) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new v((ViewGroup.MarginLayoutParams) layoutParams) : new v(layoutParams);
    }

    public final View o(int i3) {
        A0.f fVar = this.f1451a;
        if (fVar == null) {
            return null;
        }
        int i4 = -1;
        if (i3 >= 0) {
            int childCount = ((RecyclerView) ((C0.e) fVar.f23b).f201b).getChildCount();
            int i5 = i3;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                C0066b c0066b = (C0066b) fVar.f24c;
                int a3 = i3 - (i5 - c0066b.a(i5));
                if (a3 == 0) {
                    i4 = i5;
                    while (c0066b.b(i4)) {
                        i4++;
                    }
                } else {
                    i5 += a3;
                }
            }
        }
        return ((RecyclerView) ((C0.e) fVar.f23b).f201b).getChildAt(i4);
    }

    public final int p() {
        A0.f fVar = this.f1451a;
        if (fVar != null) {
            return ((RecyclerView) ((C0.e) fVar.f23b).f201b).getChildCount() - ((ArrayList) fVar.f25d).size();
        }
        return 0;
    }

    public int q(A a3, D d3) {
        RecyclerView recyclerView = this.f1452b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f1452b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f1452b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f1452b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f1452b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(A a3, D d3) {
        RecyclerView recyclerView = this.f1452b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i3) {
    }
}
