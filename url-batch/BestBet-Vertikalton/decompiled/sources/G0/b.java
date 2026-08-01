package G0;

import L0.h;
import L0.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f294f;

    public /* synthetic */ b(int i, Object obj) {
        this.f293e = i;
        this.f294f = obj;
    }

    private final void y0(int i) {
    }

    @Override // H1.d
    public final void T(int i) {
        switch (this.f293e) {
            case 0:
                break;
            default:
                i iVar = (i) this.f294f;
                iVar.d = true;
                h hVar = (h) iVar.f773e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // H1.d
    public final void U(Typeface typeface, boolean z2) {
        switch (this.f293e) {
            case 0:
                Chip chip = (Chip) this.f294f;
                f fVar = chip.f2224e;
                chip.setText(fVar.f304C0 ? fVar.f307E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    i iVar = (i) this.f294f;
                    iVar.d = true;
                    h hVar = (h) iVar.f773e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
