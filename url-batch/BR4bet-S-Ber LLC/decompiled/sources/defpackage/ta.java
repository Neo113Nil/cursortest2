package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ta extends b9 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ta(int i, Object obj) {
        this.x = i;
        this.y = obj;
    }

    @Override // defpackage.b9
    public final void B(Typeface typeface, boolean z) {
        int i = this.x;
        Object obj = this.y;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                wa waVar = chip.j;
                chip.setText(waVar.R0 ? waVar.T : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    r80 r80Var = (r80) obj;
                    r80Var.d = true;
                    wa waVar2 = (wa) r80Var.e.get();
                    if (waVar2 != null) {
                        waVar2.G();
                        waVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.b9
    public final void z(int i) {
        switch (this.x) {
            case 0:
                break;
            default:
                r80 r80Var = (r80) this.y;
                r80Var.d = true;
                wa waVar = (wa) r80Var.e.get();
                if (waVar != null) {
                    waVar.G();
                    waVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    private final void X(int i) {
    }
}
