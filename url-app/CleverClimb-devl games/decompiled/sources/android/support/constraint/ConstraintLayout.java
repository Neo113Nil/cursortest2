package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.a.a.a;
import android.support.constraint.a.a.b;
import android.support.constraint.a.a.c;
import android.support.constraint.a.a.d;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.util.CrashUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    SparseArray<View> f1377a;

    /* renamed from: b, reason: collision with root package name */
    c f1378b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<b> f1379c;

    /* renamed from: d, reason: collision with root package name */
    private int f1380d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private android.support.constraint.a j;

    public ConstraintLayout(Context context) {
        super(context);
        this.f1377a = new SparseArray<>();
        this.f1379c = new ArrayList<>(100);
        this.f1378b = new c();
        this.f1380d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        b(null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1377a = new SparseArray<>();
        this.f1379c = new ArrayList<>(100);
        this.f1378b = new c();
        this.f1380d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        b(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1377a = new SparseArray<>();
        this.f1379c = new ArrayList<>(100);
        this.f1378b = new c();
        this.f1380d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 2;
        this.j = null;
        b(attributeSet);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f1377a.remove(getId());
        super.setId(i);
        this.f1377a.put(getId(), this);
    }

    private void b(AttributeSet attributeSet) {
        this.f1378b.a(this);
        this.f1377a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f1380d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1380d);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    this.j = new android.support.constraint.a();
                    this.j.a(getContext(), resourceId);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1378b.m(this.i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        b a2 = a(view);
        if ((view instanceof Guideline) && !(a2 instanceof d)) {
            a aVar = (a) view.getLayoutParams();
            aVar.Z = new d();
            aVar.R = true;
            ((d) aVar.Z).m(aVar.N);
            b bVar = aVar.Z;
        }
        this.f1377a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1377a.remove(view.getId());
        this.f1378b.c(a(view));
        this.h = true;
    }

    public void setMinWidth(int i) {
        if (i == this.f1380d) {
            return;
        }
        this.f1380d = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.f1380d;
    }

    public int getMinHeight() {
        return this.e;
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMaxHeight() {
        return this.g;
    }

    private void c() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.f1379c.clear();
            d();
        }
    }

    private void d() {
        float f;
        b a2;
        b a3;
        b a4;
        b a5;
        if (this.j != null) {
            this.j.a(this);
        }
        int childCount = getChildCount();
        this.f1378b.I();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b a6 = a(childAt);
            if (a6 != null) {
                a aVar = (a) childAt.getLayoutParams();
                a6.a();
                a6.a(childAt.getVisibility());
                a6.a(childAt);
                this.f1378b.b(a6);
                if (!aVar.P || !aVar.O) {
                    this.f1379c.add(a6);
                }
                if (aVar.R) {
                    d dVar = (d) a6;
                    if (aVar.f1381a != -1) {
                        dVar.n(aVar.f1381a);
                    }
                    if (aVar.f1382b != -1) {
                        dVar.o(aVar.f1382b);
                    }
                    if (aVar.f1383c != -1.0f) {
                        dVar.e(aVar.f1383c);
                    }
                } else if (aVar.S != -1 || aVar.T != -1 || aVar.U != -1 || aVar.V != -1 || aVar.h != -1 || aVar.i != -1 || aVar.j != -1 || aVar.k != -1 || aVar.l != -1 || aVar.L != -1 || aVar.M != -1 || aVar.width == -1 || aVar.height == -1) {
                    int i2 = aVar.S;
                    int i3 = aVar.T;
                    int i4 = aVar.U;
                    int i5 = aVar.V;
                    int i6 = aVar.W;
                    int i7 = aVar.X;
                    float f2 = aVar.Y;
                    if (Build.VERSION.SDK_INT < 17) {
                        i2 = aVar.f1384d;
                        i3 = aVar.e;
                        i4 = aVar.f;
                        i5 = aVar.g;
                        i6 = aVar.q;
                        i7 = aVar.s;
                        f2 = aVar.w;
                        if (i2 == -1 && i3 == -1) {
                            if (aVar.n != -1) {
                                i2 = aVar.n;
                            } else if (aVar.m != -1) {
                                i3 = aVar.m;
                            }
                        }
                        if (i4 == -1 && i5 == -1) {
                            if (aVar.o != -1) {
                                i4 = aVar.o;
                            } else if (aVar.p != -1) {
                                i5 = aVar.p;
                            }
                        }
                    }
                    int i8 = i4;
                    int i9 = i5;
                    int i10 = i7;
                    float f3 = f2;
                    int i11 = i6;
                    if (i2 != -1) {
                        b a7 = a(i2);
                        if (a7 != null) {
                            f = f3;
                            a6.a(a.c.LEFT, a7, a.c.LEFT, aVar.leftMargin, i11);
                        } else {
                            f = f3;
                        }
                    } else {
                        f = f3;
                        if (i3 != -1 && (a2 = a(i3)) != null) {
                            a6.a(a.c.LEFT, a2, a.c.RIGHT, aVar.leftMargin, i11);
                        }
                    }
                    if (i8 != -1) {
                        b a8 = a(i8);
                        if (a8 != null) {
                            a6.a(a.c.RIGHT, a8, a.c.LEFT, aVar.rightMargin, i10);
                        }
                    } else if (i9 != -1 && (a3 = a(i9)) != null) {
                        a6.a(a.c.RIGHT, a3, a.c.RIGHT, aVar.rightMargin, i10);
                    }
                    if (aVar.h != -1) {
                        b a9 = a(aVar.h);
                        if (a9 != null) {
                            a6.a(a.c.TOP, a9, a.c.TOP, aVar.topMargin, aVar.r);
                        }
                    } else if (aVar.i != -1 && (a4 = a(aVar.i)) != null) {
                        a6.a(a.c.TOP, a4, a.c.BOTTOM, aVar.topMargin, aVar.r);
                    }
                    if (aVar.j != -1) {
                        b a10 = a(aVar.j);
                        if (a10 != null) {
                            a6.a(a.c.BOTTOM, a10, a.c.TOP, aVar.bottomMargin, aVar.t);
                        }
                    } else if (aVar.k != -1 && (a5 = a(aVar.k)) != null) {
                        a6.a(a.c.BOTTOM, a5, a.c.BOTTOM, aVar.bottomMargin, aVar.t);
                    }
                    if (aVar.l != -1) {
                        View view = this.f1377a.get(aVar.l);
                        b a11 = a(aVar.l);
                        if (a11 != null && view != null && (view.getLayoutParams() instanceof a)) {
                            a aVar2 = (a) view.getLayoutParams();
                            aVar.Q = true;
                            aVar2.Q = true;
                            a6.a(a.c.BASELINE).a(a11.a(a.c.BASELINE), 0, -1, a.b.STRONG, 0, true);
                            a6.a(a.c.TOP).i();
                            a6.a(a.c.BOTTOM).i();
                        }
                    }
                    if (f >= 0.0f && f != 0.5f) {
                        a6.a(f);
                    }
                    if (aVar.x >= 0.0f && aVar.x != 0.5f) {
                        a6.b(aVar.x);
                    }
                    if (isInEditMode() && (aVar.L != -1 || aVar.M != -1)) {
                        a6.a(aVar.L, aVar.M);
                    }
                    if (!aVar.O) {
                        if (aVar.width == -1) {
                            a6.a(b.a.MATCH_PARENT);
                            a6.a(a.c.LEFT).f1399d = aVar.leftMargin;
                            a6.a(a.c.RIGHT).f1399d = aVar.rightMargin;
                        } else {
                            a6.a(b.a.MATCH_CONSTRAINT);
                            a6.d(0);
                        }
                    } else {
                        a6.a(b.a.FIXED);
                        a6.d(aVar.width);
                    }
                    if (!aVar.P) {
                        if (aVar.height == -1) {
                            a6.b(b.a.MATCH_PARENT);
                            a6.a(a.c.TOP).f1399d = aVar.topMargin;
                            a6.a(a.c.BOTTOM).f1399d = aVar.bottomMargin;
                        } else {
                            a6.b(b.a.MATCH_CONSTRAINT);
                            a6.e(0);
                        }
                    } else {
                        a6.b(b.a.FIXED);
                        a6.e(aVar.height);
                    }
                    if (aVar.y != null) {
                        a6.a(aVar.y);
                    }
                    a6.c(aVar.B);
                    a6.d(aVar.C);
                    a6.k(aVar.D);
                    a6.l(aVar.E);
                    a6.a(aVar.F, aVar.H, aVar.J);
                    a6.b(aVar.G, aVar.I, aVar.K);
                }
            }
        }
    }

    private final b a(int i) {
        if (i == 0) {
            return this.f1378b;
        }
        View view = this.f1377a.get(i);
        if (view == this) {
            return this.f1378b;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).Z;
    }

    private final b a(View view) {
        if (view == this) {
            return this.f1378b;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).Z;
    }

    private void a(int i, int i2) {
        boolean z;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                b bVar = aVar.Z;
                if (!aVar.R) {
                    int i4 = aVar.width;
                    int i5 = aVar.height;
                    boolean z2 = true;
                    if (aVar.O || aVar.P || (!aVar.O && aVar.F == 1) || aVar.width == -1 || (!aVar.P && (aVar.G == 1 || aVar.height == -1))) {
                        if (i4 == 0 || i4 == -1) {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -2);
                            z = true;
                        } else {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, i4);
                            z = false;
                        }
                        if (i5 == 0 || i5 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -2);
                        } else {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, i5);
                            z2 = false;
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        i4 = childAt.getMeasuredWidth();
                        i5 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    bVar.d(i4);
                    bVar.e(i5);
                    if (z) {
                        bVar.h(i4);
                    }
                    if (z2) {
                        bVar.i(i5);
                    }
                    if (aVar.Q && (baseline = childAt.getBaseline()) != -1) {
                        bVar.j(baseline);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        View view;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int baseline;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f1378b.b(paddingLeft);
        this.f1378b.c(paddingTop);
        b(i, i2);
        int i4 = 0;
        if (this.h) {
            this.h = false;
            c();
        }
        a(i, i2);
        if (getChildCount() > 0) {
            a();
        }
        int size = this.f1379c.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size > 0) {
            boolean z = this.f1378b.B() == b.a.WRAP_CONTENT;
            boolean z2 = this.f1378b.C() == b.a.WRAP_CONTENT;
            boolean z3 = false;
            int i5 = 0;
            while (i4 < size) {
                b bVar = this.f1379c.get(i4);
                if ((bVar instanceof d) || (view = (View) bVar.x()) == null || view.getVisibility() == 8) {
                    i3 = size;
                } else {
                    a aVar = (a) view.getLayoutParams();
                    if (aVar.width == -2) {
                        makeMeasureSpec = getChildMeasureSpec(i, paddingRight, aVar.width);
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bVar.h(), CrashUtils.ErrorDialogData.SUPPRESSED);
                    }
                    i3 = size;
                    if (aVar.height == -2) {
                        makeMeasureSpec2 = getChildMeasureSpec(i2, paddingBottom, aVar.height);
                    } else {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(bVar.l(), CrashUtils.ErrorDialogData.SUPPRESSED);
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth != bVar.h()) {
                        bVar.d(measuredWidth);
                        if (z && bVar.t() > this.f1378b.h()) {
                            this.f1378b.d(Math.max(this.f1380d, bVar.t() + bVar.a(a.c.RIGHT).d()));
                        }
                        z3 = true;
                    }
                    if (measuredHeight != bVar.l()) {
                        bVar.e(measuredHeight);
                        if (z2 && bVar.u() > this.f1378b.l()) {
                            this.f1378b.e(Math.max(this.e, bVar.u() + bVar.a(a.c.BOTTOM).d()));
                        }
                        z3 = true;
                    }
                    if (aVar.Q && (baseline = view.getBaseline()) != -1 && baseline != bVar.w()) {
                        bVar.j(baseline);
                        z3 = true;
                    }
                    if (Build.VERSION.SDK_INT >= 11) {
                        i5 = combineMeasuredStates(i5, view.getMeasuredState());
                    }
                }
                i4++;
                size = i3;
            }
            if (z3) {
                a();
            }
            i4 = i5;
        }
        int h = this.f1378b.h() + paddingRight;
        int l = this.f1378b.l() + paddingBottom;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = resolveSizeAndState(h, i, i4);
            int resolveSizeAndState2 = resolveSizeAndState(l, i2, i4 << 16);
            int min = Math.min(this.f, resolveSizeAndState);
            int min2 = Math.min(this.g, resolveSizeAndState2);
            int i6 = min & ViewCompat.MEASURED_SIZE_MASK;
            int i7 = min2 & ViewCompat.MEASURED_SIZE_MASK;
            if (this.f1378b.D()) {
                i6 |= 16777216;
            }
            if (this.f1378b.E()) {
                i7 |= 16777216;
            }
            setMeasuredDimension(i6, i7);
            return;
        }
        setMeasuredDimension(h, l);
    }

    private void b(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        b.a aVar = b.a.FIXED;
        b.a aVar2 = b.a.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                aVar = b.a.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                size = Math.min(this.f, size) - paddingLeft;
            }
            size = 0;
        } else {
            aVar = b.a.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                aVar2 = b.a.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.g, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            aVar2 = b.a.WRAP_CONTENT;
        }
        this.f1378b.f(0);
        this.f1378b.g(0);
        this.f1378b.a(aVar);
        this.f1378b.d(size);
        this.f1378b.b(aVar2);
        this.f1378b.e(size2);
        this.f1378b.f((this.f1380d - getPaddingLeft()) - getPaddingRight());
        this.f1378b.g((this.e - getPaddingTop()) - getPaddingBottom());
    }

    protected void a() {
        this.f1378b.F();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || aVar.R || isInEditMode) {
                b bVar = aVar.Z;
                int n = bVar.n();
                int o = bVar.o();
                childAt.layout(n, o, bVar.h() + n, bVar.l() + o);
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1378b.m(i);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void setConstraintSet(android.support.constraint.a aVar) {
        this.j = aVar;
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        int A;
        public float B;
        public float C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        boolean O;
        boolean P;
        boolean Q;
        boolean R;
        int S;
        int T;
        int U;
        int V;
        int W;
        int X;
        float Y;
        b Z;

        /* renamed from: a, reason: collision with root package name */
        public int f1381a;

        /* renamed from: b, reason: collision with root package name */
        public int f1382b;

        /* renamed from: c, reason: collision with root package name */
        public float f1383c;

        /* renamed from: d, reason: collision with root package name */
        public int f1384d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public String y;
        float z;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.f1381a = -1;
            this.f1382b = -1;
            this.f1383c = -1.0f;
            this.f1384d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0.5f;
            this.x = 0.5f;
            this.y = null;
            this.z = 0.0f;
            this.A = 1;
            this.B = 0.0f;
            this.C = 0.0f;
            this.D = 0;
            this.E = 0;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = true;
            this.P = true;
            this.Q = false;
            this.R = false;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = 0.5f;
            this.Z = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                    this.f1384d = obtainStyledAttributes.getResourceId(index, this.f1384d);
                    if (this.f1384d == -1) {
                        this.f1384d = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    if (this.e == -1) {
                        this.e = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    if (this.f == -1) {
                        this.f = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                    this.g = obtainStyledAttributes.getResourceId(index, this.g);
                    if (this.g == -1) {
                        this.g = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                    this.h = obtainStyledAttributes.getResourceId(index, this.h);
                    if (this.h == -1) {
                        this.h = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                    this.i = obtainStyledAttributes.getResourceId(index, this.i);
                    if (this.i == -1) {
                        this.i = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                    if (this.j == -1) {
                        this.j = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                    this.k = obtainStyledAttributes.getResourceId(index, this.k);
                    if (this.k == -1) {
                        this.k = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                    this.l = obtainStyledAttributes.getResourceId(index, this.l);
                    if (this.l == -1) {
                        this.l = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX) {
                    this.L = obtainStyledAttributes.getDimensionPixelOffset(index, this.L);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY) {
                    this.M = obtainStyledAttributes.getDimensionPixelOffset(index, this.M);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                    this.f1381a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1381a);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end) {
                    this.f1382b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1382b);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                    this.f1383c = obtainStyledAttributes.getFloat(index, this.f1383c);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.N = obtainStyledAttributes.getInt(index, this.N);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                    this.m = obtainStyledAttributes.getResourceId(index, this.m);
                    if (this.m == -1) {
                        this.m = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                    this.n = obtainStyledAttributes.getResourceId(index, this.n);
                    if (this.n == -1) {
                        this.n = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                    this.o = obtainStyledAttributes.getResourceId(index, this.o);
                    if (this.o == -1) {
                        this.o = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                    this.p = obtainStyledAttributes.getResourceId(index, this.p);
                    if (this.p == -1) {
                        this.p = obtainStyledAttributes.getInt(index, -1);
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft) {
                    this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_goneMarginTop) {
                    this.r = obtainStyledAttributes.getDimensionPixelSize(index, this.r);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_goneMarginRight) {
                    this.s = obtainStyledAttributes.getDimensionPixelSize(index, this.s);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom) {
                    this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_goneMarginStart) {
                    this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd) {
                    this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                    this.w = obtainStyledAttributes.getFloat(index, this.w);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                    this.y = obtainStyledAttributes.getString(index);
                    this.z = Float.NaN;
                    this.A = -1;
                    if (this.y != null) {
                        int length = this.y.length();
                        int indexOf = this.y.indexOf(44);
                        if (indexOf <= 0 || indexOf >= length - 1) {
                            i = 0;
                        } else {
                            String substring = this.y.substring(0, indexOf);
                            if (substring.equalsIgnoreCase("W")) {
                                this.A = 0;
                            } else if (substring.equalsIgnoreCase("H")) {
                                this.A = 1;
                            }
                            i = indexOf + 1;
                        }
                        int indexOf2 = this.y.indexOf(58);
                        if (indexOf2 >= 0 && indexOf2 < length - 1) {
                            String substring2 = this.y.substring(i, indexOf2);
                            String substring3 = this.y.substring(indexOf2 + 1);
                            if (substring2.length() > 0 && substring3.length() > 0) {
                                try {
                                    float parseFloat = Float.parseFloat(substring2);
                                    float parseFloat2 = Float.parseFloat(substring3);
                                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                        if (this.A == 1) {
                                            this.z = Math.abs(parseFloat2 / parseFloat);
                                        } else {
                                            this.z = Math.abs(parseFloat / parseFloat2);
                                        }
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                        } else {
                            String substring4 = this.y.substring(i);
                            if (substring4.length() > 0) {
                                this.z = Float.parseFloat(substring4);
                            }
                        }
                    }
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight) {
                    this.B = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight) {
                    this.C = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle) {
                    this.D = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle) {
                    this.E = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default) {
                    this.F = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default) {
                    this.G = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min) {
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max) {
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min) {
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                } else if (index == R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max) {
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                } else if (index != R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator && index != R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator && index != R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator && index != R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator) {
                    int i3 = R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator;
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.R = false;
            this.O = true;
            this.P = true;
            if (this.width == 0 || this.width == -1) {
                this.O = false;
            }
            if (this.height == 0 || this.height == -1) {
                this.P = false;
            }
            if (this.f1383c == -1.0f && this.f1381a == -1 && this.f1382b == -1) {
                return;
            }
            this.R = true;
            this.O = true;
            this.P = true;
            if (!(this.Z instanceof d)) {
                this.Z = new d();
            }
            ((d) this.Z).m(this.N);
        }

        public a(int i, int i2) {
            super(i, i2);
            this.f1381a = -1;
            this.f1382b = -1;
            this.f1383c = -1.0f;
            this.f1384d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0.5f;
            this.x = 0.5f;
            this.y = null;
            this.z = 0.0f;
            this.A = 1;
            this.B = 0.0f;
            this.C = 0.0f;
            this.D = 0;
            this.E = 0;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = true;
            this.P = true;
            this.Q = false;
            this.R = false;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = 0.5f;
            this.Z = new b();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1381a = -1;
            this.f1382b = -1;
            this.f1383c = -1.0f;
            this.f1384d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0.5f;
            this.x = 0.5f;
            this.y = null;
            this.z = 0.0f;
            this.A = 1;
            this.B = 0.0f;
            this.C = 0.0f;
            this.D = 0;
            this.E = 0;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = true;
            this.P = true;
            this.Q = false;
            this.R = false;
            this.S = -1;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = -1;
            this.X = -1;
            this.Y = 0.5f;
            this.Z = new b();
        }

        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            super.resolveLayoutDirection(i);
            this.U = -1;
            this.V = -1;
            this.S = -1;
            this.T = -1;
            this.W = -1;
            this.X = -1;
            this.W = this.q;
            this.X = this.s;
            this.Y = this.w;
            if (1 == getLayoutDirection()) {
                if (this.m != -1) {
                    this.U = this.m;
                } else if (this.n != -1) {
                    this.V = this.n;
                }
                if (this.o != -1) {
                    this.T = this.o;
                }
                if (this.p != -1) {
                    this.S = this.p;
                }
                if (this.u != -1) {
                    this.X = this.u;
                }
                if (this.v != -1) {
                    this.W = this.v;
                }
                this.Y = 1.0f - this.w;
            } else {
                if (this.m != -1) {
                    this.T = this.m;
                }
                if (this.n != -1) {
                    this.S = this.n;
                }
                if (this.o != -1) {
                    this.U = this.o;
                }
                if (this.p != -1) {
                    this.V = this.p;
                }
                if (this.u != -1) {
                    this.W = this.u;
                }
                if (this.v != -1) {
                    this.X = this.v;
                }
            }
            if (this.o == -1 && this.p == -1) {
                if (this.f != -1) {
                    this.U = this.f;
                } else if (this.g != -1) {
                    this.V = this.g;
                }
            }
            if (this.n == -1 && this.m == -1) {
                if (this.f1384d != -1) {
                    this.S = this.f1384d;
                } else if (this.e != -1) {
                    this.T = this.e;
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.h = true;
    }
}
