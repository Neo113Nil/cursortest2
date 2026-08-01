package g2;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i extends m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1856a;

    public i(int i4) {
        this.f1856a = i4;
    }

    @Override // m0.a
    public final void A(z zVar, float f4) {
        j jVar = (j) zVar;
        float[] fArr = jVar.G;
        if (fArr != null) {
            int i4 = this.f1856a;
            if (fArr[i4] != f4) {
                fArr[i4] = f4;
                j2.z zVar2 = jVar.I;
                if (zVar2 != null) {
                    float h = jVar.h();
                    MaterialButton materialButton = (MaterialButton) zVar2.f2399f;
                    int i5 = (int) (h * 0.11f);
                    if (materialButton.J != i5) {
                        materialButton.J = i5;
                        materialButton.w();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // m0.a
    public final float m(z zVar) {
        float[] fArr = ((j) zVar).G;
        if (fArr != null) {
            return fArr[this.f1856a];
        }
        return 0.0f;
    }
}
