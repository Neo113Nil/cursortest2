package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;

/* loaded from: classes3.dex */
public class b {
    private static final float DOUBLE_PI = 6.2831855f;
    public static final c0 Linear = new k();
    public static final c0 EaseInQuad = new u();
    public static final c0 EaseOutQuad = new v();
    public static final c0 EaseInOutQuad = new w();
    public static final c0 EaseInCubic = new x();
    public static final c0 EaseOutCubic = new y();
    public static final c0 EaseInOutCubic = new z();
    public static final c0 EaseInQuart = new a0();
    public static final c0 EaseOutQuart = new b0();
    public static final c0 EaseInOutQuart = new a();
    public static final c0 EaseInSine = new C0263b();
    public static final c0 EaseOutSine = new c();
    public static final c0 EaseInOutSine = new d();
    public static final c0 EaseInExpo = new e();
    public static final c0 EaseOutExpo = new f();
    public static final c0 EaseInOutExpo = new g();
    public static final c0 EaseInCirc = new h();
    public static final c0 EaseOutCirc = new i();
    public static final c0 EaseInOutCirc = new j();
    public static final c0 EaseInElastic = new l();
    public static final c0 EaseOutElastic = new m();
    public static final c0 EaseInOutElastic = new n();
    public static final c0 EaseInBack = new o();
    public static final c0 EaseOutBack = new p();
    public static final c0 EaseInOutBack = new q();
    public static final c0 EaseInBounce = new r();
    public static final c0 EaseOutBounce = new s();
    public static final c0 EaseInOutBounce = new t();

