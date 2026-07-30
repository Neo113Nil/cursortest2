package androidx.graphics.shapes;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class Shapes_androidKt {
    private static final void pathFromCubics(Path path, List<? extends Cubic> list) {
        path.rewind();
        int size = list.size();
        boolean z7 = true;
        for (int i8 = 0; i8 < size; i8++) {
            Cubic cubic = list.get(i8);
            if (z7) {
                path.moveTo(cubic.getAnchor0X(), cubic.getAnchor0Y());
                z7 = false;
            }
            path.cubicTo(cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic.getAnchor1X(), cubic.getAnchor1Y());
        }
        path.close();
    }

    public static final Path toPath(RoundedPolygon roundedPolygon) {
        s.checkNotNullParameter(roundedPolygon, "<this>");
        return toPath$default(roundedPolygon, null, 1, null);
    }

    public static /* synthetic */ Path toPath$default(RoundedPolygon roundedPolygon, Path path, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            path = new Path();
        }
        return toPath(roundedPolygon, path);
    }

    public static final RoundedPolygon transformed(RoundedPolygon roundedPolygon, final Matrix matrix) {
        s.checkNotNullParameter(roundedPolygon, "<this>");
        s.checkNotNullParameter(matrix, "matrix");
        final float[] fArr = new float[2];
        return roundedPolygon.transformed(new PointTransformer() { // from class: androidx.graphics.shapes.Shapes_androidKt$transformed$1
            @Override // androidx.graphics.shapes.PointTransformer
            /* renamed from: transform-XgqJiTY */
            public final long mo63transformXgqJiTY(float f8, float f9) {
                float[] fArr2 = fArr;
                fArr2[0] = f8;
                fArr2[1] = f9;
                matrix.mapPoints(fArr2);
                float[] fArr3 = fArr;
                return FloatFloatPair.m8constructorimpl(fArr3[0], fArr3[1]);
            }
        });
    }

    public static final Path toPath(RoundedPolygon roundedPolygon, Path path) {
        s.checkNotNullParameter(roundedPolygon, "<this>");
        s.checkNotNullParameter(path, "path");
        pathFromCubics(path, roundedPolygon.getCubics());
        return path;
    }

    public static /* synthetic */ Path toPath$default(Morph morph, float f8, Path path, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            path = new Path();
        }
        return toPath(morph, f8, path);
    }

    public static final Path toPath(Morph morph, float f8, Path path) {
        s.checkNotNullParameter(morph, "<this>");
        s.checkNotNullParameter(path, "path");
        pathFromCubics(path, morph.asCubics(f8));
        return path;
    }
}
