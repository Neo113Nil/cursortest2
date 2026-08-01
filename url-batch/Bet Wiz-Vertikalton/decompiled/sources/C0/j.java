package C0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class j extends x1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f153f;

    public /* synthetic */ j(int i, Object obj) {
        this.f152e = i;
        this.f153f = obj;
    }

    private final void o0(int i) {
    }

    @Override // x1.d
    public final void O(int i) {
        switch (this.f152e) {
            case 0:
                l lVar = (l) this.f153f;
                lVar.d = true;
                k kVar = (k) lVar.f157e.get();
                if (kVar != null) {
                    x0.e eVar = (x0.e) kVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // x1.d
    public final void P(Typeface typeface, boolean z2) {
        switch (this.f152e) {
            case 0:
                if (!z2) {
                    l lVar = (l) this.f153f;
                    lVar.d = true;
                    k kVar = (k) lVar.f157e.get();
                    if (kVar != null) {
                        x0.e eVar = (x0.e) kVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f153f;
                x0.e eVar2 = chip.f1719e;
                chip.setText(eVar2.f4215C0 ? eVar2.f4217E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
