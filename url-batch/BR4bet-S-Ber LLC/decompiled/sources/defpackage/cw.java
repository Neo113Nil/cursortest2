package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cw extends b9 {
    public final int x;

    public cw(int i) {
        this.x = i;
    }

    @Override // defpackage.b9
    public final void R(q50 q50Var, float f) {
        dw dwVar = (dw) q50Var;
        float[] fArr = dwVar.H;
        if (fArr != null) {
            int i = this.x;
            if (fArr[i] != f) {
                fArr[i] = f;
                c2 c2Var = dwVar.J;
                if (c2Var != null) {
                    float h = dwVar.h();
                    MaterialButton materialButton = (MaterialButton) c2Var.g;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.J != i2) {
                        materialButton.J = i2;
                        materialButton.v();
                        materialButton.invalidate();
                    }
                }
                dwVar.invalidateSelf();
            }
        }
    }

    @Override // defpackage.b9
    public final float s(q50 q50Var) {
        float[] fArr = ((dw) q50Var).H;
        if (fArr != null) {
            return fArr[this.x];
        }
        return 0.0f;
    }
}
