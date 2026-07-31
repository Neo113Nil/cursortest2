package androidx.recyclerview.widget;

import B.w;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1289e0;
import androidx.core.view.C1280a;
import androidx.core.view.F;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g0.AbstractC2425a;
import g0.AbstractC2426b;
import g0.AbstractC2427c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.jsonwebtoken.JwtParser;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.E {
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static boolean sDebugAssertionsEnabled = false;
    static final B sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    androidx.recyclerview.widget.r mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    androidx.recyclerview.widget.f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.j mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.a mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<E> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    j.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private F mScrollingChildHelper;
    final A mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final D mViewFlinger;
    private final w.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.w mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static class A {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f12876b;

        /* renamed from: m, reason: collision with root package name */
        int f12887m;

        /* renamed from: n, reason: collision with root package name */
        long f12888n;

        /* renamed from: o, reason: collision with root package name */
        int f12889o;

        /* renamed from: p, reason: collision with root package name */
        int f12890p;

        /* renamed from: q, reason: collision with root package name */
        int f12891q;

        /* renamed from: a, reason: collision with root package name */
        int f12875a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f12877c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f12878d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f12879e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f12880f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f12881g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f12882h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f12883i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f12884j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f12885k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f12886l = false;

        void a(int i4) {
            if ((this.f12879e & i4) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f12879e));
        }

        public int b() {
            return this.f12882h ? this.f12877c - this.f12878d : this.f12880f;
        }

        public int c() {
            return this.f12875a;
        }

        public boolean d() {
            return this.f12875a != -1;
        }

        public boolean e() {
            return this.f12882h;
        }

        void f(h hVar) {
            this.f12879e = 1;
            this.f12880f = hVar.getItemCount();
            this.f12882h = false;
            this.f12883i = false;
            this.f12884j = false;
        }

        public boolean g() {
            return this.f12886l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f12875a + ", mData=" + this.f12876b + ", mItemCount=" + this.f12880f + ", mIsMeasuring=" + this.f12884j + ", mPreviousLayoutItemCount=" + this.f12877c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f12878d + ", mStructureChanged=" + this.f12881g + ", mInPreLayout=" + this.f12882h + ", mRunSimpleAnimations=" + this.f12885k + ", mRunPredictiveAnimations=" + this.f12886l + '}';
        }
    }

    static class B extends l {
        B() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class C {
    }

    class D implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private int f12892b;

        /* renamed from: c, reason: collision with root package name */
        private int f12893c;

        /* renamed from: d, reason: collision with root package name */
        OverScroller f12894d;

        /* renamed from: e, reason: collision with root package name */
        Interpolator f12895e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f12896f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f12897g;

        D() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f12895e = interpolator;
            this.f12896f = false;
            this.f12897g = false;
            this.f12894d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i4, int i5) {
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            boolean z4 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z4) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC1281a0.g0(RecyclerView.this, this);
        }

        public void b(int i4, int i5) {
            RecyclerView.this.setScrollState(2);
            this.f12893c = 0;
            this.f12892b = 0;
            Interpolator interpolator = this.f12895e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f12895e = interpolator2;
                this.f12894d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f12894d.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f12896f) {
                this.f12897g = true;
            } else {
                c();
            }
        }

        public void e(int i4, int i5, int i6, Interpolator interpolator) {
            if (i6 == Integer.MIN_VALUE) {
                i6 = a(i4, i5);
            }
            int i7 = i6;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f12895e != interpolator) {
                this.f12895e = interpolator;
                this.f12894d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f12893c = 0;
            this.f12892b = 0;
            RecyclerView.this.setScrollState(2);
            this.f12894d.startScroll(0, 0, i4, i5, i7);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f12894d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                f();
                return;
            }
            this.f12897g = false;
            this.f12896f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f12894d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f12892b;
                int i7 = currY - this.f12893c;
                this.f12892b = currX;
                this.f12893c = currY;
                int consumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i6);
                int consumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i7);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    int i8 = iArr4[0];
                    int i9 = iArr4[1];
                    consumeFlingInHorizontalStretch -= i8;
                    consumeFlingInVerticalStretch -= i9;
                    z zVar = recyclerView4.mLayout.mSmoothScroller;
                    if (zVar != null && !zVar.isPendingInitialRun() && zVar.isRunning()) {
                        int b4 = RecyclerView.this.mState.b();
                        if (b4 == 0) {
                            zVar.stop();
                        } else if (zVar.getTargetPosition() >= b4) {
                            zVar.setTargetPosition(b4 - 1);
                            zVar.onAnimation(i8, i9);
                        } else {
                            zVar.onAnimation(i8, i9);
                        }
                    }
                    i5 = i9;
                    i4 = i8;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = consumeFlingInHorizontalStretch;
                int i11 = consumeFlingInVerticalStretch;
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i4, i5, i10, i11, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i12 = i10 - iArr6[0];
                int i13 = i11 - iArr6[1];
                if (i4 != 0 || i5 != 0) {
                    recyclerView6.dispatchOnScrolled(i4, i5);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
                z zVar2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((zVar2 == null || !zVar2.isPendingInitialRun()) && z4) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                        if (i13 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i13 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i14, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.j jVar = recyclerView7.mGapWorker;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i4, i5);
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (zVar3 != null && zVar3.isPendingInitialRun()) {
                zVar3.onAnimation(0, 0);
            }
            this.f12896f = false;
            if (this.f12897g) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    public static abstract class E {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        E mShadowedHolder = null;
        E mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public E(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void b() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                b();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i4) {
            this.mFlags = i4 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && AbstractC1281a0.Q(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i4, int i5, boolean z4) {
            addFlags(8);
            offsetPosition(i5, z4);
            this.mPosition = i4;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i4 = this.mPreLayoutPosition;
            return i4 == -1 ? this.mPosition : i4;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i4 = this.mPreLayoutPosition;
            return i4 == -1 ? this.mPosition : i4;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i4) {
            return (i4 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !AbstractC1281a0.Q(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i4, boolean z4) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z4) {
                this.mPreLayoutPosition += i4;
            }
            this.mPosition += i4;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f12929c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i4 = this.mPendingAccessibilityState;
            if (i4 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i4;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = AbstractC1281a0.A(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i4, int i5) {
            this.mFlags = (i4 & i5) | (this.mFlags & (~i5));
        }

        public final void setIsRecyclable(boolean z4) {
            int i4 = this.mIsRecyclableCount;
            int i5 = z4 ? i4 - 1 : i4 + 1;
            this.mIsRecyclableCount = i5;
            if (i5 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z4 && i5 == 1) {
                this.mFlags |= 16;
            } else if (z4 && i5 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z4 + StringUtils.PROCESS_POSTFIX_DELIMITER + this);
            }
        }

        void setScrapContainer(w wVar, boolean z4) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z4;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.O(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC1360a implements Runnable {
        RunnableC1360a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC1361b implements Runnable {
        RunnableC1361b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC1362c implements Interpolator {
        InterpolatorC1362c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C1363d implements w.b {
        C1363d() {
        }

        @Override // androidx.recyclerview.widget.w.b
        public void a(E e4) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(e4.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void b(E e4, m.b bVar, m.b bVar2) {
            RecyclerView.this.animateAppearance(e4, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void c(E e4, m.b bVar, m.b bVar2) {
            RecyclerView.this.mRecycler.O(e4);
            RecyclerView.this.animateDisappearance(e4, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.w.b
        public void d(E e4, m.b bVar, m.b bVar2) {
            e4.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.b(e4, e4, bVar, bVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.d(e4, bVar, bVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    class C1364e implements f.b {
        C1364e() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public View a(int i4) {
            return RecyclerView.this.getChildAt(i4);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void b(View view) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void d() {
            int c4 = c();
            for (int i4 = 0; i4 < c4; i4++) {
                View a4 = a(i4);
                RecyclerView.this.dispatchChildDetached(a4);
                a4.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public E f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void g(int i4) {
            View a4 = a(i4);
            if (a4 != null) {
                E childViewHolderInt = RecyclerView.getChildViewHolderInt(a4);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.addFlags(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No view at offset " + i4 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.detachViewFromParent(i4);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void h(View view) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(View view, int i4) {
            RecyclerView.this.addView(view, i4);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void j(int i4) {
            View childAt = RecyclerView.this.getChildAt(i4);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i4);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void k(View view, int i4, ViewGroup.LayoutParams layoutParams) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.clearTmpDetachFlag();
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i4 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.attachViewToParent(view, i4, layoutParams);
        }
    }

    class f implements a.InterfaceC0121a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public void a(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForMove(i4, i5);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public void c(int i4, int i5, Object obj) {
            RecyclerView.this.viewRangeUpdate(i4, i5, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public E e(int i4) {
            E findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i4, true);
            if (findViewHolderForPosition == null) {
                return null;
            }
            if (!RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public void f(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForRemove(i4, i5, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public void g(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForInsert(i4, i5);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0121a
        public void h(int i4, int i5) {
            RecyclerView.this.offsetPositionRecordsForRemove(i4, i5, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f12878d += i5;
        }

        void i(a.b bVar) {
            int i4 = bVar.f12991a;
            if (i4 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f12992b, bVar.f12994d);
                return;
            }
            if (i4 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f12992b, bVar.f12994d);
            } else if (i4 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f12992b, bVar.f12994d, bVar.f12993c);
            } else {
                if (i4 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f12992b, bVar.f12994d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12905a;

        static {
            int[] iArr = new int[h.a.values().length];
            f12905a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12905a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(E e4, int i4) {
            boolean z4 = e4.mBindingAdapter == null;
            if (z4) {
                e4.mPosition = i4;
                if (hasStableIds()) {
                    e4.mItemId = getItemId(i4);
                }
                e4.setFlags(1, 519);
                androidx.core.os.n.a("RV OnBindView");
            }
            e4.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (e4.itemView.getParent() == null && AbstractC1281a0.S(e4.itemView) != e4.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + e4.isTmpDetached() + ", attached to window: " + AbstractC1281a0.S(e4.itemView) + ", holder: " + e4);
                }
                if (e4.itemView.getParent() == null && AbstractC1281a0.S(e4.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + e4);
                }
            }
            onBindViewHolder(e4, i4, e4.getUnmodifiedPayloads());
            if (z4) {
                e4.clearPayload();
                ViewGroup.LayoutParams layoutParams = e4.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f12929c = true;
                }
                androidx.core.os.n.b();
            }
        }

        boolean canRestoreState() {
            int i4 = g.f12905a[this.mStateRestorationPolicy.ordinal()];
            return i4 != 1 && (i4 != 2 || getItemCount() > 0);
        }

        public final E createViewHolder(ViewGroup viewGroup, int i4) {
            try {
                androidx.core.os.n.a("RV CreateView");
                E onCreateViewHolder = onCreateViewHolder(viewGroup, i4);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i4;
                return onCreateViewHolder;
            } finally {
                androidx.core.os.n.b();
            }
        }

        public int findRelativeAdapterPositionIn(h hVar, E e4, int i4) {
            if (hVar == this) {
                return i4;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i4) {
            return -1L;
        }

        public int getItemViewType(int i4) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i4) {
            this.mObservable.d(i4, 1);
        }

        public final void notifyItemInserted(int i4) {
            this.mObservable.f(i4, 1);
        }

        public final void notifyItemMoved(int i4, int i5) {
            this.mObservable.c(i4, i5);
        }

        public final void notifyItemRangeChanged(int i4, int i5) {
            this.mObservable.d(i4, i5);
        }

        public final void notifyItemRangeInserted(int i4, int i5) {
            this.mObservable.f(i4, i5);
        }

        public final void notifyItemRangeRemoved(int i4, int i5) {
            this.mObservable.g(i4, i5);
        }

        public final void notifyItemRemoved(int i4) {
            this.mObservable.g(i4, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(E e4, int i4);

        public void onBindViewHolder(E e4, int i4, List<Object> list) {
            onBindViewHolder(e4, i4);
        }

        public abstract E onCreateViewHolder(ViewGroup viewGroup, int i4);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(E e4) {
            return false;
        }

        public void onViewAttachedToWindow(E e4) {
        }

        public void onViewDetachedFromWindow(E e4) {
        }

        public void onViewRecycled(E e4) {
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z4) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z4;
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i4, Object obj) {
            this.mObservable.e(i4, 1, obj);
        }

        public final void notifyItemRangeChanged(int i4, int i5, Object obj) {
            this.mObservable.e(i4, i5, obj);
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i4, i5, 1);
            }
        }

        public void d(int i4, int i5) {
            e(i4, i5, null);
        }

        public void e(int i4, int i5, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i4, i5, obj);
            }
        }

        public void f(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i4, i5);
            }
        }

        public void g(int i4, int i5) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i4, i5);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public abstract void b(int i4, int i5, Object obj);

        public abstract void c(int i4, int i5);

        public abstract void d(int i4, int i5, int i6);

        public abstract void e(int i4, int i5);

        public void onStateRestorationPolicyChanged() {
        }
    }

    public interface k {
    }

    public static class l {
        protected abstract EdgeEffect a(RecyclerView recyclerView, int i4);
    }

    public static abstract class m {

        /* renamed from: a, reason: collision with root package name */
        private a f12910a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f12911b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private long f12912c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f12913d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f12914e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f12915f = 250;

        interface a {
            void a(E e4);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f12916a;

            /* renamed from: b, reason: collision with root package name */
            public int f12917b;

            /* renamed from: c, reason: collision with root package name */
            public int f12918c;

            /* renamed from: d, reason: collision with root package name */
            public int f12919d;

            public b a(E e4) {
                return b(e4, 0);
            }

            public b b(E e4, int i4) {
                View view = e4.itemView;
                this.f12916a = view.getLeft();
                this.f12917b = view.getTop();
                this.f12918c = view.getRight();
                this.f12919d = view.getBottom();
                return this;
            }
        }

        static int e(E e4) {
            int i4 = e4.mFlags;
            int i5 = i4 & 14;
            if (e4.isInvalid()) {
                return 4;
            }
            if ((i4 & 4) == 0) {
                int oldPosition = e4.getOldPosition();
                int absoluteAdapterPosition = e4.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i5 | com.ironsource.mediationsdk.metadata.a.f17688n;
                }
            }
            return i5;
        }

        public abstract boolean a(E e4, b bVar, b bVar2);

        public abstract boolean b(E e4, E e5, b bVar, b bVar2);

        public abstract boolean c(E e4, b bVar, b bVar2);

        public abstract boolean d(E e4, b bVar, b bVar2);

        public abstract boolean f(E e4);

        public boolean g(E e4, List list) {
            return f(e4);
        }

        public final void h(E e4) {
            r(e4);
            a aVar = this.f12910a;
            if (aVar != null) {
                aVar.a(e4);
            }
        }

        public final void i() {
            if (this.f12911b.size() <= 0) {
                this.f12911b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f12911b.get(0));
                throw null;
            }
        }

        public abstract void j(E e4);

        public abstract void k();

        public long l() {
            return this.f12912c;
        }

        public long m() {
            return this.f12915f;
        }

        public long n() {
            return this.f12914e;
        }

        public long o() {
            return this.f12913d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(E e4) {
        }

        public b s(A a4, E e4) {
            return q().a(e4);
        }

        public b t(A a4, E e4, int i4, List list) {
            return q().a(e4);
        }

        public abstract void u();

        void v(a aVar) {
            this.f12910a = aVar;
        }
    }

    private class n implements m.a {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.a
        public void a(E e4) {
            e4.setIsRecyclable(true);
            if (e4.mShadowedHolder != null && e4.mShadowingHolder == null) {
                e4.mShadowedHolder = null;
            }
            e4.mShadowingHolder = null;
            if (e4.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(e4.itemView) || !e4.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e4.itemView, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i4, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, A a4) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, A a4) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, A a4) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class p {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.f mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.v mHorizontalBoundCheck;
        private final v.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        z mSmoothScroller;
        androidx.recyclerview.widget.v mVerticalBoundCheck;
        private final v.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        class a implements v.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i4) {
                return p.this.getChildAt(i4);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return p.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return p.this.getWidth() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return p.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements v.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.v.b
            public View a(int i4) {
                return p.this.getChildAt(i4);
            }

            @Override // androidx.recyclerview.widget.v.b
            public int b(View view) {
                return p.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.v.b
            public int c() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int d() {
                return p.this.getHeight() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.v.b
            public int e(View view) {
                return p.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i4, int i5);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f12923a;

            /* renamed from: b, reason: collision with root package name */
            public int f12924b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f12925c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f12926d;
        }

        public p() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.v(aVar);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.v(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void a(View view, int i4, boolean z4) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z4 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i4, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int m4 = this.mChildHelper.m(view);
                if (i4 == -1) {
                    i4 = this.mChildHelper.g();
                }
                if (m4 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (m4 != i4) {
                    this.mRecyclerView.mLayout.moveView(m4, i4);
                }
            } else {
                this.mChildHelper.a(view, i4, false);
                qVar.f12929c = true;
                z zVar = this.mSmoothScroller;
                if (zVar != null && zVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (qVar.f12930d) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + qVar.f12927a);
                }
                childViewHolderInt.itemView.invalidate();
                qVar.f12930d = false;
            }
        }

        private void b(int i4, View view) {
            this.mChildHelper.d(i4);
        }

        private int[] c(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i4 = left - paddingLeft;
            int min = Math.min(0, i4);
            int i5 = top - paddingTop;
            int min2 = Math.min(0, i5);
            int i6 = width2 - width;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
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
            return new int[]{max, min2};
        }

        public static int chooseSize(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
        }

        private boolean d(RecyclerView recyclerView, int i4, int i5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i4 < width && rect.right - i4 > paddingLeft && rect.top - i5 < height && rect.bottom - i5 > paddingTop;
        }

        private static boolean e(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (i6 > 0 && i4 != i6) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i4;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i4;
            }
            return true;
        }

        private void f(w wVar, int i4, View view) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i4);
                wVar.H(childViewHolderInt);
            } else {
                detachViewAt(i4);
                wVar.I(view);
                this.mRecyclerView.mViewInfoStore.k(childViewHolderInt);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i4, int i5, int i6, int i7, boolean z4) {
            int max = Math.max(0, i4 - i6);
            if (z4) {
                if (i7 < 0) {
                    if (i7 == -1) {
                        if (i5 != Integer.MIN_VALUE) {
                            if (i5 != 0) {
                            }
                        }
                        i7 = max;
                    }
                    i5 = 0;
                    i7 = 0;
                }
                i5 = 1073741824;
            } else {
                if (i7 < 0) {
                    if (i7 != -1) {
                        if (i7 == -2) {
                            if (i5 == Integer.MIN_VALUE || i5 == 1073741824) {
                                i7 = max;
                                i5 = Integer.MIN_VALUE;
                            } else {
                                i7 = max;
                                i5 = 0;
                            }
                        }
                        i5 = 0;
                        i7 = 0;
                    }
                    i7 = max;
                }
                i5 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i7, i5);
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i4, int i5) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2427c.f36669a, i4, i5);
            dVar.f12923a = obtainStyledAttributes.getInt(AbstractC2427c.f36670b, 1);
            dVar.f12924b = obtainStyledAttributes.getInt(AbstractC2427c.f36680l, 1);
            dVar.f12925c = obtainStyledAttributes.getBoolean(AbstractC2427c.f36679k, false);
            dVar.f12926d = obtainStyledAttributes.getBoolean(AbstractC2427c.f36681m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i4, q qVar) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            this.mChildHelper.c(view, i4, qVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public abstract boolean canScrollHorizontally();

        public abstract boolean canScrollVertically();

        public boolean checkLayoutParams(q qVar) {
            return qVar != null;
        }

        public abstract void collectAdjacentPrefetchPositions(int i4, int i5, A a4, c cVar);

        public void collectInitialPrefetchPositions(int i4, c cVar) {
        }

        public abstract int computeHorizontalScrollExtent(A a4);

        public abstract int computeHorizontalScrollOffset(A a4);

        public abstract int computeHorizontalScrollRange(A a4);

        public abstract int computeVerticalScrollExtent(A a4);

        public abstract int computeVerticalScrollOffset(A a4);

        public abstract int computeVerticalScrollRange(A a4);

        public void detachAndScrapAttachedViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                f(wVar, childCount, getChildAt(childCount));
            }
        }

        public void detachViewAt(int i4) {
            b(i4, getChildAt(i4));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, wVar);
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i4) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                E childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i4 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.e() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract q generateDefaultLayoutParams();

        public q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f12928b.bottom;
        }

        public View getChildAt(int i4) {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.f(i4);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(w wVar, A a4) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((q) view.getLayoutParams()).f12928b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((q) view.getLayoutParams()).f12928b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getLayoutDirection() {
            return AbstractC1281a0.C(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f12928b.left;
        }

        public int getMinimumHeight() {
            return AbstractC1281a0.D(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return AbstractC1281a0.E(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f12928b.right;
        }

        public int getRowCountForAccessibility(w wVar, A a4) {
            return -1;
        }

        public int getSelectionModeForAccessibility(w wVar, A a4) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f12928b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z4, Rect rect) {
            Matrix matrix;
            if (z4) {
                Rect rect2 = ((q) view.getLayoutParams()).f12928b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public abstract boolean isAutoMeasureEnabled();

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(w wVar, A a4) {
            return false;
        }

        public boolean isSmoothScrolling() {
            z zVar = this.mSmoothScroller;
            return zVar != null && zVar.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z4, boolean z5) {
            boolean z6 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z4 ? z6 : !z6;
        }

        public void layoutDecoratedWithMargins(View view, int i4, int i5, int i6, int i7) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f12928b;
            view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void measureChildWithMargins(View view, int i4, int i5) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i6 = i4 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i7 = i5 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i6, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i4, int i5) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                detachViewAt(i4);
                attachView(childAt, i5);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i4) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i4);
            }
        }

        public void offsetChildrenVertical(int i4) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i4);
            }
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i4, int i5) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public abstract View onFocusSearchFailed(View view, int i4, w wVar, A a4);

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(B.w wVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, wVar);
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, B.w wVar) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, wVar);
        }

        public View onInterceptFocusSearch(View view, int i4) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5) {
        }

        public abstract void onLayoutChildren(w wVar, A a4);

        public void onLayoutCompleted(A a4) {
        }

        public void onMeasure(w wVar, A a4, int i4, int i5) {
            this.mRecyclerView.defaultOnMeasure(i4, i5);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public abstract void onRestoreInstanceState(Parcelable parcelable);

        public abstract Parcelable onSaveInstanceState();

        public void onScrollStateChanged(int i4) {
        }

        void onSmoothScrollerStopped(z zVar) {
            if (this.mSmoothScroller == zVar) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i4, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i4, bundle);
        }

        public boolean performAccessibilityActionForItem(w wVar, A a4, View view, int i4, Bundle bundle) {
            return false;
        }

        public void removeAndRecycleAllViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, wVar);
                }
            }
        }

        void removeAndRecycleScrapInt(w wVar) {
            int j4 = wVar.j();
            for (int i4 = j4 - 1; i4 >= 0; i4--) {
                View n4 = wVar.n(i4);
                E childViewHolderInt = RecyclerView.getChildViewHolderInt(n4);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(n4, false);
                    }
                    m mVar = this.mRecyclerView.mItemAnimator;
                    if (mVar != null) {
                        mVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.D(n4);
                }
            }
            wVar.e();
            if (j4 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, w wVar) {
            removeView(view);
            wVar.G(view);
        }

        public void removeAndRecycleViewAt(int i4, w wVar) {
            View childAt = getChildAt(i4);
            removeViewAt(i4);
            wVar.G(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i4) {
            if (getChildAt(i4) != null) {
                this.mChildHelper.q(i4);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z4) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z4, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public abstract int scrollHorizontallyBy(int i4, w wVar, A a4);

        public abstract void scrollToPosition(int i4);

        public abstract int scrollVerticallyBy(int i4, w wVar, A a4);

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void setMeasureSpecs(int i4, int i5) {
            this.mWidth = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i4, int i5) {
            setMeasuredDimension(chooseSize(i4, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i5, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i4, int i5) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i4, i5);
                return;
            }
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i11 = rect.left;
                if (i11 < i9) {
                    i9 = i11;
                }
                int i12 = rect.right;
                if (i12 > i6) {
                    i6 = i12;
                }
                int i13 = rect.top;
                if (i13 < i7) {
                    i7 = i13;
                }
                int i14 = rect.bottom;
                if (i14 > i8) {
                    i8 = i14;
                }
            }
            this.mRecyclerView.mTempRect.set(i9, i7, i6, i8);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i4, i5);
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i4, int i5, q qVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && e(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) qVar).width) && e(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i4, int i5, q qVar) {
            return (this.mMeasurementCacheEnabled && e(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) qVar).width) && e(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public abstract void smoothScrollToPosition(RecyclerView recyclerView, A a4, int i4);

        public void startSmoothScroll(z zVar) {
            z zVar2 = this.mSmoothScroller;
            if (zVar2 != null && zVar != zVar2 && zVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = zVar;
            zVar.start(this.mRecyclerView, this);
        }

        void stopSmoothScroller() {
            z zVar = this.mSmoothScroller;
            if (zVar != null) {
                zVar.stop();
            }
        }

        public abstract boolean supportsPredictiveItemAnimations();

        public void addDisappearingView(View view, int i4) {
            a(view, i4, true);
        }

        public void addView(View view, int i4) {
            a(view, i4, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(w wVar, A a4, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z4 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z4 = false;
            }
            accessibilityEvent.setScrollable(z4);
            h hVar = this.mRecyclerView.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(w wVar, A a4, B.w wVar2) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                wVar2.a(8192);
                wVar2.F0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                wVar2.a(Base64Utils.IO_BUFFER_SIZE);
                wVar2.F0(true);
            }
            wVar2.m0(w.e.a(getRowCountForAccessibility(wVar, a4), getColumnCountForAccessibility(wVar, a4), isLayoutHierarchical(wVar, a4), getSelectionModeForAccessibility(wVar, a4)));
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
            onItemsUpdated(recyclerView, i4, i5);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, A a4, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(w wVar, A a4, int i4, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i5;
            int i6;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i4 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i5 = paddingTop;
                    i6 = paddingLeft;
                }
                i5 = paddingTop;
                i6 = 0;
            } else if (i4 != 8192) {
                i6 = 0;
                i5 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i5 = paddingTop;
                    i6 = paddingLeft;
                }
                i5 = paddingTop;
                i6 = 0;
            }
            if (i5 == 0 && i6 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i6, i5, null, Integer.MIN_VALUE, true);
            return true;
        }

        boolean performAccessibilityActionForItem(View view, int i4, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i4, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
            int[] c4 = c(view, rect);
            int i4 = c4[0];
            int i5 = c4[1];
            if ((z5 && !d(recyclerView, i4, i5)) || (i4 == 0 && i5 == 0)) {
                return false;
            }
            if (z4) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.smoothScrollBy(i4, i5);
            }
            return true;
        }

        public void onInitializeAccessibilityNodeInfoForItem(w wVar, A a4, View view, B.w wVar2) {
        }

        public void attachView(View view, int i4) {
            attachView(view, i4, (q) view.getLayoutParams());
        }

        public q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void setMeasuredDimension(int i4, int i5) {
            this.mRecyclerView.setMeasuredDimension(i4, i5);
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean onFling(int i4, int i5);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z4);
    }

    public static abstract class u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
        }

        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        }
    }

    public static class v {
        SparseArray<a> mScrap = new SparseArray<>();
        int mAttachCountForClearing = 0;
        Set<h> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList f12931a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            int f12932b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f12933c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f12934d = 0;

            a() {
            }
        }

        private a a(int i4) {
            a aVar = this.mScrap.get(i4);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.mScrap.put(i4, aVar2);
            return aVar2;
        }

        void attach() {
            this.mAttachCountForClearing++;
        }

        void attachForPoolingContainer(h hVar) {
            this.mAttachedAdaptersForPoolingContainer.add(hVar);
        }

        public void clear() {
            for (int i4 = 0; i4 < this.mScrap.size(); i4++) {
                a valueAt = this.mScrap.valueAt(i4);
                ArrayList arrayList = valueAt.f12931a;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    M.a.a(((E) obj).itemView);
                }
                valueAt.f12931a.clear();
            }
        }

        void detach() {
            this.mAttachCountForClearing--;
        }

        void detachForPoolingContainer(h hVar, boolean z4) {
            this.mAttachedAdaptersForPoolingContainer.remove(hVar);
            if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z4) {
                return;
            }
            for (int i4 = 0; i4 < this.mScrap.size(); i4++) {
                SparseArray<a> sparseArray = this.mScrap;
                ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i4)).f12931a;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    M.a.a(((E) arrayList.get(i5)).itemView);
                }
            }
        }

        void factorInBindTime(int i4, long j4) {
            a a4 = a(i4);
            a4.f12934d = runningAverage(a4.f12934d, j4);
        }

        void factorInCreateTime(int i4, long j4) {
            a a4 = a(i4);
            a4.f12933c = runningAverage(a4.f12933c, j4);
        }

        public E getRecycledView(int i4) {
            a aVar = this.mScrap.get(i4);
            if (aVar == null || aVar.f12931a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f12931a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((E) arrayList.get(size)).isAttachedToTransitionOverlay()) {
                    return (E) arrayList.remove(size);
                }
            }
            return null;
        }

        void onAdapterChanged(h hVar, h hVar2, boolean z4) {
            if (hVar != null) {
                detach();
            }
            if (!z4 && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (hVar2 != null) {
                attach();
            }
        }

        public void putRecycledView(E e4) {
            int itemViewType = e4.getItemViewType();
            ArrayList arrayList = a(itemViewType).f12931a;
            if (this.mScrap.get(itemViewType).f12932b <= arrayList.size()) {
                M.a.a(e4.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(e4)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                e4.resetInternal();
                arrayList.add(e4);
            }
        }

        long runningAverage(long j4, long j5) {
            return j4 == 0 ? j5 : ((j4 / 4) * 3) + (j5 / 4);
        }

        boolean willBindInTime(int i4, long j4, long j5) {
            long j6 = a(i4).f12934d;
            return j6 == 0 || j4 + j6 < j5;
        }

        boolean willCreateInTime(int i4, long j4, long j5) {
            long j6 = a(i4).f12933c;
            return j6 == 0 || j4 + j6 < j5;
        }
    }

    public final class w {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f12935a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f12936b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f12937c;

        /* renamed from: d, reason: collision with root package name */
        private final List f12938d;

        /* renamed from: e, reason: collision with root package name */
        private int f12939e;

        /* renamed from: f, reason: collision with root package name */
        int f12940f;

        /* renamed from: g, reason: collision with root package name */
        v f12941g;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f12935a = arrayList;
            this.f12936b = null;
            this.f12937c = new ArrayList();
            this.f12938d = Collections.unmodifiableList(arrayList);
            this.f12939e = 2;
            this.f12940f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z4) {
            v vVar = this.f12941g;
            if (vVar != null) {
                vVar.detachForPoolingContainer(hVar, z4);
            }
        }

        private boolean M(E e4, int i4, int i5, long j4) {
            e4.mBindingAdapter = null;
            e4.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = e4.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z4 = false;
            if (j4 != Long.MAX_VALUE && !this.f12941g.willBindInTime(itemViewType, nanoTime, j4)) {
                return false;
            }
            if (e4.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(e4.itemView, recyclerView.getChildCount(), e4.itemView.getLayoutParams());
                z4 = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(e4, i4);
            if (z4) {
                RecyclerView.this.detachViewFromParent(e4.itemView);
            }
            this.f12941g.factorInBindTime(e4.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e4);
            if (RecyclerView.this.mState.e()) {
                e4.mPreLayoutPosition = i5;
            }
            return true;
        }

        private void b(E e4) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = e4.itemView;
                if (AbstractC1281a0.A(view) == 0) {
                    AbstractC1281a0.z0(view, 1);
                }
                androidx.recyclerview.widget.r rVar = RecyclerView.this.mAccessibilityDelegate;
                if (rVar == null) {
                    return;
                }
                C1280a itemDelegate = rVar.getItemDelegate();
                if (itemDelegate instanceof r.a) {
                    ((r.a) itemDelegate).saveOriginalDelegate(view);
                }
                AbstractC1281a0.o0(view, itemDelegate);
            }
        }

        private void q(ViewGroup viewGroup, boolean z4) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z4) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(E e4) {
            View view = e4.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f12941g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f12941g.attachForPoolingContainer(RecyclerView.this.mAdapter);
            }
        }

        void A() {
            for (int i4 = 0; i4 < this.f12937c.size(); i4++) {
                M.a.a(((E) this.f12937c.get(i4)).itemView);
            }
            B(RecyclerView.this.mAdapter);
        }

        void D(View view) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            H(childViewHolderInt);
        }

        void E() {
            for (int size = this.f12937c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f12937c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }

        void F(int i4) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "Recycling cached view at index " + i4);
            }
            E e4 = (E) this.f12937c.get(i4);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + e4);
            }
            a(e4, true);
            this.f12937c.remove(i4);
        }

        public void G(View view) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            H(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.j(childViewHolderInt);
        }

        void H(E e4) {
            boolean z4;
            boolean z5 = true;
            if (e4.isScrap() || e4.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e4.isScrap());
                sb.append(" isAttached:");
                sb.append(e4.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e4.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e4 + RecyclerView.this.exceptionLabel());
            }
            if (e4.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean doesTransientStatePreventRecycling = e4.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.mAdapter;
            boolean z6 = hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(e4);
            if (RecyclerView.sDebugAssertionsEnabled && this.f12937c.contains(e4)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + e4 + RecyclerView.this.exceptionLabel());
            }
            if (z6 || e4.isRecyclable()) {
                if (this.f12940f <= 0 || e4.hasAnyOfTheFlags(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                    z4 = false;
                } else {
                    int size = this.f12937c.size();
                    if (size >= this.f12940f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(e4.mPosition)) {
                        int i4 = size - 1;
                        while (i4 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.d(((E) this.f12937c.get(i4)).mPosition)) {
                                break;
                            } else {
                                i4--;
                            }
                        }
                        size = i4 + 1;
                    }
                    this.f12937c.add(size, e4);
                    z4 = true;
                }
                if (z4) {
                    z5 = false;
                } else {
                    a(e4, true);
                }
                r1 = z4;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.exceptionLabel());
                }
                z5 = false;
            }
            RecyclerView.this.mViewInfoStore.q(e4);
            if (r1 || z5 || !doesTransientStatePreventRecycling) {
                return;
            }
            M.a.a(e4.itemView);
            e4.mBindingAdapter = null;
            e4.mOwnerRecyclerView = null;
        }

        void I(View view) {
            E childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f12936b == null) {
                    this.f12936b = new ArrayList();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f12936b.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f12935a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.mAdapter);
            v vVar2 = this.f12941g;
            if (vVar2 != null) {
                vVar2.detach();
            }
            this.f12941g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f12941g.attach();
            }
            u();
        }

        void K(C c4) {
        }

        public void L(int i4) {
            this.f12939e = i4;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        E N(int i4, boolean z4, long j4) {
            E e4;
            boolean z5;
            E e5;
            boolean z6;
            boolean M3;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            RecyclerView findNestedRecyclerView;
            if (i4 < 0 || i4 >= RecyclerView.this.mState.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.e()) {
                e4 = h(i4);
                if (e4 != null) {
                    z5 = true;
                    if (e4 == null && (e4 = m(i4, z4)) != null) {
                        if (Q(e4)) {
                            if (!z4) {
                                e4.addFlags(4);
                                if (e4.isScrap()) {
                                    RecyclerView.this.removeDetachedView(e4.itemView, false);
                                    e4.unScrap();
                                } else if (e4.wasReturnedFromScrap()) {
                                    e4.clearReturnedFromScrapFlag();
                                }
                                H(e4);
                            }
                            e4 = null;
                        } else {
                            z5 = true;
                        }
                    }
                    if (e4 == null) {
                        int m4 = RecyclerView.this.mAdapterHelper.m(i4);
                        if (m4 < 0 || m4 >= RecyclerView.this.mAdapter.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + m4 + ").state:" + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
                        }
                        int itemViewType = RecyclerView.this.mAdapter.getItemViewType(m4);
                        if (RecyclerView.this.mAdapter.hasStableIds() && (e4 = l(RecyclerView.this.mAdapter.getItemId(m4), itemViewType, z4)) != null) {
                            e4.mPosition = m4;
                            z5 = true;
                        }
                        if (e4 == null) {
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i4 + ") fetching from shared pool");
                            }
                            e4 = i().getRecycledView(itemViewType);
                            if (e4 != null) {
                                e4.resetInternal();
                                if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                    r(e4);
                                }
                            }
                        }
                        if (e4 == null) {
                            long nanoTime = RecyclerView.this.getNanoTime();
                            if (j4 != Long.MAX_VALUE && !this.f12941g.willCreateInTime(itemViewType, nanoTime, j4)) {
                                return null;
                            }
                            RecyclerView recyclerView = RecyclerView.this;
                            e4 = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(e4.itemView)) != null) {
                                e4.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                            }
                            this.f12941g.factorInCreateTime(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        }
                    }
                    e5 = e4;
                    z6 = z5;
                    if (z6 && !RecyclerView.this.mState.e() && e5.hasAnyOfTheFlags(8192)) {
                        e5.setFlags(0, 8192);
                        if (RecyclerView.this.mState.f12885k) {
                            int e6 = m.e(e5) | Base64Utils.IO_BUFFER_SIZE;
                            RecyclerView recyclerView2 = RecyclerView.this;
                            RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(e5, recyclerView2.mItemAnimator.t(recyclerView2.mState, e5, e6, e5.getUnmodifiedPayloads()));
                        }
                    }
                    if (!RecyclerView.this.mState.e() && e5.isBound()) {
                        e5.mPreLayoutPosition = i4;
                    } else if (e5.isBound() || e5.needsUpdate() || e5.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && e5.isRemoved()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + e5 + RecyclerView.this.exceptionLabel());
                        }
                        M3 = M(e5, RecyclerView.this.mAdapterHelper.m(i4), i4, j4);
                        layoutParams = e5.itemView.getLayoutParams();
                        if (layoutParams == null) {
                            qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                            e5.itemView.setLayoutParams(qVar);
                        } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            qVar = (q) layoutParams;
                        } else {
                            qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                            e5.itemView.setLayoutParams(qVar);
                        }
                        qVar.f12927a = e5;
                        qVar.f12930d = !z6 && M3;
                        return e5;
                    }
                    M3 = false;
                    layoutParams = e5.itemView.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    qVar.f12927a = e5;
                    qVar.f12930d = !z6 && M3;
                    return e5;
                }
            } else {
                e4 = null;
            }
            z5 = false;
            if (e4 == null) {
                if (Q(e4)) {
                }
            }
            if (e4 == null) {
            }
            e5 = e4;
            z6 = z5;
            if (z6) {
                e5.setFlags(0, 8192);
                if (RecyclerView.this.mState.f12885k) {
                }
            }
            if (!RecyclerView.this.mState.e()) {
            }
            if (e5.isBound()) {
            }
            if (!RecyclerView.sDebugAssertionsEnabled) {
            }
            M3 = M(e5, RecyclerView.this.mAdapterHelper.m(i4), i4, j4);
            layoutParams = e5.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            qVar.f12927a = e5;
            qVar.f12930d = !z6 && M3;
            return e5;
        }

        void O(E e4) {
            if (e4.mInChangeScrap) {
                this.f12936b.remove(e4);
            } else {
                this.f12935a.remove(e4);
            }
            e4.mScrapContainer = null;
            e4.mInChangeScrap = false;
            e4.clearReturnedFromScrapFlag();
        }

        void P() {
            p pVar = RecyclerView.this.mLayout;
            this.f12940f = this.f12939e + (pVar != null ? pVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f12937c.size() - 1; size >= 0 && this.f12937c.size() > this.f12940f; size--) {
                F(size);
            }
        }

        boolean Q(E e4) {
            if (e4.isRemoved()) {
                if (!RecyclerView.sDebugAssertionsEnabled || RecyclerView.this.mState.e()) {
                    return RecyclerView.this.mState.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
            }
            int i4 = e4.mPosition;
            if (i4 >= 0 && i4 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.e() || RecyclerView.this.mAdapter.getItemViewType(e4.mPosition) == e4.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || e4.getItemId() == RecyclerView.this.mAdapter.getItemId(e4.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e4 + RecyclerView.this.exceptionLabel());
        }

        void R(int i4, int i5) {
            int i6;
            int i7 = i5 + i4;
            for (int size = this.f12937c.size() - 1; size >= 0; size--) {
                E e4 = (E) this.f12937c.get(size);
                if (e4 != null && (i6 = e4.mPosition) >= i4 && i6 < i7) {
                    e4.addFlags(2);
                    F(size);
                }
            }
        }

        void a(E e4, boolean z4) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(e4);
            View view = e4.itemView;
            androidx.recyclerview.widget.r rVar = RecyclerView.this.mAccessibilityDelegate;
            if (rVar != null) {
                C1280a itemDelegate = rVar.getItemDelegate();
                AbstractC1281a0.o0(view, itemDelegate instanceof r.a ? ((r.a) itemDelegate).getAndRemoveOriginalDelegateForItem(view) : null);
            }
            if (z4) {
                g(e4);
            }
            e4.mBindingAdapter = null;
            e4.mOwnerRecyclerView = null;
            i().putRecycledView(e4);
        }

        public void c() {
            this.f12935a.clear();
            E();
        }

        void d() {
            int size = this.f12937c.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((E) this.f12937c.get(i4)).clearOldPosition();
            }
            int size2 = this.f12935a.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((E) this.f12935a.get(i5)).clearOldPosition();
            }
            ArrayList arrayList = this.f12936b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ((E) this.f12936b.get(i6)).clearOldPosition();
                }
            }
        }

        void e() {
            this.f12935a.clear();
            ArrayList arrayList = this.f12936b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i4) {
            if (i4 >= 0 && i4 < RecyclerView.this.mState.b()) {
                return !RecyclerView.this.mState.e() ? i4 : RecyclerView.this.mAdapterHelper.m(i4);
            }
            throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        void g(E e4) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.mRecyclerListeners.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.mRecyclerListeners.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.onViewRecycled(e4);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(e4);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + e4);
            }
        }

        E h(int i4) {
            int size;
            int m4;
            ArrayList arrayList = this.f12936b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    E e4 = (E) this.f12936b.get(i5);
                    if (!e4.wasReturnedFromScrap() && e4.getLayoutPosition() == i4) {
                        e4.addFlags(32);
                        return e4;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m4 = RecyclerView.this.mAdapterHelper.m(i4)) > 0 && m4 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m4);
                    for (int i6 = 0; i6 < size; i6++) {
                        E e5 = (E) this.f12936b.get(i6);
                        if (!e5.wasReturnedFromScrap() && e5.getItemId() == itemId) {
                            e5.addFlags(32);
                            return e5;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f12941g == null) {
                this.f12941g = new v();
                u();
            }
            return this.f12941g;
        }

        int j() {
            return this.f12935a.size();
        }

        public List k() {
            return this.f12938d;
        }

        E l(long j4, int i4, boolean z4) {
            for (int size = this.f12935a.size() - 1; size >= 0; size--) {
                E e4 = (E) this.f12935a.get(size);
                if (e4.getItemId() == j4 && !e4.wasReturnedFromScrap()) {
                    if (i4 == e4.getItemViewType()) {
                        e4.addFlags(32);
                        if (e4.isRemoved() && !RecyclerView.this.mState.e()) {
                            e4.setFlags(2, 14);
                        }
                        return e4;
                    }
                    if (!z4) {
                        this.f12935a.remove(size);
                        RecyclerView.this.removeDetachedView(e4.itemView, false);
                        D(e4.itemView);
                    }
                }
            }
            int size2 = this.f12937c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                E e5 = (E) this.f12937c.get(size2);
                if (e5.getItemId() == j4 && !e5.isAttachedToTransitionOverlay()) {
                    if (i4 == e5.getItemViewType()) {
                        if (!z4) {
                            this.f12937c.remove(size2);
                        }
                        return e5;
                    }
                    if (!z4) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        E m(int i4, boolean z4) {
            View e4;
            int size = this.f12935a.size();
            for (int i5 = 0; i5 < size; i5++) {
                E e5 = (E) this.f12935a.get(i5);
                if (!e5.wasReturnedFromScrap() && e5.getLayoutPosition() == i4 && !e5.isInvalid() && (RecyclerView.this.mState.f12882h || !e5.isRemoved())) {
                    e5.addFlags(32);
                    return e5;
                }
            }
            if (!z4 && (e4 = RecyclerView.this.mChildHelper.e(i4)) != null) {
                E childViewHolderInt = RecyclerView.getChildViewHolderInt(e4);
                RecyclerView.this.mChildHelper.s(e4);
                int m4 = RecyclerView.this.mChildHelper.m(e4);
                if (m4 != -1) {
                    RecyclerView.this.mChildHelper.d(m4);
                    I(e4);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f12937c.size();
            for (int i6 = 0; i6 < size2; i6++) {
                E e6 = (E) this.f12937c.get(i6);
                if (!e6.isInvalid() && e6.getLayoutPosition() == i4 && !e6.isAttachedToTransitionOverlay()) {
                    if (!z4) {
                        this.f12937c.remove(i6);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i4 + ") found match in cache: " + e6);
                    }
                    return e6;
                }
            }
            return null;
        }

        View n(int i4) {
            return ((E) this.f12935a.get(i4)).itemView;
        }

        public View o(int i4) {
            return p(i4, false);
        }

        View p(int i4, boolean z4) {
            return N(i4, z4, Long.MAX_VALUE).itemView;
        }

        void s() {
            int size = this.f12937c.size();
            for (int i4 = 0; i4 < size; i4++) {
                q qVar = (q) ((E) this.f12937c.get(i4)).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f12929c = true;
                }
            }
        }

        void t() {
            int size = this.f12937c.size();
            for (int i4 = 0; i4 < size; i4++) {
                E e4 = (E) this.f12937c.get(i4);
                if (e4 != null) {
                    e4.addFlags(6);
                    e4.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.hasStableIds()) {
                E();
            }
        }

        void v(int i4, int i5) {
            int size = this.f12937c.size();
            for (int i6 = 0; i6 < size; i6++) {
                E e4 = (E) this.f12937c.get(i6);
                if (e4 != null && e4.mPosition >= i4) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i6 + " holder " + e4 + " now at position " + (e4.mPosition + i5));
                    }
                    e4.offsetPosition(i5, false);
                }
            }
        }

        void w(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int i9;
            if (i4 < i5) {
                i6 = -1;
                i8 = i4;
                i7 = i5;
            } else {
                i6 = 1;
                i7 = i4;
                i8 = i5;
            }
            int size = this.f12937c.size();
            for (int i10 = 0; i10 < size; i10++) {
                E e4 = (E) this.f12937c.get(i10);
                if (e4 != null && (i9 = e4.mPosition) >= i8 && i9 <= i7) {
                    if (i9 == i4) {
                        e4.offsetPosition(i5 - i4, false);
                    } else {
                        e4.offsetPosition(i6, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i10 + " holder " + e4);
                    }
                }
            }
        }

        void x(int i4, int i5, boolean z4) {
            int i6 = i4 + i5;
            for (int size = this.f12937c.size() - 1; size >= 0; size--) {
                E e4 = (E) this.f12937c.get(size);
                if (e4 != null) {
                    int i7 = e4.mPosition;
                    if (i7 >= i6) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + e4 + " now at position " + (e4.mPosition - i5));
                        }
                        e4.offsetPosition(-i5, z4);
                    } else if (i7 >= i4) {
                        e4.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z4) {
            c();
            C(hVar, true);
            i().onAdapterChanged(hVar, hVar2, z4);
            u();
        }

        void z() {
            u();
        }
    }

    public interface x {
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f12881g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i4, int i5, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i4, i5, obj)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i4, int i5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i4, i5)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i4, int i5, int i6) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i4, i5, i6)) {
                f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i4, int i5) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i4, i5)) {
                f();
            }
        }

        void f() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    AbstractC1281a0.g0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onStateRestorationPolicyChanged() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    public static abstract class z {
        private p mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f12944a;

            /* renamed from: b, reason: collision with root package name */
            private int f12945b;

            /* renamed from: c, reason: collision with root package name */
            private int f12946c;

            /* renamed from: d, reason: collision with root package name */
            private int f12947d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f12948e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f12949f;

            /* renamed from: g, reason: collision with root package name */
            private int f12950g;

            public a(int i4, int i5) {
                this(i4, i5, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f12948e != null && this.f12946c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f12946c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f12947d >= 0;
            }

            public void b(int i4) {
                this.f12947d = i4;
            }

            void c(RecyclerView recyclerView) {
                int i4 = this.f12947d;
                if (i4 >= 0) {
                    this.f12947d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i4);
                    this.f12949f = false;
                } else {
                    if (!this.f12949f) {
                        this.f12950g = 0;
                        return;
                    }
                    e();
                    recyclerView.mViewFlinger.e(this.f12944a, this.f12945b, this.f12946c, this.f12948e);
                    int i5 = this.f12950g + 1;
                    this.f12950g = i5;
                    if (i5 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f12949f = false;
                }
            }

            public void d(int i4, int i5, int i6, Interpolator interpolator) {
                this.f12944a = i4;
                this.f12945b = i5;
                this.f12946c = i6;
                this.f12948e = interpolator;
                this.f12949f = true;
            }

            public a(int i4, int i5, int i6, Interpolator interpolator) {
                this.f12947d = -1;
                this.f12949f = false;
                this.f12950g = 0;
                this.f12944a = i4;
                this.f12945b = i5;
                this.f12946c = i6;
                this.f12948e = interpolator;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i4);
        }

        public PointF computeScrollVectorForPosition(int i4) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i4);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i4) {
            return this.mRecyclerView.mLayout.findViewByPosition(i4);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public p getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(PointF pointF) {
            float f4 = pointF.x;
            float f5 = pointF.y;
            float sqrt = (float) Math.sqrt((f4 * f4) + (f5 * f5));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void onAnimation(int i4, int i5) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f4 = computeScrollVectorForPosition.x;
                if (f4 != RecyclerView.DECELERATION_RATE || computeScrollVectorForPosition.y != RecyclerView.DECELERATION_RATE) {
                    recyclerView.scrollStep((int) Math.signum(f4), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.c(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i4, i5, recyclerView.mState, this.mRecyclingAction);
                boolean a4 = this.mRecyclingAction.a();
                this.mRecyclingAction.c(recyclerView);
                if (a4 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.d();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void onSeekTargetStep(int i4, int i5, A a4, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, A a4, a aVar);

        public void setTargetPosition(int i4) {
            this.mTargetPosition = i4;
        }

        void start(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.f();
            if (this.mStarted) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = pVar;
            int i4 = this.mTargetPosition;
            if (i4 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f12875a = i4;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.d();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f12875a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC1362c();
        sDefaultEdgeEffectFactory = new B();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A(float f4, float f5, float f6, float f7) {
        boolean z4;
        boolean z5 = true;
        if (f5 < DECELERATION_RATE) {
            ensureLeftGlow();
            androidx.core.widget.f.d(this.mLeftGlow, (-f5) / getWidth(), 1.0f - (f6 / getHeight()));
        } else {
            if (f5 <= DECELERATION_RATE) {
                z4 = false;
                if (f7 >= DECELERATION_RATE) {
                    ensureTopGlow();
                    androidx.core.widget.f.d(this.mTopGlow, (-f7) / getHeight(), f4 / getWidth());
                } else if (f7 > DECELERATION_RATE) {
                    ensureBottomGlow();
                    androidx.core.widget.f.d(this.mBottomGlow, f7 / getHeight(), 1.0f - (f4 / getWidth()));
                } else {
                    z5 = z4;
                }
                if (z5 && f5 == DECELERATION_RATE && f7 == DECELERATION_RATE) {
                    return;
                }
                AbstractC1281a0.f0(this);
            }
            ensureRightGlow();
            androidx.core.widget.f.d(this.mRightGlow, f5 / getWidth(), f6 / getHeight());
        }
        z4 = true;
        if (f7 >= DECELERATION_RATE) {
        }
        if (z5) {
        }
        AbstractC1281a0.f0(this);
    }

    private void B() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        E findViewHolderForItemId = (this.mState.f12888n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f12888n);
        if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            view = n();
        }
        if (view != null) {
            int i4 = this.mState.f12889o;
            if (i4 != -1 && (findViewById = view.findViewById(i4)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void C() {
        boolean z4;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.mLeftGlow.isFinished();
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.mBottomGlow.isFinished();
        }
        if (z4) {
            AbstractC1281a0.f0(this);
        }
    }

    private int D(int i4, float f4) {
        float height = f4 / getHeight();
        float width = i4 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f5 = DECELERATION_RATE;
        if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float d4 = androidx.core.widget.f.d(this.mRightGlow, width, height);
                    if (androidx.core.widget.f.b(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f5 = d4;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f6 = -androidx.core.widget.f.d(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.f.b(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * getWidth());
    }

    private int E(int i4, float f4) {
        float width = f4 / getWidth();
        float height = i4 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f5 = DECELERATION_RATE;
        if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float d4 = androidx.core.widget.f.d(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.f.b(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f5 = d4;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f6 = -androidx.core.widget.f.d(this.mTopGlow, -height, width);
                if (androidx.core.widget.f.b(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f5 = f6;
            }
            invalidate();
        }
        return Math.round(f5 * getHeight());
    }

    private void F(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f12929c) {
                Rect rect = qVar.f12928b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void G() {
        A a4 = this.mState;
        a4.f12888n = -1L;
        a4.f12887m = -1;
        a4.f12889o = -1;
    }

    private void H() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        C();
    }

    private void I() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        E findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            G();
            return;
        }
        this.mState.f12888n = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.f12887m = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f12889o = o(findContainingViewHolder.itemView);
    }

    private void J(h hVar, boolean z4, boolean z5) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z4 || z5) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        h hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onAdapterChanged(hVar3, this.mAdapter);
        }
        this.mRecycler.y(hVar3, this.mAdapter, z4);
        this.mState.f12881g = true;
    }

    private boolean K(EdgeEffect edgeEffect, int i4, int i5) {
        if (i4 > 0) {
            return true;
        }
        return q(-i4) < androidx.core.widget.f.b(edgeEffect) * ((float) i5);
    }

    private boolean L(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == DECELERATION_RATE || canScrollHorizontally(-1)) {
            z4 = false;
        } else {
            androidx.core.widget.f.d(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z4 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            androidx.core.widget.f.d(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z4 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.f.b(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            androidx.core.widget.f.d(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z4 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.f.b(edgeEffect4) == DECELERATION_RATE || canScrollVertically(1)) {
            return z4;
        }
        androidx.core.widget.f.d(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void M() {
        this.mViewFlinger.f();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.stopSmoothScroller();
        }
    }

    private void a(E e4) {
        View view = e4.itemView;
        boolean z4 = view.getParent() == this;
        this.mRecycler.O(getChildViewHolder(view));
        if (e4.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (z4) {
            this.mChildHelper.k(view);
        } else {
            this.mChildHelper.b(view, true);
        }
    }

    private void b(E e4, E e5, m.b bVar, m.b bVar2, boolean z4, boolean z5) {
        e4.setIsRecyclable(false);
        if (z4) {
            a(e4);
        }
        if (e4 != e5) {
            if (z5) {
                a(e5);
            }
            e4.mShadowedHolder = e5;
            a(e4);
            this.mRecycler.O(e4);
            e5.setIsRecyclable(false);
            e5.mShadowingHolder = e4;
        }
        if (this.mItemAnimator.b(e4, e5, bVar, bVar2)) {
            postAnimationRunner();
        }
    }

    private void c() {
        H();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(E e4) {
        WeakReference<RecyclerView> weakReference = e4.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == e4.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            e4.mNestedRecyclerView = null;
        }
    }

    private int d(int i4, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i5) {
        if (i4 > 0 && edgeEffect != null && androidx.core.widget.f.b(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(((-i5) / 4.0f) * androidx.core.widget.f.d(edgeEffect, ((-i4) * 4.0f) / i5, 0.5f));
            if (round != i4) {
                edgeEffect.finish();
            }
            return i4 - round;
        }
        if (i4 >= 0 || edgeEffect2 == null || androidx.core.widget.f.b(edgeEffect2) == DECELERATION_RATE) {
            return i4;
        }
        float f4 = i5;
        int round2 = Math.round((f4 / 4.0f) * androidx.core.widget.f.d(edgeEffect2, (i4 * 4.0f) / f4, 0.5f));
        if (round2 != i4) {
            edgeEffect2.finish();
        }
        return i4 - round2;
    }

    private void e(Context context, String str, AttributeSet attributeSet, int i4, int i5) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String p4 = p(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(p4, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), Integer.valueOf(i5)};
                } catch (NoSuchMethodException e4) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e5) {
                        e5.initCause(e4);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + p4, e5);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + p4, e6);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + p4, e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + p4, e8);
            } catch (InstantiationException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p4, e9);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + p4, e10);
            }
        }
    }

    private boolean f(int i4, int i5) {
        m(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i4 && iArr[1] == i5) ? false : true;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i4));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private void g() {
        int i4 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i4 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(com.ironsource.mediationsdk.metadata.a.f17688n);
        B.b.b(obtain, i4);
        sendAccessibilityEventUnchecked(obtain);
    }

    static E getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f12927a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f12928b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private F getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new F(this);
        }
        return this.mScrollingChildHelper;
    }

    private void h() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f12884j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        z();
        I();
        A a4 = this.mState;
        a4.f12883i = a4.f12885k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a4.f12882h = a4.f12886l;
        a4.f12880f = this.mAdapter.getItemCount();
        m(this.mMinMaxLayoutPositions);
        if (this.mState.f12885k) {
            int g4 = this.mChildHelper.g();
            for (int i4 = 0; i4 < g4; i4++) {
                E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.t(this.mState, childViewHolderInt, m.e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f12883i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f12886l) {
            saveOldPositions();
            A a5 = this.mState;
            boolean z4 = a5.f12881g;
            a5.f12881g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, a5);
            this.mState.f12881g = z4;
            for (int i5 = 0; i5 < this.mChildHelper.g(); i5++) {
                E childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i5));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int e4 = m.e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e4 |= Base64Utils.IO_BUFFER_SIZE;
                    }
                    m.b t4 = this.mItemAnimator.t(this.mState, childViewHolderInt2, e4, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, t4);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, t4);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f12879e = 2;
    }

    private void i() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f12880f = this.mAdapter.getItemCount();
        this.mState.f12878d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f12899b;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        A a4 = this.mState;
        a4.f12882h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, a4);
        A a5 = this.mState;
        a5.f12881g = false;
        a5.f12885k = a5.f12885k && this.mItemAnimator != null;
        a5.f12879e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void j() {
        RecyclerView recyclerView;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        A a4 = this.mState;
        a4.f12879e = 1;
        if (a4.f12885k) {
            for (int g4 = this.mChildHelper.g() - 1; g4 >= 0; g4--) {
                E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g4));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.b s4 = this.mItemAnimator.s(this.mState, childViewHolderInt);
                    E g5 = this.mViewInfoStore.g(changedHolderKey);
                    if (g5 == null || g5.shouldIgnore()) {
                        this.mViewInfoStore.d(childViewHolderInt, s4);
                    } else {
                        boolean h4 = this.mViewInfoStore.h(g5);
                        boolean h5 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h4 && g5 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, s4);
                        } else {
                            m.b n4 = this.mViewInfoStore.n(g5);
                            this.mViewInfoStore.d(childViewHolderInt, s4);
                            m.b m4 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n4 == null) {
                                r(changedHolderKey, childViewHolderInt, g5);
                            } else {
                                b(g5, childViewHolderInt, n4, m4, h4, h5);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.mViewInfoStore.o(recyclerView.mViewInfoProcessCallback);
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        A a5 = recyclerView.mState;
        a5.f12877c = a5.f12880f;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        a5.f12885k = false;
        a5.f12886l = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = recyclerView.mRecycler.f12936b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.mLayout;
        if (pVar.mPrefetchMaxObservedInInitialPrefetch) {
            pVar.mPrefetchMaxCountObserved = 0;
            pVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.P();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        recyclerView.mViewInfoStore.f();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (f(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        B();
        G();
    }

    private boolean k(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return l(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean l(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            t tVar = this.mOnItemTouchListeners.get(i4);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void m(int[] iArr) {
        int g4 = this.mChildHelper.g();
        if (g4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < g4; i6++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i6));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i4) {
                    i4 = layoutPosition;
                }
                if (layoutPosition > i5) {
                    i5 = layoutPosition;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    private View n() {
        E findViewHolderForAdapterPosition;
        A a4 = this.mState;
        int i4 = a4.f12887m;
        if (i4 == -1) {
            i4 = 0;
        }
        int b4 = a4.b();
        for (int i5 = i4; i5 < b4; i5++) {
            E findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i5);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b4, i4);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    private int o(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String p(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + JwtParser.SEPARATOR_CHAR + str;
    }

    private float q(int i4) {
        double log = Math.log((Math.abs(i4) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        float f4 = DECELERATION_RATE;
        return (float) (this.mPhysicalCoef * 0.015f * Math.exp((f4 / (f4 - 1.0d)) * log));
    }

    private void r(long j4, E e4, E e5) {
        int g4 = this.mChildHelper.g();
        for (int i4 = 0; i4 < g4; i4++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (childViewHolderInt != e4 && getChangedHolderKey(childViewHolderInt) == j4) {
                h hVar = this.mAdapter;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + e4 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + e4 + exceptionLabel());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e5 + " cannot be found but it is necessary for " + e4 + exceptionLabel());
    }

    private boolean s() {
        int g4 = this.mChildHelper.g();
        for (int i4 = 0; i4 < g4; i4++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public static void setDebugAssertionsEnabled(boolean z4) {
        sDebugAssertionsEnabled = z4;
    }

    public static void setVerboseLoggingEnabled(boolean z4) {
        sVerboseLoggingEnabled = z4;
    }

    private void t() {
        if (AbstractC1281a0.B(this) == 0) {
            AbstractC1281a0.B0(this, 8);
        }
    }

    private void u() {
        this.mChildHelper = new androidx.recyclerview.widget.f(new C1364e());
    }

    private boolean v(View view, View view2, int i4) {
        int i5;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c4 = 65535;
        int i6 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i7 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i8 = rect2.left;
        if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
            i5 = 1;
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
            c4 = 1;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && i11 < i14) || i11 <= i12) {
                c4 = 0;
            }
        }
        if (i4 == 1) {
            return c4 < 0 || (c4 == 0 && i5 * i6 < 0);
        }
        if (i4 == 2) {
            return c4 > 0 || (c4 == 0 && i5 * i6 > 0);
        }
        if (i4 == 17) {
            return i5 < 0;
        }
        if (i4 == 33) {
            return c4 < 0;
        }
        if (i4 == 66) {
            return i5 > 0;
        }
        if (i4 == 130) {
            return c4 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i4 + exceptionLabel());
    }

    private void w(int i4, int i5, MotionEvent motionEvent, int i6) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i7 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int D4 = i4 - D(i4, height);
        int E4 = i5 - E(i5, width);
        startNestedScroll(i7, i6);
        if (dispatchNestedPreScroll(canScrollHorizontally ? D4 : 0, canScrollVertically ? E4 : 0, this.mReusableIntPair, this.mScrollOffset, i6)) {
            int[] iArr2 = this.mReusableIntPair;
            D4 -= iArr2[0];
            E4 -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? D4 : 0, canScrollVertically ? E4 : 0, motionEvent, i6);
        androidx.recyclerview.widget.j jVar = this.mGapWorker;
        if (jVar != null && (D4 != 0 || E4 != 0)) {
            jVar.f(this, D4, E4);
        }
        stopNestedScroll(i6);
    }

    private void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        }
    }

    private boolean y() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void z() {
        boolean z4;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (y()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z5 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f12885k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z4 = this.mDataSetHasChangedAfterLayout) || z5 || this.mLayout.mRequestedSimpleAnimations) && (!z4 || this.mAdapter.hasStableIds());
        A a4 = this.mState;
        a4.f12886l = a4.f12885k && z5 && !this.mDataSetHasChangedAfterLayout && y();
    }

    void absorbGlows(int i4, int i5) {
        if (i4 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i4);
            }
        }
        if (i5 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i5);
            }
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        AbstractC1281a0.f0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i4, int i5) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.onAddFocusables(this, arrayList, i4, i5)) {
            super.addFocusables(arrayList, i4, i5);
        }
    }

    public void addItemDecoration(o oVar, int i4) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i4 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i4, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    void animateAppearance(E e4, m.b bVar, m.b bVar2) {
        e4.setIsRecyclable(false);
        if (this.mItemAnimator.a(e4, bVar, bVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(E e4, m.b bVar, m.b bVar2) {
        a(e4);
        e4.setIsRecyclable(false);
        if (this.mItemAnimator.c(e4, bVar, bVar2)) {
            postAnimationRunner();
        }
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(E e4) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.g(e4, e4.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.checkLayoutParams((q) layoutParams);
    }

    void clearOldPositions() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i4, int i5) {
        boolean z4;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z4 = false;
        } else {
            this.mLeftGlow.onRelease();
            z4 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.mRightGlow.onRelease();
            z4 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.mTopGlow.onRelease();
            z4 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.mBottomGlow.onRelease();
            z4 |= this.mBottomGlow.isFinished();
        }
        if (z4) {
            AbstractC1281a0.f0(this);
        }
    }

    int consumeFlingInHorizontalStretch(int i4) {
        return d(i4, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i4) {
        return d(i4, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.n.a("RV FullInvalidate");
            dispatchLayout();
            androidx.core.os.n.b();
            return;
        }
        if (this.mAdapterHelper.p()) {
            if (!this.mAdapterHelper.o(4) || this.mAdapterHelper.o(11)) {
                if (this.mAdapterHelper.p()) {
                    androidx.core.os.n.a("RV FullInvalidate");
                    dispatchLayout();
                    androidx.core.os.n.b();
                    return;
                }
                return;
            }
            androidx.core.os.n.a("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.w();
            if (!this.mLayoutWasDefered) {
                if (s()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.i();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            androidx.core.os.n.b();
        }
    }

    void defaultOnMeasure(int i4, int i5) {
        setMeasuredDimension(p.chooseSize(i4, getPaddingLeft() + getPaddingRight(), AbstractC1281a0.E(this)), p.chooseSize(i5, getPaddingTop() + getPaddingBottom(), AbstractC1281a0.D(this)));
    }

    void dispatchChildAttached(View view) {
        E childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        E childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f12884j = false;
        boolean z4 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f12879e == 1) {
            h();
            this.mLayout.setExactMeasureSpecsFrom(this);
            i();
        } else if (this.mAdapterHelper.q() || z4 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            i();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        j();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return getScrollingChildHelper().a(f4, f5, z4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().f(i4, i5, i6, i7, iArr);
    }

    void dispatchOnScrollStateChanged(int i4) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onScrollStateChanged(i4);
        }
        onScrollStateChanged(i4);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrollStateChanged(this, i4);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i4);
            }
        }
    }

    void dispatchOnScrolled(int i4, int i5) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        onScrolled(i4, i5);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrolled(this, i4, i5);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i4, i5);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i4;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            E e4 = this.mPendingAccessibilityImportanceChange.get(size);
            if (e4.itemView.getParent() == this && !e4.shouldIgnore() && (i4 = e4.mPendingAccessibilityState) != -1) {
                AbstractC1281a0.z0(e4.itemView, i4);
                e4.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(save4);
        }
        if ((z4 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.p()) ? z4 : true) {
            AbstractC1281a0.f0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a4 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a4;
        if (this.mClipToPadding) {
            a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a4.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a4 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a4;
        if (this.mClipToPadding) {
            a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a4.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a4 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a4;
        if (this.mClipToPadding) {
            a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a4.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a4 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a4;
        if (this.mClipToPadding) {
            a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a4.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(A a4) {
        if (getScrollState() != 2) {
            a4.f12890p = 0;
            a4.f12891q = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f12894d;
            a4.f12890p = overScroller.getFinalX() - overScroller.getCurrX();
            a4.f12891q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public E findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public E findViewHolderForAdapterPosition(int i4) {
        E e4 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j4 = this.mChildHelper.j();
        for (int i5 = 0; i5 < j4; i5++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i4) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                e4 = childViewHolderInt;
            }
        }
        return e4;
    }

    public E findViewHolderForItemId(long j4) {
        h hVar = this.mAdapter;
        E e4 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j5 = this.mChildHelper.j();
            for (int i4 = 0; i4 < j5; i4++) {
                E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j4) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    e4 = childViewHolderInt;
                }
            }
        }
        return e4;
    }

    public E findViewHolderForLayoutPosition(int i4) {
        return findViewHolderForPosition(i4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    E findViewHolderForPosition(int i4, boolean z4) {
        int j4 = this.mChildHelper.j();
        E e4 = null;
        for (int i5 = 0; i5 < j4; i5++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z4) {
                    if (childViewHolderInt.mPosition != i4) {
                        continue;
                    }
                    if (this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    e4 = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i4) {
                        continue;
                    }
                    if (this.mChildHelper.n(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fling(int i4, int i5) {
        int i6;
        int i7;
        float f4;
        float f5;
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally == 0 || Math.abs(i4) < this.mMinFlingVelocity) {
            i4 = 0;
        }
        if (!canScrollVertically || Math.abs(i5) < this.mMinFlingVelocity) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        if (i4 != 0) {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == DECELERATION_RATE) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != DECELERATION_RATE) {
                    if (K(this.mRightGlow, i4, getWidth())) {
                        this.mRightGlow.onAbsorb(i4);
                        i4 = 0;
                    }
                    i6 = i4;
                    i4 = 0;
                }
            } else {
                int i8 = -i4;
                if (K(this.mLeftGlow, i8, getWidth())) {
                    this.mLeftGlow.onAbsorb(i8);
                    i4 = 0;
                }
                i6 = i4;
                i4 = 0;
            }
            if (i5 != 0) {
                EdgeEffect edgeEffect3 = this.mTopGlow;
                if (edgeEffect3 == null || androidx.core.widget.f.b(edgeEffect3) == DECELERATION_RATE) {
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && androidx.core.widget.f.b(edgeEffect4) != DECELERATION_RATE) {
                        if (K(this.mBottomGlow, i5, getHeight())) {
                            this.mBottomGlow.onAbsorb(i5);
                            i5 = 0;
                        }
                        i7 = 0;
                    }
                } else {
                    int i9 = -i5;
                    if (K(this.mTopGlow, i9, getHeight())) {
                        this.mTopGlow.onAbsorb(i9);
                        i5 = 0;
                    }
                    i7 = 0;
                }
                if (i6 == 0 || i5 != 0) {
                    int i10 = this.mMaxFlingVelocity;
                    i6 = Math.max(-i10, Math.min(i6, i10));
                    int i11 = this.mMaxFlingVelocity;
                    i5 = Math.max(-i11, Math.min(i5, i11));
                    this.mViewFlinger.b(i6, i5);
                }
                if (i4 != 0 && i7 == 0) {
                    return (i6 == 0 && i5 == 0) ? false : true;
                }
                f4 = i4;
                f5 = i7;
                if (!dispatchNestedPreFling(f4, f5)) {
                    boolean z4 = canScrollHorizontally != 0 || canScrollVertically;
                    dispatchNestedFling(f4, f5, z4);
                    s sVar = this.mOnFlingListener;
                    if (sVar != null && sVar.onFling(i4, i7)) {
                        return true;
                    }
                    if (z4) {
                        if (canScrollVertically) {
                            canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                        }
                        startNestedScroll(canScrollHorizontally, 1);
                        int i12 = this.mMaxFlingVelocity;
                        int max = Math.max(-i12, Math.min(i4, i12));
                        int i13 = this.mMaxFlingVelocity;
                        this.mViewFlinger.b(max, Math.max(-i13, Math.min(i7, i13)));
                        return true;
                    }
                }
                return false;
            }
            i7 = i5;
            i5 = 0;
            if (i6 == 0) {
            }
            int i102 = this.mMaxFlingVelocity;
            i6 = Math.max(-i102, Math.min(i6, i102));
            int i112 = this.mMaxFlingVelocity;
            i5 = Math.max(-i112, Math.min(i5, i112));
            this.mViewFlinger.b(i6, i5);
            if (i4 != 0) {
            }
            f4 = i4;
            f5 = i7;
            if (!dispatchNestedPreFling(f4, f5)) {
            }
            return false;
        }
        i6 = 0;
        if (i5 != 0) {
        }
        i7 = i5;
        i5 = 0;
        if (i6 == 0) {
        }
        int i1022 = this.mMaxFlingVelocity;
        i6 = Math.max(-i1022, Math.min(i6, i1022));
        int i1122 = this.mMaxFlingVelocity;
        i5 = Math.max(-i1122, Math.min(i5, i1122));
        this.mViewFlinger.b(i6, i5);
        if (i4 != 0) {
        }
        f4 = i4;
        f5 = i7;
        if (!dispatchNestedPreFling(f4, f5)) {
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i4) {
        View view2;
        boolean z4;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i4);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z5 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z5 && (i4 == 2 || i4 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i5 = i4 == 2 ? 130 : 33;
                z4 = focusFinder.findNextFocus(this, view, i5) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i4 = i5;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.mLayout.canScrollHorizontally()) {
                int i6 = (this.mLayout.getLayoutDirection() == 1) ^ (i4 == 2) ? 66 : 17;
                boolean z6 = focusFinder.findNextFocus(this, view, i6) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i4 = i6;
                }
                z4 = z6;
            }
            if (z4) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i4, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i4);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i4);
            if (findNextFocus == null && z5) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i4, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return v(view, view2, i4) ? view2 : super.focusSearch(view, i4);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i4);
        }
        F(view2, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(E e4) {
        if (e4.hasAnyOfTheFlags(IronSourceError.ERROR_PLACEMENT_CAPPED) || !e4.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.e(e4.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        return pVar != null ? pVar.getBaseline() : super.getBaseline();
    }

    long getChangedHolderKey(E e4) {
        return this.mAdapter.hasStableIds() ? e4.getItemId() : e4.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        E childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    public int getChildLayoutPosition(View view) {
        E childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public E getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.r getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f12929c) {
            return qVar.f12928b;
        }
        if (this.mState.e() && (qVar.b() || qVar.d())) {
            return qVar.f12928b;
        }
        Rect rect = qVar.f12928b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i4).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i5 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f12929c = false;
        return rect;
    }

    public o getItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            return this.mItemDecorations.get(i4);
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC2426b.f36666a), resources.getDimensionPixelSize(AbstractC2426b.f36668c), resources.getDimensionPixelOffset(AbstractC2426b.f36667b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    void jumpToPositionForSmoothScroller(int i4) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i4);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            ((q) this.mChildHelper.i(i4).getLayoutParams()).f12929c = true;
        }
        this.mRecycler.s();
    }

    void markKnownViewsInvalid() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void offsetChildrenHorizontal(int i4) {
        int g4 = this.mChildHelper.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.mChildHelper.f(i5).offsetLeftAndRight(i4);
        }
    }

    public void offsetChildrenVertical(int i4) {
        int g4 = this.mChildHelper.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.mChildHelper.f(i5).offsetTopAndBottom(i4);
        }
    }

    void offsetPositionRecordsForInsert(int i4, int i5) {
        int j4 = this.mChildHelper.j();
        for (int i6 = 0; i6 < j4; i6++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i6));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i4) {
                if (sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i6 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i5));
                }
                childViewHolderInt.offsetPosition(i5, false);
                this.mState.f12881g = true;
            }
        }
        this.mRecycler.v(i4, i5);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int j4 = this.mChildHelper.j();
        if (i4 < i5) {
            i8 = -1;
            i7 = i4;
            i6 = i5;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i10 = 0; i10 < j4; i10++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i7 && i9 <= i6) {
                if (sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i10 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i4) {
                    childViewHolderInt.offsetPosition(i5 - i4, false);
                } else {
                    childViewHolderInt.offsetPosition(i8, false);
                }
                this.mState.f12881g = true;
            }
        }
        this.mRecycler.w(i4, i5);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i4, int i5, boolean z4) {
        int i6 = i4 + i5;
        int j4 = this.mChildHelper.j();
        for (int i7 = 0; i7 < j4; i7++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i8 = childViewHolderInt.mPosition;
                if (i8 >= i6) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i7 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i5));
                    }
                    childViewHolderInt.offsetPosition(-i5, z4);
                    this.mState.f12881g = true;
                } else if (i8 >= i4) {
                    if (sVerboseLoggingEnabled) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i7 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i4 - 1, -i5, z4);
                    this.mState.f12881g = true;
                }
            }
        }
        this.mRecycler.x(i4, i5, z4);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float f4;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.z();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.j.f13145f;
            androidx.recyclerview.widget.j jVar = (androidx.recyclerview.widget.j) threadLocal.get();
            this.mGapWorker = jVar;
            if (jVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.j();
                Display w4 = AbstractC1281a0.w(this);
                if (!isInEditMode() && w4 != null) {
                    f4 = w4.getRefreshRate();
                }
                f4 = 60.0f;
                androidx.recyclerview.widget.j jVar2 = this.mGapWorker;
                jVar2.f13149d = (long) (1.0E9f / f4);
                threadLocal.set(jVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        this.mRecycler.A();
        M.a.b(this);
        if (!ALLOW_THREAD_GAP_WORK || (jVar = this.mGapWorker) == null) {
            return;
        }
        jVar.j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mItemDecorations.get(i4).onDraw(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        float f5;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f4 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f5 = motionEvent.getAxisValue(10);
                    if (f4 == DECELERATION_RATE || f5 != DECELERATION_RATE) {
                        w((int) (f5 * this.mScaledHorizontalScrollFactor), (int) (f4 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f5 = 0.0f;
                if (f4 == DECELERATION_RATE) {
                }
                w((int) (f5 * this.mScaledHorizontalScrollFactor), (int) (f4 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.canScrollVertically()) {
                        f4 = -axisValue;
                        f5 = 0.0f;
                        if (f4 == DECELERATION_RATE) {
                        }
                        w((int) (f5 * this.mScaledHorizontalScrollFactor), (int) (f4 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    } else if (this.mLayout.canScrollHorizontally()) {
                        f5 = axisValue;
                        f4 = 0.0f;
                        if (f4 == DECELERATION_RATE) {
                        }
                        w((int) (f5 * this.mScaledHorizontalScrollFactor), (int) (f4 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f4 = 0.0f;
                f5 = 0.0f;
                if (f4 == DECELERATION_RATE) {
                }
                w((int) (f5 * this.mScaledHorizontalScrollFactor), (int) (f4 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (l(motionEvent)) {
            c();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
            if (L(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = canScrollHorizontally;
            if (canScrollVertically) {
                i4 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i4, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i5 = x5 - this.mInitialTouchX;
                int i6 = y5 - this.mInitialTouchY;
                if (canScrollHorizontally == 0 || Math.abs(i5) <= this.mTouchSlop) {
                    z4 = false;
                } else {
                    this.mLastTouchX = x5;
                    z4 = true;
                }
                if (canScrollVertically && Math.abs(i6) > this.mTouchSlop) {
                    this.mLastTouchY = y5;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            c();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x6;
            this.mInitialTouchX = x6;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y6;
            this.mInitialTouchY = y6;
        } else if (actionMasked == 6) {
            x(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        androidx.core.os.n.a("RV OnLayout");
        dispatchLayout();
        androidx.core.os.n.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i4, i5);
            return;
        }
        boolean z4 = false;
        if (pVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z4 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z4;
            if (z4 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f12879e == 1) {
                h();
            }
            this.mLayout.setMeasureSpecs(i4, i5);
            this.mState.f12884j = true;
            i();
            this.mLayout.setMeasuredDimensionFromChildren(i4, i5);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f12884j = true;
                i();
                this.mLayout.setMeasuredDimensionFromChildren(i4, i5);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            z();
            onExitLayoutOrScroll();
            A a4 = this.mState;
            if (a4.f12886l) {
                a4.f12882h = true;
            } else {
                this.mAdapterHelper.j();
                this.mState.f12882h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f12886l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.mAdapter;
        if (hVar != null) {
            this.mState.f12880f = hVar.getItemCount();
        } else {
            this.mState.f12880f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i4, i5);
        stopInterceptRequestLayout(false);
        this.mState.f12882h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.a(savedState2);
            return savedState;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            savedState.f12899b = pVar.onSaveInstanceState();
            return savedState;
        }
        savedState.f12899b = null;
        return savedState;
    }

    public void onScrollStateChanged(int i4) {
    }

    public void onScrolled(int i4, int i5) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (k(motionEvent)) {
            c();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
            int i4 = canScrollHorizontally;
            if (canScrollVertically) {
                i4 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i4, 0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f4 = canScrollHorizontally != 0 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f5 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f4 == DECELERATION_RATE && f5 == DECELERATION_RATE) || !fling((int) f4, (int) f5)) {
                    setScrollState(0);
                }
                H();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i5 = this.mLastTouchX - x5;
                int i6 = this.mLastTouchY - y5;
                if (this.mScrollState != 1) {
                    if (canScrollHorizontally != 0) {
                        i5 = i5 > 0 ? Math.max(0, i5 - this.mTouchSlop) : Math.min(0, i5 + this.mTouchSlop);
                        if (i5 != 0) {
                            z4 = true;
                            if (canScrollVertically) {
                                i6 = i6 > 0 ? Math.max(0, i6 - this.mTouchSlop) : Math.min(0, i6 + this.mTouchSlop);
                                if (i6 != 0) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                    }
                    z4 = false;
                    if (canScrollVertically) {
                    }
                    if (z4) {
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int D4 = i5 - D(i5, motionEvent.getY());
                    int E4 = i6 - E(i6, motionEvent.getX());
                    if (dispatchNestedPreScroll(canScrollHorizontally != 0 ? D4 : 0, canScrollVertically ? E4 : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        D4 -= iArr4[0];
                        E4 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i7 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i7 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x5 - iArr7[0];
                    this.mLastTouchY = y5 - iArr7[1];
                    if (scrollByInternal(canScrollHorizontally != 0 ? D4 : 0, canScrollVertically ? E4 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.j jVar = this.mGapWorker;
                    if (jVar != null && (D4 != 0 || E4 != 0)) {
                        jVar.f(this, D4, E4);
                    }
                }
            } else if (actionMasked == 3) {
                c();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x6;
                this.mInitialTouchX = x6;
                int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y6;
                this.mInitialTouchY = y6;
            } else if (actionMasked == 6) {
                x(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        AbstractC1281a0.g0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z4) {
        this.mDispatchItemsChangedEvent = z4 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(E e4, m.b bVar) {
        e4.setFlags(0, 8192);
        if (this.mState.f12883i && e4.isUpdated() && !e4.isRemoved() && !e4.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(e4), e4);
        }
        this.mViewInfoStore.e(e4, bVar);
    }

    void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r4 = this.mChildHelper.r(view);
        if (r4) {
            E childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.O(childViewHolderInt);
            this.mRecycler.H(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!r4);
        return r4;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z4) {
        E childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z4);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i4) {
        int itemDecorationCount = getItemDecorationCount();
        if (i4 >= 0 && i4 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i4));
            return;
        }
        throw new IndexOutOfBoundsException(i4 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    void repositionShadowingViews() {
        E e4;
        int g4 = this.mChildHelper.g();
        for (int i4 = 0; i4 < g4; i4++) {
            View f4 = this.mChildHelper.f(i4);
            E childViewHolder = getChildViewHolder(f4);
            if (childViewHolder != null && (e4 = childViewHolder.mShadowingHolder) != null) {
                View view = e4.itemView;
                int left = f4.getLeft();
                int top = f4.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            F(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        int size = this.mOnItemTouchListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mOnItemTouchListeners.get(i4).c(z4);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int j4 = this.mChildHelper.j();
        for (int i4 = 0; i4 < j4; i4++) {
            E childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i4));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i4 = 0;
            }
            if (!canScrollVertically) {
                i5 = 0;
            }
            scrollByInternal(i4, i5, null, 0);
        }
    }

    boolean scrollByInternal(int i4, int i5, MotionEvent motionEvent, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i4, i5, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            i9 = i4 - i11;
            i10 = i5 - i12;
            i8 = i12;
            i7 = i11;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i7, i8, i9, i10, this.mScrollOffset, i6, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i13 = iArr4[0];
        int i14 = i9 - i13;
        int i15 = iArr4[1];
        int i16 = i10 - i15;
        boolean z4 = (i13 == 0 && i15 == 0) ? false : true;
        int i17 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i18 = iArr5[0];
        this.mLastTouchX = i17 - i18;
        int i19 = this.mLastTouchY;
        int i20 = iArr5[1];
        this.mLastTouchY = i19 - i20;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i18;
        iArr6[1] = iArr6[1] + i20;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.D.a(motionEvent, 8194)) {
                A(motionEvent.getX(), i14, motionEvent.getY(), i16);
            }
            considerReleasingGlowsOnScroll(i4, i5);
        }
        if (i7 != 0 || i8 != 0) {
            dispatchOnScrolled(i7, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i7 == 0 && i8 == 0) ? false : true;
    }

    void scrollStep(int i4, int i5, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.n.a("RV Scroll");
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i4 != 0 ? this.mLayout.scrollHorizontallyBy(i4, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i5 != 0 ? this.mLayout.scrollVerticallyBy(i5, this.mRecycler, this.mState) : 0;
        androidx.core.os.n.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i4) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.scrollToPosition(i4);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.r rVar) {
        this.mAccessibilityDelegate = rVar;
        AbstractC1281a0.o0(this, rVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        J(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    boolean setChildImportantForAccessibilityInternal(E e4, int i4) {
        if (!isComputingLayout()) {
            AbstractC1281a0.z0(e4.itemView, i4);
            return true;
        }
        e4.mPendingAccessibilityState = i4;
        this.mPendingAccessibilityImportanceChange.add(e4);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z4;
        super.setClipToPadding(z4);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        A.h.f(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z4) {
        this.mHasFixedSize = z4;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.k();
            this.mItemAnimator.v(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.v(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i4) {
        this.mRecycler.L(i4);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.k();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        this.mChildHelper.o();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.mRecyclerView.exceptionLabel());
            }
            pVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        getScrollingChildHelper().m(z4);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.mPreserveFocusAfterLayout = z4;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    void setScrollState(int i4) {
        if (i4 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "setting scroll state to " + i4 + " from " + this.mScrollState, new Exception());
        }
        this.mScrollState = i4;
        if (i4 != 2) {
            M();
        }
        dispatchOnScrollStateChanged(i4);
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C c4) {
        this.mRecycler.K(c4);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int a4 = accessibilityEvent != null ? B.b.a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= a4 != 0 ? a4 : 0;
        return true;
    }

    public void smoothScrollBy(int i4, int i5) {
        smoothScrollBy(i4, i5, null);
    }

    public void smoothScrollToPosition(int i4) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.smoothScrollToPosition(this, this.mState, i4);
        }
    }

    void startInterceptRequestLayout() {
        int i4 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i4;
        if (i4 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().o(i4);
    }

    void stopInterceptRequestLayout(boolean z4) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z4 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z4 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public void stopScroll() {
        setScrollState(0);
        M();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        if (z4 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    void viewRangeUpdate(int i4, int i5, Object obj) {
        int i6;
        int j4 = this.mChildHelper.j();
        int i7 = i4 + i5;
        for (int i8 = 0; i8 < j4; i8++) {
            View i9 = this.mChildHelper.i(i8);
            E childViewHolderInt = getChildViewHolderInt(i9);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i6 = childViewHolderInt.mPosition) >= i4 && i6 < i7) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) i9.getLayoutParams()).f12929c = true;
            }
        }
        this.mRecycler.R(i4, i5);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2425a.f36665a);
    }

    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().d(i4, i5, iArr, iArr2, i6);
    }

    public final void dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    void onExitLayoutOrScroll(boolean z4) {
        int i4 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i4;
        if (i4 < 1) {
            if (sDebugAssertionsEnabled && i4 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z4) {
                g();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i4, int i5, Interpolator interpolator) {
        smoothScrollBy(i4, i5, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i4, int i5) {
        return getScrollingChildHelper().p(i4, i5);
    }

    public void stopNestedScroll(int i4) {
        getScrollingChildHelper().r(i4);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        Parcelable f12899b;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12899b = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void a(SavedState savedState) {
            this.f12899b = savedState.f12899b;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f12899b, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new androidx.recyclerview.widget.w();
        this.mUpdateChildViewsRunnable = new RunnableC1360a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.g();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new D();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new j.b() : null;
        this.mState = new A();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC1361b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C1363d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = AbstractC1289e0.f(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = AbstractC1289e0.j(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.v(this.mItemAnimatorListener);
        initAdapterManager();
        u();
        t();
        if (AbstractC1281a0.A(this) == 0) {
            AbstractC1281a0.z0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.r(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2427c.f36669a, i4, 0);
        AbstractC1281a0.m0(this, context, AbstractC2427c.f36669a, attributeSet, obtainStyledAttributes, i4, 0);
        String string = obtainStyledAttributes.getString(AbstractC2427c.f36678j);
        if (obtainStyledAttributes.getInt(AbstractC2427c.f36672d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(AbstractC2427c.f36671c, true);
        boolean z4 = obtainStyledAttributes.getBoolean(AbstractC2427c.f36673e, false);
        this.mEnableFastScroller = z4;
        if (z4) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC2427c.f36676h), obtainStyledAttributes.getDrawable(AbstractC2427c.f36677i), (StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC2427c.f36674f), obtainStyledAttributes.getDrawable(AbstractC2427c.f36675g));
        }
        obtainStyledAttributes.recycle();
        e(context, string, attributeSet, i4, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        AbstractC1281a0.m0(this, context, iArr, attributeSet, obtainStyledAttributes2, i4, 0);
        boolean z5 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
        M.a.d(this, true);
    }

    public void smoothScrollBy(int i4, int i5, Interpolator interpolator, int i6) {
        smoothScrollBy(i4, i5, interpolator, i6, false);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        E f12927a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f12928b;

        /* renamed from: c, reason: collision with root package name */
        boolean f12929c;

        /* renamed from: d, reason: collision with root package name */
        boolean f12930d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12928b = new Rect();
            this.f12929c = true;
            this.f12930d = false;
        }

        public int a() {
            return this.f12927a.getLayoutPosition();
        }

        public boolean b() {
            return this.f12927a.isUpdated();
        }

        public boolean c() {
            return this.f12927a.isRemoved();
        }

        public boolean d() {
            return this.f12927a.isInvalid();
        }

        public q(int i4, int i5) {
            super(i4, i5);
            this.f12928b = new Rect();
            this.f12929c = true;
            this.f12930d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12928b = new Rect();
            this.f12929c = true;
            this.f12930d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12928b = new Rect();
            this.f12929c = true;
            this.f12930d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f12928b = new Rect();
            this.f12929c = true;
            this.f12930d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i4, int i5, Interpolator interpolator, int i6, boolean z4) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!pVar.canScrollHorizontally()) {
            i4 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (i6 != Integer.MIN_VALUE && i6 <= 0) {
            scrollBy(i4, i5);
            return;
        }
        if (z4) {
            int i7 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i7 |= 2;
            }
            startNestedScroll(i7, 1);
        }
        this.mViewFlinger.e(i4, i5, i6, interpolator);
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }
}
