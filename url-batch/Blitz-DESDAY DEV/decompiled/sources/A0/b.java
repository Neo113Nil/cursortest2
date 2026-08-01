package A0;

import F0.j;
import F0.k;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import z1.l;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6b;

    public /* synthetic */ b(int i, Object obj) {
        this.f5a = i;
        this.f6b = obj;
    }

    private final void y0(int i) {
    }

    @Override // z1.l
    public final void d0(int i) {
        switch (this.f5a) {
            case 0:
                break;
            default:
                k kVar = (k) this.f6b;
                kVar.d = true;
                j jVar = (j) kVar.f314e.get();
                if (jVar != null) {
                    f fVar = (f) jVar;
                    fVar.y();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // z1.l
    public final void e0(Typeface typeface, boolean z2) {
        switch (this.f5a) {
            case 0:
                Chip chip = (Chip) this.f6b;
                f fVar = chip.f1828e;
                chip.setText(fVar.f14C0 ? fVar.f17E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    k kVar = (k) this.f6b;
                    kVar.d = true;
                    j jVar = (j) kVar.f314e.get();
                    if (jVar != null) {
                        f fVar2 = (f) jVar;
                        fVar2.y();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
