package p000createpolar;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSoundPoolBlazePhoenixCosmos5800 extends PolarVoyageSensorManagerStormStormMega7946 {
    public static final PolarVoyageServiceInfoNovaCyber2044 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageServiceInfoNovaCyber2044(8);
    public static PolarVoyageSoundPoolBlazePhoenixCosmos5800 PolarVoyageKotlinBetaPulseBeta3653;
    public final Application PolarVoyageMotionLayoutTransitionHeroVision4068;

    public PolarVoyageSoundPoolBlazePhoenixCosmos5800(Application application) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = application;
    }

    public final PolarVoyageValueAnimatorSparkDragonNovaX4109 PolarVoyageBarcodeScannerInfernoSolarSpark7767(Class cls, Application application) {
        if (!PolarVoyageFlatMapHyperMegaSpeed2872.class.isAssignableFrom(cls)) {
            return PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageRemoteModelManagerOlympianCelestial9141(cls);
        }
        try {
            PolarVoyageValueAnimatorSparkDragonNovaX4109 polarVoyageValueAnimatorSparkDragonNovaX4109 = (PolarVoyageValueAnimatorSparkDragonNovaX4109) cls.getConstructor(Application.class).newInstance(application);
            polarVoyageValueAnimatorSparkDragonNovaX4109.getClass();
            return polarVoyageValueAnimatorSparkDragonNovaX4109;
        } catch (IllegalAccessException e) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // p000createpolar.PolarVoyageSensorManagerStormStormMega7946, p000createpolar.PolarVoyageLayerThunderPhantom1318
    public final PolarVoyageValueAnimatorSparkDragonNovaX4109 PolarVoyageMotionLayoutTransitionHeroVision4068(Class cls, PolarVoyageAnimationSetSpeedVision8531 polarVoyageAnimationSetSpeedVision8531) {
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 != null) {
            return PolarVoyageZipVortexCelestial6185(cls);
        }
        Application application = (Application) polarVoyageAnimationSetSpeedVision8531.PolarVoyageZipVortexCelestial6185.get(PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        if (application != null) {
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(cls, application);
        }
        if (!PolarVoyageFlatMapHyperMegaSpeed2872.class.isAssignableFrom(cls)) {
            return PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageRemoteModelManagerOlympianCelestial9141(cls);
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // p000createpolar.PolarVoyageSensorManagerStormStormMega7946, p000createpolar.PolarVoyageLayerThunderPhantom1318
    public final PolarVoyageValueAnimatorSparkDragonNovaX4109 PolarVoyageZipVortexCelestial6185(Class cls) {
        Application application = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (application != null) {
            return PolarVoyageBarcodeScannerInfernoSolarSpark7767(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
