package p000createpolar;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageTextRecognitionSpeedInfernoStrike2763 {
    public final Unsafe PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTextRecognitionSpeedInfernoStrike2763(Unsafe unsafe) {
        this.PolarVoyageZipVortexCelestial6185 = unsafe;
    }

    public abstract double PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j, Object obj);

    public abstract float PolarVoyageBitmapVisionAuroraPixel4705(long j, Object obj);

    public abstract void PolarVoyageBottomSheetOmegaNeo1907(Object obj, long j, byte b);

    public abstract void PolarVoyageCameraPixelBlaze2629(Object obj, long j, float f);

    public final void PolarVoyageContentProviderHyperSpark3838(long j, Object obj, Object obj2) {
        this.PolarVoyageZipVortexCelestial6185.putObject(obj, j, obj2);
    }

    public final int PolarVoyageDiffUtilTurboStrike5735(long j, Object obj) {
        return this.PolarVoyageZipVortexCelestial6185.getInt(obj, j);
    }

    public final void PolarVoyageDrawableDeltaHyperion5742(Object obj, long j, int i) {
        this.PolarVoyageZipVortexCelestial6185.putInt(obj, j, i);
    }

    public final Object PolarVoyageItemDecorationUltraDeltaEpic7485(long j, Object obj) {
        return this.PolarVoyageZipVortexCelestial6185.getObject(obj, j);
    }

    public abstract boolean PolarVoyageKotlinBetaPulseBeta3653(long j, Object obj);

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068(Class cls) {
        return this.PolarVoyageZipVortexCelestial6185.arrayIndexScale(cls);
    }

    public abstract boolean PolarVoyageNavigationViewHyperHyperHyperion1793();

    public boolean PolarVoyageRemoteModelManagerOlympianCelestial9141() {
        Unsafe unsafe = this.PolarVoyageZipVortexCelestial6185;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            PolarVoyageNestedScrollViewStormHero6620.PolarVoyageZipVortexCelestial6185(th);
            return false;
        }
    }

    public abstract void PolarVoyageRotateAnimationCyberCelestialDelta4768(Object obj, long j, boolean z);

    public final void PolarVoyageSnackbarGammaEclipse2140(Object obj, long j, long j2) {
        this.PolarVoyageZipVortexCelestial6185.putLong(obj, j, j2);
    }

    public final long PolarVoyageStrictModeLegendEpic1532(Field field) {
        return this.PolarVoyageZipVortexCelestial6185.objectFieldOffset(field);
    }

    public final long PolarVoyageTextInputEditTextNebulaHero6651(long j, Object obj) {
        return this.PolarVoyageZipVortexCelestial6185.getLong(obj, j);
    }

    public abstract void PolarVoyageViewRogueMaster4778(Object obj, long j, double d);

    public final int PolarVoyageZipVortexCelestial6185(Class cls) {
        return this.PolarVoyageZipVortexCelestial6185.arrayBaseOffset(cls);
    }
}
