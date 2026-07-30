package p000createpolar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageProGuardPulseStrikeForce2310 {
    public static final Uri PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final boolean PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageProGuardPulseStrikeForce2310(String str, boolean z) {
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageNavigationViewHyperHyperHyperion1793(str);
        this.PolarVoyageZipVortexCelestial6185 = str;
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageNavigationViewHyperHyperHyperion1793("com.google.android.gms");
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = "com.google.android.gms";
        this.PolarVoyageKotlinBetaPulseBeta3653 = z;
    }

    public final Intent PolarVoyageZipVortexCelestial6185(Context context) {
        Bundle bundle;
        String str = this.PolarVoyageZipVortexCelestial6185;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.PolarVoyageKotlinBetaPulseBeta3653) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(PolarVoyageBarcodeScannerInfernoSolarSpark7767, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.PolarVoyageMotionLayoutTransitionHeroVision4068) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageProGuardPulseStrikeForce2310)) {
            return false;
        }
        PolarVoyageProGuardPulseStrikeForce2310 polarVoyageProGuardPulseStrikeForce2310 = (PolarVoyageProGuardPulseStrikeForce2310) obj;
        return PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageZipVortexCelestial6185, polarVoyageProGuardPulseStrikeForce2310.PolarVoyageZipVortexCelestial6185) && PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageProGuardPulseStrikeForce2310.PolarVoyageMotionLayoutTransitionHeroVision4068) && PolarVoyageTransformNeoTitanium1654.PolarVoyageDrawableDeltaHyperion5742(null, null) && this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageProGuardPulseStrikeForce2310.PolarVoyageKotlinBetaPulseBeta3653;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.PolarVoyageZipVortexCelestial6185, this.PolarVoyageMotionLayoutTransitionHeroVision4068, null, 4225, Boolean.valueOf(this.PolarVoyageKotlinBetaPulseBeta3653)});
    }

    public final String toString() {
        String str = this.PolarVoyageZipVortexCelestial6185;
        if (str != null) {
            return str;
        }
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(null);
        throw null;
    }
}
