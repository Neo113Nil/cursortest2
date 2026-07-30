package p000createpolar;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageMotionEventEliteCelestialDragon9387 {
    public static final List PolarVoyageZipVortexCelestial6185 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageConfigurationMaxSpectraForce5418(Application.class, PolarVoyageFilterMaxCosmos5828.class);
    public static final List PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageGuidelineStormSolar2850(PolarVoyageFilterMaxCosmos5828.class);

    public static final PolarVoyageValueAnimatorSparkDragonNovaX4109 PolarVoyageMotionLayoutTransitionHeroVision4068(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (PolarVoyageValueAnimatorSparkDragonNovaX4109) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageCameraPixelBlaze2629("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    public static final Constructor PolarVoyageZipVortexCelestial6185(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List PolarVoyageAnalyticsSpeedEpic1910 = PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageAnalyticsSpeedEpic1910(parameterTypes);
            if (list.equals(PolarVoyageAnalyticsSpeedEpic1910)) {
                return constructor;
            }
            if (list.size() == PolarVoyageAnalyticsSpeedEpic1910.size() && PolarVoyageAnalyticsSpeedEpic1910.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
