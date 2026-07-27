package Z;

import android.graphics.PathMeasure;

/* renamed from: Z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314k {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f4533a;

    public C0314k(PathMeasure pathMeasure) {
        this.f4533a = pathMeasure;
    }

    public final void a(float f4, float f5, C0313j c0313j) {
        if (c0313j == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f4533a.getSegment(f4, f5, c0313j.f4530a, true);
    }
}
