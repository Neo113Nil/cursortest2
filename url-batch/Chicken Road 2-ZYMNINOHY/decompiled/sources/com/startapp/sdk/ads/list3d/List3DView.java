package com.startapp.sdk.ads.list3d;

import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.sdk.internal.nb;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.t6;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a, reason: collision with root package name */
    private Adapter f6178a;

    /* renamed from: b, reason: collision with root package name */
    protected int f6179b;

    /* renamed from: c, reason: collision with root package name */
    protected int f6180c;

    /* renamed from: d, reason: collision with root package name */
    protected int f6181d;

    /* renamed from: e, reason: collision with root package name */
    protected int f6182e;

    /* renamed from: f, reason: collision with root package name */
    protected int f6183f;

    /* renamed from: g, reason: collision with root package name */
    protected int f6184g;

    /* renamed from: h, reason: collision with root package name */
    protected int f6185h;

    /* renamed from: i, reason: collision with root package name */
    protected int f6186i;

    /* renamed from: j, reason: collision with root package name */
    protected int f6187j;

    /* renamed from: k, reason: collision with root package name */
    private VelocityTracker f6188k;

    /* renamed from: l, reason: collision with root package name */
    protected t6 f6189l;

    /* renamed from: m, reason: collision with root package name */
    private c f6190m;
    private final LinkedList n;
    private d o;

    /* renamed from: p, reason: collision with root package name */
    private Rect f6191p;

    /* renamed from: q, reason: collision with root package name */
    private Camera f6192q;

    /* renamed from: r, reason: collision with root package name */
    private Matrix f6193r;

    /* renamed from: s, reason: collision with root package name */
    private Paint f6194s;

    /* renamed from: t, reason: collision with root package name */
    private int f6195t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f6196u;
    private boolean v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6197w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6198x;

    public List3DView(List3DActivity list3DActivity) {
        super(list3DActivity, null);
        this.f6179b = 0;
        this.n = new LinkedList();
        this.f6195t = Integer.MIN_VALUE;
        this.f6196u = false;
        this.v = false;
        this.f6197w = false;
        this.f6198x = false;
    }

    private void a(Canvas canvas, Bitmap bitmap, int i4, int i5, int i6, int i7, float f4, float f5) {
        if (this.f6192q == null) {
            this.f6192q = new Camera();
        }
        this.f6192q.save();
        this.f6192q.translate(0.0f, 0.0f, i7);
        this.f6192q.rotateX(f5);
        float f6 = -i7;
        this.f6192q.translate(0.0f, 0.0f, f6);
        if (this.f6193r == null) {
            this.f6193r = new Matrix();
        }
        this.f6192q.getMatrix(this.f6193r);
        this.f6192q.restore();
        this.f6193r.preTranslate(-i6, f6);
        this.f6193r.postScale(f4, f4);
        this.f6193r.postTranslate(i5 + i6, i4 + i7);
        if (this.f6194s == null) {
            Paint paint = new Paint();
            this.f6194s = paint;
            paint.setAntiAlias(true);
            this.f6194s.setFilterBitmap(true);
        }
        Paint paint2 = this.f6194s;
        double cos = Math.cos((f5 * 3.141592653589793d) / 180.0d);
        int i8 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i8 > 255) {
            i8 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i8, i8, i8), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f6193r, this.f6194s);
    }

    public final void b(int i4) {
        int height;
        int i5 = this.f6182e + i4;
        this.f6183f = i5;
        int height2 = (-(i5 * 270)) / getHeight();
        this.f6185h = height2;
        int i6 = height2 % 90;
        if (i6 < 45) {
            height = (getHeight() * (-(height2 - i6))) / 270;
        } else {
            height = (getHeight() * (-((height2 + 90) - i6))) / 270;
        }
        if (this.f6195t == Integer.MIN_VALUE && this.f6187j == this.f6178a.getCount() - 1) {
            if (getChildAt(getChildCount() - 1).getBottom() + ((int) ((r4.getMeasuredHeight() * 0.35000002f) / 2.0f)) < getHeight()) {
                this.f6195t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i7 = this.f6195t;
            if (height < i7) {
                height = i7;
            }
        }
        t6 t6Var = this.f6189l;
        float f4 = height;
        t6Var.f7593c = f4;
        t6Var.f7594d = f4;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j4);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f4 = ((top + height) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos(f4)) * 0.15000000596046448d));
        float f5 = (this.f6185h - (f4 * 20.0f)) % 90.0f;
        if (f5 < 0.0f) {
            f5 += 90.0f;
        }
        if (f5 < 45.0f) {
            a(canvas, drawingCache, top, left, width, height, cos, f5 - 90.0f);
            a(canvas, drawingCache, top, left, width, height, cos, f5);
            return false;
        }
        float f6 = f5;
        a(canvas, drawingCache, top, left, width, height, cos, f6);
        a(canvas, drawingCache, top, left, width, height, cos, f6 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f6178a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f6190m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z, i4, i5, i6, i7);
        if (!this.f6196u || this.f6178a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.f6197w) {
                this.f6183f = getHeight() / 3;
            }
            this.f6187j = -1;
            int i9 = this.f6183f;
            while (i9 < getHeight() && this.f6187j < this.f6178a.getCount() - 1) {
                int i10 = this.f6187j + 1;
                this.f6187j = i10;
                View view = this.f6178a.getView(i10, this.n.size() != 0 ? (View) this.n.removeFirst() : null, this);
                a(view, 0);
                i9 += (((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view.getMeasuredHeight();
            }
        } else {
            int a3 = (this.f6183f + this.f6184g) - a(getChildAt(0));
            int childCount = getChildCount();
            if (this.f6187j != this.f6178a.getCount() - 1 && childCount > 1) {
                View childAt = getChildAt(0);
                while (childAt != null && childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) + a3 < 0) {
                    removeViewInLayout(childAt);
                    childCount--;
                    this.n.addLast(childAt);
                    this.f6186i++;
                    this.f6184g = (((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + childAt.getMeasuredHeight() + this.f6184g;
                    childAt = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.f6186i != 0 && childCount > 1) {
                View childAt2 = getChildAt(childCount - 1);
                while (childAt2 != null && a(childAt2) + a3 > getHeight()) {
                    removeViewInLayout(childAt2);
                    int i11 = childCount - 1;
                    this.n.addLast(childAt2);
                    this.f6187j--;
                    childAt2 = i11 > 1 ? getChildAt(childCount - 2) : null;
                    childCount = i11;
                }
            }
            int bottom = getChildAt(getChildCount() - 1).getBottom();
            int measuredHeight = (int) ((r2.getMeasuredHeight() * 0.35000002f) / 2.0f);
            while (true) {
                bottom += measuredHeight;
                if (bottom + a3 >= getHeight() || this.f6187j >= this.f6178a.getCount() - 1) {
                    break;
                }
                int i12 = this.f6187j + 1;
                this.f6187j = i12;
                View view2 = this.f6178a.getView(i12, this.n.size() != 0 ? (View) this.n.removeFirst() : null, this);
                a(view2, 0);
                measuredHeight = (((int) ((view2.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view2.getMeasuredHeight();
            }
            int a4 = a(getChildAt(0));
            while (a4 + a3 > 0 && (i8 = this.f6186i) > 0) {
                int i13 = i8 - 1;
                this.f6186i = i13;
                View view3 = this.f6178a.getView(i13, this.n.size() != 0 ? (View) this.n.removeFirst() : null, this);
                a(view3, 1);
                int measuredHeight2 = (((int) ((view3.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view3.getMeasuredHeight();
                a4 -= measuredHeight2;
                this.f6184g -= measuredHeight2;
            }
        }
        int i14 = this.f6183f + this.f6184g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt3 = getChildAt(i15);
            int sin = (int) (Math.sin(height * 6.283185307179586d * i14) * width);
            int measuredWidth = childAt3.getMeasuredWidth();
            int measuredHeight3 = childAt3.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + sin;
            int measuredHeight4 = (int) ((childAt3.getMeasuredHeight() * 0.35000002f) / 2.0f);
            int i16 = i14 + measuredHeight4;
            childAt3.layout(width2, i16, measuredWidth + width2, i16 + measuredHeight3);
            i14 += (measuredHeight4 * 2) + measuredHeight3;
        }
        if (this.f6197w && !this.f6198x) {
            this.f6198x = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new nb(this), 5L);
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r1 <= (r0 + 10)) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            float f4 = 0.0f;
            if (action == 1) {
                int i4 = this.f6179b;
                if (i4 == 1) {
                    int a3 = a((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (a3 != -1) {
                        View childAt = getChildAt(a3);
                        int i5 = this.f6186i + a3;
                        performItemClick(childAt, i5, this.f6178a.getItemId(i5));
                    }
                } else if (i4 == 2) {
                    this.f6188k.addMovement(motionEvent);
                    this.f6188k.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    f4 = this.f6188k.getYVelocity();
                }
                a(f4);
            } else if (action != 2) {
                a(0.0f);
            } else {
                if (this.f6179b == 1) {
                    int x4 = (int) motionEvent.getX();
                    int y4 = (int) motionEvent.getY();
                    int i6 = this.f6180c;
                    if (x4 >= i6 - 10 && x4 <= i6 + 10) {
                        int i7 = this.f6181d;
                        if (y4 >= i7 - 10) {
                        }
                    }
                    removeCallbacks(this.o);
                    this.f6179b = 2;
                }
                if (this.f6179b == 2) {
                    this.f6188k.addMovement(motionEvent);
                    b(((int) motionEvent.getY()) - this.f6181d);
                }
            }
        } else {
            p0.a(this);
            removeCallbacks(this.f6190m);
            this.f6180c = (int) motionEvent.getX();
            this.f6181d = (int) motionEvent.getY();
            this.f6182e = a(getChildAt(0)) - this.f6184g;
            if (this.o == null) {
                this.o = new d(this);
            }
            postDelayed(this.o, ViewConfiguration.getLongPressTimeout());
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f6188k = obtain;
            obtain.addMovement(motionEvent);
            this.f6179b = 1;
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (this.v) {
            setAlpha(0.0f);
        }
        this.f6178a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(t6 t6Var) {
        t6 t6Var2 = this.f6189l;
        if (t6Var2 != null) {
            float f4 = t6Var2.f7591a;
            float f5 = t6Var2.f7592b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f7592b = f5;
            t6Var.f7591a = f4;
            t6Var.f7595e = currentAnimationTimeMillis;
        }
        this.f6189l = t6Var;
    }

    public void setFade(boolean z) {
        this.v = z;
    }

    public void setHint(boolean z) {
        this.f6197w = z;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i4) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f6196u = true;
    }

    private void a(float f4) {
        VelocityTracker velocityTracker = this.f6188k;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.f6188k = null;
        removeCallbacks(this.o);
        if (this.f6190m == null) {
            this.f6190m = new c(this);
        }
        t6 t6Var = this.f6189l;
        if (t6Var != null) {
            float f5 = this.f6183f;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f7592b = f4;
            t6Var.f7591a = f5;
            t6Var.f7595e = currentAnimationTimeMillis;
            post(this.f6190m);
        }
        this.f6179b = 0;
    }

    public final int a(int i4, int i5) {
        if (this.f6191p == null) {
            this.f6191p = new Rect();
        }
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).getHitRect(this.f6191p);
            if (this.f6191p.contains(i4, i5)) {
                return i6;
            }
        }
        return -1;
    }

    public final void a(int i4) {
        View childAt = getChildAt(i4);
        int i5 = this.f6186i + i4;
        long itemId = this.f6178a.getItemId(i5);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i5, itemId);
        }
    }

    private void a(View view, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i5 = i4 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i5, layoutParams, true);
        view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
    }

    public static int a(View view) {
        return view.getTop() - ((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f));
    }
}
