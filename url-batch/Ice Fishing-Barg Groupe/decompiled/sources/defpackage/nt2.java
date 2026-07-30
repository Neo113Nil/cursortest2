package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nt2 extends mt2 {
    public nt2(rt2 rt2Var, WindowInsets windowInsets) {
        super(rt2Var, windowInsets);
    }

    @Override // defpackage.gt2, defpackage.ot2
    public List<Rect> a92UlCVFR9N8(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.TSizfFm2Yiuu.getBoundingRectsIgnoringVisibility(qt2.PxuCJdSBwIXG(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.gt2, defpackage.ot2
    public List<Rect> e9gEMXR7LXtO(int i) {
        List<Rect> boundingRects;
        boundingRects = this.TSizfFm2Yiuu.getBoundingRects(qt2.PxuCJdSBwIXG(i));
        return boundingRects;
    }

    @Override // defpackage.gt2, defpackage.ot2
    public void gPXPFXrUH4XX() {
    }
}
