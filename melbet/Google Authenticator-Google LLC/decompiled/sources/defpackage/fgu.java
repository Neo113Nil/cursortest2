package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgu extends fmp {
    final /* synthetic */ Chip a;

    public fgu(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.fmp
    public final void b(Typeface typeface, boolean z) {
        Chip chip = this.a;
        fgy fgyVar = chip.c;
        chip.setText(fgyVar.n ? fgyVar.d : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }

    @Override // defpackage.fmp
    public final void a(int i) {
    }
}
