package p000createpolar;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageDiffUtilSpeedStrikeEpic5842 {
    public final PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final LinkedHashMap PolarVoyageZipVortexCelestial6185;

    public PolarVoyageDiffUtilSpeedStrikeEpic5842(LinkedHashMap linkedHashMap, boolean z) {
        this.PolarVoyageZipVortexCelestial6185 = linkedHashMap;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageRealtimeDatabaseEclipseUltra8894(z);
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageViewModelPrimeRogue9804 polarVoyageViewModelPrimeRogue9804, Object obj) {
        polarVoyageViewModelPrimeRogue9804.getClass();
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        LinkedHashMap linkedHashMap = this.PolarVoyageZipVortexCelestial6185;
        if (obj == null) {
            PolarVoyageMotionLayoutTransitionHeroVision4068();
            linkedHashMap.remove(polarVoyageViewModelPrimeRogue9804);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageSharedFlowRogueDeltaForce1577((Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(polarVoyageViewModelPrimeRogue9804, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(polarVoyageViewModelPrimeRogue9804, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(polarVoyageViewModelPrimeRogue9804, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (((AtomicBoolean) this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageStrictModeLegendEpic1532).get()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Map PolarVoyageZipVortexCelestial6185() {
        PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980;
        Set<Map.Entry> entrySet = this.PolarVoyageZipVortexCelestial6185.entrySet();
        int PolarVoyageFCMCelestialCosmosPixel3711 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(entrySet, 10));
        if (PolarVoyageFCMCelestialCosmosPixel3711 < 16) {
            PolarVoyageFCMCelestialCosmosPixel3711 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(PolarVoyageFCMCelestialCosmosPixel3711);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                polarVoyageRippleDrawableRogueBlazeBlaze8980 = new PolarVoyageRippleDrawableRogueBlazeBlaze8980(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                polarVoyageRippleDrawableRogueBlazeBlaze8980 = new PolarVoyageRippleDrawableRogueBlazeBlaze8980(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageStrictModeLegendEpic1532);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof PolarVoyageDiffUtilSpeedStrikeEpic5842) {
            LinkedHashMap linkedHashMap = ((PolarVoyageDiffUtilSpeedStrikeEpic5842) obj).PolarVoyageZipVortexCelestial6185;
            LinkedHashMap linkedHashMap2 = this.PolarVoyageZipVortexCelestial6185;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.PolarVoyageZipVortexCelestial6185.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final String toString() {
        return PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyagePaintMaxNova4034(this.PolarVoyageZipVortexCelestial6185.entrySet(), ",\n", "{\n", "\n}", new PolarVoyageMergePhoenixGamma5628(13), 24);
    }

    public /* synthetic */ PolarVoyageDiffUtilSpeedStrikeEpic5842(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
