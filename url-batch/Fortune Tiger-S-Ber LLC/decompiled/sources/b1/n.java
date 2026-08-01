package b1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n extends k0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final androidx.fragment.app.g B;

    /* renamed from: a, reason: collision with root package name */
    public final int f851a;

    /* renamed from: b, reason: collision with root package name */
    public final int f852b;
    public final StateListDrawable c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f853d;

    /* renamed from: e, reason: collision with root package name */
    public final int f854e;

    /* renamed from: f, reason: collision with root package name */
    public final int f855f;
    public final StateListDrawable g;
    public final Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public final int f856i;

    /* renamed from: j, reason: collision with root package name */
    public final int f857j;

    /* renamed from: k, reason: collision with root package name */
    public int f858k;

    /* renamed from: l, reason: collision with root package name */
    public int f859l;

    /* renamed from: m, reason: collision with root package name */
    public float f860m;

    /* renamed from: n, reason: collision with root package name */
    public int f861n;

    /* renamed from: o, reason: collision with root package name */
    public int f862o;

    /* renamed from: p, reason: collision with root package name */
    public float f863p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f866s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f873z;

    /* renamed from: q, reason: collision with root package name */
    public int f864q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f865r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f867t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f868u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f869v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f870w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f871x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f872y = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    public n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f873z = ofFloat;
        this.A = 0;
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(3, this);
        this.B = gVar;
        k kVar = new k(this);
        this.c = stateListDrawable;
        this.f853d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.f854e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f855f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f856i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f857j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f851a = i5;
        this.f852b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new l(this));
        ofFloat.addUpdateListener(new m(0 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f866s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f657t;
            n0 n0Var = recyclerView2.f653r;
            if (n0Var != null) {
                n0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f866s;
            recyclerView3.f659u.remove(this);
            if (recyclerView3.f661v == this) {
                recyclerView3.f661v = null;
            }
            ArrayList arrayList2 = this.f866s.f644m0;
            if (arrayList2 != null) {
                arrayList2.remove(kVar);
            }
            this.f866s.removeCallbacks(gVar);
        }
        this.f866s = recyclerView;
        recyclerView.g(this);
        this.f866s.f659u.add(this);
        this.f866s.h(kVar);
    }

    public static int e(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 != 0) {
            int i8 = i4 - i6;
            int i9 = (int) (((f5 - f4) / i7) * i8);
            int i10 = i5 + i9;
            if (i10 < i8 && i10 >= 0) {
                return i9;
            }
        }
        return 0;
    }

    @Override // b1.k0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i4 = this.f864q;
        RecyclerView recyclerView2 = this.f866s;
        if (i4 != recyclerView2.getWidth() || this.f865r != recyclerView2.getHeight()) {
            this.f864q = recyclerView2.getWidth();
            this.f865r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f867t) {
                int i5 = this.f864q;
                int i6 = this.f854e;
                int i7 = i5 - i6;
                int i8 = this.f859l;
                int i9 = this.f858k;
                int i10 = i8 - (i9 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i6, i9);
                int i11 = this.f855f;
                int i12 = this.f865r;
                Drawable drawable = this.f853d;
                drawable.setBounds(0, 0, i11, i12);
                WeakHashMap weakHashMap = k0.j0.f2752a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i6, i10);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i6, -i10);
                } else {
                    canvas.translate(i7, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i10);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i7, -i10);
                }
            }
            if (this.f868u) {
                int i13 = this.f865r;
                int i14 = this.f856i;
                int i15 = i13 - i14;
                int i16 = this.f862o;
                int i17 = this.f861n;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i17, i14);
                int i19 = this.f864q;
                int i20 = this.f857j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i19, i20);
                canvas.translate(0.0f, i15);
                drawable2.draw(canvas);
                canvas.translate(i18, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i18, -i15);
            }
        }
    }

    public final boolean c(float f4, float f5) {
        if (f5 < this.f865r - this.f856i) {
            return false;
        }
        int i4 = this.f862o;
        int i5 = this.f861n;
        return f4 >= ((float) (i4 - (i5 / 2))) && f4 <= ((float) ((i5 / 2) + i4));
    }

    public final boolean d(float f4, float f5) {
        WeakHashMap weakHashMap = k0.j0.f2752a;
        int layoutDirection = this.f866s.getLayoutDirection();
        int i4 = this.f854e;
        if (layoutDirection == 1) {
            if (f4 > i4) {
                return false;
            }
        } else if (f4 < this.f864q - i4) {
            return false;
        }
        int i5 = this.f859l;
        int i6 = this.f858k / 2;
        return f5 >= ((float) (i5 - i6)) && f5 <= ((float) (i6 + i5));
    }

    public final void f(int i4) {
        androidx.fragment.app.g gVar = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i4 == 2 && this.f869v != 2) {
            stateListDrawable.setState(C);
            this.f866s.removeCallbacks(gVar);
        }
        if (i4 == 0) {
            this.f866s.invalidate();
        } else {
            g();
        }
        if (this.f869v == 2 && i4 != 2) {
            stateListDrawable.setState(D);
            this.f866s.removeCallbacks(gVar);
            this.f866s.postDelayed(gVar, 1200);
        } else if (i4 == 1) {
            this.f866s.removeCallbacks(gVar);
            this.f866s.postDelayed(gVar, 1500);
        }
        this.f869v = i4;
    }

    public final void g() {
        int i4 = this.A;
        ValueAnimator valueAnimator = this.f873z;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
