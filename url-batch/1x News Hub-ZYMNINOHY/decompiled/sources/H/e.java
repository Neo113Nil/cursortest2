package H;

import E.A;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.Field;
import l.B;

/* loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f574r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f575a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f576b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f577c;

    /* renamed from: d, reason: collision with root package name */
    public B.b f578d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f579e;
    public final float[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int f580g;

    /* renamed from: h, reason: collision with root package name */
    public final int f581h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f582i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f583j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f584k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f585l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f586m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f587n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f588p;

    /* renamed from: q, reason: collision with root package name */
    public final B f589q;

    public e(B b3) {
        a aVar = new a();
        aVar.f569e = Long.MIN_VALUE;
        aVar.f570g = -1L;
        aVar.f = 0L;
        this.f575a = aVar;
        this.f576b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f579e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f582i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f583j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f584k = fArr5;
        this.f577c = b3;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f580g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f581h = f574r;
        aVar.f565a = 500;
        aVar.f566b = 500;
        this.f589q = b3;
    }

    public static float b(float f, float f3, float f4) {
        return f > f4 ? f4 : f < f3 ? f3 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i3, float f, float f3, float f4) {
        float f5;
        float interpolation;
        float b3 = b(this.f579e[i3] * f3, 0.0f, this.f[i3]);
        float c3 = c(f3 - f, b3) - c(f, b3);
        AccelerateInterpolator accelerateInterpolator = this.f576b;
        if (c3 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c3);
        } else {
            if (c3 <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f582i[i3];
                float f7 = this.f583j[i3];
                float f8 = this.f584k[i3];
                float f9 = f6 * f4;
                return f5 > 0.0f ? b(f5 * f9, f7, f8) : -b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(c3);
        }
        f5 = b(interpolation, -1.0f, 1.0f);
        if (f5 != 0.0f) {
        }
    }

    public final float c(float f, float f3) {
        if (f3 != 0.0f) {
            int i3 = this.f580g;
            if (i3 == 0 || i3 == 1) {
                if (f < f3) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f3);
                    }
                    if (this.o && i3 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i3 == 2 && f < 0.0f) {
                return f / (-f3);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f586m) {
            this.o = false;
            return;
        }
        a aVar = this.f575a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f569e);
        int i5 = aVar.f566b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f572i = i3;
        aVar.f571h = aVar.a(currentAnimationTimeMillis);
        aVar.f570g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        B b3;
        int count;
        a aVar = this.f575a;
        float f = aVar.f568d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(aVar.f567c);
        if (abs != 0 && (count = (b3 = this.f589q).getCount()) != 0) {
            int childCount = b3.getChildCount();
            int firstVisiblePosition = b3.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && b3.getChildAt(0).getTop() >= 0)) : !(i3 >= count && b3.getChildAt(childCount - 1).getBottom() <= b3.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r1 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i3;
        int i4 = 1;
        if (this.f588p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f587n = true;
            this.f585l = false;
            float x3 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f577c;
            float a3 = a(0, x3, width, listView.getWidth());
            float a4 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            a aVar = this.f575a;
            aVar.f567c = a3;
            aVar.f568d = a4;
            if (!this.o && e()) {
                if (this.f578d == null) {
                    this.f578d = new B.b(i4, this);
                }
                this.o = true;
                this.f586m = true;
                if (this.f585l || (i3 = this.f581h) <= 0) {
                    this.f578d.run();
                } else {
                    B.b bVar = this.f578d;
                    long j3 = i3;
                    Field field = A.f243a;
                    listView.postOnAnimationDelayed(bVar, j3);
                }
                this.f585l = true;
            }
        }
        return false;
    }
}
