package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qb extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public qb(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        sb sbVar = this.a.j;
        if (sbVar != null) {
            sbVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
