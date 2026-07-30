package p000createpolar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageColorStateListInflaterMaxVortex5857 extends PolarVoyageLiveDataSpectraNebulaPixel5961 {
    public static final Method PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final Method PolarVoyageKotlinBetaPulseBeta3653;
    public static final Constructor PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final Class PolarVoyageZipVortexCelestial6185;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068 = constructor;
        PolarVoyageZipVortexCelestial6185 = cls;
        PolarVoyageKotlinBetaPulseBeta3653 = method2;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = method;
    }

    public static boolean PolarVoyageBitmapMaxTitanTitan7960(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) PolarVoyageKotlinBetaPulseBeta3653.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface PolarVoyageDisplayMetricsVortexDragon9516(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) PolarVoyageZipVortexCelestial6185, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) PolarVoyageBarcodeScannerInfernoSolarSpark7767.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageBarcodeScannerInfernoSolarSpark7767(Context context, PolarVoyageConfigurationCyberHero6081 polarVoyageConfigurationCyberHero6081, Resources resources) {
        Object obj;
        int i;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = PolarVoyageMotionLayoutTransitionHeroVision4068.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (PolarVoyageJavaPixelDeltaCelestial2899 polarVoyageJavaPixelDeltaCelestial2899 : polarVoyageConfigurationCyberHero6081.PolarVoyageZipVortexCelestial6185) {
                int i2 = polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageDiffUtilTurboStrike5735;
                File PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageTextInputEditTextNebulaHero6651(context);
                if (PolarVoyageTextInputEditTextNebulaHero6651 != null) {
                    try {
                        if (PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTextInputEditTextNebulaHero6651, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(PolarVoyageTextInputEditTextNebulaHero6651);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i = (mappedByteBuffer != null && PolarVoyageBitmapMaxTitanTitan7960(obj, mappedByteBuffer, polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageJavaPixelDeltaCelestial2899.PolarVoyageKotlinBetaPulseBeta3653)) ? i + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        PolarVoyageTextInputEditTextNebulaHero6651.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return PolarVoyageDisplayMetricsVortexDragon9516(obj);
        }
        return null;
    }

    @Override // p000createpolar.PolarVoyageLiveDataSpectraNebulaPixel5961
    public final Typeface PolarVoyageBitmapVisionAuroraPixel4705(Context context, PolarVoyageProcessCameraProviderDragonEpicCosmos5977[] polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr) {
        Object obj;
        try {
            obj = PolarVoyageMotionLayoutTransitionHeroVision4068.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            PolarVoyageLevelListDrawablePhoenixMegaNebula9939 polarVoyageLevelListDrawablePhoenixMegaNebula9939 = new PolarVoyageLevelListDrawablePhoenixMegaNebula9939(0);
            int length = polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    PolarVoyageProcessCameraProviderDragonEpicCosmos5977 polarVoyageProcessCameraProviderDragonEpicCosmos5977 = polarVoyageProcessCameraProviderDragonEpicCosmos5977Arr[i];
                    Uri uri = polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageZipVortexCelestial6185;
                    ByteBuffer byteBuffer = (ByteBuffer) polarVoyageLevelListDrawablePhoenixMegaNebula9939.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = PolarVoyageDisplayMetricsCelestialMasterPrime1391.PolarVoyageBottomSheetOmegaNeo1907(uri, context);
                        polarVoyageLevelListDrawablePhoenixMegaNebula9939.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !PolarVoyageBitmapMaxTitanTitan7960(obj, byteBuffer, polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageKotlinBetaPulseBeta3653, polarVoyageProcessCameraProviderDragonEpicCosmos5977.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                        break;
                    }
                    i++;
                } else {
                    Typeface PolarVoyageDisplayMetricsVortexDragon9516 = PolarVoyageDisplayMetricsVortexDragon9516(obj);
                    if (PolarVoyageDisplayMetricsVortexDragon9516 != null) {
                        return Typeface.create(PolarVoyageDisplayMetricsVortexDragon9516, 0);
                    }
                }
            }
        }
        return null;
    }
}
