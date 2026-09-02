package v1;

import com.google.android.material.button.MaterialButton;
import l2.y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends t0.d {
    @Override // t0.d
    public final float h(y yVar) {
        float displayedWidthIncrease;
        displayedWidthIncrease = ((MaterialButton) yVar).getDisplayedWidthIncrease();
        return displayedWidthIncrease;
    }

    @Override // t0.d
    public final void t(y yVar, float f2) {
        ((MaterialButton) yVar).setDisplayedWidthIncrease(f2);
    }
}
