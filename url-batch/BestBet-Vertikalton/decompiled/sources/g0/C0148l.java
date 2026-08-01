package g0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148l extends AbstractC0135E {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2872C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2873D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2874A;

    /* renamed from: B, reason: collision with root package name */
    public final C0.i f2875B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2877b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2878c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2879e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2880f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2881g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2882j;

    /* renamed from: k, reason: collision with root package name */
    public int f2883k;

    /* renamed from: l, reason: collision with root package name */
    public int f2884l;

    /* renamed from: m, reason: collision with root package name */
    public float f2885m;

    /* renamed from: n, reason: collision with root package name */
    public int f2886n;

    /* renamed from: o, reason: collision with root package name */
    public int f2887o;

    /* renamed from: p, reason: collision with root package name */
    public float f2888p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2891s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2898z;

    /* renamed from: q, reason: collision with root package name */
    public int f2889q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2890r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2892t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2893u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2894v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2895w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2896x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2897y = new int[2];

    public C0148l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1937A0, 1.0f);
        this.f2898z = ofFloat;
        this.f2874A = 0;
        C0.i iVar = new C0.i(8, this);
        this.f2875B = iVar;
        C0146j c0146j = new C0146j(this);
        this.f2878c = stateListDrawable;
        this.d = drawable;
        this.f2881g = stateListDrawable2;
        this.h = drawable2;
        this.f2879e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2880f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2882j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2876a = i2;
        this.f2877b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0147k(this));
        ofFloat.addUpdateListener(new C0.c(2, this));
        RecyclerView recyclerView2 = this.f2891s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            H h = recyclerView2.f1989m;
            if (h != null) {
                h.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1993o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2891s;
            recyclerView3.f1994p.remove(this);
            if (recyclerView3.f1996q == this) {
                recyclerView3.f1996q = null;
            }
            ArrayList arrayList2 = this.f2891s.f1980g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0146j);
            }
            this.f2891s.removeCallbacks(iVar);
        }
        this.f2891s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f2891s.f1994p.add(this);
            this.f2891s.j(c0146j);
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

    @Override // g0.AbstractC0135E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2889q;
        RecyclerView recyclerView2 = this.f2891s;
        if (i != recyclerView2.getWidth() || this.f2890r != recyclerView2.getHeight()) {
            this.f2889q = recyclerView2.getWidth();
            this.f2890r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2874A != 0) {
            if (this.f2892t) {
                int i2 = this.f2889q;
                int i3 = this.f2879e;
                int i4 = i2 - i3;
                int i5 = this.f2884l;
                int i6 = this.f2883k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2878c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2890r;
                int i9 = this.f2880f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.Q.f578a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.f1937A0);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.f1937A0, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2893u) {
                int i10 = this.f2890r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2887o;
                int i14 = this.f2886n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2881g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2889q;
                int i17 = this.f2882j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.f1937A0, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.f1937A0);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2890r - this.i) {
            int i = this.f2887o;
            int i2 = this.f2886n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2891s;
        WeakHashMap weakHashMap = K.Q.f578a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2879e;
        if (z2) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f2889q - i) {
            return false;
        }
        int i2 = this.f2884l;
        int i3 = this.f2883k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        C0.i iVar = this.f2875B;
        StateListDrawable stateListDrawable = this.f2878c;
        if (i == 2 && this.f2894v != 2) {
            stateListDrawable.setState(f2872C);
            this.f2891s.removeCallbacks(iVar);
        }
        if (i == 0) {
            this.f2891s.invalidate();
        } else {
            g();
        }
        if (this.f2894v == 2 && i != 2) {
            stateListDrawable.setState(f2873D);
            this.f2891s.removeCallbacks(iVar);
            this.f2891s.postDelayed(iVar, 1200);
        } else if (i == 1) {
            this.f2891s.removeCallbacks(iVar);
            this.f2891s.postDelayed(iVar, 1500);
        }
        this.f2894v = i;
    }

    public final void g() {
        int i = this.f2874A;
        ValueAnimator valueAnimator = this.f2898z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2874A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
