package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class js extends kt implements lc {
    private static final int[] t = {R.attr.state_pressed};
    private static final int[] u = new int[0];
    private final int A;
    private final int B;
    private final Runnable F;
    private final kt G;
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public RecyclerView l;
    public final ValueAnimator p;
    public int q;
    private final int v;
    private final int w;
    private final int x;
    private final StateListDrawable y;
    private final Drawable z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int C = 0;
    private final int[] D = new int[2];
    private final int[] E = new int[2];

    public js(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        this.q = 0;
        this.F = new bo(this, 10, null);
        jq jqVar = new jq(this);
        this.G = jqVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.y = stateListDrawable2;
        this.z = drawable2;
        this.w = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.x = Math.max(i, drawable.getIntrinsicWidth());
        this.A = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.B = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.v = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new jr(this));
        ofFloat.addUpdateListener(new mu(this, 1));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.au(this);
            this.l.T(this);
            this.l.at(jqVar);
            G();
        }
        this.l = recyclerView;
        if (recyclerView != null) {
            recyclerView.av(this);
            this.l.s(this);
            this.l.as(jqVar);
        }
    }

    private final void G() {
        this.l.removeCallbacks(this.F);
    }

    private final void H(int i) {
        G();
        this.l.postDelayed(this.F, i);
    }

    private final boolean I() {
        return this.l.getLayoutDirection() == 1;
    }

    private static final int J(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public final void e() {
        this.l.invalidate();
    }

    final void f(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(t);
            G();
        }
        if (i == 0) {
            e();
        } else {
            g();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(u);
            H(1200);
        } else if (i == 1) {
            H(1500);
        }
        this.o = i;
    }

    public final void g() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    final boolean h(float f, float f2) {
        if (f2 < this.k - this.A) {
            return false;
        }
        int i = this.h;
        int i2 = this.g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    final boolean i(float f, float f2) {
        if (I()) {
            if (f > this.w) {
                return false;
            }
        } else if (f < this.j - this.w) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    @Override // defpackage.kt
    public final void j(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            f(0);
            return;
        }
        if (this.q != 0) {
            if (this.m) {
                int i = this.j;
                int i2 = this.w;
                int i3 = i - i2;
                int i4 = this.e;
                int i5 = this.d;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.b;
                stateListDrawable.setBounds(0, 0, i2, i5);
                Drawable drawable = this.c;
                drawable.setBounds(0, 0, this.x, this.k);
                float f = i6;
                float f2 = -i6;
                if (I()) {
                    drawable.draw(canvas);
                    canvas.translate(i2, f);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, f2);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, f);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, f2);
                }
            }
            if (this.n) {
                int i7 = this.k;
                int i8 = this.A;
                int i9 = i7 - i8;
                int i10 = this.h;
                int i11 = this.g;
                StateListDrawable stateListDrawable2 = this.y;
                stateListDrawable2.setBounds(0, 0, i11, i8);
                Drawable drawable2 = this.z;
                drawable2.setBounds(0, 0, this.j, this.B);
                canvas.translate(0.0f, i9);
                drawable2.draw(canvas);
                canvas.translate(i10 - (i11 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r3, -i9);
            }
        }
    }

    @Override // defpackage.lc
    public final boolean k(MotionEvent motionEvent) {
        int i = this.o;
        if (i != 1) {
            return i == 2;
        }
        boolean i2 = i(motionEvent.getX(), motionEvent.getY());
        boolean h = h(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (i2) {
            if (!h) {
                this.C = 2;
                this.f = (int) motionEvent.getY();
                f(2);
                return true;
            }
        } else if (!h) {
            return false;
        }
        this.C = 1;
        this.i = (int) motionEvent.getX();
        f(2);
        return true;
    }

    @Override // defpackage.lc
    public final void l(MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean i = i(motionEvent.getX(), motionEvent.getY());
            boolean h = h(motionEvent.getX(), motionEvent.getY());
            if (i) {
                if (!h) {
                    this.C = 2;
                    this.f = (int) motionEvent.getY();
                    f(2);
                    return;
                }
            } else if (!h) {
                return;
            }
            this.C = 1;
            this.i = (int) motionEvent.getX();
            f(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.o == 2) {
            this.f = 0.0f;
            this.i = 0.0f;
            f(1);
            this.C = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.o == 2) {
            g();
            if (this.C == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.E;
                int i2 = this.v;
                iArr[0] = i2;
                int i3 = this.j - i2;
                iArr[1] = i3;
                float max = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.h - max) >= 2.0f) {
                    int J = J(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (J != 0) {
                        this.l.scrollBy(J, 0);
                    }
                    this.i = max;
                }
            }
            if (this.C == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.D;
                int i4 = this.v;
                iArr2[0] = i4;
                int i5 = this.k - i4;
                iArr2[1] = i5;
                float max2 = Math.max(i4, Math.min(i5, y));
                if (Math.abs(this.e - max2) >= 2.0f) {
                    int J2 = J(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                    if (J2 != 0) {
                        this.l.scrollBy(0, J2);
                    }
                    this.f = max2;
                }
            }
        }
    }

    @Override // defpackage.lc
    public final void d(boolean z) {
    }
}
