package g0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129m extends G {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2461C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2462D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2463A;

    /* renamed from: B, reason: collision with root package name */
    public final M0.B f2464B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2466b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2467c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2468e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2469f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2470g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2471j;

    /* renamed from: k, reason: collision with root package name */
    public int f2472k;

    /* renamed from: l, reason: collision with root package name */
    public int f2473l;

    /* renamed from: m, reason: collision with root package name */
    public float f2474m;

    /* renamed from: n, reason: collision with root package name */
    public int f2475n;

    /* renamed from: o, reason: collision with root package name */
    public int f2476o;

    /* renamed from: p, reason: collision with root package name */
    public float f2477p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2480s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2487z;

    /* renamed from: q, reason: collision with root package name */
    public int f2478q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2479r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2481t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2482u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2483v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2484w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2485x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2486y = new int[2];

    public C0129m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1559A0, 1.0f);
        this.f2487z = ofFloat;
        this.f2463A = 0;
        M0.B b2 = new M0.B(6, this);
        this.f2464B = b2;
        C0127k c0127k = new C0127k(this);
        this.f2467c = stateListDrawable;
        this.d = drawable;
        this.f2470g = stateListDrawable2;
        this.h = drawable2;
        this.f2468e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2469f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2471j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2465a = i2;
        this.f2466b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0128l(this));
        ofFloat.addUpdateListener(new M0.C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2480s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            J j2 = recyclerView2.f1609m;
            if (j2 != null) {
                j2.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1613o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2480s;
            recyclerView3.f1614p.remove(this);
            if (recyclerView3.f1616q == this) {
                recyclerView3.f1616q = null;
            }
            ArrayList arrayList2 = this.f2480s.f1600g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0127k);
            }
            this.f2480s.removeCallbacks(b2);
        }
        this.f2480s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f2480s.f1614p.add(this);
            this.f2480s.j(c0127k);
        }
    }

    public static int e(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // g0.G
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2478q;
        RecyclerView recyclerView2 = this.f2480s;
        if (i != recyclerView2.getWidth() || this.f2479r != recyclerView2.getHeight()) {
            this.f2478q = recyclerView2.getWidth();
            this.f2479r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2463A != 0) {
            if (this.f2481t) {
                int i2 = this.f2478q;
                int i3 = this.f2468e;
                int i4 = i2 - i3;
                int i5 = this.f2473l;
                int i6 = this.f2472k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2467c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2479r;
                int i9 = this.f2469f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.T.f440a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.f1559A0);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.f1559A0, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2482u) {
                int i10 = this.f2479r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2476o;
                int i14 = this.f2475n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2470g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2478q;
                int i17 = this.f2471j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.f1559A0, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.f1559A0);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2479r - this.i) {
            int i = this.f2476o;
            int i2 = this.f2475n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2480s;
        WeakHashMap weakHashMap = K.T.f440a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2468e;
        if (z2) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f2478q - i) {
            return false;
        }
        int i2 = this.f2473l;
        int i3 = this.f2472k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        M0.B b2 = this.f2464B;
        StateListDrawable stateListDrawable = this.f2467c;
        if (i == 2 && this.f2483v != 2) {
            stateListDrawable.setState(f2461C);
            this.f2480s.removeCallbacks(b2);
        }
        if (i == 0) {
            this.f2480s.invalidate();
        } else {
            g();
        }
        if (this.f2483v == 2 && i != 2) {
            stateListDrawable.setState(f2462D);
            this.f2480s.removeCallbacks(b2);
            this.f2480s.postDelayed(b2, 1200);
        } else if (i == 1) {
            this.f2480s.removeCallbacks(b2);
            this.f2480s.postDelayed(b2, 1500);
        }
        this.f2483v = i;
    }

    public final void g() {
        int i = this.f2463A;
        ValueAnimator valueAnimator = this.f2487z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2463A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
