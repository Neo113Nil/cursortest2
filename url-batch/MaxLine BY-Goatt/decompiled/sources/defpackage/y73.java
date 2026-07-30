package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y73 extends x73 {
    public y73(c83 c83Var, WindowInsets windowInsets) {
        super(c83Var, windowInsets);
    }

    @Override // defpackage.r73, defpackage.z73
    public List<Rect> e(int i) {
        return this.c.getBoundingRects(b83.a(i));
    }

    @Override // defpackage.r73, defpackage.z73
    public List<Rect> f(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(b83.a(i));
    }

    @Override // defpackage.r73, defpackage.z73
    public void p() {
    }
}
