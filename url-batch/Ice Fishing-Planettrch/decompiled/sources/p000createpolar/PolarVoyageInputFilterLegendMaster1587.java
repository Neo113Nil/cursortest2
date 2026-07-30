package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageInputFilterLegendMaster1587 extends PolarVoyageGeocoderMasterHyperHyperion4028 {
    public abstract PolarVoyageInputFilterLegendMaster1587 PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj);

    public PolarVoyageInputFilterLegendMaster1587 PolarVoyageBitmapVisionAuroraPixel4705(Collection collection) {
        PolarVoyageScaleDrawableEclipseQuantumCosmos2012 PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735();
        PolarVoyageDiffUtilTurboStrike5735.addAll(collection);
        return PolarVoyageDiffUtilTurboStrike5735.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
    }

    public abstract PolarVoyageScaleDrawableEclipseQuantumCosmos2012 PolarVoyageDiffUtilTurboStrike5735();

    public abstract PolarVoyageInputFilterLegendMaster1587 PolarVoyageItemDecorationUltraDeltaEpic7485(int i);

    public abstract PolarVoyageInputFilterLegendMaster1587 PolarVoyageMotionLayoutTransitionHeroVision4068(int i, Object obj);

    public abstract PolarVoyageInputFilterLegendMaster1587 PolarVoyageStrictModeLegendEpic1532(int i, Object obj);

    public abstract PolarVoyageInputFilterLegendMaster1587 PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageRippleDrawableMasterCelestialRogue9242 polarVoyageRippleDrawableMasterCelestialRogue9242);

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416, java.util.Collection, java.util.List
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

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public final List subList(int i, int i2) {
        return new PolarVoyageAudioManagerPhantomTurbo8293(this, i, i2);
    }
}
