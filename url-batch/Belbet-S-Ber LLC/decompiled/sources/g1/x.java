package g1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x extends x0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final androidx.fragment.app.g B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1821b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f1822c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1824f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f1825g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1826j;

    /* renamed from: k, reason: collision with root package name */
    public int f1827k;

    /* renamed from: l, reason: collision with root package name */
    public int f1828l;

    /* renamed from: m, reason: collision with root package name */
    public float f1829m;

    /* renamed from: n, reason: collision with root package name */
    public int f1830n;

    /* renamed from: o, reason: collision with root package name */
    public int f1831o;

    /* renamed from: p, reason: collision with root package name */
    public float f1832p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f1835s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f1842z;

    /* renamed from: q, reason: collision with root package name */
    public int f1833q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1834r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1836t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1837u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f1838v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f1839w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1840x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1841y = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    public x(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1842z = ofFloat;
        this.A = 0;
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(3, this);
        this.B = gVar;
        u uVar = new u(this);
        this.f1822c = stateListDrawable;
        this.d = drawable;
        this.f1825g = stateListDrawable2;
        this.h = drawable2;
        this.f1823e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f1824f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f1826j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f1820a = i4;
        this.f1821b = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new v(this));
        ofFloat.addUpdateListener(new w(0 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f1835s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f792u;
            a1 a1Var = recyclerView2.f788s;
            if (a1Var != null) {
                a1Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1835s;
            recyclerView3.f794v.remove(this);
            if (recyclerView3.f796w == this) {
                recyclerView3.f796w = null;
            }
            ArrayList arrayList2 = this.f1835s.f779n0;
            if (arrayList2 != null) {
                arrayList2.remove(uVar);
            }
            this.f1835s.removeCallbacks(gVar);
        }
        this.f1835s = recyclerView;
        recyclerView.i(this);
        this.f1835s.f794v.add(this);
        this.f1835s.j(uVar);
    }

    public static int e(float f5, float f6, int[] iArr, int i, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 != 0) {
            int i7 = i - i5;
            int i8 = (int) (((f6 - f5) / i6) * i7);
            int i9 = i4 + i8;
            if (i9 < i7 && i9 >= 0) {
                return i8;
            }
        }
        return 0;
    }

    @Override // g1.x0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f1833q != this.f1835s.getWidth() || this.f1834r != this.f1835s.getHeight()) {
            this.f1833q = this.f1835s.getWidth();
            this.f1834r = this.f1835s.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f1836t) {
                int i = this.f1833q;
                int i4 = this.f1823e;
                int i5 = i - i4;
                int i6 = this.f1828l;
                int i7 = this.f1827k;
                int i8 = i6 - (i7 / 2);
                StateListDrawable stateListDrawable = this.f1822c;
                stateListDrawable.setBounds(0, 0, i4, i7);
                int i9 = this.f1824f;
                int i10 = this.f1834r;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i10);
                if (this.f1835s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i4, i8);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i4, -i8);
                } else {
                    canvas.translate(i5, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i8);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i5, -i8);
                }
            }
            if (this.f1837u) {
                int i11 = this.f1834r;
                int i12 = this.i;
                int i13 = i11 - i12;
                int i14 = this.f1831o;
                int i15 = this.f1830n;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f1825g;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f1833q;
                int i18 = this.f1826j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    public final boolean c(float f5, float f6) {
        if (f6 < this.f1834r - this.i) {
            return false;
        }
        int i = this.f1831o;
        int i4 = this.f1830n;
        return f5 >= ((float) (i - (i4 / 2))) && f5 <= ((float) ((i4 / 2) + i));
    }

    public final boolean d(float f5, float f6) {
        int layoutDirection = this.f1835s.getLayoutDirection();
        int i = this.f1823e;
        if (layoutDirection == 1) {
            if (f5 > i) {
                return false;
            }
        } else if (f5 < this.f1833q - i) {
            return false;
        }
        int i4 = this.f1828l;
        int i5 = this.f1827k / 2;
        return f6 >= ((float) (i4 - i5)) && f6 <= ((float) (i5 + i4));
    }

    public final void f(int i) {
        androidx.fragment.app.g gVar = this.B;
        StateListDrawable stateListDrawable = this.f1822c;
        if (i == 2 && this.f1838v != 2) {
            stateListDrawable.setState(C);
            this.f1835s.removeCallbacks(gVar);
        }
        if (i == 0) {
            this.f1835s.invalidate();
        } else {
            g();
        }
        if (this.f1838v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.f1835s.removeCallbacks(gVar);
            this.f1835s.postDelayed(gVar, 1200);
        } else if (i == 1) {
            this.f1835s.removeCallbacks(gVar);
            this.f1835s.postDelayed(gVar, 1500);
        }
        this.f1838v = i;
    }

    public final void g() {
        int i = this.A;
        ValueAnimator valueAnimator = this.f1842z;
        if (i != 0) {
            if (i != 3) {
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
