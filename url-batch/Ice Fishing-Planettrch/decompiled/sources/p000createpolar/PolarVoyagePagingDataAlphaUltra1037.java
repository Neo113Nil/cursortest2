package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyagePagingDataAlphaUltra1037 implements Map, PolarVoyageZipDeltaSpectraRogue6055 {
    public static final PolarVoyagePagingDataAlphaUltra1037 PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyagePagingDataAlphaUltra1037(PolarVoyageTextRecognitionMasterPrime1651.PolarVoyageBitmapVisionAuroraPixel4705, 0);
    public final PolarVoyageTextRecognitionMasterPrime1651 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyagePagingDataAlphaUltra1037(PolarVoyageTextRecognitionMasterPrime1651 polarVoyageTextRecognitionMasterPrime1651, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageTextRecognitionMasterPrime1651;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    public final PolarVoyagePagingDataAlphaUltra1037 PolarVoyageZipVortexCelestial6185(Object obj, PolarVoyageOnDeviceTranslatorDragonQuantum5263 polarVoyageOnDeviceTranslatorDragonQuantum5263) {
        PolarVoyageViewModelQuantumDragonPhoenix2767 PolarVoyageDisplayMetricsVortexDragon9516 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageDisplayMetricsVortexDragon9516(obj != null ? obj.hashCode() : 0, 0, obj, polarVoyageOnDeviceTranslatorDragonQuantum5263);
        return PolarVoyageDisplayMetricsVortexDragon9516 == null ? this : new PolarVoyagePagingDataAlphaUltra1037((PolarVoyageTextRecognitionMasterPrime1651) PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageRotateAnimationCyberCelestialDelta4768, this.PolarVoyageStrictModeLegendEpic1532 + PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new PolarVoyageFaceDetectionForceRogue7799(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.PolarVoyageStrictModeLegendEpic1532 != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.PolarVoyageStrictModeLegendEpic1532 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new PolarVoyageFaceDetectionForceRogue7799(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    public final String toString() {
        return PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyagePaintMaxNova4034(entrySet(), ", ", "{", "}", new PolarVoyageCanvasCyberNovaElite7830(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new PolarVoyageApplicationInfoHyperionHyperion6216(1, this);
    }
}
