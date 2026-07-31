package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    private int mFullSizeSpec;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private final k mLayoutState;
    private int mOrientation;
    private SavedState mPendingSavedState;
    private int[] mPrefetchDistances;
    p mPrimaryOrientation;
    private BitSet mRemainingSpans;
    p mSecondaryOrientation;
    private int mSizePerSpan;
    d[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final b mAnchorInfo = new b();
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new a();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f12957b;

        /* renamed from: c, reason: collision with root package name */
        int f12958c;

        /* renamed from: d, reason: collision with root package name */
        int f12959d;

        /* renamed from: e, reason: collision with root package name */
        int[] f12960e;

        /* renamed from: f, reason: collision with root package name */
        int f12961f;

        /* renamed from: g, reason: collision with root package name */
        int[] f12962g;

        /* renamed from: h, reason: collision with root package name */
        List f12963h;

        /* renamed from: i, reason: collision with root package name */
        boolean f12964i;

        /* renamed from: j, reason: collision with root package name */
        boolean f12965j;

        /* renamed from: k, reason: collision with root package name */
        boolean f12966k;

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

        void c() {
            this.f12960e = null;
            this.f12959d = 0;
            this.f12957b = -1;
            this.f12958c = -1;
        }

        void d() {
            this.f12960e = null;
            this.f12959d = 0;
            this.f12961f = 0;
            this.f12962g = null;
            this.f12963h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f12957b);
            parcel.writeInt(this.f12958c);
            parcel.writeInt(this.f12959d);
            if (this.f12959d > 0) {
                parcel.writeIntArray(this.f12960e);
            }
            parcel.writeInt(this.f12961f);
            if (this.f12961f > 0) {
                parcel.writeIntArray(this.f12962g);
            }
            parcel.writeInt(this.f12964i ? 1 : 0);
            parcel.writeInt(this.f12965j ? 1 : 0);
            parcel.writeInt(this.f12966k ? 1 : 0);
            parcel.writeList(this.f12963h);
        }

        SavedState(Parcel parcel) {
            this.f12957b = parcel.readInt();
            this.f12958c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f12959d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f12960e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f12961f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f12962g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f12964i = parcel.readInt() == 1;
            this.f12965j = parcel.readInt() == 1;
            this.f12966k = parcel.readInt() == 1;
            this.f12963h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f12959d = savedState.f12959d;
            this.f12957b = savedState.f12957b;
            this.f12958c = savedState.f12958c;
            this.f12960e = savedState.f12960e;
            this.f12961f = savedState.f12961f;
            this.f12962g = savedState.f12962g;
            this.f12964i = savedState.f12964i;
            this.f12965j = savedState.f12965j;
            this.f12966k = savedState.f12966k;
            this.f12963h = savedState.f12963h;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f12968a;

        /* renamed from: b, reason: collision with root package name */
        int f12969b;

        /* renamed from: c, reason: collision with root package name */
        boolean f12970c;

        /* renamed from: d, reason: collision with root package name */
        boolean f12971d;

        /* renamed from: e, reason: collision with root package name */
        boolean f12972e;

        /* renamed from: f, reason: collision with root package name */
        int[] f12973f;

        b() {
            c();
        }

        void a() {
            this.f12969b = this.f12970c ? StaggeredGridLayoutManager.this.mPrimaryOrientation.i() : StaggeredGridLayoutManager.this.mPrimaryOrientation.n();
        }

        void b(int i4) {
            if (this.f12970c) {
                this.f12969b = StaggeredGridLayoutManager.this.mPrimaryOrientation.i() - i4;
            } else {
                this.f12969b = StaggeredGridLayoutManager.this.mPrimaryOrientation.n() + i4;
            }
        }

        void c() {
            this.f12968a = -1;
            this.f12969b = Integer.MIN_VALUE;
            this.f12970c = false;
            this.f12971d = false;
            this.f12972e = false;
            int[] iArr = this.f12973f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f12973f;
            if (iArr == null || iArr.length < length) {
                this.f12973f = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                this.f12973f[i4] = dVarArr[i4].u(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        d f12975e;

        /* renamed from: f, reason: collision with root package name */
        boolean f12976f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            d dVar = this.f12975e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f12981e;
        }

        public boolean f() {
            return this.f12976f;
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class d {

        /* renamed from: a, reason: collision with root package name */
        ArrayList f12977a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f12978b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f12979c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f12980d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f12981e;

        d(int i4) {
            this.f12981e = i4;
        }

        void A(int i4) {
            this.f12978b = i4;
            this.f12979c = i4;
        }

        void a(View view) {
            c s4 = s(view);
            s4.f12975e = this;
            this.f12977a.add(view);
            this.f12979c = Integer.MIN_VALUE;
            if (this.f12977a.size() == 1) {
                this.f12978b = Integer.MIN_VALUE;
            }
            if (s4.c() || s4.b()) {
                this.f12980d += StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            }
        }

        void b(boolean z4, int i4) {
            int q4 = z4 ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (q4 == Integer.MIN_VALUE) {
                return;
            }
            if (!z4 || q4 >= StaggeredGridLayoutManager.this.mPrimaryOrientation.i()) {
                if (z4 || q4 <= StaggeredGridLayoutManager.this.mPrimaryOrientation.n()) {
                    if (i4 != Integer.MIN_VALUE) {
                        q4 += i4;
                    }
                    this.f12979c = q4;
                    this.f12978b = q4;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f4;
            ArrayList arrayList = this.f12977a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c s4 = s(view);
            this.f12979c = StaggeredGridLayoutManager.this.mPrimaryOrientation.d(view);
            if (s4.f12976f && (f4 = StaggeredGridLayoutManager.this.mLazySpanLookup.f(s4.a())) != null && f4.f12954c == 1) {
                this.f12979c += f4.a(this.f12981e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f4;
            View view = (View) this.f12977a.get(0);
            c s4 = s(view);
            this.f12978b = StaggeredGridLayoutManager.this.mPrimaryOrientation.g(view);
            if (s4.f12976f && (f4 = StaggeredGridLayoutManager.this.mLazySpanLookup.f(s4.a())) != null && f4.f12954c == -1) {
                this.f12978b -= f4.a(this.f12981e);
            }
        }

        void e() {
            this.f12977a.clear();
            v();
            this.f12980d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? n(this.f12977a.size() - 1, -1, true) : n(0, this.f12977a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? m(this.f12977a.size() - 1, -1, true) : m(0, this.f12977a.size(), true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? n(this.f12977a.size() - 1, -1, false) : n(0, this.f12977a.size(), false);
        }

        public int i() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? n(0, this.f12977a.size(), true) : n(this.f12977a.size() - 1, -1, true);
        }

        public int j() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? m(0, this.f12977a.size(), true) : m(this.f12977a.size() - 1, -1, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? n(0, this.f12977a.size(), false) : n(this.f12977a.size() - 1, -1, false);
        }

        int l(int i4, int i5, boolean z4, boolean z5, boolean z6) {
            int n4 = StaggeredGridLayoutManager.this.mPrimaryOrientation.n();
            int i6 = StaggeredGridLayoutManager.this.mPrimaryOrientation.i();
            int i7 = i5 > i4 ? 1 : -1;
            while (i4 != i5) {
                View view = (View) this.f12977a.get(i4);
                int g4 = StaggeredGridLayoutManager.this.mPrimaryOrientation.g(view);
                int d4 = StaggeredGridLayoutManager.this.mPrimaryOrientation.d(view);
                boolean z7 = false;
                boolean z8 = !z6 ? g4 >= i6 : g4 > i6;
                if (!z6 ? d4 > n4 : d4 >= n4) {
                    z7 = true;
                }
                if (z8 && z7) {
                    if (z4 && z5) {
                        if (g4 >= n4 && d4 <= i6) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z5) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (g4 < n4 || d4 > i6) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i4 += i7;
            }
            return -1;
        }

        int m(int i4, int i5, boolean z4) {
            return l(i4, i5, false, false, z4);
        }

        int n(int i4, int i5, boolean z4) {
            return l(i4, i5, z4, true, false);
        }

        public int o() {
            return this.f12980d;
        }

        int p() {
            int i4 = this.f12979c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            c();
            return this.f12979c;
        }

        int q(int i4) {
            int i5 = this.f12979c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f12977a.size() == 0) {
                return i4;
            }
            c();
            return this.f12979c;
        }

        public View r(int i4, int i5) {
            View view = null;
            if (i5 != -1) {
                int size = this.f12977a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f12977a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) >= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.mReverseLayout && staggeredGridLayoutManager2.getPosition(view2) <= i4) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f12977a.size();
            int i6 = 0;
            while (i6 < size2) {
                View view3 = (View) this.f12977a.get(i6);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.mReverseLayout && staggeredGridLayoutManager3.getPosition(view3) <= i4) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.mReverseLayout && staggeredGridLayoutManager4.getPosition(view3) >= i4) || !view3.hasFocusable()) {
                    break;
                }
                i6++;
                view = view3;
            }
            return view;
        }

        c s(View view) {
            return (c) view.getLayoutParams();
        }

        int t() {
            int i4 = this.f12978b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            d();
            return this.f12978b;
        }

        int u(int i4) {
            int i5 = this.f12978b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f12977a.size() == 0) {
                return i4;
            }
            d();
            return this.f12978b;
        }

        void v() {
            this.f12978b = Integer.MIN_VALUE;
            this.f12979c = Integer.MIN_VALUE;
        }

        void w(int i4) {
            int i5 = this.f12978b;
            if (i5 != Integer.MIN_VALUE) {
                this.f12978b = i5 + i4;
            }
            int i6 = this.f12979c;
            if (i6 != Integer.MIN_VALUE) {
                this.f12979c = i6 + i4;
            }
        }

        void x() {
            int size = this.f12977a.size();
            View view = (View) this.f12977a.remove(size - 1);
            c s4 = s(view);
            s4.f12975e = null;
            if (s4.c() || s4.b()) {
                this.f12980d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            }
            if (size == 1) {
                this.f12978b = Integer.MIN_VALUE;
            }
            this.f12979c = Integer.MIN_VALUE;
        }

        void y() {
            View view = (View) this.f12977a.remove(0);
            c s4 = s(view);
            s4.f12975e = null;
            if (this.f12977a.size() == 0) {
                this.f12979c = Integer.MIN_VALUE;
            }
            if (s4.c() || s4.b()) {
                this.f12980d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            }
            this.f12978b = Integer.MIN_VALUE;
        }

        void z(View view) {
            c s4 = s(view);
            s4.f12975e = this;
            this.f12977a.add(0, view);
            this.f12978b = Integer.MIN_VALUE;
            if (this.f12977a.size() == 1) {
                this.f12979c = Integer.MIN_VALUE;
            }
            if (s4.c() || s4.b()) {
                this.f12980d += StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i4, i5);
        setOrientation(properties.f12923a);
        setSpanCount(properties.f12924b);
        setReverseLayout(properties.f12925c);
        this.mLayoutState = new k();
        q();
    }

    private d A(k kVar) {
        int i4;
        int i5;
        int i6;
        if (F(kVar.f13164e)) {
            i5 = this.mSpanCount - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = this.mSpanCount;
            i5 = 0;
            i6 = 1;
        }
        d dVar = null;
        if (kVar.f13164e == 1) {
            int n4 = this.mPrimaryOrientation.n();
            int i7 = Integer.MAX_VALUE;
            while (i5 != i4) {
                d dVar2 = this.mSpans[i5];
                int q4 = dVar2.q(n4);
                if (q4 < i7) {
                    dVar = dVar2;
                    i7 = q4;
                }
                i5 += i6;
            }
            return dVar;
        }
        int i8 = this.mPrimaryOrientation.i();
        int i9 = Integer.MIN_VALUE;
        while (i5 != i4) {
            d dVar3 = this.mSpans[i5];
            int u4 = dVar3.u(i8);
            if (u4 > i9) {
                dVar = dVar3;
                i9 = u4;
            }
            i5 += i6;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void B(int i4, int i5, int i6) {
        int i7;
        int i8;
        int lastChildPosition = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
        if (i6 != 8) {
            i7 = i4 + i5;
        } else {
            if (i4 >= i5) {
                i7 = i4 + 1;
                i8 = i5;
                this.mLazySpanLookup.h(i8);
                if (i6 != 1) {
                    this.mLazySpanLookup.j(i4, i5);
                } else if (i6 == 2) {
                    this.mLazySpanLookup.k(i4, i5);
                } else if (i6 == 8) {
                    this.mLazySpanLookup.k(i4, 1);
                    this.mLazySpanLookup.j(i5, 1);
                }
                if (i7 > lastChildPosition) {
                    return;
                }
                if (i8 <= (this.mShouldReverseLayout ? getFirstChildPosition() : getLastChildPosition())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i7 = i5 + 1;
        }
        i8 = i4;
        this.mLazySpanLookup.h(i8);
        if (i6 != 1) {
        }
        if (i7 > lastChildPosition) {
        }
    }

    private void C(View view, int i4, int i5, boolean z4) {
        calculateItemDecorationsForChild(view, this.mTmpRect);
        c cVar = (c) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.mTmpRect;
        int R3 = R(i4, i6 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i7 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.mTmpRect;
        int R4 = R(i5, i7 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z4 ? shouldReMeasureChild(view, R3, R4, cVar) : shouldMeasureChild(view, R3, R4, cVar)) {
            view.measure(R3, R4);
        }
    }

    private void D(View view, c cVar, boolean z4) {
        if (cVar.f12976f) {
            if (this.mOrientation == 1) {
                C(view, this.mFullSizeSpec, RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z4);
                return;
            } else {
                C(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.mFullSizeSpec, z4);
                return;
            }
        }
        if (this.mOrientation == 1) {
            C(view, RecyclerView.p.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z4);
        } else {
            C(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (checkForGaps() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void E(RecyclerView.w wVar, RecyclerView.A a4, boolean z4) {
        SavedState savedState;
        b bVar = this.mAnchorInfo;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && a4.b() == 0) {
            removeAndRecycleAllViews(wVar);
            bVar.c();
            return;
        }
        boolean z5 = true;
        boolean z6 = (bVar.f12972e && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) ? false : true;
        if (z6) {
            bVar.c();
            if (this.mPendingSavedState != null) {
                h(bVar);
            } else {
                L();
                bVar.f12970c = this.mShouldReverseLayout;
            }
            updateAnchorInfoForLayout(a4, bVar);
            bVar.f12972e = true;
        }
        if (this.mPendingSavedState == null && this.mPendingScrollPosition == -1 && (bVar.f12970c != this.mLastLayoutFromEnd || isLayoutRTL() != this.mLastLayoutRTL)) {
            this.mLazySpanLookup.b();
            bVar.f12971d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.mPendingSavedState) == null || savedState.f12959d < 1)) {
            if (bVar.f12971d) {
                for (int i4 = 0; i4 < this.mSpanCount; i4++) {
                    this.mSpans[i4].e();
                    int i5 = bVar.f12969b;
                    if (i5 != Integer.MIN_VALUE) {
                        this.mSpans[i4].A(i5);
                    }
                }
            } else if (z6 || this.mAnchorInfo.f12973f == null) {
                for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                    this.mSpans[i6].b(this.mShouldReverseLayout, bVar.f12969b);
                }
                this.mAnchorInfo.d(this.mSpans);
            } else {
                for (int i7 = 0; i7 < this.mSpanCount; i7++) {
                    d dVar = this.mSpans[i7];
                    dVar.e();
                    dVar.A(this.mAnchorInfo.f12973f[i7]);
                }
            }
        }
        detachAndScrapAttachedViews(wVar);
        this.mLayoutState.f13160a = false;
        this.mLaidOutInvalidFullSpan = false;
        updateMeasureSpecs(this.mSecondaryOrientation.o());
        P(bVar.f12968a, a4);
        if (bVar.f12970c) {
            M(-1);
            r(wVar, this.mLayoutState, a4);
            M(1);
            k kVar = this.mLayoutState;
            kVar.f13162c = bVar.f12968a + kVar.f13163d;
            r(wVar, kVar, a4);
        } else {
            M(1);
            r(wVar, this.mLayoutState, a4);
            M(-1);
            k kVar2 = this.mLayoutState;
            kVar2.f13162c = bVar.f12968a + kVar2.f13163d;
            r(wVar, kVar2, a4);
        }
        K();
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout) {
                u(wVar, a4, true);
                v(wVar, a4, false);
            } else {
                v(wVar, a4, true);
                u(wVar, a4, false);
            }
        }
        if (z4 && !a4.e() && this.mGapStrategy != 0 && getChildCount() > 0 && (this.mLaidOutInvalidFullSpan || hasGapsToFix() != null)) {
            removeCallbacks(this.mCheckForGapsRunnable);
        }
        z5 = false;
        if (a4.e()) {
            this.mAnchorInfo.c();
        }
        this.mLastLayoutFromEnd = bVar.f12970c;
        this.mLastLayoutRTL = isLayoutRTL();
        if (z5) {
            this.mAnchorInfo.c();
            E(wVar, a4, false);
        }
    }

    private boolean F(int i4) {
        if (this.mOrientation == 0) {
            return (i4 == -1) != this.mShouldReverseLayout;
        }
        return ((i4 == -1) == this.mShouldReverseLayout) == isLayoutRTL();
    }

    private void G(View view) {
        for (int i4 = this.mSpanCount - 1; i4 >= 0; i4--) {
            this.mSpans[i4].z(view);
        }
    }

    private void H(RecyclerView.w wVar, k kVar) {
        if (!kVar.f13160a || kVar.f13168i) {
            return;
        }
        if (kVar.f13161b == 0) {
            if (kVar.f13164e == -1) {
                I(wVar, kVar.f13166g);
                return;
            } else {
                J(wVar, kVar.f13165f);
                return;
            }
        }
        if (kVar.f13164e != -1) {
            int y4 = y(kVar.f13166g) - kVar.f13166g;
            J(wVar, y4 < 0 ? kVar.f13165f : Math.min(y4, kVar.f13161b) + kVar.f13165f);
        } else {
            int i4 = kVar.f13165f;
            int x4 = i4 - x(i4);
            I(wVar, x4 < 0 ? kVar.f13166g : kVar.f13166g - Math.min(x4, kVar.f13161b));
        }
    }

    private void I(RecyclerView.w wVar, int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.g(childAt) < i4 || this.mPrimaryOrientation.r(childAt) < i4) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f12976f) {
                for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                    if (this.mSpans[i5].f12977a.size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                    this.mSpans[i6].x();
                }
            } else if (cVar.f12975e.f12977a.size() == 1) {
                return;
            } else {
                cVar.f12975e.x();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    private void J(RecyclerView.w wVar, int i4) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.d(childAt) > i4 || this.mPrimaryOrientation.q(childAt) > i4) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f12976f) {
                for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                    if (this.mSpans[i5].f12977a.size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                    this.mSpans[i6].y();
                }
            } else if (cVar.f12975e.f12977a.size() == 1) {
                return;
            } else {
                cVar.f12975e.y();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    private void K() {
        if (this.mSecondaryOrientation.l() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            float e4 = this.mSecondaryOrientation.e(childAt);
            if (e4 >= f4) {
                if (((c) childAt.getLayoutParams()).f()) {
                    e4 = (e4 * 1.0f) / this.mSpanCount;
                }
                f4 = Math.max(f4, e4);
            }
        }
        int i5 = this.mSizePerSpan;
        int round = Math.round(f4 * this.mSpanCount);
        if (this.mSecondaryOrientation.l() == Integer.MIN_VALUE) {
            round = Math.min(round, this.mSecondaryOrientation.o());
        }
        updateMeasureSpecs(round);
        if (this.mSizePerSpan == i5) {
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f12976f) {
                if (isLayoutRTL() && this.mOrientation == 1) {
                    int i7 = this.mSpanCount;
                    int i8 = cVar.f12975e.f12981e;
                    childAt2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.mSizePerSpan) - ((-((i7 - 1) - i8)) * i5));
                } else {
                    int i9 = cVar.f12975e.f12981e;
                    int i10 = this.mSizePerSpan * i9;
                    int i11 = i9 * i5;
                    if (this.mOrientation == 1) {
                        childAt2.offsetLeftAndRight(i10 - i11);
                    } else {
                        childAt2.offsetTopAndBottom(i10 - i11);
                    }
                }
            }
        }
    }

    private void L() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private void M(int i4) {
        k kVar = this.mLayoutState;
        kVar.f13164e = i4;
        kVar.f13163d = this.mShouldReverseLayout != (i4 == -1) ? -1 : 1;
    }

    private void N(int i4, int i5) {
        for (int i6 = 0; i6 < this.mSpanCount; i6++) {
            if (!this.mSpans[i6].f12977a.isEmpty()) {
                Q(this.mSpans[i6], i4, i5);
            }
        }
    }

    private boolean O(RecyclerView.A a4, b bVar) {
        bVar.f12968a = this.mLastLayoutFromEnd ? t(a4.b()) : s(a4.b());
        bVar.f12969b = Integer.MIN_VALUE;
        return true;
    }

    private void P(int i4, RecyclerView.A a4) {
        int i5;
        int i6;
        int c4;
        k kVar = this.mLayoutState;
        boolean z4 = false;
        kVar.f13161b = 0;
        kVar.f13162c = i4;
        if (!isSmoothScrolling() || (c4 = a4.c()) == -1) {
            i5 = 0;
            i6 = 0;
        } else {
            if (this.mShouldReverseLayout == (c4 < i4)) {
                i5 = this.mPrimaryOrientation.o();
                i6 = 0;
            } else {
                i6 = this.mPrimaryOrientation.o();
                i5 = 0;
            }
        }
        if (getClipToPadding()) {
            this.mLayoutState.f13165f = this.mPrimaryOrientation.n() - i6;
            this.mLayoutState.f13166g = this.mPrimaryOrientation.i() + i5;
        } else {
            this.mLayoutState.f13166g = this.mPrimaryOrientation.h() + i5;
            this.mLayoutState.f13165f = -i6;
        }
        k kVar2 = this.mLayoutState;
        kVar2.f13167h = false;
        kVar2.f13160a = true;
        if (this.mPrimaryOrientation.l() == 0 && this.mPrimaryOrientation.h() == 0) {
            z4 = true;
        }
        kVar2.f13168i = z4;
    }

    private void Q(d dVar, int i4, int i5) {
        int o4 = dVar.o();
        if (i4 == -1) {
            if (dVar.t() + o4 <= i5) {
                this.mRemainingSpans.set(dVar.f12981e, false);
            }
        } else if (dVar.p() - o4 >= i5) {
            this.mRemainingSpans.set(dVar.f12981e, false);
        }
    }

    private int R(int i4, int i5, int i6) {
        int mode;
        return (!(i5 == 0 && i6 == 0) && ((mode = View.MeasureSpec.getMode(i4)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    private int convertFocusDirectionToLayoutDirection(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private void g(View view) {
        for (int i4 = this.mSpanCount - 1; i4 >= 0; i4--) {
            this.mSpans[i4].a(view);
        }
    }

    private void h(b bVar) {
        SavedState savedState = this.mPendingSavedState;
        int i4 = savedState.f12959d;
        if (i4 > 0) {
            if (i4 == this.mSpanCount) {
                for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                    this.mSpans[i5].e();
                    SavedState savedState2 = this.mPendingSavedState;
                    int i6 = savedState2.f12960e[i5];
                    if (i6 != Integer.MIN_VALUE) {
                        i6 += savedState2.f12965j ? this.mPrimaryOrientation.i() : this.mPrimaryOrientation.n();
                    }
                    this.mSpans[i5].A(i6);
                }
            } else {
                savedState.d();
                SavedState savedState3 = this.mPendingSavedState;
                savedState3.f12957b = savedState3.f12958c;
            }
        }
        SavedState savedState4 = this.mPendingSavedState;
        this.mLastLayoutRTL = savedState4.f12966k;
        setReverseLayout(savedState4.f12964i);
        L();
        SavedState savedState5 = this.mPendingSavedState;
        int i7 = savedState5.f12957b;
        if (i7 != -1) {
            this.mPendingScrollPosition = i7;
            bVar.f12970c = savedState5.f12965j;
        } else {
            bVar.f12970c = this.mShouldReverseLayout;
        }
        if (savedState5.f12961f > 1) {
            LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
            lazySpanLookup.f12951a = savedState5.f12962g;
            lazySpanLookup.f12952b = savedState5.f12963h;
        }
    }

    private void i(View view, c cVar, k kVar) {
        if (kVar.f13164e == 1) {
            if (cVar.f12976f) {
                g(view);
                return;
            } else {
                cVar.f12975e.a(view);
                return;
            }
        }
        if (cVar.f12976f) {
            G(view);
        } else {
            cVar.f12975e.z(view);
        }
    }

    private int j(int i4) {
        if (getChildCount() == 0) {
            return this.mShouldReverseLayout ? 1 : -1;
        }
        return (i4 < getFirstChildPosition()) != this.mShouldReverseLayout ? -1 : 1;
    }

    private boolean k(d dVar) {
        if (this.mShouldReverseLayout) {
            if (dVar.p() < this.mPrimaryOrientation.i()) {
                ArrayList arrayList = dVar.f12977a;
                return !dVar.s((View) arrayList.get(arrayList.size() - 1)).f12976f;
            }
        } else if (dVar.t() > this.mPrimaryOrientation.n()) {
            return !dVar.s((View) dVar.f12977a.get(0)).f12976f;
        }
        return false;
    }

    private int l(RecyclerView.A a4) {
        if (getChildCount() == 0) {
            return 0;
        }
        return s.a(a4, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int m(RecyclerView.A a4) {
        if (getChildCount() == 0) {
            return 0;
        }
        return s.b(a4, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int n(RecyclerView.A a4) {
        if (getChildCount() == 0) {
            return 0;
        }
        return s.c(a4, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private LazySpanLookup.FullSpanItem o(int i4) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f12955d = new int[this.mSpanCount];
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            fullSpanItem.f12955d[i5] = i4 - this.mSpans[i5].q(i4);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem p(int i4) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f12955d = new int[this.mSpanCount];
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            fullSpanItem.f12955d[i5] = this.mSpans[i5].u(i4) - i4;
        }
        return fullSpanItem;
    }

    private void q() {
        this.mPrimaryOrientation = p.b(this, this.mOrientation);
        this.mSecondaryOrientation = p.b(this, 1 - this.mOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int r(RecyclerView.w wVar, k kVar, RecyclerView.A a4) {
        d dVar;
        int z4;
        int e4;
        int n4;
        int e5;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r8 = 0;
        staggeredGridLayoutManager2.mRemainingSpans.set(0, staggeredGridLayoutManager2.mSpanCount, true);
        int i4 = staggeredGridLayoutManager2.mLayoutState.f13168i ? kVar.f13164e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : kVar.f13164e == 1 ? kVar.f13166g + kVar.f13161b : kVar.f13165f - kVar.f13161b;
        staggeredGridLayoutManager2.N(kVar.f13164e, i4);
        int i5 = staggeredGridLayoutManager2.mShouldReverseLayout ? staggeredGridLayoutManager2.mPrimaryOrientation.i() : staggeredGridLayoutManager2.mPrimaryOrientation.n();
        boolean z5 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (kVar.a(a4) && (staggeredGridLayoutManager3.mLayoutState.f13168i || !staggeredGridLayoutManager3.mRemainingSpans.isEmpty())) {
            View b4 = kVar.b(wVar);
            c cVar = (c) b4.getLayoutParams();
            int a5 = cVar.a();
            int g4 = staggeredGridLayoutManager3.mLazySpanLookup.g(a5);
            boolean z6 = g4 == -1 ? true : r8;
            if (z6) {
                dVar = cVar.f12976f ? staggeredGridLayoutManager3.mSpans[r8] : staggeredGridLayoutManager3.A(kVar);
                staggeredGridLayoutManager3.mLazySpanLookup.n(a5, dVar);
            } else {
                dVar = staggeredGridLayoutManager3.mSpans[g4];
            }
            d dVar2 = dVar;
            cVar.f12975e = dVar2;
            if (kVar.f13164e == 1) {
                staggeredGridLayoutManager3.addView(b4);
            } else {
                staggeredGridLayoutManager3.addView(b4, r8);
            }
            staggeredGridLayoutManager3.D(b4, cVar, r8);
            if (kVar.f13164e == 1) {
                e4 = cVar.f12976f ? staggeredGridLayoutManager3.w(i5) : dVar2.q(i5);
                z4 = staggeredGridLayoutManager3.mPrimaryOrientation.e(b4) + e4;
                if (z6 && cVar.f12976f) {
                    LazySpanLookup.FullSpanItem o4 = staggeredGridLayoutManager3.o(e4);
                    o4.f12954c = -1;
                    o4.f12953b = a5;
                    staggeredGridLayoutManager3.mLazySpanLookup.a(o4);
                }
            } else {
                z4 = cVar.f12976f ? staggeredGridLayoutManager3.z(i5) : dVar2.u(i5);
                e4 = z4 - staggeredGridLayoutManager3.mPrimaryOrientation.e(b4);
                if (z6 && cVar.f12976f) {
                    LazySpanLookup.FullSpanItem p4 = staggeredGridLayoutManager3.p(z4);
                    p4.f12954c = 1;
                    p4.f12953b = a5;
                    staggeredGridLayoutManager3.mLazySpanLookup.a(p4);
                }
            }
            if (cVar.f12976f && kVar.f13163d == -1) {
                if (z6) {
                    staggeredGridLayoutManager3.mLaidOutInvalidFullSpan = true;
                } else {
                    if (!(kVar.f13164e == 1 ? staggeredGridLayoutManager3.areAllEndsEqual() : staggeredGridLayoutManager3.areAllStartsEqual())) {
                        LazySpanLookup.FullSpanItem f4 = staggeredGridLayoutManager3.mLazySpanLookup.f(a5);
                        if (f4 != null) {
                            f4.f12956e = true;
                        }
                        staggeredGridLayoutManager3.mLaidOutInvalidFullSpan = true;
                    }
                }
            }
            staggeredGridLayoutManager3.i(b4, cVar, kVar);
            if (staggeredGridLayoutManager3.isLayoutRTL() && staggeredGridLayoutManager3.mOrientation == 1) {
                e5 = cVar.f12976f ? staggeredGridLayoutManager3.mSecondaryOrientation.i() : staggeredGridLayoutManager3.mSecondaryOrientation.i() - (((staggeredGridLayoutManager3.mSpanCount - 1) - dVar2.f12981e) * staggeredGridLayoutManager3.mSizePerSpan);
                n4 = e5 - staggeredGridLayoutManager3.mSecondaryOrientation.e(b4);
            } else {
                n4 = cVar.f12976f ? staggeredGridLayoutManager3.mSecondaryOrientation.n() : (dVar2.f12981e * staggeredGridLayoutManager3.mSizePerSpan) + staggeredGridLayoutManager3.mSecondaryOrientation.n();
                e5 = staggeredGridLayoutManager3.mSecondaryOrientation.e(b4) + n4;
            }
            int i6 = e5;
            int i7 = n4;
            if (staggeredGridLayoutManager3.mOrientation == 1) {
                staggeredGridLayoutManager3.layoutDecoratedWithMargins(b4, i7, e4, i6, z4);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.layoutDecoratedWithMargins(b4, e4, i7, z4, i6);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f12976f) {
                staggeredGridLayoutManager.N(staggeredGridLayoutManager.mLayoutState.f13164e, i4);
            } else {
                staggeredGridLayoutManager.Q(dVar2, staggeredGridLayoutManager.mLayoutState.f13164e, i4);
            }
            staggeredGridLayoutManager.H(wVar, staggeredGridLayoutManager.mLayoutState);
            if (staggeredGridLayoutManager.mLayoutState.f13167h && b4.hasFocusable()) {
                if (cVar.f12976f) {
                    staggeredGridLayoutManager.mRemainingSpans.clear();
                } else {
                    staggeredGridLayoutManager.mRemainingSpans.set(dVar2.f12981e, false);
                }
            }
            z5 = true;
            r8 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z5) {
            staggeredGridLayoutManager3.H(wVar, staggeredGridLayoutManager3.mLayoutState);
        }
        int n5 = staggeredGridLayoutManager3.mLayoutState.f13164e == -1 ? staggeredGridLayoutManager3.mPrimaryOrientation.n() - staggeredGridLayoutManager3.z(staggeredGridLayoutManager3.mPrimaryOrientation.n()) : staggeredGridLayoutManager3.w(staggeredGridLayoutManager3.mPrimaryOrientation.i()) - staggeredGridLayoutManager3.mPrimaryOrientation.i();
        if (n5 > 0) {
            return Math.min(kVar.f13161b, n5);
        }
        return 0;
    }

    private int s(int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            int position = getPosition(getChildAt(i5));
            if (position >= 0 && position < i4) {
                return position;
            }
        }
        return 0;
    }

    private int t(int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i4) {
                return position;
            }
        }
        return 0;
    }

    private void u(RecyclerView.w wVar, RecyclerView.A a4, boolean z4) {
        int i4;
        int w4 = w(Integer.MIN_VALUE);
        if (w4 != Integer.MIN_VALUE && (i4 = this.mPrimaryOrientation.i() - w4) > 0) {
            int i5 = i4 - (-scrollBy(-i4, wVar, a4));
            if (!z4 || i5 <= 0) {
                return;
            }
            this.mPrimaryOrientation.s(i5);
        }
    }

    private void v(RecyclerView.w wVar, RecyclerView.A a4, boolean z4) {
        int n4;
        int z5 = z(Integer.MAX_VALUE);
        if (z5 != Integer.MAX_VALUE && (n4 = z5 - this.mPrimaryOrientation.n()) > 0) {
            int scrollBy = n4 - scrollBy(n4, wVar, a4);
            if (!z4 || scrollBy <= 0) {
                return;
            }
            this.mPrimaryOrientation.s(-scrollBy);
        }
    }

    private int w(int i4) {
        int q4 = this.mSpans[0].q(i4);
        for (int i5 = 1; i5 < this.mSpanCount; i5++) {
            int q5 = this.mSpans[i5].q(i4);
            if (q5 > q4) {
                q4 = q5;
            }
        }
        return q4;
    }

    private int x(int i4) {
        int u4 = this.mSpans[0].u(i4);
        for (int i5 = 1; i5 < this.mSpanCount; i5++) {
            int u5 = this.mSpans[i5].u(i4);
            if (u5 > u4) {
                u4 = u5;
            }
        }
        return u4;
    }

    private int y(int i4) {
        int q4 = this.mSpans[0].q(i4);
        for (int i5 = 1; i5 < this.mSpanCount; i5++) {
            int q5 = this.mSpans[i5].q(i4);
            if (q5 < q4) {
                q4 = q5;
            }
        }
        return q4;
    }

    private int z(int i4) {
        int u4 = this.mSpans[0].u(i4);
        for (int i5 = 1; i5 < this.mSpanCount; i5++) {
            int u5 = this.mSpans[i5].u(i4);
            if (u5 < u4) {
                u4 = u5;
            }
        }
        return u4;
    }

    boolean areAllEndsEqual() {
        int q4 = this.mSpans[0].q(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.mSpanCount; i4++) {
            if (this.mSpans[i4].q(Integer.MIN_VALUE) != q4) {
                return false;
            }
        }
        return true;
    }

    boolean areAllStartsEqual() {
        int u4 = this.mSpans[0].u(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.mSpanCount; i4++) {
            if (this.mSpans[i4].u(Integer.MIN_VALUE) != u4) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            firstChildPosition = getLastChildPosition();
            lastChildPosition = getFirstChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
            lastChildPosition = getLastChildPosition();
        }
        if (firstChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.mLaidOutInvalidFullSpan) {
            return false;
        }
        int i4 = this.mShouldReverseLayout ? -1 : 1;
        int i5 = lastChildPosition + 1;
        LazySpanLookup.FullSpanItem e4 = this.mLazySpanLookup.e(firstChildPosition, i5, i4, true);
        if (e4 == null) {
            this.mLaidOutInvalidFullSpan = false;
            this.mLazySpanLookup.d(i5);
            return false;
        }
        LazySpanLookup.FullSpanItem e5 = this.mLazySpanLookup.e(firstChildPosition, e4.f12953b, i4 * (-1), true);
        if (e5 == null) {
            this.mLazySpanLookup.d(e4.f12953b);
        } else {
            this.mLazySpanLookup.d(e5.f12953b + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i4, int i5, RecyclerView.A a4, RecyclerView.p.c cVar) {
        int q4;
        int i6;
        if (this.mOrientation != 0) {
            i4 = i5;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        prepareLayoutStateForDelta(i4, a4);
        int[] iArr = this.mPrefetchDistances;
        if (iArr == null || iArr.length < this.mSpanCount) {
            this.mPrefetchDistances = new int[this.mSpanCount];
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.mSpanCount; i8++) {
            k kVar = this.mLayoutState;
            if (kVar.f13163d == -1) {
                q4 = kVar.f13165f;
                i6 = this.mSpans[i8].u(q4);
            } else {
                q4 = this.mSpans[i8].q(kVar.f13166g);
                i6 = this.mLayoutState.f13166g;
            }
            int i9 = q4 - i6;
            if (i9 >= 0) {
                this.mPrefetchDistances[i7] = i9;
                i7++;
            }
        }
        Arrays.sort(this.mPrefetchDistances, 0, i7);
        for (int i10 = 0; i10 < i7 && this.mLayoutState.a(a4); i10++) {
            cVar.a(this.mLayoutState.f13162c, this.mPrefetchDistances[i10]);
            k kVar2 = this.mLayoutState;
            kVar2.f13162c += kVar2.f13163d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.A a4) {
        return l(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.A a4) {
        return m(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.A a4) {
        return n(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i4) {
        int j4 = j(i4);
        PointF pointF = new PointF();
        if (j4 == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = j4;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = j4;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.A a4) {
        return l(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.A a4) {
        return m(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.A a4) {
        return n(a4);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            iArr[i4] = this.mSpans[i4].f();
        }
        return iArr;
    }

    View findFirstVisibleItemClosestToEnd(boolean z4) {
        int n4 = this.mPrimaryOrientation.n();
        int i4 = this.mPrimaryOrientation.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int g4 = this.mPrimaryOrientation.g(childAt);
            int d4 = this.mPrimaryOrientation.d(childAt);
            if (d4 > n4 && g4 < i4) {
                if (d4 <= i4 || !z4) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View findFirstVisibleItemClosestToStart(boolean z4) {
        int n4 = this.mPrimaryOrientation.n();
        int i4 = this.mPrimaryOrientation.i();
        int childCount = getChildCount();
        View view = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int g4 = this.mPrimaryOrientation.g(childAt);
            if (this.mPrimaryOrientation.d(childAt) > n4 && g4 < i4) {
                if (g4 >= n4 || !z4) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        if (findFirstVisibleItemClosestToEnd == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToEnd);
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            iArr[i4] = this.mSpans[i4].h();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            iArr[i4] = this.mSpans[i4].i();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            iArr[i4] = this.mSpans[i4].k();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View hasGapsToFix() {
        int i4;
        int childCount = getChildCount();
        int i5 = childCount - 1;
        BitSet bitSet = new BitSet(this.mSpanCount);
        bitSet.set(0, this.mSpanCount, true);
        char c4 = (this.mOrientation == 1 && isLayoutRTL()) ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            childCount = -1;
        } else {
            i5 = 0;
        }
        int i6 = i5 < childCount ? 1 : -1;
        while (i5 != childCount) {
            View childAt = getChildAt(i5);
            c cVar = (c) childAt.getLayoutParams();
            if (bitSet.get(cVar.f12975e.f12981e)) {
                if (k(cVar.f12975e)) {
                    return childAt;
                }
                bitSet.clear(cVar.f12975e.f12981e);
            }
            if (!cVar.f12976f && (i4 = i5 + i6) != childCount) {
                View childAt2 = getChildAt(i4);
                if (this.mShouldReverseLayout) {
                    int d4 = this.mPrimaryOrientation.d(childAt);
                    int d5 = this.mPrimaryOrientation.d(childAt2);
                    if (d4 >= d5) {
                        if (d4 != d5) {
                            continue;
                        }
                        if ((cVar.f12975e.f12981e - ((c) childAt2.getLayoutParams()).f12975e.f12981e >= 0) == (c4 >= 0)) {
                        }
                    }
                } else {
                    int g4 = this.mPrimaryOrientation.g(childAt);
                    int g5 = this.mPrimaryOrientation.g(childAt2);
                    if (g4 <= g5) {
                        if (g4 != g5) {
                            continue;
                        }
                        if ((cVar.f12975e.f12981e - ((c) childAt2.getLayoutParams()).f12975e.f12981e >= 0) == (c4 >= 0)) {
                        }
                    }
                }
                return childAt;
            }
            i5 += i6;
        }
        return null;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenHorizontal(int i4) {
        super.offsetChildrenHorizontal(i4);
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            this.mSpans[i5].w(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenVertical(int i4) {
        super.offsetChildrenVertical(i4);
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            this.mSpans[i5].w(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.mLazySpanLookup.b();
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            this.mSpans[i4].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            this.mSpans[i4].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        View findContainingItemView;
        View r4;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        L();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i4);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        boolean z4 = cVar.f12976f;
        d dVar = cVar.f12975e;
        int lastChildPosition = convertFocusDirectionToLayoutDirection == 1 ? getLastChildPosition() : getFirstChildPosition();
        P(lastChildPosition, a4);
        M(convertFocusDirectionToLayoutDirection);
        k kVar = this.mLayoutState;
        kVar.f13162c = kVar.f13163d + lastChildPosition;
        kVar.f13161b = (int) (this.mPrimaryOrientation.o() * 0.33333334f);
        k kVar2 = this.mLayoutState;
        kVar2.f13167h = true;
        kVar2.f13160a = false;
        r(wVar, kVar2, a4);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z4 && (r4 = dVar.r(lastChildPosition, convertFocusDirectionToLayoutDirection)) != null && r4 != findContainingItemView) {
            return r4;
        }
        if (F(convertFocusDirectionToLayoutDirection)) {
            for (int i5 = this.mSpanCount - 1; i5 >= 0; i5--) {
                View r5 = this.mSpans[i5].r(lastChildPosition, convertFocusDirectionToLayoutDirection);
                if (r5 != null && r5 != findContainingItemView) {
                    return r5;
                }
            }
        } else {
            for (int i6 = 0; i6 < this.mSpanCount; i6++) {
                View r6 = this.mSpans[i6].r(lastChildPosition, convertFocusDirectionToLayoutDirection);
                if (r6 != null && r6 != findContainingItemView) {
                    return r6;
                }
            }
        }
        boolean z5 = (this.mReverseLayout ^ true) == (convertFocusDirectionToLayoutDirection == -1);
        if (!z4) {
            View findViewByPosition = findViewByPosition(z5 ? dVar.g() : dVar.j());
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (F(convertFocusDirectionToLayoutDirection)) {
            for (int i7 = this.mSpanCount - 1; i7 >= 0; i7--) {
                if (i7 != dVar.f12981e) {
                    View findViewByPosition2 = findViewByPosition(z5 ? this.mSpans[i7].g() : this.mSpans[i7].j());
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < this.mSpanCount; i8++) {
                View findViewByPosition3 = findViewByPosition(z5 ? this.mSpans[i8].g() : this.mSpans[i8].j());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart == null || findFirstVisibleItemClosestToEnd == null) {
                return;
            }
            int position = getPosition(findFirstVisibleItemClosestToStart);
            int position2 = getPosition(findFirstVisibleItemClosestToEnd);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        B(i4, i5, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        B(i4, i5, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        B(i4, i5, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
        B(i4, i5, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.A a4) {
        E(wVar, a4, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.A a4) {
        super.onLayoutCompleted(a4);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.c();
                this.mPendingSavedState.d();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        int u4;
        int n4;
        int[] iArr;
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        savedState.f12964i = this.mReverseLayout;
        savedState.f12965j = this.mLastLayoutFromEnd;
        savedState.f12966k = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f12951a) == null) {
            savedState.f12961f = 0;
        } else {
            savedState.f12962g = iArr;
            savedState.f12961f = iArr.length;
            savedState.f12963h = lazySpanLookup.f12952b;
        }
        if (getChildCount() <= 0) {
            savedState.f12957b = -1;
            savedState.f12958c = -1;
            savedState.f12959d = 0;
            return savedState;
        }
        savedState.f12957b = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
        savedState.f12958c = findFirstVisibleItemPositionInt();
        int i4 = this.mSpanCount;
        savedState.f12959d = i4;
        savedState.f12960e = new int[i4];
        for (int i5 = 0; i5 < this.mSpanCount; i5++) {
            if (this.mLastLayoutFromEnd) {
                u4 = this.mSpans[i5].q(Integer.MIN_VALUE);
                if (u4 != Integer.MIN_VALUE) {
                    n4 = this.mPrimaryOrientation.i();
                    u4 -= n4;
                    savedState.f12960e[i5] = u4;
                } else {
                    savedState.f12960e[i5] = u4;
                }
            } else {
                u4 = this.mSpans[i5].u(Integer.MIN_VALUE);
                if (u4 != Integer.MIN_VALUE) {
                    n4 = this.mPrimaryOrientation.n();
                    u4 -= n4;
                    savedState.f12960e[i5] = u4;
                } else {
                    savedState.f12960e[i5] = u4;
                }
            }
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onScrollStateChanged(int i4) {
        if (i4 == 0) {
            checkForGaps();
        }
    }

    void prepareLayoutStateForDelta(int i4, RecyclerView.A a4) {
        int firstChildPosition;
        int i5;
        if (i4 > 0) {
            firstChildPosition = getLastChildPosition();
            i5 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i5 = -1;
        }
        this.mLayoutState.f13160a = true;
        P(firstChildPosition, a4);
        M(i5);
        k kVar = this.mLayoutState;
        kVar.f13162c = firstChildPosition + kVar.f13163d;
        kVar.f13161b = Math.abs(i4);
    }

    int scrollBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i4, a4);
        int r4 = r(wVar, this.mLayoutState, a4);
        if (this.mLayoutState.f13161b >= r4) {
            i4 = i4 < 0 ? -r4 : r4;
        }
        this.mPrimaryOrientation.s(-i4);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        k kVar = this.mLayoutState;
        kVar.f13161b = 0;
        H(wVar, kVar);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        return scrollBy(i4, wVar, a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i4) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.f12957b != i4) {
            savedState.c();
        }
        this.mPendingScrollPosition = i4;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i4, RecyclerView.w wVar, RecyclerView.A a4) {
        return scrollBy(i4, wVar, a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i4, int i5) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.p.chooseSize(i5, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.p.chooseSize(i4, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.p.chooseSize(i4, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.p.chooseSize(i5, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i4 == this.mOrientation) {
            return;
        }
        this.mOrientation = i4;
        p pVar = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = pVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z4) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.f12964i != z4) {
            savedState.f12964i = z4;
        }
        this.mReverseLayout = z4;
        requestLayout();
    }

    public void setSpanCount(int i4) {
        assertNotInLayoutOrScroll(null);
        if (i4 != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i4;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new d[this.mSpanCount];
            for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                this.mSpans[i5] = new d(i5);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a4, int i4) {
        l lVar = new l(recyclerView.getContext());
        lVar.setTargetPosition(i4);
        startSmoothScroll(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    boolean updateAnchorFromPendingData(RecyclerView.A a4, b bVar) {
        int i4;
        if (!a4.e() && (i4 = this.mPendingScrollPosition) != -1) {
            if (i4 >= 0 && i4 < a4.b()) {
                SavedState savedState = this.mPendingSavedState;
                if (savedState == null || savedState.f12957b == -1 || savedState.f12959d < 1) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        bVar.f12968a = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
                        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                            if (bVar.f12970c) {
                                bVar.f12969b = (this.mPrimaryOrientation.i() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.d(findViewByPosition);
                            } else {
                                bVar.f12969b = (this.mPrimaryOrientation.n() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.g(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.mPrimaryOrientation.e(findViewByPosition) > this.mPrimaryOrientation.o()) {
                            bVar.f12969b = bVar.f12970c ? this.mPrimaryOrientation.i() : this.mPrimaryOrientation.n();
                            return true;
                        }
                        int g4 = this.mPrimaryOrientation.g(findViewByPosition) - this.mPrimaryOrientation.n();
                        if (g4 < 0) {
                            bVar.f12969b = -g4;
                            return true;
                        }
                        int i5 = this.mPrimaryOrientation.i() - this.mPrimaryOrientation.d(findViewByPosition);
                        if (i5 < 0) {
                            bVar.f12969b = i5;
                            return true;
                        }
                        bVar.f12969b = Integer.MIN_VALUE;
                    } else {
                        int i6 = this.mPendingScrollPosition;
                        bVar.f12968a = i6;
                        int i7 = this.mPendingScrollPositionOffset;
                        if (i7 == Integer.MIN_VALUE) {
                            bVar.f12970c = j(i6) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i7);
                        }
                        bVar.f12971d = true;
                    }
                } else {
                    bVar.f12969b = Integer.MIN_VALUE;
                    bVar.f12968a = this.mPendingScrollPosition;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    void updateAnchorInfoForLayout(RecyclerView.A a4, b bVar) {
        if (updateAnchorFromPendingData(a4, bVar) || O(a4, bVar)) {
            return;
        }
        bVar.a();
        bVar.f12968a = 0;
    }

    void updateMeasureSpecs(int i4) {
        this.mSizePerSpan = i4 / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i4, this.mSecondaryOrientation.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        int[] f12951a;

        /* renamed from: b, reason: collision with root package name */
        List f12952b;

        LazySpanLookup() {
        }

        private int i(int i4) {
            if (this.f12952b == null) {
                return -1;
            }
            FullSpanItem f4 = f(i4);
            if (f4 != null) {
                this.f12952b.remove(f4);
            }
            int size = this.f12952b.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                }
                if (((FullSpanItem) this.f12952b.get(i5)).f12953b >= i4) {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f12952b.get(i5);
            this.f12952b.remove(i5);
            return fullSpanItem.f12953b;
        }

        private void l(int i4, int i5) {
            List list = this.f12952b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12952b.get(size);
                int i6 = fullSpanItem.f12953b;
                if (i6 >= i4) {
                    fullSpanItem.f12953b = i6 + i5;
                }
            }
        }

        private void m(int i4, int i5) {
            List list = this.f12952b;
            if (list == null) {
                return;
            }
            int i6 = i4 + i5;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12952b.get(size);
                int i7 = fullSpanItem.f12953b;
                if (i7 >= i4) {
                    if (i7 < i6) {
                        this.f12952b.remove(size);
                    } else {
                        fullSpanItem.f12953b = i7 - i5;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f12952b == null) {
                this.f12952b = new ArrayList();
            }
            int size = this.f12952b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f12952b.get(i4);
                if (fullSpanItem2.f12953b == fullSpanItem.f12953b) {
                    this.f12952b.remove(i4);
                }
                if (fullSpanItem2.f12953b >= fullSpanItem.f12953b) {
                    this.f12952b.add(i4, fullSpanItem);
                    return;
                }
            }
            this.f12952b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f12951a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f12952b = null;
        }

        void c(int i4) {
            int[] iArr = this.f12951a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i4, 10) + 1];
                this.f12951a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[o(i4)];
                this.f12951a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f12951a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i4) {
            List list = this.f12952b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f12952b.get(size)).f12953b >= i4) {
                        this.f12952b.remove(size);
                    }
                }
            }
            return h(i4);
        }

        public FullSpanItem e(int i4, int i5, int i6, boolean z4) {
            List list = this.f12952b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12952b.get(i7);
                int i8 = fullSpanItem.f12953b;
                if (i8 >= i5) {
                    return null;
                }
                if (i8 >= i4 && (i6 == 0 || fullSpanItem.f12954c == i6 || (z4 && fullSpanItem.f12956e))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i4) {
            List list = this.f12952b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f12952b.get(size);
                if (fullSpanItem.f12953b == i4) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i4) {
            int[] iArr = this.f12951a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            return iArr[i4];
        }

        int h(int i4) {
            int[] iArr = this.f12951a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            int i5 = i(i4);
            if (i5 == -1) {
                int[] iArr2 = this.f12951a;
                Arrays.fill(iArr2, i4, iArr2.length, -1);
                return this.f12951a.length;
            }
            int min = Math.min(i5 + 1, this.f12951a.length);
            Arrays.fill(this.f12951a, i4, min, -1);
            return min;
        }

        void j(int i4, int i5) {
            int[] iArr = this.f12951a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            c(i6);
            int[] iArr2 = this.f12951a;
            System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
            Arrays.fill(this.f12951a, i4, i6, -1);
            l(i4, i5);
        }

        void k(int i4, int i5) {
            int[] iArr = this.f12951a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            c(i6);
            int[] iArr2 = this.f12951a;
            System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
            int[] iArr3 = this.f12951a;
            Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
            m(i4, i5);
        }

        void n(int i4, d dVar) {
            c(i4);
            this.f12951a[i4] = dVar.f12981e;
        }

        int o(int i4) {
            int length = this.f12951a.length;
            while (length <= i4) {
                length *= 2;
            }
            return length;
        }

        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            int f12953b;

            /* renamed from: c, reason: collision with root package name */
            int f12954c;

            /* renamed from: d, reason: collision with root package name */
            int[] f12955d;

            /* renamed from: e, reason: collision with root package name */
            boolean f12956e;

            class a implements Parcelable.Creator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i4) {
                    return new FullSpanItem[i4];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f12953b = parcel.readInt();
                this.f12954c = parcel.readInt();
                this.f12956e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f12955d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i4) {
                int[] iArr = this.f12955d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i4];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f12953b + ", mGapDir=" + this.f12954c + ", mHasUnwantedGapAfter=" + this.f12956e + ", mGapPerSpan=" + Arrays.toString(this.f12955d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f12953b);
                parcel.writeInt(this.f12954c);
                parcel.writeInt(this.f12956e ? 1 : 0);
                int[] iArr = this.f12955d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f12955d);
                }
            }

            FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i4, int i5) {
        this.mOrientation = i5;
        setSpanCount(i4);
        this.mLayoutState = new k();
        q();
    }
}
