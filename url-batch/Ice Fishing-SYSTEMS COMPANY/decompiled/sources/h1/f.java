package h1;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.CL;
import i1.AbstractC4574a;
import k1.C4629b;

/* loaded from: classes.dex */
public final class f implements D {

    /* renamed from: u, reason: collision with root package name */
    public static final f f38159u = new f(0);

    /* renamed from: v, reason: collision with root package name */
    public static final f f38160v = new f(1);

    /* renamed from: w, reason: collision with root package name */
    public static final f f38161w = new f(2);

    /* renamed from: x, reason: collision with root package name */
    public static final f f38162x = new f(3);

    /* renamed from: y, reason: collision with root package name */
    public static final f f38163y = new f(4);

    /* renamed from: z, reason: collision with root package name */
    public static final f f38164z = new f(5);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38165n;

    public /* synthetic */ f(int i) {
        this.f38165n = i;
    }

    @Override // h1.D
    public final Object a(AbstractC4574a abstractC4574a, float f6) {
        switch (this.f38165n) {
            case 0:
                boolean z8 = abstractC4574a.I() == 1;
                if (z8) {
                    abstractC4574a.b();
                }
                double F8 = abstractC4574a.F();
                double F9 = abstractC4574a.F();
                double F10 = abstractC4574a.F();
                double F11 = abstractC4574a.I() == 7 ? abstractC4574a.F() : 1.0d;
                if (z8) {
                    abstractC4574a.z();
                }
                if (F8 <= 1.0d && F9 <= 1.0d && F10 <= 1.0d) {
                    F8 *= 255.0d;
                    F9 *= 255.0d;
                    F10 *= 255.0d;
                    if (F11 <= 1.0d) {
                        F11 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) F11, (int) F8, (int) F9, (int) F10));
            case 1:
                return Float.valueOf(n.d(abstractC4574a) * f6);
            case 2:
                return Integer.valueOf(Math.round(n.d(abstractC4574a) * f6));
            case 3:
                return n.b(abstractC4574a, f6);
            case 4:
                int I2 = abstractC4574a.I();
                if (I2 == 1) {
                    return n.b(abstractC4574a, f6);
                }
                if (I2 == 3) {
                    return n.b(abstractC4574a, f6);
                }
                if (I2 != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(CL.x(I2)));
                }
                PointF pointF = new PointF(((float) abstractC4574a.F()) * f6, ((float) abstractC4574a.F()) * f6);
                while (abstractC4574a.D()) {
                    abstractC4574a.W();
                }
                return pointF;
            default:
                boolean z9 = abstractC4574a.I() == 1;
                if (z9) {
                    abstractC4574a.b();
                }
                float F12 = (float) abstractC4574a.F();
                float F13 = (float) abstractC4574a.F();
                while (abstractC4574a.D()) {
                    abstractC4574a.W();
                }
                if (z9) {
                    abstractC4574a.z();
                }
                return new C4629b((F12 / 100.0f) * f6, (F13 / 100.0f) * f6);
        }
    }
}
