package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageIntentServiceOmegaTitanium5259 implements List, PolarVoyageGraphQuantumMasterOmega4348 {
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageOrientationSensorEpicHeroNova6354 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageIntentServiceOmegaTitanium5259(PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354, int i, int i2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageOrientationSensorEpicHeroNova6354;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(polarVoyageOrientationSensorEpicHeroNova6354);
        this.PolarVoyageBottomSheetOmegaNeo1907 = i2 - i;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(this.PolarVoyageItemDecorationUltraDeltaEpic7485) == this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        PolarVoyageZipVortexCelestial6185();
        int i = this.PolarVoyageStrictModeLegendEpic1532 + this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageOrientationSensorEpicHeroNova6354.add(i, obj);
        this.PolarVoyageBottomSheetOmegaNeo1907++;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(polarVoyageOrientationSensorEpicHeroNova6354);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        PolarVoyageZipVortexCelestial6185();
        int i2 = i + this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        boolean addAll = polarVoyageOrientationSensorEpicHeroNova6354.addAll(i2, collection);
        if (addAll) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = collection.size() + this.PolarVoyageBottomSheetOmegaNeo1907;
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(polarVoyageOrientationSensorEpicHeroNova6354);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.PolarVoyageBottomSheetOmegaNeo1907 > 0) {
            PolarVoyageZipVortexCelestial6185();
            int i = this.PolarVoyageBottomSheetOmegaNeo1907;
            int i2 = this.PolarVoyageStrictModeLegendEpic1532;
            PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageOrientationSensorEpicHeroNova6354.PolarVoyageBitmapVisionAuroraPixel4705(i2, i + i2);
            this.PolarVoyageBottomSheetOmegaNeo1907 = 0;
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(polarVoyageOrientationSensorEpicHeroNova6354);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        PolarVoyageZipVortexCelestial6185();
        PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBitmapVisionAuroraPixel4705(i, this.PolarVoyageBottomSheetOmegaNeo1907);
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(this.PolarVoyageStrictModeLegendEpic1532 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        PolarVoyageZipVortexCelestial6185();
        int i = this.PolarVoyageBottomSheetOmegaNeo1907;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        Iterator it = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(i2, i + i2).iterator();
        while (((PolarVoyageMeteringPointDeltaElite5941) it).PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            int nextInt = ((PolarVoyageConstraintLayoutThunderInfernoForce3907) it).nextInt();
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.PolarVoyageBottomSheetOmegaNeo1907 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        PolarVoyageZipVortexCelestial6185();
        int i = this.PolarVoyageBottomSheetOmegaNeo1907;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        PolarVoyageZipVortexCelestial6185();
        PolarVoyageAlertDialogEliteQuantumSpark1292 polarVoyageAlertDialogEliteQuantumSpark1292 = new PolarVoyageAlertDialogEliteQuantumSpark1292();
        polarVoyageAlertDialogEliteQuantumSpark1292.PolarVoyageItemDecorationUltraDeltaEpic7485 = i - 1;
        return new PolarVoyageHandlerThreadNebulaRogueVision6112(polarVoyageAlertDialogEliteQuantumSpark1292, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        PolarVoyageZipVortexCelestial6185();
        int i2 = this.PolarVoyageStrictModeLegendEpic1532 + i;
        PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object remove = polarVoyageOrientationSensorEpicHeroNova6354.remove(i2);
        this.PolarVoyageBottomSheetOmegaNeo1907--;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(polarVoyageOrientationSensorEpicHeroNova6354);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        PolarVoyageInputFilterLegendMaster1587 polarVoyageInputFilterLegendMaster1587;
        PolarVoyageDiffUtilGammaForce7187 PolarVoyageBottomSheetOmegaNeo1907;
        boolean PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageZipVortexCelestial6185();
        PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        int i3 = this.PolarVoyageBottomSheetOmegaNeo1907 + i2;
        int size = polarVoyageOrientationSensorEpicHeroNova6354.size();
        do {
            synchronized (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend8594 = polarVoyageOrientationSensorEpicHeroNova6354.PolarVoyageItemDecorationUltraDeltaEpic7485;
                polarVoyageObserverSolarOmegaLegend8594.getClass();
                PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend85942 = (PolarVoyageObserverSolarOmegaLegend8594) PolarVoyageLaunchOmegaDragon4995.PolarVoyageStrictModeLegendEpic1532(polarVoyageObserverSolarOmegaLegend8594);
                i = polarVoyageObserverSolarOmegaLegend85942.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                polarVoyageInputFilterLegendMaster1587 = polarVoyageObserverSolarOmegaLegend85942.PolarVoyageKotlinBetaPulseBeta3653;
            }
            polarVoyageInputFilterLegendMaster1587.getClass();
            PolarVoyageScaleDrawableEclipseQuantumCosmos2012 PolarVoyageDiffUtilTurboStrike5735 = polarVoyageInputFilterLegendMaster1587.PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageDiffUtilTurboStrike5735.subList(i2, i3).retainAll(collection);
            PolarVoyageInputFilterLegendMaster1587 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageDiffUtilTurboStrike5735.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageInputFilterLegendMaster1587)) {
                break;
            }
            PolarVoyageObserverSolarOmegaLegend8594 polarVoyageObserverSolarOmegaLegend85943 = polarVoyageOrientationSensorEpicHeroNova6354.PolarVoyageItemDecorationUltraDeltaEpic7485;
            polarVoyageObserverSolarOmegaLegend85943.getClass();
            synchronized (PolarVoyageLaunchOmegaDragon4995.PolarVoyageKotlinBetaPulseBeta3653) {
                PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageLaunchOmegaDragon4995.PolarVoyageBottomSheetOmegaNeo1907();
                PolarVoyageStrictModeLegendEpic1532 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageStrictModeLegendEpic1532((PolarVoyageObserverSolarOmegaLegend8594) PolarVoyageLaunchOmegaDragon4995.PolarVoyageMotionLayoutForceEpicAurora7183(polarVoyageObserverSolarOmegaLegend85943, polarVoyageOrientationSensorEpicHeroNova6354, PolarVoyageBottomSheetOmegaNeo1907), i, PolarVoyageBarcodeScannerInfernoSolarSpark7767, true);
            }
            PolarVoyageLaunchOmegaDragon4995.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageBottomSheetOmegaNeo1907, polarVoyageOrientationSensorEpicHeroNova6354);
        } while (!PolarVoyageStrictModeLegendEpic1532);
        int size2 = size - polarVoyageOrientationSensorEpicHeroNova6354.size();
        if (size2 > 0) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            this.PolarVoyageBottomSheetOmegaNeo1907 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBitmapVisionAuroraPixel4705(i, this.PolarVoyageBottomSheetOmegaNeo1907);
        PolarVoyageZipVortexCelestial6185();
        int i2 = i + this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj2 = polarVoyageOrientationSensorEpicHeroNova6354.set(i2, obj);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(polarVoyageOrientationSensorEpicHeroNova6354);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.PolarVoyageBottomSheetOmegaNeo1907;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.PolarVoyageBottomSheetOmegaNeo1907) {
            PolarVoyageMaterialButtonNovaPhoenix3934.PolarVoyageZipVortexCelestial6185("fromIndex or toIndex are out of bounds");
        }
        PolarVoyageZipVortexCelestial6185();
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        return new PolarVoyageIntentServiceOmegaTitanium5259(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageWithContextPulseSolarHyperion4393(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageThreadPhoenixVisionSolar1313(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        PolarVoyageZipVortexCelestial6185();
        int i2 = this.PolarVoyageStrictModeLegendEpic1532 + i;
        PolarVoyageOrientationSensorEpicHeroNova6354 polarVoyageOrientationSensorEpicHeroNova6354 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageOrientationSensorEpicHeroNova6354.add(i2, obj);
        this.PolarVoyageBottomSheetOmegaNeo1907++;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewBindingPulseHeroSpeed5705(polarVoyageOrientationSensorEpicHeroNova6354);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.PolarVoyageBottomSheetOmegaNeo1907, collection);
    }
}
