package io.flutter.embedding.engine.mutatorsstack;

import B0.C0023a;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import b.InterfaceC0163a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC0163a
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<C0023a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<C0023a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i2, int i3, int i4, int i5, float[] fArr) {
        Rect rect = new Rect(i2, i3, i4, i5);
        this.mutators.add(new C0023a(29));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i2, int i3, int i4, int i5) {
        Rect rect = new Rect(i2, i3, i4, i5);
        this.mutators.add(new C0023a(29));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new C0023a(29));
        this.finalMatrix.preConcat(matrix);
    }
}
