package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C3139z9;
import java.util.ArrayList;
import java.util.HashMap;
import s.AbstractC3405e;
import t.C3422d;
import t.C3423e;
import u.C3447b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.1";
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private e mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected t.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private AbstractC3405e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<C3423e> mTempMapIdToWidget;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11092a;

        static {
            int[] iArr = new int[C3423e.b.values().length];
            f11092a = iArr;
            try {
                iArr[C3423e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11092a[C3423e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11092a[C3423e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11092a[C3423e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements C3447b.InterfaceC0282b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f11161a;

        /* renamed from: b, reason: collision with root package name */
        int f11162b;

        /* renamed from: c, reason: collision with root package name */
        int f11163c;

        /* renamed from: d, reason: collision with root package name */
        int f11164d;

        /* renamed from: e, reason: collision with root package name */
        int f11165e;

        /* renamed from: f, reason: collision with root package name */
        int f11166f;

        /* renamed from: g, reason: collision with root package name */
        int f11167g;

        public c(ConstraintLayout constraintLayout) {
            this.f11161a = constraintLayout;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x01f6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0182 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01eb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0200 A[ADDED_TO_REGION] */
        @Override // u.C3447b.InterfaceC0282b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(C3423e c3423e, C3447b.a aVar) {
            int i4;
            boolean z4;
            int i5;
            int i6;
            boolean z5;
            boolean z6;
            boolean z7;
            b bVar;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int max;
            int i7;
            int max2;
            int i8;
            boolean z8;
            if (c3423e == null) {
                return;
            }
            if (c3423e.M() == 8 && !c3423e.U()) {
                aVar.f46306e = 0;
                aVar.f46307f = 0;
                aVar.f46308g = 0;
                return;
            }
            C3423e.b bVar2 = aVar.f46302a;
            C3423e.b bVar3 = aVar.f46303b;
            int i9 = aVar.f46304c;
            int i10 = aVar.f46305d;
            int i11 = this.f11162b + this.f11163c;
            int i12 = this.f11164d;
            View view = (View) c3423e.o();
            int[] iArr = a.f11092a;
            int i13 = iArr[bVar2.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    i4 = ViewGroup.getChildMeasureSpec(this.f11166f, i12, -2);
                    c3423e.f46124h[2] = -2;
                } else if (i13 == 3) {
                    i4 = ViewGroup.getChildMeasureSpec(this.f11166f, i12 + c3423e.x(), -1);
                    c3423e.f46124h[2] = -1;
                } else {
                    if (i13 != 4) {
                        i4 = 0;
                        z4 = false;
                        i5 = iArr[bVar3.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                i6 = ViewGroup.getChildMeasureSpec(this.f11167g, i11, -2);
                                c3423e.f46124h[3] = -2;
                            } else if (i5 == 3) {
                                i6 = ViewGroup.getChildMeasureSpec(this.f11167g, i11 + c3423e.L(), -1);
                                c3423e.f46124h[3] = -1;
                            } else {
                                if (i5 != 4) {
                                    i6 = 0;
                                    z5 = false;
                                    C3423e.b bVar4 = C3423e.b.MATCH_CONSTRAINT;
                                    boolean z9 = bVar2 == bVar4;
                                    boolean z10 = bVar3 == bVar4;
                                    C3423e.b bVar5 = C3423e.b.MATCH_PARENT;
                                    boolean z11 = bVar3 != bVar5 || bVar3 == C3423e.b.FIXED;
                                    boolean z12 = bVar2 != bVar5 || bVar2 == C3423e.b.FIXED;
                                    z6 = !z9 && c3423e.f46100Q > 0.0f;
                                    z7 = !z10 && c3423e.f46100Q > 0.0f;
                                    bVar = (b) view.getLayoutParams();
                                    if (aVar.f46311j && z9 && c3423e.f46132l == 0 && z10 && c3423e.f46134m == 0) {
                                        max = 0;
                                        max2 = 0;
                                        baseline = 0;
                                    } else {
                                        view.measure(i4, i6);
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                        if (z4) {
                                            int[] iArr2 = c3423e.f46124h;
                                            iArr2[0] = measuredWidth;
                                            iArr2[2] = measuredHeight;
                                        } else {
                                            int[] iArr3 = c3423e.f46124h;
                                            iArr3[0] = 0;
                                            iArr3[2] = 0;
                                        }
                                        if (z5) {
                                            int[] iArr4 = c3423e.f46124h;
                                            iArr4[1] = measuredHeight;
                                            iArr4[3] = measuredWidth;
                                        } else {
                                            int[] iArr5 = c3423e.f46124h;
                                            iArr5[1] = 0;
                                            iArr5[3] = 0;
                                        }
                                        int i14 = c3423e.f46138o;
                                        max = i14 > 0 ? Math.max(i14, measuredWidth) : measuredWidth;
                                        i7 = c3423e.f46140p;
                                        if (i7 > 0) {
                                            max = Math.min(i7, max);
                                        }
                                        int i15 = c3423e.f46144r;
                                        max2 = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
                                        i8 = c3423e.f46146s;
                                        if (i8 > 0) {
                                            max2 = Math.min(i8, max2);
                                        }
                                        if (!z6 && z11) {
                                            max = (int) ((max2 * c3423e.f46100Q) + 0.5f);
                                        } else if (z7 && z12) {
                                            max2 = (int) ((max / c3423e.f46100Q) + 0.5f);
                                        }
                                        if (measuredWidth == max || measuredHeight != max2) {
                                            if (measuredWidth != max) {
                                                i4 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                                            }
                                            if (measuredHeight != max2) {
                                                i6 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                                            }
                                            view.measure(i4, i6);
                                            max = view.getMeasuredWidth();
                                            max2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                    }
                                    z8 = baseline != -1;
                                    aVar.f46310i = max == aVar.f46304c || max2 != aVar.f46305d;
                                    if (bVar.f11117Y) {
                                        z8 = true;
                                    }
                                    if (z8 && baseline != -1 && c3423e.l() != baseline) {
                                        aVar.f46310i = true;
                                    }
                                    aVar.f46306e = max;
                                    aVar.f46307f = max2;
                                    aVar.f46309h = z8;
                                    aVar.f46308g = baseline;
                                }
                                i6 = ViewGroup.getChildMeasureSpec(this.f11167g, i11, -2);
                                boolean z13 = c3423e.f46134m == 1;
                                int[] iArr6 = c3423e.f46124h;
                                iArr6[3] = 0;
                                if (aVar.f46311j) {
                                    boolean z14 = (!z13 || iArr6[2] == 0 || iArr6[1] == c3423e.t()) ? false : true;
                                    if (!z13 || z14) {
                                        i6 = View.MeasureSpec.makeMeasureSpec(c3423e.t(), 1073741824);
                                    }
                                }
                            }
                            z5 = true;
                            C3423e.b bVar42 = C3423e.b.MATCH_CONSTRAINT;
                            if (bVar2 == bVar42) {
                            }
                            if (bVar3 == bVar42) {
                            }
                            C3423e.b bVar52 = C3423e.b.MATCH_PARENT;
                            if (bVar3 != bVar52) {
                            }
                            if (bVar2 != bVar52) {
                            }
                            if (z9) {
                            }
                            if (z10) {
                            }
                            bVar = (b) view.getLayoutParams();
                            if (aVar.f46311j) {
                            }
                            view.measure(i4, i6);
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z4) {
                            }
                            if (z5) {
                            }
                            int i142 = c3423e.f46138o;
                            if (i142 > 0) {
                            }
                            i7 = c3423e.f46140p;
                            if (i7 > 0) {
                            }
                            int i152 = c3423e.f46144r;
                            if (i152 > 0) {
                            }
                            i8 = c3423e.f46146s;
                            if (i8 > 0) {
                            }
                            if (!z6) {
                            }
                            if (z7) {
                                max2 = (int) ((max / c3423e.f46100Q) + 0.5f);
                            }
                            if (measuredWidth == max) {
                            }
                            if (measuredWidth != max) {
                            }
                            if (measuredHeight != max2) {
                            }
                            view.measure(i4, i6);
                            max = view.getMeasuredWidth();
                            max2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (baseline != -1) {
                            }
                            aVar.f46310i = max == aVar.f46304c || max2 != aVar.f46305d;
                            if (bVar.f11117Y) {
                            }
                            if (z8) {
                                aVar.f46310i = true;
                            }
                            aVar.f46306e = max;
                            aVar.f46307f = max2;
                            aVar.f46309h = z8;
                            aVar.f46308g = baseline;
                        }
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                        c3423e.f46124h[3] = i10;
                        i6 = makeMeasureSpec;
                        z5 = false;
                        C3423e.b bVar422 = C3423e.b.MATCH_CONSTRAINT;
                        if (bVar2 == bVar422) {
                        }
                        if (bVar3 == bVar422) {
                        }
                        C3423e.b bVar522 = C3423e.b.MATCH_PARENT;
                        if (bVar3 != bVar522) {
                        }
                        if (bVar2 != bVar522) {
                        }
                        if (z9) {
                        }
                        if (z10) {
                        }
                        bVar = (b) view.getLayoutParams();
                        if (aVar.f46311j) {
                        }
                        view.measure(i4, i6);
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z4) {
                        }
                        if (z5) {
                        }
                        int i1422 = c3423e.f46138o;
                        if (i1422 > 0) {
                        }
                        i7 = c3423e.f46140p;
                        if (i7 > 0) {
                        }
                        int i1522 = c3423e.f46144r;
                        if (i1522 > 0) {
                        }
                        i8 = c3423e.f46146s;
                        if (i8 > 0) {
                        }
                        if (!z6) {
                        }
                        if (z7) {
                        }
                        if (measuredWidth == max) {
                        }
                        if (measuredWidth != max) {
                        }
                        if (measuredHeight != max2) {
                        }
                        view.measure(i4, i6);
                        max = view.getMeasuredWidth();
                        max2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (baseline != -1) {
                        }
                        aVar.f46310i = max == aVar.f46304c || max2 != aVar.f46305d;
                        if (bVar.f11117Y) {
                        }
                        if (z8) {
                        }
                        aVar.f46306e = max;
                        aVar.f46307f = max2;
                        aVar.f46309h = z8;
                        aVar.f46308g = baseline;
                    }
                    i4 = ViewGroup.getChildMeasureSpec(this.f11166f, i12, -2);
                    boolean z15 = c3423e.f46132l == 1;
                    int[] iArr7 = c3423e.f46124h;
                    iArr7[2] = 0;
                    if (aVar.f46311j) {
                        boolean z16 = (!z15 || iArr7[3] == 0 || iArr7[0] == c3423e.N()) ? false : true;
                        if (!z15 || z16) {
                            i4 = View.MeasureSpec.makeMeasureSpec(c3423e.N(), 1073741824);
                        }
                    }
                }
                z4 = true;
                i5 = iArr[bVar3.ordinal()];
                if (i5 != 1) {
                }
                z5 = false;
                C3423e.b bVar4222 = C3423e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar4222) {
                }
                if (bVar3 == bVar4222) {
                }
                C3423e.b bVar5222 = C3423e.b.MATCH_PARENT;
                if (bVar3 != bVar5222) {
                }
                if (bVar2 != bVar5222) {
                }
                if (z9) {
                }
                if (z10) {
                }
                bVar = (b) view.getLayoutParams();
                if (aVar.f46311j) {
                }
                view.measure(i4, i6);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z4) {
                }
                if (z5) {
                }
                int i14222 = c3423e.f46138o;
                if (i14222 > 0) {
                }
                i7 = c3423e.f46140p;
                if (i7 > 0) {
                }
                int i15222 = c3423e.f46144r;
                if (i15222 > 0) {
                }
                i8 = c3423e.f46146s;
                if (i8 > 0) {
                }
                if (!z6) {
                }
                if (z7) {
                }
                if (measuredWidth == max) {
                }
                if (measuredWidth != max) {
                }
                if (measuredHeight != max2) {
                }
                view.measure(i4, i6);
                max = view.getMeasuredWidth();
                max2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (baseline != -1) {
                }
                aVar.f46310i = max == aVar.f46304c || max2 != aVar.f46305d;
                if (bVar.f11117Y) {
                }
                if (z8) {
                }
                aVar.f46306e = max;
                aVar.f46307f = max2;
                aVar.f46309h = z8;
                aVar.f46308g = baseline;
            }
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            c3423e.f46124h[2] = i9;
            i4 = makeMeasureSpec2;
            z4 = false;
            i5 = iArr[bVar3.ordinal()];
            if (i5 != 1) {
            }
            z5 = false;
            C3423e.b bVar42222 = C3423e.b.MATCH_CONSTRAINT;
            if (bVar2 == bVar42222) {
            }
            if (bVar3 == bVar42222) {
            }
            C3423e.b bVar52222 = C3423e.b.MATCH_PARENT;
            if (bVar3 != bVar52222) {
            }
            if (bVar2 != bVar52222) {
            }
            if (z9) {
            }
            if (z10) {
            }
            bVar = (b) view.getLayoutParams();
            if (aVar.f46311j) {
            }
            view.measure(i4, i6);
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            if (z4) {
            }
            if (z5) {
            }
            int i142222 = c3423e.f46138o;
            if (i142222 > 0) {
            }
            i7 = c3423e.f46140p;
            if (i7 > 0) {
            }
            int i152222 = c3423e.f46144r;
            if (i152222 > 0) {
            }
            i8 = c3423e.f46146s;
            if (i8 > 0) {
            }
            if (!z6) {
            }
            if (z7) {
            }
            if (measuredWidth == max) {
            }
            if (measuredWidth != max) {
            }
            if (measuredHeight != max2) {
            }
            view.measure(i4, i6);
            max = view.getMeasuredWidth();
            max2 = view.getMeasuredHeight();
            baseline = view.getBaseline();
            if (baseline != -1) {
            }
            aVar.f46310i = max == aVar.f46304c || max2 != aVar.f46305d;
            if (bVar.f11117Y) {
            }
            if (z8) {
            }
            aVar.f46306e = max;
            aVar.f46307f = max2;
            aVar.f46309h = z8;
            aVar.f46308g = baseline;
        }

        @Override // u.C3447b.InterfaceC0282b
        public final void b() {
            int childCount = this.f11161a.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.f11161a.getChildAt(i4);
            }
            int size = this.f11161a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    ((androidx.constraintlayout.widget.b) this.f11161a.mConstraintHelpers.get(i5)).h(this.f11161a);
                }
            }
        }

        public void c(int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f11162b = i6;
            this.f11163c = i7;
            this.f11164d = i8;
            this.f11165e = i9;
            this.f11166f = i4;
            this.f11167g = i5;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new t.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(null, 0, 0);
    }

    private final C3423e a(int i4) {
        if (i4 == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i4);
        if (view == null && (view = findViewById(i4)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f11146n0;
    }

    private void b(AttributeSet attributeSet, int i4, int i5) {
        this.mLayoutWidget.Z(this);
        this.mLayoutWidget.b1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f11422a1, i4, i5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == g.f11442e1) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == g.f11447f1) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == g.f11432c1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == g.f11437d1) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == g.f11473k2) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == g.f11477l1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == g.f11467j1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.mConstraintSet = dVar;
                        dVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.c1(this.mOptimizationLevel);
    }

    private void c() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void d() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            C3423e viewWidget = getViewWidget(getChildAt(i4));
            if (viewWidget != null) {
                viewWidget.W();
            }
        }
        if (isInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    a(childAt.getId()).a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                getChildAt(i6).getId();
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.mLayoutWidget.I0();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).j(this);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            getChildAt(i8);
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            this.mTempMapIdToWidget.put(childAt2.getId(), getViewWidget(childAt2));
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            C3423e viewWidget2 = getViewWidget(childAt3);
            if (viewWidget2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.mLayoutWidget.c(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt3, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean e() {
        int childCount = getChildCount();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (getChildAt(i4).isLayoutRequested()) {
                z4 = true;
                break;
            }
            i4++;
        }
        if (z4) {
            d();
        }
        return z4;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void applyConstraintsFromLayoutParams(boolean z4, View view, C3423e c3423e, b bVar, SparseArray<C3423e> sparseArray) {
        C3423e c3423e2;
        C3423e c3423e3;
        C3423e c3423e4;
        C3423e c3423e5;
        C3423e c3423e6;
        int i4;
        float f4;
        int i5;
        bVar.a();
        bVar.f11148o0 = false;
        c3423e.z0(view.getVisibility());
        if (bVar.f11122b0) {
            c3423e.m0(true);
            c3423e.z0(8);
        }
        c3423e.Z(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).f(c3423e, this.mLayoutWidget.W0());
        }
        if (bVar.f11118Z) {
            t.g gVar = (t.g) c3423e;
            int i6 = bVar.f11140k0;
            int i7 = bVar.f11142l0;
            float f5 = bVar.f11144m0;
            if (f5 != -1.0f) {
                gVar.M0(f5);
                return;
            } else if (i6 != -1) {
                gVar.K0(i6);
                return;
            } else {
                if (i7 != -1) {
                    gVar.L0(i7);
                    return;
                }
                return;
            }
        }
        int i8 = bVar.f11126d0;
        int i9 = bVar.f11128e0;
        int i10 = bVar.f11130f0;
        int i11 = bVar.f11132g0;
        int i12 = bVar.f11134h0;
        int i13 = bVar.f11136i0;
        float f6 = bVar.f11138j0;
        int i14 = bVar.f11143m;
        if (i14 != -1) {
            C3423e c3423e7 = sparseArray.get(i14);
            if (c3423e7 != null) {
                c3423e.i(c3423e7, bVar.f11147o, bVar.f11145n);
            }
            c3423e6 = c3423e;
        } else {
            if (i8 != -1) {
                C3423e c3423e8 = sparseArray.get(i8);
                if (c3423e8 != null) {
                    C3422d.b bVar2 = C3422d.b.LEFT;
                    c3423e.R(bVar2, c3423e8, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i12);
                }
            } else if (i9 != -1 && (c3423e2 = sparseArray.get(i9)) != null) {
                c3423e.R(C3422d.b.LEFT, c3423e2, C3422d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i12);
            }
            if (i10 != -1) {
                C3423e c3423e9 = sparseArray.get(i10);
                if (c3423e9 != null) {
                    c3423e.R(C3422d.b.RIGHT, c3423e9, C3422d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i13);
                }
            } else if (i11 != -1 && (c3423e3 = sparseArray.get(i11)) != null) {
                C3422d.b bVar3 = C3422d.b.RIGHT;
                c3423e.R(bVar3, c3423e3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i13);
            }
            int i15 = bVar.f11133h;
            if (i15 != -1) {
                C3423e c3423e10 = sparseArray.get(i15);
                if (c3423e10 != null) {
                    C3422d.b bVar4 = C3422d.b.TOP;
                    c3423e.R(bVar4, c3423e10, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f11154u);
                }
            } else {
                int i16 = bVar.f11135i;
                if (i16 != -1 && (c3423e4 = sparseArray.get(i16)) != null) {
                    c3423e.R(C3422d.b.TOP, c3423e4, C3422d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f11154u);
                }
            }
            int i17 = bVar.f11137j;
            if (i17 != -1) {
                C3423e c3423e11 = sparseArray.get(i17);
                if (c3423e11 != null) {
                    c3423e.R(C3422d.b.BOTTOM, c3423e11, C3422d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f11156w);
                }
            } else {
                int i18 = bVar.f11139k;
                if (i18 != -1 && (c3423e5 = sparseArray.get(i18)) != null) {
                    C3422d.b bVar5 = C3422d.b.BOTTOM;
                    c3423e6 = c3423e;
                    c3423e6.R(bVar5, c3423e5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f11156w);
                    i4 = bVar.f11141l;
                    if (i4 != -1) {
                        View view2 = this.mChildrenByIds.get(i4);
                        C3423e c3423e12 = sparseArray.get(bVar.f11141l);
                        if (c3423e12 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                            b bVar6 = (b) view2.getLayoutParams();
                            bVar.f11117Y = true;
                            bVar6.f11117Y = true;
                            C3422d.b bVar7 = C3422d.b.BASELINE;
                            c3423e6.k(bVar7).a(c3423e12.k(bVar7), 0, -1, true);
                            c3423e6.d0(true);
                            bVar6.f11146n0.d0(true);
                            c3423e6.k(C3422d.b.TOP).k();
                            c3423e6.k(C3422d.b.BOTTOM).k();
                        }
                    }
                    if (f6 >= 0.0f) {
                        c3423e6.f0(f6);
                    }
                    f4 = bVar.f11093A;
                    if (f4 >= 0.0f) {
                        c3423e6.t0(f4);
                    }
                }
            }
            c3423e6 = c3423e;
            i4 = bVar.f11141l;
            if (i4 != -1) {
            }
            if (f6 >= 0.0f) {
            }
            f4 = bVar.f11093A;
            if (f4 >= 0.0f) {
            }
        }
        if (z4 && ((i5 = bVar.f11109Q) != -1 || bVar.f11110R != -1)) {
            c3423e6.r0(i5, bVar.f11110R);
        }
        if (bVar.f11115W) {
            c3423e6.i0(C3423e.b.FIXED);
            c3423e6.A0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                c3423e6.i0(C3423e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f11112T) {
                c3423e6.i0(C3423e.b.MATCH_CONSTRAINT);
            } else {
                c3423e6.i0(C3423e.b.MATCH_PARENT);
            }
            c3423e6.k(C3422d.b.LEFT).f46069e = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            c3423e6.k(C3422d.b.RIGHT).f46069e = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            c3423e6.i0(C3423e.b.MATCH_CONSTRAINT);
            c3423e6.A0(0);
        }
        if (bVar.f11116X) {
            c3423e6.w0(C3423e.b.FIXED);
            c3423e6.e0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                c3423e6.w0(C3423e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f11113U) {
                c3423e6.w0(C3423e.b.MATCH_CONSTRAINT);
            } else {
                c3423e6.w0(C3423e.b.MATCH_PARENT);
            }
            c3423e6.k(C3422d.b.TOP).f46069e = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            c3423e6.k(C3422d.b.BOTTOM).f46069e = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            c3423e6.w0(C3423e.b.MATCH_CONSTRAINT);
            c3423e6.e0(0);
        }
        c3423e6.b0(bVar.f11094B);
        c3423e6.k0(bVar.f11097E);
        c3423e6.y0(bVar.f11098F);
        c3423e6.g0(bVar.f11099G);
        c3423e6.u0(bVar.f11100H);
        c3423e6.j0(bVar.f11101I, bVar.f11103K, bVar.f11105M, bVar.f11107O);
        c3423e6.x0(bVar.f11102J, bVar.f11104L, bVar.f11106N, bVar.f11108P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).i(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(StringUtils.COMMA);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((parseInt / 1080.0f) * width);
                        int i7 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f4 = i6;
                        float f5 = i7;
                        float f6 = i6 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f4, f5, f6, f5, paint);
                        float parseInt4 = i7 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f4, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f4, f5, f6, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f6, f5, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(AbstractC3405e abstractC3405e) {
        this.mLayoutWidget.Q0(abstractC3405e);
    }

    @Override // android.view.View
    public void forceLayout() {
        c();
        super.forceLayout();
    }

    public Object getDesignInformation(int i4, Object obj) {
        if (i4 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.S0();
    }

    public View getViewById(int i4) {
        return this.mChildrenByIds.get(i4);
    }

    public final C3423e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f11146n0;
    }

    protected boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i4) {
        if (i4 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i4);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            b bVar = (b) childAt.getLayoutParams();
            C3423e c3423e = bVar.f11146n0;
            if ((childAt.getVisibility() != 8 || bVar.f11118Z || bVar.f11120a0 || bVar.f11124c0 || isInEditMode) && !bVar.f11122b0) {
                int O3 = c3423e.O();
                int P3 = c3423e.P();
                childAt.layout(O3, P3, c3423e.N() + O3, c3423e.t() + P3);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                this.mConstraintHelpers.get(i9).g(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        this.mOnMeasureWidthMeasureSpec = i4;
        this.mOnMeasureHeightMeasureSpec = i5;
        this.mLayoutWidget.d1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (e()) {
                this.mLayoutWidget.f1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i4, i5);
        resolveMeasuredDimension(i4, i5, this.mLayoutWidget.N(), this.mLayoutWidget.t(), this.mLayoutWidget.X0(), this.mLayoutWidget.V0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C3423e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof t.g)) {
            b bVar = (b) view.getLayoutParams();
            t.g gVar = new t.g();
            bVar.f11146n0 = gVar;
            bVar.f11118Z = true;
            gVar.N0(bVar.f11111S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.k();
            ((b) view.getLayoutParams()).f11120a0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.H0(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i4) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        c();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i4, int i5, int i6, int i7, boolean z4, boolean z5) {
        c cVar = this.mMeasurer;
        int i8 = cVar.f11165e;
        int resolveSizeAndState = View.resolveSizeAndState(i6 + cVar.f11164d, i4, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i7 + i8, i5, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z4) {
            min |= 16777216;
        }
        if (z5) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    protected void resolveSystem(t.f fVar, int i4, int i5, int i6) {
        int i7;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i8 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i5, i6, max, max2, paddingWidth, i8);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            i7 = max4;
            int i9 = size - paddingWidth;
            int i10 = size2 - i8;
            setSelfDimensionBehaviour(fVar, mode, i9, mode2, i10);
            fVar.Y0(i4, mode, i9, mode2, i10, this.mLastMeasureWidth, this.mLastMeasureHeight, i7, max);
        }
        i7 = max3;
        int i92 = size - paddingWidth;
        int i102 = size2 - i8;
        setSelfDimensionBehaviour(fVar, mode, i92, mode2, i102);
        fVar.Y0(i4, mode, i92, mode2, i102, this.mLastMeasureWidth, this.mLastMeasureHeight, i7, max);
    }

    public void setConstraintSet(d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i4, Object obj, Object obj2) {
        if (i4 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(str, num);
        }
    }

    @Override // android.view.View
    public void setId(int i4) {
        this.mChildrenByIds.remove(getId());
        super.setId(i4);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i4) {
        this.mOptimizationLevel = i4;
        this.mLayoutWidget.c1(i4);
    }

    protected void setSelfDimensionBehaviour(t.f fVar, int i4, int i5, int i6, int i7) {
        C3423e.b bVar;
        c cVar = this.mMeasurer;
        int i8 = cVar.f11165e;
        int i9 = cVar.f11164d;
        C3423e.b bVar2 = C3423e.b.FIXED;
        int childCount = getChildCount();
        if (i4 == Integer.MIN_VALUE) {
            bVar = C3423e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.mMinWidth);
            }
        } else if (i4 == 0) {
            bVar = C3423e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.mMinWidth);
            }
            i5 = 0;
        } else if (i4 != 1073741824) {
            bVar = bVar2;
            i5 = 0;
        } else {
            i5 = Math.min(this.mMaxWidth - i9, i5);
            bVar = bVar2;
        }
        if (i6 == Integer.MIN_VALUE) {
            bVar2 = C3423e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i7 = Math.max(0, this.mMinHeight);
            }
        } else if (i6 != 0) {
            if (i6 == 1073741824) {
                i7 = Math.min(this.mMaxHeight - i8, i7);
            }
            i7 = 0;
        } else {
            bVar2 = C3423e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i7 = Math.max(0, this.mMinHeight);
            }
            i7 = 0;
        }
        if (i5 != fVar.N() || i7 != fVar.t()) {
            fVar.U0();
        }
        fVar.B0(0);
        fVar.C0(0);
        fVar.o0(this.mMaxWidth - i9);
        fVar.n0(this.mMaxHeight - i8);
        fVar.q0(0);
        fVar.p0(0);
        fVar.i0(bVar);
        fVar.A0(i5);
        fVar.w0(bVar2);
        fVar.e0(i7);
        fVar.q0(this.mMinWidth - i9);
        fVar.p0(this.mMinHeight - i8);
    }

    public void setState(int i4, int i5, int i6) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(i4, i5, i6);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new t.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new t.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        b(attributeSet, i4, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public float f11093A;

        /* renamed from: B, reason: collision with root package name */
        public String f11094B;

        /* renamed from: C, reason: collision with root package name */
        float f11095C;

        /* renamed from: D, reason: collision with root package name */
        int f11096D;

        /* renamed from: E, reason: collision with root package name */
        public float f11097E;

        /* renamed from: F, reason: collision with root package name */
        public float f11098F;

        /* renamed from: G, reason: collision with root package name */
        public int f11099G;

        /* renamed from: H, reason: collision with root package name */
        public int f11100H;

        /* renamed from: I, reason: collision with root package name */
        public int f11101I;

        /* renamed from: J, reason: collision with root package name */
        public int f11102J;

        /* renamed from: K, reason: collision with root package name */
        public int f11103K;

        /* renamed from: L, reason: collision with root package name */
        public int f11104L;

        /* renamed from: M, reason: collision with root package name */
        public int f11105M;

        /* renamed from: N, reason: collision with root package name */
        public int f11106N;

        /* renamed from: O, reason: collision with root package name */
        public float f11107O;

        /* renamed from: P, reason: collision with root package name */
        public float f11108P;

        /* renamed from: Q, reason: collision with root package name */
        public int f11109Q;

        /* renamed from: R, reason: collision with root package name */
        public int f11110R;

        /* renamed from: S, reason: collision with root package name */
        public int f11111S;

        /* renamed from: T, reason: collision with root package name */
        public boolean f11112T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f11113U;

        /* renamed from: V, reason: collision with root package name */
        public String f11114V;

        /* renamed from: W, reason: collision with root package name */
        boolean f11115W;

        /* renamed from: X, reason: collision with root package name */
        boolean f11116X;

        /* renamed from: Y, reason: collision with root package name */
        boolean f11117Y;

        /* renamed from: Z, reason: collision with root package name */
        boolean f11118Z;

        /* renamed from: a, reason: collision with root package name */
        public int f11119a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f11120a0;

        /* renamed from: b, reason: collision with root package name */
        public int f11121b;

        /* renamed from: b0, reason: collision with root package name */
        boolean f11122b0;

        /* renamed from: c, reason: collision with root package name */
        public float f11123c;

        /* renamed from: c0, reason: collision with root package name */
        boolean f11124c0;

        /* renamed from: d, reason: collision with root package name */
        public int f11125d;

        /* renamed from: d0, reason: collision with root package name */
        int f11126d0;

        /* renamed from: e, reason: collision with root package name */
        public int f11127e;

        /* renamed from: e0, reason: collision with root package name */
        int f11128e0;

        /* renamed from: f, reason: collision with root package name */
        public int f11129f;

        /* renamed from: f0, reason: collision with root package name */
        int f11130f0;

        /* renamed from: g, reason: collision with root package name */
        public int f11131g;

        /* renamed from: g0, reason: collision with root package name */
        int f11132g0;

        /* renamed from: h, reason: collision with root package name */
        public int f11133h;

        /* renamed from: h0, reason: collision with root package name */
        int f11134h0;

        /* renamed from: i, reason: collision with root package name */
        public int f11135i;

        /* renamed from: i0, reason: collision with root package name */
        int f11136i0;

        /* renamed from: j, reason: collision with root package name */
        public int f11137j;

        /* renamed from: j0, reason: collision with root package name */
        float f11138j0;

        /* renamed from: k, reason: collision with root package name */
        public int f11139k;

        /* renamed from: k0, reason: collision with root package name */
        int f11140k0;

        /* renamed from: l, reason: collision with root package name */
        public int f11141l;

        /* renamed from: l0, reason: collision with root package name */
        int f11142l0;

        /* renamed from: m, reason: collision with root package name */
        public int f11143m;

        /* renamed from: m0, reason: collision with root package name */
        float f11144m0;

        /* renamed from: n, reason: collision with root package name */
        public int f11145n;

        /* renamed from: n0, reason: collision with root package name */
        C3423e f11146n0;

        /* renamed from: o, reason: collision with root package name */
        public float f11147o;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f11148o0;

        /* renamed from: p, reason: collision with root package name */
        public int f11149p;

        /* renamed from: q, reason: collision with root package name */
        public int f11150q;

        /* renamed from: r, reason: collision with root package name */
        public int f11151r;

        /* renamed from: s, reason: collision with root package name */
        public int f11152s;

        /* renamed from: t, reason: collision with root package name */
        public int f11153t;

        /* renamed from: u, reason: collision with root package name */
        public int f11154u;

        /* renamed from: v, reason: collision with root package name */
        public int f11155v;

        /* renamed from: w, reason: collision with root package name */
        public int f11156w;

        /* renamed from: x, reason: collision with root package name */
        public int f11157x;

        /* renamed from: y, reason: collision with root package name */
        public int f11158y;

        /* renamed from: z, reason: collision with root package name */
        public float f11159z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f11160a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f11160a = sparseIntArray;
                sparseIntArray.append(g.f11358K1, 8);
                sparseIntArray.append(g.f11362L1, 9);
                sparseIntArray.append(g.f11370N1, 10);
                sparseIntArray.append(g.f11374O1, 11);
                sparseIntArray.append(g.f11398U1, 12);
                sparseIntArray.append(g.f11394T1, 13);
                sparseIntArray.append(g.f11512s1, 14);
                sparseIntArray.append(g.f11507r1, 15);
                sparseIntArray.append(g.f11497p1, 16);
                sparseIntArray.append(g.f11517t1, 2);
                sparseIntArray.append(g.f11527v1, 3);
                sparseIntArray.append(g.f11522u1, 4);
                sparseIntArray.append(g.f11433c2, 49);
                sparseIntArray.append(g.f11438d2, 50);
                sparseIntArray.append(g.f11547z1, 5);
                sparseIntArray.append(g.f11312A1, 6);
                sparseIntArray.append(g.f11317B1, 7);
                sparseIntArray.append(g.f11427b1, 1);
                sparseIntArray.append(g.f11378P1, 17);
                sparseIntArray.append(g.f11382Q1, 18);
                sparseIntArray.append(g.f11542y1, 19);
                sparseIntArray.append(g.f11537x1, 20);
                sparseIntArray.append(g.f11453g2, 21);
                sparseIntArray.append(g.f11468j2, 22);
                sparseIntArray.append(g.f11458h2, 23);
                sparseIntArray.append(g.f11443e2, 24);
                sparseIntArray.append(g.f11463i2, 25);
                sparseIntArray.append(g.f11448f2, 26);
                sparseIntArray.append(g.f11342G1, 29);
                sparseIntArray.append(g.f11402V1, 30);
                sparseIntArray.append(g.f11532w1, 44);
                sparseIntArray.append(g.f11350I1, 45);
                sparseIntArray.append(g.f11410X1, 46);
                sparseIntArray.append(g.f11346H1, 47);
                sparseIntArray.append(g.f11406W1, 48);
                sparseIntArray.append(g.f11487n1, 27);
                sparseIntArray.append(g.f11482m1, 28);
                sparseIntArray.append(g.f11414Y1, 31);
                sparseIntArray.append(g.f11322C1, 32);
                sparseIntArray.append(g.f11423a2, 33);
                sparseIntArray.append(g.f11418Z1, 34);
                sparseIntArray.append(g.f11428b2, 35);
                sparseIntArray.append(g.f11332E1, 36);
                sparseIntArray.append(g.f11327D1, 37);
                sparseIntArray.append(g.f11337F1, 38);
                sparseIntArray.append(g.f11354J1, 39);
                sparseIntArray.append(g.f11390S1, 40);
                sparseIntArray.append(g.f11366M1, 41);
                sparseIntArray.append(g.f11502q1, 42);
                sparseIntArray.append(g.f11492o1, 43);
                sparseIntArray.append(g.f11386R1, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i4;
            this.f11119a = -1;
            this.f11121b = -1;
            this.f11123c = -1.0f;
            this.f11125d = -1;
            this.f11127e = -1;
            this.f11129f = -1;
            this.f11131g = -1;
            this.f11133h = -1;
            this.f11135i = -1;
            this.f11137j = -1;
            this.f11139k = -1;
            this.f11141l = -1;
            this.f11143m = -1;
            this.f11145n = 0;
            this.f11147o = 0.0f;
            this.f11149p = -1;
            this.f11150q = -1;
            this.f11151r = -1;
            this.f11152s = -1;
            this.f11153t = -1;
            this.f11154u = -1;
            this.f11155v = -1;
            this.f11156w = -1;
            this.f11157x = -1;
            this.f11158y = -1;
            this.f11159z = 0.5f;
            this.f11093A = 0.5f;
            this.f11094B = null;
            this.f11095C = 0.0f;
            this.f11096D = 1;
            this.f11097E = -1.0f;
            this.f11098F = -1.0f;
            this.f11099G = 0;
            this.f11100H = 0;
            this.f11101I = 0;
            this.f11102J = 0;
            this.f11103K = 0;
            this.f11104L = 0;
            this.f11105M = 0;
            this.f11106N = 0;
            this.f11107O = 1.0f;
            this.f11108P = 1.0f;
            this.f11109Q = -1;
            this.f11110R = -1;
            this.f11111S = -1;
            this.f11112T = false;
            this.f11113U = false;
            this.f11114V = null;
            this.f11115W = true;
            this.f11116X = true;
            this.f11117Y = false;
            this.f11118Z = false;
            this.f11120a0 = false;
            this.f11122b0 = false;
            this.f11124c0 = false;
            this.f11126d0 = -1;
            this.f11128e0 = -1;
            this.f11130f0 = -1;
            this.f11132g0 = -1;
            this.f11134h0 = -1;
            this.f11136i0 = -1;
            this.f11138j0 = 0.5f;
            this.f11146n0 = new C3423e();
            this.f11148o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f11422a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = a.f11160a.get(index);
                switch (i6) {
                    case 1:
                        this.f11111S = obtainStyledAttributes.getInt(index, this.f11111S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f11143m);
                        this.f11143m = resourceId;
                        if (resourceId == -1) {
                            this.f11143m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f11145n = obtainStyledAttributes.getDimensionPixelSize(index, this.f11145n);
                        break;
                    case 4:
                        float f4 = obtainStyledAttributes.getFloat(index, this.f11147o) % 360.0f;
                        this.f11147o = f4;
                        if (f4 < 0.0f) {
                            this.f11147o = (360.0f - f4) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f11119a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11119a);
                        break;
                    case 6:
                        this.f11121b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11121b);
                        break;
                    case 7:
                        this.f11123c = obtainStyledAttributes.getFloat(index, this.f11123c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f11125d);
                        this.f11125d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f11125d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f11127e);
                        this.f11127e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f11127e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f11129f);
                        this.f11129f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f11129f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f11131g);
                        this.f11131g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f11131g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f11133h);
                        this.f11133h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f11133h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f11135i);
                        this.f11135i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f11135i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f11137j);
                        this.f11137j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f11137j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f11139k);
                        this.f11139k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f11139k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f11141l);
                        this.f11141l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f11141l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f11149p);
                        this.f11149p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f11149p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f11150q);
                        this.f11150q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f11150q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f11151r);
                        this.f11151r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f11151r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f11152s);
                        this.f11152s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f11152s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f11153t = obtainStyledAttributes.getDimensionPixelSize(index, this.f11153t);
                        break;
                    case 22:
                        this.f11154u = obtainStyledAttributes.getDimensionPixelSize(index, this.f11154u);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.f11155v = obtainStyledAttributes.getDimensionPixelSize(index, this.f11155v);
                        break;
                    case 24:
                        this.f11156w = obtainStyledAttributes.getDimensionPixelSize(index, this.f11156w);
                        break;
                    case 25:
                        this.f11157x = obtainStyledAttributes.getDimensionPixelSize(index, this.f11157x);
                        break;
                    case 26:
                        this.f11158y = obtainStyledAttributes.getDimensionPixelSize(index, this.f11158y);
                        break;
                    case 27:
                        this.f11112T = obtainStyledAttributes.getBoolean(index, this.f11112T);
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        this.f11113U = obtainStyledAttributes.getBoolean(index, this.f11113U);
                        break;
                    case 29:
                        this.f11159z = obtainStyledAttributes.getFloat(index, this.f11159z);
                        break;
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        this.f11093A = obtainStyledAttributes.getFloat(index, this.f11093A);
                        break;
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        int i7 = obtainStyledAttributes.getInt(index, 0);
                        this.f11101I = i7;
                        if (i7 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i8 = obtainStyledAttributes.getInt(index, 0);
                        this.f11102J = i8;
                        if (i8 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f11103K = obtainStyledAttributes.getDimensionPixelSize(index, this.f11103K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f11103K) == -2) {
                                this.f11103K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f11105M = obtainStyledAttributes.getDimensionPixelSize(index, this.f11105M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f11105M) == -2) {
                                this.f11105M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case C3139z9.f40333J /* 35 */:
                        this.f11107O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f11107O));
                        this.f11101I = 2;
                        break;
                    case 36:
                        try {
                            this.f11104L = obtainStyledAttributes.getDimensionPixelSize(index, this.f11104L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f11104L) == -2) {
                                this.f11104L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f11106N = obtainStyledAttributes.getDimensionPixelSize(index, this.f11106N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f11106N) == -2) {
                                this.f11106N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case C3139z9.f40334K /* 38 */:
                        this.f11108P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f11108P));
                        this.f11102J = 2;
                        break;
                    default:
                        switch (i6) {
                            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                                String string = obtainStyledAttributes.getString(index);
                                this.f11094B = string;
                                this.f11095C = Float.NaN;
                                this.f11096D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f11094B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i4 = 0;
                                    } else {
                                        String substring = this.f11094B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f11096D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f11096D = 1;
                                        }
                                        i4 = indexOf + 1;
                                    }
                                    int indexOf2 = this.f11094B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f11094B.substring(i4);
                                        if (substring2.length() > 0) {
                                            this.f11095C = Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f11094B.substring(i4, indexOf2);
                                        String substring4 = this.f11094B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f11096D == 1) {
                                                        this.f11095C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f11095C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                                this.f11097E = obtainStyledAttributes.getFloat(index, this.f11097E);
                                break;
                            case 46:
                                this.f11098F = obtainStyledAttributes.getFloat(index, this.f11098F);
                                break;
                            case 47:
                                this.f11099G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f11100H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f11109Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11109Q);
                                break;
                            case 50:
                                this.f11110R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f11110R);
                                break;
                            case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                                this.f11114V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f11118Z = false;
            this.f11115W = true;
            this.f11116X = true;
            int i4 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i4 == -2 && this.f11112T) {
                this.f11115W = false;
                if (this.f11101I == 0) {
                    this.f11101I = 1;
                }
            }
            int i5 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i5 == -2 && this.f11113U) {
                this.f11116X = false;
                if (this.f11102J == 0) {
                    this.f11102J = 1;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.f11115W = false;
                if (i4 == 0 && this.f11101I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f11112T = true;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.f11116X = false;
                if (i5 == 0 && this.f11102J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f11113U = true;
                }
            }
            if (this.f11123c == -1.0f && this.f11119a == -1 && this.f11121b == -1) {
                return;
            }
            this.f11118Z = true;
            this.f11115W = true;
            this.f11116X = true;
            if (!(this.f11146n0 instanceof t.g)) {
                this.f11146n0 = new t.g();
            }
            ((t.g) this.f11146n0).N0(this.f11111S);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i10 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i4);
            boolean z4 = false;
            boolean z5 = 1 == getLayoutDirection();
            this.f11130f0 = -1;
            this.f11132g0 = -1;
            this.f11126d0 = -1;
            this.f11128e0 = -1;
            this.f11134h0 = this.f11153t;
            this.f11136i0 = this.f11155v;
            float f4 = this.f11159z;
            this.f11138j0 = f4;
            int i11 = this.f11119a;
            this.f11140k0 = i11;
            int i12 = this.f11121b;
            this.f11142l0 = i12;
            float f5 = this.f11123c;
            this.f11144m0 = f5;
            if (z5) {
                int i13 = this.f11149p;
                if (i13 != -1) {
                    this.f11130f0 = i13;
                } else {
                    int i14 = this.f11150q;
                    if (i14 != -1) {
                        this.f11132g0 = i14;
                    }
                    i5 = this.f11151r;
                    if (i5 != -1) {
                        this.f11128e0 = i5;
                        z4 = true;
                    }
                    i6 = this.f11152s;
                    if (i6 != -1) {
                        this.f11126d0 = i6;
                        z4 = true;
                    }
                    i7 = this.f11157x;
                    if (i7 != -1) {
                        this.f11136i0 = i7;
                    }
                    i8 = this.f11158y;
                    if (i8 != -1) {
                        this.f11134h0 = i8;
                    }
                    if (z4) {
                        this.f11138j0 = 1.0f - f4;
                    }
                    if (this.f11118Z && this.f11111S == 1) {
                        if (f5 == -1.0f) {
                            this.f11144m0 = 1.0f - f5;
                            this.f11140k0 = -1;
                            this.f11142l0 = -1;
                        } else if (i11 != -1) {
                            this.f11142l0 = i11;
                            this.f11140k0 = -1;
                            this.f11144m0 = -1.0f;
                        } else if (i12 != -1) {
                            this.f11140k0 = i12;
                            this.f11142l0 = -1;
                            this.f11144m0 = -1.0f;
                        }
                    }
                }
                z4 = true;
                i5 = this.f11151r;
                if (i5 != -1) {
                }
                i6 = this.f11152s;
                if (i6 != -1) {
                }
                i7 = this.f11157x;
                if (i7 != -1) {
                }
                i8 = this.f11158y;
                if (i8 != -1) {
                }
                if (z4) {
                }
                if (this.f11118Z) {
                    if (f5 == -1.0f) {
                    }
                }
            } else {
                int i15 = this.f11149p;
                if (i15 != -1) {
                    this.f11128e0 = i15;
                }
                int i16 = this.f11150q;
                if (i16 != -1) {
                    this.f11126d0 = i16;
                }
                int i17 = this.f11151r;
                if (i17 != -1) {
                    this.f11130f0 = i17;
                }
                int i18 = this.f11152s;
                if (i18 != -1) {
                    this.f11132g0 = i18;
                }
                int i19 = this.f11157x;
                if (i19 != -1) {
                    this.f11134h0 = i19;
                }
                int i20 = this.f11158y;
                if (i20 != -1) {
                    this.f11136i0 = i20;
                }
            }
            if (this.f11151r == -1 && this.f11152s == -1 && this.f11150q == -1 && this.f11149p == -1) {
                int i21 = this.f11129f;
                if (i21 != -1) {
                    this.f11130f0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                    }
                } else {
                    int i22 = this.f11131g;
                    if (i22 != -1) {
                        this.f11132g0 = i22;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                        }
                    }
                }
                int i23 = this.f11125d;
                if (i23 != -1) {
                    this.f11126d0 = i23;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
                    return;
                }
                int i24 = this.f11127e;
                if (i24 != -1) {
                    this.f11128e0 = i24;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
                }
            }
        }

        public b(int i4, int i5) {
            super(i4, i5);
            this.f11119a = -1;
            this.f11121b = -1;
            this.f11123c = -1.0f;
            this.f11125d = -1;
            this.f11127e = -1;
            this.f11129f = -1;
            this.f11131g = -1;
            this.f11133h = -1;
            this.f11135i = -1;
            this.f11137j = -1;
            this.f11139k = -1;
            this.f11141l = -1;
            this.f11143m = -1;
            this.f11145n = 0;
            this.f11147o = 0.0f;
            this.f11149p = -1;
            this.f11150q = -1;
            this.f11151r = -1;
            this.f11152s = -1;
            this.f11153t = -1;
            this.f11154u = -1;
            this.f11155v = -1;
            this.f11156w = -1;
            this.f11157x = -1;
            this.f11158y = -1;
            this.f11159z = 0.5f;
            this.f11093A = 0.5f;
            this.f11094B = null;
            this.f11095C = 0.0f;
            this.f11096D = 1;
            this.f11097E = -1.0f;
            this.f11098F = -1.0f;
            this.f11099G = 0;
            this.f11100H = 0;
            this.f11101I = 0;
            this.f11102J = 0;
            this.f11103K = 0;
            this.f11104L = 0;
            this.f11105M = 0;
            this.f11106N = 0;
            this.f11107O = 1.0f;
            this.f11108P = 1.0f;
            this.f11109Q = -1;
            this.f11110R = -1;
            this.f11111S = -1;
            this.f11112T = false;
            this.f11113U = false;
            this.f11114V = null;
            this.f11115W = true;
            this.f11116X = true;
            this.f11117Y = false;
            this.f11118Z = false;
            this.f11120a0 = false;
            this.f11122b0 = false;
            this.f11124c0 = false;
            this.f11126d0 = -1;
            this.f11128e0 = -1;
            this.f11130f0 = -1;
            this.f11132g0 = -1;
            this.f11134h0 = -1;
            this.f11136i0 = -1;
            this.f11138j0 = 0.5f;
            this.f11146n0 = new C3423e();
            this.f11148o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11119a = -1;
            this.f11121b = -1;
            this.f11123c = -1.0f;
            this.f11125d = -1;
            this.f11127e = -1;
            this.f11129f = -1;
            this.f11131g = -1;
            this.f11133h = -1;
            this.f11135i = -1;
            this.f11137j = -1;
            this.f11139k = -1;
            this.f11141l = -1;
            this.f11143m = -1;
            this.f11145n = 0;
            this.f11147o = 0.0f;
            this.f11149p = -1;
            this.f11150q = -1;
            this.f11151r = -1;
            this.f11152s = -1;
            this.f11153t = -1;
            this.f11154u = -1;
            this.f11155v = -1;
            this.f11156w = -1;
            this.f11157x = -1;
            this.f11158y = -1;
            this.f11159z = 0.5f;
            this.f11093A = 0.5f;
            this.f11094B = null;
            this.f11095C = 0.0f;
            this.f11096D = 1;
            this.f11097E = -1.0f;
            this.f11098F = -1.0f;
            this.f11099G = 0;
            this.f11100H = 0;
            this.f11101I = 0;
            this.f11102J = 0;
            this.f11103K = 0;
            this.f11104L = 0;
            this.f11105M = 0;
            this.f11106N = 0;
            this.f11107O = 1.0f;
            this.f11108P = 1.0f;
            this.f11109Q = -1;
            this.f11110R = -1;
            this.f11111S = -1;
            this.f11112T = false;
            this.f11113U = false;
            this.f11114V = null;
            this.f11115W = true;
            this.f11116X = true;
            this.f11117Y = false;
            this.f11118Z = false;
            this.f11120a0 = false;
            this.f11122b0 = false;
            this.f11124c0 = false;
            this.f11126d0 = -1;
            this.f11128e0 = -1;
            this.f11130f0 = -1;
            this.f11132g0 = -1;
            this.f11134h0 = -1;
            this.f11136i0 = -1;
            this.f11138j0 = 0.5f;
            this.f11146n0 = new C3423e();
            this.f11148o0 = false;
        }
    }
}
