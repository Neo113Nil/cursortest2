package B0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import w0.C0335e;

/* loaded from: classes.dex */
public final class k extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131b;

    public /* synthetic */ k(int i, Object obj) {
        this.f130a = i;
        this.f131b = obj;
    }

    private final void d0(int i) {
    }

    @Override // q1.l
    public final void G(int i) {
        switch (this.f130a) {
            case 0:
                m mVar = (m) this.f131b;
                mVar.d = true;
                l lVar = (l) mVar.f135e.get();
                if (lVar != null) {
                    C0335e c0335e = (C0335e) lVar;
                    c0335e.u();
                    c0335e.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // q1.l
    public final void H(Typeface typeface, boolean z2) {
        switch (this.f130a) {
            case 0:
                if (!z2) {
                    m mVar = (m) this.f131b;
                    mVar.d = true;
                    l lVar = (l) mVar.f135e.get();
                    if (lVar != null) {
                        C0335e c0335e = (C0335e) lVar;
                        c0335e.u();
                        c0335e.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f131b;
                C0335e c0335e2 = chip.f1622e;
                chip.setText(c0335e2.C0 ? c0335e2.f4106E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
