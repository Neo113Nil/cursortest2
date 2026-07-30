package p000createpolar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageContentObserverThunderOmega9101 extends PolarVoyageLevelListDrawablePhoenixMegaNebula9939 implements Map {
    public PolarVoyageAlarmManagerShadowNeoHero5011 PolarVoyageBottomSheetOmegaNeo1907;
    public PolarVoyageResourceOlympianEpic5744 PolarVoyageCameraPixelBlaze2629;
    public PolarVoyageFlowCollectorMegaCosmosAurora7549 PolarVoyageViewRogueMaster4778;

    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768(Collection collection) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final boolean PolarVoyageStrictModeLegendEpic1532(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        PolarVoyageAlarmManagerShadowNeoHero5011 polarVoyageAlarmManagerShadowNeoHero5011 = this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageAlarmManagerShadowNeoHero5011 != null) {
            return polarVoyageAlarmManagerShadowNeoHero5011;
        }
        PolarVoyageAlarmManagerShadowNeoHero5011 polarVoyageAlarmManagerShadowNeoHero50112 = new PolarVoyageAlarmManagerShadowNeoHero5011(this, 0);
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAlarmManagerShadowNeoHero50112;
        return polarVoyageAlarmManagerShadowNeoHero50112;
    }

    @Override // java.util.Map
    public final Set keySet() {
        PolarVoyageFlowCollectorMegaCosmosAurora7549 polarVoyageFlowCollectorMegaCosmosAurora7549 = this.PolarVoyageViewRogueMaster4778;
        if (polarVoyageFlowCollectorMegaCosmosAurora7549 != null) {
            return polarVoyageFlowCollectorMegaCosmosAurora7549;
        }
        PolarVoyageFlowCollectorMegaCosmosAurora7549 polarVoyageFlowCollectorMegaCosmosAurora75492 = new PolarVoyageFlowCollectorMegaCosmosAurora7549(this);
        this.PolarVoyageViewRogueMaster4778 = polarVoyageFlowCollectorMegaCosmosAurora75492;
        return polarVoyageFlowCollectorMegaCosmosAurora75492;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (iArr.length < size) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Arrays.copyOf(iArr, size);
            this.PolarVoyageStrictModeLegendEpic1532 = Arrays.copyOf(this.PolarVoyageStrictModeLegendEpic1532, size * 2);
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != i) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        PolarVoyageResourceOlympianEpic5744 polarVoyageResourceOlympianEpic5744 = this.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyageResourceOlympianEpic5744 != null) {
            return polarVoyageResourceOlympianEpic5744;
        }
        PolarVoyageResourceOlympianEpic5744 polarVoyageResourceOlympianEpic57442 = new PolarVoyageResourceOlympianEpic5744(this);
        this.PolarVoyageCameraPixelBlaze2629 = polarVoyageResourceOlympianEpic57442;
        return polarVoyageResourceOlympianEpic57442;
    }
}
