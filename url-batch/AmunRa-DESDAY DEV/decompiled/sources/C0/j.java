package C0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class j extends s1.l {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    private final void k0(int i) {
    }

    @Override // s1.l
    public final void P(int i) {
        switch (this.h) {
            case 0:
                l lVar = (l) this.i;
                lVar.d = true;
                k kVar = (k) lVar.f152e.get();
                if (kVar != null) {
                    x0.e eVar = (x0.e) kVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // s1.l
    public final void Q(Typeface typeface, boolean z2) {
        switch (this.h) {
            case 0:
                if (!z2) {
                    l lVar = (l) this.i;
                    lVar.d = true;
                    k kVar = (k) lVar.f152e.get();
                    if (kVar != null) {
                        x0.e eVar = (x0.e) kVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.i;
                x0.e eVar2 = chip.f1652e;
                chip.setText(eVar2.f4172C0 ? eVar2.f4174E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
