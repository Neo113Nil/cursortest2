package androidx.graphics.shapes;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class MutableCubic extends Cubic {
    public MutableCubic() {
        super(null, 1, null);
    }

    private final void transformOnePoint(PointTransformer pointTransformer, int i8) {
        int i9 = i8 + 1;
        long mo63transformXgqJiTY = pointTransformer.mo63transformXgqJiTY(getPoints$graphics_shapes_release()[i8], getPoints$graphics_shapes_release()[i9]);
        getPoints$graphics_shapes_release()[i8] = Float.intBitsToFloat((int) (mo63transformXgqJiTY >> 32));
        getPoints$graphics_shapes_release()[i9] = Float.intBitsToFloat((int) (mo63transformXgqJiTY & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    public final void interpolate(Cubic c12, Cubic c22, float f8) {
        s.checkNotNullParameter(c12, "c1");
        s.checkNotNullParameter(c22, "c2");
        for (int i8 = 0; i8 < 8; i8++) {
            getPoints$graphics_shapes_release()[i8] = Utils.interpolate(c12.getPoints$graphics_shapes_release()[i8], c22.getPoints$graphics_shapes_release()[i8], f8);
        }
    }

    public final void transform(PointTransformer f8) {
        s.checkNotNullParameter(f8, "f");
        transformOnePoint(f8, 0);
        transformOnePoint(f8, 2);
        transformOnePoint(f8, 4);
        transformOnePoint(f8, 6);
    }
}
