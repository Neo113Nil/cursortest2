package e2;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends h.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1224k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1225l;

    public /* synthetic */ i(int i, Object obj) {
        this.f1224k = i;
        this.f1225l = obj;
    }

    @Override // h.a
    public final void U(int i) {
        switch (this.f1224k) {
            case 0:
                k kVar = (k) this.f1225l;
                kVar.f1229e = true;
                j jVar = (j) kVar.f1230f.get();
                if (jVar != null) {
                    jVar.a();
                    break;
                }
                break;
        }
    }

    @Override // h.a
    public final void V(Typeface typeface, boolean z3) {
        switch (this.f1224k) {
            case 0:
                if (!z3) {
                    k kVar = (k) this.f1225l;
                    kVar.f1229e = true;
                    j jVar = (j) kVar.f1230f.get();
                    if (jVar != null) {
                        jVar.a();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f1225l;
                z1.e eVar = chip.f882j;
                chip.setText(eVar.Q0 ? eVar.S : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    private final void t0(int i) {
    }
}
