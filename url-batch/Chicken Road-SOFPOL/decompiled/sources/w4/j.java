package w4;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends b0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f7929x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f7930y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f7931a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f7932b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f7933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7934d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7935e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f7936f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f7937g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7938h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public float f7939j;

    /* renamed from: k, reason: collision with root package name */
    public float f7940k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f7943n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f7950u;

    /* renamed from: v, reason: collision with root package name */
    public int f7951v;

    /* renamed from: w, reason: collision with root package name */
    public final h4.b f7952w;

    /* renamed from: l, reason: collision with root package name */
    public int f7941l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f7942m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7944o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7945p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f7946q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f7947r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f7948s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f7949t = new int[2];

    public j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i8, int i9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7950u = ofFloat;
        this.f7951v = 0;
        h4.b bVar = new h4.b(7, this);
        this.f7952w = bVar;
        h hVar = new h();
        this.f7932b = stateListDrawable;
        this.f7933c = drawable;
        this.f7936f = stateListDrawable2;
        this.f7937g = drawable2;
        this.f7934d = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f7935e = Math.max(i, drawable.getIntrinsicWidth());
        this.f7938h = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.i = Math.max(i, drawable2.getIntrinsicWidth());
        this.f7931a = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new i(this));
        ofFloat.addUpdateListener(new k5.b(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f7943n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f931o;
            d0 d0Var = recyclerView2.f928m;
            if (d0Var != null) {
                d0Var.b("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.v();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f7943n;
            recyclerView3.f932p.remove(this);
            if (recyclerView3.f933q == this) {
                recyclerView3.f933q = null;
            }
            ArrayList arrayList2 = this.f7943n.f914e0;
            if (arrayList2 != null) {
                arrayList2.remove(hVar);
            }
            this.f7943n.removeCallbacks(bVar);
        }
        this.f7943n = recyclerView;
        ArrayList arrayList3 = recyclerView.f931o;
        d0 d0Var2 = recyclerView.f928m;
        if (d0Var2 != null) {
            d0Var2.b("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.v();
        recyclerView.requestLayout();
        this.f7943n.f932p.add(this);
        RecyclerView recyclerView4 = this.f7943n;
        if (recyclerView4.f914e0 == null) {
            recyclerView4.f914e0 = new ArrayList();
        }
        recyclerView4.f914e0.add(hVar);
    }

    public static int e(float f6, float f8, int[] iArr, int i, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 != 0) {
            int i11 = i - i9;
            int i12 = (int) (((f8 - f6) / i10) * i11);
            int i13 = i8 + i12;
            if (i13 < i11 && i13 >= 0) {
                return i12;
            }
        }
        return 0;
    }

    @Override // w4.b0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f7941l;
        RecyclerView recyclerView2 = this.f7943n;
        if (i != recyclerView2.getWidth() || this.f7942m != recyclerView2.getHeight()) {
            this.f7941l = recyclerView2.getWidth();
            this.f7942m = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f7951v != 0) {
            if (this.f7944o) {
                int i8 = this.f7941l;
                int i9 = this.f7934d;
                int i10 = i8 - i9;
                int i11 = 0 - (0 / 2);
                StateListDrawable stateListDrawable = this.f7932b;
                stateListDrawable.setBounds(0, 0, i9, 0);
                int i12 = this.f7935e;
                int i13 = this.f7942m;
                Drawable drawable = this.f7933c;
                drawable.setBounds(0, 0, i12, i13);
                Field field = q3.k0.f6120a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i9, i11);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i9, -i11);
                } else {
                    canvas.translate(i10, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i11);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i10, -i11);
                }
            }
            if (this.f7945p) {
                int i14 = this.f7942m;
                int i15 = this.f7938h;
                int i16 = i14 - i15;
                StateListDrawable stateListDrawable2 = this.f7936f;
                stateListDrawable2.setBounds(0, 0, 0, i15);
                int i17 = this.f7941l;
                int i18 = this.i;
                Drawable drawable2 = this.f7937g;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i16);
                drawable2.draw(canvas);
                canvas.translate(0 - (0 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r3, -i16);
            }
        }
    }

    public final boolean c(float f6, float f8) {
        return f8 >= ((float) (this.f7942m - this.f7938h)) && f6 >= ((float) (0 - (0 / 2))) && f6 <= ((float) ((0 / 2) + 0));
    }

    public final boolean d(float f6, float f8) {
        Field field = q3.k0.f6120a;
        int layoutDirection = this.f7943n.getLayoutDirection();
        int i = this.f7934d;
        if (layoutDirection != 1 ? f6 >= this.f7941l - i : f6 <= i) {
            int i8 = 0 / 2;
            if (f8 >= 0 - i8 && f8 <= i8 + 0) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        h4.b bVar = this.f7952w;
        StateListDrawable stateListDrawable = this.f7932b;
        if (i == 2 && this.f7946q != 2) {
            stateListDrawable.setState(f7929x);
            this.f7943n.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.f7943n.invalidate();
        } else {
            g();
        }
        if (this.f7946q == 2 && i != 2) {
            stateListDrawable.setState(f7930y);
            this.f7943n.removeCallbacks(bVar);
            this.f7943n.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.f7943n.removeCallbacks(bVar);
            this.f7943n.postDelayed(bVar, 1500);
        }
        this.f7946q = i;
    }

    public final void g() {
        int i = this.f7951v;
        ValueAnimator valueAnimator = this.f7950u;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7951v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
