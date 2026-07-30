package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000createpolar.PolarVoyageNotificationManagerOlympianPixel2030;
import p000createpolar.PolarVoyageRunnableEclipseMaster1683;
import p000createpolar.PolarVoyageZipMegaFusion8832;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(PolarVoyageZipMegaFusion8832 polarVoyageZipMegaFusion8832) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        PolarVoyageRunnableEclipseMaster1683 polarVoyageRunnableEclipseMaster1683 = remoteActionCompat.PolarVoyageZipVortexCelestial6185;
        boolean z = true;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(1)) {
            polarVoyageRunnableEclipseMaster1683 = polarVoyageZipMegaFusion8832.PolarVoyageTextInputEditTextNebulaHero6651();
        }
        remoteActionCompat.PolarVoyageZipVortexCelestial6185 = (IconCompat) polarVoyageRunnableEclipseMaster1683;
        CharSequence charSequence = remoteActionCompat.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705);
        }
        remoteActionCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705);
        }
        remoteActionCompat.PolarVoyageKotlinBetaPulseBeta3653 = charSequence2;
        remoteActionCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = (PendingIntent) polarVoyageZipMegaFusion8832.PolarVoyageDiffUtilTurboStrike5735(remoteActionCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767, 4);
        boolean z2 = remoteActionCompat.PolarVoyageBitmapVisionAuroraPixel4705;
        if (polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(5)) {
            z2 = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.readInt() != 0;
        }
        remoteActionCompat.PolarVoyageBitmapVisionAuroraPixel4705 = z2;
        boolean z3 = remoteActionCompat.PolarVoyageDiffUtilTurboStrike5735;
        if (!polarVoyageZipMegaFusion8832.PolarVoyageBitmapVisionAuroraPixel4705(6)) {
            z = z3;
        } else if (((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.PolarVoyageDiffUtilTurboStrike5735 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, PolarVoyageZipMegaFusion8832 polarVoyageZipMegaFusion8832) {
        polarVoyageZipMegaFusion8832.getClass();
        IconCompat iconCompat = remoteActionCompat.PolarVoyageZipVortexCelestial6185;
        polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(1);
        polarVoyageZipMegaFusion8832.PolarVoyageStrictModeLegendEpic1532(iconCompat);
        CharSequence charSequence = remoteActionCompat.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(2);
        Parcel parcel = ((PolarVoyageNotificationManagerOlympianPixel2030) polarVoyageZipMegaFusion8832).PolarVoyageBitmapVisionAuroraPixel4705;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.PolarVoyageKotlinBetaPulseBeta3653;
        polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.PolarVoyageBitmapVisionAuroraPixel4705;
        polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.PolarVoyageDiffUtilTurboStrike5735;
        polarVoyageZipMegaFusion8832.PolarVoyageItemDecorationUltraDeltaEpic7485(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
