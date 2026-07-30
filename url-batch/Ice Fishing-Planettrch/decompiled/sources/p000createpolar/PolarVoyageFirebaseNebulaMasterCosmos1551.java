package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFirebaseNebulaMasterCosmos1551 implements PolarVoyageSensorManagerThunderPulseNebula9092, Set, PolarVoyageZipDeltaSpectraRogue6055 {
    public final PolarVoyageResourcesBetaPhoenix8681 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageResourcesBetaPhoenix8681 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageFirebaseNebulaMasterCosmos1551(PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageResourcesBetaPhoenix8681;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageResourcesBetaPhoenix8681;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681 = this.PolarVoyageStrictModeLegendEpic1532;
        int i = polarVoyageResourcesBetaPhoenix8681.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            polarVoyageResourcesBetaPhoenix8681.PolarVoyageRotateAnimationCyberCelestialDelta4768(it.next());
        }
        return i != polarVoyageResourcesBetaPhoenix8681.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PolarVoyageFirebaseNebulaMasterCosmos1551.class != obj.getClass()) {
            return false;
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.equals(((PolarVoyageFirebaseNebulaMasterCosmos1551) obj).PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageTextInputEditTextNebulaHero6651();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PolarVoyageToolbarFusionVision5119(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageBottomSheetOmegaNeo1907(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681 = this.PolarVoyageStrictModeLegendEpic1532;
        int i3 = polarVoyageResourcesBetaPhoenix8681.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Iterator it = collection.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = polarVoyageResourcesBetaPhoenix8681.PolarVoyageKotlinBetaPulseBeta3653;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = polarVoyageResourcesBetaPhoenix8681.PolarVoyageZipVortexCelestial6185;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageResourcesBetaPhoenix8681.PolarVoyageMotionLayoutTransitionHeroVision4068[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                polarVoyageResourcesBetaPhoenix8681.PolarVoyageViewRogueMaster4778(i2);
            }
        }
        return i3 != polarVoyageResourcesBetaPhoenix8681.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681 = this.PolarVoyageStrictModeLegendEpic1532;
        Object[] objArr = polarVoyageResourcesBetaPhoenix8681.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i = polarVoyageResourcesBetaPhoenix8681.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        long[] jArr = polarVoyageResourcesBetaPhoenix8681.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageFlowOnBetaCyber2473(collection, objArr[i5])) {
                                polarVoyageResourcesBetaPhoenix8681.PolarVoyageViewRogueMaster4778(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != polarVoyageResourcesBetaPhoenix8681.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageThreadPhoenixVisionSolar1313(this, objArr);
    }

    public final String toString() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageWithContextPulseSolarHyperion4393(this);
    }
}
