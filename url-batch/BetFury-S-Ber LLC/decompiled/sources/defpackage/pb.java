package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class pb extends mc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mc0
    public final void i(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                qh0 qh0Var = (qh0) this.b;
                qh0Var.d = true;
                sb sbVar = (sb) qh0Var.e.get();
                if (sbVar != null) {
                    sbVar.G();
                    sbVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.mc0
    public final void j(Typeface typeface, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                sb sbVar = chip.j;
                chip.setText(sbVar.R0 ? sbVar.T : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    qh0 qh0Var = (qh0) obj;
                    qh0Var.d = true;
                    sb sbVar2 = (sb) qh0Var.e.get();
                    if (sbVar2 != null) {
                        sbVar2.G();
                        sbVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void m(int i) {
    }
}