    static class a implements c0 {
        a() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float pow;
            float f9;
            float f10 = f8 * 2.0f;
            if (f10 < 1.0f) {
                pow = (float) Math.pow(f10, 4.0d);
                f9 = 0.5f;
            } else {
                pow = ((float) Math.pow(f10 - 2.0f, 4.0d)) - 2.0f;
                f9 = -0.5f;
            }
            return pow * f9;
        }
    }

    static class a0 implements c0 {
        a0() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return (float) Math.pow(f8, 4.0d);
        }
    }

    /* renamed from: com.github.mikephil.charting.animation.b$b, reason: collision with other inner class name */
    static class C0263b implements c0 {
        C0263b() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return (-((float) Math.cos(f8 * 1.5707963267948966d))) + 1.0f;
        }
    }

    static class b0 implements c0 {
        b0() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return -(((float) Math.pow(f8 - 1.0f, 4.0d)) - 1.0f);
        }
    }

    static class c implements c0 {
        c() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return (float) Math.sin(f8 * 1.5707963267948966d);
        }
    }

    public interface c0 extends TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f8);
    }

    static class d implements c0 {
        d() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return (((float) Math.cos(f8 * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    }

    static class e implements c0 {
        e() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            if (f8 == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f8 - 1.0f) * 10.0f);
        }
    }

    static class f implements c0 {
        f() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            if (f8 == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (f8 + 1.0f) * (-10.0f)));
        }
    }

    static class g implements c0 {
        g() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            if (f8 == 0.0f) {
                return 0.0f;
            }
            if (f8 == 1.0f) {
                return 1.0f;
            }
            return (f8 * 2.0f < 1.0f ? (float) Math.pow(2.0d, (r8 - 1.0f) * 10.0f) : (-((float) Math.pow(2.0d, (r8 - 1.0f) * (-10.0f)))) + 2.0f) * 0.5f;
        }
    }

    static class h implements c0 {
        h() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return -(((float) Math.sqrt(1.0f - (f8 * f8))) - 1.0f);
        }
    }

    static class i implements c0 {
        i() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (float) Math.sqrt(1.0f - (f9 * f9));
        }
    }

    static class j implements c0 {
        j() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float sqrt;
            float f9;
            float f10 = f8 * 2.0f;
            if (f10 < 1.0f) {
                sqrt = ((float) Math.sqrt(1.0f - (f10 * f10))) - 1.0f;
                f9 = -0.5f;
            } else {
                float f11 = f10 - 2.0f;
                sqrt = ((float) Math.sqrt(1.0f - (f11 * f11))) + 1.0f;
                f9 = 0.5f;
            }
            return sqrt * f9;
        }
    }

    static class k implements c0 {
        k() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return f8;
        }
    }

    static class l implements c0 {
        l() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            if (f8 == 0.0f) {
                return 0.0f;
            }
            if (f8 == 1.0f) {
                return 1.0f;
            }
            float f9 = f8 - 1.0f;
            return -(((float) Math.pow(2.0d, 10.0f * f9)) * ((float) Math.sin(((f9 - (0.047746483f * ((float) Math.asin(1.0d)))) * b.DOUBLE_PI) / 0.3f)));
        }
    }

    static class m implements c0 {
        m() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            if (f8 == 0.0f) {
                return 0.0f;
            }
            if (f8 == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (-10.0f) * f8)) * ((float) Math.sin(((f8 - (0.047746483f * ((float) Math.asin(1.0d)))) * b.DOUBLE_PI) / 0.3f))) + 1.0f;
        }
    }

    static class n implements c0 {
        n() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            if (f8 == 0.0f) {
                return 0.0f;
            }
            float f9 = f8 * 2.0f;
            if (f9 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f9 < 1.0f) {
                float f10 = f9 - 1.0f;
                return ((float) Math.pow(2.0d, 10.0f * f10)) * ((float) Math.sin(((f10 * 1.0f) - asin) * b.DOUBLE_PI * 2.2222223f)) * (-0.5f);
            }
            float f11 = f9 - 1.0f;
            return (((float) Math.pow(2.0d, (-10.0f) * f11)) * 0.5f * ((float) Math.sin(((f11 * 1.0f) - asin) * b.DOUBLE_PI * 2.2222223f))) + 1.0f;
        }
    }

    static class o implements c0 {
        o() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return f8 * f8 * ((f8 * 2.70158f) - 1.70158f);
        }
    }

    static class p implements c0 {
        p() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 - 1.0f;
            return (f9 * f9 * ((f9 * 2.70158f) + 1.70158f)) + 1.0f;
        }
    }

    static class q implements c0 {
        q() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 * 2.0f;
            if (f9 < 1.0f) {
                return f9 * f9 * ((3.5949094f * f9) - 2.5949094f) * 0.5f;
            }
            float f10 = f9 - 2.0f;
            return ((f10 * f10 * ((3.5949094f * f10) + 2.5949094f)) + 2.0f) * 0.5f;
        }
    }

    static class r implements c0 {
        r() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return 1.0f - b.EaseOutBounce.getInterpolation(1.0f - f8);
        }
    }

    static class s implements c0 {
        s() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            if (f8 < 0.36363637f) {
                return 7.5625f * f8 * f8;
            }
            if (f8 < 0.72727275f) {
                float f9 = f8 - 0.54545456f;
                return (7.5625f * f9 * f9) + 0.75f;
            }
            if (f8 < 0.90909094f) {
                float f10 = f8 - 0.8181818f;
                return (7.5625f * f10 * f10) + 0.9375f;
            }
            float f11 = f8 - 0.95454544f;
            return (7.5625f * f11 * f11) + 0.984375f;
        }
    }

    static class t implements c0 {
        t() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return f8 < 0.5f ? b.EaseInBounce.getInterpolation(f8 * 2.0f) * 0.5f : (b.EaseOutBounce.getInterpolation((f8 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    }

    static class u implements c0 {
        u() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return f8 * f8;
        }
    }

    static class v implements c0 {
        v() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return (-f8) * (f8 - 2.0f);
        }
    }

    static class w implements c0 {
        w() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 * 2.0f;
            if (f9 < 1.0f) {
                return 0.5f * f9 * f9;
            }
            float f10 = f9 - 1.0f;
            return ((f10 * (f10 - 2.0f)) - 1.0f) * (-0.5f);
        }
    }

    static class x implements c0 {
        x() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return (float) Math.pow(f8, 3.0d);
        }
    }

    static class y implements c0 {
        y() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            return ((float) Math.pow(f8 - 1.0f, 3.0d)) + 1.0f;
        }
    }

    static class z implements c0 {
        z() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9 = f8 * 2.0f;
            return (f9 < 1.0f ? (float) Math.pow(f9, 3.0d) : ((float) Math.pow(f9 - 2.0f, 3.0d)) + 2.0f) * 0.5f;
        }
    }
}
