package E0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class j extends A1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216b;

    public /* synthetic */ j(int i, Object obj) {
        this.f215a = i;
        this.f216b = obj;
    }

    private final void q0(int i) {
    }

    @Override // A1.m
    public final void O(int i) {
        switch (this.f215a) {
            case 0:
                l lVar = (l) this.f216b;
                lVar.d = true;
                k kVar = (k) lVar.f220e.get();
                if (kVar != null) {
                    z0.e eVar = (z0.e) kVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // A1.m
    public final void P(Typeface typeface, boolean z2) {
        switch (this.f215a) {
            case 0:
                if (!z2) {
                    l lVar = (l) this.f216b;
                    lVar.d = true;
                    k kVar = (k) lVar.f220e.get();
                    if (kVar != null) {
                        z0.e eVar = (z0.e) kVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f216b;
                z0.e eVar2 = chip.f1842e;
                chip.setText(eVar2.f4367C0 ? eVar2.f4370E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
