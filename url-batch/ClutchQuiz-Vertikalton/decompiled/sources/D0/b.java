package D0;

import I0.h;
import I0.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f140f;

    public /* synthetic */ b(int i, Object obj) {
        this.f139e = i;
        this.f140f = obj;
    }

    private final void M0(int i) {
    }

    @Override // A.c
    public final void m0(int i) {
        switch (this.f139e) {
            case 0:
                break;
            default:
                i iVar = (i) this.f140f;
                iVar.d = true;
                h hVar = (h) iVar.f341e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // A.c
    public final void n0(Typeface typeface, boolean z2) {
        switch (this.f139e) {
            case 0:
                Chip chip = (Chip) this.f140f;
                f fVar = chip.f1826e;
                chip.setText(fVar.f150C0 ? fVar.f153E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    i iVar = (i) this.f140f;
                    iVar.d = true;
                    h hVar = (h) iVar.f341e.get();
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
