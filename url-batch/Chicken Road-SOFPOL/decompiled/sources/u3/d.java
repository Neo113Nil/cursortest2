package u3;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Field;
import l.x0;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: u, reason: collision with root package name */
    public static final int f7357u = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    public final a f7358d;

    /* renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f7359e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f7360f;

    /* renamed from: g, reason: collision with root package name */
    public h4.b f7361g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f7362h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7363j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7364k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f7365l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f7366m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f7367n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7368o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7369p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7370q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7371r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7372s;

    /* renamed from: t, reason: collision with root package name */
    public final x0 f7373t;

    public d(x0 x0Var) {
        a aVar = new a();
        aVar.f7353e = Long.MIN_VALUE;
        aVar.f7355g = -1L;
        aVar.f7354f = 0L;
        this.f7358d = aVar;
        this.f7359e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f7362h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f7365l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f7366m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f7367n = fArr5;
        this.f7360f = x0Var;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f8;
        fArr5[1] = f8;
        float f9 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f9;
        fArr4[1] = f9;
        this.f7363j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f7364k = f7357u;
        aVar.f7349a = 500;
        aVar.f7350b = 500;
        this.f7373t = x0Var;
    }

    public static float b(float f6, float f8, float f9) {
        return f6 > f9 ? f9 : f6 < f8 ? f8 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f6, float f8, float f9) {
        float f10;
        float interpolation;
        float b8 = b(this.f7362h[i] * f8, 0.0f, this.i[i]);
        float c8 = c(f8 - f6, b8) - c(f6, b8);
        AccelerateInterpolator accelerateInterpolator = this.f7359e;
        if (c8 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c8);
        } else {
            if (c8 <= 0.0f) {
                f10 = 0.0f;
                if (f10 != 0.0f) {
                    return 0.0f;
                }
                float f11 = this.f7365l[i];
                float f12 = this.f7366m[i];
                float f13 = this.f7367n[i];
                float f14 = f11 * f9;
                return f10 > 0.0f ? b(f10 * f14, f12, f13) : -b((-f10) * f14, f12, f13);
            }
            interpolation = accelerateInterpolator.getInterpolation(c8);
        }
        f10 = b(interpolation, -1.0f, 1.0f);
        if (f10 != 0.0f) {
        }
    }

    public final float c(float f6, float f8) {
        if (f8 != 0.0f) {
            int i = this.f7363j;
            if (i == 0 || i == 1) {
                if (f6 < f8) {
                    if (f6 >= 0.0f) {
                        return 1.0f - (f6 / f8);
                    }
                    if (this.f7371r && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f6 < 0.0f) {
                return f6 / (-f8);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f7369p) {
            this.f7371r = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f7358d;
        int i8 = (int) (currentAnimationTimeMillis - aVar.f7353e);
        int i9 = aVar.f7350b;
        if (i8 > i9) {
            i = i9;
        } else if (i8 >= 0) {
            i = i8;
        }
        aVar.i = i;
        aVar.f7356h = aVar.a(currentAnimationTimeMillis);
        aVar.f7355g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        x0 x0Var;
        int count;
        a aVar = this.f7358d;
        float f6 = aVar.f7352d;
        int abs = (int) (f6 / Math.abs(f6));
        Math.abs(aVar.f7351c);
        if (abs != 0 && (count = (x0Var = this.f7373t).getCount()) != 0) {
            int childCount = x0Var.getChildCount();
            int firstVisiblePosition = x0Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && x0Var.getChildAt(0).getTop() >= 0)) : !(i >= count && x0Var.getChildAt(childCount - 1).getBottom() <= x0Var.getHeight())) {
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
        int i;
        if (this.f7372s) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f7370q = true;
            this.f7368o = false;
            float x7 = motionEvent.getX();
            float width = view.getWidth();
            x0 x0Var = this.f7360f;
            float a8 = a(0, x7, width, x0Var.getWidth());
            float a9 = a(1, motionEvent.getY(), view.getHeight(), x0Var.getHeight());
            a aVar = this.f7358d;
            aVar.f7351c = a8;
            aVar.f7352d = a9;
            if (!this.f7371r && e()) {
                if (this.f7361g == null) {
                    this.f7361g = new h4.b(6, this);
                }
                this.f7371r = true;
                this.f7369p = true;
                if (this.f7368o || (i = this.f7364k) <= 0) {
                    this.f7361g.run();
                } else {
                    h4.b bVar = this.f7361g;
                    long j7 = i;
                    Field field = k0.f6120a;
                    x0Var.postOnAnimationDelayed(bVar, j7);
                }
                this.f7368o = true;
            }
        }
        return false;
    }
}
