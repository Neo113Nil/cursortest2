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
import defpackage.bh0;
import defpackage.fh0;
import defpackage.jh0;
import defpackage.o0;
import defpackage.sw2;
import defpackage.xq;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int OPXfSBeufaJ8 = 0;
    public int rtx2ld2ELZv4 = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.rtx2ld2ELZv4 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                fh0 Y1f8riQaR6yg = fh0.Y1f8riQaR6yg(this);
                if (i2 == -1) {
                    sw2 sw2Var = Y1f8riQaR6yg.cpQdD2nAriOS;
                    sw2Var.sendMessage(sw2Var.obtainMessage(3));
                } else if (i2 == 0) {
                    Y1f8riQaR6yg.e9gEMXR7LXtO(new xq(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.rtx2ld2ELZv4 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.rtx2ld2ELZv4 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.rtx2ld2ELZv4 = bundle.getInt("resolution");
        }
        if (this.rtx2ld2ELZv4 == 1) {
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
            jh0.x50lh2ztY7Y5(num);
            bh0.Y1f8riQaR6yg.TSizfFm2Yiuu(this, num.intValue(), this);
            this.rtx2ld2ELZv4 = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.rtx2ld2ELZv4 = 1;
            } catch (ActivityNotFoundException e) {
                e = e;
                ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    fh0.Y1f8riQaR6yg(googleApiActivity).e9gEMXR7LXtO(new xq(22, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String x50lh2ztY7Y5 = o0.x50lh2ztY7Y5("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        x50lh2ztY7Y5 = x50lh2ztY7Y5.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", x50lh2ztY7Y5, activityNotFoundException);
                }
                googleApiActivity.rtx2ld2ELZv4 = 1;
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
        bundle.putInt("resolution", this.rtx2ld2ELZv4);
        super.onSaveInstanceState(bundle);
    }
}
