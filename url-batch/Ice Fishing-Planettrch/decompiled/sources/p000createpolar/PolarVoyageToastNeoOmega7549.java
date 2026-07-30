package p000createpolar;

import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageToastNeoOmega7549 extends IOException {
    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageToastNeoOmega7549(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    public static PolarVoyageToastNeoOmega7549 PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        return new PolarVoyageToastNeoOmega7549(str, null, false, 1);
    }

    public static PolarVoyageToastNeoOmega7549 PolarVoyageZipVortexCelestial6185(RuntimeException runtimeException, String str) {
        return new PolarVoyageToastNeoOmega7549(str, runtimeException, true, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        sb.append(", dataType=");
        sb.append(this.PolarVoyageStrictModeLegendEpic1532);
        sb.append("}");
        return sb.toString();
    }
}
