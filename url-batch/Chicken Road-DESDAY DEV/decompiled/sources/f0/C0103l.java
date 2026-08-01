package f0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103l extends AbstractC0091F {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2169C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2170D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2171A;

    /* renamed from: B, reason: collision with root package name */
    public final L0.B f2172B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2173a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2174b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2175c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2176e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2177f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2178g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2179j;

    /* renamed from: k, reason: collision with root package name */
    public int f2180k;

    /* renamed from: l, reason: collision with root package name */
    public int f2181l;

    /* renamed from: m, reason: collision with root package name */
    public float f2182m;

    /* renamed from: n, reason: collision with root package name */
    public int f2183n;

    /* renamed from: o, reason: collision with root package name */
    public int f2184o;

    /* renamed from: p, reason: collision with root package name */
    public float f2185p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2188s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2195z;

    /* renamed from: q, reason: collision with root package name */
    public int f2186q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2187r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2189t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2190u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2191v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2192w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2193x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2194y = new int[2];

    public C0103l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2195z = ofFloat;
        this.f2171A = 0;
        L0.B b2 = new L0.B(6, this);
        this.f2172B = b2;
        C0101j c0101j = new C0101j(this);
        this.f2175c = stateListDrawable;
        this.d = drawable;
        this.f2178g = stateListDrawable2;
        this.h = drawable2;
        this.f2176e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2177f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2179j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2173a = i2;
        this.f2174b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0102k(this));
        ofFloat.addUpdateListener(new L0.C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2188s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            I i4 = recyclerView2.f1513l;
            if (i4 != null) {
                i4.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1515m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2188s;
            recyclerView3.f1517n.remove(this);
            if (recyclerView3.f1518o == this) {
                recyclerView3.f1518o = null;
            }
            ArrayList arrayList2 = this.f2188s.f1502e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0101j);
            }
            this.f2188s.removeCallbacks(b2);
        }
        this.f2188s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f2188s.f1517n.add(this);
            this.f2188s.h(c0101j);
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

    @Override // f0.AbstractC0091F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2186q;
        RecyclerView recyclerView2 = this.f2188s;
        if (i != recyclerView2.getWidth() || this.f2187r != recyclerView2.getHeight()) {
            this.f2186q = recyclerView2.getWidth();
            this.f2187r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2171A != 0) {
            if (this.f2189t) {
                int i2 = this.f2186q;
                int i3 = this.f2176e;
                int i4 = i2 - i3;
                int i5 = this.f2181l;
                int i6 = this.f2180k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2175c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2187r;
                int i9 = this.f2177f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.S.f369a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2190u) {
                int i10 = this.f2187r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2184o;
                int i14 = this.f2183n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2178g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2186q;
                int i17 = this.f2179j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2187r - this.i) {
            int i = this.f2184o;
            int i2 = this.f2183n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2188s;
        WeakHashMap weakHashMap = K.S.f369a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2176e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f2186q - i) {
            return false;
        }
        int i2 = this.f2181l;
        int i3 = this.f2180k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        L0.B b2 = this.f2172B;
        StateListDrawable stateListDrawable = this.f2175c;
        if (i == 2 && this.f2191v != 2) {
            stateListDrawable.setState(f2169C);
            this.f2188s.removeCallbacks(b2);
        }
        if (i == 0) {
            this.f2188s.invalidate();
        } else {
            g();
        }
        if (this.f2191v == 2 && i != 2) {
            stateListDrawable.setState(f2170D);
            this.f2188s.removeCallbacks(b2);
            this.f2188s.postDelayed(b2, 1200);
        } else if (i == 1) {
            this.f2188s.removeCallbacks(b2);
            this.f2188s.postDelayed(b2, 1500);
        }
        this.f2191v = i;
    }

    public final void g() {
        int i = this.f2171A;
        ValueAnimator valueAnimator = this.f2195z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2171A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
