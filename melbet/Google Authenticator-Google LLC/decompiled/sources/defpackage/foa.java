package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class foa extends acs {
    private final int a;

    public foa(int i) {
        this.a = i;
    }

    @Override // defpackage.acs
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = fob.B;
        float[] fArr = ((fob) obj).z;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.acs
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        fob fobVar = (fob) obj;
        int i = fob.B;
        float[] fArr = fobVar.z;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                kee keeVar = fobVar.A;
                if (keeVar != null) {
                    float t = fobVar.t() * 0.11f;
                    MaterialButton materialButton = (MaterialButton) keeVar.a;
                    int i3 = (int) t;
                    if (materialButton.h != i3) {
                        materialButton.h = i3;
                        materialButton.i();
                        materialButton.invalidate();
                    }
                }
                fobVar.invalidateSelf();
            }
        }
    }
}
