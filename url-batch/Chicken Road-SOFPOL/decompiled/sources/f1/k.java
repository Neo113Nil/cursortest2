package f1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f2681a;

    public k(PathMeasure pathMeasure) {
        this.f2681a = pathMeasure;
    }

    public final void a(float f6, float f8, j jVar) {
        if (jVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f2681a.getSegment(f6, f8, jVar.f2669a, true);
    }
}
