package p000createpolar;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageObserverInfernoForce3944 {
    public static final String[] PolarVoyageKotlinBetaPulseBeta3653 = {"*", "FCM", "GCM", ""};
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final SharedPreferences PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageObserverInfernoForce3944(PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598) {
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185.getSharedPreferences("com.google.android.gms.appid", 0);
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        PolarVoyageCoordinatorLayoutOlympianVortex8571 polarVoyageCoordinatorLayoutOlympianVortex8571 = polarVoyageRewardedAdEliteNova2598.PolarVoyageKotlinBetaPulseBeta3653;
        String str = polarVoyageCoordinatorLayoutOlympianVortex8571.PolarVoyageBitmapVisionAuroraPixel4705;
        if (str == null) {
            polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
            str = polarVoyageCoordinatorLayoutOlympianVortex8571.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
    }

    public final String PolarVoyageZipVortexCelestial6185() {
        PublicKey publicKey;
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            String str = null;
            String string = this.PolarVoyageZipVortexCelestial6185.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
