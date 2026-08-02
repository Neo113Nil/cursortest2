package com.google.android.gms.common.api;

import a2.C0162b;
import a2.C0165e;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import c2.C0286c;
import d2.s;
import m2.HandlerC1312d;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5769b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f5770a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5770a = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                C0286c e4 = C0286c.e(this);
                if (i5 == -1) {
                    HandlerC1312d handlerC1312d = e4.f5674m;
                    handlerC1312d.sendMessage(handlerC1312d.obtainMessage(3));
                } else if (i5 == 0) {
                    e4.f(new C0162b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i4 == 2) {
            this.f5770a = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f5770a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5770a = bundle.getInt("resolution");
        }
        if (this.f5770a == 1) {
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
            s.c(num);
            C0165e.f4275d.c(this, num.intValue(), this);
            this.f5770a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f5770a = 1;
            } catch (ActivityNotFoundException e4) {
                e = e4;
                if (extras.getBoolean("notify_manager", true)) {
                    C0286c.e(this).f(new C0162b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String a3 = AbstractC1514c.a("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        a3 = a3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", a3, e);
                }
                googleApiActivity.f5770a = 1;
                finish();
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e6) {
            e = e6;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5770a);
        super.onSaveInstanceState(bundle);
    }
}
