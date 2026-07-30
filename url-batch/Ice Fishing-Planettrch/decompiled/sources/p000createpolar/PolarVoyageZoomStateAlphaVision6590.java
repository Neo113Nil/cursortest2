package p000createpolar;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.polarvoyage.glacialoceans.icepathfinder.quest.PolarContentScreen;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageZoomStateAlphaVision6590 implements PolarVoyageSensorManagerTitaniumEclipseTitan3276, PolarVoyageScaleGestureDetectorDragonBlazeShadow4642, PolarVoyageGradleAuroraTitanTitan7788, PolarVoyageColorDrawableVisionPhantomCyber4545 {
    public static final Object PolarVoyageBottomSheetOmegaNeo1907 = new Object();
    public static PolarVoyageInterstitialAdEpicPulse3280 PolarVoyageViewRogueMaster4778;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageZoomStateAlphaVision6590(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 21:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.PolarVoyageStrictModeLegendEpic1532 = byteArrayOutputStream;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new DataOutputStream(byteArrayOutputStream);
                break;
            case 22:
                this.PolarVoyageStrictModeLegendEpic1532 = new HashMap();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRoomHyperCosmosEclipse5154.PolarVoyageMotionLayoutTransitionHeroVision4068;
                break;
            case 23:
            case 26:
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = ByteBuffer.allocateDirect(500);
                break;
            case 24:
                break;
            case 25:
                this.PolarVoyageStrictModeLegendEpic1532 = new ArrayList();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new HashMap();
                new HashMap();
                break;
            case 27:
                this.PolarVoyageStrictModeLegendEpic1532 = new HashMap();
                break;
        }
    }

    public static void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590, PolarVoyageRoomHyperCosmosEclipse5154 polarVoyageRoomHyperCosmosEclipse5154) {
        polarVoyageZoomStateAlphaVision6590.getClass();
        for (Map.Entry entry : new HashMap((HashMap) polarVoyageZoomStateAlphaVision6590.PolarVoyageStrictModeLegendEpic1532).entrySet()) {
            if (entry.getKey() != null) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!PolarVoyageStrictModeLegendEpic1532(polarVoyageRoomHyperCosmosEclipse5154, list).equals(PolarVoyageStrictModeLegendEpic1532((PolarVoyageRoomHyperCosmosEclipse5154) polarVoyageZoomStateAlphaVision6590.PolarVoyageRotateAnimationCyberCelestialDelta4768, list))) {
                    throw null;
                }
            }
        }
        polarVoyageZoomStateAlphaVision6590.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageRoomHyperCosmosEclipse5154;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PolarVoyageZoomStateAlphaVision6590 PolarVoyageDiffUtilTurboStrike5735(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e2) {
            e = e2;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new PolarVoyageZoomStateAlphaVision6590(13, fileChannel, fileLock);
        } catch (IOException e3) {
            e = e3;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e4) {
            e = e4;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e5) {
            e = e5;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static PolarVoyageRoomHyperCosmosEclipse5154 PolarVoyageStrictModeLegendEpic1532(PolarVoyageRoomHyperCosmosEclipse5154 polarVoyageRoomHyperCosmosEclipse5154, List list) {
        polarVoyageRoomHyperCosmosEclipse5154.getClass();
        Map map = polarVoyageRoomHyperCosmosEclipse5154.PolarVoyageZipVortexCelestial6185;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new PolarVoyageRoomHyperCosmosEclipse5154(hashMap);
    }

    public static PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageTextInputEditTextNebulaHero6651(Context context, Intent intent, boolean z) {
        PolarVoyageInterstitialAdEpicPulse3280 polarVoyageInterstitialAdEpicPulse3280;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (PolarVoyageBottomSheetOmegaNeo1907) {
            try {
                if (PolarVoyageViewRogueMaster4778 == null) {
                    PolarVoyageViewRogueMaster4778 = new PolarVoyageInterstitialAdEpicPulse3280(context);
                }
                polarVoyageInterstitialAdEpicPulse3280 = PolarVoyageViewRogueMaster4778;
            } finally {
            }
        }
        if (!z) {
            return polarVoyageInterstitialAdEpicPulse3280.PolarVoyageMotionLayoutTransitionHeroVision4068(intent).PolarVoyageKotlinBetaPulseBeta3653(new PolarVoyageFilterTurboThunderEclipse3279(1), new PolarVoyageBroadcastDragonShadowRogue6783(5));
        }
        if (PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942().PolarVoyageLooperThreadAlphaPrime1279(context)) {
            synchronized (PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                try {
                    PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageRemoteModelManagerOlympianCelestial9141(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageZipVortexCelestial6185();
                    }
                    PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageInterstitialAdEpicPulse3280.PolarVoyageMotionLayoutTransitionHeroVision4068(intent);
                    PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273 polarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273 = new PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273(26, intent);
                    PolarVoyageMotionLayoutTransitionHeroVision4068.getClass();
                    PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBitmapVisionAuroraPixel4705(new PolarVoyageOnItemClickListenerFusionCelestial9091(PolarVoyageDrawableForcePrime1969.PolarVoyageZipVortexCelestial6185, polarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273));
                    PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageDrawableDeltaHyperion5742();
                } finally {
                }
            }
        } else {
            polarVoyageInterstitialAdEpicPulse3280.PolarVoyageMotionLayoutTransitionHeroVision4068(intent);
        }
        return PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageStrictModeLegendEpic1532(-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        if (((p000createpolar.PolarVoyageRealtimeDatabaseMaxFusionBeta3131) r18.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageRemoteModelManagerOlympianCelestial9141(r1) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageSupervisorJobLegendNovaXEpic9696 PolarVoyageAnimatorSetSparkUltraMax8233(PolarVoyageLooperThreadStrikeCosmos3425 polarVoyageLooperThreadStrikeCosmos3425, PolarVoyageDebugVisionElite7266 polarVoyageDebugVisionElite7266) {
        Context context;
        PolarVoyageDebugVisionElite7266 polarVoyageDebugVisionElite72662;
        boolean z;
        boolean z2;
        Context context2 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageZipVortexCelestial6185;
        PolarVoyageTextInputEditTextAuroraPrimeSpark9601 polarVoyageTextInputEditTextAuroraPrimeSpark9601 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageContentProviderHyperSpark3838;
        PolarVoyageViewBindingPrimeNeoCelestial3775 polarVoyageViewBindingPrimeNeoCelestial3775 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        PolarVoyageInputMethodManagerEclipseMegaBlaze2928 polarVoyageInputMethodManagerEclipseMegaBlaze2928 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageBitmapVisionAuroraPixel4705;
        PolarVoyageIntentServiceMasterRogue3946 polarVoyageIntentServiceMasterRogue3946 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageIntentServiceMasterRogue3946 polarVoyageIntentServiceMasterRogue39462 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageIntentServiceMasterRogue3946 polarVoyageIntentServiceMasterRogue39463 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageDigitalInkRecognitionBetaShadowNebula9385 polarVoyageDigitalInkRecognitionBetaShadowNebula9385 = PolarVoyageFragmentManagerVisionVortex1127.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Bitmap.Config config = (Bitmap.Config) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula9385);
        PolarVoyageDigitalInkRecognitionBetaShadowNebula9385 polarVoyageDigitalInkRecognitionBetaShadowNebula93852 = PolarVoyageFragmentManagerVisionVortex1127.PolarVoyageTextInputEditTextNebulaHero6651;
        boolean booleanValue = ((Boolean) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula93852)).booleanValue();
        PolarVoyageDigitalInkRecognitionBetaShadowNebula9385 polarVoyageDigitalInkRecognitionBetaShadowNebula93853 = PolarVoyageScaleAnimationCyberTurbo8455.PolarVoyageZipVortexCelestial6185;
        boolean z3 = ((List) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula93853)).isEmpty() || PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageThreadPhoenixVisionSolar1313(PolarVoyageWindowManagerFusionQuantum7302.PolarVoyageZipVortexCelestial6185, (Bitmap.Config) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula9385));
        if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageToolbarEclipseInfernoHero6368((Bitmap.Config) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula9385))) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageToolbarEclipseInfernoHero6368((Bitmap.Config) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula9385)) && !((Boolean) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, PolarVoyageFragmentManagerVisionVortex1127.PolarVoyageDiffUtilTurboStrike5735)).booleanValue()) {
                context = context2;
                polarVoyageDebugVisionElite72662 = polarVoyageDebugVisionElite7266;
            } else {
                context = context2;
                polarVoyageDebugVisionElite72662 = polarVoyageDebugVisionElite7266;
            }
            z = false;
            if (z3 || !z) {
                config = Bitmap.Config.ARGB_8888;
            }
            z2 = (booleanValue || !((List) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula93853)).isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true;
            Map map = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageZipVortexCelestial6185;
            Map map2 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageZipVortexCelestial6185;
            map.getClass();
            map2.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(map2);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            if (config != ((Bitmap.Config) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula9385))) {
                if (config != null) {
                    linkedHashMap2.put(polarVoyageDigitalInkRecognitionBetaShadowNebula9385, config);
                } else {
                    linkedHashMap2.remove(polarVoyageDigitalInkRecognitionBetaShadowNebula9385);
                }
            }
            if (z2 != ((Boolean) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula93852)).booleanValue()) {
                linkedHashMap2.put(polarVoyageDigitalInkRecognitionBetaShadowNebula93852, Boolean.valueOf(z2));
            }
            return new PolarVoyageSupervisorJobLegendNovaXEpic9696(context, polarVoyageDebugVisionElite72662, polarVoyageTextInputEditTextAuroraPrimeSpark9601, polarVoyageViewBindingPrimeNeoCelestial3775, null, polarVoyageInputMethodManagerEclipseMegaBlaze2928, polarVoyageIntentServiceMasterRogue3946, polarVoyageIntentServiceMasterRogue39462, polarVoyageIntentServiceMasterRogue39463, new PolarVoyageEditTextTurboAlphaEpic6469(PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageCardViewAlphaVortexCelestial9747(linkedHashMap2)));
        }
        context = context2;
        polarVoyageDebugVisionElite72662 = polarVoyageDebugVisionElite7266;
        z = true;
        if (z3) {
        }
        config = Bitmap.Config.ARGB_8888;
        if (booleanValue) {
        }
        Map map3 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageZipVortexCelestial6185;
        Map map22 = polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageNavigationViewHyperHyperHyperion1793.PolarVoyageZipVortexCelestial6185;
        map3.getClass();
        map22.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(map3);
        linkedHashMap3.putAll(map22);
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(linkedHashMap3);
        if (config != ((Bitmap.Config) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula9385))) {
        }
        if (z2 != ((Boolean) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, polarVoyageDigitalInkRecognitionBetaShadowNebula93852)).booleanValue()) {
        }
        return new PolarVoyageSupervisorJobLegendNovaXEpic9696(context, polarVoyageDebugVisionElite72662, polarVoyageTextInputEditTextAuroraPrimeSpark9601, polarVoyageViewBindingPrimeNeoCelestial3775, null, polarVoyageInputMethodManagerEclipseMegaBlaze2928, polarVoyageIntentServiceMasterRogue3946, polarVoyageIntentServiceMasterRogue39462, polarVoyageIntentServiceMasterRogue39463, new PolarVoyageEditTextTurboAlphaEpic6469(PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageCardViewAlphaVortexCelestial9747(linkedHashMap22)));
    }

    @Override // p000createpolar.PolarVoyageColorDrawableVisionPhantomCyber4545
    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(CharSequence charSequence, int i, int i2, PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 polarVoyageInAppPurchaseStrikeQuantumTitanium4425) {
        if ((polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageKotlinBetaPulseBeta3653 & 4) > 0) {
            return true;
        }
        if (((PolarVoyageBillingClientDeltaSpectra8116) this.PolarVoyageStrictModeLegendEpic1532) == null) {
            this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageBillingClientDeltaSpectra8116(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((PolarVoyageWithContextGammaMaster7108) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getClass();
        ((PolarVoyageBillingClientDeltaSpectra8116) this.PolarVoyageStrictModeLegendEpic1532).setSpan(new PolarVoyageMLKitHeroInfernoVortex4420(polarVoyageInAppPurchaseStrikeQuantumTitanium4425), i, i2, 33);
        return true;
    }

    public PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageBitmapMaxTitanTitan7960(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageFilterTurboThunderEclipse3279 polarVoyageFilterTurboThunderEclipse3279 = (PolarVoyageFilterTurboThunderEclipse3279) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        boolean z = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageDiffUtilTurboStrike5735(polarVoyageFilterTurboThunderEclipse3279, new Callable() { // from class: create-polar.PolarVoyageViewBetaAlpha8173
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageLayerDrawableShadowTitaniumOmega1942 = PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLayerDrawableShadowTitaniumOmega1942();
                PolarVoyageLayerDrawableShadowTitaniumOmega1942.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageViewRogueMaster4778).offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (PolarVoyageLayerDrawableShadowTitaniumOmega1942) {
                    try {
                        str = (String) PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageStrictModeLegendEpic1532;
                        if (str == null) {
                            ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageStrictModeLegendEpic1532 = context2.getPackageName() + serviceInfo.name;
                                    } else {
                                        PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageStrictModeLegendEpic1532 = serviceInfo.name;
                                    }
                                    str = (String) PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageStrictModeLegendEpic1532;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (PolarVoyageLayerDrawableShadowTitaniumOmega1942.PolarVoyageLooperThreadAlphaPrime1279(context2)) {
                        startService = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageAlarmManagerShadowHyperBeta8339(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageFilterTurboThunderEclipse3279, new PolarVoyageFontFamilyTurboHero9597() { // from class: create-polar.PolarVoyageDialogStrikeQuantum2256
            @Override // p000createpolar.PolarVoyageFontFamilyTurboHero9597
            public final Object PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995) {
                return (PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLifecycleCameraControllerDragonOmegaUltra1803() && ((Integer) polarVoyageDialogFragmentTitanCelestial7995.PolarVoyageDiffUtilTurboStrike5735()).intValue() == 402) ? PolarVoyageZoomStateAlphaVision6590.PolarVoyageTextInputEditTextNebulaHero6651(context, intent, z2).PolarVoyageKotlinBetaPulseBeta3653(new PolarVoyageFilterTurboThunderEclipse3279(1), new PolarVoyageBroadcastDragonShadowRogue6783(4)) : polarVoyageDialogFragmentTitanCelestial7995;
            }
        }) : PolarVoyageTextInputEditTextNebulaHero6651(context, intent, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public boolean PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageRunnableEclipseLegend9029 polarVoyageRunnableEclipseLegend9029, String str, WebView webView, WebView webView2, PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273 polarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273) {
        String str2;
        Object polarVoyageTraceThunderMaster6506;
        String decode;
        ?? PolarVoyageToolbarEclipseInfernoHero6368;
        int ordinal = polarVoyageRunnableEclipseLegend9029.ordinal();
        int i = 0;
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590 = (PolarVoyageZoomStateAlphaVision6590) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "intent://", false)) {
                    String[] strArr = {"#Intent;"};
                    String str3 = strArr[0];
                    if (str3.length() == 0) {
                        List asList = Arrays.asList(strArr);
                        asList.getClass();
                        PolarVoyagePreviewBlazeForce3304<PolarVoyageLinearLayoutHyperionSpectra2647> polarVoyagePreviewBlazeForce3304 = new PolarVoyagePreviewBlazeForce3304(str, new PolarVoyageNavigationInfernoSolarVision9853(10, asList), i);
                        PolarVoyageToolbarEclipseInfernoHero6368 = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(new PolarVoyageNotificationHyperionVision4932(polarVoyagePreviewBlazeForce3304), 10));
                        for (PolarVoyageLinearLayoutHyperionSpectra2647 polarVoyageLinearLayoutHyperionSpectra2647 : polarVoyagePreviewBlazeForce3304) {
                            polarVoyageLinearLayoutHyperionSpectra2647.getClass();
                            PolarVoyageToolbarEclipseInfernoHero6368.add(str.subSequence(polarVoyageLinearLayoutHyperionSpectra2647.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageLinearLayoutHyperionSpectra2647.PolarVoyageStrictModeLegendEpic1532 + 1).toString());
                        }
                    } else {
                        PolarVoyageToolbarEclipseInfernoHero6368 = PolarVoyageDebugTitaniumInferno5712.PolarVoyageToolbarEclipseInfernoHero6368(str, str3);
                    }
                    str2 = PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233((String) PolarVoyageToolbarEclipseInfernoHero6368.get(0), "intent://", "https://");
                } else {
                    str2 = str;
                }
                try {
                    ((PolarContentScreen) polarVoyageZoomStateAlphaVision6590.PolarVoyageStrictModeLegendEpic1532).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                    polarVoyageTraceThunderMaster6506 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                } catch (Throwable th) {
                    polarVoyageTraceThunderMaster6506 = new PolarVoyageTraceThunderMaster6506(th);
                }
                if (PolarVoyageAnimatorSetTitanMegaNeo5701.PolarVoyageZipVortexCelestial6185(polarVoyageTraceThunderMaster6506) != null) {
                    PolarVoyageRecyclerViewUltraBlazeThunder8612 polarVoyageRecyclerViewUltraBlazeThunder8612 = (PolarVoyageRecyclerViewUltraBlazeThunder8612) polarVoyageZoomStateAlphaVision6590.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, "intent://", false)) {
                        Pattern compile = Pattern.compile("S\\.browser_fallback_url=([^;]*)");
                        compile.getClass();
                        Matcher matcher = compile.matcher(str);
                        matcher.getClass();
                        PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher, 0, str);
                        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
                            Collection PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageDisplayMetricsVortexDragon9516();
                            String str4 = (String) (1 < ((PolarVoyageTextInputLayoutTurboCelestialTitanium1416) PolarVoyageDisplayMetricsVortexDragon9516).size() ? ((PolarVoyageCoroutineCelestialAuroraPixel1740) PolarVoyageDisplayMetricsVortexDragon9516).get(1) : null);
                            if (str4 != null && (decode = URLDecoder.decode(str4, Constants.ENCODING)) != null) {
                                try {
                                    ((PolarContentScreen) polarVoyageRecyclerViewUltraBlazeThunder8612.PolarVoyageStrictModeLegendEpic1532).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(decode)));
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
                if (webView2 != null && polarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273 != null) {
                    PolarVoyageVibratorForceHyperionPulse5900 polarVoyageVibratorForceHyperionPulse5900 = ((PolarVoyageGestureDetectorTurboHeroRogue2241) polarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273.PolarVoyageStrictModeLegendEpic1532).PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    polarVoyageVibratorForceHyperionPulse5900.getClass();
                    FrameLayout frameLayout = (FrameLayout) ((PolarVoyageAdapterTitanSpark4027) polarVoyageVibratorForceHyperionPulse5900.PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532;
                    if (frameLayout != null) {
                        frameLayout.removeView(webView2);
                    }
                    webView2.destroy();
                }
            } else {
                if (ordinal != 3) {
                    PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    return false;
                }
                Context context = webView.getContext();
                context.getClass();
                try {
                    context.startActivity(Intent.parseUri(str, 1));
                } catch (Throwable unused2) {
                }
            }
        }
        return true;
    }

    public PolarVoyageEditTextNovaXUltraPrime4283 PolarVoyageCameraPixelBlaze2629(Object... objArr) {
        Constructor PolarVoyageKotlinBetaPulseBeta3653;
        synchronized (((AtomicBoolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
            if (!((AtomicBoolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get()) {
                try {
                    PolarVoyageKotlinBetaPulseBeta3653 = ((PolarVoyageMeteringPointSolarMax4741) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageKotlinBetaPulseBeta3653();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            PolarVoyageKotlinBetaPulseBeta3653 = null;
        }
        if (PolarVoyageKotlinBetaPulseBeta3653 == null) {
            return null;
        }
        try {
            return (PolarVoyageEditTextNovaXUltraPrime4283) PolarVoyageKotlinBetaPulseBeta3653.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public synchronized Map PolarVoyageContentProviderHyperSpark3838() {
        try {
            if (((Map) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Collections.unmodifiableMap(new HashMap((HashMap) this.PolarVoyageStrictModeLegendEpic1532));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public void PolarVoyageDisplayMetricsVortexDragon9516() {
        try {
            ((FileLock) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).release();
            ((FileChannel) this.PolarVoyageStrictModeLegendEpic1532).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public List PolarVoyageDrawableDeltaHyperion5742() {
        ArrayList arrayList;
        if (((ArrayList) this.PolarVoyageStrictModeLegendEpic1532).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.PolarVoyageStrictModeLegendEpic1532)) {
            arrayList = new ArrayList((ArrayList) this.PolarVoyageStrictModeLegendEpic1532);
        }
        return arrayList;
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485() {
        this.PolarVoyageStrictModeLegendEpic1532 = null;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
    }

    @Override // p000createpolar.PolarVoyageSensorManagerTitaniumEclipseTitan3276
    public void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageViewPagerStrikeBlaze5840 polarVoyageViewPagerStrikeBlaze5840) {
        PolarVoyageBroadcastReceiverAlphaDeltaSpectra2219 PolarVoyageBottomSheetOmegaNeo19072;
        PolarVoyageLooperThreadStrikeCosmos3425 polarVoyageLooperThreadStrikeCosmos3425 = (PolarVoyageLooperThreadStrikeCosmos3425) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageRemoteModelManagerQuantumGammaThunder9329 polarVoyageRemoteModelManagerQuantumGammaThunder9329 = (PolarVoyageRemoteModelManagerQuantumGammaThunder9329) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageBroadcastReceiverAlphaDeltaSpectra2219 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageViewPagerStrikeBlaze5840 != null ? PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageViewPagerStrikeBlaze5840, polarVoyageLooperThreadStrikeCosmos3425.PolarVoyageZipVortexCelestial6185, polarVoyageRemoteModelManagerQuantumGammaThunder9329.PolarVoyageBitmapMaxTitanTitan7960) : null;
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == null && ((Boolean) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageLooperThreadStrikeCosmos3425, PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageDrawableDeltaHyperion5742)).booleanValue() && (PolarVoyageBottomSheetOmegaNeo19072 = polarVoyageRemoteModelManagerQuantumGammaThunder9329.PolarVoyageBottomSheetOmegaNeo1907()) != null) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageBottomSheetOmegaNeo19072;
        }
        PolarVoyageRemoteModelManagerQuantumGammaThunder9329.PolarVoyageRotateAnimationCyberCelestialDelta4768(polarVoyageRemoteModelManagerQuantumGammaThunder9329, new PolarVoyageFocusMeteringActionShadowMasterStorm7092(PolarVoyageBarcodeScannerInfernoSolarSpark7767));
    }

    public PolarVoyageSupervisorJobLegendNovaXEpic9696 PolarVoyageLayerDrawableShadowTitaniumOmega1942(PolarVoyageSupervisorJobLegendNovaXEpic9696 polarVoyageSupervisorJobLegendNovaXEpic9696) {
        PolarVoyageEditTextTurboAlphaEpic6469 polarVoyageEditTextTurboAlphaEpic6469;
        boolean z;
        PolarVoyageEditTextTurboAlphaEpic6469 polarVoyageEditTextTurboAlphaEpic64692 = polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageDigitalInkRecognitionBetaShadowNebula9385 polarVoyageDigitalInkRecognitionBetaShadowNebula9385 = PolarVoyageFragmentManagerVisionVortex1127.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageToolbarEclipseInfernoHero6368((Bitmap.Config) PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageSupervisorJobLegendNovaXEpic9696, polarVoyageDigitalInkRecognitionBetaShadowNebula9385)) || ((PolarVoyageRealtimeDatabaseMaxFusionBeta3131) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBitmapVisionAuroraPixel4705()) {
            polarVoyageEditTextTurboAlphaEpic6469 = polarVoyageEditTextTurboAlphaEpic64692;
            z = false;
        } else {
            polarVoyageEditTextTurboAlphaEpic64692.getClass();
            Map map = polarVoyageEditTextTurboAlphaEpic64692.PolarVoyageZipVortexCelestial6185;
            map.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMap.put(polarVoyageDigitalInkRecognitionBetaShadowNebula9385, config);
            } else {
                linkedHashMap.remove(polarVoyageDigitalInkRecognitionBetaShadowNebula9385);
            }
            PolarVoyageEditTextTurboAlphaEpic6469 polarVoyageEditTextTurboAlphaEpic64693 = new PolarVoyageEditTextTurboAlphaEpic6469(PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageCardViewAlphaVortexCelestial9747(linkedHashMap));
            z = true;
            polarVoyageEditTextTurboAlphaEpic6469 = polarVoyageEditTextTurboAlphaEpic64693;
        }
        return z ? new PolarVoyageSupervisorJobLegendNovaXEpic9696(polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageZipVortexCelestial6185, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageDiffUtilTurboStrike5735, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageTextInputEditTextNebulaHero6651, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageSupervisorJobLegendNovaXEpic9696.PolarVoyageStrictModeLegendEpic1532, polarVoyageEditTextTurboAlphaEpic6469) : polarVoyageSupervisorJobLegendNovaXEpic9696;
    }

    public void PolarVoyageMotionLayoutForceEpicAurora7183(ArrayList arrayList) {
        PolarVoyageSupervisorJobMaxLegend8197 polarVoyageSupervisorJobMaxLegend8197;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((PolarVoyageInterstitialAdStormHyperionSpeed9525) arrayList.get(i)).PolarVoyageZipVortexCelestial6185 == 1) {
                try {
                    polarVoyageSupervisorJobMaxLegend8197 = new PolarVoyageSupervisorJobMaxLegend8197((PolarVoyageInterstitialAdStormHyperionSpeed9525) arrayList.get(i));
                } catch (PolarVoyageItemDecorationOmegaThunder5098 unused) {
                    polarVoyageSupervisorJobMaxLegend8197 = null;
                }
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageSupervisorJobMaxLegend8197;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageColorDrawableVisionPhantomCyber4545
    public Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return (PolarVoyageBillingClientDeltaSpectra8116) this.PolarVoyageStrictModeLegendEpic1532;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void PolarVoyageNavigationViewHyperHyperHyperion1793(PolarVoyageMotionEventAlphaCelestialThunder3331 polarVoyageMotionEventAlphaCelestialThunder3331) {
        PolarVoyageLinearLayoutInfernoDelta2662 polarVoyageLinearLayoutInfernoDelta2662 = (PolarVoyageLinearLayoutInfernoDelta2662) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageServiceInfoNovaCyber2044 polarVoyageServiceInfoNovaCyber2044 = (PolarVoyageServiceInfoNovaCyber2044) this.PolarVoyageStrictModeLegendEpic1532;
        int i = polarVoyageMotionEventAlphaCelestialThunder3331.PolarVoyageMotionLayoutTransitionHeroVision4068;
        boolean z = false;
        Object[] objArr = 0;
        if (i != 0) {
            polarVoyageLinearLayoutInfernoDelta2662.execute(new PolarVoyageCoroutineStrikeNovaThunder8135(i, (int) (objArr == true ? 1 : 0), (Object) polarVoyageServiceInfoNovaCyber2044));
        } else {
            polarVoyageLinearLayoutInfernoDelta2662.execute(new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(16, polarVoyageServiceInfoNovaCyber2044, polarVoyageMotionEventAlphaCelestialThunder3331.PolarVoyageZipVortexCelestial6185, z));
        }
    }

    public AutofillId PolarVoyageRemoteModelManagerOlympianCelestial9141(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageConstraintSetPhoenixEclipseCelestial3247.PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageStrictModeLegendEpic1532);
        PolarVoyageDigitalInkRecognitionBetaShadowNebula9385 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageDebugStrikeHyper9028.PolarVoyageBarcodeScannerInfernoSolarSpark7767((View) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        Objects.requireNonNull(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        return PolarVoyageRoomDatabaseNebulaTurbo9943.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageCameraOmegaHyperion2330.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485), j);
    }

    public PolarVoyageGestureDetectorPhoenixNovaX9940[] PolarVoyageRotateAnimationCyberCelestialDelta4768(Handler handler, PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce2288, PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce22882, PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce22883, PolarVoyageLiveDataScopeDeltaForce2288 polarVoyageLiveDataScopeDeltaForce22884) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageOnPreDrawListenerNebulaStormSpeed4376 polarVoyageOnPreDrawListenerNebulaStormSpeed4376 = new PolarVoyageOnPreDrawListenerNebulaStormSpeed4376(context);
        PolarVoyageViewPagerMegaAurora4578 polarVoyageViewPagerMegaAurora4578 = (PolarVoyageViewPagerMegaAurora4578) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageViewPagerMegaAurora4578;
        polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 5000L;
        polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageBitmapVisionAuroraPixel4705 = handler;
        polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageLiveDataScopeDeltaForce2288;
        polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageTextInputEditTextNebulaHero6651 = 50;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(!polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageMotionLayoutTransitionHeroVision4068);
        Handler handler2 = polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageBitmapVisionAuroraPixel4705;
        byte b = 0;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711((handler2 == null && polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageDiffUtilTurboStrike5735 == null) || !(handler2 == null || polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageDiffUtilTurboStrike5735 == null));
        polarVoyageOnPreDrawListenerNebulaStormSpeed4376.PolarVoyageMotionLayoutTransitionHeroVision4068 = true;
        arrayList.add(new PolarVoyageCrashlyticsCelestialFusionAlpha8057(polarVoyageOnPreDrawListenerNebulaStormSpeed4376));
        PolarVoyageOnItemClickListenerMasterDragonMax6359 polarVoyageOnItemClickListenerMasterDragonMax6359 = new PolarVoyageOnItemClickListenerMasterDragonMax6359(context);
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(!polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageItemDecorationUltraDeltaEpic7485);
        polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
        if (((PolarVoyageAlarmManagerAlphaInferno3493) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
            polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageAlarmManagerAlphaInferno3493(new PolarVoyageLiveDataQuantumSpeedNovaX2823[0]);
        }
        PolarVoyageAnnotationProcessorPixelRogueSpectra9718 polarVoyageAnnotationProcessorPixelRogueSpectra9718 = (PolarVoyageAnnotationProcessorPixelRogueSpectra9718) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageViewRogueMaster4778;
        PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590 = (PolarVoyageZoomStateAlphaVision6590) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageCameraPixelBlaze2629;
        if (polarVoyageAnnotationProcessorPixelRogueSpectra9718 == null) {
            if (polarVoyageZoomStateAlphaVision6590 == null) {
                polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageCameraPixelBlaze2629 = new PolarVoyageZoomStateAlphaVision6590(context, 15);
            }
            if (((PolarVoyageDelayNovaRogueBeta9839) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageBottomSheetOmegaNeo1907) == null) {
                polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageDelayNovaRogueBeta9839.PolarVoyageCameraViewSpectraMaxSpectra2824;
            }
            PolarVoyageAnimationSetMaxMaxBlaze1849 polarVoyageAnimationSetMaxMaxBlaze1849 = new PolarVoyageAnimationSetMaxMaxBlaze1849(context);
            Context context2 = polarVoyageAnimationSetMaxMaxBlaze1849.PolarVoyageZipVortexCelestial6185;
            if (context2 == null) {
                polarVoyageAnimationSetMaxMaxBlaze1849.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
            }
            PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision65902 = (PolarVoyageZoomStateAlphaVision6590) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageCameraPixelBlaze2629;
            polarVoyageAnimationSetMaxMaxBlaze1849.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageZoomStateAlphaVision65902;
            polarVoyageAnimationSetMaxMaxBlaze1849.PolarVoyageKotlinBetaPulseBeta3653 = (PolarVoyageDelayNovaRogueBeta9839) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageBottomSheetOmegaNeo1907;
            if (polarVoyageZoomStateAlphaVision65902 == null) {
                polarVoyageAnimationSetMaxMaxBlaze1849.PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageZoomStateAlphaVision6590(context2, 15);
            }
            polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageViewRogueMaster4778 = new PolarVoyageAnnotationProcessorPixelRogueSpectra9718(polarVoyageAnimationSetMaxMaxBlaze1849);
        } else {
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageZoomStateAlphaVision6590 == null);
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(((PolarVoyageDelayNovaRogueBeta9839) polarVoyageOnItemClickListenerMasterDragonMax6359.PolarVoyageBottomSheetOmegaNeo1907) == null);
        }
        arrayList.add(new PolarVoyageLifecycleTitaniumHyper4694(context, polarVoyageViewPagerMegaAurora4578, handler, polarVoyageLiveDataScopeDeltaForce22882, new PolarVoyageMediaPlayerDeltaQuantumHyper7669(polarVoyageOnItemClickListenerMasterDragonMax6359)));
        arrayList.add(new PolarVoyageImageCaptureVisionAlpha2558(polarVoyageLiveDataScopeDeltaForce22883, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new PolarVoyageTransitionManagerSolarSpeedTitanium7517(polarVoyageLiveDataScopeDeltaForce22884, looper));
        }
        arrayList.add(new PolarVoyageLifecycleCameraControllerFusionCosmosAlpha9026());
        arrayList.add(new PolarVoyageAsyncTaskVisionLegendHyper2151(new PolarVoyageViewPagerMegaAurora4578(context, b)));
        return (PolarVoyageGestureDetectorPhoenixNovaX9940[]) arrayList.toArray(new PolarVoyageGestureDetectorPhoenixNovaX9940[0]);
    }

    @Override // p000createpolar.PolarVoyageGradleAuroraTitanTitan7788
    public PolarVoyageEditTextNeoUltra9594 PolarVoyageSnackbarGammaEclipse2140() {
        return new PolarVoyageAdapterPhoenixNebula2708((Context) this.PolarVoyageStrictModeLegendEpic1532, ((PolarVoyageMotionSceneShadowBlazeVortex9875) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageSnackbarGammaEclipse2140());
    }

    public PolarVoyageMenuInfernoHyperion9167 PolarVoyageViewRogueMaster4778(PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356, PolarVoyageOnTouchListenerInfernoShadow9357 polarVoyageOnTouchListenerInfernoShadow9357) {
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int directPlaybackSupport;
        polarVoyageDisplayMetricsSpectraNeoHero6356.getClass();
        int i = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageFlingGestureEclipsePrimeMax1376;
        polarVoyageOnTouchListenerInfernoShadow9357.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return PolarVoyageMenuInfernoHyperion9167.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
        Context context = (Context) this.PolarVoyageStrictModeLegendEpic1532;
        Boolean bool = (Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageActivityInfoBetaQuantum8726(context).getParameters("offloadVariableRateSupported");
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Boolean.FALSE;
            }
            booleanValue = ((Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).booleanValue();
        }
        String str = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageSnackbarGammaEclipse2140;
        str.getClass();
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageMotionLayoutTransitionHeroVision4068(str, polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageBottomSheetOmegaNeo1907);
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 == 0 || i2 < PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageViewRogueMaster4778(PolarVoyageMotionLayoutTransitionHeroVision4068)) {
            return PolarVoyageMenuInfernoHyperion9167.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
        int PolarVoyageCameraPixelBlaze2629 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageCameraPixelBlaze2629(polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageCardViewAlphaVortexCelestial9747);
        if (PolarVoyageCameraPixelBlaze2629 == 0) {
            return PolarVoyageMenuInfernoHyperion9167.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(PolarVoyageCameraPixelBlaze2629).setEncoding(PolarVoyageMotionLayoutTransitionHeroVision4068).build();
            if (i2 >= 33) {
                directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, polarVoyageOnTouchListenerInfernoShadow9357.PolarVoyageZipVortexCelestial6185());
                if ((directPlaybackSupport & 1) == 0) {
                    return PolarVoyageMenuInfernoHyperion9167.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                }
                r4 = (directPlaybackSupport & 3) == 3;
                PolarVoyageNavigationViewCyberFusion7740 polarVoyageNavigationViewCyberFusion7740 = new PolarVoyageNavigationViewCyberFusion7740();
                polarVoyageNavigationViewCyberFusion7740.PolarVoyageZipVortexCelestial6185 = true;
                polarVoyageNavigationViewCyberFusion7740.PolarVoyageMotionLayoutTransitionHeroVision4068 = r4;
                polarVoyageNavigationViewCyberFusion7740.PolarVoyageKotlinBetaPulseBeta3653 = booleanValue;
                return polarVoyageNavigationViewCyberFusion7740.PolarVoyageZipVortexCelestial6185();
            }
            if (i2 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, polarVoyageOnTouchListenerInfernoShadow9357.PolarVoyageZipVortexCelestial6185());
                if (!isOffloadedPlaybackSupported) {
                    return PolarVoyageMenuInfernoHyperion9167.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                }
                PolarVoyageNavigationViewCyberFusion7740 polarVoyageNavigationViewCyberFusion77402 = new PolarVoyageNavigationViewCyberFusion7740();
                polarVoyageNavigationViewCyberFusion77402.PolarVoyageZipVortexCelestial6185 = true;
                polarVoyageNavigationViewCyberFusion77402.PolarVoyageKotlinBetaPulseBeta3653 = booleanValue;
                return polarVoyageNavigationViewCyberFusion77402.PolarVoyageZipVortexCelestial6185();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, polarVoyageOnTouchListenerInfernoShadow9357.PolarVoyageZipVortexCelestial6185());
            if (playbackOffloadSupport == 0) {
                return PolarVoyageMenuInfernoHyperion9167.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            }
            PolarVoyageNavigationViewCyberFusion7740 polarVoyageNavigationViewCyberFusion77403 = new PolarVoyageNavigationViewCyberFusion7740();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                r4 = true;
            }
            polarVoyageNavigationViewCyberFusion77403.PolarVoyageZipVortexCelestial6185 = true;
            polarVoyageNavigationViewCyberFusion77403.PolarVoyageMotionLayoutTransitionHeroVision4068 = r4;
            polarVoyageNavigationViewCyberFusion77403.PolarVoyageKotlinBetaPulseBeta3653 = booleanValue;
            return polarVoyageNavigationViewCyberFusion77403.PolarVoyageZipVortexCelestial6185();
        } catch (IllegalArgumentException unused) {
            return PolarVoyageMenuInfernoHyperion9167.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        }
    }

    @Override // p000createpolar.PolarVoyageScaleGestureDetectorDragonBlazeShadow4642
    public Object PolarVoyageZipVortexCelestial6185(Object obj) {
        Object obj2;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 10:
                return ((PolarVoyageScaleGestureDetectorDragonBlazeShadow4642) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185(((PolarVoyageScaleGestureDetectorDragonBlazeShadow4642) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(obj));
            case 28:
                Iterator it = ((List) this.PolarVoyageStrictModeLegendEpic1532).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((PolarVoyageLooperThreadMasterStrikeCyber7361) obj2).PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485(obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                PolarVoyageLooperThreadMasterStrikeCyber7361 polarVoyageLooperThreadMasterStrikeCyber7361 = (PolarVoyageLooperThreadMasterStrikeCyber7361) obj2;
                return polarVoyageLooperThreadMasterStrikeCyber7361 != null ? polarVoyageLooperThreadMasterStrikeCyber7361.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageViewRogueMaster4778(obj) : ((PolarVoyageInputFilterSpectraMega1999) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageViewRogueMaster4778(obj);
            default:
                PolarVoyageFlowShadowTurboInferno3903 polarVoyageFlowShadowTurboInferno3903 = (PolarVoyageFlowShadowTurboInferno3903) obj;
                polarVoyageFlowShadowTurboInferno3903.getClass();
                return (JSONObject) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageAlertDialogCyberHeroQuantum3938(((PolarVoyageZoomStateAlphaVision6590) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(polarVoyageFlowShadowTurboInferno3903), new JSONObject());
        }
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 4:
                return "AnimationResult(endReason=" + ((PolarVoyageDatabaseHyperSpeedSpark6640) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) + ", endState=" + ((PolarVoyageProcessCameraProviderPulseBetaHyper8687) this.PolarVoyageStrictModeLegendEpic1532) + ')';
            default:
                return super.toString();
        }
    }

    public PolarVoyageZoomStateAlphaVision6590(PolarVoyageOnLongClickListenerFusionDragon7075 polarVoyageOnLongClickListenerFusionDragon7075, PolarVoyageDelayNovaRogueBeta9839 polarVoyageDelayNovaRogueBeta9839) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 5;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = "ClientTelemetry.API";
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageOnLongClickListenerFusionDragon7075;
    }

    public PolarVoyageZoomStateAlphaVision6590(PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894, PolarVoyageZoomStateAlphaVision6590 polarVoyageZoomStateAlphaVision6590, PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageRealtimeDatabaseEclipseUltra8894;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageZoomStateAlphaVision6590;
    }

    public PolarVoyageZoomStateAlphaVision6590(PolarVoyageBottomSheetEpicQuantum9585 polarVoyageBottomSheetEpicQuantum9585) {
        Object polarVoyageTransitionEpicSpeed3675;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageBottomSheetEpicQuantum9585;
        int i = Build.VERSION.SDK_INT;
        int i2 = 1;
        char c = 1;
        char c2 = 1;
        if (i < 26) {
            boolean z = PolarVoyageValueAnimatorAuroraCelestial2506.PolarVoyageZipVortexCelestial6185;
        } else if (!PolarVoyageValueAnimatorAuroraCelestial2506.PolarVoyageZipVortexCelestial6185) {
            if (i != 26 && i != 27) {
                polarVoyageTransitionEpicSpeed3675 = new PolarVoyageTransitionEpicSpeed3675(i2, (boolean) (c2 == true ? 1 : 0));
            } else {
                polarVoyageTransitionEpicSpeed3675 = new PolarVoyageWithContextGammaMaster7108(14);
            }
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageTransitionEpicSpeed3675;
        }
        polarVoyageTransitionEpicSpeed3675 = new PolarVoyageTransitionEpicSpeed3675((int) (c == true ? 1 : 0), false);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageTransitionEpicSpeed3675;
    }

    public PolarVoyageZoomStateAlphaVision6590(Context context, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 15:
                this.PolarVoyageStrictModeLegendEpic1532 = context == null ? null : context.getApplicationContext();
                break;
            case 16:
                PolarVoyageMotionSceneShadowBlazeVortex9875 polarVoyageMotionSceneShadowBlazeVortex9875 = new PolarVoyageMotionSceneShadowBlazeVortex9875(3);
                this.PolarVoyageStrictModeLegendEpic1532 = context.getApplicationContext();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageMotionSceneShadowBlazeVortex9875;
                break;
            case 17:
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = context;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageFilterTurboThunderEclipse3279(1);
                break;
            case 18:
                this.PolarVoyageStrictModeLegendEpic1532 = context;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageViewPagerMegaAurora4578(context, (byte) 0);
                break;
        }
    }

    public /* synthetic */ PolarVoyageZoomStateAlphaVision6590(int i, Object obj, Object obj2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }

    public PolarVoyageZoomStateAlphaVision6590(MediaCodec.CryptoInfo cryptoInfo) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 14;
        this.PolarVoyageStrictModeLegendEpic1532 = cryptoInfo;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public PolarVoyageZoomStateAlphaVision6590(PolarVoyageCameraEliteHyperion3107 polarVoyageCameraEliteHyperion3107) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 19;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageCameraEliteHyperion3107;
    }

    public PolarVoyageZoomStateAlphaVision6590(PolarVoyageMeteringPointSolarMax4741 polarVoyageMeteringPointSolarMax4741) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 17;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageMeteringPointSolarMax4741;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new AtomicBoolean(false);
    }
}
