package B0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import w0.C0362e;

/* loaded from: classes.dex */
public final class k extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f139g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k(int i, Object obj) {
        this.f139g = i;
        this.h = obj;
    }

    private final void u0(int i) {
    }

    @Override // q1.l
    public final void R(int i) {
        switch (this.f139g) {
            case 0:
                m mVar = (m) this.h;
                mVar.f143d = true;
                l lVar = (l) mVar.f144e.get();
                if (lVar != null) {
                    C0362e c0362e = (C0362e) lVar;
                    c0362e.u();
                    c0362e.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // q1.l
    public final void S(Typeface typeface, boolean z2) {
        switch (this.f139g) {
            case 0:
                if (!z2) {
                    m mVar = (m) this.h;
                    mVar.f143d = true;
                    l lVar = (l) mVar.f144e.get();
                    if (lVar != null) {
                        C0362e c0362e = (C0362e) lVar;
                        c0362e.u();
                        c0362e.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.h;
                C0362e c0362e2 = chip.f1814e;
                chip.setText(c0362e2.C0 ? c0362e2.f4543E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
