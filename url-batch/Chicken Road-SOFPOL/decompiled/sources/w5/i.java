package w5;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends s6.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f8103g;

    public i(int i) {
        this.f8103g = i;
    }

    @Override // s6.a
    public final void G(y yVar, float f6) {
        j jVar = (j) yVar;
        float[] fArr = jVar.E;
        if (fArr != null) {
            int i = this.f8103g;
            if (fArr[i] != f6) {
                fArr[i] = f6;
                b.q qVar = jVar.G;
                if (qVar != null) {
                    float h8 = jVar.h();
                    MaterialButton materialButton = (MaterialButton) qVar.f1015a;
                    int i8 = (int) (h8 * 0.11f);
                    if (materialButton.A != i8) {
                        materialButton.A = i8;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // s6.a
    public final float v(y yVar) {
        float[] fArr = ((j) yVar).E;
        if (fArr != null) {
            return fArr[this.f8103g];
        }
        return 0.0f;
    }
}
