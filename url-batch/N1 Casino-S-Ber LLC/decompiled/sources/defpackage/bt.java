package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class bt extends jw {
    public final int o;

    public bt(int i) {
        this.o = i;
    }

    @Override // defpackage.jw
    public final float C(o20 o20Var) {
        float[] fArr = ((ct) o20Var).H;
        if (fArr != null) {
            return fArr[this.o];
        }
        return 0.0f;
    }

    @Override // defpackage.jw
    public final void d0(o20 o20Var, float f) {
        ct ctVar = (ct) o20Var;
        float[] fArr = ctVar.H;
        if (fArr != null) {
            int i = this.o;
            if (fArr[i] != f) {
                fArr[i] = f;
                l40 l40Var = ctVar.J;
                if (l40Var != null) {
                    float h = ctVar.h();
                    MaterialButton materialButton = (MaterialButton) l40Var.g;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.J != i2) {
                        materialButton.J = i2;
                        materialButton.v();
                        materialButton.invalidate();
                    }
                }
                ctVar.invalidateSelf();
            }
        }
    }
}
