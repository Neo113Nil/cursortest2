package p000createpolar;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.PolarVoyageOnGlobalLayoutListenerVortexEpic7760;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePushNotificationMasterEclipse8074 extends PolarVoyageLinearLayoutDragonBlazeSpeed3556 {
    public final /* synthetic */ PolarVoyageOnGlobalLayoutListenerVortexEpic7760 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final IBinder PolarVoyageTextInputEditTextNebulaHero6651;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyagePushNotificationMasterEclipse8074(PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic7760, int i, IBinder iBinder, Bundle bundle) {
        super(polarVoyageOnGlobalLayoutListenerVortexEpic7760, i, bundle);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageOnGlobalLayoutListenerVortexEpic7760;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = iBinder;
    }

    @Override // p000createpolar.PolarVoyageLinearLayoutDragonBlazeSpeed3556
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        IBinder iBinder = this.PolarVoyageTextInputEditTextNebulaHero6651;
        try {
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic7760 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (!polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageNavigationViewHyperHyperHyperion1793().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageNavigationViewHyperHyperHyperion1793() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface PolarVoyageCameraPixelBlaze2629 = polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageCameraPixelBlaze2629(iBinder);
            if (PolarVoyageCameraPixelBlaze2629 == null || !(PolarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageOnGlobalLayoutListenerVortexEpic7760, 2, 4, PolarVoyageCameraPixelBlaze2629) || PolarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageDisplayMetricsVortexDragon9516(polarVoyageOnGlobalLayoutListenerVortexEpic7760, 3, 4, PolarVoyageCameraPixelBlaze2629))) {
                return false;
            }
            polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageAnimatorSetSparkUltraMax8233 = null;
            PolarVoyageRecyclerViewUltraBlazeThunder8612 polarVoyageRecyclerViewUltraBlazeThunder8612 = polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageDrawableDeltaHyperion5742;
            if (polarVoyageRecyclerViewUltraBlazeThunder8612 == null) {
                return true;
            }
            ((PolarVoyageActivityInfoMasterHero7764) polarVoyageRecyclerViewUltraBlazeThunder8612.PolarVoyageStrictModeLegendEpic1532).PolarVoyageMotionLayoutTransitionHeroVision4068();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p000createpolar.PolarVoyageLinearLayoutDragonBlazeSpeed3556
    public final void PolarVoyageZipVortexCelestial6185(ConnectionResult connectionResult) {
        PolarVoyageRecyclerViewUltraBlazeThunder8612 polarVoyageRecyclerViewUltraBlazeThunder8612 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageSnackbarGammaEclipse2140;
        if (polarVoyageRecyclerViewUltraBlazeThunder8612 != null) {
            ((PolarVoyageOrientationSensorCelestialEpic2073) polarVoyageRecyclerViewUltraBlazeThunder8612.PolarVoyageStrictModeLegendEpic1532).PolarVoyageKotlinBetaPulseBeta3653(connectionResult);
        }
        System.currentTimeMillis();
    }
}
