package b0;

import a0.AbstractC0158a;
import android.graphics.Path;
import android.graphics.RectF;
import m.AbstractC0600j;

/* renamed from: b0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0258I {
    static void a(InterfaceC0258I interfaceC0258I, a0.e eVar) {
        Path.Direction direction;
        C0278k c0278k = (C0278k) interfaceC0258I;
        if (c0278k.f4279b == null) {
            c0278k.f4279b = new RectF();
        }
        RectF rectF = c0278k.f4279b;
        Z1.i.c(rectF);
        float f3 = eVar.f3498d;
        rectF.set(eVar.f3495a, eVar.f3496b, eVar.f3497c, f3);
        if (c0278k.f4280c == null) {
            c0278k.f4280c = new float[8];
        }
        float[] fArr = c0278k.f4280c;
        Z1.i.c(fArr);
        long j3 = eVar.f3499e;
        fArr[0] = AbstractC0158a.b(j3);
        fArr[1] = AbstractC0158a.c(j3);
        long j4 = eVar.f3500f;
        fArr[2] = AbstractC0158a.b(j4);
        fArr[3] = AbstractC0158a.c(j4);
        long j5 = eVar.f3501g;
        fArr[4] = AbstractC0158a.b(j5);
        fArr[5] = AbstractC0158a.c(j5);
        long j6 = eVar.f3502h;
        fArr[6] = AbstractC0158a.b(j6);
        fArr[7] = AbstractC0158a.c(j6);
        RectF rectF2 = c0278k.f4279b;
        Z1.i.c(rectF2);
        float[] fArr2 = c0278k.f4280c;
        Z1.i.c(fArr2);
        int a3 = AbstractC0600j.a(1);
        if (a3 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (a3 != 1) {
                throw new L1.f();
            }
            direction = Path.Direction.CW;
        }
        c0278k.f4278a.addRoundRect(rectF2, fArr2, direction);
    }

    static void b(InterfaceC0258I interfaceC0258I, a0.d dVar) {
        Path.Direction direction;
        C0278k c0278k = (C0278k) interfaceC0258I;
        float f3 = dVar.f3491a;
        if (!Float.isNaN(f3)) {
            float f4 = dVar.f3492b;
            if (!Float.isNaN(f4)) {
                float f5 = dVar.f3493c;
                if (!Float.isNaN(f5)) {
                    float f6 = dVar.f3494d;
                    if (!Float.isNaN(f6)) {
                        if (c0278k.f4279b == null) {
                            c0278k.f4279b = new RectF();
                        }
                        RectF rectF = c0278k.f4279b;
                        Z1.i.c(rectF);
                        rectF.set(f3, f4, f5, f6);
                        RectF rectF2 = c0278k.f4279b;
                        Z1.i.c(rectF2);
                        int a3 = AbstractC0600j.a(1);
                        if (a3 == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (a3 != 1) {
                                throw new L1.f();
                            }
                            direction = Path.Direction.CW;
                        }
                        c0278k.f4278a.addRect(rectF2, direction);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }
}
