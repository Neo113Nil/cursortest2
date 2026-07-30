package p000createpolar;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMotionLayoutHeroSpeed4592 {
    public static int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public static final Pattern PolarVoyageRotateAnimationCyberCelestialDelta4768 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static PendingIntent PolarVoyageStrictModeLegendEpic1532;
    public final ScheduledThreadPoolExecutor PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Messenger PolarVoyageBitmapVisionAuroraPixel4705;
    public Messenger PolarVoyageDiffUtilTurboStrike5735;
    public final PolarVoyageMotionSceneShadowBlazeVortex9875 PolarVoyageKotlinBetaPulseBeta3653;
    public final Context PolarVoyageMotionLayoutTransitionHeroVision4068;
    public PolarVoyageLevelListDrawableRogueEclipse2191 PolarVoyageTextInputEditTextNebulaHero6651;
    public final PolarVoyageLevelListDrawablePhoenixMegaNebula9939 PolarVoyageZipVortexCelestial6185 = new PolarVoyageLevelListDrawablePhoenixMegaNebula9939(0);

    public PolarVoyageMotionLayoutHeroSpeed4592(Context context) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = context;
        PolarVoyageMotionSceneShadowBlazeVortex9875 polarVoyageMotionSceneShadowBlazeVortex9875 = new PolarVoyageMotionSceneShadowBlazeVortex9875();
        polarVoyageMotionSceneShadowBlazeVortex9875.PolarVoyageStrictModeLegendEpic1532 = 0;
        polarVoyageMotionSceneShadowBlazeVortex9875.PolarVoyageRotateAnimationCyberCelestialDelta4768 = context;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageMotionSceneShadowBlazeVortex9875;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = new Messenger(new PolarVoyageRippleDrawablePhantomOlympianStrike1652(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = scheduledThreadPoolExecutor;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(Bundle bundle, String str) {
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            try {
                PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = (PolarVoyageRotateDrawableTurboHyperDelta7408) this.PolarVoyageZipVortexCelestial6185.remove(str);
                if (polarVoyageRotateDrawableTurboHyperDelta7408 != null) {
                    polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageZipVortexCelestial6185(Bundle bundle) {
        String num;
        synchronized (PolarVoyageMotionLayoutHeroSpeed4592.class) {
            int i = PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageItemDecorationUltraDeltaEpic7485 = i + 1;
            num = Integer.toString(i);
        }
        PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = new PolarVoyageRotateDrawableTurboHyperDelta7408();
        synchronized (this.PolarVoyageZipVortexCelestial6185) {
            this.PolarVoyageZipVortexCelestial6185.put(num, polarVoyageRotateDrawableTurboHyperDelta7408);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageAlertDialogCyberHeroQuantum3938() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        synchronized (PolarVoyageMotionLayoutHeroSpeed4592.class) {
            try {
                if (PolarVoyageStrictModeLegendEpic1532 == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    PolarVoyageStrictModeLegendEpic1532 = PendingIntent.getBroadcast(context, 0, intent2, PolarVoyagePropertyValuesHolderOlympianRogueStrike5575.PolarVoyageZipVortexCelestial6185);
                }
                intent.putExtra("app", PolarVoyageStrictModeLegendEpic1532);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.PolarVoyageBitmapVisionAuroraPixel4705);
        if (this.PolarVoyageDiffUtilTurboStrike5735 != null || this.PolarVoyageTextInputEditTextNebulaHero6651 != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.PolarVoyageDiffUtilTurboStrike5735;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185(PolarVoyageViewPager2InfernoEpic1202.PolarVoyageRotateAnimationCyberCelestialDelta4768, new PolarVoyageDrawableCosmosEclipseMax6944(this, num, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.schedule(new PolarVoyageDialogSolarMaster1422(14, polarVoyageRotateDrawableTurboHyperDelta7408), 30L, TimeUnit.SECONDS), 9));
            return polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185;
        }
        int PolarVoyageAlertDialogCyberHeroQuantum3938 = this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageAlertDialogCyberHeroQuantum3938();
        Context context2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (PolarVoyageAlertDialogCyberHeroQuantum3938 == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185(PolarVoyageViewPager2InfernoEpic1202.PolarVoyageRotateAnimationCyberCelestialDelta4768, new PolarVoyageDrawableCosmosEclipseMax6944(this, num, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.schedule(new PolarVoyageDialogSolarMaster1422(14, polarVoyageRotateDrawableTurboHyperDelta7408), 30L, TimeUnit.SECONDS), 9));
        return polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185;
    }
}
