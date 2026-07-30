package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import p000createpolar.PolarVoyageDataBindingMasterDragonCyber7565;
import p000createpolar.PolarVoyageFilterBlazeCelestial3240;
import p000createpolar.PolarVoyageLayoutInflaterMegaAlpha5562;
import p000createpolar.PolarVoyageLayoutTitaniumOlympian9962;
import p000createpolar.PolarVoyageVibratorInfernoPhoenixFusion4401;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int PolarVoyageStrictModeLegendEpic1532 = 0;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                PolarVoyageDataBindingMasterDragonCyber7565 PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageDataBindingMasterDragonCyber7565.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this);
                if (i2 == -1) {
                    PolarVoyageLayoutTitaniumOlympian9962 polarVoyageLayoutTitaniumOlympian9962 = PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapMaxTitanTitan7960;
                    polarVoyageLayoutTitaniumOlympian9962.sendMessage(polarVoyageLayoutTitaniumOlympian9962.obtainMessage(3));
                } else if (i2 == 0) {
                    PolarVoyageBarcodeScannerInfernoSolarSpark7767.PolarVoyageBitmapVisionAuroraPixel4705(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = bundle.getInt("resolution");
        }
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageDisplayMetricsVortexDragon9516(num);
            PolarVoyageFilterBlazeCelestial3240.PolarVoyageKotlinBetaPulseBeta3653.PolarVoyageKotlinBetaPulseBeta3653(this, num.intValue(), this);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
            } catch (ActivityNotFoundException e) {
                e = e;
                ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    PolarVoyageDataBindingMasterDragonCyber7565.PolarVoyageBarcodeScannerInfernoSolarSpark7767(googleApiActivity).PolarVoyageBitmapVisionAuroraPixel4705(new ConnectionResult(22, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageBottomSheetOmegaNeo1907("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageBottomSheetOmegaNeo1907.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", PolarVoyageBottomSheetOmegaNeo1907, activityNotFoundException);
                }
                googleApiActivity.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                googleApiActivity.finish();
            }
        } catch (ActivityNotFoundException e3) {
            e = e3;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            googleApiActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        super.onSaveInstanceState(bundle);
    }
}
