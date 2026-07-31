package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.AbstractC1281a0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
class i extends RecyclerView.o implements RecyclerView.t {

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f13109E = {R.attr.state_pressed};

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f13110F = new int[0];

    /* renamed from: A, reason: collision with root package name */
    final ValueAnimator f13111A;

    /* renamed from: B, reason: collision with root package name */
    int f13112B;

    /* renamed from: C, reason: collision with root package name */
    private final Runnable f13113C;

    /* renamed from: D, reason: collision with root package name */
    private final RecyclerView.u f13114D;

    /* renamed from: b, reason: collision with root package name */
    private final int f13115b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13116c;

    /* renamed from: d, reason: collision with root package name */
    final StateListDrawable f13117d;

    /* renamed from: e, reason: collision with root package name */
    final Drawable f13118e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13119f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13120g;

    /* renamed from: h, reason: collision with root package name */
    private final StateListDrawable f13121h;

    /* renamed from: i, reason: collision with root package name */
    private final Drawable f13122i;

    /* renamed from: j, reason: collision with root package name */
    private final int f13123j;

    /* renamed from: k, reason: collision with root package name */
    private final int f13124k;

    /* renamed from: l, reason: collision with root package name */
    int f13125l;

    /* renamed from: m, reason: collision with root package name */
    int f13126m;

    /* renamed from: n, reason: collision with root package name */
    float f13127n;

    /* renamed from: o, reason: collision with root package name */
    int f13128o;

    /* renamed from: p, reason: collision with root package name */
    int f13129p;

    /* renamed from: q, reason: collision with root package name */
    float f13130q;

    /* renamed from: t, reason: collision with root package name */
    private RecyclerView f13133t;

    /* renamed from: r, reason: collision with root package name */
    private int f13131r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f13132s = 0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13134u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13135v = false;

    /* renamed from: w, reason: collision with root package name */
    private int f13136w = 0;

    /* renamed from: x, reason: collision with root package name */
    private int f13137x = 0;

    /* renamed from: y, reason: collision with root package name */
    private final int[] f13138y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    private final int[] f13139z = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.k(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            i.this.v(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f13142a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13142a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13142a) {
                this.f13142a = false;
                return;
            }
            if (((Float) i.this.f13111A.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.f13112B = 0;
                iVar.s(0);
            } else {
                i iVar2 = i.this;
                iVar2.f13112B = 2;
                iVar2.p();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f13117d.setAlpha(floatValue);
            i.this.f13118e.setAlpha(floatValue);
            i.this.p();
        }
    }

    i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13111A = ofFloat;
        this.f13112B = 0;
        this.f13113C = new a();
        this.f13114D = new b();
        this.f13117d = stateListDrawable;
        this.f13118e = drawable;
        this.f13121h = stateListDrawable2;
        this.f13122i = drawable2;
        this.f13119f = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f13120g = Math.max(i4, drawable.getIntrinsicWidth());
        this.f13123j = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f13124k = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f13115b = i5;
        this.f13116c = i6;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        d(recyclerView);
    }

    private void e() {
        this.f13133t.removeCallbacks(this.f13113C);
    }

    private void f() {
        this.f13133t.removeItemDecoration(this);
        this.f13133t.removeOnItemTouchListener(this);
        this.f13133t.removeOnScrollListener(this.f13114D);
        e();
    }

    private void g(Canvas canvas) {
        int i4 = this.f13132s;
        int i5 = this.f13123j;
        int i6 = this.f13129p;
        int i7 = this.f13128o;
        this.f13121h.setBounds(0, 0, i7, i5);
        this.f13122i.setBounds(0, 0, this.f13131r, this.f13124k);
        canvas.translate(0.0f, i4 - i5);
        this.f13122i.draw(canvas);
        canvas.translate(i6 - (i7 / 2), 0.0f);
        this.f13121h.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void h(Canvas canvas) {
        int i4 = this.f13131r;
        int i5 = this.f13119f;
        int i6 = i4 - i5;
        int i7 = this.f13126m;
        int i8 = this.f13125l;
        int i9 = i7 - (i8 / 2);
        this.f13117d.setBounds(0, 0, i5, i8);
        this.f13118e.setBounds(0, 0, this.f13120g, this.f13132s);
        if (!m()) {
            canvas.translate(i6, 0.0f);
            this.f13118e.draw(canvas);
            canvas.translate(0.0f, i9);
            this.f13117d.draw(canvas);
            canvas.translate(-i6, -i9);
            return;
        }
        this.f13118e.draw(canvas);
        canvas.translate(this.f13119f, i9);
        canvas.scale(-1.0f, 1.0f);
        this.f13117d.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f13119f, -i9);
    }

    private int[] i() {
        int[] iArr = this.f13139z;
        int i4 = this.f13116c;
        iArr[0] = i4;
        iArr[1] = this.f13131r - i4;
        return iArr;
    }

    private int[] j() {
        int[] iArr = this.f13138y;
        int i4 = this.f13116c;
        iArr[0] = i4;
        iArr[1] = this.f13132s - i4;
        return iArr;
    }

    private void l(float f4) {
        int[] i4 = i();
        float max = Math.max(i4[0], Math.min(i4[1], f4));
        if (Math.abs(this.f13129p - max) < 2.0f) {
            return;
        }
        int r4 = r(this.f13130q, max, i4, this.f13133t.computeHorizontalScrollRange(), this.f13133t.computeHorizontalScrollOffset(), this.f13131r);
        if (r4 != 0) {
            this.f13133t.scrollBy(r4, 0);
        }
        this.f13130q = max;
    }

    private boolean m() {
        return AbstractC1281a0.C(this.f13133t) == 1;
    }

