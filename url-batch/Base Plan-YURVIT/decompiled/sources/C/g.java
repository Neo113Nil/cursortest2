package C;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import i.AbstractC0147B;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f160r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f161a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f162b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0147B f163c;

    /* renamed from: d, reason: collision with root package name */
    public b f164d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f165e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f166f;

    /* renamed from: g, reason: collision with root package name */
    public final int f167g;

    /* renamed from: h, reason: collision with root package name */
    public final int f168h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f169i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f170j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f171k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f172l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f173m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f174n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f175o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f176p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0147B f177q;

    public g(AbstractC0147B abstractC0147B) {
        a aVar = new a();
        aVar.f152e = Long.MIN_VALUE;
        aVar.f154g = -1L;
        aVar.f153f = 0L;
        this.f161a = aVar;
        this.f162b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f165e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f166f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f169i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f170j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f171k = fArr5;
        this.f163c = abstractC0147B;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f167g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f168h = f160r;
        aVar.f148a = 500;
        aVar.f149b = 500;
        this.f177q = abstractC0147B;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i2, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float b2 = b(this.f165e[i2] * f3, 0.0f, this.f166f[i2]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f162b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f169i[i2];
                float f7 = this.f170j[i2];
                float f8 = this.f171k[i2];
                float f9 = f6 * f4;
                return f5 > 0.0f ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != 0.0f) {
        }
    }

    public final float c(float f2, float f3) {
        if (f3 != 0.0f) {
            int i2 = this.f167g;
            if (i2 == 0 || i2 == 1) {
                if (f2 < f3) {
                    if (f2 >= 0.0f) {
                        return 1.0f - (f2 / f3);
                    }
                    if (this.f175o && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f2 < 0.0f) {
                return f2 / (-f3);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f173m) {
            this.f175o = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f161a;
        int i3 = (int) (currentAnimationTimeMillis - aVar.f152e);
        int i4 = aVar.f149b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f156i = i2;
        aVar.f155h = aVar.a(currentAnimationTimeMillis);
        aVar.f154g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC0147B abstractC0147B;
        int count;
        a aVar = this.f161a;
        float f2 = aVar.f151d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f150c);
        if (abs != 0 && (count = (abstractC0147B = this.f177q).getCount()) != 0) {
            int childCount = abstractC0147B.getChildCount();
            int firstVisiblePosition = abstractC0147B.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && abstractC0147B.getChildAt(0).getTop() >= 0)) : !(i2 >= count && abstractC0147B.getChildAt(childCount - 1).getBottom() <= abstractC0147B.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        if (this.f176p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f174n = true;
            this.f172l = false;
            float x2 = motionEvent.getX();
            float width = view.getWidth();
            AbstractC0147B abstractC0147B = this.f163c;
            float a2 = a(0, x2, width, abstractC0147B.getWidth());
            float a3 = a(1, motionEvent.getY(), view.getHeight(), abstractC0147B.getHeight());
            a aVar = this.f161a;
            aVar.f150c = a2;
            aVar.f151d = a3;
            if (!this.f175o && e()) {
                if (this.f164d == null) {
                    this.f164d = new b(i3, this);
                }
                this.f175o = true;
                this.f173m = true;
                if (this.f172l || (i2 = this.f168h) <= 0) {
                    this.f164d.run();
                } else {
                    b bVar = this.f164d;
                    long j2 = i2;
                    Field field = x.f3160a;
                    abstractC0147B.postOnAnimationDelayed(bVar, j2);
                }
                this.f172l = true;
            }
        }
        return false;
    }
}
