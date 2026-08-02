package H;

import E.H;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Field;
import k.AbstractC1239z;

/* loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f1059r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f1060a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f1061b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1239z f1062c;

    /* renamed from: d, reason: collision with root package name */
    public B.b f1063d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f1064e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f1065f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1066g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1067h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1068i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f1069j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1070k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1071l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1072m;
    public boolean n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1073p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1239z f1074q;

    public e(AbstractC1239z abstractC1239z) {
        a aVar = new a();
        aVar.f1053e = Long.MIN_VALUE;
        aVar.f1055g = -1L;
        aVar.f1054f = 0L;
        this.f1060a = aVar;
        this.f1061b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1064e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1065f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1068i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1069j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1070k = fArr5;
        this.f1062c = abstractC1239z;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f4) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f4 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f1066g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1067h = f1059r;
        aVar.f1049a = 500;
        aVar.f1050b = 500;
        this.f1074q = abstractC1239z;
    }

    public static float b(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i4, float f4, float f5, float f6) {
        float f7;
        float interpolation;
        float b4 = b(this.f1064e[i4] * f5, 0.0f, this.f1065f[i4]);
        float c4 = c(f5 - f4, b4) - c(f4, b4);
        AccelerateInterpolator accelerateInterpolator = this.f1061b;
        if (c4 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c4);
        } else {
            if (c4 <= 0.0f) {
                f7 = 0.0f;
                if (f7 != 0.0f) {
                    return 0.0f;
                }
                float f8 = this.f1068i[i4];
                float f9 = this.f1069j[i4];
                float f10 = this.f1070k[i4];
                float f11 = f8 * f6;
                return f7 > 0.0f ? b(f7 * f11, f9, f10) : -b((-f7) * f11, f9, f10);
            }
            interpolation = accelerateInterpolator.getInterpolation(c4);
        }
        f7 = b(interpolation, -1.0f, 1.0f);
        if (f7 != 0.0f) {
        }
    }

    public final float c(float f4, float f5) {
        if (f5 != 0.0f) {
            int i4 = this.f1066g;
            if (i4 == 0 || i4 == 1) {
                if (f4 < f5) {
                    if (f4 >= 0.0f) {
                        return 1.0f - (f4 / f5);
                    }
                    if (this.o && i4 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i4 == 2 && f4 < 0.0f) {
                return f4 / (-f5);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i4 = 0;
        if (this.f1072m) {
            this.o = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f1060a;
        int i5 = (int) (currentAnimationTimeMillis - aVar.f1053e);
        int i6 = aVar.f1050b;
        if (i5 > i6) {
            i4 = i6;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        aVar.f1057i = i4;
        aVar.f1056h = aVar.a(currentAnimationTimeMillis);
        aVar.f1055g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC1239z abstractC1239z;
        int count;
        a aVar = this.f1060a;
        float f4 = aVar.f1052d;
        int abs = (int) (f4 / Math.abs(f4));
        Math.abs(aVar.f1051c);
        if (abs != 0 && (count = (abstractC1239z = this.f1074q).getCount()) != 0) {
            int childCount = abstractC1239z.getChildCount();
            int firstVisiblePosition = abstractC1239z.getFirstVisiblePosition();
            int i4 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && abstractC1239z.getChildAt(0).getTop() >= 0)) : !(i4 >= count && abstractC1239z.getChildAt(childCount - 1).getBottom() <= abstractC1239z.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i4;
        if (this.f1073p) {
            int actionMasked = motionEvent.getActionMasked();
            int i5 = 3;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.n = true;
            this.f1071l = false;
            float x4 = motionEvent.getX();
            float width = view.getWidth();
            AbstractC1239z abstractC1239z = this.f1062c;
            float a3 = a(0, x4, width, abstractC1239z.getWidth());
            float a4 = a(1, motionEvent.getY(), view.getHeight(), abstractC1239z.getHeight());
            a aVar = this.f1060a;
            aVar.f1051c = a3;
            aVar.f1052d = a4;
            if (!this.o && e()) {
                if (this.f1063d == null) {
                    this.f1063d = new B.b(i5, this);
                }
                this.o = true;
                this.f1072m = true;
                if (this.f1071l || (i4 = this.f1067h) <= 0) {
                    this.f1063d.run();
                } else {
                    B.b bVar = this.f1063d;
                    long j4 = i4;
                    Field field = H.f375a;
                    abstractC1239z.postOnAnimationDelayed(bVar, j4);
                }
                this.f1071l = true;
            }
        }
        return false;
    }
}
