package p000createpolar;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageSupervisorJobMaxSpectra4388 extends PolarVoyageLifecycleRogueVortexTurbo2281 {
    public final Method PolarVoyageBottomSheetOmegaNeo1907;
    public final Class PolarVoyageDiffUtilTurboStrike5735;
    public final Method PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Method PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Method PolarVoyageStrictModeLegendEpic1532;
    public final Constructor PolarVoyageTextInputEditTextNebulaHero6651;
    public final Method PolarVoyageViewRogueMaster4778;

    public PolarVoyageSupervisorJobMaxSpectra4388() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = PolarVoyageCameraViewSpectraMaxSpectra2824(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = PolarVoyagePackageManagerCelestialPhoenix8393(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.PolarVoyageDiffUtilTurboStrike5735 = cls;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = constructor;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = method2;
        this.PolarVoyageStrictModeLegendEpic1532 = method3;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = method4;
        this.PolarVoyageBottomSheetOmegaNeo1907 = method5;
        this.PolarVoyageViewRogueMaster4778 = method;
    }

    public static Method PolarVoyageCameraViewSpectraMaxSpectra2824(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean PolarVoyageAlertDialogCyberHeroQuantum3938(Object obj) {
        try {
            return ((Boolean) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // p000createpolar.PolarVoyageLifecycleRogueVortexTurbo2281, p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageBarcodeScannerInfernoSolarSpark7767(Context context, PolarVoyageConfigurationCyberHero6081 polarVoyageConfigurationCyberHero6081, Resources resources) {
        Object obj;
        Method method = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.PolarVoyageBarcodeScannerInfernoSolarSpark7767(context, polarVoyageConfigurationCyberHero6081, resources);
        }
        try {
            obj = this.PolarVoyageTextInputEditTextNebulaHero6651.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            PolarVoyageJavaPixelDeltaCelestial2899[] polarVoyageJavaPixelDeltaCelestial2899Arr = polarVoyageConfigurationCyberHero6081.PolarVoyageZipVortexCelestial6185;
            int length = polarVoyageJavaPixelDeltaCelestial2899Arr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    PolarVoyageJavaPixelDeltaCelestial2899 polarVoyageJavaPixelDeltaCelestial2899 = polarVoyageJavaPixelDeltaCelestial2899Arr[i];
                    String str = polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageZipVortexCelestial6185;
                    int i2 = polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageBitmapVisionAuroraPixel4705;
                    int i3 = polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    boolean z = polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageKotlinBetaPulseBeta3653;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                    PolarVoyageSupervisorJobMaxSpectra4388 polarVoyageSupervisorJobMaxSpectra4388 = this;
                    Context context2 = context;
                    if (polarVoyageSupervisorJobMaxSpectra4388.PolarVoyageLayerDrawableShadowTitaniumOmega1942(context2, obj, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                        i++;
                        this = polarVoyageSupervisorJobMaxSpectra4388;
                        context = context2;
                    } else {
                        try {
                            polarVoyageSupervisorJobMaxSpectra4388.PolarVoyageBottomSheetOmegaNeo1907.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    PolarVoyageSupervisorJobMaxSpectra4388 polarVoyageSupervisorJobMaxSpectra43882 = this;
                    if (polarVoyageSupervisorJobMaxSpectra43882.PolarVoyageAlertDialogCyberHeroQuantum3938(obj)) {
                        return polarVoyageSupervisorJobMaxSpectra43882.PolarVoyageMotionLayoutForceEpicAurora7183(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // p000createpolar.PolarVoyageLifecycleRogueVortexTurbo2281, p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageBitmapVisionAuroraPixel4705(Context context, PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
        Object obj;
        Typeface PolarVoyageMotionLayoutForceEpicAurora7183;
        boolean z;
        if (polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr.length >= 1) {
            Method method = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos5977 : polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
                        if (polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageDiffUtilTurboStrike5735 == 0) {
                            Uri uri = polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageZipVortexCelestial6185;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageBottomSheetOmegaNeo1907(uri, context));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.PolarVoyageTextInputEditTextNebulaHero6651.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr.length;
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.PolarVoyageBottomSheetOmegaNeo1907;
                            if (i < length) {
                                PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos59772 = polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr[i];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(polarVoyageProcessCameraProviderDragonEpicCosmos59772.PolarVoyageZipVortexCelestial6185);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.PolarVoyageStrictModeLegendEpic1532.invoke(obj, byteBuffer, Integer.valueOf(polarVoyageProcessCameraProviderDragonEpicCosmos59772.PolarVoyageMotionLayoutTransitionHeroVision4068), null, Integer.valueOf(polarVoyageProcessCameraProviderDragonEpicCosmos59772.PolarVoyageKotlinBetaPulseBeta3653), Integer.valueOf(polarVoyageProcessCameraProviderDragonEpicCosmos59772.PolarVoyageBarcodeScannerInfernoSolarSpark7767 ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (PolarVoyageAlertDialogCyberHeroQuantum3938(obj) && (PolarVoyageMotionLayoutForceEpicAurora7183 = PolarVoyageMotionLayoutForceEpicAurora7183(obj)) != null) {
                                return Typeface.create(PolarVoyageMotionLayoutForceEpicAurora7183, 0);
                            }
                        }
                    }
                } else {
                    PolarVoyageProcessCameraProviderDragonEpicCosmos5977 PolarVoyageStrictModeLegendEpic1532 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageStrictModeLegendEpic1532(polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(PolarVoyageStrictModeLegendEpic1532.PolarVoyageKotlinBetaPulseBeta3653).setItalic(PolarVoyageStrictModeLegendEpic1532.PolarVoyageBarcodeScannerInfernoSolarSpark7767).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    public final boolean PolarVoyageLayerDrawableShadowTitaniumOmega1942(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.PolarVoyageItemDecorationUltraDeltaEpic7485.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface PolarVoyageMotionLayoutForceEpicAurora7183(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.PolarVoyageDiffUtilTurboStrike5735, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.PolarVoyageViewRogueMaster4778.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method PolarVoyagePackageManagerCelestialPhoenix8393(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageTextInputEditTextNebulaHero6651(Context context, Resources resources, String str) {
        Object obj;
        Method method = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.PolarVoyageTextInputEditTextNebulaHero6651(context, resources, str);
        }
        try {
            obj = this.PolarVoyageTextInputEditTextNebulaHero6651.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!PolarVoyageLayerDrawableShadowTitaniumOmega1942(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.PolarVoyageBottomSheetOmegaNeo1907.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (PolarVoyageAlertDialogCyberHeroQuantum3938(obj)) {
                return PolarVoyageMotionLayoutForceEpicAurora7183(obj);
            }
        }
        return null;
    }
}
