package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageHandlerThreadForceNebula4932 extends PolarVoyageScaleGestureDetectorStormCosmos5916 {
    public final char PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageHandlerThreadForceNebula4932(char c) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = c;
    }

    @Override // p000createpolar.PolarVoyageScaleGestureDetectorStormCosmos5916
    public final boolean PolarVoyageZipVortexCelestial6185(char c) {
        return c == this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
