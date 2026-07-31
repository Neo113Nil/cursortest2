package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    p mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f12850b;

        /* renamed from: c, reason: collision with root package name */
        int f12851c;

        /* renamed from: d, reason: collision with root package name */
        boolean f12852d;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState() {
        }

        boolean c() {
            return this.f12850b >= 0;
        }

        void d() {
            this.f12850b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f12850b);
            parcel.writeInt(this.f12851c);
            parcel.writeInt(this.f12852d ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f12850b = parcel.readInt();
            this.f12851c = parcel.readInt();
            this.f12852d = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f12850b = savedState.f12850b;
            this.f12851c = savedState.f12851c;
            this.f12852d = savedState.f12852d;
        }
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        p f12853a;

        /* renamed from: b, reason: collision with root package name */
        int f12854b;

        /* renamed from: c, reason: collision with root package name */
        int f12855c;

        /* renamed from: d, reason: collision with root package name */
        boolean f12856d;

        /* renamed from: e, reason: collision with root package name */
        boolean f12857e;

        a() {
            e();
        }

        void a() {
            this.f12855c = this.f12856d ? this.f12853a.i() : this.f12853a.n();
        }

        public void b(View view, int i4) {
            if (this.f12856d) {
                this.f12855c = this.f12853a.d(view) + this.f12853a.p();
            } else {
                this.f12855c = this.f12853a.g(view);
            }
            this.f12854b = i4;
        }

        public void c(View view, int i4) {
            int p4 = this.f12853a.p();
            if (p4 >= 0) {
                b(view, i4);
                return;
            }
            this.f12854b = i4;
            if (this.f12856d) {
                int i5 = (this.f12853a.i() - p4) - this.f12853a.d(view);
                this.f12855c = this.f12853a.i() - i5;
                if (i5 > 0) {
                    int e4 = this.f12855c - this.f12853a.e(view);
                    int n4 = this.f12853a.n();
                    int min = e4 - (n4 + Math.min(this.f12853a.g(view) - n4, 0));
                    if (min < 0) {
                        this.f12855c += Math.min(i5, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g4 = this.f12853a.g(view);
            int n5 = g4 - this.f12853a.n();
            this.f12855c = g4;
            if (n5 > 0) {
                int i6 = (this.f12853a.i() - Math.min(0, (this.f12853a.i() - p4) - this.f12853a.d(view))) - (g4 + this.f12853a.e(view));
                if (i6 < 0) {
                    this.f12855c -= Math.min(n5, -i6);
                }
            }
        }

        boolean d(View view, RecyclerView.A a4) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a4.b();
        }

        void e() {
            this.f12854b = -1;
            this.f12855c = Integer.MIN_VALUE;
            this.f12856d = false;
            this.f12857e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f12854b + ", mCoordinate=" + this.f12855c + ", mLayoutFromEnd=" + this.f12856d + ", mValid=" + this.f12857e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f12858a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12859b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12860c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12861d;

        protected b() {
        }

        void a() {
            this.f12858a = 0;
            this.f12859b = false;
            this.f12860c = false;
            this.f12861d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f12863b;

        /* renamed from: c, reason: collision with root package name */
        int f12864c;

        /* renamed from: d, reason: collision with root package name */
        int f12865d;

        /* renamed from: e, reason: collision with root package name */
        int f12866e;

        /* renamed from: f, reason: collision with root package name */
        int f12867f;

        /* renamed from: g, reason: collision with root package name */
        int f12868g;

        /* renamed from: k, reason: collision with root package name */
        int f12872k;

        /* renamed from: m, reason: collision with root package name */
        boolean f12874m;

        /* renamed from: a, reason: collision with root package name */
        boolean f12862a = true;

        /* renamed from: h, reason: collision with root package name */
        int f12869h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f12870i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f12871j = false;

        /* renamed from: l, reason: collision with root package name */
        List f12873l = null;

        c() {
        }

        private View e() {
            int size = this.f12873l.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((RecyclerView.E) this.f12873l.get(i4)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f12865d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f4 = f(view);
            if (f4 == null) {
                this.f12865d = -1;
            } else {
                this.f12865d = ((RecyclerView.q) f4.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.A a4) {
            int i4 = this.f12865d;
            return i4 >= 0 && i4 < a4.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f12873l != null) {
                return e();
            }
            View o4 = wVar.o(this.f12865d);
            this.f12865d += this.f12866e;
            return o4;
        }

        public View f(View view) {
            int a4;
            int size = this.f12873l.size();
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                View view3 = ((RecyclerView.E) this.f12873l.get(i5)).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a4 = (qVar.a() - this.f12865d) * this.f12866e) >= 0 && a4 < i4) {
                    if (a4 == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i4 = a4;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A(int i4, int i5, boolean z4, RecyclerView.A a4) {
        int n4;
        this.mLayoutState.f12874m = resolveIsInfinite();
        this.mLayoutState.f12867f = i4;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a4, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z5 = i4 == 1;
        c cVar = this.mLayoutState;
        int i6 = z5 ? max2 : max;
        cVar.f12869h = i6;
        if (!z5) {
            max = max2;
        }
        cVar.f12870i = max;
        if (z5) {
            cVar.f12869h = i6 + this.mOrientationHelper.j();
            View p4 = p();
            c cVar2 = this.mLayoutState;
            cVar2.f12866e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(p4);
            c cVar3 = this.mLayoutState;
            cVar2.f12865d = position + cVar3.f12866e;
            cVar3.f12863b = this.mOrientationHelper.d(p4);
            n4 = this.mOrientationHelper.d(p4) - this.mOrientationHelper.i();
        } else {
            View q4 = q();
            this.mLayoutState.f12869h += this.mOrientationHelper.n();
            c cVar4 = this.mLayoutState;
            cVar4.f12866e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(q4);
            c cVar5 = this.mLayoutState;
            cVar4.f12865d = position2 + cVar5.f12866e;
            cVar5.f12863b = this.mOrientationHelper.g(q4);
            n4 = (-this.mOrientationHelper.g(q4)) + this.mOrientationHelper.n();
        }
        c cVar6 = this.mLayoutState;
        cVar6.f12864c = i5;
        if (z4) {
            cVar6.f12864c = i5 - n4;
        }
        cVar6.f12868g = n4;
    }

    private void B(int i4, int i5) {
        this.mLayoutState.f12864c = this.mOrientationHelper.i() - i5;
        c cVar = this.mLayoutState;
        cVar.f12866e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f12865d = i4;
        cVar.f12867f = 1;
        cVar.f12863b = i5;
        cVar.f12868g = Integer.MIN_VALUE;
    }

    private void C(a aVar) {
        B(aVar.f12854b, aVar.f12855c);
    }

    private void D(int i4, int i5) {
        this.mLayoutState.f12864c = i5 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f12865d = i4;
        cVar.f12866e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f12867f = -1;
        cVar.f12863b = i5;
        cVar.f12868g = Integer.MIN_VALUE;
    }

    private void E(a aVar) {
        D(aVar.f12854b, aVar.f12855c);
    }

    private int g(RecyclerView.A a4) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s.a(a4, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int h(RecyclerView.A a4) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s.b(a4, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int i(RecyclerView.A a4) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s.c(a4, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View j() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View k() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View l() {
        return this.mShouldReverseLayout ? j() : k();
    }

    private View m() {
        return this.mShouldReverseLayout ? k() : j();
    }

    private int n(int i4, RecyclerView.w wVar, RecyclerView.A a4, boolean z4) {
        int i5;
        int i6 = this.mOrientationHelper.i() - i4;
        if (i6 <= 0) {
            return 0;
        }
        int i7 = -scrollBy(-i6, wVar, a4);
        int i8 = i4 + i7;
        if (!z4 || (i5 = this.mOrientationHelper.i() - i8) <= 0) {
            return i7;
        }
        this.mOrientationHelper.s(i5);
        return i5 + i7;
    }

    private int o(int i4, RecyclerView.w wVar, RecyclerView.A a4, boolean z4) {
        int n4;
        int n5 = i4 - this.mOrientationHelper.n();
        if (n5 <= 0) {
            return 0;
        }
        int i5 = -scrollBy(n5, wVar, a4);
        int i6 = i4 + i5;
        if (!z4 || (n4 = i6 - this.mOrientationHelper.n()) <= 0) {
            return i5;
        }
        this.mOrientationHelper.s(-n4);
        return i5 - n4;
    }

    private View p() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View q() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void r(RecyclerView.w wVar, RecyclerView.A a4, int i4, int i5) {
        if (!a4.g() || getChildCount() == 0 || a4.e() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List k4 = wVar.k();
        int size = k4.size();
        int position = getPosition(getChildAt(0));
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView.E e4 = (RecyclerView.E) k4.get(i8);
            if (!e4.isRemoved()) {
                if ((e4.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    i6 += this.mOrientationHelper.e(e4.itemView);
                } else {
                    i7 += this.mOrientationHelper.e(e4.itemView);
                }
            }
        }
        this.mLayoutState.f12873l = k4;
        if (i6 > 0) {
            D(getPosition(q()), i4);
            c cVar = this.mLayoutState;
            cVar.f12869h = i6;
            cVar.f12864c = 0;
            cVar.a();
            fill(wVar, this.mLayoutState, a4, false);
        }
        if (i7 > 0) {
            B(getPosition(p()), i5);
            c cVar2 = this.mLayoutState;
            cVar2.f12869h = i7;
            cVar2.f12864c = 0;
            cVar2.a();
            fill(wVar, this.mLayoutState, a4, false);
        }
        this.mLayoutState.f12873l = null;
    }

    private void s(RecyclerView.w wVar, c cVar) {
        if (!cVar.f12862a || cVar.f12874m) {
            return;
        }
        int i4 = cVar.f12868g;
        int i5 = cVar.f12870i;
        if (cVar.f12867f == -1) {
            u(wVar, i4, i5);
        } else {
            v(wVar, i4, i5);
        }
    }

    private void t(RecyclerView.w wVar, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 <= i4) {
            while (i4 > i5) {
                removeAndRecycleViewAt(i4, wVar);
                i4--;
            }
        } else {
            for (int i6 = i5 - 1; i6 >= i4; i6--) {
                removeAndRecycleViewAt(i6, wVar);
            }
        }
    }

    private void u(RecyclerView.w wVar, int i4, int i5) {
        int childCount = getChildCount();
        if (i4 < 0) {
            return;
        }
        int h4 = (this.mOrientationHelper.h() - i4) + i5;
        if (this.mShouldReverseLayout) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (this.mOrientationHelper.g(childAt) < h4 || this.mOrientationHelper.r(childAt) < h4) {
                    t(wVar, 0, i6);
                    return;
                }
            }
            return;
        }
        int i7 = childCount - 1;
        for (int i8 = i7; i8 >= 0; i8--) {
            View childAt2 = getChildAt(i8);
            if (this.mOrientationHelper.g(childAt2) < h4 || this.mOrientationHelper.r(childAt2) < h4) {
                t(wVar, i7, i8);
                return;
            }
        }
    }

    private void v(RecyclerView.w wVar, int i4, int i5) {
        if (i4 < 0) {
            return;
        }
        int i6 = i4 - i5;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (this.mOrientationHelper.d(childAt) > i6 || this.mOrientationHelper.q(childAt) > i6) {
                    t(wVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            if (this.mOrientationHelper.d(childAt2) > i6 || this.mOrientationHelper.q(childAt2) > i6) {
                t(wVar, i8, i9);
                return;
            }
        }
    }

    private void w() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean x(RecyclerView.w wVar, RecyclerView.A a4, a aVar) {
        View findReferenceChild;
        boolean z4 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, a4)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z5 = this.mLastStackFromEnd;
        boolean z6 = this.mStackFromEnd;
        if (z5 != z6 || (findReferenceChild = findReferenceChild(wVar, a4, aVar.f12856d, z6)) == null) {
            return false;
        }
        aVar.b(findReferenceChild, getPosition(findReferenceChild));
        if (!a4.e() && supportsPredictiveItemAnimations()) {
            int g4 = this.mOrientationHelper.g(findReferenceChild);
            int d4 = this.mOrientationHelper.d(findReferenceChild);
            int n4 = this.mOrientationHelper.n();
            int i4 = this.mOrientationHelper.i();
            boolean z7 = d4 <= n4 && g4 < n4;
            if (g4 >= i4 && d4 > i4) {
                z4 = true;
            }
            if (z7 || z4) {
                if (aVar.f12856d) {
                    n4 = i4;
                }
                aVar.f12855c = n4;
            }
        }
        return true;
    }

    private boolean y(RecyclerView.A a4, a aVar) {
        int i4;
        if (!a4.e() && (i4 = this.mPendingScrollPosition) != -1) {
            if (i4 >= 0 && i4 < a4.b()) {
                aVar.f12854b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.c()) {
                    boolean z4 = this.mPendingSavedState.f12852d;
                    aVar.f12856d = z4;
                    if (z4) {
                        aVar.f12855c = this.mOrientationHelper.i() - this.mPendingSavedState.f12851c;
                    } else {
                        aVar.f12855c = this.mOrientationHelper.n() + this.mPendingSavedState.f12851c;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z5 = this.mShouldReverseLayout;
                    aVar.f12856d = z5;
                    if (z5) {
                        aVar.f12855c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f12855c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (findViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f12856d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                } else {
                    if (this.mOrientationHelper.e(findViewByPosition) > this.mOrientationHelper.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n() < 0) {
                        aVar.f12855c = this.mOrientationHelper.n();
                        aVar.f12856d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition) < 0) {
                        aVar.f12855c = this.mOrientationHelper.i();
                        aVar.f12856d = true;
                        return true;
                    }
                    aVar.f12855c = aVar.f12856d ? this.mOrientationHelper.d(findViewByPosition) + this.mOrientationHelper.p() : this.mOrientationHelper.g(findViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void z(RecyclerView.w wVar, RecyclerView.A a4, a aVar) {
        if (y(a4, aVar) || x(wVar, a4, aVar)) {
            return;
        }
        aVar.a();
        aVar.f12854b = this.mStackFromEnd ? a4.b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(RecyclerView.A a4, int[] iArr) {
        int i4;
        int extraLayoutSpace = getExtraLayoutSpace(a4);
        if (this.mLayoutState.f12867f == -1) {
            i4 = 0;
        } else {
            i4 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i4, int i5, RecyclerView.A a4, RecyclerView.p.c cVar) {
        if (this.mOrientation != 0) {
            i4 = i5;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        ensureLayoutState();
        A(i4 > 0 ? 1 : -1, Math.abs(i4), true, a4);
        collectPrefetchPositionsForLayoutState(a4, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectInitialPrefetchPositions(int i4, RecyclerView.p.c cVar) {
        boolean z4;
        int i5;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.c()) {
            w();
            z4 = this.mShouldReverseLayout;
            i5 = this.mPendingScrollPosition;
            if (i5 == -1) {
                i5 = z4 ? i4 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z4 = savedState2.f12852d;
            i5 = savedState2.f12850b;
        }
        int i6 = z4 ? -1 : 1;
        for (int i7 = 0; i7 < this.mInitialPrefetchItemCount && i5 >= 0 && i5 < i4; i7++) {
            cVar.a(i5, 0);
            i5 += i6;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.A a4, c cVar, RecyclerView.p.c cVar2) {
        int i4 = cVar.f12865d;
        if (i4 < 0 || i4 >= a4.b()) {
            return;
        }
        cVar2.a(i4, Math.max(0, cVar.f12868g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.A a4) {
        return g(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.A a4) {
        return h(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.A a4) {
        return i(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i4) {
        if (getChildCount() == 0) {
            return null;
        }
        int i5 = (i4 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i5, 0.0f) : new PointF(0.0f, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.A a4) {
        return g(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.A a4) {
        return h(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.A a4) {
        return i(a4);
    }

    int convertFocusDirectionToLayoutDirection(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    c createLayoutState() {
        return new c();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.w wVar, c cVar, RecyclerView.A a4, boolean z4) {
        int i4 = cVar.f12864c;
        int i5 = cVar.f12868g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                cVar.f12868g = i5 + i4;
            }
            s(wVar, cVar);
        }
        int i6 = cVar.f12864c + cVar.f12869h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f12874m && i6 <= 0) || !cVar.c(a4)) {
                break;
            }
            bVar.a();
            layoutChunk(wVar, a4, cVar, bVar);
            if (!bVar.f12859b) {
                cVar.f12863b += bVar.f12858a * cVar.f12867f;
                if (!bVar.f12860c || cVar.f12873l != null || !a4.e()) {
                    int i7 = cVar.f12864c;
                    int i8 = bVar.f12858a;
                    cVar.f12864c = i7 - i8;
                    i6 -= i8;
                }
                int i9 = cVar.f12868g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + bVar.f12858a;
                    cVar.f12868g = i10;
                    int i11 = cVar.f12864c;
                    if (i11 < 0) {
                        cVar.f12868g = i10 + i11;
                    }
                    s(wVar, cVar);
                }
                if (z4 && bVar.f12861d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - cVar.f12864c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z4, boolean z5) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z4, z5) : findOneVisibleChild(getChildCount() - 1, -1, z4, z5);
    }

    View findFirstVisibleChildClosestToStart(boolean z4, boolean z5) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z4, z5) : findOneVisibleChild(0, getChildCount(), z4, z5);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i4, int i5) {
        int i6;
        int i7;
        ensureLayoutState();
        if (i5 <= i4 && i5 >= i4) {
            return getChildAt(i4);
        }
        if (this.mOrientationHelper.g(getChildAt(i4)) < this.mOrientationHelper.n()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i4, i5, i6, i7) : this.mVerticalBoundCheck.a(i4, i5, i6, i7);
    }

    View findOneVisibleChild(int i4, int i5, boolean z4, boolean z5) {
        ensureLayoutState();
        int i6 = z4 ? 24579 : 320;
        int i7 = z5 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i4, i5, i6, i7) : this.mVerticalBoundCheck.a(i4, i5, i6, i7);
    }

    View findReferenceChild(RecyclerView.w wVar, RecyclerView.A a4, boolean z4, boolean z5) {
        int i4;
        int i5;
        int i6;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z5) {
            i5 = getChildCount() - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = childCount;
            i5 = 0;
            i6 = 1;
        }
        int b4 = a4.b();
        int n4 = this.mOrientationHelper.n();
        int i7 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i5 != i4) {
            View childAt = getChildAt(i5);
            int position = getPosition(childAt);
            int g4 = this.mOrientationHelper.g(childAt);
            int d4 = this.mOrientationHelper.d(childAt);
            if (position >= 0 && position < b4) {
                if (!((RecyclerView.q) childAt.getLayoutParams()).c()) {
                    boolean z6 = d4 <= n4 && g4 < n4;
                    boolean z7 = g4 >= i7 && d4 > i7;
                    if (!z6 && !z7) {
                        return childAt;
                    }
                    if (z4) {
                        if (!z7) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z6) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i5 += i6;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View findViewByPosition(int i4) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i4 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i4) {
                return childAt;
            }
        }
        return super.findViewByPosition(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.A a4) {
        if (a4.d()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.w wVar, RecyclerView.A a4, c cVar, b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int paddingLeft;
        int f4;
        int i8;
        int i9;
        View d4 = cVar.d(wVar);
        if (d4 == null) {
            bVar.f12859b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d4.getLayoutParams();
        if (cVar.f12873l == null) {
            if (this.mShouldReverseLayout == (cVar.f12867f == -1)) {
                addView(d4);
            } else {
                addView(d4, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f12867f == -1)) {
                addDisappearingView(d4);
            } else {
                addDisappearingView(d4, 0);
            }
        }
        measureChildWithMargins(d4, 0, 0);
        bVar.f12858a = this.mOrientationHelper.e(d4);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                f4 = getWidth() - getPaddingRight();
                paddingLeft = f4 - this.mOrientationHelper.f(d4);
            } else {
                paddingLeft = getPaddingLeft();
                f4 = this.mOrientationHelper.f(d4) + paddingLeft;
            }
            if (cVar.f12867f == -1) {
                i9 = cVar.f12863b;
                i8 = i9 - bVar.f12858a;
            } else {
                i8 = cVar.f12863b;
                i9 = bVar.f12858a + i8;
            }
            int i10 = paddingLeft;
            i7 = i8;
            i6 = i10;
            i5 = i9;
            i4 = f4;
        } else {
            int paddingTop = getPaddingTop();
            int f5 = this.mOrientationHelper.f(d4) + paddingTop;
            if (cVar.f12867f == -1) {
                int i11 = cVar.f12863b;
                i6 = i11 - bVar.f12858a;
                i4 = i11;
                i5 = f5;
            } else {
                int i12 = cVar.f12863b;
                i4 = bVar.f12858a + i12;
                i5 = f5;
                i6 = i12;
            }
            i7 = paddingTop;
        }
        layoutDecoratedWithMargins(d4, i6, i7, i4, i5);
        if (qVar.c() || qVar.b()) {
            bVar.f12860c = true;
        }
        bVar.f12861d = d4.hasFocusable();
    }

    void onAnchorReady(RecyclerView.w wVar, RecyclerView.A a4, a aVar, int i4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        int convertFocusDirectionToLayoutDirection;
        w();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i4)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        A(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * 0.33333334f), false, a4);
        c cVar = this.mLayoutState;
        cVar.f12868g = Integer.MIN_VALUE;
        cVar.f12862a = false;
        fill(wVar, cVar, a4, true);
        View m4 = convertFocusDirectionToLayoutDirection == -1 ? m() : l();
        View q4 = convertFocusDirectionToLayoutDirection == -1 ? q() : p();
        if (!q4.hasFocusable()) {
            return m4;
        }
        if (m4 == null) {
            return null;
        }
        return q4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.A a4) {
        int i4;
        int i5;
        int i6;
        int i7;
        int n4;
        int i8;
        View findViewByPosition;
        int g4;
        int i9;
        int i10 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && a4.b() == 0) {
            removeAndRecycleAllViews(wVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.c()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f12850b;
        }
        ensureLayoutState();
        this.mLayoutState.f12862a = false;
        w();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f12857e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f12856d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            z(wVar, a4, aVar2);
            this.mAnchorInfo.f12857e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f12867f = cVar.f12872k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a4, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.n();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.j();
        if (a4.e() && (i8 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i8)) != null) {
            if (this.mShouldReverseLayout) {
                i9 = this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition);
                g4 = this.mPendingScrollPositionOffset;
            } else {
                g4 = this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n();
                i9 = this.mPendingScrollPositionOffset;
            }
            int i11 = i9 - g4;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f12856d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i10 = 1;
        }
        onAnchorReady(wVar, a4, aVar3, i10);
        detachAndScrapAttachedViews(wVar);
        this.mLayoutState.f12874m = resolveIsInfinite();
        this.mLayoutState.f12871j = a4.e();
        this.mLayoutState.f12870i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f12856d) {
            E(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f12869h = max;
            fill(wVar, cVar2, a4, false);
            c cVar3 = this.mLayoutState;
            i5 = cVar3.f12863b;
            int i12 = cVar3.f12865d;
            int i13 = cVar3.f12864c;
            if (i13 > 0) {
                max2 += i13;
            }
            C(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f12869h = max2;
            cVar4.f12865d += cVar4.f12866e;
            fill(wVar, cVar4, a4, false);
            c cVar5 = this.mLayoutState;
            i4 = cVar5.f12863b;
            int i14 = cVar5.f12864c;
            if (i14 > 0) {
                D(i12, i5);
                c cVar6 = this.mLayoutState;
                cVar6.f12869h = i14;
                fill(wVar, cVar6, a4, false);
                i5 = this.mLayoutState.f12863b;
            }
        } else {
            C(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f12869h = max2;
            fill(wVar, cVar7, a4, false);
            c cVar8 = this.mLayoutState;
            i4 = cVar8.f12863b;
            int i15 = cVar8.f12865d;
            int i16 = cVar8.f12864c;
            if (i16 > 0) {
                max += i16;
            }
            E(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f12869h = max;
            cVar9.f12865d += cVar9.f12866e;
            fill(wVar, cVar9, a4, false);
            c cVar10 = this.mLayoutState;
            i5 = cVar10.f12863b;
            int i17 = cVar10.f12864c;
            if (i17 > 0) {
                B(i15, i4);
                c cVar11 = this.mLayoutState;
                cVar11.f12869h = i17;
                fill(wVar, cVar11, a4, false);
                i4 = this.mLayoutState.f12863b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int n5 = n(i4, wVar, a4, true);
                i6 = i5 + n5;
                i7 = i4 + n5;
                n4 = o(i6, wVar, a4, false);
            } else {
                int o4 = o(i5, wVar, a4, true);
                i6 = i5 + o4;
                i7 = i4 + o4;
                n4 = n(i7, wVar, a4, false);
            }
            i5 = i6 + n4;
            i4 = i7 + n4;
        }
        r(wVar, a4, i5, i4);
        if (a4.e()) {
            this.mAnchorInfo.e();
        } else {
            this.mOrientationHelper.t();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.A a4) {
        super.onLayoutCompleted(a4);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.d();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.d();
            return savedState;
        }
        ensureLayoutState();
        boolean z4 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState.f12852d = z4;
        if (z4) {
            View p4 = p();
            savedState.f12851c = this.mOrientationHelper.i() - this.mOrientationHelper.d(p4);
            savedState.f12850b = getPosition(p4);
            return savedState;
        }
        View q4 = q();
        savedState.f12850b = getPosition(q4);
        savedState.f12851c = this.mOrientationHelper.g(q4) - this.mOrientationHelper.n();
        return savedState;
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    int scrollBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f12862a = true;
        int i5 = i4 > 0 ? 1 : -1;
        int abs = Math.abs(i4);
        A(i5, abs, true, a4);
        c cVar = this.mLayoutState;
        int fill = cVar.f12868g + fill(wVar, cVar, a4, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i4 = i5 * fill;
        }
        this.mOrientationHelper.s(-i4);
        this.mLayoutState.f12872k = i4;
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i4, wVar, a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i4) {
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.d();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i4, wVar, a4);
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i4);
        }
        assertNotInLayoutOrScroll(null);
        if (i4 != this.mOrientation || this.mOrientationHelper == null) {
            p b4 = p.b(this, i4);
            this.mOrientationHelper = b4;
            this.mAnchorInfo.f12853a = b4;
            this.mOrientation = i4;
            requestLayout();
        }
    }

    public void setReverseLayout(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (z4 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z4;
        requestLayout();
    }

    public void setStackFromEnd(boolean z4) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z4) {
            return;
        }
        this.mStackFromEnd = z4;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a4, int i4) {
        l lVar = new l(recyclerView.getContext());
        lVar.setTargetPosition(i4);
        startSmoothScroll(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public LinearLayoutManager(Context context, int i4, boolean z4) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i4);
        setReverseLayout(z4);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i4, i5);
        setOrientation(properties.f12923a);
        setReverseLayout(properties.f12925c);
        setStackFromEnd(properties.f12926d);
    }
}
