package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fa extends zo {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ fa(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    @Override // defpackage.zo
    public final void B(int i) {
        switch (this.r) {
            case 0:
                break;
            default:
                k50 k50Var = (k50) this.s;
                k50Var.d = true;
                ia iaVar = (ia) k50Var.e.get();
                if (iaVar != null) {
                    iaVar.G();
                    iaVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zo
    public final void C(Typeface typeface, boolean z) {
        int i = this.r;
        Object obj = this.s;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                ia iaVar = chip.j;
                chip.setText(iaVar.R0 ? iaVar.T : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    k50 k50Var = (k50) obj;
                    k50Var.d = true;
                    ia iaVar2 = (ia) k50Var.e.get();
                    if (iaVar2 != null) {
                        iaVar2.G();
                        iaVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void S(int i) {
    }
}
