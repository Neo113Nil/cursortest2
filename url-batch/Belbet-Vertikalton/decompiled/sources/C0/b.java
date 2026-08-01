package C0;

import H0.j;
import H0.k;
import H1.l;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f72g;

    public /* synthetic */ b(int i, Object obj) {
        this.f71f = i;
        this.f72g = obj;
    }

    private final void k0(int i) {
    }

    @Override // H1.l
    public final void L(int i) {
        switch (this.f71f) {
            case 0:
                break;
            default:
                k kVar = (k) this.f72g;
                kVar.f535d = true;
                j jVar = (j) kVar.e.get();
                if (jVar != null) {
                    f fVar = (f) jVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // H1.l
    public final void M(Typeface typeface, boolean z2) {
        switch (this.f71f) {
            case 0:
                Chip chip = (Chip) this.f72g;
                f fVar = chip.e;
                chip.setText(fVar.f82C0 ? fVar.f84E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    k kVar = (k) this.f72g;
                    kVar.f535d = true;
                    j jVar = (j) kVar.e.get();
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
