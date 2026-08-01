package l2;

import a.e0;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends t0.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2596a;

    public i(int i) {
        this.f2596a = i;
    }

    @Override // t0.d
    public final float h(y yVar) {
        float[] fArr = ((j) yVar).G;
        if (fArr != null) {
            return fArr[this.f2596a];
        }
        return 0.0f;
    }

    @Override // t0.d
    public final void t(y yVar, float f2) {
        j jVar = (j) yVar;
        float[] fArr = jVar.G;
        if (fArr != null) {
            int i = this.f2596a;
            if (fArr[i] != f2) {
                fArr[i] = f2;
                e0 e0Var = jVar.I;
                if (e0Var != null) {
                    float i4 = jVar.i();
                    MaterialButton materialButton = (MaterialButton) e0Var.f18g;
                    int i5 = (int) (i4 * 0.11f);
                    if (materialButton.C != i5) {
                        materialButton.C = i5;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }
}
