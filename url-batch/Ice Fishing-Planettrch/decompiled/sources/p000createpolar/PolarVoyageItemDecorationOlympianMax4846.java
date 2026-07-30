package p000createpolar;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageItemDecorationOlympianMax4846 implements Cloneable {
    public volatile boolean PolarVoyageAlertDialogCyberHeroQuantum3938;
    public boolean PolarVoyageAnimatorSetSparkUltraMax8233;
    public boolean PolarVoyageBitmapMaxTitanTitan7960;
    public final PolarVoyageLiveDataStrikeFusionNova9556 PolarVoyageBottomSheetOmegaNeo1907;
    public final AtomicBoolean PolarVoyageCameraPixelBlaze2629;
    public volatile PolarVoyagePoseDetectionPrimeNebula3086 PolarVoyageCameraViewSpectraMaxSpectra2824;
    public PolarVoyageLocationListenerEclipseGammaTurbo4972 PolarVoyageContentProviderHyperSpark3838;
    public boolean PolarVoyageDisplayMetricsVortexDragon9516;
    public Object PolarVoyageDrawableDeltaHyperion5742;
    public final PolarVoyageGyroscopeForceSpectra2266 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageLayerDrawableShadowTitaniumOmega1942;
    public boolean PolarVoyageMotionLayoutForceEpicAurora7183;
    public PolarVoyagePoseDetectionPrimeNebula3086 PolarVoyageNavigationViewHyperHyperHyperion1793;
    public final CopyOnWriteArrayList PolarVoyagePackageManagerCelestialPhoenix8393;
    public boolean PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public PolarVoyageRotateAnimationNeoMegaPulse7927 PolarVoyageSnackbarGammaEclipse2140;
    public final PolarVoyageLinearLayoutMaxForce8672 PolarVoyageStrictModeLegendEpic1532;
    public final PolarVoyageExecutorLegendStorm7457 PolarVoyageViewRogueMaster4778;

    public PolarVoyageItemDecorationOlympianMax4846(PolarVoyageGyroscopeForceSpectra2266 polarVoyageGyroscopeForceSpectra2266, PolarVoyageLinearLayoutMaxForce8672 polarVoyageLinearLayoutMaxForce8672, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageGyroscopeForceSpectra2266;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageLinearLayoutMaxForce8672;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = z;
        this.PolarVoyageBottomSheetOmegaNeo1907 = (PolarVoyageLiveDataStrikeFusionNova9556) polarVoyageGyroscopeForceSpectra2266.PolarVoyageLifecycleOlympianOmega3762.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageGyroscopeForceSpectra2266.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getClass();
        PolarVoyageExecutorLegendStorm7457 polarVoyageExecutorLegendStorm7457 = new PolarVoyageExecutorLegendStorm7457(this);
        polarVoyageExecutorLegendStorm7457.PolarVoyageTextInputEditTextNebulaHero6651(0L, TimeUnit.MILLISECONDS);
        this.PolarVoyageViewRogueMaster4778 = polarVoyageExecutorLegendStorm7457;
        this.PolarVoyageCameraPixelBlaze2629 = new AtomicBoolean();
        this.PolarVoyageMotionLayoutForceEpicAurora7183 = true;
        this.PolarVoyagePackageManagerCelestialPhoenix8393 = new CopyOnWriteArrayList();
        new AtomicReference(polarVoyageLinearLayoutMaxForce8672.PolarVoyageBitmapVisionAuroraPixel4705);
    }

    public static final String PolarVoyageZipVortexCelestial6185(PolarVoyageItemDecorationOlympianMax4846 polarVoyageItemDecorationOlympianMax4846) {
        StringBuilder sb = new StringBuilder();
        sb.append(polarVoyageItemDecorationOlympianMax4846.PolarVoyageAlertDialogCyberHeroQuantum3938 ? "canceled " : "");
        sb.append(polarVoyageItemDecorationOlympianMax4846.PolarVoyageRotateAnimationCyberCelestialDelta4768 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(polarVoyageItemDecorationOlympianMax4846.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735());
        return sb.toString();
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        if (this.PolarVoyageAlertDialogCyberHeroQuantum3938) {
            return;
        }
        this.PolarVoyageAlertDialogCyberHeroQuantum3938 = true;
        PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086 = this.PolarVoyageCameraViewSpectraMaxSpectra2824;
        if (polarVoyagePoseDetectionPrimeNebula3086 != null) {
            ((PolarVoyageAlertDialogTitanHyper8130) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageBottomSheetOmegaNeo1907).cancel();
        }
        Iterator it = this.PolarVoyagePackageManagerCelestialPhoenix8393.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((PolarVoyageInputFilterTitanEclipse6589) it.next()).cancel();
        }
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageTabLayoutNeoNeo7623 polarVoyageTabLayoutNeoNeo7623) {
        if (!this.PolarVoyageCameraPixelBlaze2629.compareAndSet(false, true)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Already Executed");
            return;
        }
        PolarVoyagePagingCyberUltraMaster2078 polarVoyagePagingCyberUltraMaster2078 = PolarVoyagePagingCyberUltraMaster2078.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageDrawableDeltaHyperion5742 = PolarVoyagePagingCyberUltraMaster2078.PolarVoyageZipVortexCelestial6185.PolarVoyageTextInputEditTextNebulaHero6651();
        PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185;
        PolarVoyageOnLongClickListenerTitaniumNovaX8968 polarVoyageOnLongClickListenerTitaniumNovaX8968 = new PolarVoyageOnLongClickListenerTitaniumNovaX8968(this, polarVoyageTabLayoutNeoNeo7623);
        polarVoyageAnimatorCelestialDeltaMaster5821.getClass();
        PolarVoyageAnimatorCelestialDeltaMaster5821.PolarVoyageLifecycleOlympianOmega3762(polarVoyageAnimatorCelestialDeltaMaster5821, polarVoyageOnLongClickListenerTitaniumNovaX8968, null, 6);
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(boolean z) {
        PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086;
        synchronized (this) {
            if (!this.PolarVoyageMotionLayoutForceEpicAurora7183) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (polarVoyagePoseDetectionPrimeNebula3086 = this.PolarVoyageCameraViewSpectraMaxSpectra2824) != null) {
            ((PolarVoyageAlertDialogTitanHyper8130) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageBottomSheetOmegaNeo1907).cancel();
            ((PolarVoyageItemDecorationOlympianMax4846) polarVoyagePoseDetectionPrimeNebula3086.PolarVoyageStrictModeLegendEpic1532).PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyagePoseDetectionPrimeNebula3086, true, true, true, true, null);
        }
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyagePoseDetectionPrimeNebula3086 polarVoyagePoseDetectionPrimeNebula3086, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        polarVoyagePoseDetectionPrimeNebula3086.getClass();
        if (polarVoyagePoseDetectionPrimeNebula3086.equals(this.PolarVoyageCameraViewSpectraMaxSpectra2824)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.PolarVoyageAnimatorSetSparkUltraMax8233) {
                        }
                        if (z) {
                            this.PolarVoyageAnimatorSetSparkUltraMax8233 = false;
                        }
                        if (z2) {
                            this.PolarVoyageBitmapMaxTitanTitan7960 = false;
                        }
                        if (z4) {
                            this.PolarVoyageDisplayMetricsVortexDragon9516 = false;
                        }
                        if (z3) {
                            this.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = false;
                        }
                        z7 = (!this.PolarVoyageAnimatorSetSparkUltraMax8233 || this.PolarVoyageBitmapMaxTitanTitan7960 || this.PolarVoyageDisplayMetricsVortexDragon9516 || this.PolarVoyageLayerDrawableShadowTitaniumOmega1942) ? false : true;
                        if (z7) {
                            if (!this.PolarVoyageMotionLayoutForceEpicAurora7183) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z2 || !this.PolarVoyageBitmapMaxTitanTitan7960) && ((!z4 || !this.PolarVoyageDisplayMetricsVortexDragon9516) && (!z3 || !this.PolarVoyageLayerDrawableShadowTitaniumOmega1942))) {
                    z6 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                if (z4) {
                }
                if (z3) {
                }
                if (!this.PolarVoyageAnimatorSetSparkUltraMax8233) {
                }
                if (z7) {
                }
                boolean z82 = z5;
                z5 = z7;
                z6 = z82;
            }
            if (z5) {
                this.PolarVoyageCameraViewSpectraMaxSpectra2824 = null;
                PolarVoyageLocationListenerEclipseGammaTurbo4972 polarVoyageLocationListenerEclipseGammaTurbo4972 = this.PolarVoyageContentProviderHyperSpark3838;
                if (polarVoyageLocationListenerEclipseGammaTurbo4972 != null) {
                    synchronized (polarVoyageLocationListenerEclipseGammaTurbo4972) {
                        polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageCameraPixelBlaze2629++;
                    }
                }
            }
            if (z6) {
                return PolarVoyageKotlinBetaPulseBeta3653(iOException);
            }
        }
        return iOException;
    }

    public final IOException PolarVoyageKotlinBetaPulseBeta3653(IOException iOException) {
        IOException iOException2;
        Socket PolarVoyageRotateAnimationCyberCelestialDelta4768;
        TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
        PolarVoyageLocationListenerEclipseGammaTurbo4972 polarVoyageLocationListenerEclipseGammaTurbo4972 = this.PolarVoyageContentProviderHyperSpark3838;
        if (polarVoyageLocationListenerEclipseGammaTurbo4972 != null) {
            synchronized (polarVoyageLocationListenerEclipseGammaTurbo4972) {
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768();
            }
            if (this.PolarVoyageContentProviderHyperSpark3838 == null) {
                if (PolarVoyageRotateAnimationCyberCelestialDelta4768 != null) {
                    PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageRotateAnimationCyberCelestialDelta4768);
                }
            } else if (PolarVoyageRotateAnimationCyberCelestialDelta4768 != null) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Check failed.");
                return null;
            }
        }
        if (!this.PolarVoyageRemoteModelManagerOlympianCelestial9141 && this.PolarVoyageViewRogueMaster4778.PolarVoyageRotateAnimationCyberCelestialDelta4768()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageLocationListenerEclipseGammaTurbo4972 polarVoyageLocationListenerEclipseGammaTurbo4972) {
        polarVoyageLocationListenerEclipseGammaTurbo4972.getClass();
        TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
        if (this.PolarVoyageContentProviderHyperSpark3838 != null) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Check failed.");
        } else {
            this.PolarVoyageContentProviderHyperSpark3838 = polarVoyageLocationListenerEclipseGammaTurbo4972;
            polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageContentProviderHyperSpark3838.add(new PolarVoyageDelayTitanNeoMega8191(this, this.PolarVoyageDrawableDeltaHyperion5742));
        }
    }

    public final Socket PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        PolarVoyageLocationListenerEclipseGammaTurbo4972 polarVoyageLocationListenerEclipseGammaTurbo4972 = this.PolarVoyageContentProviderHyperSpark3838;
        polarVoyageLocationListenerEclipseGammaTurbo4972.getClass();
        TimeZone timeZone = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
        ArrayList arrayList = polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageContentProviderHyperSpark3838;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.PolarVoyageContentProviderHyperSpark3838 = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageRemoteModelManagerOlympianCelestial9141 = System.nanoTime();
        PolarVoyageLiveDataStrikeFusionNova9556 polarVoyageLiveDataStrikeFusionNova9556 = this.PolarVoyageBottomSheetOmegaNeo1907;
        ConcurrentLinkedQueue concurrentLinkedQueue = polarVoyageLiveDataStrikeFusionNova9556.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        TimeZone timeZone2 = PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185;
        if (!polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            polarVoyageLiveDataStrikeFusionNova9556.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageLiveDataStrikeFusionNova9556.PolarVoyageKotlinBetaPulseBeta3653, 0L);
            return null;
        }
        polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
        concurrentLinkedQueue.remove(polarVoyageLocationListenerEclipseGammaTurbo4972);
        if (concurrentLinkedQueue.isEmpty()) {
            PolarVoyageDrawerLayoutTurboStrikeTitanium4854 polarVoyageDrawerLayoutTurboStrikeTitanium4854 = polarVoyageLiveDataStrikeFusionNova9556.PolarVoyageMotionLayoutTransitionHeroVision4068;
            synchronized (polarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageZipVortexCelestial6185) {
                if (polarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageZipVortexCelestial6185()) {
                    polarVoyageDrawerLayoutTurboStrikeTitanium4854.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageDrawerLayoutTurboStrikeTitanium4854);
                }
            }
        }
        return polarVoyageLocationListenerEclipseGammaTurbo4972.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    public final IOException PolarVoyageStrictModeLegendEpic1532(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.PolarVoyageMotionLayoutForceEpicAurora7183) {
                this.PolarVoyageMotionLayoutForceEpicAurora7183 = false;
                if (!this.PolarVoyageAnimatorSetSparkUltraMax8233 && !this.PolarVoyageBitmapMaxTitanTitan7960 && !this.PolarVoyageDisplayMetricsVortexDragon9516) {
                    if (!this.PolarVoyageLayerDrawableShadowTitaniumOmega1942) {
                        z = true;
                    }
                }
            }
        }
        return z ? PolarVoyageKotlinBetaPulseBeta3653(iOException) : iOException;
    }

    public final PolarVoyageResourcesBlazeDragon3291 PolarVoyageTextInputEditTextNebulaHero6651() {
        ArrayList arrayList = new ArrayList();
        PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageSensorManagerFusionPixelSolar7026(this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageMotionLayoutTransitionHeroVision4068, arrayList);
        arrayList.add(new PolarVoyageVectorDrawableCompatDragonLegend9140(this.PolarVoyageItemDecorationUltraDeltaEpic7485));
        arrayList.add(new PolarVoyageVectorDrawableCompatDragonLegend9140(this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageRotateAnimationCyberCelestialDelta4768));
        arrayList.add(new PolarVoyageAlertDialogThunderGammaNova5599(2));
        arrayList.add(PolarVoyageAlertDialogThunderGammaNova5599.PolarVoyageKotlinBetaPulseBeta3653);
        if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageSensorManagerFusionPixelSolar7026(this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageKotlinBetaPulseBeta3653, arrayList);
        }
        arrayList.add(PolarVoyageAlertDialogThunderGammaNova5599.PolarVoyageMotionLayoutTransitionHeroVision4068);
        PolarVoyageLinearLayoutMaxForce8672 polarVoyageLinearLayoutMaxForce8672 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageGyroscopeForceSpectra2266 polarVoyageGyroscopeForceSpectra2266 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        try {
            try {
                PolarVoyageResourcesBlazeDragon3291 PolarVoyageMotionLayoutTransitionHeroVision4068 = new PolarVoyageFaceDetectionGammaForceHyperion1372(this, arrayList, 0, null, polarVoyageLinearLayoutMaxForce8672, polarVoyageGyroscopeForceSpectra2266.PolarVoyageLayerDrawableShadowTitaniumOmega1942, polarVoyageGyroscopeForceSpectra2266.PolarVoyageMotionLayoutForceEpicAurora7183, polarVoyageGyroscopeForceSpectra2266.PolarVoyageAlertDialogCyberHeroQuantum3938).PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageLinearLayoutMaxForce8672);
                if (this.PolarVoyageAlertDialogCyberHeroQuantum3938) {
                    PolarVoyageDatabaseStormMasterMaster4645.PolarVoyageZipVortexCelestial6185(PolarVoyageMotionLayoutTransitionHeroVision4068);
                    throw new IOException("Canceled");
                }
                PolarVoyageStrictModeLegendEpic1532(null);
                return PolarVoyageMotionLayoutTransitionHeroVision4068;
            } catch (IOException e) {
                IOException PolarVoyageStrictModeLegendEpic1532 = PolarVoyageStrictModeLegendEpic1532(e);
                PolarVoyageStrictModeLegendEpic1532.getClass();
                throw PolarVoyageStrictModeLegendEpic1532;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                PolarVoyageStrictModeLegendEpic1532(null);
            }
            throw th;
        }
    }

    public final Object clone() {
        return new PolarVoyageItemDecorationOlympianMax4846(this.PolarVoyageItemDecorationUltraDeltaEpic7485, this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
    }
}
