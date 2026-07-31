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
import com.facebook.imagepipeline.common.RotationOptions;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.s6;
import com.startapp.sdk.internal.ua;
import java.util.LinkedList;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a, reason: collision with root package name */
    private Adapter f89a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    private VelocityTracker k;
    protected s6 l;
    private c m;
    private final LinkedList n;
    private d o;
    private Rect p;
    private Camera q;
    private Matrix r;
    private Paint s;
    private int t;
    protected boolean u;
    private boolean v;
    private boolean w;
    private boolean x;

    public List3DView(List3DActivity list3DActivity) {
        super(list3DActivity, null);
        this.b = 0;
        this.n = new LinkedList();
        this.t = Integer.MIN_VALUE;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
    }

    private void a(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.q == null) {
            this.q = new Camera();
        }
        this.q.save();
        this.q.translate(0.0f, 0.0f, i4);
        this.q.rotateX(f2);
        float f3 = -i4;
        this.q.translate(0.0f, 0.0f, f3);
        if (this.r == null) {
            this.r = new Matrix();
        }
        this.q.getMatrix(this.r);
        this.q.restore();
        this.r.preTranslate(-i3, f3);
        this.r.postScale(f, f);
        this.r.postTranslate(i2 + i3, i + i4);
        if (this.s == null) {
            Paint paint = new Paint();
            this.s = paint;
            paint.setAntiAlias(true);
            this.s.setFilterBitmap(true);
        }
        Paint paint2 = this.s;
        double cos = Math.cos((f2 * 3.141592653589793d) / 180.0d);
        int i5 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i5 > 255) {
            i5 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i5, i5, i5), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.r, this.s);
    }

    protected final void b(int i) {
        int height;
        int i2 = this.e + i;
        this.f = i2;
        int height2 = (-(i2 * RotationOptions.ROTATE_270)) / getHeight();
        this.h = height2;
        int i3 = height2 % 90;
        if (i3 < 45) {
            height = (getHeight() * (-(height2 - i3))) / RotationOptions.ROTATE_270;
        } else {
            height = (getHeight() * (-((height2 + 90) - i3))) / RotationOptions.ROTATE_270;
        }
        if (this.t == Integer.MIN_VALUE && this.j == this.f89a.getCount() - 1) {
            if (getChildAt(getChildCount() - 1).getBottom() + ((int) ((r4.getMeasuredHeight() * 0.35000002f) / 2.0f)) < getHeight()) {
                this.t = height;
            }
        }
        if (height > 0) {
            height = 0;
        } else {
            int i4 = this.t;
            if (height < i4) {
                height = i4;
            }
        }
        s6 s6Var = this.l;
        float f = height;
        s6Var.c = f;
        s6Var.d = f;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = getHeight() / 2;
        float f = ((top + height) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos(f)) * 0.15000000596046448d));
        float f2 = (this.h - (f * 20.0f)) % 90.0f;
        if (f2 < 0.0f) {
            f2 += 90.0f;
        }
        if (f2 < 45.0f) {
            a(canvas, drawingCache, top, left, width, height, cos, f2 - 90.0f);
            a(canvas, drawingCache, top, left, width, height, cos, f2);
            return false;
        }
        float f3 = f2;
        a(canvas, drawingCache, top, left, width, height, cos, f3);
        a(canvas, drawingCache, top, left, width, height, cos, f3 - 90.0f);
        return false;
    }

    @Override // android.widget.AdapterView
    public final Adapter getAdapter() {
        return this.f89a;
    }

    @Override // android.widget.AdapterView
    public final View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.m);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.u || this.f89a == null) {
            return;
        }
        if (getChildCount() == 0) {
            if (this.w) {
                this.f = getHeight() / 3;
            }
            this.j = -1;
            int i6 = this.f;
            while (i6 < getHeight() && this.j < this.f89a.getCount() - 1) {
                int i7 = this.j + 1;
                this.j = i7;
                View view = this.f89a.getView(i7, this.n.size() != 0 ? (View) this.n.removeFirst() : null, this);
                a(view, 0);
                i6 += (((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view.getMeasuredHeight();
            }
        } else {
            int a2 = (this.f + this.g) - a(getChildAt(0));
            int childCount = getChildCount();
            if (this.j != this.f89a.getCount() - 1 && childCount > 1) {
                View childAt = getChildAt(0);
                while (childAt != null && childAt.getBottom() + ((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) + a2 < 0) {
                    removeViewInLayout(childAt);
                    childCount--;
                    this.n.addLast(childAt);
                    this.i++;
                    this.g = (((int) ((childAt.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + childAt.getMeasuredHeight() + this.g;
                    childAt = childCount > 1 ? getChildAt(0) : null;
                }
            }
            if (this.i != 0 && childCount > 1) {
                View childAt2 = getChildAt(childCount - 1);
                while (childAt2 != null && a(childAt2) + a2 > getHeight()) {
                    removeViewInLayout(childAt2);
                    int i8 = childCount - 1;
                    this.n.addLast(childAt2);
                    this.j--;
                    childAt2 = i8 > 1 ? getChildAt(childCount - 2) : null;
                    childCount = i8;
                }
            }
            int bottom = getChildAt(getChildCount() - 1).getBottom();
            int measuredHeight = (int) ((r2.getMeasuredHeight() * 0.35000002f) / 2.0f);
            while (true) {
                bottom += measuredHeight;
                if (bottom + a2 >= getHeight() || this.j >= this.f89a.getCount() - 1) {
                    break;
                }
                int i9 = this.j + 1;
                this.j = i9;
                View view2 = this.f89a.getView(i9, this.n.size() != 0 ? (View) this.n.removeFirst() : null, this);
                a(view2, 0);
                measuredHeight = (((int) ((view2.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view2.getMeasuredHeight();
            }
            int a3 = a(getChildAt(0));
            while (a3 + a2 > 0 && (i5 = this.i) > 0) {
                int i10 = i5 - 1;
                this.i = i10;
                View view3 = this.f89a.getView(i10, this.n.size() != 0 ? (View) this.n.removeFirst() : null, this);
                a(view3, 1);
                int measuredHeight2 = (((int) ((view3.getMeasuredHeight() * 0.35000002f) / 2.0f)) * 2) + view3.getMeasuredHeight();
                a3 -= measuredHeight2;
                this.g -= measuredHeight2;
            }
        }
        int i11 = this.f + this.g;
        float width = getWidth() * 0.0f;
        float height = 1.0f / (getHeight() * 0.9f);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt3 = getChildAt(i12);
            int sin = (int) (Math.sin(height * 6.283185307179586d * i11) * width);
            int measuredWidth = childAt3.getMeasuredWidth();
            int measuredHeight3 = childAt3.getMeasuredHeight();
            int width2 = ((getWidth() - measuredWidth) / 2) + sin;
            int measuredHeight4 = (int) ((childAt3.getMeasuredHeight() * 0.35000002f) / 2.0f);
            int i13 = i11 + measuredHeight4;
            childAt3.layout(width2, i13, measuredWidth + width2, i13 + measuredHeight3);
            i11 += (measuredHeight4 * 2) + measuredHeight3;
        }
        if (this.w && !this.x) {
            this.x = true;
            dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
            postDelayed(new ua(this), 5L);
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
                int i = this.b;
                if (i == 1) {
                    int a2 = a((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (a2 != -1) {
                        View childAt = getChildAt(a2);
                        int i2 = this.i + a2;
                        performItemClick(childAt, i2, this.f89a.getItemId(i2));
                    }
                } else if (i == 2) {
                    this.k.addMovement(motionEvent);
                    this.k.computeCurrentVelocity(1000);
                    f = this.k.getYVelocity();
                }
                a(f);
            } else if (action != 2) {
                a(0.0f);
            } else {
                if (this.b == 1) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int i3 = this.c;
                    if (x >= i3 - 10 && x <= i3 + 10) {
                        int i4 = this.d;
                        if (y >= i4 - 10) {
                        }
                    }
                    removeCallbacks(this.o);
                    this.b = 2;
                }
                if (this.b == 2) {
                    this.k.addMovement(motionEvent);
                    b(((int) motionEvent.getY()) - this.d);
                }
            }
        } else {
            m0.a(this);
            removeCallbacks(this.m);
            this.c = (int) motionEvent.getX();
            this.d = (int) motionEvent.getY();
            this.e = a(getChildAt(0)) - this.g;
            if (this.o == null) {
                this.o = new d(this);
            }
            postDelayed(this.o, ViewConfiguration.getLongPressTimeout());
            VelocityTracker obtain = VelocityTracker.obtain();
            this.k = obtain;
            obtain.addMovement(motionEvent);
            this.b = 1;
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        if (this.v) {
            setAlpha(0.0f);
        }
        this.f89a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(s6 s6Var) {
        s6 s6Var2 = this.l;
        if (s6Var2 != null) {
            float f = s6Var2.f417a;
            float f2 = s6Var2.b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            s6Var.b = f2;
            s6Var.f417a = f;
            s6Var.e = currentAnimationTimeMillis;
        }
        this.l = s6Var;
    }

    public void setFade(boolean z) {
        this.v = z;
    }

    public void setHint(boolean z) {
        this.w = z;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.u = true;
    }

    private void a(float f) {
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.k = null;
        removeCallbacks(this.o);
        if (this.m == null) {
            this.m = new c(this);
        }
        s6 s6Var = this.l;
        if (s6Var != null) {
            float f2 = this.f;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            s6Var.b = f;
            s6Var.f417a = f2;
            s6Var.e = currentAnimationTimeMillis;
            post(this.m);
        }
        this.b = 0;
    }

    protected final int a(int i, int i2) {
        if (this.p == null) {
            this.p = new Rect();
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).getHitRect(this.p);
            if (this.p.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    protected final void a(int i) {
        View childAt = getChildAt(i);
        int i2 = this.i + i;
        long itemId = this.f89a.getItemId(i2);
        AdapterView.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemLongClickListener != null) {
            onItemLongClickListener.onItemLongClick(this, childAt, i2, itemId);
        }
    }

    private void a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i2 = i == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i2, layoutParams, true);
        view.measure(((int) (getWidth() * 0.85f)) | 1073741824, 0);
    }

    protected static int a(View view) {
        return view.getTop() - ((int) ((view.getMeasuredHeight() * 0.35000002f) / 2.0f));
    }
}
