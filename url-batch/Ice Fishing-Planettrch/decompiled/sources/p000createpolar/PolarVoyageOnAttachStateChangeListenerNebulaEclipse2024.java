package p000createpolar;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageOnAttachStateChangeListenerNebulaEclipse2024 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageFCMShadowUltra8547 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageOnAttachStateChangeListenerNebulaEclipse2024(PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra8547, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageFCMShadowUltra8547;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra8547 = this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageFCMShadowUltra8547) {
                    if (polarVoyageFCMShadowUltra8547.PolarVoyageZipVortexCelestial6185 == 1) {
                        polarVoyageFCMShadowUltra8547.PolarVoyageZipVortexCelestial6185("Timed out while binding");
                    }
                }
                return;
            default:
                this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185("Service disconnected");
                return;
        }
        while (true) {
            PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra85472 = this.PolarVoyageStrictModeLegendEpic1532;
            synchronized (polarVoyageFCMShadowUltra85472) {
                try {
                    if (polarVoyageFCMShadowUltra85472.PolarVoyageZipVortexCelestial6185 != 2) {
                        return;
                    }
                    if (polarVoyageFCMShadowUltra85472.PolarVoyageBarcodeScannerInfernoSolarSpark7767.isEmpty()) {
                        polarVoyageFCMShadowUltra85472.PolarVoyageKotlinBetaPulseBeta3653();
                        return;
                    }
                    PolarVoyageAnimatorHeroPrime4575 polarVoyageAnimatorHeroPrime4575 = (PolarVoyageAnimatorHeroPrime4575) polarVoyageFCMShadowUltra85472.PolarVoyageBarcodeScannerInfernoSolarSpark7767.poll();
                    polarVoyageFCMShadowUltra85472.PolarVoyageBitmapVisionAuroraPixel4705.put(polarVoyageAnimatorHeroPrime4575.PolarVoyageZipVortexCelestial6185, polarVoyageAnimatorHeroPrime4575);
                    ((ScheduledExecutorService) polarVoyageFCMShadowUltra85472.PolarVoyageDiffUtilTurboStrike5735.PolarVoyageKotlinBetaPulseBeta3653).schedule(new PolarVoyageAnimationSetEclipseBlaze5194(3, polarVoyageFCMShadowUltra85472, polarVoyageAnimatorHeroPrime4575), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(polarVoyageAnimatorHeroPrime4575)));
                    }
                    PolarVoyageSQLiteTitanForceLegend7380 polarVoyageSQLiteTitanForceLegend7380 = polarVoyageFCMShadowUltra85472.PolarVoyageDiffUtilTurboStrike5735;
                    Messenger messenger = polarVoyageFCMShadowUltra85472.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    int i = polarVoyageAnimatorHeroPrime4575.PolarVoyageKotlinBetaPulseBeta3653;
                    Context context = (Context) polarVoyageSQLiteTitanForceLegend7380.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = polarVoyageAnimatorHeroPrime4575.PolarVoyageZipVortexCelestial6185;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", polarVoyageAnimatorHeroPrime4575.PolarVoyageZipVortexCelestial6185());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", polarVoyageAnimatorHeroPrime4575.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                    obtain.setData(bundle);
                    try {
                        PolarVoyageBundlePhantomEclipseMega7910 polarVoyageBundlePhantomEclipseMega7910 = polarVoyageFCMShadowUltra85472.PolarVoyageKotlinBetaPulseBeta3653;
                        Messenger messenger2 = (Messenger) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageStrictModeLegendEpic1532;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            PolarVoyageLevelListDrawableRogueEclipse2191 polarVoyageLevelListDrawableRogueEclipse2191 = (PolarVoyageLevelListDrawableRogueEclipse2191) polarVoyageBundlePhantomEclipseMega7910.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                            if (polarVoyageLevelListDrawableRogueEclipse2191 == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = polarVoyageLevelListDrawableRogueEclipse2191.PolarVoyageItemDecorationUltraDeltaEpic7485;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        polarVoyageFCMShadowUltra85472.PolarVoyageZipVortexCelestial6185(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
