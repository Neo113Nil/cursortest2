package com.google.android.gms.common.api;

import A.AbstractC0017m;
import E1.b;
import G1.d;
import H1.o;
import P1.e;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6025e = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f6026d = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i4, Intent intent) {
        super.onActivityResult(i2, i4, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f6026d = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                d d4 = d.d(this);
                if (i4 == -1) {
                    e eVar = d4.f3122m;
                    eVar.sendMessage(eVar.obtainMessage(3));
                } else if (i4 == 0) {
                    d4.e(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f6026d = 0;
            setResult(i4, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f6026d = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6026d = bundle.getInt("resolution");
        }
        if (this.f6026d != 1) {
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
                o.d(num);
                E1.e.f2288d.c(this, num.intValue(), this);
                this.f6026d = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f6026d = 1;
            } catch (ActivityNotFoundException e4) {
                if (extras.getBoolean("notify_manager", true)) {
                    d.d(this).e(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String j4 = AbstractC0017m.j("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        j4 = j4.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", j4, e4);
                }
                this.f6026d = 1;
                finish();
            } catch (IntentSender.SendIntentException e5) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f6026d);
        super.onSaveInstanceState(bundle);
    }
}
