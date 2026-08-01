package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class nb0 extends mb0 {
    public nb0(rb0 rb0Var, WindowInsets windowInsets) {
        super(rb0Var, windowInsets);
    }

    @Override // defpackage.gb0, defpackage.ob0
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(qb0.a(i));
        return boundingRects;
    }

    @Override // defpackage.gb0, defpackage.ob0
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(qb0.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.gb0, defpackage.ob0
    public void p() {
    }
}
