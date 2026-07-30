package p000createpolar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageInsetDrawableEclipseOlympian5852 {
    public final PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageInsetDrawableEclipseOlympian5852(Set set, PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894) {
        this.PolarVoyageZipVortexCelestial6185 = PolarVoyageMotionLayoutTransitionHeroVision4068(set);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageRealtimeDatabaseEclipseUltra8894;
    }

    public static String PolarVoyageMotionLayoutTransitionHeroVision4068(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PolarVoyageFirebaseHeroHero8936 polarVoyageFirebaseHeroHero8936 = (PolarVoyageFirebaseHeroHero8936) it.next();
            sb.append(polarVoyageFirebaseHeroHero8936.PolarVoyageZipVortexCelestial6185);
            sb.append('/');
            sb.append(polarVoyageFirebaseHeroHero8936.PolarVoyageMotionLayoutTransitionHeroVision4068);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String PolarVoyageZipVortexCelestial6185() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        synchronized (((HashSet) polarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageStrictModeLegendEpic1532)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) polarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageStrictModeLegendEpic1532);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.PolarVoyageZipVortexCelestial6185;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) polarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageStrictModeLegendEpic1532)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) polarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageStrictModeLegendEpic1532);
        }
        sb.append(PolarVoyageMotionLayoutTransitionHeroVision4068(unmodifiableSet2));
        return sb.toString();
    }
}
