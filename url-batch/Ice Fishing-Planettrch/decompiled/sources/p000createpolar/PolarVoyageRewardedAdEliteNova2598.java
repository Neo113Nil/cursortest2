package p000createpolar;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRewardedAdEliteNova2598 {
    public final PolarVoyagePushNotificationDeltaAurora2165 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final PolarVoyageRemoteConfigEliteSpectra7350 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageCoordinatorLayoutOlympianVortex8571 PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageRotateDrawableLegendForce9155 PolarVoyageTextInputEditTextNebulaHero6651;
    public final Context PolarVoyageZipVortexCelestial6185;
    public static final Object PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Object();
    public static final PolarVoyageContentObserverThunderOmega9101 PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageContentObserverThunderOmega9101(0);
    public final AtomicBoolean PolarVoyageBitmapVisionAuroraPixel4705 = new AtomicBoolean(false);
    public final AtomicBoolean PolarVoyageDiffUtilTurboStrike5735 = new AtomicBoolean();
    public final CopyOnWriteArrayList PolarVoyageStrictModeLegendEpic1532 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public PolarVoyageRewardedAdEliteNova2598(Context context, String str, PolarVoyageCoordinatorLayoutOlympianVortex8571 polarVoyageCoordinatorLayoutOlympianVortex8571) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.PolarVoyageZipVortexCelestial6185 = context;
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageNavigationViewHyperHyperHyperion1793(str);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCoordinatorLayoutOlympianVortex8571;
        PolarVoyageViewBindingSpectraEpicFusion5319 polarVoyageViewBindingSpectraEpicFusion5319 = FirebaseInitProvider.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new PolarVoyageRoomDaoPhantomGammaSolar1471(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        PolarVoyageSensorManagerNovaXEpic8796 polarVoyageSensorManagerNovaXEpic8796 = PolarVoyageSensorManagerNovaXEpic8796.PolarVoyageItemDecorationUltraDeltaEpic7485;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new PolarVoyageRoomDaoPhantomGammaSolar1471(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new PolarVoyageRoomDaoPhantomGammaSolar1471(i2, new ExecutorsRegistrar()));
        arrayList4.add(PolarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068(context, Context.class, new Class[0]));
        arrayList4.add(PolarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068(this, PolarVoyageRewardedAdEliteNova2598.class, new Class[0]));
        arrayList4.add(PolarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageCoordinatorLayoutOlympianVortex8571, PolarVoyageCoordinatorLayoutOlympianVortex8571.class, new Class[0]));
        PolarVoyageDelayNovaRogueBeta9839 polarVoyageDelayNovaRogueBeta9839 = new PolarVoyageDelayNovaRogueBeta9839(28);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.PolarVoyageStrictModeLegendEpic1532.get()) {
            arrayList4.add(PolarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageViewBindingSpectraEpicFusion5319, PolarVoyageViewBindingSpectraEpicFusion5319.class, new Class[0]));
        }
        PolarVoyageSensorManagerNovaXEpic8796 polarVoyageSensorManagerNovaXEpic87962 = PolarVoyageSensorManagerNovaXEpic8796.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyagePushNotificationDeltaAurora2165 polarVoyagePushNotificationDeltaAurora2165 = new PolarVoyagePushNotificationDeltaAurora2165();
        polarVoyagePushNotificationDeltaAurora2165.PolarVoyageItemDecorationUltraDeltaEpic7485 = new HashMap();
        polarVoyagePushNotificationDeltaAurora2165.PolarVoyageStrictModeLegendEpic1532 = new HashMap();
        polarVoyagePushNotificationDeltaAurora2165.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new HashMap();
        polarVoyagePushNotificationDeltaAurora2165.PolarVoyageBottomSheetOmegaNeo1907 = new HashSet();
        polarVoyagePushNotificationDeltaAurora2165.PolarVoyageCameraPixelBlaze2629 = new AtomicReference();
        PolarVoyageAdapterDelegateAlphaVortex7437 polarVoyageAdapterDelegateAlphaVortex7437 = new PolarVoyageAdapterDelegateAlphaVortex7437();
        polarVoyagePushNotificationDeltaAurora2165.PolarVoyageViewRogueMaster4778 = polarVoyageAdapterDelegateAlphaVortex7437;
        polarVoyagePushNotificationDeltaAurora2165.PolarVoyageDrawableDeltaHyperion5742 = polarVoyageDelayNovaRogueBeta9839;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(PolarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageAdapterDelegateAlphaVortex7437, PolarVoyageAdapterDelegateAlphaVortex7437.class, PolarVoyageTextureViewSpectraSpeed9597.class, PolarVoyageRemoteConfigTitaniumTitanNovaX8748.class));
        arrayList5.add(PolarVoyageTextViewLegendTurbo6617.PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyagePushNotificationDeltaAurora2165, PolarVoyagePushNotificationDeltaAurora2165.class, new Class[0]));
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            PolarVoyageTextViewLegendTurbo6617 polarVoyageTextViewLegendTurbo6617 = (PolarVoyageTextViewLegendTurbo6617) obj;
            if (polarVoyageTextViewLegendTurbo6617 != null) {
                arrayList5.add(polarVoyageTextViewLegendTurbo6617);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (polarVoyagePushNotificationDeltaAurora2165) {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((PolarVoyageRemoteConfigEliteSpectra7350) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((PolarVoyageDelayNovaRogueBeta9839) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageDrawableDeltaHyperion5742).PolarVoyageContentProviderHyperSpark3838(componentRegistrar));
                        it2.remove();
                    }
                } catch (PolarVoyageStrictModeMaxHyperInferno8823 e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object[] array = ((PolarVoyageTextViewLegendTurbo6617) it3.next()).PolarVoyageMotionLayoutTransitionHeroVision4068.toArray();
                int length = array.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        Object obj3 = array[i5];
                        if (obj3.toString().contains("create-polar.PolarVoyageAccelerometerAuroraTitanSpeed7821")) {
                            if (((HashSet) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageBottomSheetOmegaNeo1907).contains(obj3.toString())) {
                                it3.remove();
                                break;
                            }
                            ((HashSet) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageBottomSheetOmegaNeo1907).add(obj3.toString());
                        }
                        i5++;
                    }
                }
            }
            if (((HashMap) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageItemDecorationUltraDeltaEpic7485).isEmpty()) {
                PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageDrawableDeltaHyperion5742(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageItemDecorationUltraDeltaEpic7485).keySet());
                arrayList8.addAll(arrayList5);
                PolarVoyageRewardedAdPixelMaxEclipse6420.PolarVoyageDrawableDeltaHyperion5742(arrayList8);
            }
            int size3 = arrayList5.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                PolarVoyageTextViewLegendTurbo6617 polarVoyageTextViewLegendTurbo66172 = (PolarVoyageTextViewLegendTurbo6617) obj4;
                ((HashMap) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageItemDecorationUltraDeltaEpic7485).put(polarVoyageTextViewLegendTurbo66172, new PolarVoyageRotateDrawableLegendForce9155(new PolarVoyageDebugStrikeEpicNebula4410(i, polarVoyagePushNotificationDeltaAurora2165, polarVoyageTextViewLegendTurbo66172)));
            }
            arrayList7.addAll(polarVoyagePushNotificationDeltaAurora2165.PolarVoyageNavigationViewHyperHyperHyperion1793(arrayList5));
            arrayList7.addAll(polarVoyagePushNotificationDeltaAurora2165.PolarVoyageAnimatorSetSparkUltraMax8233());
            polarVoyagePushNotificationDeltaAurora2165.PolarVoyageRemoteModelManagerOlympianCelestial9141();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageCameraPixelBlaze2629).get();
        if (bool != null) {
            polarVoyagePushNotificationDeltaAurora2165.PolarVoyageMotionLayoutTransitionHeroVision4068((HashMap) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageItemDecorationUltraDeltaEpic7485, bool.booleanValue());
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyagePushNotificationDeltaAurora2165;
        Trace.endSection();
        this.PolarVoyageTextInputEditTextNebulaHero6651 = new PolarVoyageRotateDrawableLegendForce9155(new PolarVoyageDebugStrikeEpicNebula4410(2, this, context));
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyagePushNotificationDeltaAurora2165.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageColorDrawableSpectraSolarMega2051.class);
        PolarVoyageLayerMasterOmegaNeo4846 polarVoyageLayerMasterOmegaNeo4846 = new PolarVoyageLayerMasterOmegaNeo4846(this);
        PolarVoyageZipVortexCelestial6185();
        if (this.PolarVoyageBitmapVisionAuroraPixel4705.get()) {
            PolarVoyageFilterCyberPhoenix6823.PolarVoyageViewRogueMaster4778.PolarVoyageItemDecorationUltraDeltaEpic7485.get();
        }
        this.PolarVoyageStrictModeLegendEpic1532.add(polarVoyageLayerMasterOmegaNeo4846);
        Trace.endSection();
    }

    public static PolarVoyageRewardedAdEliteNova2598 PolarVoyageBitmapVisionAuroraPixel4705(Context context) {
        synchronized (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            try {
                if (PolarVoyageBottomSheetOmegaNeo1907.containsKey("[DEFAULT]")) {
                    return PolarVoyageMotionLayoutTransitionHeroVision4068();
                }
                PolarVoyageCoordinatorLayoutOlympianVortex8571 PolarVoyageZipVortexCelestial6185 = PolarVoyageCoordinatorLayoutOlympianVortex8571.PolarVoyageZipVortexCelestial6185(context);
                if (PolarVoyageZipVortexCelestial6185 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return PolarVoyageDiffUtilTurboStrike5735(context, PolarVoyageZipVortexCelestial6185);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static PolarVoyageRewardedAdEliteNova2598 PolarVoyageDiffUtilTurboStrike5735(Context context, PolarVoyageCoordinatorLayoutOlympianVortex8571 polarVoyageCoordinatorLayoutOlympianVortex8571) {
        PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598;
        AtomicReference atomicReference = PolarVoyageGeocoderTurboTitan2699.PolarVoyageZipVortexCelestial6185;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = PolarVoyageGeocoderTurboTitan2699.PolarVoyageZipVortexCelestial6185;
            if (atomicReference2.get() == null) {
                PolarVoyageGeocoderTurboTitan2699 polarVoyageGeocoderTurboTitan2699 = new PolarVoyageGeocoderTurboTitan2699();
                while (true) {
                    if (atomicReference2.compareAndSet(null, polarVoyageGeocoderTurboTitan2699)) {
                        PolarVoyageFilterCyberPhoenix6823.PolarVoyageZipVortexCelestial6185(application);
                        PolarVoyageFilterCyberPhoenix6823 polarVoyageFilterCyberPhoenix6823 = PolarVoyageFilterCyberPhoenix6823.PolarVoyageViewRogueMaster4778;
                        polarVoyageFilterCyberPhoenix6823.getClass();
                        synchronized (polarVoyageFilterCyberPhoenix6823) {
                            polarVoyageFilterCyberPhoenix6823.PolarVoyageRotateAnimationCyberCelestialDelta4768.add(polarVoyageGeocoderTurboTitan2699);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = PolarVoyageBottomSheetOmegaNeo1907;
            String str = "FirebaseApp name [DEFAULT] already exists!";
            if (polarVoyageContentObserverThunderOmega9101.containsKey("[DEFAULT]")) {
                throw new IllegalStateException(str);
            }
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageLayerDrawableShadowTitaniumOmega1942(context, "Application context cannot be null.");
            polarVoyageRewardedAdEliteNova2598 = new PolarVoyageRewardedAdEliteNova2598(context, "[DEFAULT]", polarVoyageCoordinatorLayoutOlympianVortex8571);
            polarVoyageContentObserverThunderOmega9101.put("[DEFAULT]", polarVoyageRewardedAdEliteNova2598);
        }
        polarVoyageRewardedAdEliteNova2598.PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        return polarVoyageRewardedAdEliteNova2598;
    }

    public static PolarVoyageRewardedAdEliteNova2598 PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598;
        synchronized (PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            try {
                polarVoyageRewardedAdEliteNova2598 = (PolarVoyageRewardedAdEliteNova2598) PolarVoyageBottomSheetOmegaNeo1907.get("[DEFAULT]");
                if (polarVoyageRewardedAdEliteNova2598 == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageLifecycleOlympianOmega3762() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((PolarVoyageColorDrawableSpectraSolarMega2051) polarVoyageRewardedAdEliteNova2598.PolarVoyageItemDecorationUltraDeltaEpic7485.get()).PolarVoyageMotionLayoutTransitionHeroVision4068();
            } catch (Throwable th) {
                throw th;
            }
        }
        return polarVoyageRewardedAdEliteNova2598;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        HashMap hashMap;
        if (!((UserManager) this.PolarVoyageZipVortexCelestial6185.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            PolarVoyageZipVortexCelestial6185();
            sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.PolarVoyageZipVortexCelestial6185;
            AtomicReference atomicReference = PolarVoyageColorDrawableForceHyperionQuantum5668.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (atomicReference.get() == null) {
                PolarVoyageColorDrawableForceHyperionQuantum5668 polarVoyageColorDrawableForceHyperionQuantum5668 = new PolarVoyageColorDrawableForceHyperionQuantum5668(context);
                while (!atomicReference.compareAndSet(null, polarVoyageColorDrawableForceHyperionQuantum5668)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(polarVoyageColorDrawableForceHyperionQuantum5668, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        PolarVoyageZipVortexCelestial6185();
        sb2.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        Log.i("FirebaseApp", sb2.toString());
        PolarVoyagePushNotificationDeltaAurora2165 polarVoyagePushNotificationDeltaAurora2165 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageZipVortexCelestial6185();
        boolean equals = "[DEFAULT]".equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        AtomicReference atomicReference2 = (AtomicReference) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageCameraPixelBlaze2629;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (polarVoyagePushNotificationDeltaAurora2165) {
                    hashMap = new HashMap((HashMap) polarVoyagePushNotificationDeltaAurora2165.PolarVoyageItemDecorationUltraDeltaEpic7485);
                }
                polarVoyagePushNotificationDeltaAurora2165.PolarVoyageMotionLayoutTransitionHeroVision4068(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((PolarVoyageColorDrawableSpectraSolarMega2051) this.PolarVoyageItemDecorationUltraDeltaEpic7485.get()).PolarVoyageMotionLayoutTransitionHeroVision4068();
    }

    public final String PolarVoyageKotlinBetaPulseBeta3653() {
        StringBuilder sb = new StringBuilder();
        PolarVoyageZipVortexCelestial6185();
        byte[] bytes = this.PolarVoyageMotionLayoutTransitionHeroVision4068.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        PolarVoyageZipVortexCelestial6185();
        byte[] bytes2 = this.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageMotionLayoutTransitionHeroVision4068.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        if (this.PolarVoyageDiffUtilTurboStrike5735.get()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("FirebaseApp was deleted");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageRewardedAdEliteNova2598)) {
            return false;
        }
        PolarVoyageRewardedAdEliteNova2598 polarVoyageRewardedAdEliteNova2598 = (PolarVoyageRewardedAdEliteNova2598) obj;
        polarVoyageRewardedAdEliteNova2598.PolarVoyageZipVortexCelestial6185();
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068.equals(polarVoyageRewardedAdEliteNova2598.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }

    public final int hashCode() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068.hashCode();
    }

    public final String toString() {
        PolarVoyageResourcesCelestialInferno9280 polarVoyageResourcesCelestialInferno9280 = new PolarVoyageResourcesCelestialInferno9280((Object) this);
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageMotionLayoutTransitionHeroVision4068, "name");
        polarVoyageResourcesCelestialInferno9280.PolarVoyagePackageManagerCelestialPhoenix8393(this.PolarVoyageKotlinBetaPulseBeta3653, "options");
        return polarVoyageResourcesCelestialInferno9280.toString();
    }
}
