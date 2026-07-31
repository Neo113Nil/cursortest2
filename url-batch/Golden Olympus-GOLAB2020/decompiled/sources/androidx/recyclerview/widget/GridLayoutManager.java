package androidx.recyclerview.widget;

import B.w;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    boolean f12835a;

    /* renamed from: b, reason: collision with root package name */
    int f12836b;

    /* renamed from: c, reason: collision with root package name */
    int[] f12837c;

    /* renamed from: d, reason: collision with root package name */
    View[] f12838d;

    /* renamed from: e, reason: collision with root package name */
    final SparseIntArray f12839e;

    /* renamed from: f, reason: collision with root package name */
    final SparseIntArray f12840f;

    /* renamed from: g, reason: collision with root package name */
    c f12841g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f12842h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12843i;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i4, int i5) {
            return i4 % i5;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i4) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f12846a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f12847b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f12848c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12849d = false;

        static int a(SparseIntArray sparseIntArray, int i4) {
            int size = sparseIntArray.size() - 1;
            int i5 = 0;
            while (i5 <= size) {
                int i6 = (i5 + size) >>> 1;
                if (sparseIntArray.keyAt(i6) < i4) {
                    i5 = i6 + 1;
                } else {
                    size = i6 - 1;
                }
            }
            int i7 = i5 - 1;
            if (i7 < 0 || i7 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i7);
        }

        int b(int i4, int i5) {
            if (!this.f12849d) {
                return d(i4, i5);
            }
            int i6 = this.f12847b.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int d4 = d(i4, i5);
            this.f12847b.put(i4, d4);
            return d4;
        }

        int c(int i4, int i5) {
            if (!this.f12848c) {
                return e(i4, i5);
            }
            int i6 = this.f12846a.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int e4 = e(i4, i5);
            this.f12846a.put(i4, e4);
            return e4;
        }

        public int d(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int a4;
            if (!this.f12849d || (a4 = a(this.f12847b, i4)) == -1) {
                i6 = 0;
                i7 = 0;
                i8 = 0;
            } else {
                i6 = this.f12847b.get(a4);
                i7 = a4 + 1;
                i8 = c(a4, i5) + f(a4);
                if (i8 == i5) {
                    i6++;
                    i8 = 0;
                }
            }
            int f4 = f(i4);
            while (i7 < i4) {
                int f5 = f(i7);
                i8 += f5;
                if (i8 == i5) {
                    i6++;
                    i8 = 0;
                } else if (i8 > i5) {
                    i6++;
                    i8 = f5;
                }
                i7++;
            }
            return i8 + f4 > i5 ? i6 + 1 : i6;
        }

        public abstract int e(int i4, int i5);

        public abstract int f(int i4);

        public void g() {
            this.f12847b.clear();
        }

        public void h() {
            this.f12846a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f12835a = false;
        this.f12836b = -1;
        this.f12839e = new SparseIntArray();
        this.f12840f = new SparseIntArray();
        this.f12841g = new a();
        this.f12842h = new Rect();
        setSpanCount(RecyclerView.p.getProperties(context, attributeSet, i4, i5).f12924b);
    }

    private void F(RecyclerView.w wVar, RecyclerView.A a4, int i4, boolean z4) {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (z4) {
            i7 = 1;
            i6 = i4;
            i5 = 0;
        } else {
            i5 = i4 - 1;
            i6 = -1;
            i7 = -1;
        }
        while (i5 != i6) {
            View view = this.f12838d[i5];
            b bVar = (b) view.getLayoutParams();
            int R3 = R(wVar, a4, getPosition(view));
            bVar.f12845f = R3;
            bVar.f12844e = i8;
            i8 += R3;
            i5 += i7;
        }
    }

    private void G() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            b bVar = (b) getChildAt(i4).getLayoutParams();
            int a4 = bVar.a();
            this.f12839e.put(a4, bVar.f());
            this.f12840f.put(a4, bVar.e());
        }
    }

    private void H(int i4) {
        this.f12837c = I(this.f12837c, this.f12836b, i4);
    }

    static int[] I(int[] iArr, int i4, int i5) {
        int i6;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i5) {
            iArr = new int[i4 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i5 / i4;
        int i9 = i5 % i4;
        int i10 = 0;
        for (int i11 = 1; i11 <= i4; i11++) {
            i7 += i9;
            if (i7 <= 0 || i4 - i7 >= i9) {
                i6 = i8;
            } else {
                i6 = i8 + 1;
                i7 -= i4;
            }
            i10 += i6;
            iArr[i11] = i10;
        }
        return iArr;
    }

    private void J() {
        this.f12839e.clear();
        this.f12840f.clear();
    }

    private int K(RecyclerView.A a4) {
        if (getChildCount() != 0 && a4.b() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int b4 = this.f12841g.b(getPosition(findFirstVisibleChildClosestToStart), this.f12836b);
                int b5 = this.f12841g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f12836b);
                int max = this.mShouldReverseLayout ? Math.max(0, ((this.f12841g.b(a4.b() - 1, this.f12836b) + 1) - Math.max(b4, b5)) - 1) : Math.max(0, Math.min(b4, b5));
                if (isSmoothScrollbarEnabled) {
                    return Math.round((max * (Math.abs(this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)) / ((this.f12841g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f12836b) - this.f12841g.b(getPosition(findFirstVisibleChildClosestToStart), this.f12836b)) + 1))) + (this.mOrientationHelper.n() - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)));
                }
                return max;
            }
        }
        return 0;
    }

    private int L(RecyclerView.A a4) {
        if (getChildCount() != 0 && a4.b() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f12841g.b(a4.b() - 1, this.f12836b) + 1;
                }
                int d4 = this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart);
                int b4 = this.f12841g.b(getPosition(findFirstVisibleChildClosestToStart), this.f12836b);
                return (int) ((d4 / ((this.f12841g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f12836b) - b4) + 1)) * (this.f12841g.b(a4.b() - 1, this.f12836b) + 1));
            }
        }
        return 0;
    }

    private void M(RecyclerView.w wVar, RecyclerView.A a4, LinearLayoutManager.a aVar, int i4) {
        boolean z4 = i4 == 1;
        int Q3 = Q(wVar, a4, aVar.f12854b);
        if (z4) {
            while (Q3 > 0) {
                int i5 = aVar.f12854b;
                if (i5 <= 0) {
                    return;
                }
                int i6 = i5 - 1;
                aVar.f12854b = i6;
                Q3 = Q(wVar, a4, i6);
            }
            return;
        }
        int b4 = a4.b() - 1;
        int i7 = aVar.f12854b;
        while (i7 < b4) {
            int i8 = i7 + 1;
            int Q4 = Q(wVar, a4, i8);
            if (Q4 <= Q3) {
                break;
            }
            i7 = i8;
            Q3 = Q4;
        }
        aVar.f12854b = i7;
    }

    private void N() {
        View[] viewArr = this.f12838d;
        if (viewArr == null || viewArr.length != this.f12836b) {
            this.f12838d = new View[this.f12836b];
        }
    }

    private int P(RecyclerView.w wVar, RecyclerView.A a4, int i4) {
        if (!a4.e()) {
            return this.f12841g.b(i4, this.f12836b);
        }
        int f4 = wVar.f(i4);
        if (f4 != -1) {
            return this.f12841g.b(f4, this.f12836b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    private int Q(RecyclerView.w wVar, RecyclerView.A a4, int i4) {
        if (!a4.e()) {
            return this.f12841g.c(i4, this.f12836b);
        }
        int i5 = this.f12840f.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int f4 = wVar.f(i4);
        if (f4 != -1) {
            return this.f12841g.c(f4, this.f12836b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    private int R(RecyclerView.w wVar, RecyclerView.A a4, int i4) {
        if (!a4.e()) {
            return this.f12841g.f(i4);
        }
        int i5 = this.f12839e.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int f4 = wVar.f(i4);
        if (f4 != -1) {
            return this.f12841g.f(f4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    private void S(float f4, int i4) {
        H(Math.max(Math.round(f4 * this.f12836b), i4));
    }

    private void T(View view, int i4, boolean z4) {
        int i5;
        int i6;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f12928b;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int O3 = O(bVar.f12844e, bVar.f12845f);
        if (this.mOrientation == 1) {
            i6 = RecyclerView.p.getChildMeasureSpec(O3, i4, i8, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i5 = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.o(), getHeightMode(), i7, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.p.getChildMeasureSpec(O3, i4, i7, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.o(), getWidthMode(), i8, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i5 = childMeasureSpec;
            i6 = childMeasureSpec2;
        }
        U(view, i6, i5, z4);
    }

    private void U(View view, int i4, int i5, boolean z4) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z4 ? shouldReMeasureChild(view, i4, i5, qVar) : shouldMeasureChild(view, i4, i5, qVar)) {
            view.measure(i4, i5);
        }
    }

    private void V() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        H(height - paddingTop);
    }

    int O(int i4, int i5) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f12837c;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.f12837c;
        int i6 = this.f12836b;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.A a4, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i4 = this.f12836b;
        for (int i5 = 0; i5 < this.f12836b && cVar.c(a4) && i4 > 0; i5++) {
            int i6 = cVar.f12865d;
            cVar2.a(i6, Math.max(0, cVar.f12868g));
            i4 -= this.f12841g.f(i6);
            cVar.f12865d += cVar.f12866e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.A a4) {
        return this.f12843i ? K(a4) : super.computeHorizontalScrollOffset(a4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.A a4) {
        return this.f12843i ? L(a4) : super.computeHorizontalScrollRange(a4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.A a4) {
        return this.f12843i ? K(a4) : super.computeVerticalScrollOffset(a4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.A a4) {
        return this.f12843i ? L(a4) : super.computeVerticalScrollRange(a4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.w wVar, RecyclerView.A a4, boolean z4, boolean z5) {
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 1;
        if (z5) {
            i5 = getChildCount() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = childCount;
            i5 = 0;
        }
        int b4 = a4.b();
        ensureLayoutState();
        int n4 = this.mOrientationHelper.n();
        int i7 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        while (i5 != i4) {
            View childAt = getChildAt(i5);
            int position = getPosition(childAt);
            if (position >= 0 && position < b4 && Q(wVar, a4, position) == 0) {
                if (((RecyclerView.q) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) < i7 && this.mOrientationHelper.d(childAt) >= n4) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i5 += i6;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.A a4) {
        if (this.mOrientation == 1) {
            return this.f12836b;
        }
        if (a4.b() < 1) {
            return 0;
        }
        return P(wVar, a4, a4.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.A a4) {
        if (this.mOrientation == 0) {
            return this.f12836b;
        }
        if (a4.b() < 1) {
            return 0;
        }
        return P(wVar, a4, a4.b() - 1) + 1;
    }

    public int getSpanCount() {
        return this.f12836b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f12859b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutChunk(RecyclerView.w wVar, RecyclerView.A a4, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int childMeasureSpec;
        int i11;
        View d4;
        int m4 = this.mOrientationHelper.m();
        boolean z4 = m4 != 1073741824;
        int i12 = getChildCount() > 0 ? this.f12837c[this.f12836b] : 0;
        if (z4) {
            V();
        }
        boolean z5 = cVar.f12866e == 1;
        int i13 = this.f12836b;
        if (!z5) {
            i13 = Q(wVar, a4, cVar.f12865d) + R(wVar, a4, cVar.f12865d);
        }
        int i14 = 0;
        while (i14 < this.f12836b && cVar.c(a4) && i13 > 0) {
            int i15 = cVar.f12865d;
            int R3 = R(wVar, a4, i15);
            if (R3 > this.f12836b) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + R3 + " spans but GridLayoutManager has only " + this.f12836b + " spans.");
            }
            i13 -= R3;
            if (i13 < 0 || (d4 = cVar.d(wVar)) == null) {
                break;
            }
            this.f12838d[i14] = d4;
            i14++;
        }
        F(wVar, a4, i14, z5);
        float f4 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f12838d[i17];
            if (cVar.f12873l == null) {
                if (z5) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z5) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.f12842h);
            T(view, m4, false);
            int e4 = this.mOrientationHelper.e(view);
            if (e4 > i16) {
                i16 = e4;
            }
            float f5 = (this.mOrientationHelper.f(view) * 1.0f) / ((b) view.getLayoutParams()).f12845f;
            if (f5 > f4) {
                f4 = f5;
            }
        }
        if (z4) {
            S(f4, i12);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f12838d[i18];
                T(view2, 1073741824, true);
                int e5 = this.mOrientationHelper.e(view2);
                if (e5 > i16) {
                    i16 = e5;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f12838d[i19];
            if (this.mOrientationHelper.e(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f12928b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int O3 = O(bVar2.f12844e, bVar2.f12845f);
                if (this.mOrientation == 1) {
                    i11 = RecyclerView.p.getChildMeasureSpec(O3, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    childMeasureSpec = RecyclerView.p.getChildMeasureSpec(O3, 1073741824, i20, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i11 = makeMeasureSpec;
                }
                U(view3, i11, childMeasureSpec, true);
            }
        }
        bVar.f12858a = i16;
        if (this.mOrientation == 1) {
            if (cVar.f12867f == -1) {
                i9 = cVar.f12863b;
                i10 = i9 - i16;
            } else {
                i10 = cVar.f12863b;
                i9 = i10 + i16;
            }
            i7 = i10;
            i8 = 0;
            i6 = 0;
        } else {
            if (cVar.f12867f == -1) {
                i5 = cVar.f12863b;
                i4 = i5 - i16;
            } else {
                i4 = cVar.f12863b;
                i5 = i4 + i16;
            }
            i6 = i4;
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f12838d[i22];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                i7 = this.f12837c[bVar3.f12844e] + getPaddingTop();
                i9 = this.mOrientationHelper.f(view4) + i7;
            } else if (isLayoutRTL()) {
                i8 = getPaddingLeft() + this.f12837c[this.f12836b - bVar3.f12844e];
                i6 = i8 - this.mOrientationHelper.f(view4);
            } else {
                i6 = this.f12837c[bVar3.f12844e] + getPaddingLeft();
                i8 = this.mOrientationHelper.f(view4) + i6;
            }
            int i23 = i9;
            int i24 = i7;
            int i25 = i8;
            int i26 = i6;
            layoutDecoratedWithMargins(view4, i26, i24, i25, i23);
            i9 = i23;
            i6 = i26;
            i8 = i25;
            i7 = i24;
            if (bVar3.c() || bVar3.b()) {
                bVar.f12860c = true;
            }
            bVar.f12861d = view4.hasFocusable() | bVar.f12861d;
        }
        Arrays.fill(this.f12838d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(RecyclerView.w wVar, RecyclerView.A a4, LinearLayoutManager.a aVar, int i4) {
        super.onAnchorReady(wVar, a4, aVar, i4);
        V();
        if (a4.b() > 0 && !a4.e()) {
            M(wVar, a4, aVar, i4);
        }
        N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onFocusSearchFailed(View view, int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        int childCount;
        int i5;
        int i6;
        View view2;
        View view3;
        View view4;
        int i7;
        int i8;
        int i9;
        RecyclerView.w wVar2 = wVar;
        RecyclerView.A a5 = a4;
        View findContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (findContainingItemView == null) {
            return null;
        }
        b bVar = (b) findContainingItemView.getLayoutParams();
        int i10 = bVar.f12844e;
        int i11 = bVar.f12845f + i10;
        if (super.onFocusSearchFailed(view, i4, wVar, a4) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i4) == 1) != this.mShouldReverseLayout) {
            i6 = getChildCount() - 1;
            childCount = -1;
            i5 = -1;
        } else {
            childCount = getChildCount();
            i5 = 1;
            i6 = 0;
        }
        boolean z4 = this.mOrientation == 1 && isLayoutRTL();
        int P3 = P(wVar2, a5, i6);
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = i6;
        View view6 = null;
        while (i16 != childCount) {
            int P4 = P(wVar2, a5, i16);
            View childAt = getChildAt(i16);
            if (childAt == findContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || P4 == P3) {
                b bVar2 = (b) childAt.getLayoutParams();
                int i17 = bVar2.f12844e;
                view2 = findContainingItemView;
                int i18 = bVar2.f12845f + i17;
                if (childAt.hasFocusable() && i17 == i10 && i18 == i11) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int min = Math.min(i18, i11) - Math.max(i17, i10);
                    if (childAt.hasFocusable()) {
                        if (min <= i14) {
                            if (min == i14) {
                            }
                        }
                    } else if (view3 == null) {
                        view4 = view6;
                        i7 = i14;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            i8 = i15;
                            if (min > i8) {
                                i9 = i13;
                            } else {
                                if (min == i8) {
                                    i9 = i13;
                                } else {
                                    i9 = i13;
                                }
                                i13 = i9;
                                i15 = i8;
                                view6 = view4;
                                i14 = i7;
                                view5 = view3;
                                i16 += i5;
                                wVar2 = wVar;
                                a5 = a4;
                                findContainingItemView = view2;
                            }
                            if (childAt.hasFocusable()) {
                                int i19 = bVar2.f12844e;
                                i15 = Math.min(i18, i11) - Math.max(i17, i10);
                                view6 = childAt;
                                i13 = i19;
                                i14 = i7;
                                view5 = view3;
                                i16 += i5;
                                wVar2 = wVar;
                                a5 = a4;
                                findContainingItemView = view2;
                            } else {
                                i13 = i9;
                                i15 = i8;
                                i12 = bVar2.f12844e;
                                view6 = view4;
                                view5 = childAt;
                                i14 = Math.min(i18, i11) - Math.max(i17, i10);
                                i16 += i5;
                                wVar2 = wVar;
                                a5 = a4;
                                findContainingItemView = view2;
                            }
                        }
                        i9 = i13;
                        i8 = i15;
                        i13 = i9;
                        i15 = i8;
                        view6 = view4;
                        i14 = i7;
                        view5 = view3;
                        i16 += i5;
                        wVar2 = wVar;
                        a5 = a4;
                        findContainingItemView = view2;
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i7 = i14;
                i9 = i13;
                i8 = i15;
                if (childAt.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = findContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i7 = i14;
            i9 = i13;
            i8 = i15;
            i13 = i9;
            i15 = i8;
            view6 = view4;
            i14 = i7;
            view5 = view3;
            i16 += i5;
            wVar2 = wVar;
            a5 = a4;
            findContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.A a4, B.w wVar2) {
        super.onInitializeAccessibilityNodeInfo(wVar, a4, wVar2);
        wVar2.k0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.A a4, View view, B.w wVar2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, wVar2);
            return;
        }
        b bVar = (b) layoutParams;
        int P3 = P(wVar, a4, bVar.a());
        if (this.mOrientation == 0) {
            wVar2.n0(w.f.a(bVar.e(), bVar.f(), P3, 1, false, false));
        } else {
            wVar2.n0(w.f.a(P3, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        this.f12841g.h();
        this.f12841g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f12841g.h();
        this.f12841g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.f12841g.h();
        this.f12841g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        this.f12841g.h();
        this.f12841g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
        this.f12841g.h();
        this.f12841g.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.A a4) {
        if (a4.e()) {
            G();
        }
        super.onLayoutChildren(wVar, a4);
        J();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.A a4) {
        super.onLayoutCompleted(a4);
        this.f12835a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        V();
        N();
        return super.scrollHorizontallyBy(i4, wVar, a4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        V();
        N();
        return super.scrollVerticallyBy(i4, wVar, a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i4, int i5) {
        int chooseSize;
        int chooseSize2;
        if (this.f12837c == null) {
            super.setMeasuredDimension(rect, i4, i5);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.p.chooseSize(i5, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f12837c;
            chooseSize = RecyclerView.p.chooseSize(i4, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.p.chooseSize(i4, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f12837c;
            chooseSize2 = RecyclerView.p.chooseSize(i5, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setSpanCount(int i4) {
        if (i4 == this.f12836b) {
            return;
        }
        this.f12835a = true;
        if (i4 >= 1) {
            this.f12836b = i4;
            this.f12841g.h();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f12835a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        int f12844e;

        /* renamed from: f, reason: collision with root package name */
        int f12845f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12844e = -1;
            this.f12845f = 0;
        }

        public int e() {
            return this.f12844e;
        }

        public int f() {
            return this.f12845f;
        }

        public b(int i4, int i5) {
            super(i4, i5);
            this.f12844e = -1;
            this.f12845f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12844e = -1;
            this.f12845f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12844e = -1;
            this.f12845f = 0;
        }
    }

    public GridLayoutManager(Context context, int i4, int i5, boolean z4) {
        super(context, i5, z4);
        this.f12835a = false;
        this.f12836b = -1;
        this.f12839e = new SparseIntArray();
        this.f12840f = new SparseIntArray();
        this.f12841g = new a();
        this.f12842h = new Rect();
        setSpanCount(i4);
    }
}
