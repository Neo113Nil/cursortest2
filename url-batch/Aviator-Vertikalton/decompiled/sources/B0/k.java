package B0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import w0.C0360e;

/* loaded from: classes.dex */
public final class k extends q1.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f140g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k(int i, Object obj) {
        this.f140g = i;
        this.h = obj;
    }

    private final void u0(int i) {
    }

    @Override // q1.l
    public final void R(int i) {
        switch (this.f140g) {
            case 0:
                m mVar = (m) this.h;
                mVar.f144d = true;
                l lVar = (l) mVar.f145e.get();
                if (lVar != null) {
                    C0360e c0360e = (C0360e) lVar;
                    c0360e.u();
                    c0360e.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // q1.l
    public final void S(Typeface typeface, boolean z2) {
        switch (this.f140g) {
            case 0:
                if (!z2) {
                    m mVar = (m) this.h;
                    mVar.f144d = true;
                    l lVar = (l) mVar.f145e.get();
                    if (lVar != null) {
                        C0360e c0360e = (C0360e) lVar;
                        c0360e.u();
                        c0360e.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.h;
                C0360e c0360e2 = chip.f1836e;
                chip.setText(c0360e2.C0 ? c0360e2.f4539E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
