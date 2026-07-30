package z0;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f10005a;

    public k(PathMeasure pathMeasure) {
        this.f10005a = pathMeasure;
    }

    public final void a(float f9, float f10, j jVar) {
        if (jVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f10005a.getSegment(f9, f10, jVar.f10002a, true);
    }
}
