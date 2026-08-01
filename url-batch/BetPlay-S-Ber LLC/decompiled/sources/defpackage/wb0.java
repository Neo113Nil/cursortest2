package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class wb0 extends vb0 {
    public wb0(ac0 ac0Var, WindowInsets windowInsets) {
        super(ac0Var, windowInsets);
    }

    @Override // defpackage.pb0, defpackage.xb0
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(zb0.a(i));
        return boundingRects;
    }

    @Override // defpackage.pb0, defpackage.xb0
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(zb0.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.pb0, defpackage.xb0
    public void p() {
    }
}
