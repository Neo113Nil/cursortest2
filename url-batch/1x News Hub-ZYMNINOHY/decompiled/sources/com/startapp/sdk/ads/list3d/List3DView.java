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
    private Adapter f3095a;

    /* renamed from: b, reason: collision with root package name */
    protected int f3096b;

    /* renamed from: c, reason: collision with root package name */
    protected int f3097c;

    /* renamed from: d, reason: collision with root package name */
    protected int f3098d;

    /* renamed from: e, reason: collision with root package name */
    protected int f3099e;
    protected int f;

    /* renamed from: g, reason: collision with root package name */
    protected int f3100g;

    /* renamed from: h, reason: collision with root package name */
    protected int f3101h;

    /* renamed from: i, reason: collision with root package name */
    protected int f3102i;

    /* renamed from: j, reason: collision with root package name */
    protected int f3103j;

    /* renamed from: k, reason: collision with root package name */
    private VelocityTracker f3104k;

    /* renamed from: l, reason: collision with root package name */
    protected t6 f3105l;

    /* renamed from: m, reason: collision with root package name */
    private c f3106m;

    /* renamed from: n, reason: collision with root package name */
    private final LinkedList f3107n;
    private d o;

    /* renamed from: p, reason: collision with root package name */
    private Rect f3108p;

    /* renamed from: q, reason: collision with root package name */
    private Camera f3109q;

    /* renamed from: r, reason: collision with root package name */
    private Matrix f3110r;

    /* renamed from: s, reason: collision with root package name */
    private Paint f3111s;

    /* renamed from: t, reason: collision with root package name */
    private int f3112t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f3113u;
    private boolean v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3114w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f3115x;

    public List3DView(List3DActivity list3DActivity) {
        super(list3DActivity, null);
        this.f3096b = 0;
        this.f3107n = new LinkedList();
        this.f3112t = Integer.MIN_VALUE;
        this.f3113u = false;
        this.v = false;
        this.f3114w = false;
        this.f3115x = false;
    }

    private void a(Canvas canvas, Bitmap bitmap, int i3, int i4, int i5, int i6, float f, float f3) {
        if (this.f3109q == null) {
            this.f3109q = new Camera();
        }
        this.f3109q.save();
        this.f3109q.translate(0.0f, 0.0f, i6);
        this.f3109q.rotateX(f3);
        float f4 = -i6;
        this.f3109q.translate(0.0f, 0.0f, f4);
        if (this.f3110r == null) {
            this.f3110r = new Matrix();
        }
        this.f3109q.getMatrix(this.f3110r);
        this.f3109q.restore();
        this.f3110r.preTranslate(-i5, f4);
        this.f3110r.postScale(f, f);
        this.f3110r.postTranslate(i4 + i5, i3 + i6);
        if (this.f3111s == null) {
            Paint paint = new Paint();
            this.f3111s = paint;
            paint.setAntiAlias(true);
            this.f3111s.setFilterBitmap(true);
        }
        Paint paint2 = this.f3111s;
        double cos = Math.cos((f3 * 3.141592653589793d) / 180.0d);
        int i7 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i7 > 255) {
            i7 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i7, i7, i7), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f3110r, this.f3111s);
    }

    public final void b(int i3) {
        int height;
        int i4 = this.f3099e + i3;
        this.f = i4;
        int height2 = (-(i4 * 270)) / getHeight();
        this.f3101h = height2;
        int i5 = height2 % 90;
        if (i5 < 45) {
            height = (getHeight() * (-(height2 - i5))) / 270;
        } else {
            height = (getHeight() * (-((height2 + 90) - i5))) / 270;
        }
        if (this.f3112t == Integer.MIN_VALUE && this.f3103j == this.f3095a.getCount() - 1) {
            if (getChildAt(getChildCount() - 1).getBottom() + ((int) ((r4.getMeasuredHeight() * 0.35000002f) / 2.0f)) < getHeight()) {
                this.f3112t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i6 = this.f3112t;
            if (height < i6) {
                height = i6;
            }
        }
        t6 t6Var = this.f3105l;
        float f = height;
        t6Var.f4456c = f;
        t6Var.f4457d = f;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j3);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f = ((top + height) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos(f)) * 0.15000000596046448d));
        float f3 = (this.f3101h - (f * 20.0f)) % 90.0f;
        if (f3 < 0.0f) {
            f3 += 90.0f;
        }
        if (f3 < 45.0f) {
            a(canvas, drawingCache, top, left, width, height, cos, f3 - 90.0f);
            a(canvas, drawingCache, top, left, width, height, cos, f3);
            return false;
        }
        float f4 = f3;
        a(canvas, drawingCache, top, left, width, height, cos, f4);
        a(canvas, drawingCache, top, left, width, height, cos, f4 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f3095a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3106m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z, i3, i4, i5, i6);
        if (!this.f3113u || this.f3095a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.f3114w) {
                this.f = getHeight() / 3;
            }
            this.f3103j = -1;
            int i8 = this.f;
            while (i8 < getHeight() && this.f3103j < this.f3095a.getCount() - 1) {
                int i9 = this.f3103j + 1;
                this.f3103j = i9;
                View view = this.f3095a.getView(i9, this.f3107n.size() != 0 ? (View) this.f3107n.removeFirst() : null, this);
                a(view, 0);
                i8 += (((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view.getMeasuredHeight();
            }
        } else {
            int a3 = (this.f + this.f3100g) - a(getChildAt(0));
            int childCount = getChildCount();
            if (this.f3103j != this.f3095a.getCount() - 1 && childCount > 1) {
                View childAt = getChildAt(0);
                while (childAt != null && childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) + a3 < 0) {
                    removeViewInLayout(childAt);
                    childCount--;
                    this.f3107n.addLast(childAt);
                    this.f3102i++;
                    this.f3100g = (((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + childAt.getMeasuredHeight() + this.f3100g;
                    childAt = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.f3102i != 0 && childCount > 1) {
                View childAt2 = getChildAt(childCount - 1);
                while (childAt2 != null && a(childAt2) + a3 > getHeight()) {
                    removeViewInLayout(childAt2);
                    int i10 = childCount - 1;
                    this.f3107n.addLast(childAt2);
                    this.f3103j--;
                    childAt2 = i10 > 1 ? getChildAt(childCount - 2) : null;
                    childCount = i10;
                }
            }
            int bottom = getChildAt(getChildCount() - 1).getBottom();
            int measuredHeight = (int) ((r2.getMeasuredHeight() * 0.35000002f) / 2.0f);
            while (true) {
                bottom += measuredHeight;
                if (bottom + a3 >= getHeight() || this.f3103j >= this.f3095a.getCount() - 1) {
                    break;
                }
                int i11 = this.f3103j + 1;
                this.f3103j = i11;
                View view2 = this.f3095a.getView(i11, this.f3107n.size() != 0 ? (View) this.f3107n.removeFirst() : null, this);
                a(view2, 0);
                measuredHeight = (((int) ((view2.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view2.getMeasuredHeight();
            }
            int a4 = a(getChildAt(0));
            while (a4 + a3 > 0 && (i7 = this.f3102i) > 0) {
                int i12 = i7 - 1;
                this.f3102i = i12;
                View view3 = this.f3095a.getView(i12, this.f3107n.size() != 0 ? (View) this.f3107n.removeFirst() : null, this);
                a(view3, 1);
                int measuredHeight2 = (((int) ((view3.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view3.getMeasuredHeight();
                a4 -= measuredHeight2;
                this.f3100g -= measuredHeight2;
            }
        }
        int i13 = this.f + this.f3100g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt3 = getChildAt(i14);
            int sin = (int) (Math.sin(height * 6.283185307179586d * i13) * width);
            int measuredWidth = childAt3.getMeasuredWidth();
            int measuredHeight3 = childAt3.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + sin;
            int measuredHeight4 = (int) ((childAt3.getMeasuredHeight() * 0.35000002f) / 2.0f);
            int i15 = i13 + measuredHeight4;
            childAt3.layout(width2, i15, measuredWidth + width2, i15 + measuredHeight3);
            i13 += (measuredHeight4 * 2) + measuredHeight3;
        }
        if (this.f3114w && !this.f3115x) {
            this.f3115x = true;
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
            float f = 0.0f;
            if (action == 1) {
                int i3 = this.f3096b;
                if (i3 == 1) {
                    int a3 = a((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (a3 != -1) {
                        View childAt = getChildAt(a3);
                        int i4 = this.f3102i + a3;
                        performItemClick(childAt, i4, this.f3095a.getItemId(i4));
                    }
                } else if (i3 == 2) {
                    this.f3104k.addMovement(motionEvent);
                    this.f3104k.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    f = this.f3104k.getYVelocity();
                }
                a(f);
            } else if (action != 2) {
                a(0.0f);
            } else {
                if (this.f3096b == 1) {
                    int x3 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    int i5 = this.f3097c;
                    if (x3 >= i5 - 10 && x3 <= i5 + 10) {
                        int i6 = this.f3098d;
                        if (y3 >= i6 - 10) {
                        }
                    }
                    removeCallbacks(this.o);
                    this.f3096b = 2;
                }
                if (this.f3096b == 2) {
                    this.f3104k.addMovement(motionEvent);
                    b(((int) motionEvent.getY()) - this.f3098d);
                }
            }
        } else {
            p0.a(this);
            removeCallbacks(this.f3106m);
            this.f3097c = (int) motionEvent.getX();
            this.f3098d = (int) motionEvent.getY();
            this.f3099e = a(getChildAt(0)) - this.f3100g;
            if (this.o == null) {
                this.o = new d(this);
            }
            postDelayed(this.o, ViewConfiguration.getLongPressTimeout());
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f3104k = obtain;
            obtain.addMovement(motionEvent);
            this.f3096b = 1;
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (this.v) {
            setAlpha(0.0f);
        }
        this.f3095a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(t6 t6Var) {
        t6 t6Var2 = this.f3105l;
        if (t6Var2 != null) {
            float f = t6Var2.f4454a;
            float f3 = t6Var2.f4455b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f4455b = f3;
            t6Var.f4454a = f;
            t6Var.f4458e = currentAnimationTimeMillis;
        }
        this.f3105l = t6Var;
    }

    public void setFade(boolean z) {
        this.v = z;
    }

    public void setHint(boolean z) {
        this.f3114w = z;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i3) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f3113u = true;
    }

    private void a(float f) {
        VelocityTracker velocityTracker = this.f3104k;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.f3104k = null;
        removeCallbacks(this.o);
        if (this.f3106m == null) {
            this.f3106m = new c(this);
        }
        t6 t6Var = this.f3105l;
        if (t6Var != null) {
            float f3 = this.f;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            t6Var.f4455b = f;
            t6Var.f4454a = f3;
            t6Var.f4458e = currentAnimationTimeMillis;
            post(this.f3106m);
        }
        this.f3096b = 0;
    }

    public final int a(int i3, int i4) {
        if (this.f3108p == null) {
            this.f3108p = new Rect();
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).getHitRect(this.f3108p);
            if (this.f3108p.contains(i3, i4)) {
                return i5;
            }
        }
        return -1;
    }

    public final void a(int i3) {
        View childAt = getChildAt(i3);
        int i4 = this.f3102i + i3;
        long itemId = this.f3095a.getItemId(i4);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i4, itemId);
        }
    }

    private void a(View view, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i4 = i3 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i4, layoutParams, true);
        view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
    }

    public static int a(View view) {
        return view.getTop() - ((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f));
    }
}
