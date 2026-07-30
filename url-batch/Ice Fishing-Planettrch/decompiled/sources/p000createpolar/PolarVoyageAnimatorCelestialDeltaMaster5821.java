package p000createpolar;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.core.graphics.drawable.IconCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAnimatorCelestialDeltaMaster5821 implements PolarVoyageLocationListenerAuroraDragon9488, PolarVoyageFocusMeteringActionAuroraFusionSpeed7565, PolarVoyagePaintCelestialAurora6632, PolarVoyageFlowMaxTitanAlpha3096, PolarVoyageScaleGestureDetectorDragonBlazeShadow4642, PolarVoyageEditTextPrimeRogueSpectra6025, PolarVoyageModelInputOutputInfernoBeta7978 {
    public static PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageCameraPixelBlaze2629;
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;
    public Object PolarVoyageViewRogueMaster4778;

    /* JADX WARN: Multi-variable type inference failed */
    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageMotionEventEclipseThunderBlaze7795 polarVoyageMotionEventEclipseThunderBlaze7795) {
        int i;
        ArrayList arrayList;
        int i2;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 12;
        this.PolarVoyageViewRogueMaster4778 = new Bundle();
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageMotionEventEclipseThunderBlaze7795;
        Context context = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageZipVortexCelestial6185;
        ArrayList arrayList2 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBitmapMaxTitanTitan7960;
        ArrayList arrayList3 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageKotlinBetaPulseBeta3653;
        ArrayList arrayList4 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageStrictModeLegendEpic1532 = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageHandlerDragonInferno8931.PolarVoyageMotionLayoutTransitionHeroVision4068(context, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageRemoteModelManagerOlympianCelestial9141);
        } else {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Notification.Builder(context);
        }
        Notification notification = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageAnimatorSetSparkUltraMax8233;
        Context context2 = null;
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBitmapVisionAuroraPixel4705).setContentText(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDiffUtilTurboStrike5735).setContentInfo(null).setContentIntent(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageTextInputEditTextNebulaHero6651).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageStrictModeLegendEpic1532).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        IconCompat iconCompat = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageItemDecorationUltraDeltaEpic7485;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.PolarVoyageDiffUtilTurboStrike5735(context));
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setSubText(null).setUsesChronometer(false).setPriority(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        ArrayList arrayList5 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int size = arrayList5.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList5.get(i3);
            i3++;
            PolarVoyageServiceConnectionOmegaSpark3276 polarVoyageServiceConnectionOmegaSpark3276 = (PolarVoyageServiceConnectionOmegaSpark3276) obj;
            if (polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageMotionLayoutTransitionHeroVision4068 == null && (i2 = polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageBitmapVisionAuroraPixel4705) != 0) {
                polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageMotionLayoutTransitionHeroVision4068 = IconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068(i2);
            }
            IconCompat iconCompat2 = polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageMotionLayoutTransitionHeroVision4068;
            boolean z = polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageKotlinBetaPulseBeta3653;
            Bundle bundle = polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageZipVortexCelestial6185;
            ArrayList arrayList6 = arrayList5;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.PolarVoyageDiffUtilTurboStrike5735(context2) : context2, polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageDiffUtilTurboStrike5735, polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageTextInputEditTextNebulaHero6651);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                PolarVoyageValueAnimatorEclipseInfernoSolar2543.PolarVoyageBottomSheetOmegaNeo1907(builder2);
            }
            if (i4 >= 29) {
                PolarVoyageRoomDatabaseNebulaTurbo9943.PolarVoyageViewRogueMaster4778(builder2);
            }
            if (i4 >= 31) {
                PolarVoyageTabLayoutPhantomUltraCosmos1004.PolarVoyageBarcodeScannerInfernoSolarSpark7767(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", polarVoyageServiceConnectionOmegaSpark3276.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).addAction(builder2.build());
            arrayList5 = arrayList6;
            context2 = null;
        }
        Bundle bundle3 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742;
        if (bundle3 != null) {
            ((Bundle) this.PolarVoyageViewRogueMaster4778).putAll(bundle3);
        }
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setShowWhen(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageBottomSheetOmegaNeo1907);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setLocalOnly(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageCameraPixelBlaze2629);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setGroup(null);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setSortKey(null);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setGroupSummary(false);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setCategory(null);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setColor(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageSnackbarGammaEclipse2140);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setVisibility(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageContentProviderHyperSpark3838);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setPublicVersion(null);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    PolarVoyageLayoutInflaterTitaniumMaxSolar6862 polarVoyageLayoutInflaterTitaniumMaxSolar6862 = new PolarVoyageLayoutInflaterTitaniumMaxSolar6862(arrayList2.size() + arrayList.size());
                    polarVoyageLayoutInflaterTitaniumMaxSolar6862.addAll(arrayList);
                    polarVoyageLayoutInflaterTitaniumMaxSolar6862.addAll(arrayList2);
                    arrayList2 = new ArrayList(polarVoyageLayoutInflaterTitaniumMaxSolar6862);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742 == null) {
                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742 = new Bundle();
            }
            Bundle bundle4 = polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                String num = Integer.toString(i6);
                PolarVoyageServiceConnectionOmegaSpark3276 polarVoyageServiceConnectionOmegaSpark32762 = (PolarVoyageServiceConnectionOmegaSpark3276) arrayList4.get(i6);
                Bundle bundle7 = new Bundle();
                if (polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageMotionLayoutTransitionHeroVision4068 == null && (i = polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageBitmapVisionAuroraPixel4705) != 0) {
                    polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageMotionLayoutTransitionHeroVision4068 = IconCompat.PolarVoyageMotionLayoutTransitionHeroVision4068(i);
                }
                IconCompat iconCompat3 = polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageMotionLayoutTransitionHeroVision4068;
                Bundle bundle8 = polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageZipVortexCelestial6185;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.PolarVoyageKotlinBetaPulseBeta3653() : 0);
                bundle7.putCharSequence("title", polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageDiffUtilTurboStrike5735);
                bundle7.putParcelable("actionIntent", polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageTextInputEditTextNebulaHero6651);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageKotlinBetaPulseBeta3653);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", polarVoyageServiceConnectionOmegaSpark32762.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742 == null) {
                polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742 = new Bundle();
            }
            polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.PolarVoyageViewRogueMaster4778).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setExtras(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageDrawableDeltaHyperion5742);
        ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setRemoteInputHistory(null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            PolarVoyageHandlerDragonInferno8931.PolarVoyageRotateAnimationCyberCelestialDelta4768((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            PolarVoyageHandlerDragonInferno8931.PolarVoyageViewRogueMaster4778((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            PolarVoyageHandlerDragonInferno8931.PolarVoyageCameraPixelBlaze2629((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            PolarVoyageHandlerDragonInferno8931.PolarVoyageDrawableDeltaHyperion5742((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            PolarVoyageHandlerDragonInferno8931.PolarVoyageBottomSheetOmegaNeo1907((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            if (!TextUtils.isEmpty(polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageRemoteModelManagerOlympianCelestial9141)) {
                ((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageZipVortexCelestial6185();
                throw null;
            }
        }
        if (i7 >= 29) {
            PolarVoyageRoomDatabaseNebulaTurbo9943.PolarVoyageRotateAnimationCyberCelestialDelta4768((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageMotionEventEclipseThunderBlaze7795.PolarVoyageNavigationViewHyperHyperHyperion1793);
            PolarVoyageRoomDatabaseNebulaTurbo9943.PolarVoyageBottomSheetOmegaNeo1907((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        }
        if (i7 >= 36) {
            PolarVoyageLiveDataScopeEliteOmegaStrike6721.PolarVoyageBitmapVisionAuroraPixel4705((Notification.Builder) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        }
    }

    public static void PolarVoyageBottomSheetOmegaNeo1907(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821, PolarVoyageOnDeviceTranslatorCyberPixelPhoenix2556 polarVoyageOnDeviceTranslatorCyberPixelPhoenix2556) {
        polarVoyageAnimatorCelestialDeltaMaster5821.getClass();
        polarVoyageOnDeviceTranslatorCyberPixelPhoenix2556.getClass();
        if (((LinkedHashSet) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907).add(polarVoyageOnDeviceTranslatorCyberPixelPhoenix2556)) {
            PolarVoyageImageAnalysisHeroCosmosNova2332 polarVoyageImageAnalysisHeroCosmosNova2332 = (PolarVoyageImageAnalysisHeroCosmosNova2332) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            polarVoyageImageAnalysisHeroCosmosNova2332.getClass();
            if (polarVoyageOnDeviceTranslatorCyberPixelPhoenix2556.PolarVoyageKotlinBetaPulseBeta3653 != null) {
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageContentProviderHyperSpark3838("Handler '", polarVoyageOnDeviceTranslatorCyberPixelPhoenix2556, "' is already registered with a dispatcher");
                return;
            }
            polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageBitmapVisionAuroraPixel4705.addFirst(polarVoyageOnDeviceTranslatorCyberPixelPhoenix2556);
            polarVoyageOnDeviceTranslatorCyberPixelPhoenix2556.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageAnimatorCelestialDeltaMaster5821;
            polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageMotionLayoutTransitionHeroVision4068();
        }
    }

    public static synchronized PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageLayerDrawableShadowTitaniumOmega1942() {
        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821;
        synchronized (PolarVoyageAnimatorCelestialDeltaMaster5821.class) {
            try {
                if (PolarVoyageCameraPixelBlaze2629 == null) {
                    PolarVoyageCameraPixelBlaze2629 = new PolarVoyageAnimatorCelestialDeltaMaster5821(0);
                }
                polarVoyageAnimatorCelestialDeltaMaster5821 = PolarVoyageCameraPixelBlaze2629;
            } catch (Throwable th) {
                throw th;
            }
        }
        return polarVoyageAnimatorCelestialDeltaMaster5821;
    }

    public static void PolarVoyageLifecycleOlympianOmega3762(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821, PolarVoyageOnLongClickListenerTitaniumNovaX8968 polarVoyageOnLongClickListenerTitaniumNovaX8968, PolarVoyageOnLongClickListenerTitaniumNovaX8968 polarVoyageOnLongClickListenerTitaniumNovaX89682, int i) {
        PolarVoyageChipGroupTitaniumSpectra7687 polarVoyageChipGroupTitaniumSpectra7687;
        PolarVoyageOnLongClickListenerTitaniumNovaX8968 PolarVoyageBitmapMaxTitanTitan7960;
        if ((i & 1) != 0) {
            polarVoyageOnLongClickListenerTitaniumNovaX8968 = null;
        }
        if ((i & 4) != 0) {
            polarVoyageOnLongClickListenerTitaniumNovaX89682 = null;
        }
        polarVoyageAnimatorCelestialDeltaMaster5821.getClass();
        TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
        boolean isShutdown = ((ThreadPoolExecutor) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageNavigationViewHyperHyperHyperion1793()).isShutdown();
        synchronized (polarVoyageAnimatorCelestialDeltaMaster5821) {
            if (polarVoyageOnLongClickListenerTitaniumNovaX89682 != null) {
                try {
                    polarVoyageOnLongClickListenerTitaniumNovaX89682.PolarVoyageStrictModeLegendEpic1532.decrementAndGet();
                    if (!((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768).remove(polarVoyageOnLongClickListenerTitaniumNovaX89682)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (polarVoyageOnLongClickListenerTitaniumNovaX8968 != null) {
                ((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778).add(polarVoyageOnLongClickListenerTitaniumNovaX8968);
                PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846 = polarVoyageOnLongClickListenerTitaniumNovaX8968.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (!polarVoyageItemDecorationOlympianMax4846.PolarVoyageRotateAnimationCyberCelestialDelta4768 && (PolarVoyageBitmapMaxTitanTitan7960 = polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBitmapMaxTitanTitan7960(polarVoyageItemDecorationOlympianMax4846.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) != null) {
                    polarVoyageOnLongClickListenerTitaniumNovaX8968.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageBitmapMaxTitanTitan7960.PolarVoyageStrictModeLegendEpic1532;
                }
            }
            if (polarVoyageOnLongClickListenerTitaniumNovaX89682 != null && (isShutdown || ((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768).isEmpty())) {
                ((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageBottomSheetOmegaNeo1907).isEmpty();
            }
            if (isShutdown) {
                List PolarVoyageAdapterDelegateNebulaNeoVision8476 = PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageAdapterDelegateNebulaNeoVision8476((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778);
                ((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778).clear();
                polarVoyageChipGroupTitaniumSpectra7687 = new PolarVoyageChipGroupTitaniumSpectra7687(PolarVoyageAdapterDelegateNebulaNeoVision8476);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778).iterator();
                it.getClass();
                while (it.hasNext()) {
                    PolarVoyageOnLongClickListenerTitaniumNovaX8968 polarVoyageOnLongClickListenerTitaniumNovaX89683 = (PolarVoyageOnLongClickListenerTitaniumNovaX8968) it.next();
                    if (((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768).size() >= 64) {
                        break;
                    }
                    if (polarVoyageOnLongClickListenerTitaniumNovaX89683.PolarVoyageStrictModeLegendEpic1532.get() < 5) {
                        it.remove();
                        polarVoyageOnLongClickListenerTitaniumNovaX89683.PolarVoyageStrictModeLegendEpic1532.incrementAndGet();
                        arrayList.add(polarVoyageOnLongClickListenerTitaniumNovaX89683);
                        ((ArrayDeque) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageRotateAnimationCyberCelestialDelta4768).add(polarVoyageOnLongClickListenerTitaniumNovaX89683);
                    }
                }
                polarVoyageChipGroupTitaniumSpectra7687 = new PolarVoyageChipGroupTitaniumSpectra7687(arrayList);
            }
        }
        int size = polarVoyageChipGroupTitaniumSpectra7687.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
        for (int i2 = 0; i2 < size; i2++) {
            PolarVoyageOnLongClickListenerTitaniumNovaX8968 polarVoyageOnLongClickListenerTitaniumNovaX89684 = (PolarVoyageOnLongClickListenerTitaniumNovaX8968) polarVoyageChipGroupTitaniumSpectra7687.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i2);
            if (polarVoyageOnLongClickListenerTitaniumNovaX89684 != polarVoyageOnLongClickListenerTitaniumNovaX8968) {
                PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax48462 = polarVoyageOnLongClickListenerTitaniumNovaX89684.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            }
            if (isShutdown) {
                polarVoyageOnLongClickListenerTitaniumNovaX89684.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax48463 = polarVoyageOnLongClickListenerTitaniumNovaX89684.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                polarVoyageItemDecorationOlympianMax48463.PolarVoyageStrictModeLegendEpic1532(interruptedIOException);
                polarVoyageOnLongClickListenerTitaniumNovaX89684.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageItemDecorationOlympianMax48463, interruptedIOException);
            } else {
                ExecutorService PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageNavigationViewHyperHyperHyperion1793();
                polarVoyageOnLongClickListenerTitaniumNovaX89684.getClass();
                PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax48464 = polarVoyageOnLongClickListenerTitaniumNovaX89684.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                polarVoyageItemDecorationOlympianMax48464.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) PolarVoyageNavigationViewHyperHyperHyperion1793).execute(polarVoyageOnLongClickListenerTitaniumNovaX89684);
                    } catch (Throwable th2) {
                        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster58212 = polarVoyageItemDecorationOlympianMax48464.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185;
                        polarVoyageAnimatorCelestialDeltaMaster58212.getClass();
                        PolarVoyageLifecycleOlympianOmega3762(polarVoyageAnimatorCelestialDeltaMaster58212, null, polarVoyageOnLongClickListenerTitaniumNovaX89684, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax48465 = polarVoyageOnLongClickListenerTitaniumNovaX89684.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    polarVoyageItemDecorationOlympianMax48465.PolarVoyageStrictModeLegendEpic1532(interruptedIOException2);
                    polarVoyageOnLongClickListenerTitaniumNovaX89684.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageItemDecorationOlympianMax48465, interruptedIOException2);
                    PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster58213 = polarVoyageItemDecorationOlympianMax48464.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185;
                    polarVoyageAnimatorCelestialDeltaMaster58213.getClass();
                    PolarVoyageLifecycleOlympianOmega3762(polarVoyageAnimatorCelestialDeltaMaster58213, null, polarVoyageOnLongClickListenerTitaniumNovaX89684, 3);
                }
            }
        }
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageActivityInfoBetaQuantum8726() {
        CharSequence charSequence = (CharSequence) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Matcher matcher = (Matcher) this.PolarVoyageStrictModeLegendEpic1532;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return PolarVoyageDebugStrikeHyper9028.PolarVoyageMotionLayoutTransitionHeroVision4068(matcher2, end, charSequence);
    }

    public PolarVoyageBannerAdAuroraGamma9142 PolarVoyageAlertDialogCyberHeroQuantum3938(long j, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422) {
        if (((PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageBottomSheetOmegaNeo1907) == null) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageBannerAdAuroraGamma9142.PolarVoyageKotlinBetaPulseBeta3653();
        }
        PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageBannerAdAuroraGamma91423 == null) {
            PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("velocityVector");
            throw null;
        }
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageBannerAdAuroraGamma91423.PolarVoyageMotionLayoutTransitionHeroVision4068();
        int i = 0;
        while (true) {
            PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91424 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageBottomSheetOmegaNeo1907;
            if (i >= PolarVoyageMotionLayoutTransitionHeroVision4068) {
                if (polarVoyageBannerAdAuroraGamma91424 != null) {
                    return polarVoyageBannerAdAuroraGamma91424;
                }
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("velocityVector");
                throw null;
            }
            if (polarVoyageBannerAdAuroraGamma91424 == null) {
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("velocityVector");
                throw null;
            }
            PolarVoyageRecyclerViewUltraBlazeThunder8612 polarVoyageRecyclerViewUltraBlazeThunder8612 = (PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageStrictModeLegendEpic1532;
            polarVoyageBannerAdAuroraGamma9142.getClass();
            long j2 = j / 1000000;
            PolarVoyageLooperThreadLegendSolar2555 PolarVoyageZipVortexCelestial6185 = ((PolarVoyageObserverThunderEclipseEpic5402) polarVoyageRecyclerViewUltraBlazeThunder8612.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(polarVoyageBannerAdAuroraGamma91422.PolarVoyageZipVortexCelestial6185(i));
            long j3 = PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653;
            polarVoyageBannerAdAuroraGamma91424.PolarVoyageBitmapVisionAuroraPixel4705((((Math.signum(PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185) * PolarVoyageLayoutInflaterMaxRogue9993.PolarVoyageZipVortexCelestial6185(j3 > 0 ? j2 / j3 : 1.0f).PolarVoyageMotionLayoutTransitionHeroVision4068) * PolarVoyageZipVortexCelestial6185.PolarVoyageMotionLayoutTransitionHeroVision4068) / j3) * 1000.0f, i);
            i++;
        }
    }

    @Override // p000createpolar.PolarVoyageProGuardVisionEliteShadow4939
    public PolarVoyageBannerAdAuroraGamma9142 PolarVoyageAnimatorSetSparkUltraMax8233(long j, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423) {
        if (((PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageBottomSheetOmegaNeo1907) == null) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageBannerAdAuroraGamma91423.PolarVoyageKotlinBetaPulseBeta3653();
        }
        PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91424 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageBottomSheetOmegaNeo1907;
        if (polarVoyageBannerAdAuroraGamma91424 == null) {
            PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("velocityVector");
            throw null;
        }
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageBannerAdAuroraGamma91424.PolarVoyageMotionLayoutTransitionHeroVision4068();
        int i = 0;
        while (true) {
            PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91425 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageBottomSheetOmegaNeo1907;
            if (i >= PolarVoyageMotionLayoutTransitionHeroVision4068) {
                if (polarVoyageBannerAdAuroraGamma91425 != null) {
                    return polarVoyageBannerAdAuroraGamma91425;
                }
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("velocityVector");
                throw null;
            }
            if (polarVoyageBannerAdAuroraGamma91425 == null) {
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("velocityVector");
                throw null;
            }
            polarVoyageBannerAdAuroraGamma91425.PolarVoyageBitmapVisionAuroraPixel4705(((PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768(i).PolarVoyageKotlinBetaPulseBeta3653(j, polarVoyageBannerAdAuroraGamma9142.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91422.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91423.PolarVoyageZipVortexCelestial6185(i)), i);
            i++;
        }
    }

    @Override // p000createpolar.PolarVoyageFocusMeteringActionAuroraFusionSpeed7565
    public PolarVoyageViewEliteBeta6786 PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return (PolarVoyageViewPagerBetaOlympianUltra9813) this.PolarVoyageViewRogueMaster4778;
    }

    public PolarVoyageOnLongClickListenerTitaniumNovaX8968 PolarVoyageBitmapMaxTitanTitan7960(String str) {
        Iterator it = ((ArrayDeque) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).iterator();
        it.getClass();
        while (it.hasNext()) {
            PolarVoyageOnLongClickListenerTitaniumNovaX8968 polarVoyageOnLongClickListenerTitaniumNovaX8968 = (PolarVoyageOnLongClickListenerTitaniumNovaX8968) it.next();
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageOnLongClickListenerTitaniumNovaX8968.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767, str)) {
                return polarVoyageOnLongClickListenerTitaniumNovaX8968;
            }
        }
        Iterator it2 = ((ArrayDeque) this.PolarVoyageViewRogueMaster4778).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            PolarVoyageOnLongClickListenerTitaniumNovaX8968 polarVoyageOnLongClickListenerTitaniumNovaX89682 = (PolarVoyageOnLongClickListenerTitaniumNovaX8968) it2.next();
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageOnLongClickListenerTitaniumNovaX89682.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767, str)) {
                return polarVoyageOnLongClickListenerTitaniumNovaX89682;
            }
        }
        return null;
    }

    public void PolarVoyageCameraPixelBlaze2629(PolarVoyageDataBindingDeltaAlphaHero4792 polarVoyageDataBindingDeltaAlphaHero4792, int i) {
        if (i != 1 && i != 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.PolarVoyageViewRogueMaster4778).add(polarVoyageDataBindingDeltaAlphaHero4792)) {
            ((PolarVoyageImageAnalysisHeroCosmosNova2332) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185(this, polarVoyageDataBindingDeltaAlphaHero4792, i);
        }
    }

    public PolarVoyageValueAnimatorSparkDragonNovaX4109 PolarVoyageCameraViewSpectraMaxSpectra2824(PolarVoyageActionBarInfernoMax1008 polarVoyageActionBarInfernoMax1008, String str) {
        PolarVoyageValueAnimatorSparkDragonNovaX4109 polarVoyageValueAnimatorSparkDragonNovaX4109;
        PolarVoyageValueAnimatorSparkDragonNovaX4109 PolarVoyageZipVortexCelestial6185;
        synchronized (((PolarVoyageConstraintLayoutVisionMasterDragon8646) this.PolarVoyageViewRogueMaster4778)) {
            try {
                PolarVoyageDisplayMetricsVortexEclipsePixel6252 polarVoyageDisplayMetricsVortexEclipsePixel6252 = (PolarVoyageDisplayMetricsVortexEclipsePixel6252) this.PolarVoyageStrictModeLegendEpic1532;
                polarVoyageDisplayMetricsVortexEclipsePixel6252.getClass();
                polarVoyageValueAnimatorSparkDragonNovaX4109 = (PolarVoyageValueAnimatorSparkDragonNovaX4109) polarVoyageDisplayMetricsVortexEclipsePixel6252.PolarVoyageZipVortexCelestial6185.get(str);
                if (polarVoyageActionBarInfernoMax1008.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageValueAnimatorSparkDragonNovaX4109)) {
                    PolarVoyageLayerThunderPhantom1318 polarVoyageLayerThunderPhantom1318 = (PolarVoyageLayerThunderPhantom1318) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    if (polarVoyageLayerThunderPhantom1318 instanceof PolarVoyageMergeStormSpark4543) {
                        PolarVoyageMergeStormSpark4543 polarVoyageMergeStormSpark4543 = (PolarVoyageMergeStormSpark4543) polarVoyageLayerThunderPhantom1318;
                        polarVoyageValueAnimatorSparkDragonNovaX4109.getClass();
                        PolarVoyageGradientDrawableNeoVisionSpeed1253 polarVoyageGradientDrawableNeoVisionSpeed1253 = polarVoyageMergeStormSpark4543.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        if (polarVoyageGradientDrawableNeoVisionSpeed1253 != null) {
                            PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = polarVoyageMergeStormSpark4543.PolarVoyageBitmapVisionAuroraPixel4705;
                            polarVoyageResourcesCelestialInferno9280.getClass();
                            PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageViewRogueMaster4778(polarVoyageValueAnimatorSparkDragonNovaX4109, polarVoyageResourcesCelestialInferno9280, polarVoyageGradientDrawableNeoVisionSpeed1253);
                        }
                    }
                    polarVoyageValueAnimatorSparkDragonNovaX4109.getClass();
                } else {
                    PolarVoyageAnimationSetSpeedVision8531 polarVoyageAnimationSetSpeedVision8531 = new PolarVoyageAnimationSetSpeedVision8531((PolarVoyageStrictModeEpicMasterSolar6328) this.PolarVoyageBottomSheetOmegaNeo1907);
                    polarVoyageAnimationSetSpeedVision8531.PolarVoyageZipVortexCelestial6185.put(PolarVoyageRealtimeDatabaseEclipseUltra8894.PolarVoyageDrawableDeltaHyperion5742, str);
                    PolarVoyageLayerThunderPhantom1318 polarVoyageLayerThunderPhantom13182 = (PolarVoyageLayerThunderPhantom1318) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                    polarVoyageLayerThunderPhantom13182.getClass();
                    try {
                        try {
                            PolarVoyageZipVortexCelestial6185 = polarVoyageLayerThunderPhantom13182.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageActionBarInfernoMax1008, polarVoyageAnimationSetSpeedVision8531);
                        } catch (AbstractMethodError unused) {
                            PolarVoyageZipVortexCelestial6185 = polarVoyageLayerThunderPhantom13182.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTransformNeoTitanium1654.PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageActionBarInfernoMax1008), polarVoyageAnimationSetSpeedVision8531);
                        }
                    } catch (AbstractMethodError unused2) {
                        PolarVoyageZipVortexCelestial6185 = polarVoyageLayerThunderPhantom13182.PolarVoyageZipVortexCelestial6185(PolarVoyageTransformNeoTitanium1654.PolarVoyageLayerDrawableShadowTitaniumOmega1942(polarVoyageActionBarInfernoMax1008));
                    }
                    polarVoyageValueAnimatorSparkDragonNovaX4109 = PolarVoyageZipVortexCelestial6185;
                    PolarVoyageDisplayMetricsVortexEclipsePixel6252 polarVoyageDisplayMetricsVortexEclipsePixel62522 = (PolarVoyageDisplayMetricsVortexEclipsePixel6252) this.PolarVoyageStrictModeLegendEpic1532;
                    polarVoyageDisplayMetricsVortexEclipsePixel62522.getClass();
                    polarVoyageValueAnimatorSparkDragonNovaX4109.getClass();
                    PolarVoyageValueAnimatorSparkDragonNovaX4109 polarVoyageValueAnimatorSparkDragonNovaX41092 = (PolarVoyageValueAnimatorSparkDragonNovaX4109) polarVoyageDisplayMetricsVortexEclipsePixel62522.PolarVoyageZipVortexCelestial6185.put(str, polarVoyageValueAnimatorSparkDragonNovaX4109);
                    if (polarVoyageValueAnimatorSparkDragonNovaX41092 != null) {
                        polarVoyageValueAnimatorSparkDragonNovaX41092.PolarVoyageZipVortexCelestial6185();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return polarVoyageValueAnimatorSparkDragonNovaX4109;
    }

    @Override // p000createpolar.PolarVoyageProGuardVisionEliteShadow4939
    public PolarVoyageBannerAdAuroraGamma9142 PolarVoyageContentProviderHyperSpark3838(PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423) {
        if (((PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageViewRogueMaster4778) == null) {
            this.PolarVoyageViewRogueMaster4778 = polarVoyageBannerAdAuroraGamma91423.PolarVoyageKotlinBetaPulseBeta3653();
        }
        PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91424 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageViewRogueMaster4778;
        if (polarVoyageBannerAdAuroraGamma91424 == null) {
            PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("endVelocityVector");
            throw null;
        }
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageBannerAdAuroraGamma91424.PolarVoyageMotionLayoutTransitionHeroVision4068();
        int i = 0;
        while (true) {
            PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91425 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageViewRogueMaster4778;
            if (i >= PolarVoyageMotionLayoutTransitionHeroVision4068) {
                if (polarVoyageBannerAdAuroraGamma91425 != null) {
                    return polarVoyageBannerAdAuroraGamma91425;
                }
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("endVelocityVector");
                throw null;
            }
            if (polarVoyageBannerAdAuroraGamma91425 == null) {
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("endVelocityVector");
                throw null;
            }
            polarVoyageBannerAdAuroraGamma91425.PolarVoyageBitmapVisionAuroraPixel4705(((PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768(i).PolarVoyageBitmapVisionAuroraPixel4705(polarVoyageBannerAdAuroraGamma9142.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91422.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91423.PolarVoyageZipVortexCelestial6185(i)), i);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r10.PolarVoyageBitmapVisionAuroraPixel4705(r1) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x005b, B:29:0x0065), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PolarVoyageDiffUtilDragonSpeedEclipse6225(PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497) {
        PolarVoyageMotionSceneMasterTitan3175 polarVoyageMotionSceneMasterTitan3175;
        int i;
        PolarVoyageGyroscopeSolarThunderSpectra7559 polarVoyageGyroscopeSolarThunderSpectra7559;
        Throwable th;
        PolarVoyageGyroscopeSolarThunderSpectra7559 polarVoyageGyroscopeSolarThunderSpectra75592;
        PolarVoyageContextTitaniumPrimeSolar2011 polarVoyageContextTitaniumPrimeSolar2011 = (PolarVoyageContextTitaniumPrimeSolar2011) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        try {
            if (polarVoyageMotionSceneHyperVisionVision6497 instanceof PolarVoyageMotionSceneMasterTitan3175) {
                polarVoyageMotionSceneMasterTitan3175 = (PolarVoyageMotionSceneMasterTitan3175) polarVoyageMotionSceneHyperVisionVision6497;
                int i2 = polarVoyageMotionSceneMasterTitan3175.PolarVoyageDrawableDeltaHyperion5742;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    polarVoyageMotionSceneMasterTitan3175.PolarVoyageDrawableDeltaHyperion5742 = i2 - Integer.MIN_VALUE;
                    Object obj = polarVoyageMotionSceneMasterTitan3175.PolarVoyageViewRogueMaster4778;
                    i = polarVoyageMotionSceneMasterTitan3175.PolarVoyageDrawableDeltaHyperion5742;
                    PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova8373 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
                    Object obj2 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (i != 0) {
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                        if (polarVoyageContextTitaniumPrimeSolar2011.PolarVoyageAlertDialogNovaXCelestial4954()) {
                            return polarVoyageFilterGammaStrikeNova8373;
                        }
                        polarVoyageGyroscopeSolarThunderSpectra7559 = (PolarVoyageGyroscopeSolarThunderSpectra7559) this.PolarVoyageStrictModeLegendEpic1532;
                        polarVoyageMotionSceneMasterTitan3175.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageGyroscopeSolarThunderSpectra7559;
                        polarVoyageMotionSceneMasterTitan3175.PolarVoyageDrawableDeltaHyperion5742 = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            polarVoyageGyroscopeSolarThunderSpectra75592 = polarVoyageMotionSceneMasterTitan3175.PolarVoyageBottomSheetOmegaNeo1907;
                            try {
                                PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                                polarVoyageContextTitaniumPrimeSolar2011.PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageFilterGammaStrikeNova8373);
                                polarVoyageGyroscopeSolarThunderSpectra75592.PolarVoyageTextInputEditTextNebulaHero6651(null);
                                return polarVoyageFilterGammaStrikeNova8373;
                            } catch (Throwable th2) {
                                th = th2;
                                polarVoyageGyroscopeSolarThunderSpectra75592.PolarVoyageTextInputEditTextNebulaHero6651(null);
                                throw th;
                            }
                        }
                        PolarVoyageGyroscopeSolarThunderSpectra7559 polarVoyageGyroscopeSolarThunderSpectra75593 = polarVoyageMotionSceneMasterTitan3175.PolarVoyageBottomSheetOmegaNeo1907;
                        PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                        polarVoyageGyroscopeSolarThunderSpectra7559 = polarVoyageGyroscopeSolarThunderSpectra75593;
                    }
                    if (!polarVoyageContextTitaniumPrimeSolar2011.PolarVoyageAlertDialogNovaXCelestial4954()) {
                        polarVoyageGyroscopeSolarThunderSpectra7559.PolarVoyageTextInputEditTextNebulaHero6651(null);
                        return polarVoyageFilterGammaStrikeNova8373;
                    }
                    polarVoyageMotionSceneMasterTitan3175.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageGyroscopeSolarThunderSpectra7559;
                    polarVoyageMotionSceneMasterTitan3175.PolarVoyageDrawableDeltaHyperion5742 = 2;
                    if (PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageMotionSceneMasterTitan3175) != obj2) {
                        polarVoyageGyroscopeSolarThunderSpectra75592 = polarVoyageGyroscopeSolarThunderSpectra7559;
                        polarVoyageContextTitaniumPrimeSolar2011.PolarVoyageKeyframeEpicNovaXCyber9821(polarVoyageFilterGammaStrikeNova8373);
                        polarVoyageGyroscopeSolarThunderSpectra75592.PolarVoyageTextInputEditTextNebulaHero6651(null);
                        return polarVoyageFilterGammaStrikeNova8373;
                    }
                    return obj2;
                }
            }
            if (!polarVoyageContextTitaniumPrimeSolar2011.PolarVoyageAlertDialogNovaXCelestial4954()) {
            }
        } catch (Throwable th3) {
            PolarVoyageGyroscopeSolarThunderSpectra7559 polarVoyageGyroscopeSolarThunderSpectra75594 = polarVoyageGyroscopeSolarThunderSpectra7559;
            th = th3;
            polarVoyageGyroscopeSolarThunderSpectra75592 = polarVoyageGyroscopeSolarThunderSpectra75594;
            polarVoyageGyroscopeSolarThunderSpectra75592.PolarVoyageTextInputEditTextNebulaHero6651(null);
            throw th;
        }
        polarVoyageMotionSceneMasterTitan3175 = new PolarVoyageMotionSceneMasterTitan3175(this, polarVoyageMotionSceneHyperVisionVision6497);
        Object obj3 = polarVoyageMotionSceneMasterTitan3175.PolarVoyageViewRogueMaster4778;
        i = polarVoyageMotionSceneMasterTitan3175.PolarVoyageDrawableDeltaHyperion5742;
        PolarVoyageFilterGammaStrikeNova8373 polarVoyageFilterGammaStrikeNova83732 = PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
        Object obj22 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i != 0) {
        }
    }

    @Override // p000createpolar.PolarVoyageProGuardVisionEliteShadow4939
    public PolarVoyageBannerAdAuroraGamma9142 PolarVoyageDiffUtilTurboStrike5735(long j, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423) {
        if (((PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageBannerAdAuroraGamma9142.PolarVoyageKotlinBetaPulseBeta3653();
        }
        PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91424 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (polarVoyageBannerAdAuroraGamma91424 == null) {
            PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("valueVector");
            throw null;
        }
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageBannerAdAuroraGamma91424.PolarVoyageMotionLayoutTransitionHeroVision4068();
        int i = 0;
        while (true) {
            PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91425 = (PolarVoyageBannerAdAuroraGamma9142) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (i >= PolarVoyageMotionLayoutTransitionHeroVision4068) {
                if (polarVoyageBannerAdAuroraGamma91425 != null) {
                    return polarVoyageBannerAdAuroraGamma91425;
                }
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("valueVector");
                throw null;
            }
            if (polarVoyageBannerAdAuroraGamma91425 == null) {
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageWithContextPulseSolarHyperion4393("valueVector");
                throw null;
            }
            polarVoyageBannerAdAuroraGamma91425.PolarVoyageBitmapVisionAuroraPixel4705(((PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768(i).PolarVoyageMotionLayoutTransitionHeroVision4068(j, polarVoyageBannerAdAuroraGamma9142.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91422.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91423.PolarVoyageZipVortexCelestial6185(i)), i);
            i++;
        }
    }

    public List PolarVoyageDisplayMetricsVortexDragon9516() {
        if (((PolarVoyageCoroutineCelestialAuroraPixel1740) this.PolarVoyageViewRogueMaster4778) == null) {
            this.PolarVoyageViewRogueMaster4778 = new PolarVoyageCoroutineCelestialAuroraPixel1740(this);
        }
        PolarVoyageCoroutineCelestialAuroraPixel1740 polarVoyageCoroutineCelestialAuroraPixel1740 = (PolarVoyageCoroutineCelestialAuroraPixel1740) this.PolarVoyageViewRogueMaster4778;
        polarVoyageCoroutineCelestialAuroraPixel1740.getClass();
        return polarVoyageCoroutineCelestialAuroraPixel1740;
    }

    public void PolarVoyageDrawableDeltaHyperion5742(PolarVoyageFlatMapBlazeCosmos6136 polarVoyageFlatMapBlazeCosmos6136, PolarVoyageProGuardThunderEclipse7479 polarVoyageProGuardThunderEclipse7479) {
        PolarVoyageImageAnalysisHeroCosmosNova2332 polarVoyageImageAnalysisHeroCosmosNova2332 = (PolarVoyageImageAnalysisHeroCosmosNova2332) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        polarVoyageImageAnalysisHeroCosmosNova2332.getClass();
        if (polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageTextInputEditTextNebulaHero6651 != 0) {
            return;
        }
        PolarVoyageOnDeviceTranslatorCyberPixelPhoenix2556 PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageKotlinBetaPulseBeta3653(-1);
        polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageKotlinBetaPulseBeta3653;
        polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageTextInputEditTextNebulaHero6651 = -1;
        polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageFlatMapBlazeCosmos6136;
        if (polarVoyageProGuardThunderEclipse7479 != null) {
            if (PolarVoyageKotlinBetaPulseBeta3653 != null) {
                PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageProGuardThunderEclipse7479);
            }
            PolarVoyagePlaceholderVortexBetaPulse5592 polarVoyagePlaceholderVortexBetaPulse5592 = polarVoyageImageAnalysisHeroCosmosNova2332.PolarVoyageZipVortexCelestial6185;
            PolarVoyageTransformDragonHyper2590 polarVoyageTransformDragonHyper2590 = new PolarVoyageTransformDragonHyper2590(polarVoyageProGuardThunderEclipse7479);
            polarVoyagePlaceholderVortexBetaPulse5592.getClass();
            polarVoyagePlaceholderVortexBetaPulse5592.PolarVoyageStrictModeLegendEpic1532(null, polarVoyageTransformDragonHyper2590);
        }
    }

    public void PolarVoyageFCMCelestialCosmosPixel3711(PolarVoyageMagnetometerPixelAurora5822 polarVoyageMagnetometerPixelAurora5822) {
        if (((PolarVoyageBroadcastHyperNovaSpeed5499) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == PolarVoyageBroadcastHyperNovaSpeed5499.PolarVoyageStrictModeLegendEpic1532) {
            PolarVoyageBitmapGammaRogue1691 polarVoyageBitmapGammaRogue1691 = (PolarVoyageBitmapGammaRogue1691) this.PolarVoyageStrictModeLegendEpic1532;
            if (polarVoyageBitmapGammaRogue1691 == null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("layoutCoordinates not set");
                return;
            } else {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageMagnetometerPixelAurora5822, polarVoyageBitmapGammaRogue1691.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(0L), new PolarVoyageColorStateListInflaterBetaShadow7539(15, (PolarVoyageOnPreDrawListenerSpeedNovaSolar4355) this.PolarVoyageViewRogueMaster4778), true);
            }
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageBroadcastHyperNovaSpeed5499.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000createpolar.PolarVoyageFlowMaxTitanAlpha3096
    public void PolarVoyageItemDecorationUltraDeltaEpic7485(byte[] bArr, int i, int i2, PolarVoyageProximitySensorNovaXStrikeSolar8705 polarVoyageProximitySensorNovaXStrikeSolar8705, PolarVoyageScaleAnimationVortexAurora2886 polarVoyageScaleAnimationVortexAurora2886) {
        int[] iArr;
        PolarVoyageProcessCameraProviderHeroBetaSolar3759 polarVoyageProcessCameraProviderHeroBetaSolar3759;
        int i3;
        int i4;
        int i5;
        int PolarVoyageLifecycleOlympianOmega3762;
        PolarVoyagePreviewNovaXStrikeStrike5011 polarVoyagePreviewNovaXStrikeStrike5011 = (PolarVoyagePreviewNovaXStrikeStrike5011) this.PolarVoyageBottomSheetOmegaNeo1907;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega13122 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, i + i2);
        polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i);
        if (((Inflater) this.PolarVoyageViewRogueMaster4778) == null) {
            this.PolarVoyageViewRogueMaster4778 = new Inflater();
        }
        if (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageActivityInfoBetaQuantum8726(polarVoyageTextRecognitionHeroOmega13122, polarVoyageTextRecognitionHeroOmega1312, (Inflater) this.PolarVoyageViewRogueMaster4778)) {
            polarVoyageTextRecognitionHeroOmega13122.PolarVoyageAlarmManagerShadowHyperBeta8339(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653);
        }
        int i6 = 0;
        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
        int[] iArr2 = polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega13123 = polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageZipVortexCelestial6185;
        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageDiffUtilTurboStrike5735 = 0;
        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageTextInputEditTextNebulaHero6651 = 0;
        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageStrictModeLegendEpic1532 = 0;
        polarVoyageTextRecognitionHeroOmega13123.PolarVoyageToolbarEclipseInfernoHero6368(0);
        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageKotlinBetaPulseBeta3653 = false;
        ArrayList arrayList = new ArrayList();
        while (polarVoyageTextRecognitionHeroOmega13122.PolarVoyageZipVortexCelestial6185() >= 3) {
            int i7 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageKotlinBetaPulseBeta3653;
            int PolarVoyagePackageManagerCelestialPhoenix8393 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyagePackageManagerCelestialPhoenix8393();
            int PolarVoyageCardViewAlphaVortexCelestial9747 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCardViewAlphaVortexCelestial9747();
            int i8 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageMotionLayoutTransitionHeroVision4068 + PolarVoyageCardViewAlphaVortexCelestial9747;
            if (i8 > i7) {
                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i7);
                i3 = i6;
                iArr = iArr2;
                polarVoyageProcessCameraProviderHeroBetaSolar3759 = null;
            } else {
                char c = 128;
                if (PolarVoyagePackageManagerCelestialPhoenix8393 != 128) {
                    switch (PolarVoyagePackageManagerCelestialPhoenix8393) {
                        case 20:
                            if (PolarVoyageCardViewAlphaVortexCelestial9747 % 5 == 2) {
                                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCanvasElitePhoenix4750(2);
                                Arrays.fill(iArr2, i6);
                                int i9 = PolarVoyageCardViewAlphaVortexCelestial9747 / 5;
                                int i10 = i6;
                                while (i10 < i9) {
                                    int PolarVoyagePackageManagerCelestialPhoenix83932 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyagePackageManagerCelestialPhoenix8393();
                                    char c2 = c;
                                    double PolarVoyagePackageManagerCelestialPhoenix83933 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyagePackageManagerCelestialPhoenix8393();
                                    double PolarVoyagePackageManagerCelestialPhoenix83934 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyagePackageManagerCelestialPhoenix8393() - 128;
                                    int[] iArr3 = iArr2;
                                    double PolarVoyagePackageManagerCelestialPhoenix83935 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyagePackageManagerCelestialPhoenix8393() - 128;
                                    iArr3[PolarVoyagePackageManagerCelestialPhoenix83932] = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651((int) ((PolarVoyagePackageManagerCelestialPhoenix83935 * 1.772d) + PolarVoyagePackageManagerCelestialPhoenix83933), 0, 255) | (polarVoyageTextRecognitionHeroOmega13122.PolarVoyagePackageManagerCelestialPhoenix8393() << 24) | (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651((int) ((1.402d * PolarVoyagePackageManagerCelestialPhoenix83934) + PolarVoyagePackageManagerCelestialPhoenix83933), 0, 255) << 16) | (PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageTextInputEditTextNebulaHero6651((int) ((PolarVoyagePackageManagerCelestialPhoenix83933 - (0.34414d * PolarVoyagePackageManagerCelestialPhoenix83935)) - (PolarVoyagePackageManagerCelestialPhoenix83934 * 0.71414d)), 0, 255) << 8);
                                    i10++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageKotlinBetaPulseBeta3653 = true;
                                break;
                            }
                            iArr = iArr2;
                            break;
                        case 21:
                            if (PolarVoyageCardViewAlphaVortexCelestial9747 >= 4) {
                                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCanvasElitePhoenix4750(3);
                                int i11 = PolarVoyageCardViewAlphaVortexCelestial9747 - 4;
                                if (((128 & polarVoyageTextRecognitionHeroOmega13122.PolarVoyagePackageManagerCelestialPhoenix8393()) != 0 ? 1 : i6) != 0) {
                                    if (i11 >= 7 && (PolarVoyageLifecycleOlympianOmega3762 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageLifecycleOlympianOmega3762()) >= 4) {
                                        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCardViewAlphaVortexCelestial9747();
                                        polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageStrictModeLegendEpic1532 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCardViewAlphaVortexCelestial9747();
                                        polarVoyageTextRecognitionHeroOmega13123.PolarVoyageToolbarEclipseInfernoHero6368(PolarVoyageLifecycleOlympianOmega3762 - 4);
                                        i11 = PolarVoyageCardViewAlphaVortexCelestial9747 - 11;
                                    }
                                }
                                int i12 = polarVoyageTextRecognitionHeroOmega13123.PolarVoyageMotionLayoutTransitionHeroVision4068;
                                int i13 = polarVoyageTextRecognitionHeroOmega13123.PolarVoyageKotlinBetaPulseBeta3653;
                                if (i12 < i13 && i11 > 0) {
                                    int min = Math.min(i11, i13 - i12);
                                    polarVoyageTextRecognitionHeroOmega13122.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageTextRecognitionHeroOmega13123.PolarVoyageZipVortexCelestial6185, i12, min);
                                    polarVoyageTextRecognitionHeroOmega13123.PolarVoyageConfigurationMaxSpectraForce5418(i12 + min);
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (PolarVoyageCardViewAlphaVortexCelestial9747 >= 19) {
                                polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCardViewAlphaVortexCelestial9747();
                                polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCardViewAlphaVortexCelestial9747();
                                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCanvasElitePhoenix4750(11);
                                polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageDiffUtilTurboStrike5735 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCardViewAlphaVortexCelestial9747();
                                polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageTextInputEditTextNebulaHero6651 = polarVoyageTextRecognitionHeroOmega13122.PolarVoyageCardViewAlphaVortexCelestial9747();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    polarVoyageProcessCameraProviderHeroBetaSolar3759 = null;
                } else {
                    iArr = iArr2;
                    if (polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0 || polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBitmapVisionAuroraPixel4705 == 0 || polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0 || polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageStrictModeLegendEpic1532 == 0 || (i4 = polarVoyageTextRecognitionHeroOmega13123.PolarVoyageKotlinBetaPulseBeta3653) == 0 || polarVoyageTextRecognitionHeroOmega13123.PolarVoyageMotionLayoutTransitionHeroVision4068 != i4 || !polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageKotlinBetaPulseBeta3653) {
                        polarVoyageProcessCameraProviderHeroBetaSolar3759 = null;
                    } else {
                        polarVoyageTextRecognitionHeroOmega13123.PolarVoyageConfigurationMaxSpectraForce5418(0);
                        int i14 = polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageItemDecorationUltraDeltaEpic7485 * polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageStrictModeLegendEpic1532;
                        int[] iArr4 = new int[i14];
                        int i15 = 0;
                        while (i15 < i14) {
                            int PolarVoyagePackageManagerCelestialPhoenix83936 = polarVoyageTextRecognitionHeroOmega13123.PolarVoyagePackageManagerCelestialPhoenix8393();
                            if (PolarVoyagePackageManagerCelestialPhoenix83936 != 0) {
                                i5 = i15 + 1;
                                iArr4[i15] = iArr[PolarVoyagePackageManagerCelestialPhoenix83936];
                            } else {
                                int PolarVoyagePackageManagerCelestialPhoenix83937 = polarVoyageTextRecognitionHeroOmega13123.PolarVoyagePackageManagerCelestialPhoenix8393();
                                if (PolarVoyagePackageManagerCelestialPhoenix83937 != 0) {
                                    i5 = ((PolarVoyagePackageManagerCelestialPhoenix83937 & 64) == 0 ? PolarVoyagePackageManagerCelestialPhoenix83937 & 63 : ((PolarVoyagePackageManagerCelestialPhoenix83937 & 63) << 8) | polarVoyageTextRecognitionHeroOmega13123.PolarVoyagePackageManagerCelestialPhoenix8393()) + i15;
                                    Arrays.fill(iArr4, i15, i5, (PolarVoyagePackageManagerCelestialPhoenix83937 & 128) == 0 ? iArr[0] : iArr[polarVoyageTextRecognitionHeroOmega13123.PolarVoyagePackageManagerCelestialPhoenix8393()]);
                                }
                            }
                            i15 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr4, polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageStrictModeLegendEpic1532, Bitmap.Config.ARGB_8888);
                        float f = polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageDiffUtilTurboStrike5735;
                        float f2 = polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        float f3 = f / f2;
                        float f4 = polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageTextInputEditTextNebulaHero6651;
                        float f5 = polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBitmapVisionAuroraPixel4705;
                        polarVoyageProcessCameraProviderHeroBetaSolar3759 = new PolarVoyageProcessCameraProviderHeroBetaSolar3759(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageItemDecorationUltraDeltaEpic7485 / f2, polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageStrictModeLegendEpic1532 / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
                    polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
                    polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageDiffUtilTurboStrike5735 = 0;
                    polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageTextInputEditTextNebulaHero6651 = 0;
                    polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
                    polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageStrictModeLegendEpic1532 = 0;
                    polarVoyageTextRecognitionHeroOmega13123.PolarVoyageToolbarEclipseInfernoHero6368(0);
                    polarVoyagePreviewNovaXStrikeStrike5011.PolarVoyageKotlinBetaPulseBeta3653 = false;
                }
                polarVoyageTextRecognitionHeroOmega13122.PolarVoyageConfigurationMaxSpectraForce5418(i8);
            }
            if (polarVoyageProcessCameraProviderHeroBetaSolar3759 != null) {
                arrayList.add(polarVoyageProcessCameraProviderHeroBetaSolar3759);
            }
            i6 = i3;
            iArr2 = iArr;
        }
        polarVoyageScaleAnimationVortexAurora2886.accept(new PolarVoyageConstraintSetCloneOlympianMegaVision9846(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // p000createpolar.PolarVoyagePaintCelestialAurora6632
    public boolean PolarVoyageKotlinBetaPulseBeta3653() {
        ArrayList arrayList = (ArrayList) this.PolarVoyageViewRogueMaster4778;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((PolarVoyageManifestRogueDelta7806) arrayList.get(i)).PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653()) {
                return true;
            }
        }
        return false;
    }

    public boolean PolarVoyageLooperThreadAlphaPrime1279(Context context) {
        if (((Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == null) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).booleanValue();
    }

    public PolarVoyageLinearLayoutHyperionSpectra2647 PolarVoyageMotionLayoutForceEpicAurora7183() {
        Matcher matcher = (Matcher) this.PolarVoyageStrictModeLegendEpic1532;
        return PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(matcher.start(), matcher.end());
    }

    public synchronized ExecutorService PolarVoyageNavigationViewHyperHyperHyperion1793() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.PolarVoyageStrictModeLegendEpic1532) == null) {
                this.PolarVoyageStrictModeLegendEpic1532 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new PolarVoyageProGuardPrimeUltraSpectra1243(PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageMotionLayoutTransitionHeroVision4068 + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.PolarVoyageStrictModeLegendEpic1532;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public boolean PolarVoyagePackageManagerCelestialPhoenix8393(Context context) {
        if (((Boolean) this.PolarVoyageBottomSheetOmegaNeo1907) == null) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.PolarVoyageBottomSheetOmegaNeo1907).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PolarVoyageRemoteModelManagerOlympianCelestial9141(PolarVoyageMotionSceneHyperVisionVision6497 polarVoyageMotionSceneHyperVisionVision6497) {
        PolarVoyagePagingPulseQuantumForce5646 polarVoyagePagingPulseQuantumForce5646;
        int i;
        PolarVoyageGeocoderPrimePixelTurbo5566 polarVoyageGeocoderPrimePixelTurbo5566;
        PolarVoyageContentResolverNovaPhantom9706 polarVoyageContentResolverNovaPhantom9706 = (PolarVoyageContentResolverNovaPhantom9706) this.PolarVoyageViewRogueMaster4778;
        if (polarVoyageMotionSceneHyperVisionVision6497 instanceof PolarVoyagePagingPulseQuantumForce5646) {
            polarVoyagePagingPulseQuantumForce5646 = (PolarVoyagePagingPulseQuantumForce5646) polarVoyageMotionSceneHyperVisionVision6497;
            int i2 = polarVoyagePagingPulseQuantumForce5646.PolarVoyageCameraPixelBlaze2629;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polarVoyagePagingPulseQuantumForce5646.PolarVoyageCameraPixelBlaze2629 = i2 - Integer.MIN_VALUE;
                Object obj = polarVoyagePagingPulseQuantumForce5646.PolarVoyageBottomSheetOmegaNeo1907;
                i = polarVoyagePagingPulseQuantumForce5646.PolarVoyageCameraPixelBlaze2629;
                if (i != 0) {
                    PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                    List list = (List) this.PolarVoyageBottomSheetOmegaNeo1907;
                    PolarVoyageDrawableCompatAuroraPulse6414 polarVoyageDrawableCompatAuroraPulse6414 = PolarVoyageDrawableCompatAuroraPulse6414.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (list == null || list.isEmpty()) {
                        polarVoyagePagingPulseQuantumForce5646.PolarVoyageCameraPixelBlaze2629 = 1;
                        obj = PolarVoyageContentResolverNovaPhantom9706.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageContentResolverNovaPhantom9706, false, polarVoyagePagingPulseQuantumForce5646);
                    } else {
                        PolarVoyageScaleDrawableTurboGammaPrime1808 PolarVoyageStrictModeLegendEpic1532 = polarVoyageContentResolverNovaPhantom9706.PolarVoyageStrictModeLegendEpic1532();
                        PolarVoyageAlarmManagerStormSpark3416 polarVoyageAlarmManagerStormSpark3416 = new PolarVoyageAlarmManagerStormSpark3416(polarVoyageContentResolverNovaPhantom9706, this, null);
                        polarVoyagePagingPulseQuantumForce5646.PolarVoyageCameraPixelBlaze2629 = 2;
                        obj = PolarVoyageStrictModeLegendEpic1532.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAlarmManagerStormSpark3416, polarVoyagePagingPulseQuantumForce5646);
                    }
                    return polarVoyageDrawableCompatAuroraPulse6414;
                }
                if (i == 1) {
                    PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                    polarVoyageGeocoderPrimePixelTurbo5566 = (PolarVoyageGeocoderPrimePixelTurbo5566) obj;
                } else {
                    if (i != 2) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PolarVoyageStateListAnimatorNovaXUltraQuantum4812.PolarVoyageRotateAnimationCyberCelestialDelta4768(obj);
                    polarVoyageGeocoderPrimePixelTurbo5566 = (PolarVoyageGeocoderPrimePixelTurbo5566) obj;
                }
                polarVoyageContentResolverNovaPhantom9706.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageGeocoderPrimePixelTurbo5566);
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            }
        }
        polarVoyagePagingPulseQuantumForce5646 = new PolarVoyagePagingPulseQuantumForce5646(this, polarVoyageMotionSceneHyperVisionVision6497);
        Object obj2 = polarVoyagePagingPulseQuantumForce5646.PolarVoyageBottomSheetOmegaNeo1907;
        i = polarVoyagePagingPulseQuantumForce5646.PolarVoyageCameraPixelBlaze2629;
        if (i != 0) {
        }
        polarVoyageContentResolverNovaPhantom9706.PolarVoyageDrawableDeltaHyperion5742.PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyageGeocoderPrimePixelTurbo5566);
        return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
    }

    @Override // p000createpolar.PolarVoyagePaintCelestialAurora6632
    public float PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        return ((Number) ((PolarVoyageRotateAnimationNovaXSpectra7703) this.PolarVoyageBottomSheetOmegaNeo1907).getValue()).floatValue();
    }

    public void PolarVoyageSnackbarGammaEclipse2140(PolarVoyageMagnetometerPixelAurora5822 polarVoyageMagnetometerPixelAurora5822, boolean z) {
        PolarVoyageOnPreDrawListenerSpeedNovaSolar4355 polarVoyageOnPreDrawListenerSpeedNovaSolar4355 = (PolarVoyageOnPreDrawListenerSpeedNovaSolar4355) this.PolarVoyageViewRogueMaster4778;
        List list = polarVoyageMagnetometerPixelAurora5822.PolarVoyageZipVortexCelestial6185;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((PolarVoyageBindingAdapterAuroraCyberSpectra9876) list.get(i)).PolarVoyageMotionLayoutTransitionHeroVision4068()) {
                PolarVoyageFCMCelestialCosmosPixel3711(polarVoyageMagnetometerPixelAurora5822);
                return;
            }
        }
        PolarVoyageBitmapGammaRogue1691 polarVoyageBitmapGammaRogue1691 = (PolarVoyageBitmapGammaRogue1691) this.PolarVoyageStrictModeLegendEpic1532;
        if (polarVoyageBitmapGammaRogue1691 == null) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("layoutCoordinates not set");
            return;
        }
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageCameraViewEclipseLegendStrike8028(polarVoyageMagnetometerPixelAurora5822, polarVoyageBitmapGammaRogue1691.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(0L), new PolarVoyageGestureDetectorRogueHyperSolar4116(8, this, polarVoyageOnPreDrawListenerSpeedNovaSolar4355), false);
        if (((PolarVoyageBroadcastHyperNovaSpeed5499) this.PolarVoyageRotateAnimationCyberCelestialDelta4768) == PolarVoyageBroadcastHyperNovaSpeed5499.PolarVoyageStrictModeLegendEpic1532) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((PolarVoyageBindingAdapterAuroraCyberSpectra9876) list.get(i2)).PolarVoyageZipVortexCelestial6185();
                }
            }
            PolarVoyageSurfaceViewMegaSparkShadow6231 polarVoyageSurfaceViewMegaSparkShadow6231 = polarVoyageMagnetometerPixelAurora5822.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (polarVoyageSurfaceViewMegaSparkShadow6231 != null) {
                polarVoyageSurfaceViewMegaSparkShadow6231.PolarVoyageItemDecorationUltraDeltaEpic7485 = !polarVoyageOnPreDrawListenerSpeedNovaSolar4355.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            }
        }
    }

    @Override // p000createpolar.PolarVoyageProGuardVisionEliteShadow4939
    public long PolarVoyageStrictModeLegendEpic1532(PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma9142, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91422, PolarVoyageBannerAdAuroraGamma9142 polarVoyageBannerAdAuroraGamma91423) {
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageBannerAdAuroraGamma9142.PolarVoyageMotionLayoutTransitionHeroVision4068();
        long j = 0;
        for (int i = 0; i < PolarVoyageMotionLayoutTransitionHeroVision4068; i++) {
            j = Math.max(j, ((PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageRotateAnimationCyberCelestialDelta4768(i).PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageBannerAdAuroraGamma9142.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91422.PolarVoyageZipVortexCelestial6185(i), polarVoyageBannerAdAuroraGamma91423.PolarVoyageZipVortexCelestial6185(i)));
        }
        return j;
    }

    @Override // p000createpolar.PolarVoyageFocusMeteringActionAuroraFusionSpeed7565
    public PolarVoyageRoomDaoRogueGamma6879 PolarVoyageTextInputEditTextNebulaHero6651() {
        return (PolarVoyageToastTitanTitaniumSolar4384) this.PolarVoyageBottomSheetOmegaNeo1907;
    }

    public void PolarVoyageViewRogueMaster4778(PolarVoyageFlatMapBlazeCosmos6136 polarVoyageFlatMapBlazeCosmos6136) {
        if (((LinkedHashSet) this.PolarVoyageViewRogueMaster4778).add(polarVoyageFlatMapBlazeCosmos6136)) {
            ((PolarVoyageImageAnalysisHeroCosmosNova2332) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185(this, polarVoyageFlatMapBlazeCosmos6136, -1);
        }
    }

    @Override // p000createpolar.PolarVoyageScaleGestureDetectorDragonBlazeShadow4642
    public Object PolarVoyageZipVortexCelestial6185(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 15:
                PolarVoyageActivityInfoSpectraCyberLegend6576 polarVoyageActivityInfoSpectraCyberLegend6576 = (PolarVoyageActivityInfoSpectraCyberLegend6576) obj;
                polarVoyageActivityInfoSpectraCyberLegend6576.getClass();
                PolarVoyageDispatchersGammaUltraTurbo4138 polarVoyageDispatchersGammaUltraTurbo4138 = (PolarVoyageDispatchersGammaUltraTurbo4138) ((PolarVoyageRealtimeDatabaseEclipseUltra8894) this.PolarVoyageStrictModeLegendEpic1532).PolarVoyageZipVortexCelestial6185(polarVoyageActivityInfoSpectraCyberLegend6576);
                if (polarVoyageDispatchersGammaUltraTurbo4138.equals(PolarVoyageChipGroupCyberAuroraNova3079.PolarVoyageContentProviderHyperSpark3838)) {
                    return "";
                }
                if (!(polarVoyageDispatchersGammaUltraTurbo4138 instanceof PolarVoyageInputMethodManagerPulseCyberUltra1314)) {
                    PolarVoyageAdapterFusionMasterGamma8495.PolarVoyageMotionLayoutTransitionHeroVision4068();
                    return null;
                }
                return (String) ((PolarVoyagePreviewDeltaVisionCyber7933) this.PolarVoyageViewRogueMaster4778).PolarVoyageZipVortexCelestial6185(((PolarVoyageToolbarHeroSpeed2535) this.PolarVoyageBottomSheetOmegaNeo1907).PolarVoyageZipVortexCelestial6185((PolarVoyageR8RogueCelestialVision4313) ((PolarVoyageServiceUltraUltraNeo9663) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageZipVortexCelestial6185(((PolarVoyageInputMethodManagerPulseCyberUltra1314) polarVoyageDispatchersGammaUltraTurbo4138).PolarVoyageContentProviderHyperSpark3838)));
            default:
                PolarVoyageFirebaseSpectraMegaTurbo5813 polarVoyageFirebaseSpectraMegaTurbo5813 = (PolarVoyageFirebaseSpectraMegaTurbo5813) obj;
                polarVoyageFirebaseSpectraMegaTurbo5813.getClass();
                return new PolarVoyageHandlerThreadFusionForce1494(polarVoyageFirebaseSpectraMegaTurbo5813, (PolarVoyageSQLiteMegaCyber1273) this.PolarVoyageStrictModeLegendEpic1532, (PolarVoyageActivityInfoEpicOlympianTitanium3019) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, (PolarVoyageRunnableEliteFusion9674) this.PolarVoyageBottomSheetOmegaNeo1907, (PolarVoyageToolbarNeoTurboLegend5043) this.PolarVoyageViewRogueMaster4778);
        }
    }

    @Override // p000createpolar.PolarVoyageFocusMeteringActionAuroraFusionSpeed7565
    public void cancel() {
        ((Socket) this.PolarVoyageStrictModeLegendEpic1532).close();
    }

    @Override // p000createpolar.PolarVoyageDebugCelestialNebula7743
    public Object get() {
        return new PolarVoyageAnimatorCelestialDeltaMaster5821((Executor) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageStrictModeLegendEpic1532).get(), (PolarVoyageExoPlayerNeoDelta8060) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).get(), (PolarVoyageAlarmManagerAlphaInferno3493) ((PolarVoyageDrawableCosmosEclipseMax6944) this.PolarVoyageBottomSheetOmegaNeo1907).get(), (PolarVoyageExoPlayerNeoDelta8060) ((PolarVoyageDebugCelestialNebula7743) this.PolarVoyageViewRogueMaster4778).get(), 22);
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                String socket = ((Socket) this.PolarVoyageStrictModeLegendEpic1532).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ PolarVoyageAnimatorCelestialDeltaMaster5821(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj2;
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj3;
        this.PolarVoyageViewRogueMaster4778 = obj4;
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageRealtimeDatabaseShadowPhantomHyperion1256 polarVoyageRealtimeDatabaseShadowPhantomHyperion1256, PolarVoyageCanvasCyberNovaElite7830 polarVoyageCanvasCyberNovaElite7830, PolarVoyageFlatMapNovaXPixel7404 polarVoyageFlatMapNovaXPixel7404, PolarVoyageConstraintSetCloneSparkSparkOlympian9041 polarVoyageConstraintSetCloneSparkSparkOlympian9041) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 17;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageRealtimeDatabaseShadowPhantomHyperion1256;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageConstraintSetCloneSparkSparkOlympian9041;
        this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageTransformNeoTitanium1654.PolarVoyageKotlinBetaPulseBeta3653(Integer.MAX_VALUE, null, 6);
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageRealtimeDatabaseEclipseUltra8894(10);
        PolarVoyageSoundPoolNebulaThunderVortex8476 polarVoyageSoundPoolNebulaThunderVortex8476 = (PolarVoyageSoundPoolNebulaThunderVortex8476) polarVoyageRealtimeDatabaseShadowPhantomHyperion1256.PolarVoyageItemDecorationUltraDeltaEpic7485().PolarVoyageDrawableDeltaHyperion5742(PolarVoyageDelayNovaRogueBeta9839.PolarVoyageFCMCelestialCosmosPixel3711);
        if (polarVoyageSoundPoolNebulaThunderVortex8476 != null) {
            polarVoyageSoundPoolNebulaThunderVortex8476.PolarVoyageCameraPixelBlaze2629(new PolarVoyageInputMethodManagerLegendAlphaStorm3063(polarVoyageCanvasCyberNovaElite7830, this, polarVoyageFlatMapNovaXPixel7404, 7));
        }
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageDisplayMetricsVortexEclipsePixel6252 polarVoyageDisplayMetricsVortexEclipsePixel6252, PolarVoyageLayerThunderPhantom1318 polarVoyageLayerThunderPhantom1318, PolarVoyageStrictModeEpicMasterSolar6328 polarVoyageStrictModeEpicMasterSolar6328) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 21;
        polarVoyageDisplayMetricsVortexEclipsePixel6252.getClass();
        polarVoyageLayerThunderPhantom1318.getClass();
        polarVoyageStrictModeEpicMasterSolar6328.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDisplayMetricsVortexEclipsePixel6252;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageLayerThunderPhantom1318;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageStrictModeEpicMasterSolar6328;
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageConstraintLayoutVisionMasterDragon8646(3);
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(Socket socket) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 5;
        this.PolarVoyageStrictModeLegendEpic1532 = socket;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new AtomicInteger();
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageToastTitanTitaniumSolar4384(this);
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageViewPagerBetaOlympianUltra9813(this);
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787, PolarVoyageAlarmManagerThunderEliteAlpha9279 polarVoyageAlarmManagerThunderEliteAlpha9279) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageRewardedAdUltraTitanium4787;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageAlarmManagerThunderEliteAlpha9279;
        AutofillManager PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageGroupCosmosBetaMaster5959.PolarVoyageDrawableDeltaHyperion5742(polarVoyageRewardedAdUltraTitanium4787.getContext().getSystemService(PolarVoyageGroupCosmosBetaMaster5959.PolarVoyageContentProviderHyperSpark3838()));
        if (PolarVoyageDrawableDeltaHyperion5742 != null) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageDrawableDeltaHyperion5742;
            polarVoyageRewardedAdUltraTitanium4787.setImportantForAutofill(1);
            PolarVoyageDigitalInkRecognitionBetaShadowNebula9385 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageDebugStrikeHyper9028.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageRewardedAdUltraTitanium4787);
            AutofillId PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageBarcodeScannerInfernoSolarSpark7767 != null ? PolarVoyageCameraOmegaHyperion2330.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageItemDecorationUltraDeltaEpic7485) : null;
            if (PolarVoyageDiffUtilTurboStrike5735 != null) {
                this.PolarVoyageViewRogueMaster4778 = PolarVoyageDiffUtilTurboStrike5735;
                return;
            }
            throw PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageKotlinBetaPulseBeta3653("Required value was null.");
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Autofill service could not be located.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo6655, PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar8536, List list, PolarVoyageEditTextAuroraHeroPulse9577 polarVoyageEditTextAuroraHeroPulse9577, PolarVoyageOnLongClickListenerTitaniumPhoenixHero5338 polarVoyageOnLongClickListenerTitaniumPhoenixHero5338) {
        int i;
        List list2;
        String str;
        PolarVoyageWindowManagerSpeedUltra3573 arrayList;
        int i2;
        List list3;
        PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo66552 = polarVoyageDelayAuroraSparkTurbo6655;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 9;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDelayAuroraSparkTurbo66552;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = list;
        final int i3 = 0;
        PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768 = new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageOnAttachStateChangeListenerStrikeHyperion2587
            public final /* synthetic */ PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                int i4 = i3;
                PolarVoyageManifestRogueDelta7806 polarVoyageManifestRogueDelta7806 = null;
                int i5 = 1;
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ArrayList arrayList2 = (ArrayList) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778;
                        if (!arrayList2.isEmpty()) {
                            ?? r0 = arrayList2.get(0);
                            float PolarVoyageZipVortexCelestial6185 = ((PolarVoyageManifestRogueDelta7806) r0).PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185();
                            int size = arrayList2.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList2.get(i5);
                                    float PolarVoyageZipVortexCelestial61852 = ((PolarVoyageManifestRogueDelta7806) obj).PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185();
                                    r0 = z;
                                    if (Float.compare(PolarVoyageZipVortexCelestial6185, PolarVoyageZipVortexCelestial61852) < 0) {
                                        r0 = obj;
                                        PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial61852;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            polarVoyageManifestRogueDelta7806 = r0;
                        }
                        PolarVoyageManifestRogueDelta7806 polarVoyageManifestRogueDelta78062 = polarVoyageManifestRogueDelta7806;
                        return Float.valueOf(polarVoyageManifestRogueDelta78062 != null ? polarVoyageManifestRogueDelta78062.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778;
                        if (!arrayList3.isEmpty()) {
                            ?? r02 = arrayList3.get(0);
                            float PolarVoyageKotlinBetaPulseBeta3653 = ((PolarVoyageManifestRogueDelta7806) r02).PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653();
                            int size2 = arrayList3.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList3.get(i5);
                                    float PolarVoyageKotlinBetaPulseBeta36532 = ((PolarVoyageManifestRogueDelta7806) obj2).PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653();
                                    r02 = z2;
                                    if (Float.compare(PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageKotlinBetaPulseBeta36532) < 0) {
                                        r02 = obj2;
                                        PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta36532;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            polarVoyageManifestRogueDelta7806 = r02;
                        }
                        PolarVoyageManifestRogueDelta7806 polarVoyageManifestRogueDelta78063 = polarVoyageManifestRogueDelta7806;
                        return Float.valueOf(polarVoyageManifestRogueDelta78063 != null ? polarVoyageManifestRogueDelta78063.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653() : 0.0f);
                }
            }
        };
        PolarVoyageMotionLayoutTransitionPrimeStrike8732 polarVoyageMotionLayoutTransitionPrimeStrike8732 = PolarVoyageMotionLayoutTransitionPrimeStrike8732.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageMotionLayoutTransitionPrimeStrike8732, polarVoyageFragmentPulseEliteDragon8768);
        final int i4 = 1;
        this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePoseDetectionCosmosVision6217(polarVoyageMotionLayoutTransitionPrimeStrike8732, new PolarVoyageFragmentPulseEliteDragon8768(this) { // from class: create-polar.PolarVoyageOnAttachStateChangeListenerStrikeHyperion2587
            public final /* synthetic */ PolarVoyageAnimatorCelestialDeltaMaster5821 PolarVoyageStrictModeLegendEpic1532;

            {
                this.PolarVoyageStrictModeLegendEpic1532 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
            public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
                int i42 = i4;
                PolarVoyageManifestRogueDelta7806 polarVoyageManifestRogueDelta7806 = null;
                int i5 = 1;
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = this.PolarVoyageStrictModeLegendEpic1532;
                switch (i42) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ArrayList arrayList2 = (ArrayList) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778;
                        if (!arrayList2.isEmpty()) {
                            ?? r0 = arrayList2.get(0);
                            float PolarVoyageZipVortexCelestial6185 = ((PolarVoyageManifestRogueDelta7806) r0).PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185();
                            int size = arrayList2.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList2.get(i5);
                                    float PolarVoyageZipVortexCelestial61852 = ((PolarVoyageManifestRogueDelta7806) obj).PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185();
                                    r0 = z;
                                    if (Float.compare(PolarVoyageZipVortexCelestial6185, PolarVoyageZipVortexCelestial61852) < 0) {
                                        r0 = obj;
                                        PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial61852;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            polarVoyageManifestRogueDelta7806 = r0;
                        }
                        PolarVoyageManifestRogueDelta7806 polarVoyageManifestRogueDelta78062 = polarVoyageManifestRogueDelta7806;
                        return Float.valueOf(polarVoyageManifestRogueDelta78062 != null ? polarVoyageManifestRogueDelta78062.PolarVoyageZipVortexCelestial6185.PolarVoyageZipVortexCelestial6185() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778;
                        if (!arrayList3.isEmpty()) {
                            ?? r02 = arrayList3.get(0);
                            float PolarVoyageKotlinBetaPulseBeta3653 = ((PolarVoyageManifestRogueDelta7806) r02).PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653();
                            int size2 = arrayList3.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList3.get(i5);
                                    float PolarVoyageKotlinBetaPulseBeta36532 = ((PolarVoyageManifestRogueDelta7806) obj2).PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653();
                                    r02 = z2;
                                    if (Float.compare(PolarVoyageKotlinBetaPulseBeta3653, PolarVoyageKotlinBetaPulseBeta36532) < 0) {
                                        r02 = obj2;
                                        PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta36532;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            polarVoyageManifestRogueDelta7806 = r02;
                        }
                        PolarVoyageManifestRogueDelta7806 polarVoyageManifestRogueDelta78063 = polarVoyageManifestRogueDelta7806;
                        return Float.valueOf(polarVoyageManifestRogueDelta78063 != null ? polarVoyageManifestRogueDelta78063.PolarVoyageZipVortexCelestial6185.PolarVoyageContentProviderHyperSpark3838.PolarVoyageKotlinBetaPulseBeta3653() : 0.0f);
                }
            }
        });
        PolarVoyageAnimatorTurboSpectraNova6915 polarVoyageAnimatorTurboSpectraNova6915 = polarVoyageIntentHyperSolar8536.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i5 = PolarVoyageLooperTurboPixel4815.PolarVoyageZipVortexCelestial6185;
        ArrayList arrayList2 = polarVoyageDelayAuroraSparkTurbo66552.PolarVoyageBottomSheetOmegaNeo1907;
        String str2 = polarVoyageDelayAuroraSparkTurbo66552.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageWindowManagerSpeedUltra3573 polarVoyageWindowManagerSpeedUltra3573 = PolarVoyageWindowManagerSpeedUltra3573.PolarVoyageItemDecorationUltraDeltaEpic7485;
        List PolarVoyageWindowManagerOlympianNovaNebula5076 = arrayList2 != null ? PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageWindowManagerOlympianNovaNebula5076(arrayList2, new PolarVoyageAnimatorOlympianHero5101(6)) : polarVoyageWindowManagerSpeedUltra3573;
        ArrayList arrayList3 = new ArrayList();
        PolarVoyageMLKitNovaXNovaSpectra9261 polarVoyageMLKitNovaXNovaSpectra9261 = new PolarVoyageMLKitNovaXNovaSpectra9261();
        int size = PolarVoyageWindowManagerOlympianNovaNebula5076.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos2375 = (PolarVoyageActivityInfoOlympianCosmos2375) PolarVoyageWindowManagerOlympianNovaNebula5076.get(i6);
            PolarVoyageAnimatorTurboSpectraNova6915 PolarVoyageZipVortexCelestial6185 = polarVoyageAnimatorTurboSpectraNova6915.PolarVoyageZipVortexCelestial6185((PolarVoyageAnimatorTurboSpectraNova6915) polarVoyageActivityInfoOlympianCosmos2375.PolarVoyageZipVortexCelestial6185);
            int i8 = polarVoyageActivityInfoOlympianCosmos2375.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i9 = polarVoyageActivityInfoOlympianCosmos2375.PolarVoyageKotlinBetaPulseBeta3653;
            if (i8 > i9) {
                PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("Reversed range is not supported");
            }
            while (i7 < i8 && !polarVoyageMLKitNovaXNovaSpectra9261.isEmpty()) {
                PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23752 = (PolarVoyageActivityInfoOlympianCosmos2375) polarVoyageMLKitNovaXNovaSpectra9261.last();
                List list4 = PolarVoyageWindowManagerOlympianNovaNebula5076;
                int i10 = polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageKotlinBetaPulseBeta3653;
                PolarVoyageWindowManagerSpeedUltra3573 polarVoyageWindowManagerSpeedUltra35732 = polarVoyageWindowManagerSpeedUltra3573;
                Object obj = polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageZipVortexCelestial6185;
                if (i8 < i10) {
                    arrayList3.add(new PolarVoyageActivityInfoOlympianCosmos2375(i7, i8, obj));
                    i7 = i8;
                    PolarVoyageWindowManagerOlympianNovaNebula5076 = list4;
                    polarVoyageWindowManagerSpeedUltra3573 = polarVoyageWindowManagerSpeedUltra35732;
                } else {
                    int i11 = size;
                    arrayList3.add(new PolarVoyageActivityInfoOlympianCosmos2375(i7, i10, obj));
                    i7 = polarVoyageActivityInfoOlympianCosmos23752.PolarVoyageKotlinBetaPulseBeta3653;
                    while (!polarVoyageMLKitNovaXNovaSpectra9261.isEmpty() && i7 == ((PolarVoyageActivityInfoOlympianCosmos2375) polarVoyageMLKitNovaXNovaSpectra9261.last()).PolarVoyageKotlinBetaPulseBeta3653) {
                        polarVoyageMLKitNovaXNovaSpectra9261.removeLast();
                    }
                    PolarVoyageWindowManagerOlympianNovaNebula5076 = list4;
                    polarVoyageWindowManagerSpeedUltra3573 = polarVoyageWindowManagerSpeedUltra35732;
                    size = i11;
                }
            }
            List list5 = PolarVoyageWindowManagerOlympianNovaNebula5076;
            PolarVoyageWindowManagerSpeedUltra3573 polarVoyageWindowManagerSpeedUltra35733 = polarVoyageWindowManagerSpeedUltra3573;
            int i12 = size;
            if (i7 < i8) {
                arrayList3.add(new PolarVoyageActivityInfoOlympianCosmos2375(i7, i8, polarVoyageAnimatorTurboSpectraNova6915));
                i7 = i8;
            }
            PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23753 = (PolarVoyageActivityInfoOlympianCosmos2375) polarVoyageMLKitNovaXNovaSpectra9261.PolarVoyageTextInputEditTextNebulaHero6651();
            if (polarVoyageActivityInfoOlympianCosmos23753 != null) {
                int i13 = polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageKotlinBetaPulseBeta3653;
                Object obj2 = polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageZipVortexCelestial6185;
                int i14 = polarVoyageActivityInfoOlympianCosmos23753.PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (i14 == i8 && i13 == i9) {
                    polarVoyageMLKitNovaXNovaSpectra9261.removeLast();
                    polarVoyageMLKitNovaXNovaSpectra9261.addLast(new PolarVoyageActivityInfoOlympianCosmos2375(i8, i9, ((PolarVoyageAnimatorTurboSpectraNova6915) obj2).PolarVoyageZipVortexCelestial6185(PolarVoyageZipVortexCelestial6185)));
                } else if (i14 == i13) {
                    arrayList3.add(new PolarVoyageActivityInfoOlympianCosmos2375(i14, i13, obj2));
                    polarVoyageMLKitNovaXNovaSpectra9261.removeLast();
                    polarVoyageMLKitNovaXNovaSpectra9261.addLast(new PolarVoyageActivityInfoOlympianCosmos2375(i8, i9, PolarVoyageZipVortexCelestial6185));
                } else if (i13 >= i9) {
                    polarVoyageMLKitNovaXNovaSpectra9261.addLast(new PolarVoyageActivityInfoOlympianCosmos2375(i8, i9, ((PolarVoyageAnimatorTurboSpectraNova6915) obj2).PolarVoyageZipVortexCelestial6185(PolarVoyageZipVortexCelestial6185)));
                } else {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                    throw null;
                }
            } else {
                polarVoyageMLKitNovaXNovaSpectra9261.addLast(new PolarVoyageActivityInfoOlympianCosmos2375(i8, i9, PolarVoyageZipVortexCelestial6185));
            }
            i6++;
            PolarVoyageWindowManagerOlympianNovaNebula5076 = list5;
            polarVoyageWindowManagerSpeedUltra3573 = polarVoyageWindowManagerSpeedUltra35733;
            size = i12;
        }
        PolarVoyageWindowManagerSpeedUltra3573 polarVoyageWindowManagerSpeedUltra35734 = polarVoyageWindowManagerSpeedUltra3573;
        while (i7 <= str2.length() && !polarVoyageMLKitNovaXNovaSpectra9261.isEmpty()) {
            PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23754 = (PolarVoyageActivityInfoOlympianCosmos2375) polarVoyageMLKitNovaXNovaSpectra9261.last();
            Object obj3 = polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageZipVortexCelestial6185;
            int i15 = polarVoyageActivityInfoOlympianCosmos23754.PolarVoyageKotlinBetaPulseBeta3653;
            arrayList3.add(new PolarVoyageActivityInfoOlympianCosmos2375(i7, i15, obj3));
            while (!polarVoyageMLKitNovaXNovaSpectra9261.isEmpty() && i15 == ((PolarVoyageActivityInfoOlympianCosmos2375) polarVoyageMLKitNovaXNovaSpectra9261.last()).PolarVoyageKotlinBetaPulseBeta3653) {
                polarVoyageMLKitNovaXNovaSpectra9261.removeLast();
            }
            i7 = i15;
        }
        if (i7 < str2.length()) {
            arrayList3.add(new PolarVoyageActivityInfoOlympianCosmos2375(i7, str2.length(), polarVoyageAnimatorTurboSpectraNova6915));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new PolarVoyageActivityInfoOlympianCosmos2375(0, 0, polarVoyageAnimatorTurboSpectraNova6915));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i16 = i;
        while (i16 < size2) {
            PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23755 = (PolarVoyageActivityInfoOlympianCosmos2375) arrayList3.get(i16);
            int i17 = polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i18 = polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageKotlinBetaPulseBeta3653;
            String substring = i17 != i18 ? str2.substring(i17, i18) : "";
            if (i17 == i18 || (list2 = polarVoyageDelayAuroraSparkTurbo66552.PolarVoyageItemDecorationUltraDeltaEpic7485) == null) {
                arrayList = 0;
                str = str2;
            } else if (i17 == 0 && i18 >= str2.length()) {
                arrayList = new ArrayList(list2.size());
                int size3 = list2.size();
                str = str2;
                int i19 = 0;
                while (i19 < size3) {
                    int i20 = size3;
                    Object obj4 = list2.get(i19);
                    int i21 = i19;
                    if (!(((PolarVoyageTransitionListenerSpectraOmega9469) ((PolarVoyageActivityInfoOlympianCosmos2375) obj4).PolarVoyageZipVortexCelestial6185) instanceof PolarVoyageAnimatorTurboSpectraNova6915)) {
                        arrayList.add(obj4);
                    }
                    i19 = i21 + 1;
                    size3 = i20;
                }
            } else {
                str = str2;
                arrayList = new ArrayList(list2.size());
                int size4 = list2.size();
                int i22 = 0;
                while (i22 < size4) {
                    int i23 = size4;
                    PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23756 = (PolarVoyageActivityInfoOlympianCosmos2375) list2.get(i22);
                    int i24 = i22;
                    Object obj5 = polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageZipVortexCelestial6185;
                    int i25 = polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageKotlinBetaPulseBeta3653;
                    int i26 = size2;
                    int i27 = polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    ArrayList arrayList5 = arrayList3;
                    if ((((PolarVoyageTransitionListenerSpectraOmega9469) obj5) instanceof PolarVoyageAnimatorTurboSpectraNova6915) || !PolarVoyageLooperTurboPixel4815.PolarVoyageZipVortexCelestial6185(i17, i18, i27, i25)) {
                        i2 = i16;
                    } else {
                        i2 = i16;
                        arrayList.add(new PolarVoyageActivityInfoOlympianCosmos2375((PolarVoyageTransitionListenerSpectraOmega9469) polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageZipVortexCelestial6185, PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageCameraViewSpectraMaxSpectra2824(i27, i17, i18) - i17, PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageCameraViewSpectraMaxSpectra2824(i25, i17, i18) - i17, polarVoyageActivityInfoOlympianCosmos23756.PolarVoyageBarcodeScannerInfernoSolarSpark7767));
                    }
                    i22 = i24 + 1;
                    size4 = i23;
                    size2 = i26;
                    arrayList3 = arrayList5;
                    i16 = i2;
                }
            }
            int i28 = size2;
            ArrayList arrayList6 = arrayList3;
            int i29 = i16;
            PolarVoyageDelayAuroraSparkTurbo6655 polarVoyageDelayAuroraSparkTurbo66553 = new PolarVoyageDelayAuroraSparkTurbo6655(substring, arrayList == 0 ? polarVoyageWindowManagerSpeedUltra35734 : arrayList);
            PolarVoyageAnimatorTurboSpectraNova6915 polarVoyageAnimatorTurboSpectraNova69152 = (PolarVoyageAnimatorTurboSpectraNova6915) polarVoyageActivityInfoOlympianCosmos23755.PolarVoyageZipVortexCelestial6185;
            PolarVoyageIntentHyperSolar8536 polarVoyageIntentHyperSolar85362 = new PolarVoyageIntentHyperSolar8536(polarVoyageIntentHyperSolar8536.PolarVoyageZipVortexCelestial6185, polarVoyageAnimatorTurboSpectraNova6915.PolarVoyageZipVortexCelestial6185(polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageMotionLayoutTransitionHeroVision4068 == Integer.MIN_VALUE ? new PolarVoyageAnimatorTurboSpectraNova6915(polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageZipVortexCelestial6185, polarVoyageAnimatorTurboSpectraNova6915.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageDiffUtilTurboStrike5735, polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageTextInputEditTextNebulaHero6651, polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageItemDecorationUltraDeltaEpic7485, polarVoyageAnimatorTurboSpectraNova69152.PolarVoyageStrictModeLegendEpic1532) : polarVoyageAnimatorTurboSpectraNova69152));
            ?? r1 = polarVoyageDelayAuroraSparkTurbo66553.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageWindowManagerSpeedUltra3573 polarVoyageWindowManagerSpeedUltra35735 = r1 == 0 ? polarVoyageWindowManagerSpeedUltra35734 : r1;
            List list6 = (List) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            ArrayList arrayList7 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i30 = 0;
            while (i30 < size5) {
                PolarVoyageActivityInfoOlympianCosmos2375 polarVoyageActivityInfoOlympianCosmos23757 = (PolarVoyageActivityInfoOlympianCosmos2375) list6.get(i30);
                int i31 = polarVoyageActivityInfoOlympianCosmos23757.PolarVoyageMotionLayoutTransitionHeroVision4068;
                int i32 = polarVoyageActivityInfoOlympianCosmos23757.PolarVoyageKotlinBetaPulseBeta3653;
                if (PolarVoyageLooperTurboPixel4815.PolarVoyageZipVortexCelestial6185(i17, i18, i31, i32)) {
                    if (i17 > i31 || i32 > i18) {
                        PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageZipVortexCelestial6185("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList7.add(new PolarVoyageActivityInfoOlympianCosmos2375(i31 - i17, i32 - i17, polarVoyageActivityInfoOlympianCosmos23757.PolarVoyageZipVortexCelestial6185));
                } else {
                    list3 = list6;
                }
                i30++;
                list6 = list3;
            }
            arrayList4.add(new PolarVoyageManifestRogueDelta7806(new PolarVoyagePaintFlagsDrawFilterNovaBlazeHero5581(substring, polarVoyageIntentHyperSolar85362, polarVoyageWindowManagerSpeedUltra35735, arrayList7, polarVoyageOnLongClickListenerTitaniumPhoenixHero5338, polarVoyageEditTextAuroraHeroPulse9577), i17, i18));
            i16 = i29 + 1;
            polarVoyageDelayAuroraSparkTurbo66552 = polarVoyageDelayAuroraSparkTurbo6655;
            str2 = str;
            size2 = i28;
            arrayList3 = arrayList6;
        }
        this.PolarVoyageViewRogueMaster4778 = arrayList4;
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageOnPreDrawListenerSpeedNovaSolar4355 polarVoyageOnPreDrawListenerSpeedNovaSolar4355) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 14;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageOnPreDrawListenerSpeedNovaSolar4355;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageBroadcastHyperNovaSpeed5499.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273 polarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 11;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageOnGlobalLayoutListenerTurboLegendHyperion3273;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageImageAnalysisHeroCosmosNova2332();
        new LinkedHashSet();
        this.PolarVoyageBottomSheetOmegaNeo1907 = new LinkedHashSet();
        this.PolarVoyageViewRogueMaster4778 = new LinkedHashSet();
    }

    public /* synthetic */ PolarVoyageAnimatorCelestialDeltaMaster5821(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(Typeface typeface, PolarVoyageServiceInfoEclipseStorm8809 polarVoyageServiceInfoEclipseStorm8809) {
        int i;
        int i2;
        int i3;
        int i4;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 8;
        this.PolarVoyageViewRogueMaster4778 = typeface;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageServiceInfoEclipseStorm8809;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageDragEventCosmosPixelShadow1538(1024);
        int PolarVoyageZipVortexCelestial6185 = polarVoyageServiceInfoEclipseStorm8809.PolarVoyageZipVortexCelestial6185(6);
        if (PolarVoyageZipVortexCelestial6185 != 0) {
            int i5 = PolarVoyageZipVortexCelestial6185 + polarVoyageServiceInfoEclipseStorm8809.PolarVoyageItemDecorationUltraDeltaEpic7485;
            i = ((ByteBuffer) polarVoyageServiceInfoEclipseStorm8809.PolarVoyageBottomSheetOmegaNeo1907).getInt(((ByteBuffer) polarVoyageServiceInfoEclipseStorm8809.PolarVoyageBottomSheetOmegaNeo1907).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new char[i * 2];
        int PolarVoyageZipVortexCelestial61852 = polarVoyageServiceInfoEclipseStorm8809.PolarVoyageZipVortexCelestial6185(6);
        if (PolarVoyageZipVortexCelestial61852 != 0) {
            int i6 = PolarVoyageZipVortexCelestial61852 + polarVoyageServiceInfoEclipseStorm8809.PolarVoyageItemDecorationUltraDeltaEpic7485;
            i2 = ((ByteBuffer) polarVoyageServiceInfoEclipseStorm8809.PolarVoyageBottomSheetOmegaNeo1907).getInt(((ByteBuffer) polarVoyageServiceInfoEclipseStorm8809.PolarVoyageBottomSheetOmegaNeo1907).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            PolarVoyageInAppPurchaseStrikeQuantumTitanium4425 polarVoyageInAppPurchaseStrikeQuantumTitanium4425 = new PolarVoyageInAppPurchaseStrikeQuantumTitanium4425(this, i7);
            PolarVoyageContentObserverSparkPrimeSolar2299 PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068();
            int PolarVoyageZipVortexCelestial61853 = PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185(4);
            Character.toChars(PolarVoyageZipVortexCelestial61853 != 0 ? ((ByteBuffer) PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBottomSheetOmegaNeo1907).getInt(PolarVoyageZipVortexCelestial61853 + PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageItemDecorationUltraDeltaEpic7485) : 0, (char[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i7 * 2);
            PolarVoyageContentObserverSparkPrimeSolar2299 PolarVoyageMotionLayoutTransitionHeroVision40682 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068();
            int PolarVoyageZipVortexCelestial61854 = PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageZipVortexCelestial6185(16);
            if (PolarVoyageZipVortexCelestial61854 != 0) {
                int i8 = PolarVoyageZipVortexCelestial61854 + PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageItemDecorationUltraDeltaEpic7485;
                i3 = ((ByteBuffer) PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageBottomSheetOmegaNeo1907).getInt(((ByteBuffer) PolarVoyageMotionLayoutTransitionHeroVision40682.PolarVoyageBottomSheetOmegaNeo1907).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                PolarVoyageDragEventCosmosPixelShadow1538 polarVoyageDragEventCosmosPixelShadow1538 = (PolarVoyageDragEventCosmosPixelShadow1538) this.PolarVoyageBottomSheetOmegaNeo1907;
                PolarVoyageContentObserverSparkPrimeSolar2299 PolarVoyageMotionLayoutTransitionHeroVision40683 = polarVoyageInAppPurchaseStrikeQuantumTitanium4425.PolarVoyageMotionLayoutTransitionHeroVision4068();
                int PolarVoyageZipVortexCelestial61855 = PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageZipVortexCelestial6185(16);
                if (PolarVoyageZipVortexCelestial61855 != 0) {
                    int i9 = PolarVoyageZipVortexCelestial61855 + PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    i4 = ((ByteBuffer) PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageBottomSheetOmegaNeo1907).getInt(((ByteBuffer) PolarVoyageMotionLayoutTransitionHeroVision40683.PolarVoyageBottomSheetOmegaNeo1907).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                polarVoyageDragEventCosmosPixelShadow1538.PolarVoyageZipVortexCelestial6185(polarVoyageInAppPurchaseStrikeQuantumTitanium4425, 0, i4 - 1);
            } else {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        switch (i) {
            case 3:
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                this.PolarVoyageViewRogueMaster4778 = new ArrayDeque();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new ArrayDeque();
                this.PolarVoyageBottomSheetOmegaNeo1907 = new ArrayDeque();
                break;
            case 13:
                this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageTextRecognitionHeroOmega1312();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageTextRecognitionHeroOmega1312();
                this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyagePreviewNovaXStrikeStrike5011();
                break;
            default:
                this.PolarVoyageStrictModeLegendEpic1532 = null;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
                this.PolarVoyageBottomSheetOmegaNeo1907 = null;
                this.PolarVoyageViewRogueMaster4778 = new ArrayDeque();
                break;
        }
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(Matcher matcher, CharSequence charSequence) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 7;
        charSequence.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = matcher;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = charSequence;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageApplicationInfoHyperionHyperion6216(0, this);
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 polarVoyageLifecycleCameraControllerUltraShadowDelta8620, PolarVoyageOnTouchListenerAuroraSpeed2185 polarVoyageOnTouchListenerAuroraSpeed2185, PolarVoyageOnTouchListenerAuroraSpeed2185 polarVoyageOnTouchListenerAuroraSpeed21852, PolarVoyageOnTouchListenerAuroraSpeed2185 polarVoyageOnTouchListenerAuroraSpeed21853) {
        Object obj;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 10;
        if (polarVoyageLifecycleCameraControllerUltraShadowDelta8620 != null) {
            obj = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageBottomSheetOmegaNeo1907(polarVoyageLifecycleCameraControllerUltraShadowDelta8620);
        } else {
            PolarVoyageTextRecognitionPrimeVortexHero1477 polarVoyageTextRecognitionPrimeVortexHero1477 = PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532;
            obj = PolarVoyageLifecycleCameraControllerUltraShadowDelta8620.PolarVoyageViewRogueMaster4778;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageOnTouchListenerAuroraSpeed2185;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageOnTouchListenerAuroraSpeed21852;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageOnTouchListenerAuroraSpeed21853;
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageContentResolverNovaPhantom9706 polarVoyageContentResolverNovaPhantom9706, List list) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 4;
        this.PolarVoyageViewRogueMaster4778 = polarVoyageContentResolverNovaPhantom9706;
        this.PolarVoyageStrictModeLegendEpic1532 = new PolarVoyageGyroscopeSolarThunderSpectra7559();
        PolarVoyageContextTitaniumPrimeSolar2011 polarVoyageContextTitaniumPrimeSolar2011 = new PolarVoyageContextTitaniumPrimeSolar2011(true);
        polarVoyageContextTitaniumPrimeSolar2011.PolarVoyageDatabaseCosmosSpectraSolar3905(null);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageContextTitaniumPrimeSolar2011;
        this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageAdapterDelegateNebulaNeoVision8476(list);
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(AudioTrack audioTrack, PolarVoyageRealtimeDatabaseEclipseUltra8894 polarVoyageRealtimeDatabaseEclipseUltra8894) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 2;
        this.PolarVoyageStrictModeLegendEpic1532 = audioTrack;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageRealtimeDatabaseEclipseUltra8894;
        Handler PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBottomSheetOmegaNeo1907(null);
        this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageBottomSheetOmegaNeo1907;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: create-polar.PolarVoyagePreviewPixelEpic6778
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = PolarVoyageAnimatorCelestialDeltaMaster5821.this;
                if (((PolarVoyagePreviewPixelEpic6778) polarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageViewRogueMaster4778) == null) {
                    return;
                }
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyagePackageManagerCelestialPhoenix8393().execute(new PolarVoyageMediaPlayerNebulaTurboLegend3509(7, polarVoyageAnimatorCelestialDeltaMaster5821, audioRouting));
            }
        };
        this.PolarVoyageViewRogueMaster4778 = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, PolarVoyageBottomSheetOmegaNeo1907);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageLiveDataScopeBetaSolar8471 polarVoyageLiveDataScopeBetaSolar8471) {
        this(r0, new PolarVoyageRecyclerViewUltraBlazeThunder8612(r0, polarVoyageLiveDataScopeBetaSolar8471));
        int i = 19;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 19;
    }

    public PolarVoyageAnimatorCelestialDeltaMaster5821(PolarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244 polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244, boolean[] zArr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 16;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = zArr;
        int i = polarVoyageOnAttachStateChangeListenerMegaBlazeFusion4244.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new boolean[i];
        this.PolarVoyageViewRogueMaster4778 = new boolean[i];
    }
}
