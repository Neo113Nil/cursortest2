package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnClickListenerRogueBetaSpark3341 extends PolarVoyageAudioManagerTitaniumNovaAlpha1023 implements Serializable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final PolarVoyageOnClickListenerRogueBetaSpark3341 PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageOnClickListenerRogueBetaSpark3341(0);
    public static final PolarVoyageOnClickListenerRogueBetaSpark3341 PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageOnClickListenerRogueBetaSpark3341(1);

    public /* synthetic */ PolarVoyageOnClickListenerRogueBetaSpark3341(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }

    @Override // p000createpolar.PolarVoyageAudioManagerTitaniumNovaAlpha1023
    public final PolarVoyageAudioManagerTitaniumNovaAlpha1023 PolarVoyageZipVortexCelestial6185() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return PolarVoyageRotateAnimationCyberCelestialDelta4768;
            default:
                return PolarVoyageStrictModeLegendEpic1532;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
