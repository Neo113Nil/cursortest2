package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ea extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public ea(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ga gaVar = this.a.j;
        if (gaVar != null) {
            gaVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
