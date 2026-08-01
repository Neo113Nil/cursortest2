package D0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class j extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171b;

    public /* synthetic */ j(int i, Object obj) {
        this.f170a = i;
        this.f171b = obj;
    }

    private final void v0(int i) {
    }

    @Override // z1.d
    public final void c0(int i) {
        switch (this.f170a) {
            case 0:
                l lVar = (l) this.f171b;
                lVar.d = true;
                k kVar = (k) lVar.f175e.get();
                if (kVar != null) {
                    y0.e eVar = (y0.e) kVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // z1.d
    public final void d0(Typeface typeface, boolean z2) {
        switch (this.f170a) {
            case 0:
                if (!z2) {
                    l lVar = (l) this.f171b;
                    lVar.d = true;
                    k kVar = (k) lVar.f175e.get();
                    if (kVar != null) {
                        y0.e eVar = (y0.e) kVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f171b;
                y0.e eVar2 = chip.f1775e;
                chip.setText(eVar2.f4173C0 ? eVar2.f4176E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
