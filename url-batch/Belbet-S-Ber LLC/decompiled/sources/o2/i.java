package o2;

import a.g0;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i extends r1.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2953a;

    public i(int i) {
        this.f2953a = i;
    }

    @Override // r1.b
    public final void B(z zVar, float f5) {
        j jVar = (j) zVar;
        float[] fArr = jVar.G;
        if (fArr != null) {
            int i = this.f2953a;
            if (fArr[i] != f5) {
                fArr[i] = f5;
                g0 g0Var = jVar.I;
                if (g0Var != null) {
                    float h = jVar.h();
                    MaterialButton materialButton = (MaterialButton) g0Var.f25g;
                    int i4 = (int) (h * 0.11f);
                    if (materialButton.J != i4) {
                        materialButton.J = i4;
                        materialButton.v();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // r1.b
    public final float m(z zVar) {
        float[] fArr = ((j) zVar).G;
        if (fArr != null) {
            return fArr[this.f2953a];
        }
        return 0.0f;
    }
}
