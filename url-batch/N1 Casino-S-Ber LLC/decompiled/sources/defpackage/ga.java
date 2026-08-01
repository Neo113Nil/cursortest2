package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ga extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public ga(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ia iaVar = this.a.j;
        if (iaVar != null) {
            iaVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
