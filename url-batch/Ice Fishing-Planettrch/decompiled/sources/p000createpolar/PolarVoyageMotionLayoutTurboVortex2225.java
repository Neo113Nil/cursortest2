package p000createpolar;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageMotionLayoutTurboVortex2225 extends PolarVoyagePagingSourceFusionPhoenixThunder6968 {
    public final int PolarVoyageStrictModeLegendEpic1532;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageMotionLayoutTurboVortex2225(IOException iOException, int i, int i2) {
        super(iOException, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
    }

    public static PolarVoyageMotionLayoutTurboVortex2225 PolarVoyageZipVortexCelestial6185(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? ErrorCodes.PROTOCOL_EXCEPTION : (message == null || !PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageFlingGestureEclipsePrimeMax1376(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new PolarVoyageAnimatorSetMegaNovaXInferno7666("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new PolarVoyageMotionLayoutTurboVortex2225(iOException, i2, i);
    }

    public PolarVoyageMotionLayoutTurboVortex2225() {
        super(2008);
        this.PolarVoyageStrictModeLegendEpic1532 = 1;
    }

    public PolarVoyageMotionLayoutTurboVortex2225(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.PolarVoyageStrictModeLegendEpic1532 = 1;
    }
}
