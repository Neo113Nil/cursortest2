package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class flv {
    final flb a;
    final Path b;
    final Path c;
    final PathMeasure d;
    final Matrix e;

    public flv(flb flbVar) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = flbVar;
        this.e = new Matrix();
    }

    static final float i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract void d(Canvas canvas, Paint paint, int i, int i2);

    public abstract void e(Canvas canvas, Paint paint, flu fluVar, int i);

    public abstract void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public abstract void g();

    final void h(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.a.b();
        c(canvas, rect, f, z, z2);
    }
}
