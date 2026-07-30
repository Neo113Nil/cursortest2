package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLiveDataFusionPixel3455 implements Comparator {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final PolarVoyageLiveDataFusionPixel3455 PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageLiveDataFusionPixel3455(0);
    public static final PolarVoyageLiveDataFusionPixel3455 PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageLiveDataFusionPixel3455(1);

    public /* synthetic */ PolarVoyageLiveDataFusionPixel3455(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
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
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return PolarVoyageRotateAnimationCyberCelestialDelta4768;
            default:
                return PolarVoyageStrictModeLegendEpic1532;
        }
    }
}
