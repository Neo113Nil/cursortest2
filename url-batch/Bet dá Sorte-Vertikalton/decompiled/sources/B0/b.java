package B0;

import G0.j;
import G0.k;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import u1.l;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f78e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79f;

    public /* synthetic */ b(int i, Object obj) {
        this.f78e = i;
        this.f79f = obj;
    }

    private final void r0(int i) {
    }

    @Override // u1.l
    public final void W(int i) {
        switch (this.f78e) {
            case 0:
                break;
            default:
                k kVar = (k) this.f79f;
                kVar.d = true;
                j jVar = (j) kVar.f255e.get();
                if (jVar != null) {
                    f fVar = (f) jVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // u1.l
    public final void X(Typeface typeface, boolean z2) {
        switch (this.f78e) {
            case 0:
                Chip chip = (Chip) this.f79f;
                f fVar = chip.f1748e;
                chip.setText(fVar.C0 ? fVar.f91E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    k kVar = (k) this.f79f;
                    kVar.d = true;
                    j jVar = (j) kVar.f255e.get();
                    if (jVar != null) {
                        f fVar2 = (f) jVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
