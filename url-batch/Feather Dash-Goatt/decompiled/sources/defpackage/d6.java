package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d6 {
    public final PathMeasure a;

    public d6(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, c6 c6Var) {
        if (c6Var == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.getSegment(f, f2, c6Var.a, true);
    }
}
