package p000createpolar;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageRoomDaoPhantomGammaSolar1471 implements PolarVoyageRemoteConfigEliteSpectra7350 {
    public final /* synthetic */ Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageRoomDaoPhantomGammaSolar1471(int i, Object obj) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = obj;
    }

    @Override // p000createpolar.PolarVoyageRemoteConfigEliteSpectra7350
    public final Object get() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new PolarVoyageStrictModeMaxHyperInferno8823("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new PolarVoyageStrictModeMaxHyperInferno8823(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new PolarVoyageStrictModeMaxHyperInferno8823(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new PolarVoyageStrictModeMaxHyperInferno8823("Could not instantiate " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new PolarVoyageStrictModeMaxHyperInferno8823("Could not instantiate " + str, e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new PolarVoyageObserverInfernoForce3944((PolarVoyageRewardedAdEliteNova2598) obj);
        }
    }
}
