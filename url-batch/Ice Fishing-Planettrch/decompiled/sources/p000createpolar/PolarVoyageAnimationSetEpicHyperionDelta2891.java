package p000createpolar;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageAnimationSetEpicHyperionDelta2891 extends PolarVoyageMotionEventNeoAuroraMax6943 implements IInterface {
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;

    public PolarVoyageAnimationSetEpicHyperionDelta2891(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length == 25) {
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = Arrays.hashCode(bArr);
        } else {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
            throw null;
        }
    }

    public static byte[] PolarVoyageBitmapVisionAuroraPixel4705(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000createpolar.PolarVoyageMotionEventNeoAuroraMax6943
    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
            return true;
        }
        PolarVoyageRemoteConfigAuroraSpeedQuantum8638 polarVoyageRemoteConfigAuroraSpeedQuantum8638 = new PolarVoyageRemoteConfigAuroraSpeedQuantum8638(PolarVoyageDiffUtilTurboStrike5735());
        parcel2.writeNoException();
        int i2 = PolarVoyageContentObserverAlphaPhantom8746.PolarVoyageZipVortexCelestial6185;
        parcel2.writeStrongBinder(polarVoyageRemoteConfigAuroraSpeedQuantum8638);
        return true;
    }

    public abstract byte[] PolarVoyageDiffUtilTurboStrike5735();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof PolarVoyageAnimationSetEpicHyperionDelta2891)) {
            try {
                PolarVoyageAnimationSetEpicHyperionDelta2891 polarVoyageAnimationSetEpicHyperionDelta2891 = (PolarVoyageAnimationSetEpicHyperionDelta2891) obj;
                if (polarVoyageAnimationSetEpicHyperionDelta2891.PolarVoyageMotionLayoutTransitionHeroVision4068 == this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                    return Arrays.equals(PolarVoyageDiffUtilTurboStrike5735(), (byte[]) new PolarVoyageRemoteConfigAuroraSpeedQuantum8638(polarVoyageAnimationSetEpicHyperionDelta2891.PolarVoyageDiffUtilTurboStrike5735()).PolarVoyageMotionLayoutTransitionHeroVision4068);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068;
    }
}
