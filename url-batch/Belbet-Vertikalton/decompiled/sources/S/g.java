package S;

import M.P;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import n.C0305v0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f1123r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f1124a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f1125b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f1126c;

    /* renamed from: d, reason: collision with root package name */
    public C1.e f1127d;
    public final float[] e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f1128f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1129g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1130h;
    public final float[] i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1131k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1132l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1133m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1134n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1135o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1136p;

    /* renamed from: q, reason: collision with root package name */
    public final C0305v0 f1137q;

    public g(C0305v0 c0305v0) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.f1121g = -1L;
        aVar.f1120f = 0L;
        this.f1124a = aVar;
        this.f1125b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1128f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1131k = fArr5;
        this.f1126c = c0305v0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f1129g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1130h = f1123r;
        aVar.f1116a = 500;
        aVar.f1117b = 500;
        this.f1137q = c0305v0;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float b2 = b(this.e[i] * f3, 0.0f, this.f1128f[i]);
        float c2 = c(f3 - f2, b2) - c(f2, b2);
        AccelerateInterpolator accelerateInterpolator = this.f1125b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.i[i];
                float f7 = this.j[i];
                float f8 = this.f1131k[i];
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
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1129g;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f1135o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f1133m) {
            this.f1135o = false;
            return;
        }
        a aVar = this.f1124a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - aVar.e);
        int i3 = aVar.f1117b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.f1122h = aVar.a(currentAnimationTimeMillis);
        aVar.f1121g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C0305v0 c0305v0;
        int count;
        a aVar = this.f1124a;
        float f2 = aVar.f1119d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f1118c);
        if (abs == 0 || (count = (c0305v0 = this.f1137q).getCount()) == 0) {
            return false;
        }
        int childCount = c0305v0.getChildCount();
        int firstVisiblePosition = c0305v0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c0305v0.getChildAt(childCount - 1).getBottom() <= c0305v0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0305v0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r1 != 3) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 2;
        if (!this.f1136p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            d();
            return false;
        }
        this.f1134n = true;
        this.f1132l = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f1126c;
        float a2 = a(0, x2, width, listView.getWidth());
        float a3 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f1124a;
        aVar.f1118c = a2;
        aVar.f1119d = a3;
        if (!this.f1135o && e()) {
            if (this.f1127d == null) {
                this.f1127d = new C1.e(i2, this);
            }
            this.f1135o = true;
            this.f1133m = true;
            if (this.f1132l || (i = this.f1130h) <= 0) {
                this.f1127d.run();
            } else {
                C1.e eVar = this.f1127d;
                long j = i;
                WeakHashMap weakHashMap = P.f711a;
                listView.postOnAnimationDelayed(eVar, j);
            }
            this.f1132l = true;
        }
        return false;
    }
}
