package p000createpolar;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageObjectAnimatorLegendCosmos2129 extends AbstractMap {
    public static final /* synthetic */ int PolarVoyageCameraPixelBlaze2629 = 0;
    public volatile PolarVoyageAlarmManagerShadowNeoHero5011 PolarVoyageBottomSheetOmegaNeo1907;
    public List PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Map PolarVoyageStrictModeLegendEpic1532;
    public Map PolarVoyageViewRogueMaster4778;

    public static PolarVoyageObjectAnimatorLegendCosmos2129 PolarVoyageDiffUtilTurboStrike5735() {
        PolarVoyageObjectAnimatorLegendCosmos2129 polarVoyageObjectAnimatorLegendCosmos2129 = new PolarVoyageObjectAnimatorLegendCosmos2129();
        polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageItemDecorationUltraDeltaEpic7485 = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageStrictModeLegendEpic1532 = map;
        polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageViewRogueMaster4778 = map;
        return polarVoyageObjectAnimatorLegendCosmos2129;
    }

    public final Set PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return this.PolarVoyageStrictModeLegendEpic1532.isEmpty() ? Collections.EMPTY_SET : this.PolarVoyageStrictModeLegendEpic1532.entrySet();
    }

    public final SortedMap PolarVoyageBitmapVisionAuroraPixel4705() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        if (this.PolarVoyageStrictModeLegendEpic1532.isEmpty() && !(this.PolarVoyageStrictModeLegendEpic1532 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.PolarVoyageStrictModeLegendEpic1532 = treeMap;
            this.PolarVoyageViewRogueMaster4778 = treeMap.descendingMap();
        }
        return (SortedMap) this.PolarVoyageStrictModeLegendEpic1532;
    }

    public final Object PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        Object obj = ((PolarVoyageRoomDaoHyperAlpha4150) this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(i)).PolarVoyageStrictModeLegendEpic1532;
        if (!this.PolarVoyageStrictModeLegendEpic1532.isEmpty()) {
            Iterator it = PolarVoyageBitmapVisionAuroraPixel4705().entrySet().iterator();
            List list = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new PolarVoyageRoomDaoHyperAlpha4150(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Map.Entry PolarVoyageKotlinBetaPulseBeta3653(int i) {
        return (Map.Entry) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i);
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: PolarVoyageTextInputEditTextNebulaHero6651, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(comparable);
        if (PolarVoyageZipVortexCelestial6185 >= 0) {
            return ((PolarVoyageRoomDaoHyperAlpha4150) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(PolarVoyageZipVortexCelestial6185)).setValue(obj);
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.isEmpty() && !(this.PolarVoyageItemDecorationUltraDeltaEpic7485 instanceof ArrayList)) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new ArrayList(16);
        }
        int i = -(PolarVoyageZipVortexCelestial6185 + 1);
        if (i >= 16) {
            return PolarVoyageBitmapVisionAuroraPixel4705().put(comparable, obj);
        }
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485.size() == 16) {
            PolarVoyageRoomDaoHyperAlpha4150 polarVoyageRoomDaoHyperAlpha4150 = (PolarVoyageRoomDaoHyperAlpha4150) this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(15);
            PolarVoyageBitmapVisionAuroraPixel4705().put(polarVoyageRoomDaoHyperAlpha4150.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageRoomDaoHyperAlpha4150.PolarVoyageStrictModeLegendEpic1532);
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.add(i, new PolarVoyageRoomDaoHyperAlpha4150(this, comparable, obj));
        return null;
    }

    public final int PolarVoyageZipVortexCelestial6185(Comparable comparable) {
        int i;
        int size = this.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((PolarVoyageRoomDaoHyperAlpha4150) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i2)).PolarVoyageItemDecorationUltraDeltaEpic7485);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((PolarVoyageRoomDaoHyperAlpha4150) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i4)).PolarVoyageItemDecorationUltraDeltaEpic7485);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        if (!this.PolarVoyageItemDecorationUltraDeltaEpic7485.isEmpty()) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.clear();
        }
        if (this.PolarVoyageStrictModeLegendEpic1532.isEmpty()) {
            return;
        }
        this.PolarVoyageStrictModeLegendEpic1532.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return PolarVoyageZipVortexCelestial6185(comparable) >= 0 || this.PolarVoyageStrictModeLegendEpic1532.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.PolarVoyageBottomSheetOmegaNeo1907 == null) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageAlarmManagerShadowNeoHero5011(this, 1);
        }
        return this.PolarVoyageBottomSheetOmegaNeo1907;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageObjectAnimatorLegendCosmos2129)) {
            return super.equals(obj);
        }
        PolarVoyageObjectAnimatorLegendCosmos2129 polarVoyageObjectAnimatorLegendCosmos2129 = (PolarVoyageObjectAnimatorLegendCosmos2129) obj;
        int size = size();
        if (size == polarVoyageObjectAnimatorLegendCosmos2129.size()) {
            int size2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
            if (size2 != polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageItemDecorationUltraDeltaEpic7485.size()) {
                return ((AbstractSet) entrySet()).equals(polarVoyageObjectAnimatorLegendCosmos2129.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (PolarVoyageKotlinBetaPulseBeta3653(i).equals(polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageKotlinBetaPulseBeta3653(i))) {
                }
            }
            if (size2 != size) {
                return this.PolarVoyageStrictModeLegendEpic1532.equals(polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageStrictModeLegendEpic1532);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(comparable);
        return PolarVoyageZipVortexCelestial6185 >= 0 ? ((PolarVoyageRoomDaoHyperAlpha4150) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(PolarVoyageZipVortexCelestial6185)).PolarVoyageStrictModeLegendEpic1532 : this.PolarVoyageStrictModeLegendEpic1532.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((PolarVoyageRoomDaoHyperAlpha4150) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i2)).hashCode();
        }
        return this.PolarVoyageStrictModeLegendEpic1532.size() > 0 ? this.PolarVoyageStrictModeLegendEpic1532.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        Comparable comparable = (Comparable) obj;
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(comparable);
        if (PolarVoyageZipVortexCelestial6185 >= 0) {
            return PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageZipVortexCelestial6185);
        }
        if (this.PolarVoyageStrictModeLegendEpic1532.isEmpty()) {
            return null;
        }
        return this.PolarVoyageStrictModeLegendEpic1532.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.PolarVoyageStrictModeLegendEpic1532.size() + this.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
    }
}
