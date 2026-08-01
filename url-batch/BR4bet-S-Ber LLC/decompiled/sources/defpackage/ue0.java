package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ue0 extends te0 {
    public ue0(ye0 ye0Var, WindowInsets windowInsets) {
        super(ye0Var, windowInsets);
    }

    @Override // defpackage.ne0, defpackage.ve0
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(xe0.a(i));
        return boundingRects;
    }

    @Override // defpackage.ne0, defpackage.ve0
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(xe0.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.ne0, defpackage.ve0
    public void p() {
    }
}
