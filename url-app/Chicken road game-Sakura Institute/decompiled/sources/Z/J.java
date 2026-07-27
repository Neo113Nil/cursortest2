package Z;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import y2.C1338m;

/* loaded from: classes.dex */
public interface J {
    static void a(J j4, Y.e eVar) {
        Path.Direction direction;
        C0313j c0313j = (C0313j) j4;
        if (c0313j.f4531b == null) {
            c0313j.f4531b = new RectF();
        }
        RectF rectF = c0313j.f4531b;
        Intrinsics.c(rectF);
        float f4 = eVar.f4381d;
        rectF.set(eVar.f4378a, eVar.f4379b, eVar.f4380c, f4);
        if (c0313j.f4532c == null) {
            c0313j.f4532c = new float[8];
        }
        float[] fArr = c0313j.f4532c;
        Intrinsics.c(fArr);
        long j5 = eVar.f4382e;
        fArr[0] = Y.a.b(j5);
        fArr[1] = Y.a.c(j5);
        long j6 = eVar.f4383f;
        fArr[2] = Y.a.b(j6);
        fArr[3] = Y.a.c(j6);
        long j7 = eVar.f4384g;
        fArr[4] = Y.a.b(j7);
        fArr[5] = Y.a.c(j7);
        long j8 = eVar.f4385h;
        fArr[6] = Y.a.b(j8);
        fArr[7] = Y.a.c(j8);
        RectF rectF2 = c0313j.f4531b;
        Intrinsics.c(rectF2);
        float[] fArr2 = c0313j.f4532c;
        Intrinsics.c(fArr2);
        int d4 = AbstractC0784j.d(1);
        if (d4 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (d4 != 1) {
                throw new C1338m();
            }
            direction = Path.Direction.CW;
        }
        c0313j.f4530a.addRoundRect(rectF2, fArr2, direction);
    }

    static void b(J j4, Y.d dVar) {
        Path.Direction direction;
        C0313j c0313j = (C0313j) j4;
        float f4 = dVar.f4374a;
        if (!Float.isNaN(f4)) {
            float f5 = dVar.f4375b;
            if (!Float.isNaN(f5)) {
                float f6 = dVar.f4376c;
                if (!Float.isNaN(f6)) {
                    float f7 = dVar.f4377d;
                    if (!Float.isNaN(f7)) {
                        if (c0313j.f4531b == null) {
                            c0313j.f4531b = new RectF();
                        }
                        RectF rectF = c0313j.f4531b;
                        Intrinsics.c(rectF);
                        rectF.set(f4, f5, f6, f7);
                        RectF rectF2 = c0313j.f4531b;
                        Intrinsics.c(rectF2);
                        int d4 = AbstractC0784j.d(1);
                        if (d4 == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (d4 != 1) {
                                throw new C1338m();
                            }
                            direction = Path.Direction.CW;
                        }
                        c0313j.f4530a.addRect(rectF2, direction);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }
}
