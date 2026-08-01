package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zo0 extends yo0 {
    public zo0(dp0 dp0Var, WindowInsets windowInsets) {
        super(dp0Var, windowInsets);
    }

    @Override // defpackage.so0, defpackage.ap0
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(cp0.a(i));
        return boundingRects;
    }

    @Override // defpackage.so0, defpackage.ap0
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(cp0.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.so0, defpackage.ap0
    public void p() {
    }
}
