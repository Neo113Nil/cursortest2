package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import p000createpolar.PolarVoyageAnimationSetSpeedThunderStrike9776;
import p000createpolar.PolarVoyageBroadcastDragonShadowRogue6783;
import p000createpolar.PolarVoyageCamera2MasterPulse1881;
import p000createpolar.PolarVoyageProcessCameraProviderPhantomCyberPrime4205;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class GooglePlayServicesClient {

    /* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Google Play Services info can't be accessed from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        PolarVoyageAnimationSetSpeedThunderStrike9776 polarVoyageAnimationSetSpeedThunderStrike9776 = new PolarVoyageAnimationSetSpeedThunderStrike9776(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, polarVoyageAnimationSetSpeedThunderStrike9776, 1)) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageViewRogueMaster4778("Google Play connection failed");
            return null;
        }
        try {
            try {
                PolarVoyageProcessCameraProviderPhantomCyberPrime4205 polarVoyageProcessCameraProviderPhantomCyberPrime4205 = new PolarVoyageProcessCameraProviderPhantomCyberPrime4205(polarVoyageAnimationSetSpeedThunderStrike9776.PolarVoyageZipVortexCelestial6185());
                return new GooglePlayServicesInfo(polarVoyageProcessCameraProviderPhantomCyberPrime4205.PolarVoyageZipVortexCelestial6185(), polarVoyageProcessCameraProviderPhantomCyberPrime4205.PolarVoyageMotionLayoutTransitionHeroVision4068());
            } catch (Exception e) {
                throw e;
            }
        } finally {
            context.unbindService(polarVoyageAnimationSetSpeedThunderStrike9776);
        }
    }
}
