package w1;

import com.google.android.material.button.MaterialButton;
import o2.z;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends r1.b {
    @Override // r1.b
    public final void B(z zVar, float f5) {
        ((MaterialButton) zVar).setDisplayedWidthIncrease(f5);
    }

    @Override // r1.b
    public final float m(z zVar) {
        float displayedWidthIncrease;
        displayedWidthIncrease = ((MaterialButton) zVar).getDisplayedWidthIncrease();
        return displayedWidthIncrease;
    }
}
