package p000createpolar;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageToastPhantomRogue2255 implements Handler.Callback {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageToastPhantomRogue2255(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                PolarVoyageFCMShadowUltra8547 polarVoyageFCMShadowUltra8547 = (PolarVoyageFCMShadowUltra8547) this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageFCMShadowUltra8547) {
                    try {
                        PolarVoyageAnimatorHeroPrime4575 polarVoyageAnimatorHeroPrime4575 = (PolarVoyageAnimatorHeroPrime4575) polarVoyageFCMShadowUltra8547.PolarVoyageBitmapVisionAuroraPixel4705.get(i);
                        if (polarVoyageAnimatorHeroPrime4575 != null) {
                            polarVoyageFCMShadowUltra8547.PolarVoyageBitmapVisionAuroraPixel4705.remove(i);
                            polarVoyageFCMShadowUltra8547.PolarVoyageKotlinBetaPulseBeta3653();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (polarVoyageAnimatorHeroPrime4575.PolarVoyageBitmapVisionAuroraPixel4705) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        if (!data.getBoolean("ack", false)) {
                                            polarVoyageAnimatorHeroPrime4575.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageBarcodeScannerOlympianNeoShadow6002("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            polarVoyageAnimatorHeroPrime4575.PolarVoyageKotlinBetaPulseBeta3653(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        polarVoyageAnimatorHeroPrime4575.PolarVoyageKotlinBetaPulseBeta3653(bundle);
                                        break;
                                }
                            } else {
                                polarVoyageAnimatorHeroPrime4575.PolarVoyageMotionLayoutTransitionHeroVision4068(new PolarVoyageBarcodeScannerOlympianNeoShadow6002("Not supported by GmsCore", null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((PolarVoyageFragmentCelestialDragonNovaX2958) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185) {
                        try {
                            PolarVoyageProGuardPulseStrikeForce2310 polarVoyageProGuardPulseStrikeForce2310 = (PolarVoyageProGuardPulseStrikeForce2310) message.obj;
                            PolarVoyageBroadcastPhantomTitan9115 polarVoyageBroadcastPhantomTitan9115 = (PolarVoyageBroadcastPhantomTitan9115) ((PolarVoyageFragmentCelestialDragonNovaX2958) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185.get(polarVoyageProGuardPulseStrikeForce2310);
                            if (polarVoyageBroadcastPhantomTitan9115 != null && polarVoyageBroadcastPhantomTitan9115.PolarVoyageZipVortexCelestial6185.isEmpty()) {
                                if (polarVoyageBroadcastPhantomTitan9115.PolarVoyageKotlinBetaPulseBeta3653) {
                                    polarVoyageBroadcastPhantomTitan9115.PolarVoyageTextInputEditTextNebulaHero6651.PolarVoyageKotlinBetaPulseBeta3653.removeMessages(1, polarVoyageBroadcastPhantomTitan9115.PolarVoyageBitmapVisionAuroraPixel4705);
                                    PolarVoyageFragmentCelestialDragonNovaX2958 polarVoyageFragmentCelestialDragonNovaX2958 = polarVoyageBroadcastPhantomTitan9115.PolarVoyageTextInputEditTextNebulaHero6651;
                                    polarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapMaxTitanTitan7960(polarVoyageFragmentCelestialDragonNovaX2958.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageBroadcastPhantomTitan9115);
                                    polarVoyageBroadcastPhantomTitan9115.PolarVoyageKotlinBetaPulseBeta3653 = false;
                                    polarVoyageBroadcastPhantomTitan9115.PolarVoyageMotionLayoutTransitionHeroVision4068 = 2;
                                }
                                ((PolarVoyageFragmentCelestialDragonNovaX2958) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185.remove(polarVoyageProGuardPulseStrikeForce2310);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                synchronized (((PolarVoyageFragmentCelestialDragonNovaX2958) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185) {
                    try {
                        PolarVoyageProGuardPulseStrikeForce2310 polarVoyageProGuardPulseStrikeForce23102 = (PolarVoyageProGuardPulseStrikeForce2310) message.obj;
                        PolarVoyageBroadcastPhantomTitan9115 polarVoyageBroadcastPhantomTitan91152 = (PolarVoyageBroadcastPhantomTitan9115) ((PolarVoyageFragmentCelestialDragonNovaX2958) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185.get(polarVoyageProGuardPulseStrikeForce23102);
                        if (polarVoyageBroadcastPhantomTitan91152 != null && polarVoyageBroadcastPhantomTitan91152.PolarVoyageMotionLayoutTransitionHeroVision4068 == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(polarVoyageProGuardPulseStrikeForce23102)), new Exception());
                            ComponentName componentName2 = polarVoyageBroadcastPhantomTitan91152.PolarVoyageDiffUtilTurboStrike5735;
                            if (componentName2 == null) {
                                polarVoyageProGuardPulseStrikeForce23102.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = polarVoyageProGuardPulseStrikeForce23102.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            polarVoyageBroadcastPhantomTitan91152.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}
