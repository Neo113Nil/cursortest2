package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgv extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public fgv(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        fgy fgyVar = this.a.c;
        if (fgyVar != null) {
            fgyVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
