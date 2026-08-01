package C0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class j extends u1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f152f;

    public /* synthetic */ j(int i, Object obj) {
        this.f151e = i;
        this.f152f = obj;
    }

    private final void j0(int i) {
    }

    @Override // u1.l
    public final void M(int i) {
        switch (this.f151e) {
            case 0:
                l lVar = (l) this.f152f;
                lVar.d = true;
                k kVar = (k) lVar.f156e.get();
                if (kVar != null) {
                    x0.e eVar = (x0.e) kVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // u1.l
    public final void N(Typeface typeface, boolean z2) {
        switch (this.f151e) {
            case 0:
                if (!z2) {
                    l lVar = (l) this.f152f;
                    lVar.d = true;
                    k kVar = (k) lVar.f156e.get();
                    if (kVar != null) {
                        x0.e eVar = (x0.e) kVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f152f;
                x0.e eVar2 = chip.f1682e;
                chip.setText(eVar2.f4180C0 ? eVar2.f4182E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