    private void q(int i4) {
        e();
        this.f13133t.postDelayed(this.f13113C, i4);
    }

    private int r(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f5 - f4) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    private void t() {
        this.f13133t.addItemDecoration(this);
        this.f13133t.addOnItemTouchListener(this);
        this.f13133t.addOnScrollListener(this.f13114D);
    }

    private void w(float f4) {
        int[] j4 = j();
        float max = Math.max(j4[0], Math.min(j4[1], f4));
        if (Math.abs(this.f13126m - max) < 2.0f) {
            return;
        }
        int r4 = r(this.f13127n, max, j4, this.f13133t.computeVerticalScrollRange(), this.f13133t.computeVerticalScrollOffset(), this.f13132s);
        if (r4 != 0) {
            this.f13133t.scrollBy(0, r4);
        }
        this.f13127n = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f13136w == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean o4 = o(motionEvent.getX(), motionEvent.getY());
            boolean n4 = n(motionEvent.getX(), motionEvent.getY());
            if (o4 || n4) {
                if (n4) {
                    this.f13137x = 1;
                    this.f13130q = (int) motionEvent.getX();
                } else if (o4) {
                    this.f13137x = 2;
                    this.f13127n = (int) motionEvent.getY();
                }
                s(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f13136w == 2) {
            this.f13127n = 0.0f;
            this.f13130q = 0.0f;
            s(1);
            this.f13137x = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f13136w == 2) {
            u();
            if (this.f13137x == 1) {
                l(motionEvent.getX());
            }
            if (this.f13137x == 2) {
                w(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i4 = this.f13136w;
        if (i4 != 1) {
            return i4 == 2;
        }
        boolean o4 = o(motionEvent.getX(), motionEvent.getY());
        boolean n4 = n(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!o4 && !n4)) {
            return false;
        }
        if (n4) {
            this.f13137x = 1;
            this.f13130q = (int) motionEvent.getX();
        } else if (o4) {
            this.f13137x = 2;
            this.f13127n = (int) motionEvent.getY();
        }
        s(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z4) {
    }

    public void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13133t;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f13133t = recyclerView;
        if (recyclerView != null) {
            t();
        }
    }

    void k(int i4) {
        int i5 = this.f13112B;
        if (i5 == 1) {
            this.f13111A.cancel();
        } else if (i5 != 2) {
            return;
        }
        this.f13112B = 3;
        ValueAnimator valueAnimator = this.f13111A;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f13111A.setDuration(i4);
        this.f13111A.start();
    }

    boolean n(float f4, float f5) {
        if (f5 < this.f13132s - this.f13123j) {
            return false;
        }
        int i4 = this.f13129p;
        int i5 = this.f13128o;
        return f4 >= ((float) (i4 - (i5 / 2))) && f4 <= ((float) (i4 + (i5 / 2)));
    }

    boolean o(float f4, float f5) {
        if (m()) {
            if (f4 > this.f13119f) {
                return false;
            }
        } else if (f4 < this.f13131r - this.f13119f) {
            return false;
        }
        int i4 = this.f13126m;
        int i5 = this.f13125l;
        return f5 >= ((float) (i4 - (i5 / 2))) && f5 <= ((float) (i4 + (i5 / 2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a4) {
        if (this.f13131r != this.f13133t.getWidth() || this.f13132s != this.f13133t.getHeight()) {
            this.f13131r = this.f13133t.getWidth();
            this.f13132s = this.f13133t.getHeight();
            s(0);
        } else if (this.f13112B != 0) {
            if (this.f13134u) {
                h(canvas);
            }
            if (this.f13135v) {
                g(canvas);
            }
        }
    }

    void p() {
        this.f13133t.invalidate();
    }

    void s(int i4) {
        if (i4 == 2 && this.f13136w != 2) {
            this.f13117d.setState(f13109E);
            e();
        }
        if (i4 == 0) {
            p();
        } else {
            u();
        }
        if (this.f13136w == 2 && i4 != 2) {
            this.f13117d.setState(f13110F);
            q(1200);
        } else if (i4 == 1) {
            q(1500);
        }
        this.f13136w = i4;
    }

    public void u() {
        int i4 = this.f13112B;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                this.f13111A.cancel();
            }
        }
        this.f13112B = 1;
        ValueAnimator valueAnimator = this.f13111A;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f13111A.setDuration(500L);
        this.f13111A.setStartDelay(0L);
        this.f13111A.start();
    }

    void v(int i4, int i5) {
        int computeVerticalScrollRange = this.f13133t.computeVerticalScrollRange();
        int i6 = this.f13132s;
        this.f13134u = computeVerticalScrollRange - i6 > 0 && i6 >= this.f13115b;
        int computeHorizontalScrollRange = this.f13133t.computeHorizontalScrollRange();
        int i7 = this.f13131r;
        boolean z4 = computeHorizontalScrollRange - i7 > 0 && i7 >= this.f13115b;
        this.f13135v = z4;
        boolean z5 = this.f13134u;
        if (!z5 && !z4) {
            if (this.f13136w != 0) {
                s(0);
                return;
            }
            return;
        }
        if (z5) {
            float f4 = i6;
            this.f13126m = (int) ((f4 * (i5 + (f4 / 2.0f))) / computeVerticalScrollRange);
            this.f13125l = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
        }
        if (this.f13135v) {
            float f5 = i7;
            this.f13129p = (int) ((f5 * (i4 + (f5 / 2.0f))) / computeHorizontalScrollRange);
            this.f13128o = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
        }
        int i8 = this.f13136w;
        if (i8 == 0 || i8 == 1) {
            s(1);
        }
    }
}
