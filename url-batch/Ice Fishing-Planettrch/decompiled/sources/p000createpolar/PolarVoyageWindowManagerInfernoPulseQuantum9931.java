package p000createpolar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.PackageFactory;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageWindowManagerInfernoPulseQuantum9931 implements Runnable {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageWindowManagerInfernoPulseQuantum9931(Context context, PolarVoyageIntentCyberElite6469 polarVoyageIntentCyberElite6469, CountDownLatch countDownLatch) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 4;
        this.PolarVoyageStrictModeLegendEpic1532 = context;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageIntentCyberElite6469;
        this.PolarVoyageBottomSheetOmegaNeo1907 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        int i;
        PolarVoyageDialogFragmentTitanCelestial7995 PolarVoyageCameraPixelBlaze2629;
        Object obj = null;
        boolean z = false;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.PolarVoyageBottomSheetOmegaNeo1907).sendInstallReferrerI((ReferrerDetails) this.PolarVoyageStrictModeLegendEpic1532, (String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return;
            case 1:
                ((Handler) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).post(new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(11, this, ((AsyncTaskExecutor) this.PolarVoyageBottomSheetOmegaNeo1907).doInBackground((Object[]) this.PolarVoyageStrictModeLegendEpic1532)));
                return;
            case 2:
                try {
                    obj = ((PolarVoyageConfigurationMasterQuantum9122) this.PolarVoyageStrictModeLegendEpic1532).call();
                } catch (Exception unused) {
                }
                ((Handler) this.PolarVoyageBottomSheetOmegaNeo1907).post(new PolarVoyageFaceDetectionPrimeUltraPhoenix9679(21, (PolarVoyageOnPreDrawListenerCelestialTitaniumAurora4421) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, obj, z));
                return;
            case 3:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.PolarVoyageBottomSheetOmegaNeo1907;
                weakReference = sdkClickHandler.activityHandlerWeakRef;
                IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
                if (iActivityHandler == null) {
                    return;
                }
                sdkClickHandler.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage((String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768, (String) this.PolarVoyageStrictModeLegendEpic1532, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager()));
                return;
            default:
                PolarVoyageIntentCyberElite6469 polarVoyageIntentCyberElite6469 = (PolarVoyageIntentCyberElite6469) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                Intent intent = polarVoyageIntentCyberElite6469.PolarVoyageItemDecorationUltraDeltaEpic7485;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    PolarVoyageCameraPixelBlaze2629 = PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageStrictModeLegendEpic1532(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = polarVoyageIntentCyberElite6469.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = polarVoyageIntentCyberElite6469.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    Context context = (Context) this.PolarVoyageStrictModeLegendEpic1532;
                    bundle.putBoolean("supports_message_handled", true);
                    PolarVoyageSQLiteTitanForceLegend7380 PolarVoyageViewRogueMaster4778 = PolarVoyageSQLiteTitanForceLegend7380.PolarVoyageViewRogueMaster4778(context);
                    synchronized (PolarVoyageViewRogueMaster4778) {
                        i = PolarVoyageViewRogueMaster4778.PolarVoyageZipVortexCelestial6185;
                        PolarVoyageViewRogueMaster4778.PolarVoyageZipVortexCelestial6185 = i + 1;
                    }
                    PolarVoyageCameraPixelBlaze2629 = PolarVoyageViewRogueMaster4778.PolarVoyageCameraPixelBlaze2629(new PolarVoyageAnimatorHeroPrime4575(i, 2, bundle, 0));
                }
                PolarVoyageCameraPixelBlaze2629.PolarVoyageZipVortexCelestial6185(PolarVoyageViewPager2InfernoEpic1202.PolarVoyageStrictModeLegendEpic1532, new PolarVoyageNotificationGammaPhantom9338((CountDownLatch) this.PolarVoyageBottomSheetOmegaNeo1907));
                return;
        }
    }

    public /* synthetic */ PolarVoyageWindowManagerInfernoPulseQuantum9931(Object obj, Object obj2, Object obj3, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = obj2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj3;
    }

    public PolarVoyageWindowManagerInfernoPulseQuantum9931(SdkClickHandler sdkClickHandler, String str, String str2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 3;
        this.PolarVoyageBottomSheetOmegaNeo1907 = sdkClickHandler;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
        this.PolarVoyageStrictModeLegendEpic1532 = str2;
    }
}
