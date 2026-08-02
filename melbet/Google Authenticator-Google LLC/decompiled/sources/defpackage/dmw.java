package defpackage;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmw implements TypeEvaluator {
    private final dmx a;
    private final TimeInterpolator b = dmk.c;
    private final PointF c = new PointF();

    public dmw(dmx dmxVar) {
        this.a = dmxVar;
    }

    static float a(float f, float f2, float f3) {
        if (f < f2) {
            return 0.0f;
        }
        if (f > f2 + f3) {
            return 1.0f;
        }
        return (f - f2) / f3;
    }

    private final float b(float f) {
        return this.b.getInterpolation(f);
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float f2;
        float f3;
        float f4;
        PointF pointF = (PointF) obj;
        PointF pointF2 = (PointF) obj2;
        float f5 = 0.0f;
        if (pointF2.x == pointF.x || pointF2.y == pointF.y) {
            f2 = 0.0f;
            f3 = 1.0f;
            f4 = 1.0f;
        } else {
            float f6 = pointF2.y;
            float f7 = pointF.y;
            dmx dmxVar = this.a;
            f4 = 0.85f;
            if (f6 < f7) {
                f2 = dmxVar.c;
                f3 = dmxVar.d;
            } else {
                f5 = dmxVar.e;
                f2 = 0.0f;
                f4 = dmxVar.f;
                f3 = 0.85f;
            }
        }
        float b = b(a(f, f5, f4));
        float b2 = b(a(f, f2, f3));
        PointF pointF3 = this.c;
        pointF3.set(((1.0f - b) * pointF.x) + (b * pointF2.x), ((1.0f - b2) * pointF.y) + (b2 * pointF2.y));
        return pointF3;
    }
}
