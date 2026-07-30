package p000createpolar;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGestureDetectorEclipseDragon7494 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object PolarVoyageKotlinBetaPulseBeta3653;
    public final /* synthetic */ Intent PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageGestureDetectorEclipseDragon7494(Intent intent, Object obj, int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = intent;
        this.PolarVoyageKotlinBetaPulseBeta3653 = obj;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        Object obj = this.PolarVoyageKotlinBetaPulseBeta3653;
        Intent intent = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent != null) {
                    ((GoogleApiActivity) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                if (intent != null) {
                    ((PolarVoyageSharedElementHyperElite9184) obj).startActivityForResult(intent, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            PolarVoyageZipVortexCelestial6185();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
