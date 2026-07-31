package I;

import D.D;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Field;
import k.E;

/* loaded from: classes.dex */
public final class f implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f1134r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f1136b;

    /* renamed from: c, reason: collision with root package name */
    public final E f1137c;

    /* renamed from: d, reason: collision with root package name */
    public A.b f1138d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f1139e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f1140f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1141g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1142h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1143i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f1144j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1145k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1146l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1147m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1148n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1149o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1150p;

    /* renamed from: q, reason: collision with root package name */
    public final E f1151q;

    public f(E e4) {
        a aVar = new a();
        aVar.f1128e = Long.MIN_VALUE;
        aVar.f1130g = -1L;
        aVar.f1129f = 0L;
        this.f1135a = aVar;
        this.f1136b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1139e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1140f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1143i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1144j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1145k = fArr5;
        this.f1137c = e4;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f8;
        fArr5[1] = f8;
        float f9 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f9;
        fArr4[1] = f9;
        this.f1141g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1142h = f1134r;
        aVar.f1124a = com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL;
        aVar.f1125b = com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL;
        this.f1151q = e4;
    }

    public static float b(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i7, float f7, float f8, float f9) {
        float f10;
        float interpolation;
        float b7 = b(this.f1139e[i7] * f8, 0.0f, this.f1140f[i7]);
        float c7 = c(f8 - f7, b7) - c(f7, b7);
        AccelerateInterpolator accelerateInterpolator = this.f1136b;
        if (c7 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c7);
        } else {
            if (c7 <= 0.0f) {
                f10 = 0.0f;
                if (f10 != 0.0f) {
                    return 0.0f;
                }
                float f11 = this.f1143i[i7];
                float f12 = this.f1144j[i7];
                float f13 = this.f1145k[i7];
                float f14 = f11 * f9;
                return f10 > 0.0f ? b(f10 * f14, f12, f13) : -b((-f10) * f14, f12, f13);
            }
            interpolation = accelerateInterpolator.getInterpolation(c7);
        }
        f10 = b(interpolation, -1.0f, 1.0f);
        if (f10 != 0.0f) {
        }
    }

    public final float c(float f7, float f8) {
        if (f8 != 0.0f) {
            int i7 = this.f1141g;
            if (i7 == 0 || i7 == 1) {
                if (f7 < f8) {
                    if (f7 >= 0.0f) {
                        return 1.0f - (f7 / f8);
                    }
                    if (this.f1149o && i7 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i7 == 2 && f7 < 0.0f) {
                return f7 / (-f8);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f1147m) {
            this.f1149o = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f1135a;
        int i8 = (int) (currentAnimationTimeMillis - aVar.f1128e);
        int i9 = aVar.f1125b;
        if (i8 > i9) {
            i7 = i9;
        } else if (i8 >= 0) {
            i7 = i8;
        }
        aVar.f1132i = i7;
        aVar.f1131h = aVar.a(currentAnimationTimeMillis);
        aVar.f1130g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        E e4;
        int count;
        a aVar = this.f1135a;
        float f7 = aVar.f1127d;
        int abs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.f1126c);
        if (abs != 0 && (count = (e4 = this.f1151q).getCount()) != 0) {
            int childCount = e4.getChildCount();
            int firstVisiblePosition = e4.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && e4.getChildAt(0).getTop() >= 0)) : !(i7 >= count && e4.getChildAt(childCount - 1).getBottom() <= e4.getHeight())) {
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
        int i7;
        if (this.f1150p) {
            int actionMasked = motionEvent.getActionMasked();
            int i8 = 1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f1148n = true;
            this.f1146l = false;
            float x6 = motionEvent.getX();
            float width = view.getWidth();
            E e4 = this.f1137c;
            float a7 = a(0, x6, width, e4.getWidth());
            float a8 = a(1, motionEvent.getY(), view.getHeight(), e4.getHeight());
            a aVar = this.f1135a;
            aVar.f1126c = a7;
            aVar.f1127d = a8;
            if (!this.f1149o && e()) {
                if (this.f1138d == null) {
                    this.f1138d = new A.b(i8, this);
                }
                this.f1149o = true;
                this.f1147m = true;
                if (this.f1146l || (i7 = this.f1142h) <= 0) {
                    this.f1138d.run();
                } else {
                    A.b bVar = this.f1138d;
                    long j4 = i7;
                    Field field = D.f240a;
                    e4.postOnAnimationDelayed(bVar, j4);
                }
                this.f1146l = true;
            }
        }
        return false;
    }
}
