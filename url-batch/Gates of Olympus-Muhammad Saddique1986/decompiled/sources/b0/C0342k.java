package b0;

import android.graphics.PathMeasure;

/* renamed from: b0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342k {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f5423a;

    public C0342k(PathMeasure pathMeasure) {
        this.f5423a = pathMeasure;
    }

    public final void a(float f3, float f4, C0341j c0341j) {
        if (c0341j == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f5423a.getSegment(f3, f4, c0341j.f5420a, true);
    }
}
