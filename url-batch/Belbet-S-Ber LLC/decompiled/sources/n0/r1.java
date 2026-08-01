package n0;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r1 extends q1 {
    public r1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var, windowInsets);
    }

    @Override // n0.k1, n0.s1
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.f2797c.getBoundingRects(u1.a(i));
        return boundingRects;
    }

    @Override // n0.k1, n0.s1
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.f2797c.getBoundingRectsIgnoringVisibility(u1.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // n0.k1, n0.s1
    public void p() {
    }
}
