package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qt extends op {
    public final int o;

    public qt(int i) {
        this.o = i;
    }

    @Override // defpackage.op
    public final float C(y20 y20Var) {
        float[] fArr = ((rt) y20Var).G;
        if (fArr != null) {
            return fArr[this.o];
        }
        return 0.0f;
    }

    @Override // defpackage.op
    public final void Q(y20 y20Var, float f) {
        rt rtVar = (rt) y20Var;
        float[] fArr = rtVar.G;
        if (fArr != null) {
            int i = this.o;
            if (fArr[i] != f) {
                fArr[i] = f;
                u40 u40Var = rtVar.I;
                if (u40Var != null) {
                    float h = rtVar.h();
                    MaterialButton materialButton = (MaterialButton) u40Var.g;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.J != i2) {
                        materialButton.J = i2;
                        materialButton.v();
                        materialButton.invalidate();
                    }
                }
                rtVar.invalidateSelf();
            }
        }
    }
}
