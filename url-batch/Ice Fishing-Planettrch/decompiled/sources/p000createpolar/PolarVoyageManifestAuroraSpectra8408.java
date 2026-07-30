package p000createpolar;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageManifestAuroraSpectra8408 implements Map.Entry, PolarVoyageZipDeltaSpectraRogue6055 {
    public final PolarVoyageStateListAnimatorOmegaUltra5173 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageManifestAuroraSpectra8408(PolarVoyageStateListAnimatorOmegaUltra5173 polarVoyageStateListAnimatorOmegaUltra5173, int i) {
        polarVoyageStateListAnimatorOmegaUltra5173.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageStateListAnimatorOmegaUltra5173;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageSnackbarGammaEclipse2140;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageSnackbarGammaEclipse2140 != this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(entry.getKey(), getKey()) && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        PolarVoyageZipVortexCelestial6185();
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageItemDecorationUltraDeltaEpic7485[this.PolarVoyageStrictModeLegendEpic1532];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        PolarVoyageZipVortexCelestial6185();
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageStrictModeLegendEpic1532;
        objArr.getClass();
        return objArr[this.PolarVoyageStrictModeLegendEpic1532];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        PolarVoyageZipVortexCelestial6185();
        PolarVoyageStateListAnimatorOmegaUltra5173 polarVoyageStateListAnimatorOmegaUltra5173 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageMotionLayoutTransitionHeroVision4068();
        Object[] objArr = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageStrictModeLegendEpic1532;
        if (objArr == null) {
            int length = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageItemDecorationUltraDeltaEpic7485.length;
            if (length < 0) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageStrictModeLegendEpic1532 = objArr;
        }
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
