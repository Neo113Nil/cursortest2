package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ua extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public ua(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        wa waVar = this.a.j;
        if (waVar != null) {
            waVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
