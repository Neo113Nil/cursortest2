package p000createpolar;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.polarvoyage.glacialoceans.icepathfinder.quest.R;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.zip.Adler32;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAlarmManagerAlphaInferno3493 implements PolarVoyageFocusMeteringActionAuroraFusionSpeed7565, PolarVoyageCoordinatorLayoutPhoenixHyperionForce5563, PolarVoyageScaleGestureDetectorDragonBlazeShadow4642, PolarVoyageServiceConnectionEliteSolarElite6332 {
    public static final Object PolarVoyageCameraPixelBlaze2629 = new Object();
    public static final PolarVoyagePaintFlagsDrawFilterHyperCosmosInferno5943 PolarVoyageDrawableDeltaHyperion5742;
    public static final PolarVoyagePaintFlagsDrawFilterHyperCosmosInferno5943 PolarVoyageSnackbarGammaEclipse2140;
    public static volatile PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageViewRogueMaster4778;
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;

    static {
        long j = -9223372036854775807L;
        PolarVoyageDrawableDeltaHyperion5742 = new PolarVoyagePaintFlagsDrawFilterHyperCosmosInferno5943(2, j);
        PolarVoyageSnackbarGammaEclipse2140 = new PolarVoyagePaintFlagsDrawFilterHyperCosmosInferno5943(3, j);
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        int i2 = 4;
        switch (i) {
            case 3:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageIntentServicePixelMaxElite4283(16);
                long[] jArr = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageKeyframeThunderMegaVortex8492();
                this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageConstraintLayoutVisionMasterDragon8646(i2);
                break;
            case 14:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageAdapterTitanSpark4027(1);
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageAdapterTitanSpark4027(1);
                this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageAdapterTitanSpark4027(1);
                break;
            case 22:
                PolarVoyageCamera2MasterPulse1881 polarVoyageCamera2MasterPulse1881 = PolarVoyageCamera2MasterPulse1881.PolarVoyageBottomSheetOmegaNeo1907;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new HashSet();
                this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageCamera2MasterPulse1881;
                break;
            default:
                this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageConstraintLayoutVisionMasterDragon8646(i2);
                break;
        }
    }

    public static PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageCameraPixelBlaze2629(Context context) {
        if (PolarVoyageViewRogueMaster4778 == null) {
            synchronized (PolarVoyageCameraPixelBlaze2629) {
                try {
                    if (PolarVoyageViewRogueMaster4778 == null) {
                        PolarVoyageViewRogueMaster4778 = new PolarVoyageAlarmManagerAlphaInferno3493(context, 0);
                    }
                } finally {
                }
            }
        }
        return PolarVoyageViewRogueMaster4778;
    }

    public void PolarVoyageActivityInfoBetaQuantum8726(PolarVoyageOnLongClickListenerRogueDeltaNova6437 polarVoyageOnLongClickListenerRogueDeltaNova6437) {
        ((PolarVoyageLocationManagerMasterMegaStrike4978) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnLongClickListenerRogueDeltaNova6437;
    }

    public void PolarVoyageAlertDialogCyberHeroQuantum3938(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.PolarVoyageBottomSheetOmegaNeo1907;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.PolarVoyageBottomSheetOmegaNeo1907 = null;
        }
        create = LoudnessCodecController.create(i, PolarVoyageAnimationSetHeroAurora9466.PolarVoyageItemDecorationUltraDeltaEpic7485, new PolarVoyageCountDownTimerSpeedDragon2988(this));
        this.PolarVoyageBottomSheetOmegaNeo1907 = create;
        Iterator it = ((HashSet) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public boolean PolarVoyageAnimatorSetSparkUltraMax8233() {
        return !(((PolarVoyageMotionEventBetaAlpha6640) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageStrictModeLegendEpic1532).isEmpty() && ((PolarVoyageMotionEventBetaAlpha6640) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageStrictModeLegendEpic1532).isEmpty() && ((PolarVoyageMotionEventBetaAlpha6640) ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageStrictModeLegendEpic1532).isEmpty());
    }

    @Override // p000createpolar.PolarVoyageFocusMeteringActionAuroraFusionSpeed7565
    public PolarVoyageViewEliteBeta6786 PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return (PolarVoyageFragmentTurboMax6129) this.PolarVoyageBottomSheetOmegaNeo1907;
            default:
                return (PolarVoyageWorkManagerTitanSpectra7413) this.PolarVoyageStrictModeLegendEpic1532;
        }
    }

    public Object PolarVoyageBitmapMaxTitanTitan7960(CharSequence charSequence, int i, int i2, int i3, boolean z, PolarVoyageColorDrawableVisionPhantomCyber4545 polarVoyageColorDrawableVisionPhantomCyber4545) {
        int i4;
        char c;
        PolarVoyagePagingPrimeMega1207 polarVoyagePagingPrimeMega1207 = new PolarVoyagePagingPrimeMega1207((PolarVoyageDragEventCosmosPixelShadow1538) ((PolarVoyageAnimatorCelestialDeltaMaster5821) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBottomSheetOmegaNeo1907);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageZipVortexCelestial6185;
                PolarVoyageDragEventCosmosPixelShadow1538 polarVoyageDragEventCosmosPixelShadow1538 = sparseArray == null ? null : (PolarVoyageDragEventCosmosPixelShadow1538) sparseArray.get(codePointAt);
                if (polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185 == 2) {
                    if (polarVoyageDragEventCosmosPixelShadow1538 != null) {
                        polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageDragEventCosmosPixelShadow1538;
                        polarVoyagePagingPrimeMega1207.PolarVoyageDiffUtilTurboStrike5735++;
                    } else {
                        if (codePointAt == 65038) {
                            polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185();
                        } else if (codePointAt != 65039) {
                            PolarVoyageDragEventCosmosPixelShadow1538 polarVoyageDragEventCosmosPixelShadow15382 = polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653;
                            if (polarVoyageDragEventCosmosPixelShadow15382.PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
                                if (polarVoyagePagingPrimeMega1207.PolarVoyageDiffUtilTurboStrike5735 != 1) {
                                    polarVoyagePagingPrimeMega1207.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageDragEventCosmosPixelShadow15382;
                                    polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185();
                                } else if (polarVoyagePagingPrimeMega1207.PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                                    polarVoyagePagingPrimeMega1207.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653;
                                    polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185();
                                } else {
                                    polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185();
                                }
                                c = 3;
                            } else {
                                polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (polarVoyageDragEventCosmosPixelShadow1538 == null) {
                    polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185();
                    c = 1;
                } else {
                    polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185 = 2;
                    polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageDragEventCosmosPixelShadow1538;
                    polarVoyagePagingPrimeMega1207.PolarVoyageDiffUtilTurboStrike5735 = 1;
                    c = 2;
                }
                polarVoyagePagingPrimeMega1207.PolarVoyageBitmapVisionAuroraPixel4705 = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !PolarVoyageContentProviderHyperSpark3838(charSequence, i4, i6, polarVoyagePagingPrimeMega1207.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                        z2 = polarVoyageColorDrawableVisionPhantomCyber4545.PolarVoyageBarcodeScannerInfernoSolarSpark7767(charSequence, i4, i6, polarVoyagePagingPrimeMega1207.PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        i5++;
                    }
                }
            }
        }
        if (polarVoyagePagingPrimeMega1207.PolarVoyageZipVortexCelestial6185 == 2 && polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068 != null && ((polarVoyagePagingPrimeMega1207.PolarVoyageDiffUtilTurboStrike5735 > 1 || polarVoyagePagingPrimeMega1207.PolarVoyageMotionLayoutTransitionHeroVision4068()) && i5 < i3 && z2 && (z || !PolarVoyageContentProviderHyperSpark3838(charSequence, i4, i6, polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068)))) {
            polarVoyageColorDrawableVisionPhantomCyber4545.PolarVoyageBarcodeScannerInfernoSolarSpark7767(charSequence, i4, i6, polarVoyagePagingPrimeMega1207.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068);
        }
        return polarVoyageColorDrawableVisionPhantomCyber4545.PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageConfigurationMegaTitaniumQuantum2348 polarVoyageConfigurationMegaTitaniumQuantum2348, PolarVoyageCameraAlphaStrikeNebula4137 polarVoyageCameraAlphaStrikeNebula4137) {
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027 = (PolarVoyageAdapterTitanSpark4027) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark40272 = (PolarVoyageAdapterTitanSpark4027) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark40273 = (PolarVoyageAdapterTitanSpark4027) this.PolarVoyageBottomSheetOmegaNeo1907;
        int ordinal = polarVoyageCameraAlphaStrikeNebula4137.ordinal();
        if (ordinal == 0) {
            polarVoyageAdapterTitanSpark4027.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
            polarVoyageAdapterTitanSpark40273.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
            return;
        }
        if (ordinal == 1) {
            polarVoyageAdapterTitanSpark40272.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
            polarVoyageAdapterTitanSpark40273.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
            return;
        }
        if (ordinal == 2) {
            if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageDrawableDeltaHyperion5742 != null) {
                polarVoyageAdapterTitanSpark40273.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
                return;
            } else {
                polarVoyageAdapterTitanSpark4027.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
                return;
            }
        }
        if (ordinal != 3) {
            PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
        } else if (polarVoyageConfigurationMegaTitaniumQuantum2348.PolarVoyageDrawableDeltaHyperion5742 != null) {
            polarVoyageAdapterTitanSpark40273.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
        } else {
            polarVoyageAdapterTitanSpark40272.PolarVoyageDiffUtilTurboStrike5735(polarVoyageConfigurationMegaTitaniumQuantum2348);
        }
    }

    public PolarVoyageCamera2DragonTitan3416 PolarVoyageBottomSheetOmegaNeo1907() {
        return ((PolarVoyageLocationManagerMasterMegaStrike4978) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653;
    }

    public void PolarVoyageCameraViewSpectraMaxSpectra2824(String str) {
        if (str != null) {
            this.PolarVoyageStrictModeLegendEpic1532 = str;
        } else {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("Null backendName");
        }
    }

    public boolean PolarVoyageContentProviderHyperSpark3838(CharSequence charSequence, int i, int i2, PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 polarVoyageInAppPurchaseStrikeQuantumTitanium4425) {
        if ((polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageKotlinBetaPulseBeta3653 & 3) == 0) {
            PolarVoyageViewPager2StormRogue3954 polarVoyageViewPager2StormRogue3954 = (PolarVoyageViewPager2StormRogue3954) this.PolarVoyageBottomSheetOmegaNeo1907;
            PolarVoyageContentObserverSparkPrimeSolar2299 PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068();
            int PolarVoyageZipVortexCelestial6185 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185(8);
            if (PolarVoyageZipVortexCelestial6185 != 0) {
                ((ByteBuffer) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).getShort(PolarVoyageZipVortexCelestial6185 + PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485);
            }
            polarVoyageViewPager2StormRogue3954.getClass();
            ThreadLocal threadLocal = PolarVoyageViewPager2StormRogue3954.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = polarVoyageViewPager2StormRogue3954.PolarVoyageZipVortexCelestial6185.hasGlyph(sb.toString());
            int i3 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageKotlinBetaPulseBeta3653 & 4;
            polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageKotlinBetaPulseBeta3653 = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageKotlinBetaPulseBeta3653 & 3) == 2;
    }

    public void PolarVoyageDiffUtilDragonSpeedEclipse6225() {
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = (PolarVoyageKeyframeThunderMegaVortex8492) this.PolarVoyageStrictModeLegendEpic1532;
        String str = (String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        List list = (List) polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageBottomSheetOmegaNeo1907(str);
        if (list != null) {
            list.remove((PolarVoyageFragmentPulseEliteDragon8768) this.PolarVoyageBottomSheetOmegaNeo1907);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageCameraPixelBlaze2629(str, list);
    }

    public PolarVoyageLayoutInfernoSpeed9711 PolarVoyageDiffUtilTurboStrike5735() {
        String str = ((String) this.PolarVoyageStrictModeLegendEpic1532) == null ? " backendName" : "";
        if (((PolarVoyageWithContextMasterSpeed4365) this.PolarVoyageBottomSheetOmegaNeo1907) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new PolarVoyageLayoutInfernoSpeed9711((String) this.PolarVoyageStrictModeLegendEpic1532, (byte[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, (PolarVoyageWithContextMasterSpeed4365) this.PolarVoyageBottomSheetOmegaNeo1907);
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Missing required properties:".concat(str));
        return null;
    }

    public void PolarVoyageDisplayMetricsVortexDragon9516(PolarVoyageOnGlobalLayoutListenerStrikeFusionAurora8505 polarVoyageOnGlobalLayoutListenerStrikeFusionAurora8505) {
        PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881 = (PolarVoyageClipboardManagerUltraRogue9881) ((HashMap) this.PolarVoyageStrictModeLegendEpic1532).remove(polarVoyageOnGlobalLayoutListenerStrikeFusionAurora8505);
        polarVoyageClipboardManagerUltraRogue9881.getClass();
        PolarVoyageInAppPurchaseMaxEpic8738 polarVoyageInAppPurchaseMaxEpic8738 = (PolarVoyageInAppPurchaseMaxEpic8738) ((PolarVoyageRemoteModelManagerPulseMaxNovaX6329) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageContentProviderHyperSpark3838.get(polarVoyageClipboardManagerUltraRogue9881);
        if (polarVoyageInAppPurchaseMaxEpic8738 != null) {
            synchronized (polarVoyageInAppPurchaseMaxEpic8738) {
                polarVoyageInAppPurchaseMaxEpic8738.PolarVoyageBarcodeScannerInfernoSolarSpark7767--;
            }
        }
    }

    public long PolarVoyageDrawableDeltaHyperion5742() {
        return ((PolarVoyageLocationManagerMasterMegaStrike4978) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public void PolarVoyageItemDecorationUltraDeltaEpic7485(Bundle bundle) {
        HashSet hashSet = (HashSet) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String string = ((Context) this.PolarVoyageBottomSheetOmegaNeo1907).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (PolarVoyageExoPlayerCelestialNeoThunder6671.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    PolarVoyageStrictModeLegendEpic1532((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new PolarVoyageToolbarNovaTitanSpeed3010(e);
            }
        }
    }

    @Override // p000createpolar.PolarVoyageCoordinatorLayoutPhoenixHyperionForce5563
    public void PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageSupervisorJobStrikeCelestialGamma8770 polarVoyageSupervisorJobStrikeCelestialGamma8770, PolarVoyageR8EpicBlaze3675 polarVoyageR8EpicBlaze3675, PolarVoyageTransformCyberVisionPhantom1406 polarVoyageTransformCyberVisionPhantom1406) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageSupervisorJobStrikeCelestialGamma8770;
        polarVoyageTransformCyberVisionPhantom1406.PolarVoyageZipVortexCelestial6185();
        polarVoyageTransformCyberVisionPhantom1406.PolarVoyageMotionLayoutTransitionHeroVision4068();
        PolarVoyageDrawerLayoutUltraMasterShadow4631 PolarVoyageSnackbarGammaEclipse21402 = polarVoyageR8EpicBlaze3675.PolarVoyageSnackbarGammaEclipse2140(polarVoyageTransformCyberVisionPhantom1406.PolarVoyageBarcodeScannerInfernoSolarSpark7767, 5);
        this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageSnackbarGammaEclipse21402;
        PolarVoyageSnackbarGammaEclipse21402.PolarVoyageKotlinBetaPulseBeta3653((PolarVoyageDisplayMetricsSpectraNeoHero6356) this.PolarVoyageStrictModeLegendEpic1532);
    }

    public void PolarVoyageLayerDrawableShadowTitaniumOmega1942(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.PolarVoyageBottomSheetOmegaNeo1907) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void PolarVoyageLifecycleOlympianOmega3762(long j) {
        ((PolarVoyageLocationManagerMasterMegaStrike4978) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j;
    }

    public void PolarVoyageLooperThreadAlphaPrime1279(PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577) {
        ((PolarVoyageLocationManagerMasterMegaStrike4978) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185 = polarVoyageEditTextAuroraHeroPulse9577;
    }

    public void PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageLayoutInfernoSpeed9711 polarVoyageLayoutInfernoSpeed9711, int i, boolean z) {
        PolarVoyageMeteringPointCelestialHeroMega3724 polarVoyageMeteringPointCelestialHeroMega3724 = (PolarVoyageMeteringPointCelestialHeroMega3724) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Context context = (Context) this.PolarVoyageBottomSheetOmegaNeo1907;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        String str = polarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185;
        adler32.update(str.getBytes(Charset.forName(Constants.ENCODING)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        PolarVoyageWithContextMasterSpeed4365 polarVoyageWithContextMasterSpeed4365 = polarVoyageLayoutInfernoSpeed9711.PolarVoyageKotlinBetaPulseBeta3653;
        adler32.update(allocate.putInt(PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageZipVortexCelestial6185(polarVoyageWithContextMasterSpeed4365)).array());
        byte[] bArr = polarVoyageLayoutInfernoSpeed9711.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageSnackbarGammaEclipse2140("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", polarVoyageLayoutInfernoSpeed9711);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((PolarVoyageExoPlayerNeoDelta8060) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageZipVortexCelestial6185(polarVoyageWithContextMasterSpeed4365))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(polarVoyageMeteringPointCelestialHeroMega3724.PolarVoyageZipVortexCelestial6185(polarVoyageWithContextMasterSpeed4365, longValue, i));
            Set set = ((PolarVoyageDataBindingForceDragonEclipse4522) polarVoyageMeteringPointCelestialHeroMega3724.PolarVoyageMotionLayoutTransitionHeroVision4068.get(polarVoyageWithContextMasterSpeed4365)).PolarVoyageKotlinBetaPulseBeta3653;
            if (set.contains(PolarVoyageFontFamilyForceStrikeCosmos6336.PolarVoyageItemDecorationUltraDeltaEpic7485)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(PolarVoyageFontFamilyForceStrikeCosmos6336.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(PolarVoyageFontFamilyForceStrikeCosmos6336.PolarVoyageStrictModeLegendEpic1532)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageZipVortexCelestial6185(polarVoyageWithContextMasterSpeed4365));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {polarVoyageLayoutInfernoSpeed9711, Integer.valueOf(value), Long.valueOf(polarVoyageMeteringPointCelestialHeroMega3724.PolarVoyageZipVortexCelestial6185(polarVoyageWithContextMasterSpeed4365, longValue, i)), valueOf, Integer.valueOf(i)};
            String PolarVoyageFlingGestureEclipsePrimeMax1376 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageFlingGestureEclipsePrimeMax1376("JobInfoScheduler");
            if (Log.isLoggable(PolarVoyageFlingGestureEclipsePrimeMax1376, 3)) {
                Log.d(PolarVoyageFlingGestureEclipsePrimeMax1376, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // p000createpolar.PolarVoyageCoordinatorLayoutPhoenixHyperionForce5563
    public void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312) {
        long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        long j;
        ((PolarVoyageSupervisorJobStrikeCelestialGamma8770) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getClass();
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        PolarVoyageSupervisorJobStrikeCelestialGamma8770 polarVoyageSupervisorJobStrikeCelestialGamma8770 = (PolarVoyageSupervisorJobStrikeCelestialGamma8770) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        synchronized (polarVoyageSupervisorJobStrikeCelestialGamma8770) {
            try {
                long j2 = polarVoyageSupervisorJobStrikeCelestialGamma8770.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j2 != -9223372036854775807L ? j2 + polarVoyageSupervisorJobStrikeCelestialGamma8770.PolarVoyageMotionLayoutTransitionHeroVision4068 : polarVoyageSupervisorJobStrikeCelestialGamma8770.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
            } finally {
            }
        }
        PolarVoyageSupervisorJobStrikeCelestialGamma8770 polarVoyageSupervisorJobStrikeCelestialGamma87702 = (PolarVoyageSupervisorJobStrikeCelestialGamma8770) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        synchronized (polarVoyageSupervisorJobStrikeCelestialGamma87702) {
            j = polarVoyageSupervisorJobStrikeCelestialGamma87702.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356 = (PolarVoyageDisplayMetricsSpectraNeoHero6356) this.PolarVoyageStrictModeLegendEpic1532;
        if (j != polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageBitmapMaxTitanTitan7960) {
            PolarVoyageServiceConnectionCelestialSpectraPulse4742 PolarVoyageZipVortexCelestial6185 = polarVoyageDisplayMetricsSpectraNeoHero6356.PolarVoyageZipVortexCelestial6185();
            PolarVoyageZipVortexCelestial6185.PolarVoyageAnimatorSetSparkUltraMax8233 = j;
            PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero63562 = new PolarVoyageDisplayMetricsSpectraNeoHero6356(PolarVoyageZipVortexCelestial6185);
            this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDisplayMetricsSpectraNeoHero63562;
            ((PolarVoyageDrawerLayoutUltraMasterShadow4631) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageKotlinBetaPulseBeta3653(polarVoyageDisplayMetricsSpectraNeoHero63562);
        }
        int PolarVoyageZipVortexCelestial61852 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185();
        ((PolarVoyageDrawerLayoutUltraMasterShadow4631) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageZipVortexCelestial61852, polarVoyageTextRecognitionHeroOmega1312);
        ((PolarVoyageDrawerLayoutUltraMasterShadow4631) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185(PolarVoyageBarcodeScannerInfernoSolarSpark7767, 1, PolarVoyageZipVortexCelestial61852, 0, null);
    }

    public boolean PolarVoyageNavigationViewHyperHyperHyperion1793() {
        return ((PolarVoyageCameraXBetaInfernoNeo3157) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) != null;
    }

    public void PolarVoyagePackageManagerCelestialPhoenix8393(PolarVoyageCamera2DragonTitan3416 polarVoyageCamera2DragonTitan3416) {
        ((PolarVoyageLocationManagerMasterMegaStrike4978) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCamera2DragonTitan3416;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r1.PolarVoyageBottomSheetOmegaNeo1907 != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (r1.PolarVoyageBottomSheetOmegaNeo1907 != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyageEditTextNeoUltra9594 polarVoyageEditTextNeoUltra9594, Uri uri, Map map, long j, long j2, PolarVoyageAssetManagerMasterQuantumHyper3660 polarVoyageAssetManagerMasterQuantumHyper3660) {
        PolarVoyageBroadcastSpectraStormHyper8513 polarVoyageBroadcastSpectraStormHyper8513 = new PolarVoyageBroadcastSpectraStormHyper8513(polarVoyageEditTextNeoUltra9594, j, j2);
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageBroadcastSpectraStormHyper8513;
        if (((PolarVoyageEditTextNovaXUltraPrime4283) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) != null) {
            return;
        }
        PolarVoyageEditTextNovaXUltraPrime4283[] PolarVoyageDiffUtilTurboStrike5735 = ((PolarVoyageRotateDrawableVisionThunder3097) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageDiffUtilTurboStrike5735(uri, map);
        int length = PolarVoyageDiffUtilTurboStrike5735.length;
        PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageRemoteModelManagerOlympianCelestial9141("expectedSize", length);
        PolarVoyageDatabasePhantomBeta6832 polarVoyageDatabasePhantomBeta6832 = new PolarVoyageDatabasePhantomBeta6832(length);
        boolean z = true;
        if (PolarVoyageDiffUtilTurboStrike5735.length == 1) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDiffUtilTurboStrike5735[0];
        } else {
            int length2 = PolarVoyageDiffUtilTurboStrike5735.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                PolarVoyageEditTextNovaXUltraPrime4283 polarVoyageEditTextNovaXUltraPrime4283 = PolarVoyageDiffUtilTurboStrike5735[i];
                try {
                } catch (EOFException unused) {
                    if (((PolarVoyageEditTextNovaXUltraPrime4283) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                    }
                } catch (Throwable th) {
                    if (((PolarVoyageEditTextNovaXUltraPrime4283) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null && polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageBottomSheetOmegaNeo1907 != j) {
                        z = false;
                    }
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(z);
                    polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageCameraPixelBlaze2629 = 0;
                    throw th;
                }
                if (polarVoyageEditTextNovaXUltraPrime4283.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageBroadcastSpectraStormHyper8513)) {
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageEditTextNovaXUltraPrime4283;
                    polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageCameraPixelBlaze2629 = 0;
                    break;
                }
                polarVoyageDatabasePhantomBeta6832.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageEditTextNovaXUltraPrime4283.PolarVoyageBarcodeScannerInfernoSolarSpark7767());
                if (((PolarVoyageEditTextNovaXUltraPrime4283) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                }
                boolean z2 = true;
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageFCMCelestialCosmosPixel3711(z2);
                polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageCameraPixelBlaze2629 = 0;
                i++;
            }
            if (((PolarVoyageEditTextNovaXUltraPrime4283) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                PolarVoyageAssetManagerEclipseHyperInferno7091 polarVoyageAssetManagerEclipseHyperInferno7091 = new PolarVoyageAssetManagerEclipseHyperInferno7091(", ");
                Iterator it = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageClipboardManagerAuroraPixel8666(PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageViewRogueMaster4778(PolarVoyageDiffUtilTurboStrike5735), new PolarVoyageCamera2MasterPulse1881(20)).iterator();
                StringBuilder sb2 = new StringBuilder();
                polarVoyageAssetManagerEclipseHyperInferno7091.PolarVoyageZipVortexCelestial6185(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String sb3 = sb.toString();
                uri.getClass();
                throw new PolarVoyageRecyclerViewStrikeHyperionTitan1853(sb3, polarVoyageDatabasePhantomBeta6832.PolarVoyageDiffUtilTurboStrike5735());
            }
        }
        ((PolarVoyageEditTextNovaXUltraPrime4283) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageDiffUtilTurboStrike5735(polarVoyageAssetManagerMasterQuantumHyper3660);
    }

    public void PolarVoyageRotateAnimationCyberCelestialDelta4768(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyagePaintFlagsDrawFilterBlazeStrike2679 polarVoyagePaintFlagsDrawFilterBlazeStrike2679 = new PolarVoyagePaintFlagsDrawFilterBlazeStrike2679(byteArrayOutputStream, hashMap, (HashMap) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, (PolarVoyageScrollViewShadowCyberInferno3272) this.PolarVoyageBottomSheetOmegaNeo1907);
        PolarVoyageScrollViewShadowCyberInferno3272 polarVoyageScrollViewShadowCyberInferno3272 = (PolarVoyageScrollViewShadowCyberInferno3272) hashMap.get(obj.getClass());
        if (polarVoyageScrollViewShadowCyberInferno3272 != null) {
            polarVoyageScrollViewShadowCyberInferno3272.PolarVoyageZipVortexCelestial6185(obj, polarVoyagePaintFlagsDrawFilterBlazeStrike2679);
            return;
        }
        throw new PolarVoyageMapThunderAurora9698("No encoder for " + obj.getClass());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(88:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(85:281|282|(1:24)|25|26|27|(1:29)|278|31|32|(3:253|254|(80:256|(72:258|(1:260)|35|(1:37)|38|(1:40)|41|(63:43|(1:238)|47|(1:49)|50|(1:52)(2:228|(1:233)(1:232))|53|(1:55)(1:227)|56|(1:58)(5:215|(1:217)|218|(1:220)(1:226)|(1:222)(2:223|(1:225)))|59|(1:61)(6:197|(4:200|(2:208|209)(1:206)|207|198)|210|211|(1:213)|214)|62|(1:64)(1:196)|(1:66)|67|(45:192|193|(1:73)|74|(1:76)(1:187)|77|(1:79)|80|(37:182|(1:186)|(1:84)|85|(33:177|(1:181)|(1:89)|90|(29:174|(1:176)|(1:94)|95|(25:170|171|(1:99)|100|(3:160|161|(22:163|(1:165)|166|(1:104)|105|(4:145|146|147|(2:149|(16:151|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)|121|(1:123)|124|(1:144)|126|(4:133|134|(1:136)(1:139)|137)|128|(1:130)|131|132)(2:152|153))(2:154|155))|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)(2:167|168))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|69|(45:188|189|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|239|(2:248|249)|(1:247)(1:246)|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|261|(75:263|(1:265)|35|(0)|38|(0)|41|(0)|239|(1:241)|248|249|(1:244)|247|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)(1:274)|266|(3:268|(1:270)(1:272)|271)|273|35|(0)|38|(0)|41|(0)|239|(0)|248|249|(0)|247|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132))|34|35|(0)|38|(0)|41|(0)|239|(0)|248|249|(0)|247|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|22|(0)|25|26|27|(0)|278|31|32|(0)|34|35|(0)|38|(0)|41|(0)|239|(0)|248|249|(0)|247|47|(0)|50|(0)(0)|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132) */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0205, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0206, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00c3, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0614 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0394 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[Catch: NameNotFoundException -> 0x00c2, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x00c2, blocks: (B:27:0x00b6, B:29:0x00bc), top: B:26:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04da  */
    /* JADX WARN: Type inference failed for: r0v125, types: [int] */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v206 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean PolarVoyageSnackbarGammaEclipse2140() {
        PolarVoyageAsyncTaskPrimeForceThunder9800 polarVoyageAsyncTaskPrimeForceThunder9800;
        FirebaseMessagingService firebaseMessagingService;
        PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        AtomicInteger atomicInteger;
        String packageName;
        PackageManager packageManager;
        String PolarVoyageNavigationViewHyperHyperHyperion1793;
        String PolarVoyageNavigationViewHyperHyperHyperion17932;
        String PolarVoyageDisplayMetricsVortexDragon9516;
        int i;
        int i2;
        String PolarVoyageDisplayMetricsVortexDragon95162;
        Uri defaultUri;
        String PolarVoyageDisplayMetricsVortexDragon95163;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String PolarVoyageDisplayMetricsVortexDragon95164;
        Integer valueOf;
        boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String PolarVoyageDisplayMetricsVortexDragon95165;
        Integer PolarVoyageSnackbarGammaEclipse21402;
        Integer PolarVoyageSnackbarGammaEclipse21403;
        Integer PolarVoyageSnackbarGammaEclipse21404;
        String PolarVoyageDisplayMetricsVortexDragon95166;
        Long valueOf2;
        JSONArray PolarVoyageRemoteModelManagerOlympianCelestial9141;
        long[] jArr;
        JSONArray PolarVoyageRemoteModelManagerOlympianCelestial91412;
        int[] iArr;
        ?? r0;
        String PolarVoyageDisplayMetricsVortexDragon95167;
        IconCompat iconCompat;
        boolean z;
        int i3;
        ApplicationInfo applicationInfo;
        if (((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String PolarVoyageDisplayMetricsVortexDragon95168 = ((PolarVoyageAdapterTitanSpark4027) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.image");
        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95168)) {
            try {
                polarVoyageAsyncTaskPrimeForceThunder9800 = new PolarVoyageAsyncTaskPrimeForceThunder9800(new URL(PolarVoyageDisplayMetricsVortexDragon95168));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + PolarVoyageDisplayMetricsVortexDragon95168);
            }
            if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                ExecutorService executorService = (ExecutorService) this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyageRotateDrawableTurboHyperDelta7408 polarVoyageRotateDrawableTurboHyperDelta7408 = new PolarVoyageRotateDrawableTurboHyperDelta7408();
                polarVoyageAsyncTaskPrimeForceThunder9800.PolarVoyageStrictModeLegendEpic1532 = executorService.submit(new PolarVoyageMediaPlayerNebulaTurboLegend3509(20, polarVoyageAsyncTaskPrimeForceThunder9800, polarVoyageRotateDrawableTurboHyperDelta7408));
                polarVoyageAsyncTaskPrimeForceThunder9800.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageRotateDrawableTurboHyperDelta7408.PolarVoyageZipVortexCelestial6185;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            polarVoyageAdapterTitanSpark4027 = (PolarVoyageAdapterTitanSpark4027) this.PolarVoyageBottomSheetOmegaNeo1907;
            AtomicInteger atomicInteger2 = PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String PolarVoyageDisplayMetricsVortexDragon95169 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95169)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(PolarVoyageDisplayMetricsVortexDragon95169);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + PolarVoyageDisplayMetricsVortexDragon95169 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        atomicInteger = PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze7795 = new PolarVoyageMotionEventEclipseThunderBlaze7795(firebaseMessagingService, PolarVoyageDisplayMetricsVortexDragon95169);
                        PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion1793)) {
                            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageNavigationViewHyperHyperHyperion1793);
                        }
                        PolarVoyageNavigationViewHyperHyperHyperion17932 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion17932)) {
                            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageNavigationViewHyperHyperHyperion17932);
                            PolarVoyageTextInputLayoutHeroTitaniumQuantum9958 polarVoyageTextInputLayoutHeroTitaniumQuantum9958 = new PolarVoyageTextInputLayoutHeroTitaniumQuantum9958();
                            polarVoyageTextInputLayoutHeroTitaniumQuantum9958.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageNavigationViewHyperHyperHyperion17932);
                            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageTextInputLayoutHeroTitaniumQuantum9958);
                        }
                        PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.icon");
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon9516)) {
                            i2 = resources.getIdentifier(PolarVoyageDisplayMetricsVortexDragon9516, "drawable", packageName);
                            if ((i2 == 0 || !PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185(resources, i2)) && ((i2 = resources.getIdentifier(PolarVoyageDisplayMetricsVortexDragon9516, "mipmap", packageName)) == 0 || !PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185(resources, i2))) {
                                Log.w("FirebaseMessaging", "Icon resource " + PolarVoyageDisplayMetricsVortexDragon9516 + " not found. Notification will use default icon.");
                            }
                            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.icon = i2;
                            PolarVoyageDisplayMetricsVortexDragon95162 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.sound2");
                            if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                                PolarVoyageDisplayMetricsVortexDragon95162 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.sound");
                            }
                            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                                defaultUri = null;
                            } else if ("default".equals(PolarVoyageDisplayMetricsVortexDragon95162) || resources.getIdentifier(PolarVoyageDisplayMetricsVortexDragon95162, "raw", packageName) == 0) {
                                defaultUri = RingtoneManager.getDefaultUri(2);
                            } else {
                                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + PolarVoyageDisplayMetricsVortexDragon95162);
                            }
                            if (defaultUri == null) {
                                Notification notification = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                notification.sound = defaultUri;
                                notification.audioStreamType = -1;
                                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                            }
                            PolarVoyageDisplayMetricsVortexDragon95163 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.click_action");
                            if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95163)) {
                                launchIntentForPackage = new Intent(PolarVoyageDisplayMetricsVortexDragon95163);
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setFlags(268435456);
                            } else {
                                String PolarVoyageDisplayMetricsVortexDragon951610 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.link_android");
                                if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon951610)) {
                                    PolarVoyageDisplayMetricsVortexDragon951610 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.link");
                                }
                                Uri parse = !TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon951610) ? Uri.parse(PolarVoyageDisplayMetricsVortexDragon951610) : null;
                                if (parse != null) {
                                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setData(parse);
                                } else {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                    if (launchIntentForPackage == null) {
                                        Log.w("FirebaseMessaging", "No activity found to launch app");
                                    }
                                }
                            }
                            if (launchIntentForPackage != null) {
                                activity = null;
                            } else {
                                launchIntentForPackage.addFlags(67108864);
                                Bundle bundle3 = (Bundle) polarVoyageAdapterTitanSpark4027.PolarVoyageStrictModeLegendEpic1532;
                                Bundle bundle4 = new Bundle(bundle3);
                                for (String str : bundle3.keySet()) {
                                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                        bundle4.remove(str);
                                    }
                                }
                                launchIntentForPackage.putExtras(bundle4);
                                if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("google.c.a.e")) {
                                    launchIntentForPackage.putExtra("gcm.n.analytics_data", polarVoyageAdapterTitanSpark4027.PolarVoyageLifecycleOlympianOmega3762());
                                }
                                activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                            }
                            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageTextInputEditTextNebulaHero6651 = activity;
                            broadcast = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(polarVoyageAdapterTitanSpark4027.PolarVoyageLifecycleOlympianOmega3762())), 1140850688);
                            if (broadcast != null) {
                                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.deleteIntent = broadcast;
                            }
                            PolarVoyageDisplayMetricsVortexDragon95164 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.color");
                            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95164)) {
                                try {
                                    valueOf = Integer.valueOf(Color.parseColor(PolarVoyageDisplayMetricsVortexDragon95164));
                                } catch (IllegalArgumentException unused2) {
                                    Log.w("FirebaseMessaging", "Color is invalid: " + PolarVoyageDisplayMetricsVortexDragon95164 + ". Notification will use default color.");
                                }
                                if (valueOf != null) {
                                    polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageSnackbarGammaEclipse2140 = valueOf.intValue();
                                }
                                PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
                                Notification notification2 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                                    notification2.flags |= 16;
                                } else {
                                    notification2.flags &= -17;
                                }
                                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
                                PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
                                if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
                                    polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.tickerText = PolarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageDisplayMetricsVortexDragon95165);
                                }
                                PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
                                if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                                    if (PolarVoyageSnackbarGammaEclipse21402.intValue() < -2 || PolarVoyageSnackbarGammaEclipse21402.intValue() > 2) {
                                        Log.w("FirebaseMessaging", "notificationPriority is invalid " + PolarVoyageSnackbarGammaEclipse21402 + ". Skipping setting notificationPriority.");
                                    }
                                    if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                                        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageSnackbarGammaEclipse21402.intValue();
                                    }
                                    PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
                                    if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                                        if (PolarVoyageSnackbarGammaEclipse21403.intValue() < -1 || PolarVoyageSnackbarGammaEclipse21403.intValue() > 1) {
                                            Log.w("NotificationParams", "visibility is invalid: " + PolarVoyageSnackbarGammaEclipse21403 + ". Skipping setting visibility.");
                                        }
                                        if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                                            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageContentProviderHyperSpark3838 = PolarVoyageSnackbarGammaEclipse21403.intValue();
                                        }
                                        PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                                        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                            if (PolarVoyageSnackbarGammaEclipse21404.intValue() < 0) {
                                                Log.w("FirebaseMessaging", "notificationCount is invalid: " + PolarVoyageSnackbarGammaEclipse21404 + ". Skipping setting notificationCount.");
                                            }
                                            if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageSnackbarGammaEclipse21404.intValue();
                                            }
                                            PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                                                try {
                                                    valueOf2 = Long.valueOf(Long.parseLong(PolarVoyageDisplayMetricsVortexDragon95166));
                                                } catch (NumberFormatException unused3) {
                                                    Log.w("NotificationParams", "Couldn't parse value of " + PolarVoyageAdapterTitanSpark4027.PolarVoyageToolbarEclipseInfernoHero6368("gcm.n.event_time") + "(" + PolarVoyageDisplayMetricsVortexDragon95166 + ") into a long");
                                                }
                                                if (valueOf2 != null) {
                                                    polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBottomSheetOmegaNeo1907 = true;
                                                    polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.when = valueOf2.longValue();
                                                }
                                                PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                                                if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                                                    try {
                                                    } catch (NumberFormatException | JSONException unused4) {
                                                        Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + PolarVoyageRemoteModelManagerOlympianCelestial9141 + ". Skipping setting vibrateTimings.");
                                                    }
                                                    if (PolarVoyageRemoteModelManagerOlympianCelestial9141.length() <= 1) {
                                                        throw new JSONException("vibrateTimings have invalid length");
                                                    }
                                                    int length = PolarVoyageRemoteModelManagerOlympianCelestial9141.length();
                                                    jArr = new long[length];
                                                    for (int i4 = 0; i4 < length; i4++) {
                                                        jArr[i4] = PolarVoyageRemoteModelManagerOlympianCelestial9141.optLong(i4);
                                                    }
                                                    if (jArr != null) {
                                                        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.vibrate = jArr;
                                                    }
                                                    PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                                                    if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                                                        iArr = new int[3];
                                                        try {
                                                        } catch (IllegalArgumentException e) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + PolarVoyageRemoteModelManagerOlympianCelestial91412 + ". " + e.getMessage() + ". Skipping setting LightSettings");
                                                        } catch (JSONException unused5) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + PolarVoyageRemoteModelManagerOlympianCelestial91412 + ". Skipping setting LightSettings");
                                                        }
                                                        if (PolarVoyageRemoteModelManagerOlympianCelestial91412.length() != 3) {
                                                            throw new JSONException("lightSettings don't have all three fields");
                                                        }
                                                        int parseColor = Color.parseColor(PolarVoyageRemoteModelManagerOlympianCelestial91412.optString(0));
                                                        if (parseColor == -16777216) {
                                                            throw new IllegalArgumentException("Transparent color is invalid");
                                                        }
                                                        iArr[0] = parseColor;
                                                        iArr[1] = PolarVoyageRemoteModelManagerOlympianCelestial91412.optInt(1);
                                                        iArr[2] = PolarVoyageRemoteModelManagerOlympianCelestial91412.optInt(2);
                                                        if (iArr != null) {
                                                            int i5 = iArr[0];
                                                            int i6 = iArr[1];
                                                            int i7 = iArr[2];
                                                            Notification notification3 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                                            notification3.ledARGB = i5;
                                                            notification3.ledOnMS = i6;
                                                            notification3.ledOffMS = i7;
                                                            notification3.flags = ((i6 == 0 || i7 == 0) ? 0 : 1) | ((-2) & notification3.flags);
                                                        }
                                                        boolean PolarVoyageRotateAnimationCyberCelestialDelta47682 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                                        boolean z2 = PolarVoyageRotateAnimationCyberCelestialDelta47682;
                                                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                                            z2 = (PolarVoyageRotateAnimationCyberCelestialDelta47682 ? 1 : 0) | 2;
                                                        }
                                                        r0 = z2;
                                                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                                            r0 = (z2 ? 1 : 0) | 4;
                                                        }
                                                        Notification notification4 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                                        notification4.defaults = r0;
                                                        if ((r0 & 4) != 0) {
                                                            notification4.flags |= 1;
                                                        }
                                                        PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                                            PolarVoyageDisplayMetricsVortexDragon95167 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                        }
                                                        String str2 = PolarVoyageDisplayMetricsVortexDragon95167;
                                                        if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                                            try {
                                                                PolarVoyageDialogFragmentTitanCelestial7995 polarVoyageDialogFragmentTitanCelestial7995 = polarVoyageAsyncTaskPrimeForceThunder9800.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                                                                PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageDialogFragmentTitanCelestial7995);
                                                                Bitmap bitmap = (Bitmap) PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageDialogFragmentTitanCelestial7995, 5L);
                                                                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageKotlinBetaPulseBeta3653(bitmap);
                                                                PolarVoyageConfigurationSpectraCyber7631 polarVoyageConfigurationSpectraCyber7631 = new PolarVoyageConfigurationSpectraCyber7631();
                                                                if (bitmap == null) {
                                                                    iconCompat = null;
                                                                    z = true;
                                                                } else {
                                                                    z = true;
                                                                    iconCompat = new IconCompat(1);
                                                                    iconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068 = bitmap;
                                                                }
                                                                polarVoyageConfigurationSpectraCyber7631.PolarVoyageMotionLayoutTransitionHeroVision4068 = iconCompat;
                                                                polarVoyageConfigurationSpectraCyber7631.PolarVoyageKotlinBetaPulseBeta3653 = null;
                                                                polarVoyageConfigurationSpectraCyber7631.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = z;
                                                                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageConfigurationSpectraCyber7631);
                                                            } catch (InterruptedException unused6) {
                                                                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                polarVoyageAsyncTaskPrimeForceThunder9800.close();
                                                                Thread.currentThread().interrupt();
                                                            } catch (ExecutionException e2) {
                                                                Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
                                                            } catch (TimeoutException unused7) {
                                                                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                polarVoyageAsyncTaskPrimeForceThunder9800.close();
                                                            }
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                            Log.d("FirebaseMessaging", "Showing notification");
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str2, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                                        return true;
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean PolarVoyageRotateAnimationCyberCelestialDelta476822 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                                    boolean z22 = PolarVoyageRotateAnimationCyberCelestialDelta476822;
                                                    if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    r0 = z22;
                                                    if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                                    }
                                                    Notification notification42 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                                    notification42.defaults = r0;
                                                    if ((r0 & 4) != 0) {
                                                    }
                                                    PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                                    if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                                    }
                                                    String str22 = PolarVoyageDisplayMetricsVortexDragon95167;
                                                    if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str22, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                                    return true;
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                                                if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean PolarVoyageRotateAnimationCyberCelestialDelta4768222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                                boolean z222 = PolarVoyageRotateAnimationCyberCelestialDelta4768222;
                                                if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                                }
                                                r0 = z222;
                                                if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification422 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                                notification422.defaults = r0;
                                                if ((r0 & 4) != 0) {
                                                }
                                                PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                                if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                                }
                                                String str222 = PolarVoyageDisplayMetricsVortexDragon95167;
                                                if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                                return true;
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                                            if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                                            if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean PolarVoyageRotateAnimationCyberCelestialDelta47682222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                            boolean z2222 = PolarVoyageRotateAnimationCyberCelestialDelta47682222;
                                            if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                            }
                                            r0 = z2222;
                                            if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification4222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                            notification4222.defaults = r0;
                                            if ((r0 & 4) != 0) {
                                            }
                                            PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                            if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                            }
                                            String str2222 = PolarVoyageDisplayMetricsVortexDragon95167;
                                            if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str2222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                            return true;
                                        }
                                        PolarVoyageSnackbarGammaEclipse21404 = null;
                                        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                        }
                                        PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                                        if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                                        if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean PolarVoyageRotateAnimationCyberCelestialDelta476822222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                        boolean z22222 = PolarVoyageRotateAnimationCyberCelestialDelta476822222;
                                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                        }
                                        r0 = z22222;
                                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification42222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                        notification42222.defaults = r0;
                                        if ((r0 & 4) != 0) {
                                        }
                                        PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                        }
                                        String str22222 = PolarVoyageDisplayMetricsVortexDragon95167;
                                        if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str22222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                        return true;
                                    }
                                    PolarVoyageSnackbarGammaEclipse21403 = null;
                                    if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                                    }
                                    PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                                    if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                    }
                                    PolarVoyageSnackbarGammaEclipse21404 = null;
                                    if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                    }
                                    PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                                    if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                                    if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean PolarVoyageRotateAnimationCyberCelestialDelta4768222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                    boolean z222222 = PolarVoyageRotateAnimationCyberCelestialDelta4768222222;
                                    if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                    }
                                    r0 = z222222;
                                    if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification422222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                    notification422222.defaults = r0;
                                    if ((r0 & 4) != 0) {
                                    }
                                    PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                    if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                    }
                                    String str222222 = PolarVoyageDisplayMetricsVortexDragon95167;
                                    if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str222222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                    return true;
                                }
                                PolarVoyageSnackbarGammaEclipse21402 = null;
                                if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
                                if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21403 = null;
                                if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                                if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21404 = null;
                                if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                }
                                PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                                if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                                if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                                if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean PolarVoyageRotateAnimationCyberCelestialDelta47682222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                boolean z2222222 = PolarVoyageRotateAnimationCyberCelestialDelta47682222222;
                                if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z2222222;
                                if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                }
                                Notification notification4222222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                notification4222222.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                }
                                String str2222222 = PolarVoyageDisplayMetricsVortexDragon95167;
                                if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str2222222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                return true;
                            }
                            i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (i3 != 0) {
                                try {
                                    valueOf = Integer.valueOf(firebaseMessagingService.getColor(i3));
                                } catch (Resources.NotFoundException unused8) {
                                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                }
                                if (valueOf != null) {
                                }
                                PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
                                Notification notification22 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                                }
                                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
                                PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
                                if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
                                if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21402 = null;
                                if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
                                if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21403 = null;
                                if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                                if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                }
                                PolarVoyageSnackbarGammaEclipse21404 = null;
                                if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                                }
                                PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                                if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                                if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                                if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean PolarVoyageRotateAnimationCyberCelestialDelta476822222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                                boolean z22222222 = PolarVoyageRotateAnimationCyberCelestialDelta476822222222;
                                if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z22222222;
                                if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                                }
                                Notification notification42222222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                                notification42222222.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                                if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                                }
                                String str22222222 = PolarVoyageDisplayMetricsVortexDragon95167;
                                if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str22222222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                                return true;
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
                            Notification notification222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                            if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                            }
                            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
                            PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
                            if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
                            }
                            PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
                            if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                            }
                            PolarVoyageSnackbarGammaEclipse21402 = null;
                            if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                            }
                            PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
                            if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                            }
                            PolarVoyageSnackbarGammaEclipse21403 = null;
                            if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                            }
                            PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                            if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                            }
                            PolarVoyageSnackbarGammaEclipse21404 = null;
                            if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                            }
                            PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                            if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                            if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean PolarVoyageRotateAnimationCyberCelestialDelta4768222222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                            boolean z222222222 = PolarVoyageRotateAnimationCyberCelestialDelta4768222222222;
                            if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z222222222;
                            if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                            }
                            Notification notification422222222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                            notification422222222.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                            if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                            }
                            String str222222222 = PolarVoyageDisplayMetricsVortexDragon95167;
                            if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str222222222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                            return true;
                        }
                        i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i != 0 || !PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185(resources, i)) {
                            i = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i2 = (i == 0 && PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185(resources, i)) ? i : 17301651;
                        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233.icon = i2;
                        PolarVoyageDisplayMetricsVortexDragon95162 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.sound2");
                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                        }
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                        }
                        if (defaultUri == null) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95163 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.click_action");
                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95163)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageTextInputEditTextNebulaHero6651 = activity;
                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95164 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.color");
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95164)) {
                        }
                        i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i3 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
                        Notification notification2222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                        if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                        }
                        polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
                        PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
                        if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
                        if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21402 = null;
                        if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
                        if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21403 = null;
                        if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21404 = null;
                        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                        if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                        if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean PolarVoyageRotateAnimationCyberCelestialDelta47682222222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                        boolean z2222222222 = PolarVoyageRotateAnimationCyberCelestialDelta47682222222222;
                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z2222222222;
                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                        }
                        Notification notification4222222222 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
                        notification4222222222.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                        }
                        String str2222222222 = PolarVoyageDisplayMetricsVortexDragon95167;
                        if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str2222222222, 0, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185());
                        return true;
                    }
                    PolarVoyageDisplayMetricsVortexDragon95169 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95169)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(PolarVoyageDisplayMetricsVortexDragon95169);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        atomicInteger = PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185;
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze77952 = new PolarVoyageMotionEventEclipseThunderBlaze7795(firebaseMessagingService, PolarVoyageDisplayMetricsVortexDragon95169);
                        PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion1793)) {
                        }
                        PolarVoyageNavigationViewHyperHyperHyperion17932 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion17932)) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.icon");
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon9516)) {
                        }
                        i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i != 0) {
                        }
                        i = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i == 0) {
                        }
                        polarVoyageMotionEventEclipseThunderBlaze77952.PolarVoyageAnimatorSetSparkUltraMax8233.icon = i2;
                        PolarVoyageDisplayMetricsVortexDragon95162 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.sound2");
                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                        }
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                        }
                        if (defaultUri == null) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95163 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.click_action");
                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95163)) {
                        }
                        if (launchIntentForPackage != null) {
                        }
                        polarVoyageMotionEventEclipseThunderBlaze77952.PolarVoyageTextInputEditTextNebulaHero6651 = activity;
                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95164 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.color");
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95164)) {
                        }
                        i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i3 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
                        Notification notification22222 = polarVoyageMotionEventEclipseThunderBlaze77952.PolarVoyageAnimatorSetSparkUltraMax8233;
                        if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                        }
                        polarVoyageMotionEventEclipseThunderBlaze77952.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
                        PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
                        if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
                        if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21402 = null;
                        if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
                        if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21403 = null;
                        if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                        }
                        PolarVoyageSnackbarGammaEclipse21404 = null;
                        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                        if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                        if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean PolarVoyageRotateAnimationCyberCelestialDelta476822222222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                        boolean z22222222222 = PolarVoyageRotateAnimationCyberCelestialDelta476822222222222;
                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                        }
                        r0 = z22222222222;
                        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                        }
                        Notification notification42222222222 = polarVoyageMotionEventEclipseThunderBlaze77952.PolarVoyageAnimatorSetSparkUltraMax8233;
                        notification42222222222.defaults = r0;
                        if ((r0 & 4) != 0) {
                        }
                        PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                        }
                        String str22222222222 = PolarVoyageDisplayMetricsVortexDragon95167;
                        if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str22222222222, 0, polarVoyageMotionEventEclipseThunderBlaze77952.PolarVoyageZipVortexCelestial6185());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(PolarVoyageCameraOmegaHyperion2330.PolarVoyageKotlinBetaPulseBeta3653(string));
                    }
                    PolarVoyageDisplayMetricsVortexDragon95169 = "fcm_fallback_notification_channel";
                    atomicInteger = PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185;
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze779522 = new PolarVoyageMotionEventEclipseThunderBlaze7795(firebaseMessagingService, PolarVoyageDisplayMetricsVortexDragon95169);
                    PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion1793)) {
                    }
                    PolarVoyageNavigationViewHyperHyperHyperion17932 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion17932)) {
                    }
                    PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.icon");
                    if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon9516)) {
                    }
                    i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i != 0) {
                    }
                    i = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i == 0) {
                    }
                    polarVoyageMotionEventEclipseThunderBlaze779522.PolarVoyageAnimatorSetSparkUltraMax8233.icon = i2;
                    PolarVoyageDisplayMetricsVortexDragon95162 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.sound2");
                    if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                    }
                    if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
                    }
                    if (defaultUri == null) {
                    }
                    PolarVoyageDisplayMetricsVortexDragon95163 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.click_action");
                    if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95163)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    polarVoyageMotionEventEclipseThunderBlaze779522.PolarVoyageTextInputEditTextNebulaHero6651 = activity;
                    if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    PolarVoyageDisplayMetricsVortexDragon95164 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.color");
                    if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95164)) {
                    }
                    i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i3 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
                    Notification notification222222 = polarVoyageMotionEventEclipseThunderBlaze779522.PolarVoyageAnimatorSetSparkUltraMax8233;
                    if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    }
                    polarVoyageMotionEventEclipseThunderBlaze779522.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
                    PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
                    if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
                    }
                    PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
                    if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                    }
                    PolarVoyageSnackbarGammaEclipse21402 = null;
                    if (PolarVoyageSnackbarGammaEclipse21402 != null) {
                    }
                    PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
                    if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                    }
                    PolarVoyageSnackbarGammaEclipse21403 = null;
                    if (PolarVoyageSnackbarGammaEclipse21403 != null) {
                    }
                    PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
                    if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                    }
                    PolarVoyageSnackbarGammaEclipse21404 = null;
                    if (PolarVoyageSnackbarGammaEclipse21404 != null) {
                    }
                    PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
                    if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
                    if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
                    if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean PolarVoyageRotateAnimationCyberCelestialDelta4768222222222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
                    boolean z222222222222 = PolarVoyageRotateAnimationCyberCelestialDelta4768222222222222;
                    if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z222222222222;
                    if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
                    }
                    Notification notification422222222222 = polarVoyageMotionEventEclipseThunderBlaze779522.PolarVoyageAnimatorSetSparkUltraMax8233;
                    notification422222222222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
                    if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
                    }
                    String str222222222222 = PolarVoyageDisplayMetricsVortexDragon95167;
                    if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str222222222222, 0, polarVoyageMotionEventEclipseThunderBlaze779522.PolarVoyageZipVortexCelestial6185());
                    return true;
                }
            }
            PolarVoyageDisplayMetricsVortexDragon95169 = null;
            atomicInteger = PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze7795222 = new PolarVoyageMotionEventEclipseThunderBlaze7795(firebaseMessagingService, PolarVoyageDisplayMetricsVortexDragon95169);
            PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion1793)) {
            }
            PolarVoyageNavigationViewHyperHyperHyperion17932 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion17932)) {
            }
            PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.icon");
            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon9516)) {
            }
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i != 0) {
            }
            i = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i == 0) {
            }
            polarVoyageMotionEventEclipseThunderBlaze7795222.PolarVoyageAnimatorSetSparkUltraMax8233.icon = i2;
            PolarVoyageDisplayMetricsVortexDragon95162 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.sound2");
            if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
            }
            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
            }
            if (defaultUri == null) {
            }
            PolarVoyageDisplayMetricsVortexDragon95163 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.click_action");
            if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95163)) {
            }
            if (launchIntentForPackage != null) {
            }
            polarVoyageMotionEventEclipseThunderBlaze7795222.PolarVoyageTextInputEditTextNebulaHero6651 = activity;
            if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            PolarVoyageDisplayMetricsVortexDragon95164 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.color");
            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95164)) {
            }
            i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i3 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
            Notification notification2222222 = polarVoyageMotionEventEclipseThunderBlaze7795222.PolarVoyageAnimatorSetSparkUltraMax8233;
            if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            }
            polarVoyageMotionEventEclipseThunderBlaze7795222.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
            PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
            if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
            }
            PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
            if (PolarVoyageSnackbarGammaEclipse21402 != null) {
            }
            PolarVoyageSnackbarGammaEclipse21402 = null;
            if (PolarVoyageSnackbarGammaEclipse21402 != null) {
            }
            PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
            if (PolarVoyageSnackbarGammaEclipse21403 != null) {
            }
            PolarVoyageSnackbarGammaEclipse21403 = null;
            if (PolarVoyageSnackbarGammaEclipse21403 != null) {
            }
            PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
            if (PolarVoyageSnackbarGammaEclipse21404 != null) {
            }
            PolarVoyageSnackbarGammaEclipse21404 = null;
            if (PolarVoyageSnackbarGammaEclipse21404 != null) {
            }
            PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
            if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
            if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
            if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean PolarVoyageRotateAnimationCyberCelestialDelta47682222222222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
            boolean z2222222222222 = PolarVoyageRotateAnimationCyberCelestialDelta47682222222222222;
            if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
            }
            r0 = z2222222222222;
            if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
            }
            Notification notification4222222222222 = polarVoyageMotionEventEclipseThunderBlaze7795222.PolarVoyageAnimatorSetSparkUltraMax8233;
            notification4222222222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
            if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
            }
            String str2222222222222 = PolarVoyageDisplayMetricsVortexDragon95167;
            if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str2222222222222, 0, polarVoyageMotionEventEclipseThunderBlaze7795222.PolarVoyageZipVortexCelestial6185());
            return true;
        }
        polarVoyageAsyncTaskPrimeForceThunder9800 = null;
        if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageAdapterTitanSpark4027 = (PolarVoyageAdapterTitanSpark4027) this.PolarVoyageBottomSheetOmegaNeo1907;
        AtomicInteger atomicInteger22 = PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String PolarVoyageDisplayMetricsVortexDragon951692 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        PolarVoyageDisplayMetricsVortexDragon951692 = null;
        atomicInteger = PolarVoyageAlarmManagerHeroAurora9162.PolarVoyageZipVortexCelestial6185;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze77952222 = new PolarVoyageMotionEventEclipseThunderBlaze7795(firebaseMessagingService, PolarVoyageDisplayMetricsVortexDragon951692);
        PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion1793)) {
        }
        PolarVoyageNavigationViewHyperHyperHyperion17932 = polarVoyageAdapterTitanSpark4027.PolarVoyageNavigationViewHyperHyperHyperion1793(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(PolarVoyageNavigationViewHyperHyperHyperion17932)) {
        }
        PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.icon");
        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon9516)) {
        }
        i = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i != 0) {
        }
        i = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i == 0) {
        }
        polarVoyageMotionEventEclipseThunderBlaze77952222.PolarVoyageAnimatorSetSparkUltraMax8233.icon = i2;
        PolarVoyageDisplayMetricsVortexDragon95162 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.sound2");
        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
        }
        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95162)) {
        }
        if (defaultUri == null) {
        }
        PolarVoyageDisplayMetricsVortexDragon95163 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.click_action");
        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95163)) {
        }
        if (launchIntentForPackage != null) {
        }
        polarVoyageMotionEventEclipseThunderBlaze77952222.PolarVoyageTextInputEditTextNebulaHero6651 = activity;
        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        PolarVoyageDisplayMetricsVortexDragon95164 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.color");
        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95164)) {
        }
        i3 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i3 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.sticky");
        Notification notification22222222 = polarVoyageMotionEventEclipseThunderBlaze77952222.PolarVoyageAnimatorSetSparkUltraMax8233;
        if (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
        }
        polarVoyageMotionEventEclipseThunderBlaze77952222.PolarVoyageCameraPixelBlaze2629 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.local_only");
        PolarVoyageDisplayMetricsVortexDragon95165 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.ticker");
        if (PolarVoyageDisplayMetricsVortexDragon95165 != null) {
        }
        PolarVoyageSnackbarGammaEclipse21402 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_priority");
        if (PolarVoyageSnackbarGammaEclipse21402 != null) {
        }
        PolarVoyageSnackbarGammaEclipse21402 = null;
        if (PolarVoyageSnackbarGammaEclipse21402 != null) {
        }
        PolarVoyageSnackbarGammaEclipse21403 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.visibility");
        if (PolarVoyageSnackbarGammaEclipse21403 != null) {
        }
        PolarVoyageSnackbarGammaEclipse21403 = null;
        if (PolarVoyageSnackbarGammaEclipse21403 != null) {
        }
        PolarVoyageSnackbarGammaEclipse21404 = polarVoyageAdapterTitanSpark4027.PolarVoyageSnackbarGammaEclipse2140("gcm.n.notification_count");
        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
        }
        PolarVoyageSnackbarGammaEclipse21404 = null;
        if (PolarVoyageSnackbarGammaEclipse21404 != null) {
        }
        PolarVoyageDisplayMetricsVortexDragon95166 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.event_time");
        if (!TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95166)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.vibrate_timings");
        if (PolarVoyageRemoteModelManagerOlympianCelestial9141 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        PolarVoyageRemoteModelManagerOlympianCelestial91412 = polarVoyageAdapterTitanSpark4027.PolarVoyageRemoteModelManagerOlympianCelestial9141("gcm.n.light_settings");
        if (PolarVoyageRemoteModelManagerOlympianCelestial91412 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean PolarVoyageRotateAnimationCyberCelestialDelta476822222222222222 = polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_sound");
        boolean z22222222222222 = PolarVoyageRotateAnimationCyberCelestialDelta476822222222222222;
        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_vibrate_timings")) {
        }
        r0 = z22222222222222;
        if (polarVoyageAdapterTitanSpark4027.PolarVoyageRotateAnimationCyberCelestialDelta4768("gcm.n.default_light_settings")) {
        }
        Notification notification42222222222222 = polarVoyageMotionEventEclipseThunderBlaze77952222.PolarVoyageAnimatorSetSparkUltraMax8233;
        notification42222222222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        PolarVoyageDisplayMetricsVortexDragon95167 = polarVoyageAdapterTitanSpark4027.PolarVoyageDisplayMetricsVortexDragon9516("gcm.n.tag");
        if (TextUtils.isEmpty(PolarVoyageDisplayMetricsVortexDragon95167)) {
        }
        String str22222222222222 = PolarVoyageDisplayMetricsVortexDragon95167;
        if (polarVoyageAsyncTaskPrimeForceThunder9800 != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).getSystemService("notification")).notify(str22222222222222, 0, polarVoyageMotionEventEclipseThunderBlaze77952222.PolarVoyageZipVortexCelestial6185());
        return true;
    }

    public Object PolarVoyageStrictModeLegendEpic1532(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.PolarVoyageStrictModeLegendEpic1532;
        if (PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageBarcodeScannerInfernoSolarSpark7767()) {
            try {
                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageMotionLayoutTransitionHeroVision4068(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                PolarVoyageExoPlayerCelestialNeoThunder6671 polarVoyageExoPlayerCelestialNeoThunder6671 = (PolarVoyageExoPlayerCelestialNeoThunder6671) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> PolarVoyageZipVortexCelestial6185 = polarVoyageExoPlayerCelestialNeoThunder6671.PolarVoyageZipVortexCelestial6185();
                if (!PolarVoyageZipVortexCelestial6185.isEmpty()) {
                    for (Class cls2 : PolarVoyageZipVortexCelestial6185) {
                        if (!hashMap.containsKey(cls2)) {
                            PolarVoyageStrictModeLegendEpic1532(cls2, hashSet);
                        }
                    }
                }
                obj = polarVoyageExoPlayerCelestialNeoThunder6671.PolarVoyageMotionLayoutTransitionHeroVision4068((Context) this.PolarVoyageBottomSheetOmegaNeo1907);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new PolarVoyageToolbarNovaTitanSpeed3010(th);
            }
        }
        return obj;
    }

    @Override // p000createpolar.PolarVoyageFocusMeteringActionAuroraFusionSpeed7565
    public PolarVoyageRoomDaoRogueGamma6879 PolarVoyageTextInputEditTextNebulaHero6651() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                return (PolarVoyageEventLegendDragon2659) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            default:
                return (PolarVoyageAnimatorSetMegaUltra3640) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        }
    }

    public long PolarVoyageViewRogueMaster4778() {
        PolarVoyageBroadcastSpectraStormHyper8513 polarVoyageBroadcastSpectraStormHyper8513 = (PolarVoyageBroadcastSpectraStormHyper8513) this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageBroadcastSpectraStormHyper8513 != null) {
            return polarVoyageBroadcastSpectraStormHyper8513.PolarVoyageBottomSheetOmegaNeo1907;
        }
        return -1L;
    }

    @Override // p000createpolar.PolarVoyageScaleGestureDetectorDragonBlazeShadow4642
    public Object PolarVoyageZipVortexCelestial6185(Object obj) {
        PolarVoyageFlowShadowTurboInferno3903 polarVoyageFlowShadowTurboInferno3903 = (PolarVoyageFlowShadowTurboInferno3903) obj;
        polarVoyageFlowShadowTurboInferno3903.getClass();
        return (String) ((PolarVoyageToolbarHeroSpeed2535) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185((JSONObject) ((PolarVoyageResourcesCelestialInferno9280) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(polarVoyageFlowShadowTurboInferno3903.PolarVoyageBitmapVisionAuroraPixel4705, (JSONObject) ((PolarVoyageZoomStateAlphaVision6590) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(polarVoyageFlowShadowTurboInferno3903)));
    }

    @Override // p000createpolar.PolarVoyageFocusMeteringActionAuroraFusionSpeed7565
    public void cancel() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                ((PolarVoyageFocusMeteringActionAuroraFusionSpeed7565) this.PolarVoyageStrictModeLegendEpic1532).cancel();
                break;
            default:
                ((PolarVoyageAlertDialogTitanHyper8130) ((PolarVoyagePoseDetectionPrimeNebula3086) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageBottomSheetOmegaNeo1907).cancel();
                break;
        }
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 25:
                String str = (String) this.PolarVoyageBottomSheetOmegaNeo1907;
                String str2 = (String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.PolarVoyageStrictModeLegendEpic1532;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ PolarVoyageAlarmManagerAlphaInferno3493(Context context, Object obj, Object obj2, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = context;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
    }

    public /* synthetic */ PolarVoyageAlarmManagerAlphaInferno3493(Object obj, Object obj2, Object obj3, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj3;
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageFocusMeteringActionAuroraFusionSpeed7565 polarVoyageFocusMeteringActionAuroraFusionSpeed7565) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 6;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageFocusMeteringActionAuroraFusionSpeed7565;
        PolarVoyageRoomDaoRogueGamma6879 PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageFocusMeteringActionAuroraFusionSpeed7565.PolarVoyageTextInputEditTextNebulaHero6651();
        PolarVoyageTextInputEditTextNebulaHero6651.getClass();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageEventLegendDragon2659(PolarVoyageTextInputEditTextNebulaHero6651);
        PolarVoyageViewEliteBeta6786 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageFocusMeteringActionAuroraFusionSpeed7565.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageFragmentTurboMax6129(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
    }

    public /* synthetic */ PolarVoyageAlarmManagerAlphaInferno3493(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(FirebaseMessagingService firebaseMessagingService, PolarVoyageAdapterTitanSpark4027 polarVoyageAdapterTitanSpark4027, ExecutorService executorService) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 15;
        this.PolarVoyageStrictModeLegendEpic1532 = executorService;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = firebaseMessagingService;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageAdapterTitanSpark4027;
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageLocationManagerMasterMegaStrike4978 polarVoyageLocationManagerMasterMegaStrike4978) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 8;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageLocationManagerMasterMegaStrike4978;
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageRealtimeDatabaseEclipseUltra8894(18, this);
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(Context context, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 20:
                this.PolarVoyageBottomSheetOmegaNeo1907 = context.getApplicationContext();
                this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageInstrumentationSolarPrime4544.PolarVoyageSnackbarGammaEclipse2140;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageCameraPhantomStrikePhantom6420();
                break;
            default:
                this.PolarVoyageBottomSheetOmegaNeo1907 = context.getApplicationContext();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new HashSet();
                this.PolarVoyageStrictModeLegendEpic1532 = new HashMap();
                break;
        }
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821, PolarVoyageWithContextGammaMaster7108 polarVoyageWithContextGammaMaster7108, PolarVoyageViewPager2StormRogue3954 polarVoyageViewPager2StormRogue3954, Set set) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 16;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageWithContextGammaMaster7108;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAnimatorCelestialDeltaMaster5821;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageViewPager2StormRogue3954;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            PolarVoyageBitmapMaxTitanTitan7960(str, 0, str.length(), 1, true, new PolarVoyageAssetManagerEclipseHyperInferno7091(str, 1));
        }
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 17;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyagePoseDetectionPrimeNebula3086;
        PolarVoyageAlertDialogTitanHyper8130 polarVoyageAlertDialogTitanHyper8130 = (PolarVoyageAlertDialogTitanHyper8130) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageBottomSheetOmegaNeo1907;
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageWorkManagerTitanSpectra7413(polarVoyagePoseDetectionPrimeNebula3086, polarVoyageAlertDialogTitanHyper8130.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageBarcodeScannerInfernoSolarSpark7767(), -1L, true);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageAnimatorSetMegaUltra3640(polarVoyagePoseDetectionPrimeNebula3086, polarVoyageAlertDialogTitanHyper8130.PolarVoyageBarcodeScannerInfernoSolarSpark7767().PolarVoyageTextInputEditTextNebulaHero6651(), -1L, true);
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageLiveDataQuantumSpeedNovaX2823[] polarVoyageLiveDataQuantumSpeedNovaX2823Arr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 12;
        PolarVoyageCameraViewDragonThunderMega6612 polarVoyageCameraViewDragonThunderMega6612 = new PolarVoyageCameraViewDragonThunderMega6612();
        PolarVoyageTextViewEpicFusionTurbo3381 polarVoyageTextViewEpicFusionTurbo3381 = new PolarVoyageTextViewEpicFusionTurbo3381();
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageKotlinBetaPulseBeta3653 = 1.0f;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 1.0f;
        PolarVoyageFocusMeteringActionCelestialStrikeMax1103 polarVoyageFocusMeteringActionCelestialStrikeMax1103 = PolarVoyageFocusMeteringActionCelestialStrikeMax1103.PolarVoyageBitmapVisionAuroraPixel4705;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageFocusMeteringActionCelestialStrikeMax1103;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageFocusMeteringActionCelestialStrikeMax1103;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageFocusMeteringActionCelestialStrikeMax1103;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageFocusMeteringActionCelestialStrikeMax1103;
        ByteBuffer byteBuffer = PolarVoyageLiveDataQuantumSpeedNovaX2823.PolarVoyageZipVortexCelestial6185;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageBottomSheetOmegaNeo1907 = byteBuffer;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageViewRogueMaster4778 = byteBuffer;
        polarVoyageTextViewEpicFusionTurbo3381.PolarVoyageMotionLayoutTransitionHeroVision4068 = -1;
        PolarVoyageLiveDataQuantumSpeedNovaX2823[] polarVoyageLiveDataQuantumSpeedNovaX2823Arr2 = new PolarVoyageLiveDataQuantumSpeedNovaX2823[polarVoyageLiveDataQuantumSpeedNovaX2823Arr.length + 2];
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLiveDataQuantumSpeedNovaX2823Arr2;
        System.arraycopy(polarVoyageLiveDataQuantumSpeedNovaX2823Arr, 0, polarVoyageLiveDataQuantumSpeedNovaX2823Arr2, 0, polarVoyageLiveDataQuantumSpeedNovaX2823Arr.length);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageCameraViewDragonThunderMega6612;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageTextViewEpicFusionTurbo3381;
        polarVoyageLiveDataQuantumSpeedNovaX2823Arr2[polarVoyageLiveDataQuantumSpeedNovaX2823Arr.length] = polarVoyageCameraViewDragonThunderMega6612;
        polarVoyageLiveDataQuantumSpeedNovaX2823Arr2[polarVoyageLiveDataQuantumSpeedNovaX2823Arr.length + 1] = polarVoyageTextViewEpicFusionTurbo3381;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageAlarmManagerAlphaInferno3493(String str, int i) {
        this(1, new PolarVoyageLayerDrawableTurboInferno7015(Executors.newSingleThreadExecutor(new PolarVoyageRealtimeDatabaseHyperionStormOmega8666(r3, 1)), new PolarVoyageBroadcastDragonShadowRogue6783(27)));
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 26:
                PolarVoyageServiceConnectionCelestialSpectraPulse4742 polarVoyageServiceConnectionCelestialSpectraPulse4742 = new PolarVoyageServiceConnectionCelestialSpectraPulse4742();
                polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageCameraPixelBlaze2629 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageBottomSheetOmegaNeo1907("video/mp2t");
                polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageBottomSheetOmegaNeo1907(str);
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageDisplayMetricsSpectraNeoHero6356(polarVoyageServiceConnectionCelestialSpectraPulse4742);
                break;
            default:
                String concat = "ExoPlayer:Loader:".concat(str);
                String str2 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
                break;
        }
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageViewAuroraQuantum6418 polarVoyageViewAuroraQuantum6418) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 4;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageViewAuroraQuantum6418;
        Handler PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBottomSheetOmegaNeo1907(null);
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageSensorManagerMaxNeoStrike5246 polarVoyageSensorManagerMaxNeoStrike5246 = new PolarVoyageSensorManagerMaxNeoStrike5246(this);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageSensorManagerMaxNeoStrike5246;
        polarVoyageViewAuroraQuantum6418.PolarVoyageZipVortexCelestial6185.registerStreamEventCallback(new PolarVoyageCardViewBetaHyper8130(0, PolarVoyageBottomSheetOmegaNeo1907), polarVoyageSensorManagerMaxNeoStrike5246);
    }

    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageRemoteModelManagerPulseMaxNovaX6329 polarVoyageRemoteModelManagerPulseMaxNovaX6329, PolarVoyageClipboardManagerUltraRogue9881 polarVoyageClipboardManagerUltraRogue9881) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 13;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageRemoteModelManagerPulseMaxNovaX6329;
        this.PolarVoyageStrictModeLegendEpic1532 = new HashMap();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageClipboardManagerUltraRogue9881;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [create-polar.PolarVoyageLaunchPrimeOmegaMax4501, java.lang.Object] */
    public PolarVoyageAlarmManagerAlphaInferno3493(PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266, Context context) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 18;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageGradlePluginDragonEpicDelta4266;
        this.PolarVoyageStrictModeLegendEpic1532 = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: create-polar.PolarVoyageLaunchPrimeOmegaMax4501
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta42662 = (PolarVoyageGradlePluginDragonEpicDelta4266) PolarVoyageAlarmManagerAlphaInferno3493.this.PolarVoyageBottomSheetOmegaNeo1907;
                if (polarVoyageGradlePluginDragonEpicDelta42662.PolarVoyageClipboardManagerAuroraPixel8666) {
                    return;
                }
                polarVoyageGradlePluginDragonEpicDelta42662.PolarVoyageLayerDrawableShadowTitaniumOmega1942(1, 19, Integer.valueOf(i));
            }
        };
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = r0;
        context.registerDeviceIdChangeListener(new PolarVoyageCardViewBetaHyper8130(1, polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageDisplayMetricsVortexDragon9516.PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageAnimatorSetSparkUltraMax8233, null)), r0);
    }
}
