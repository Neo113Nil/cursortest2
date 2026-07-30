package p000createpolar;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageMeteringPointPhantomDragonStrike4266 {
    public static final HashMap PolarVoyageZipVortexCelestial6185 = new HashMap();
    public static final HashMap PolarVoyageMotionLayoutTransitionHeroVision4068 = new HashMap();

    public static int PolarVoyageMotionLayoutTransitionHeroVision4068(Class cls) {
        Constructor<?> constructor;
        boolean z;
        HashMap hashMap = PolarVoyageZipVortexCelestial6185;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String concat = PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageAnimatorSetSparkUltraMax8233(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (constructor != null) {
                hashMap2.put(cls, PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageGuidelineStormSolar2850(constructor));
            } else {
                PolarVoyageRoomDaoQuantumMaxVision2238 polarVoyageRoomDaoQuantumMaxVision2238 = PolarVoyageRoomDaoQuantumMaxVision2238.PolarVoyageKotlinBetaPulseBeta3653;
                HashMap hashMap3 = polarVoyageRoomDaoQuantumMaxVision2238.PolarVoyageMotionLayoutTransitionHeroVision4068;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                            if (((PolarVoyageInsetDrawableOmegaSpectra9965) declaredMethods[i2].getAnnotation(PolarVoyageInsetDrawableOmegaSpectra9965.class)) != null) {
                                polarVoyageRoomDaoQuantumMaxVision2238.PolarVoyageZipVortexCelestial6185(cls, declaredMethods);
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && PolarVoyageAlertDialogGammaCyber6614.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (PolarVoyageMotionLayoutTransitionHeroVision4068(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    interfaces.getClass();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && PolarVoyageAlertDialogGammaCyber6614.class.isAssignableFrom(cls2)) {
                                cls2.getClass();
                                if (PolarVoyageMotionLayoutTransitionHeroVision4068(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                obj2.getClass();
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }

    public static void PolarVoyageZipVortexCelestial6185(Constructor constructor, PolarVoyageAlertDialogGammaCyber6614 polarVoyageAlertDialogGammaCyber6614) {
        try {
            constructor.newInstance(polarVoyageAlertDialogGammaCyber6614).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
