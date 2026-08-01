package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f10 extends mv {
    public final int o;

    public f10(int i) {
        this.o = i;
    }

    @Override // defpackage.mv
    public final void N(rd0 rd0Var, float f) {
        g10 g10Var = (g10) rd0Var;
        float[] fArr = g10Var.H;
        if (fArr != null) {
            int i = this.o;
            if (fArr[i] != f) {
                fArr[i] = f;
                cv cvVar = g10Var.J;
                if (cvVar != null) {
                    float h = g10Var.h();
                    MaterialButton materialButton = (MaterialButton) cvVar.f;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.J != i2) {
                        materialButton.J = i2;
                        materialButton.v();
                        materialButton.invalidate();
                    }
                }
                g10Var.invalidateSelf();
            }
        }
    }

    @Override // defpackage.mv
    public final float y(rd0 rd0Var) {
        float[] fArr = ((g10) rd0Var).H;
        if (fArr != null) {
            return fArr[this.o];
        }
        return 0.0f;
    }
}
