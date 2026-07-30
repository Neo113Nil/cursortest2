package p000createpolar;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRoomDaoQuantumMaxVision2238 {
    public static final PolarVoyageRoomDaoQuantumMaxVision2238 PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageRoomDaoQuantumMaxVision2238();
    public final HashMap PolarVoyageZipVortexCelestial6185 = new HashMap();
    public final HashMap PolarVoyageMotionLayoutTransitionHeroVision4068 = new HashMap();

    public static void PolarVoyageMotionLayoutTransitionHeroVision4068(HashMap hashMap, PolarVoyageLiveDataScopeGammaVision2150 polarVoyageLiveDataScopeGammaVision2150, PolarVoyageMaterialButtonSpeedStormGamma5612 polarVoyageMaterialButtonSpeedStormGamma5612, Class cls) {
        PolarVoyageMaterialButtonSpeedStormGamma5612 polarVoyageMaterialButtonSpeedStormGamma56122 = (PolarVoyageMaterialButtonSpeedStormGamma5612) hashMap.get(polarVoyageLiveDataScopeGammaVision2150);
        if (polarVoyageMaterialButtonSpeedStormGamma56122 == null || polarVoyageMaterialButtonSpeedStormGamma5612 == polarVoyageMaterialButtonSpeedStormGamma56122) {
            if (polarVoyageMaterialButtonSpeedStormGamma56122 == null) {
                hashMap.put(polarVoyageLiveDataScopeGammaVision2150, polarVoyageMaterialButtonSpeedStormGamma5612);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + polarVoyageLiveDataScopeGammaVision2150.PolarVoyageMotionLayoutTransitionHeroVision4068.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + polarVoyageMaterialButtonSpeedStormGamma56122 + ", new value " + polarVoyageMaterialButtonSpeedStormGamma5612);
    }

    public final PolarVoyageFlipAnimationHeroSpectra8345 PolarVoyageZipVortexCelestial6185(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.PolarVoyageZipVortexCelestial6185;
        if (superclass != null) {
            PolarVoyageFlipAnimationHeroSpectra8345 polarVoyageFlipAnimationHeroSpectra8345 = (PolarVoyageFlipAnimationHeroSpectra8345) hashMap2.get(superclass);
            if (polarVoyageFlipAnimationHeroSpectra8345 == null) {
                polarVoyageFlipAnimationHeroSpectra8345 = PolarVoyageZipVortexCelestial6185(superclass, null);
            }
            hashMap.putAll(polarVoyageFlipAnimationHeroSpectra8345.PolarVoyageMotionLayoutTransitionHeroVision4068);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            PolarVoyageFlipAnimationHeroSpectra8345 polarVoyageFlipAnimationHeroSpectra83452 = (PolarVoyageFlipAnimationHeroSpectra8345) hashMap2.get(cls2);
            if (polarVoyageFlipAnimationHeroSpectra83452 == null) {
                polarVoyageFlipAnimationHeroSpectra83452 = PolarVoyageZipVortexCelestial6185(cls2, null);
            }
            for (Map.Entry entry : polarVoyageFlipAnimationHeroSpectra83452.PolarVoyageMotionLayoutTransitionHeroVision4068.entrySet()) {
                PolarVoyageMotionLayoutTransitionHeroVision4068(hashMap, (PolarVoyageLiveDataScopeGammaVision2150) entry.getKey(), (PolarVoyageMaterialButtonSpeedStormGamma5612) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            PolarVoyageInsetDrawableOmegaSpectra9965 polarVoyageInsetDrawableOmegaSpectra9965 = (PolarVoyageInsetDrawableOmegaSpectra9965) method.getAnnotation(PolarVoyageInsetDrawableOmegaSpectra9965.class);
            if (polarVoyageInsetDrawableOmegaSpectra9965 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!PolarVoyageTranslateAnimationMegaCyber7300.class.isAssignableFrom(parameterTypes[0])) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                PolarVoyageMaterialButtonSpeedStormGamma5612 value = polarVoyageInsetDrawableOmegaSpectra9965.value();
                if (parameterTypes.length > 1) {
                    if (!PolarVoyageMaterialButtonSpeedStormGamma5612.class.isAssignableFrom(parameterTypes[1])) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != PolarVoyageMaterialButtonSpeedStormGamma5612.ON_ANY) {
                        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("cannot have more than 2 params");
                    return null;
                }
                PolarVoyageMotionLayoutTransitionHeroVision4068(hashMap, new PolarVoyageLiveDataScopeGammaVision2150(i, method), value, cls);
                z = true;
            }
        }
        PolarVoyageFlipAnimationHeroSpectra8345 polarVoyageFlipAnimationHeroSpectra83453 = new PolarVoyageFlipAnimationHeroSpectra8345(hashMap);
        hashMap2.put(cls, polarVoyageFlipAnimationHeroSpectra83453);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068.put(cls, Boolean.valueOf(z));
        return polarVoyageFlipAnimationHeroSpectra83453;
    }
}
