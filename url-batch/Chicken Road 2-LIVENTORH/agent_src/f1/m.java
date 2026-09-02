package f1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m extends j0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final androidx.fragment.app.g B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1420a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1421b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f1422c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1423e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1424f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f1425g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f1426h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1427j;

    /* renamed from: k, reason: collision with root package name */
    public int f1428k;

    /* renamed from: l, reason: collision with root package name */
    public int f1429l;

    /* renamed from: m, reason: collision with root package name */
    public float f1430m;

    /* renamed from: n, reason: collision with root package name */
    public int f1431n;

    /* renamed from: o, reason: collision with root package name */
    public int f1432o;

    /* renamed from: p, reason: collision with root package name */
    public float f1433p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f1436s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f1443z;

    /* renamed from: q, reason: collision with root package name */
    public int f1434q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1435r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1437t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1438u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f1439v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f1440w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1441x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1442y = new int[2];

    public m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1443z = ofFloat;
        this.A = 0;
        androidx.fragment.app.g gVar = new androidx.fragment.app.g(3, this);
        this.B = gVar;
        k kVar = new k(this);
        this.f1422c = stateListDrawable;
        this.d = drawable;
        this.f1425g = stateListDrawable2;
        this.f1426h = drawable2;
        this.f1423e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f1424f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f1427j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f1420a = i4;
        this.f1421b = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new l(this));
        ofFloat.addUpdateListener(new e2.l(1, this));
        RecyclerView recyclerView2 = this.f1436s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f689t;
            m0 m0Var = recyclerView2.f685r;
            if (m0Var != null) {
                m0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1436s;
            recyclerView3.f691u.remove(this);
            if (recyclerView3.f693v == this) {
                recyclerView3.f693v = null;
            }
            ArrayList arrayList2 = this.f1436s.f676m0;
            if (arrayList2 != null) {
                arrayList2.remove(kVar);
            }
            this.f1436s.removeCallbacks(gVar);
        }
        this.f1436s = recyclerView;
        recyclerView.g(this);
        this.f1436s.f691u.add(this);
        this.f1436s.h(kVar);
    }

    public static int e(float f2, float f4, int[] iArr, int i, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 != 0) {
            int i7 = i - i5;
            int i8 = (int) (((f4 - f2) / i6) * i7);
            int i9 = i4 + i8;
            if (i9 < i7 && i9 >= 0) {
                return i8;
            }
        }
        return 0;
    }

    @Override // f1.j0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f1434q;
        RecyclerView recyclerView2 = this.f1436s;
        if (i != recyclerView2.getWidth() || this.f1435r != recyclerView2.getHeight()) {
            this.f1434q = recyclerView2.getWidth();
            this.f1435r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f1437t) {
                int i4 = this.f1434q;
                int i5 = this.f1423e;
                int i6 = i4 - i5;
                int i7 = this.f1429l;
                int i8 = this.f1428k;
                int i9 = i7 - (i8 / 2);
                StateListDrawable stateListDrawable = this.f1422c;
                stateListDrawable.setBounds(0, 0, i5, i8);
                int i10 = this.f1424f;
                int i11 = this.f1435r;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i10, i11);
                WeakHashMap weakHashMap = n0.l0.f2757a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i5, i9);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i5, -i9);
                } else {
                    canvas.translate(i6, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i9);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i6, -i9);
                }
            }
            if (this.f1438u) {
                int i12 = this.f1435r;
                int i13 = this.i;
                int i14 = i12 - i13;
                int i15 = this.f1432o;
                int i16 = this.f1431n;
                int i17 = i15 - (i16 / 2);
                StateListDrawable stateListDrawable2 = this.f1425g;
                stateListDrawable2.setBounds(0, 0, i16, i13);
                int i18 = this.f1434q;
                int i19 = this.f1427j;
                Drawable drawable2 = this.f1426h;
                drawable2.setBounds(0, 0, i18, i19);
                canvas.translate(0.0f, i14);
                drawable2.draw(canvas);
                canvas.translate(i17, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i17, -i14);
            }
        }
    }

    public final boolean c(float f2, float f4) {
        if (f4 < this.f1435r - this.i) {
            return false;
        }
        int i = this.f1432o;
        int i4 = this.f1431n;
        return f2 >= ((float) (i - (i4 / 2))) && f2 <= ((float) ((i4 / 2) + i));
    }

    public final boolean d(float f2, float f4) {
        WeakHashMap weakHashMap = n0.l0.f2757a;
        int layoutDirection = this.f1436s.getLayoutDirection();
        int i = this.f1423e;
        if (layoutDirection == 1) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f1434q - i) {
            return false;
        }
        int i4 = this.f1429l;
        int i5 = this.f1428k / 2;
        return f4 >= ((float) (i4 - i5)) && f4 <= ((float) (i5 + i4));
    }

    public final void f(int i) {
        androidx.fragment.app.g gVar = this.B;
        StateListDrawable stateListDrawable = this.f1422c;
        if (i == 2 && this.f1439v != 2) {
            stateListDrawable.setState(C);
            this.f1436s.removeCallbacks(gVar);
        }
        if (i == 0) {
            this.f1436s.invalidate();
        } else {
            g();
        }
        if (this.f1439v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.f1436s.removeCallbacks(gVar);
            this.f1436s.postDelayed(gVar, 1200);
        } else if (i == 1) {
            this.f1436s.removeCallbacks(gVar);
            this.f1436s.postDelayed(gVar, 1500);
        }
        this.f1439v = i;
    }

    public final void g() {
        int i = this.A;
        ValueAnimator valueAnimator = this.f1443z;
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
