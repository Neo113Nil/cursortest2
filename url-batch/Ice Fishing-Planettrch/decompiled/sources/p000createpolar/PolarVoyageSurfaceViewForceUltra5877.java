package p000createpolar;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageSurfaceViewForceUltra5877 {
    public static final PolarVoyageAnimationSolarHyperionThunder3214 PolarVoyageZipVortexCelestial6185 = new PolarVoyageAnimationSolarHyperionThunder3214();
    public static final Object PolarVoyageMotionLayoutTransitionHeroVision4068 = new Object();
    public static PolarVoyageWithContextGammaMaster7108 PolarVoyageKotlinBetaPulseBeta3653 = null;

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void PolarVoyageKotlinBetaPulseBeta3653(Context context, boolean z) {
        boolean z2;
        PolarVoyageRealtimeDatabaseNovaTurboNovaX2459 PolarVoyageZipVortexCelestial61852;
        PolarVoyageRealtimeDatabaseNovaTurboNovaX2459 polarVoyageRealtimeDatabaseNovaTurboNovaX2459;
        int i;
        if (z || PolarVoyageKotlinBetaPulseBeta3653 == null) {
            synchronized (PolarVoyageMotionLayoutTransitionHeroVision4068) {
                if (!z) {
                    if (PolarVoyageKotlinBetaPulseBeta3653 != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long PolarVoyageZipVortexCelestial61853 = PolarVoyageZipVortexCelestial6185(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                PolarVoyageZipVortexCelestial61852 = PolarVoyageRealtimeDatabaseNovaTurboNovaX2459.PolarVoyageZipVortexCelestial6185(file3);
                            } catch (IOException unused2) {
                                PolarVoyageMotionLayoutTransitionHeroVision4068();
                                return;
                            }
                        } else {
                            PolarVoyageZipVortexCelestial61852 = null;
                        }
                        if (PolarVoyageZipVortexCelestial61852 != null && PolarVoyageZipVortexCelestial61852.PolarVoyageKotlinBetaPulseBeta3653 == PolarVoyageZipVortexCelestial61853 && (i = PolarVoyageZipVortexCelestial61852.PolarVoyageMotionLayoutTransitionHeroVision4068) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (PolarVoyageZipVortexCelestial61852 != null && PolarVoyageZipVortexCelestial61852.PolarVoyageMotionLayoutTransitionHeroVision4068 == 2 && i2 == 1 && length < PolarVoyageZipVortexCelestial61852.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
                                i2 = 3;
                            }
                            polarVoyageRealtimeDatabaseNovaTurboNovaX2459 = new PolarVoyageRealtimeDatabaseNovaTurboNovaX2459(1, i2, PolarVoyageZipVortexCelestial61853, length2);
                            if (PolarVoyageZipVortexCelestial61852 != null || !PolarVoyageZipVortexCelestial61852.equals(polarVoyageRealtimeDatabaseNovaTurboNovaX2459)) {
                                polarVoyageRealtimeDatabaseNovaTurboNovaX2459.PolarVoyageMotionLayoutTransitionHeroVision4068(file3);
                            }
                            PolarVoyageMotionLayoutTransitionHeroVision4068();
                            return;
                        }
                        if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (PolarVoyageZipVortexCelestial61852 != null) {
                            i2 = 3;
                        }
                        polarVoyageRealtimeDatabaseNovaTurboNovaX2459 = new PolarVoyageRealtimeDatabaseNovaTurboNovaX2459(1, i2, PolarVoyageZipVortexCelestial61853, length2);
                        if (PolarVoyageZipVortexCelestial61852 != null) {
                        }
                        polarVoyageRealtimeDatabaseNovaTurboNovaX2459.PolarVoyageMotionLayoutTransitionHeroVision4068(file3);
                        PolarVoyageMotionLayoutTransitionHeroVision4068();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        PolarVoyageMotionLayoutTransitionHeroVision4068();
                        return;
                    }
                }
                PolarVoyageMotionLayoutTransitionHeroVision4068();
            }
        }
    }

    public static PolarVoyageWithContextGammaMaster7108 PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108 = new PolarVoyageWithContextGammaMaster7108(24);
        PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageWithContextGammaMaster7108;
        PolarVoyageAnimationSolarHyperionThunder3214 polarVoyageAnimationSolarHyperionThunder3214 = PolarVoyageZipVortexCelestial6185;
        polarVoyageAnimationSolarHyperionThunder3214.getClass();
        if (PolarVoyageDragEventGammaThunder1866.PolarVoyageCameraPixelBlaze2629.PolarVoyageSnackbarGammaEclipse2140(polarVoyageAnimationSolarHyperionThunder3214, null, polarVoyageWithContextGammaMaster7108)) {
            PolarVoyageDragEventGammaThunder1866.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageAnimationSolarHyperionThunder3214);
        }
        return PolarVoyageKotlinBetaPulseBeta3653;
    }

    public static long PolarVoyageZipVortexCelestial6185(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? PolarVoyageLiveDataTurboDragonNovaX6549.PolarVoyageZipVortexCelestial6185(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
