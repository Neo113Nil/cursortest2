package k1;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f5324a;

    public h(PathMeasure pathMeasure) {
        this.f5324a = pathMeasure;
    }

    public final void a(float f3, float f10, g gVar) {
        if (gVar == null) {
            a2.r.r("Unable to obtain android.graphics.Path");
        } else {
            this.f5324a.getSegment(f3, f10, gVar.f5321a, true);
        }
    }
}
