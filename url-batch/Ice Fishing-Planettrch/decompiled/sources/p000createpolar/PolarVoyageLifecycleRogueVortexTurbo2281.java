package p000createpolar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageLifecycleRogueVortexTurbo2281 extends PolarVoyageLiveDataSpectraNebulaPixel5961 {
    public static Method PolarVoyageBarcodeScannerInfernoSolarSpark7767 = null;
    public static boolean PolarVoyageBitmapVisionAuroraPixel4705 = false;
    public static Method PolarVoyageKotlinBetaPulseBeta3653;
    public static Constructor PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static Class PolarVoyageZipVortexCelestial6185;

    public static boolean PolarVoyageBitmapMaxTitanTitan7960(Object obj, String str, int i, boolean z) {
        PolarVoyageDisplayMetricsVortexDragon9516();
        try {
            return ((Boolean) PolarVoyageKotlinBetaPulseBeta3653.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void PolarVoyageDisplayMetricsVortexDragon9516() {
        Method method;
        Class<?> cls;
        Method method2;
        if (PolarVoyageBitmapVisionAuroraPixel4705) {
            return;
        }
        PolarVoyageBitmapVisionAuroraPixel4705 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068 = constructor;
        PolarVoyageZipVortexCelestial6185 = cls;
        PolarVoyageKotlinBetaPulseBeta3653 = method2;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = method;
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public Typeface PolarVoyageBarcodeScannerInfernoSolarSpark7767(Context context, PolarVoyageConfigurationCyberHero6081 polarVoyageConfigurationCyberHero6081, Resources resources) {
        PolarVoyageDisplayMetricsVortexDragon9516();
        try {
            Object newInstance = PolarVoyageMotionLayoutTransitionHeroVision4068.newInstance(null);
            for (PolarVoyageJavaPixelDeltaCelestial2899 polarVoyageJavaPixelDeltaCelestial2899 : polarVoyageConfigurationCyberHero6081.PolarVoyageZipVortexCelestial6185) {
                File PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageTextInputEditTextNebulaHero6651(context);
                if (PolarVoyageTextInputEditTextNebulaHero6651 == null) {
                    return null;
                }
                try {
                    if (!PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextInputEditTextNebulaHero6651, resources, polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageDiffUtilTurboStrike5735)) {
                        return null;
                    }
                    if (!PolarVoyageBitmapMaxTitanTitan7960(newInstance, PolarVoyageTextInputEditTextNebulaHero6651.getPath(), polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageKotlinBetaPulseBeta3653)) {
                        return null;
                    }
                    PolarVoyageTextInputEditTextNebulaHero6651.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    PolarVoyageTextInputEditTextNebulaHero6651.delete();
                }
            }
            PolarVoyageDisplayMetricsVortexDragon9516();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) PolarVoyageZipVortexCelestial6185, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) PolarVoyageBarcodeScannerInfernoSolarSpark7767.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface PolarVoyageBitmapVisionAuroraPixel4705(Context context, PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
        File file;
        File PolarVoyageTextInputEditTextNebulaHero6651;
        Typeface createFromFile;
        String readlink;
        if (polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageStrictModeLegendEpic1532(polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr).PolarVoyageZipVortexCelestial6185, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageTextInputEditTextNebulaHero6651(context);
                            if (PolarVoyageTextInputEditTextNebulaHero6651 != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    PolarVoyageTextInputEditTextNebulaHero6651.delete();
                                    throw th;
                                }
                                if (PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageTextInputEditTextNebulaHero6651, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(PolarVoyageTextInputEditTextNebulaHero6651.getPath());
                                    PolarVoyageTextInputEditTextNebulaHero6651.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                PolarVoyageTextInputEditTextNebulaHero6651.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageTextInputEditTextNebulaHero6651(context);
                        if (PolarVoyageTextInputEditTextNebulaHero6651 != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
