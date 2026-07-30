package p000createpolar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageScaleGestureDetectorCyberInferno9403 extends PolarVoyageInputFilterLegendMaster1587 {
    public static final PolarVoyageScaleGestureDetectorCyberInferno9403 PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageScaleGestureDetectorCyberInferno9403(new Object[0]);
    public final Object[] PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageScaleGestureDetectorCyberInferno9403(Object[] objArr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = objArr;
    }

    @Override // p000createpolar.PolarVoyageInputFilterLegendMaster1587
    public final PolarVoyageInputFilterLegendMaster1587 PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new PolarVoyageScaleGestureDetectorCyberInferno9403(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new PolarVoyageLayerForceMaster8943(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // p000createpolar.PolarVoyageInputFilterLegendMaster1587
    public final PolarVoyageInputFilterLegendMaster1587 PolarVoyageBitmapVisionAuroraPixel4705(Collection collection) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (collection.size() + objArr.length > 32) {
            PolarVoyageScaleDrawableEclipseQuantumCosmos2012 PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735();
            PolarVoyageDiffUtilTurboStrike5735.addAll(collection);
            return PolarVoyageDiffUtilTurboStrike5735.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new PolarVoyageScaleGestureDetectorCyberInferno9403(copyOf);
    }

    @Override // p000createpolar.PolarVoyageInputFilterLegendMaster1587
    public final PolarVoyageScaleDrawableEclipseQuantumCosmos2012 PolarVoyageDiffUtilTurboStrike5735() {
        return new PolarVoyageScaleDrawableEclipseQuantumCosmos2012(this, null, this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0);
    }

    @Override // p000createpolar.PolarVoyageInputFilterLegendMaster1587
    public final PolarVoyageInputFilterLegendMaster1587 PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLayerDrawableShadowTitaniumOmega1942(i, objArr.length);
        if (objArr.length == 1) {
            return PolarVoyageStrictModeLegendEpic1532;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i, i + 1, objArr.length, objArr, copyOf);
        return new PolarVoyageScaleGestureDetectorCyberInferno9403(copyOf);
    }

    @Override // p000createpolar.PolarVoyageInputFilterLegendMaster1587
    public final PolarVoyageInputFilterLegendMaster1587 PolarVoyageMotionLayoutTransitionHeroVision4068(int i, Object obj) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyagePackageManagerCelestialPhoenix8393(i, objArr.length);
        if (i == objArr.length) {
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCardViewSpectraTurbo5149(0, i, 6, objArr, objArr2);
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new PolarVoyageScaleGestureDetectorCyberInferno9403(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new PolarVoyageLayerForceMaster8943(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p000createpolar.PolarVoyageInputFilterLegendMaster1587
    public final PolarVoyageInputFilterLegendMaster1587 PolarVoyageStrictModeLegendEpic1532(int i, Object obj) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLayerDrawableShadowTitaniumOmega1942(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new PolarVoyageScaleGestureDetectorCyberInferno9403(copyOf);
    }

    @Override // p000createpolar.PolarVoyageInputFilterLegendMaster1587
    public final PolarVoyageInputFilterLegendMaster1587 PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageRippleDrawableMasterCelestialRogue9242 polarVoyageRippleDrawableMasterCelestialRogue9242) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) polarVoyageRippleDrawableMasterCelestialRogue9242.PolarVoyageZipVortexCelestial6185(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? PolarVoyageStrictModeLegendEpic1532 : new PolarVoyageScaleGestureDetectorCyberInferno9403(PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageViewPagerPhantomHyperionNova3183(objArr2, 0, length));
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416
    public final int PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLayerDrawableShadowTitaniumOmega1942(i, objArr.length);
        return objArr[i];
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final int indexOf(Object obj) {
        return PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageHandlerFusionOlympian7396(this.PolarVoyageItemDecorationUltraDeltaEpic7485, obj);
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyagePackageManagerCelestialPhoenix8393(i, objArr.length);
        return new PolarVoyageRippleDrawableSpectraSpectraInferno8450(objArr, i, objArr.length);
    }
}
