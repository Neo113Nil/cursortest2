package p000createpolar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMotionSceneShadowBlazeVortex9875 implements PolarVoyageFragmentManagerHyperionHeroFusion7976, PolarVoyageGradleAuroraTitanTitan7788, PolarVoyageBroadcastReceiverStormSpeed8368, PolarVoyageEditTextPrimeRogueSpectra6025 {
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public static final byte[] PolarVoyageBottomSheetOmegaNeo1907 = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] PolarVoyageViewRogueMaster4778 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final long[] PolarVoyageCameraPixelBlaze2629 = {128, 64, 32, 16, 8, 4, 2, 1};

    public PolarVoyageMotionSceneShadowBlazeVortex9875(int i) {
        switch (i) {
            case 3:
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageZoomStateAlphaVision6590(27);
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 8000;
                this.PolarVoyageStrictModeLegendEpic1532 = 8000;
                break;
            case 4:
            default:
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new byte[8];
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageMotionSceneShadowBlazeVortex9875[256];
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
                this.PolarVoyageStrictModeLegendEpic1532 = 0;
                break;
        }
    }

    public static long PolarVoyageBitmapMaxTitanTitan7960(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~PolarVoyageCameraPixelBlaze2629[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static void PolarVoyageLayerDrawableShadowTitaniumOmega1942(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(PolarVoyageDebugStrikeHyper9028.PolarVoyageKotlinBetaPulseBeta3653(i2));
    }

    public synchronized int PolarVoyageAlertDialogCyberHeroQuantum3938() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PackageManager packageManager = context.getPackageManager();
        if (PolarVoyageAnimationSetPhantomOlympianShadow8476.PolarVoyageZipVortexCelestial6185(context).PolarVoyageItemDecorationUltraDeltaEpic7485.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.PolarVoyageStrictModeLegendEpic1532 = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.PolarVoyageStrictModeLegendEpic1532 = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803()) {
            i2 = 2;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
        return i2;
    }

    @Override // p000createpolar.PolarVoyageProGuardVisionEliteShadow4939
    public PolarVoyageBannerAdAuroraGamma9142 PolarVoyageAnimatorSetSparkUltraMax8233(long j, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423) {
        return ((PolarVoyageAnimatorCelestialDeltaMaster5821) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageAnimatorSetSparkUltraMax8233(j, polarVoyageBannerAdAuroraGamma9142, polarVoyageBannerAdAuroraGamma91422, polarVoyageBannerAdAuroraGamma91423);
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBarcodeScannerInfernoSolarSpark7767();
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerHyperionHeroFusion7976
    public int PolarVoyageBitmapVisionAuroraPixel4705() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public Object PolarVoyageBottomSheetOmegaNeo1907() {
        return ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBottomSheetOmegaNeo1907();
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageCameraPixelBlaze2629(PolarVoyageObjectDetectionThunderHyperInferno3620 polarVoyageObjectDetectionThunderHyperInferno3620, Object obj) {
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageCameraPixelBlaze2629(polarVoyageObjectDetectionThunderHyperInferno3620, obj);
    }

    @Override // p000createpolar.PolarVoyageProGuardVisionEliteShadow4939
    public PolarVoyageBannerAdAuroraGamma9142 PolarVoyageDiffUtilTurboStrike5735(long j, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423) {
        return ((PolarVoyageAnimatorCelestialDeltaMaster5821) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageDiffUtilTurboStrike5735(j, polarVoyageBannerAdAuroraGamma9142, polarVoyageBannerAdAuroraGamma91422, polarVoyageBannerAdAuroraGamma91423);
    }

    public long PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageMotionEventDeltaNovaXShadow3329 polarVoyageMotionEventDeltaNovaXShadow3329, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0) {
            if (!polarVoyageMotionEventDeltaNovaXShadow3329.PolarVoyageMotionLayoutTransitionHeroVision4068(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((PolarVoyageCameraPixelBlaze2629[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.PolarVoyageStrictModeLegendEpic1532 = i2;
            if (i2 == -1) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("No valid varint length mask found");
                return 0L;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
        }
        int i5 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i5 > i) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
            return -2L;
        }
        if (i5 != 1) {
            polarVoyageMotionEventDeltaNovaXShadow3329.readFully(bArr, 1, i5 - 1);
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        return PolarVoyageBitmapMaxTitanTitan7960(this.PolarVoyageStrictModeLegendEpic1532, z2, bArr);
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerHyperionHeroFusion7976
    public int PolarVoyageDrawableDeltaHyperion5742() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageKotlinBetaPulseBeta3653(Object obj) {
        this.PolarVoyageStrictModeLegendEpic1532++;
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageKotlinBetaPulseBeta3653(obj);
    }

    public synchronized int PolarVoyageMotionLayoutForceEpicAurora7183() {
        PackageInfo packageInfo;
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0) {
            try {
                packageInfo = PolarVoyageAnimationSetPhantomOlympianShadow8476.PolarVoyageZipVortexCelestial6185((Context) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageItemDecorationUltraDeltaEpic7485.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485 = packageInfo.versionCode;
            }
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageNavigationViewHyperHyperHyperion1793() {
        if (this.PolarVoyageStrictModeLegendEpic1532 <= 0) {
            PolarVoyageOnItemLongClickListenerSpectraForce9061.PolarVoyageKotlinBetaPulseBeta3653("OffsetApplier up called with no corresponding down");
        }
        this.PolarVoyageStrictModeLegendEpic1532--;
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageNavigationViewHyperHyperHyperion1793();
    }

    @Override // p000createpolar.PolarVoyageFragmentManagerHyperionHeroFusion7976
    public int PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return i == -1 ? ((PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageDiffUtilDragonSpeedEclipse6225() : i;
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageRotateAnimationCyberCelestialDelta4768(int i, int i2, int i3) {
        int i4 = this.PolarVoyageStrictModeLegendEpic1532 == 0 ? this.PolarVoyageItemDecorationUltraDeltaEpic7485 : 0;
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageRotateAnimationCyberCelestialDelta4768(i + i4, i2 + i4, i3);
    }

    @Override // p000createpolar.PolarVoyageGradleAuroraTitanTitan7788
    public PolarVoyageEditTextNeoUltra9594 PolarVoyageSnackbarGammaEclipse2140() {
        return new PolarVoyageLooperSpectraBlazeNovaX7948(this.PolarVoyageItemDecorationUltraDeltaEpic7485, this.PolarVoyageStrictModeLegendEpic1532, (PolarVoyageZoomStateAlphaVision6590) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
    }

    @Override // p000createpolar.PolarVoyageProGuardVisionEliteShadow4939
    public long PolarVoyageStrictModeLegendEpic1532(PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423) {
        return (this.PolarVoyageStrictModeLegendEpic1532 + this.PolarVoyageItemDecorationUltraDeltaEpic7485) * 1000000;
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageTextInputEditTextNebulaHero6651(int i, Object obj) {
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageTextInputEditTextNebulaHero6651(i + (this.PolarVoyageStrictModeLegendEpic1532 == 0 ? this.PolarVoyageItemDecorationUltraDeltaEpic7485 : 0), obj);
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageViewRogueMaster4778(int i, int i2) {
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageViewRogueMaster4778(i + (this.PolarVoyageStrictModeLegendEpic1532 == 0 ? this.PolarVoyageItemDecorationUltraDeltaEpic7485 : 0), i2);
    }

    @Override // p000createpolar.PolarVoyageBroadcastReceiverStormSpeed8368
    public void PolarVoyageZipVortexCelestial6185(int i, Object obj) {
        ((PolarVoyageBroadcastReceiverStormSpeed8368) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185(i + (this.PolarVoyageStrictModeLegendEpic1532 == 0 ? this.PolarVoyageItemDecorationUltraDeltaEpic7485 : 0), obj);
    }

    public PolarVoyageMotionSceneShadowBlazeVortex9875(int i, int i2, PolarVoyageConstraintSetCloneInfernoEliteDelta1883 polarVoyageConstraintSetCloneInfernoEliteDelta1883) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageAnimatorCelestialDeltaMaster5821(new PolarVoyageLayoutUltraMax4369(i, i2, polarVoyageConstraintSetCloneInfernoEliteDelta1883));
    }
}
