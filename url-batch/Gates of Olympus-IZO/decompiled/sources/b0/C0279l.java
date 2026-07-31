package b0;

import android.graphics.PathMeasure;

/* renamed from: b0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279l {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f4281a;

    public C0279l(PathMeasure pathMeasure) {
        this.f4281a = pathMeasure;
    }

    public final void a(float f3, float f4, C0278k c0278k) {
        if (c0278k == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f4281a.getSegment(f3, f4, c0278k.f4278a, true);
    }
}
