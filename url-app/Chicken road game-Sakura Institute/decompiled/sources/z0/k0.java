package z0;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface k0 {
    static void a(k0 k0Var, y0.e eVar) {
        Path.Direction direction;
        j jVar = (j) k0Var;
        if (jVar.f10003b == null) {
            jVar.f10003b = new RectF();
        }
        RectF rectF = jVar.f10003b;
        r6.k.c(rectF);
        float f9 = eVar.f9784a;
        long j8 = eVar.f9791h;
        long j9 = eVar.f9790g;
        long j10 = eVar.f9789f;
        long j11 = eVar.f9788e;
        rectF.set(f9, eVar.f9785b, eVar.f9786c, eVar.f9787d);
        if (jVar.f10004c == null) {
            jVar.f10004c = new float[8];
        }
        float[] fArr = jVar.f10004c;
        r6.k.c(fArr);
        fArr[0] = y0.a.b(j11);
        fArr[1] = y0.a.c(j11);
        fArr[2] = y0.a.b(j10);
        fArr[3] = y0.a.c(j10);
        fArr[4] = y0.a.b(j9);
        fArr[5] = y0.a.c(j9);
        fArr[6] = y0.a.b(j8);
        fArr[7] = y0.a.c(j8);
        Path path = jVar.f10002a;
        RectF rectF2 = jVar.f10003b;
        r6.k.c(rectF2);
        float[] fArr2 = jVar.f10004c;
        r6.k.c(fArr2);
        int d8 = l.h.d(1);
        if (d8 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (d8 != 1) {
                throw new b4.c();
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    static void b(k0 k0Var, y0.d dVar) {
        Path.Direction direction;
        j jVar = (j) k0Var;
        float f9 = dVar.f9780a;
        float f10 = dVar.f9783d;
        float f11 = dVar.f9782c;
        float f12 = dVar.f9781b;
        if (Float.isNaN(f9) || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
            throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
        if (jVar.f10003b == null) {
            jVar.f10003b = new RectF();
        }
        RectF rectF = jVar.f10003b;
        r6.k.c(rectF);
        rectF.set(f9, f12, f11, f10);
        Path path = jVar.f10002a;
        RectF rectF2 = jVar.f10003b;
        r6.k.c(rectF2);
        int d8 = l.h.d(1);
        if (d8 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (d8 != 1) {
                throw new b4.c();
            }
            direction = Path.Direction.CW;
        }
        path.addRect(rectF2, direction);
    }
}
