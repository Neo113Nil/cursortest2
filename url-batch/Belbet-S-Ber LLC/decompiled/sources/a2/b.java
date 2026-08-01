package a2;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import i2.l;
import i2.m;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f106o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f107p;

    public /* synthetic */ b(int i, Object obj) {
        this.f106o = i;
        this.f107p = obj;
    }

    @Override // b4.d
    public final void H(int i) {
        switch (this.f106o) {
            case 0:
                break;
            default:
                m mVar = (m) this.f107p;
                mVar.d = true;
                l lVar = (l) mVar.f2060e.get();
                if (lVar != null) {
                    f fVar = (f) lVar;
                    fVar.G();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // b4.d
    public final void I(Typeface typeface, boolean z4) {
        switch (this.f106o) {
            case 0:
                Chip chip = (Chip) this.f107p;
                f fVar = chip.f1000j;
                chip.setText(fVar.Q0 ? fVar.S : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z4) {
                    m mVar = (m) this.f107p;
                    mVar.d = true;
                    l lVar = (l) mVar.f2060e.get();
                    if (lVar != null) {
                        f fVar2 = (f) lVar;
                        fVar2.G();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }

    private final void Z(int i) {
    }
}
