package p000createpolar;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFragmentLegendRogue2777 implements PolarVoyageRemoteConfigEliteSpectra7350 {
    public volatile Set PolarVoyageMotionLayoutTransitionHeroVision4068;
    public volatile Set PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // p000createpolar.PolarVoyageRemoteConfigEliteSpectra7350
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
            synchronized (this) {
                try {
                    if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.PolarVoyageZipVortexCelestial6185.iterator();
                            while (it.hasNext()) {
                                this.PolarVoyageMotionLayoutTransitionHeroVision4068.add(((PolarVoyageRemoteConfigEliteSpectra7350) it.next()).get());
                            }
                            this.PolarVoyageZipVortexCelestial6185 = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }
}
