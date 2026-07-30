package p000createpolar;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageZipMegaFusion8832 {
    public final PolarVoyageContentObserverThunderOmega9101 PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageContentObserverThunderOmega9101 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageContentObserverThunderOmega9101 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageZipMegaFusion8832(PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101, PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega91012, PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega91013) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageContentObserverThunderOmega9101;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageContentObserverThunderOmega91012;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageContentObserverThunderOmega91013;
    }

    public final Method PolarVoyageBarcodeScannerInfernoSolarSpark7767(Class cls) {
        String name = cls.getName();
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Method method = (Method) polarVoyageContentObserverThunderOmega9101.get(name);
        if (method != null) {
            return method;
        }
        Class PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(cls);
        System.currentTimeMillis();
        Method declaredMethod = PolarVoyageMotionLayoutTransitionHeroVision4068.getDeclaredMethod("write", cls, PolarVoyageZipMegaFusion8832.class);
        polarVoyageContentObserverThunderOmega9101.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean PolarVoyageBitmapVisionAuroraPixel4705(int i);

    public final Parcelable PolarVoyageDiffUtilTurboStrike5735(Parcelable parcelable, int i) {
        if (!PolarVoyageBitmapVisionAuroraPixel4705(i)) {
            return parcelable;
        }
        return ((PolarVoyageNotificationManagerOlympianPixel2030) this).PolarVoyageBitmapVisionAuroraPixel4705.readParcelable(PolarVoyageNotificationManagerOlympianPixel2030.class.getClassLoader());
    }

    public abstract void PolarVoyageItemDecorationUltraDeltaEpic7485(int i);

    public final Method PolarVoyageKotlinBetaPulseBeta3653(String str) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageZipVortexCelestial6185;
        Method method = (Method) polarVoyageContentObserverThunderOmega9101.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, PolarVoyageZipMegaFusion8832.class.getClassLoader()).getDeclaredMethod("read", PolarVoyageZipMegaFusion8832.class);
        polarVoyageContentObserverThunderOmega9101.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Class PolarVoyageMotionLayoutTransitionHeroVision4068(Class cls) {
        String name = cls.getName();
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageKotlinBetaPulseBeta3653;
        Class cls2 = (Class) polarVoyageContentObserverThunderOmega9101.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        polarVoyageContentObserverThunderOmega9101.put(cls.getName(), cls3);
        return cls3;
    }

    public final void PolarVoyageStrictModeLegendEpic1532(PolarVoyageRunnableEclipseMaster1683 polarVoyageRunnableEclipseMaster1683) {
        if (polarVoyageRunnableEclipseMaster1683 == null) {
            ((PolarVoyageNotificationManagerOlympianPixel2030) this).PolarVoyageBitmapVisionAuroraPixel4705.writeString(null);
            return;
        }
        try {
            ((PolarVoyageNotificationManagerOlympianPixel2030) this).PolarVoyageBitmapVisionAuroraPixel4705.writeString(PolarVoyageMotionLayoutTransitionHeroVision4068(polarVoyageRunnableEclipseMaster1683.getClass()).getName());
            PolarVoyageNotificationManagerOlympianPixel2030 PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
            try {
                PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageRunnableEclipseMaster1683.getClass()).invoke(null, polarVoyageRunnableEclipseMaster1683, PolarVoyageZipVortexCelestial6185);
                Parcel parcel = PolarVoyageZipVortexCelestial6185.PolarVoyageBitmapVisionAuroraPixel4705;
                int i = PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532;
                if (i >= 0) {
                    int i2 = PolarVoyageZipVortexCelestial6185.PolarVoyageBarcodeScannerInfernoSolarSpark7767.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(polarVoyageRunnableEclipseMaster1683.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final PolarVoyageRunnableEclipseMaster1683 PolarVoyageTextInputEditTextNebulaHero6651() {
        String readString = ((PolarVoyageNotificationManagerOlympianPixel2030) this).PolarVoyageBitmapVisionAuroraPixel4705.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (PolarVoyageRunnableEclipseMaster1683) PolarVoyageKotlinBetaPulseBeta3653(readString).invoke(null, PolarVoyageZipVortexCelestial6185());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract PolarVoyageNotificationManagerOlympianPixel2030 PolarVoyageZipVortexCelestial6185();
}
