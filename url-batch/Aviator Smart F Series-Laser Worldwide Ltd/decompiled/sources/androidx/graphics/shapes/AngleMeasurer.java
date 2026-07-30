package androidx.graphics.shapes;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class AngleMeasurer implements Measurer {
    private final float centerX;
    private final float centerY;

    public AngleMeasurer(float f8, float f9) {
        this.centerX = f8;
        this.centerY = f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float findCubicCutPoint$lambda$1(Cubic c8, AngleMeasurer this$0, float f8, float f9, float f10) {
        s.checkNotNullParameter(c8, "$c");
        s.checkNotNullParameter(this$0, "this$0");
        long m42pointOnCurveOOQOV4g$graphics_shapes_release = c8.m42pointOnCurveOOQOV4g$graphics_shapes_release(f10);
        return Math.abs(Utils.positiveModulo(Utils.angle(PointKt.m54getXDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release) - this$0.centerX, PointKt.m55getYDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release) - this$0.centerY) - f8, Utils.getTwoPi()) - f9);
    }

    @Override // androidx.graphics.shapes.Measurer
    public float findCubicCutPoint(final Cubic c8, final float f8) {
        s.checkNotNullParameter(c8, "c");
        final float angle = Utils.angle(c8.getAnchor0X() - this.centerX, c8.getAnchor0Y() - this.centerY);
        return Utils.findMinimum(0.0f, 1.0f, 1.0E-5f, new FindMinimumFunction() { // from class: androidx.graphics.shapes.a
            @Override // androidx.graphics.shapes.FindMinimumFunction
            public final float invoke(float f9) {
                float findCubicCutPoint$lambda$1;
                findCubicCutPoint$lambda$1 = AngleMeasurer.findCubicCutPoint$lambda$1(Cubic.this, this, angle, f8, f9);
                return findCubicCutPoint$lambda$1;
            }
        });
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    @Override // androidx.graphics.shapes.Measurer
    public float measureCubic(Cubic c8) {
        s.checkNotNullParameter(c8, "c");
        float positiveModulo = Utils.positiveModulo(Utils.angle(c8.getAnchor1X() - this.centerX, c8.getAnchor1Y() - this.centerY) - Utils.angle(c8.getAnchor0X() - this.centerX, c8.getAnchor0Y() - this.centerY), Utils.getTwoPi());
        if (positiveModulo > Utils.getTwoPi() - 1.0E-4f) {
            return 0.0f;
        }
        return positiveModulo;
    }
}
