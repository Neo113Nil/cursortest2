package L;

import I.T;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import n.C0742w0;

/* loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: z, reason: collision with root package name */
    public static final int f1631z = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    public final a f1632d;

    /* renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f1633e;

    /* renamed from: i, reason: collision with root package name */
    public final C0742w0 f1634i;

    /* renamed from: l, reason: collision with root package name */
    public F.b f1635l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f1636m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f1637n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1638o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1639p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f1640q;

    /* renamed from: r, reason: collision with root package name */
    public final float[] f1641r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f1642s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1643t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1644u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1645v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1646w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1647x;

    /* renamed from: y, reason: collision with root package name */
    public final C0742w0 f1648y;

    public c(C0742w0 c0742w0) {
        a aVar = new a();
        aVar.f1626e = Long.MIN_VALUE;
        aVar.f1628g = -1L;
        aVar.f1627f = 0L;
        this.f1632d = aVar;
        this.f1633e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1636m = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1637n = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1640q = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1641r = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1642s = fArr5;
        this.f1634i = c0742w0;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = ((int) ((1575.0f * f7) + 0.5f)) / 1000.0f;
        fArr5[0] = f8;
        fArr5[1] = f8;
        float f9 = ((int) ((f7 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f9;
        fArr4[1] = f9;
        this.f1638o = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1639p = f1631z;
        aVar.f1622a = com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL;
        aVar.f1623b = com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL;
        this.f1648y = c0742w0;
    }

    public static float b(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i2, float f7, float f8, float f9) {
        float f10;
        float interpolation;
        float b7 = b(this.f1636m[i2] * f8, 0.0f, this.f1637n[i2]);
        float c7 = c(f8 - f7, b7) - c(f7, b7);
        AccelerateInterpolator accelerateInterpolator = this.f1633e;
        if (c7 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c7);
        } else {
            if (c7 <= 0.0f) {
                f10 = 0.0f;
                if (f10 != 0.0f) {
                    return 0.0f;
                }
                float f11 = this.f1640q[i2];
                float f12 = this.f1641r[i2];
                float f13 = this.f1642s[i2];
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
            int i2 = this.f1638o;
            if (i2 == 0 || i2 == 1) {
                if (f7 < f8) {
                    if (f7 >= 0.0f) {
                        return 1.0f - (f7 / f8);
                    }
                    if (this.f1646w && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f7 < 0.0f) {
                return f7 / (-f8);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f1644u) {
            this.f1646w = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f1632d;
        int i5 = (int) (currentAnimationTimeMillis - aVar.f1626e);
        int i7 = aVar.f1623b;
        if (i5 > i7) {
            i2 = i7;
        } else if (i5 >= 0) {
            i2 = i5;
        }
        aVar.f1630i = i2;
        aVar.f1629h = aVar.a(currentAnimationTimeMillis);
        aVar.f1628g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0742w0 c0742w0;
        int count;
        a aVar = this.f1632d;
        float f7 = aVar.f1625d;
        int abs = (int) (f7 / Math.abs(f7));
        Math.abs(aVar.f1624c);
        if (abs != 0 && (count = (c0742w0 = this.f1648y).getCount()) != 0) {
            int childCount = c0742w0.getChildCount();
            int firstVisiblePosition = c0742w0.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c0742w0.getChildAt(0).getTop() >= 0)) : !(i2 >= count && c0742w0.getChildAt(childCount - 1).getBottom() <= c0742w0.getHeight())) {
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
        if (this.f1647x) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f1645v = true;
            this.f1643t = false;
            float x7 = motionEvent.getX();
            float width = view.getWidth();
            C0742w0 c0742w0 = this.f1634i;
            float a7 = a(0, x7, width, c0742w0.getWidth());
            float a8 = a(1, motionEvent.getY(), view.getHeight(), c0742w0.getHeight());
            a aVar = this.f1632d;
            aVar.f1624c = a7;
            aVar.f1625d = a8;
            if (!this.f1646w && e()) {
                if (this.f1635l == null) {
                    this.f1635l = new F.b(5, this);
                }
                this.f1646w = true;
                this.f1644u = true;
                if (this.f1643t || (i2 = this.f1639p) <= 0) {
                    this.f1635l.run();
                } else {
                    F.b bVar = this.f1635l;
                    long j = i2;
                    WeakHashMap weakHashMap = T.f1153a;
                    c0742w0.postOnAnimationDelayed(bVar, j);
                }
                this.f1643t = true;
            }
        }
        return false;
    }
}
