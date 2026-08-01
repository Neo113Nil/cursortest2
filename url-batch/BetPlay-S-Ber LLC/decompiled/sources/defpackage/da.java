package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class da extends l70 {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ da(int i, Object obj) {
        this.o = i;
        this.p = obj;
    }

    @Override // defpackage.l70
    public final void C(int i) {
        switch (this.o) {
            case 0:
                break;
            default:
                s50 s50Var = (s50) this.p;
                s50Var.d = true;
                ga gaVar = (ga) s50Var.e.get();
                if (gaVar != null) {
                    gaVar.G();
                    gaVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.l70
    public final void E(Typeface typeface, boolean z) {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                ga gaVar = chip.j;
                chip.setText(gaVar.Q0 ? gaVar.S : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    s50 s50Var = (s50) obj;
                    s50Var.d = true;
                    ga gaVar2 = (ga) s50Var.e.get();
                    if (gaVar2 != null) {
                        gaVar2.G();
                        gaVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void a0(int i) {
    }
}
