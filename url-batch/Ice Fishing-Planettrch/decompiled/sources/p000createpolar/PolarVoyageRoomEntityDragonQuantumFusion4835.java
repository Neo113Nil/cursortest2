package p000createpolar;

import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRoomEntityDragonQuantumFusion4835 implements Iterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public final String PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public int PolarVoyageViewRogueMaster4778;

    public PolarVoyageRoomEntityDragonQuantumFusion4835(String str) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.PolarVoyageViewRogueMaster4778 < 0) {
            this.PolarVoyageStrictModeLegendEpic1532 = 2;
            return false;
        }
        String str = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.PolarVoyageStrictModeLegendEpic1532 = 1;
                this.PolarVoyageViewRogueMaster4778 = i;
                this.PolarVoyageBottomSheetOmegaNeo1907 = length;
                return true;
            }
        }
        i = -1;
        this.PolarVoyageStrictModeLegendEpic1532 = 1;
        this.PolarVoyageViewRogueMaster4778 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = 0;
        int i = this.PolarVoyageBottomSheetOmegaNeo1907;
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = this.PolarVoyageViewRogueMaster4778 + i;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
