package p000createpolar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePaintFlagsDrawFilterThunderVortex4639 {
    public Serializable PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public Serializable PolarVoyageBitmapVisionAuroraPixel4705;
    public Object PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageZipVortexCelestial6185;

    public static String PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598) {
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        PolarVoyageCoordinatorLayoutOlympianVortex8571 polarVoyageCoordinatorLayoutOlympianVortex8571 = polarVoyageRewardedAdEliteNova2598.PolarVoyageKotlinBetaPulseBeta3653;
        String str = polarVoyageCoordinatorLayoutOlympianVortex8571.PolarVoyageBitmapVisionAuroraPixel4705;
        if (str != null) {
            return str;
        }
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        String str2 = polarVoyageCoordinatorLayoutOlympianVortex8571.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public PackageInfo PolarVoyageBarcodeScannerInfernoSolarSpark7767(String str) {
        try {
            return ((Context) this.PolarVoyageKotlinBetaPulseBeta3653).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public boolean PolarVoyageBitmapVisionAuroraPixel4705() {
        int i;
        synchronized (this) {
            i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.PolarVoyageKotlinBetaPulseBeta3653).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803()) {
                            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 2;
                        } else {
                            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 1;
                        }
                        i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    } else {
                        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public synchronized void PolarVoyageDiffUtilTurboStrike5735() {
        PackageInfo PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBarcodeScannerInfernoSolarSpark7767(((Context) this.PolarVoyageKotlinBetaPulseBeta3653).getPackageName());
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Integer.toString(PolarVoyageBarcodeScannerInfernoSolarSpark7767.versionCode);
            this.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.versionName;
        }
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485(int i, int i2) {
        long[] jArr = (long[]) this.PolarVoyageKotlinBetaPulseBeta3653;
        int[] iArr = (int[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int[] iArr2 = (int[]) this.PolarVoyageBitmapVisionAuroraPixel4705;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public synchronized String PolarVoyageMotionLayoutTransitionHeroVision4068() {
        try {
            if (((String) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) == null) {
                PolarVoyageDiffUtilTurboStrike5735();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public void PolarVoyageTextInputEditTextNebulaHero6651(int i) {
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int PolarVoyageZipVortexCelestial6185(long j) {
        int i = this.PolarVoyageZipVortexCelestial6185 + 1;
        long[] jArr = (long[]) this.PolarVoyageKotlinBetaPulseBeta3653;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageBottomSheetNovaXNova5051(jArr, jArr2, 0, 0, jArr.length);
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDelayCyberQuantumEclipse8687(0, 0, 14, (int[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, r2);
            this.PolarVoyageKotlinBetaPulseBeta3653 = jArr2;
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = r2;
        }
        int i3 = this.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageZipVortexCelestial6185 = i3 + 1;
        int length2 = ((int[]) this.PolarVoyageBitmapVisionAuroraPixel4705).length;
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 >= length2) {
            int i4 = length2 * 2;
            ?? r22 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                r22[i5] = i6;
                i5 = i6;
            }
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDelayCyberQuantumEclipse8687(0, 0, 14, (int[]) this.PolarVoyageBitmapVisionAuroraPixel4705, r22);
            this.PolarVoyageBitmapVisionAuroraPixel4705 = r22;
        }
        int i7 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int[] iArr = (int[]) this.PolarVoyageBitmapVisionAuroraPixel4705;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = iArr[i7];
        long[] jArr3 = (long[]) this.PolarVoyageKotlinBetaPulseBeta3653;
        jArr3[i3] = j;
        ((int[]) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767)[i3] = i7;
        iArr[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageNavigationViewHyperHyperHyperion1793(jArr3[i8], j) <= 0) {
                break;
            }
            PolarVoyageItemDecorationUltraDeltaEpic7485(i8, i3);
            i3 = i8;
        }
        return i7;
    }
}
