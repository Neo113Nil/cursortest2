package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ATRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Runnable f21497a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f21498b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f21499c;

    /* renamed from: d, reason: collision with root package name */
    private int f21500d;

    /* renamed from: e, reason: collision with root package name */
    private int f21501e;

    /* renamed from: f, reason: collision with root package name */
    private int f21502f;

    /* renamed from: g, reason: collision with root package name */
    private int f21503g;

    /* renamed from: h, reason: collision with root package name */
    private int f21504h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f21505j;

    /* renamed from: k, reason: collision with root package name */
    private int f21506k;

    /* renamed from: l, reason: collision with root package name */
    private float f21507l;

    /* renamed from: m, reason: collision with root package name */
    private float f21508m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21509n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21510o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21511p;

    public ATRotationView(Context context) {
        super(context);
        this.f21502f = 40;
        this.f21503g = 20;
        this.f21504h = 0;
        this.i = 0;
        this.f21506k = 0;
        this.f21507l = 0.5f;
        this.f21508m = 0.9f;
        this.f21509n = true;
        this.f21510o = false;
        this.f21511p = false;
        this.f21497a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f21498b = new Camera();
        this.f21499c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i = ((this.f21504h * this.f21500d) / 2) / this.f21502f;
        a(canvas, i, height, 0);
        a(canvas, i, height, 1);
        if (Math.abs(this.f21504h) > this.f21502f / 2) {
            a(canvas, i, height, 3);
            a(canvas, i, height, 2);
        } else {
            a(canvas, i, height, 2);
            a(canvas, i, height, 3);
        }
    }

    private void c(int i) {
        this.i = i;
        int a9 = Math.abs(this.f21504h) > this.f21502f / 2 ? a(2) : a(3);
        if (this.f21506k != a9) {
            this.f21506k = a9;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f21510o) {
            int height = getHeight() / 2;
            int i = ((this.f21504h * this.f21500d) / 2) / this.f21502f;
            a(canvas, i, height, 0);
            a(canvas, i, height, 1);
            if (Math.abs(this.f21504h) > this.f21502f / 2) {
                a(canvas, i, height, 3);
                a(canvas, i, height, 2);
                return;
            } else {
                a(canvas, i, height, 2);
                a(canvas, i, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i4 = ((this.f21504h * this.f21501e) / 2) / this.f21502f;
        b(canvas, i4, width, 0);
        b(canvas, i4, width, 1);
        if (Math.abs(this.f21504h) > this.f21502f / 2) {
            b(canvas, i4, width, 3);
            b(canvas, i4, width, 2);
        } else {
            b(canvas, i4, width, 2);
            b(canvas, i4, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        int i11 = i9 - i;
        float f6 = i11;
        float f9 = this.f21507l;
        int i12 = (int) (((1.0f - f9) * f6) / 2.0f);
        int i13 = i10 - i4;
        float f10 = i13;
        float f11 = this.f21508m;
        int i14 = (int) (((1.0f - f11) * f10) / 2.0f);
        this.f21500d = (int) (f10 * f11);
        this.f21501e = (int) (f6 * f9);
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            childAt.layout(i12, i14, i11 - i12, i13 - i14);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i16 = layoutParams.width;
            int i17 = this.f21501e;
            if (i16 != i17) {
                layoutParams.width = i17;
                layoutParams.height = this.f21500d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z8) {
        if (z8) {
            postDelayed(this.f21497a, 1000 / this.f21503g);
        }
        this.f21509n = z8;
    }

    public void setHeightRatio(float f6) {
        this.f21508m = f6;
    }

    public void setRotateV(boolean z8) {
        this.f21510o = z8;
        invalidate();
    }

    public void setWidthRatio(float f6) {
        this.f21507l = f6;
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i = ((this.f21504h * this.f21501e) / 2) / this.f21502f;
        b(canvas, i, width, 0);
        b(canvas, i, width, 1);
        if (Math.abs(this.f21504h) > this.f21502f / 2) {
            b(canvas, i, width, 3);
            b(canvas, i, width, 2);
        } else {
            b(canvas, i, width, 2);
            b(canvas, i, width, 3);
        }
    }

    private void b() {
        int a9;
        if (getChildCount() == 0) {
            return;
        }
        int i = this.f21504h - 1;
        this.f21504h = i;
        int i4 = this.i;
        this.f21505j = i4;
        int i9 = this.f21502f;
        int i10 = i4 - (i / i9);
        int i11 = i % i9;
        this.f21504h = i11;
        this.i = i10;
        if (Math.abs(i11) > this.f21502f / 2) {
            a9 = a(2);
        } else {
            a9 = a(3);
        }
        if (this.f21506k != a9) {
            this.f21506k = a9;
        }
        invalidate();
        if (this.f21509n) {
            postDelayed(this.f21497a, 1000 / this.f21503g);
        }
    }

    private void a(int i, int i4, int i9) {
        float f6 = (-i) / 2.0f;
        if (i9 == 0) {
            this.f21498b.translate(0.0f, f6, 0.0f);
            float f9 = -i4;
            this.f21498b.rotateX(f9);
            this.f21498b.translate(0.0f, f6, 0.0f);
            this.f21498b.translate(0.0f, f6, 0.0f);
            this.f21498b.rotateX(f9);
            this.f21498b.translate(0.0f, f6, 0.0f);
            return;
        }
        if (i9 == 1) {
            this.f21498b.translate(0.0f, f6, 0.0f);
            this.f21498b.rotateX(i4);
            this.f21498b.translate(0.0f, f6, 0.0f);
        } else if (i9 != 2) {
            if (i9 != 3) {
                return;
            }
            this.f21498b.rotateX(0.0f);
        } else {
            this.f21498b.translate(0.0f, f6, 0.0f);
            this.f21498b.rotateX(-i4);
            this.f21498b.translate(0.0f, f6, 0.0f);
        }
    }

    public ATRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21502f = 40;
        this.f21503g = 20;
        this.f21504h = 0;
        this.i = 0;
        this.f21506k = 0;
        this.f21507l = 0.5f;
        this.f21508m = 0.9f;
        this.f21509n = true;
        this.f21510o = false;
        this.f21511p = false;
        this.f21497a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i) {
        int a9;
        int i4 = this.f21502f;
        int i9 = this.f21505j - (i / i4);
        int i10 = i % i4;
        this.f21504h = i10;
        this.i = i9;
        if (Math.abs(i10) > this.f21502f / 2) {
            a9 = a(2);
        } else {
            a9 = a(3);
        }
        if (this.f21506k != a9) {
            this.f21506k = a9;
        }
        invalidate();
    }

    private void a(Canvas canvas, int i, int i4, int i9) {
        canvas.save();
        this.f21498b.save();
        this.f21499c.reset();
        float f6 = i;
        this.f21498b.translate(0.0f, f6, 0.0f);
        this.f21498b.rotateX(this.f21504h);
        this.f21498b.translate(0.0f, f6, 0.0f);
        if (i == 0) {
            if (this.f21511p) {
                a(this.f21500d, this.f21502f, i9);
            } else {
                a(-this.f21500d, -this.f21502f, i9);
            }
        } else if (i > 0) {
            a(this.f21500d, this.f21502f, i9);
        } else if (i < 0) {
            a(-this.f21500d, -this.f21502f, i9);
        }
        this.f21498b.getMatrix(this.f21499c);
        this.f21498b.restore();
        this.f21499c.preTranslate((-getWidth()) / 2, -i4);
        this.f21499c.postTranslate(getWidth() / 2, i4);
        canvas.concat(this.f21499c);
        View childAt = getChildAt(a(i9));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public ATRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21502f = 40;
        this.f21503g = 20;
        this.f21504h = 0;
        this.i = 0;
        this.f21506k = 0;
        this.f21507l = 0.5f;
        this.f21508m = 0.9f;
        this.f21509n = true;
        this.f21510o = false;
        this.f21511p = false;
        this.f21497a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.a(ATRotationView.this);
            }
        };
        a();
    }

    private void b(int i, int i4, int i9) {
        if (i9 == 0) {
            float f6 = (-i) / 2;
            this.f21498b.translate(f6, 0.0f, 0.0f);
            float f9 = -i4;
            this.f21498b.rotateY(f9);
            this.f21498b.translate(f6, 0.0f, 0.0f);
            this.f21498b.translate(f6, 0.0f, 0.0f);
            this.f21498b.rotateY(f9);
            this.f21498b.translate(f6, 0.0f, 0.0f);
            return;
        }
        if (i9 == 1) {
            float f10 = i / 2;
            this.f21498b.translate(f10, 0.0f, 0.0f);
            this.f21498b.rotateY(i4);
            this.f21498b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                return;
            }
            this.f21498b.rotateY(0.0f);
        } else {
            float f11 = (-i) / 2;
            this.f21498b.translate(f11, 0.0f, 0.0f);
            this.f21498b.rotateY(-i4);
            this.f21498b.translate(f11, 0.0f, 0.0f);
        }
    }

    private int a(int i) {
        int i4;
        int i9;
        int i10;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    i4 = i != 3 ? 0 : this.i;
                } else if (this.f21511p) {
                    i9 = this.i;
                    i4 = i9 - 1;
                } else {
                    i10 = this.i;
                    i4 = i10 + 1;
                }
            } else if (this.f21511p) {
                i10 = this.i;
                i4 = i10 + 1;
            } else {
                i9 = this.i;
                i4 = i9 - 1;
            }
        } else if (this.f21511p) {
            i4 = this.i - 2;
        } else {
            i4 = this.i + 2;
        }
        int childCount = i4 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    private void b(Canvas canvas, int i, int i4, int i9) {
        canvas.save();
        this.f21498b.save();
        this.f21499c.reset();
        float f6 = i;
        this.f21498b.translate(f6, 0.0f, 0.0f);
        this.f21498b.rotateY(this.f21504h);
        this.f21498b.translate(f6, 0.0f, 0.0f);
        if (i == 0) {
            if (this.f21511p) {
                b(this.f21501e, this.f21502f, i9);
            } else {
                b(-this.f21501e, -this.f21502f, i9);
            }
        } else if (i > 0) {
            b(this.f21501e, this.f21502f, i9);
        } else if (i < 0) {
            b(-this.f21501e, -this.f21502f, i9);
        }
        this.f21498b.getMatrix(this.f21499c);
        this.f21498b.restore();
        this.f21499c.preTranslate(-i4, (-getHeight()) / 2);
        this.f21499c.postTranslate(i4, getHeight() / 2);
        canvas.concat(this.f21499c);
        View childAt = getChildAt(a(i9));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public static /* synthetic */ void a(ATRotationView aTRotationView) {
        int a9;
        if (aTRotationView.getChildCount() != 0) {
            int i = aTRotationView.f21504h - 1;
            aTRotationView.f21504h = i;
            int i4 = aTRotationView.i;
            aTRotationView.f21505j = i4;
            int i9 = aTRotationView.f21502f;
            int i10 = i4 - (i / i9);
            int i11 = i % i9;
            aTRotationView.f21504h = i11;
            aTRotationView.i = i10;
            if (Math.abs(i11) > aTRotationView.f21502f / 2) {
                a9 = aTRotationView.a(2);
            } else {
                a9 = aTRotationView.a(3);
            }
            if (aTRotationView.f21506k != a9) {
                aTRotationView.f21506k = a9;
            }
            aTRotationView.invalidate();
            if (aTRotationView.f21509n) {
                aTRotationView.postDelayed(aTRotationView.f21497a, 1000 / aTRotationView.f21503g);
            }
        }
    }
}
