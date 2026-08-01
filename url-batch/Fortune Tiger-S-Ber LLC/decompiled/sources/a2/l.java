package a2;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l extends k3.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f57f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l(int i4, Object obj) {
        this.f57f = i4;
        this.g = obj;
    }

    @Override // k3.d
    public final void R(int i4) {
        switch (this.f57f) {
            case 0:
                n nVar = (n) this.g;
                nVar.f60d = true;
                m mVar = (m) nVar.f61e.get();
                if (mVar != null) {
                    u1.e eVar = (u1.e) mVar;
                    eVar.D();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // k3.d
    public final void S(Typeface typeface, boolean z3) {
        switch (this.f57f) {
            case 0:
                if (!z3) {
                    n nVar = (n) this.g;
                    nVar.f60d = true;
                    m mVar = (m) nVar.f61e.get();
                    if (mVar != null) {
                        u1.e eVar = (u1.e) mVar;
                        eVar.D();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.g;
                u1.e eVar2 = chip.f1255j;
                chip.setText(eVar2.Q0 ? eVar2.S : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    private final void l0(int i4) {
    }
}
