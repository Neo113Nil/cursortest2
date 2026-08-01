package o3;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g1 extends f1 {
    public g1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
    }

    @Override // o3.z0, o3.h1
    public List<Rect> f(int i3) {
        List<Rect> boundingRects;
        boundingRects = this.f7460c.getBoundingRects(j1.a(i3));
        return boundingRects;
    }

    @Override // o3.z0, o3.h1
    public List<Rect> g(int i3) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.f7460c.getBoundingRectsIgnoringVisibility(j1.a(i3));
        return boundingRectsIgnoringVisibility;
    }

    public g1(k1 k1Var, g1 g1Var) {
        super(k1Var, g1Var);
    }

    @Override // o3.z0, o3.h1
    public void q() {
    }
}
