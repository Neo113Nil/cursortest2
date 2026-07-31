package b0;

import a0.AbstractC0236a;
import a0.C0239d;
import a0.C0240e;
import android.graphics.Path;
import android.graphics.RectF;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public interface L {
    static void a(L l3, C0240e c0240e) {
        Path.Direction direction;
        C0341j c0341j = (C0341j) l3;
        if (c0341j.f5421b == null) {
            c0341j.f5421b = new RectF();
        }
        RectF rectF = c0341j.f5421b;
        f2.j.c(rectF);
        float f3 = c0240e.f4731d;
        rectF.set(c0240e.f4728a, c0240e.f4729b, c0240e.f4730c, f3);
        if (c0341j.f5422c == null) {
            c0341j.f5422c = new float[8];
        }
        float[] fArr = c0341j.f5422c;
        f2.j.c(fArr);
        long j3 = c0240e.f4732e;
        fArr[0] = AbstractC0236a.b(j3);
        fArr[1] = AbstractC0236a.c(j3);
        long j4 = c0240e.f4733f;
        fArr[2] = AbstractC0236a.b(j4);
        fArr[3] = AbstractC0236a.c(j4);
        long j5 = c0240e.f4734g;
        fArr[4] = AbstractC0236a.b(j5);
        fArr[5] = AbstractC0236a.c(j5);
        long j6 = c0240e.f4735h;
        fArr[6] = AbstractC0236a.b(j6);
        fArr[7] = AbstractC0236a.c(j6);
        RectF rectF2 = c0341j.f5421b;
        f2.j.c(rectF2);
        float[] fArr2 = c0341j.f5422c;
        f2.j.c(fArr2);
        int b3 = AbstractC0625j.b(1);
        if (b3 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (b3 != 1) {
                throw new C1.c();
            }
            direction = Path.Direction.CW;
        }
        c0341j.f5420a.addRoundRect(rectF2, fArr2, direction);
    }

    static void b(L l3, C0239d c0239d) {
        Path.Direction direction;
        C0341j c0341j = (C0341j) l3;
        float f3 = c0239d.f4724a;
        if (!Float.isNaN(f3)) {
            float f4 = c0239d.f4725b;
            if (!Float.isNaN(f4)) {
                float f5 = c0239d.f4726c;
                if (!Float.isNaN(f5)) {
                    float f6 = c0239d.f4727d;
                    if (!Float.isNaN(f6)) {
                        if (c0341j.f5421b == null) {
                            c0341j.f5421b = new RectF();
                        }
                        RectF rectF = c0341j.f5421b;
                        f2.j.c(rectF);
                        rectF.set(f3, f4, f5, f6);
                        RectF rectF2 = c0341j.f5421b;
                        f2.j.c(rectF2);
                        int b3 = AbstractC0625j.b(1);
                        if (b3 == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (b3 != 1) {
                                throw new C1.c();
                            }
                            direction = Path.Direction.CW;
                        }
                        c0341j.f5420a.addRect(rectF2, direction);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }
}
