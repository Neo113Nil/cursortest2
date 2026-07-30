package p000createpolar;

import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageDragEventStrikeVortexLegend8366 {
    public static final void PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static String PolarVoyageZipVortexCelestial6185(List list, String str, PolarVoyageStateFlowNebulaMax1492 polarVoyageStateFlowNebulaMax1492, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            polarVoyageStateFlowNebulaMax1492 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (polarVoyageStateFlowNebulaMax1492 != null) {
                sb.append((CharSequence) polarVoyageStateFlowNebulaMax1492.PolarVoyageZipVortexCelestial6185(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
