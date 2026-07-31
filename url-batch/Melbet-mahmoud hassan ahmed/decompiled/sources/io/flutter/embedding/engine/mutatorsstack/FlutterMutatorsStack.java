package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();

    public class a {

        /* renamed from: a, reason: collision with root package name */
        private Matrix f17254a;

        /* renamed from: b, reason: collision with root package name */
        private Rect f17255b;

        /* renamed from: c, reason: collision with root package name */
        private float[] f17256c;

        /* renamed from: d, reason: collision with root package name */
        private b f17257d;

        public a(Matrix matrix) {
            this.f17257d = b.TRANSFORM;
            this.f17254a = matrix;
        }

        public a(Rect rect) {
            this.f17257d = b.CLIP_RECT;
            this.f17255b = rect;
        }

        public a(Rect rect, float[] fArr) {
            this.f17257d = b.CLIP_RRECT;
            this.f17255b = rect;
            this.f17256c = fArr;
        }

        public Matrix a() {
            return this.f17254a;
        }
    }

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i7, int i8, int i9, int i10, float[] fArr) {
        Rect rect = new Rect(i7, i8, i9, i10);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i7, int i8, int i9, int i10) {
        Rect rect = new Rect(i7, i8, i9, i10);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }
}
