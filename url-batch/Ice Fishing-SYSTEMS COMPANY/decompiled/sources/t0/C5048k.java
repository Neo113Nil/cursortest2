package t0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q2.R0;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5048k extends AbstractC5017A {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f40715C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f40716D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f40717A;

    /* renamed from: B, reason: collision with root package name */
    public final R0 f40718B;

    /* renamed from: a, reason: collision with root package name */
    public final int f40719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40720b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f40721c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f40722d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40723e;

    /* renamed from: f, reason: collision with root package name */
    public final int f40724f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f40725g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f40726h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40727j;

    /* renamed from: k, reason: collision with root package name */
    public int f40728k;

    /* renamed from: l, reason: collision with root package name */
    public int f40729l;

    /* renamed from: m, reason: collision with root package name */
    public float f40730m;

    /* renamed from: n, reason: collision with root package name */
    public int f40731n;

    /* renamed from: o, reason: collision with root package name */
    public int f40732o;

    /* renamed from: p, reason: collision with root package name */
    public float f40733p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f40736s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f40743z;

    /* renamed from: q, reason: collision with root package name */
    public int f40734q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f40735r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40737t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40738u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f40739v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f40740w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f40741x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f40742y = new int[2];

    public C5048k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i4, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40743z = ofFloat;
        this.f40717A = 0;
        R0 r02 = new R0(4, this);
        this.f40718B = r02;
        C5046i c5046i = new C5046i(this);
        this.f40721c = stateListDrawable;
        this.f40722d = drawable;
        this.f40725g = stateListDrawable2;
        this.f40726h = drawable2;
        this.f40723e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f40724f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f40727j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f40719a = i4;
        this.f40720b = i9;
        stateListDrawable.setAlpha(com.anythink.basead.exoplayer.k.p.f8630b);
        drawable.setAlpha(com.anythink.basead.exoplayer.k.p.f8630b);
        ofFloat.addListener(new C5047j(this));
        ofFloat.addUpdateListener(new F3.D(2, this));
        RecyclerView recyclerView2 = this.f40736s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC5019C abstractC5019C = recyclerView2.f5330E;
            if (abstractC5019C != null) {
                abstractC5019C.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f5332F;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f40736s;
            recyclerView3.f5334G.remove(this);
            if (recyclerView3.f5336H == this) {
                recyclerView3.f5336H = null;
            }
            ArrayList arrayList2 = this.f40736s.f5342K0;
            if (arrayList2 != null) {
                arrayList2.remove(c5046i);
            }
            this.f40736s.removeCallbacks(r02);
        }
        this.f40736s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f40736s.f5334G.add(this);
            this.f40736s.h(c5046i);
        }
    }

    public static int e(float f6, float f9, int[] iArr, int i, int i4, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 != 0) {
            int i11 = i - i9;
            int i12 = (int) (((f9 - f6) / i10) * i11);
            int i13 = i4 + i12;
            if (i13 < i11 && i13 >= 0) {
                return i12;
            }
        }
        return 0;
    }

    @Override // t0.AbstractC5017A
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f40734q;
        RecyclerView recyclerView2 = this.f40736s;
        if (i != recyclerView2.getWidth() || this.f40735r != recyclerView2.getHeight()) {
            this.f40734q = recyclerView2.getWidth();
            this.f40735r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f40717A != 0) {
            if (this.f40737t) {
                int i4 = this.f40734q;
                int i9 = this.f40723e;
                int i10 = i4 - i9;
                int i11 = this.f40729l;
                int i12 = this.f40728k;
                int i13 = i11 - (i12 / 2);
                StateListDrawable stateListDrawable = this.f40721c;
                stateListDrawable.setBounds(0, 0, i9, i12);
                int i14 = this.f40735r;
                int i15 = this.f40724f;
                Drawable drawable = this.f40722d;
                drawable.setBounds(0, 0, i15, i14);
                WeakHashMap weakHashMap = O.X.f2240a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i9, i13);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i9, -i13);
                } else {
                    canvas.translate(i10, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i13);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i10, -i13);
                }
            }
            if (this.f40738u) {
                int i16 = this.f40735r;
                int i17 = this.i;
                int i18 = i16 - i17;
                int i19 = this.f40732o;
                int i20 = this.f40731n;
                int i21 = i19 - (i20 / 2);
                StateListDrawable stateListDrawable2 = this.f40725g;
                stateListDrawable2.setBounds(0, 0, i20, i17);
                int i22 = this.f40734q;
                int i23 = this.f40727j;
                Drawable drawable2 = this.f40726h;
                drawable2.setBounds(0, 0, i22, i23);
                canvas.translate(0.0f, i18);
                drawable2.draw(canvas);
                canvas.translate(i21, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i21, -i18);
            }
        }
    }

    public final boolean c(float f6, float f9) {
        if (f9 < this.f40735r - this.i) {
            return false;
        }
        int i = this.f40732o;
        int i4 = this.f40731n;
        return f6 >= ((float) (i - (i4 / 2))) && f6 <= ((float) ((i4 / 2) + i));
    }

    public final boolean d(float f6, float f9) {
        RecyclerView recyclerView = this.f40736s;
        WeakHashMap weakHashMap = O.X.f2240a;
        boolean z8 = recyclerView.getLayoutDirection() == 1;
        int i = this.f40723e;
        if (!z8 ? f6 >= this.f40734q - i : f6 <= i / 2) {
            int i4 = this.f40729l;
            int i9 = this.f40728k / 2;
            if (f9 >= i4 - i9 && f9 <= i9 + i4) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        R0 r02 = this.f40718B;
        StateListDrawable stateListDrawable = this.f40721c;
        if (i == 2 && this.f40739v != 2) {
            stateListDrawable.setState(f40715C);
            this.f40736s.removeCallbacks(r02);
        }
        if (i == 0) {
            this.f40736s.invalidate();
        } else {
            g();
        }
        if (this.f40739v == 2 && i != 2) {
            stateListDrawable.setState(f40716D);
            this.f40736s.removeCallbacks(r02);
            this.f40736s.postDelayed(r02, 1200);
        } else if (i == 1) {
            this.f40736s.removeCallbacks(r02);
            this.f40736s.postDelayed(r02, 1500);
        }
        this.f40739v = i;
    }

    public final void g() {
        int i = this.f40717A;
        ValueAnimator valueAnimator = this.f40743z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f40717A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
