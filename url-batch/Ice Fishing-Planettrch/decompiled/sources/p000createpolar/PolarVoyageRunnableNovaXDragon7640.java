package p000createpolar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageRunnableNovaXDragon7640 implements PolarVoyageLooperHyperionOlympian2573 {
    public static final PolarVoyageDelayNovaRogueBeta9839 PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyageDelayNovaRogueBeta9839(20);
    public final Method PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final Method PolarVoyageKotlinBetaPulseBeta3653;
    public final Method PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final Class PolarVoyageZipVortexCelestial6185;

    public PolarVoyageRunnableNovaXDragon7640(Class cls) {
        this.PolarVoyageZipVortexCelestial6185 = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.PolarVoyageKotlinBetaPulseBeta3653 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.PolarVoyageZipVortexCelestial6185.isInstance(sSLSocket)) {
            try {
                this.PolarVoyageMotionLayoutTransitionHeroVision4068.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                PolarVoyagePagingCyberUltraMaster2078 polarVoyagePagingCyberUltraMaster2078 = PolarVoyagePagingCyberUltraMaster2078.PolarVoyageZipVortexCelestial6185;
                method.invoke(sSLSocket, PolarVoyagePreviewDeltaVisionCyber7933.PolarVoyageRotateAnimationCyberCelestialDelta4768(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageKotlinBetaPulseBeta3653(SSLSocket sSLSocket) {
        return this.PolarVoyageZipVortexCelestial6185.isInstance(sSLSocket);
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        boolean z = PolarVoyageStorageShadowEpicGamma8718.PolarVoyageBitmapVisionAuroraPixel4705;
        return PolarVoyageStorageShadowEpicGamma8718.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final String PolarVoyageZipVortexCelestial6185(SSLSocket sSLSocket) {
        if (this.PolarVoyageZipVortexCelestial6185.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.PolarVoyageKotlinBetaPulseBeta3653.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, PolarVoyageLiveDataScopeMasterAurora3603.PolarVoyageZipVortexCelestial6185);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }
}
