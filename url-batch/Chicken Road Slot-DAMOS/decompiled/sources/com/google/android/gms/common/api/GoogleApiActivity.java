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
import b7.d;
import c7.c0;
import com.google.android.gms.internal.measurement.z5;
import v4.a;
import z6.b;
import z6.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2114e = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2115d = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i10, Intent intent) {
        super.onActivityResult(i3, i10, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2115d = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                d d10 = d.d(this);
                if (i10 == -1) {
                    z5 z5Var = d10.f1273m;
                    z5Var.sendMessage(z5Var.obtainMessage(3));
                } else if (i10 == 0) {
                    d10.g(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f2115d = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2115d = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2115d = bundle.getInt("resolution");
        }
        if (this.f2115d == 1) {
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
            c0.g(num);
            f.f10879e.c(this, num.intValue(), this);
            this.f2115d = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f2115d = 1;
            } catch (ActivityNotFoundException e2) {
                e = e2;
                if (extras.getBoolean("notify_manager", true)) {
                    d.d(this).g(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    String p4 = a.p(new StringBuilder(obj.length() + 36), "Activity not found while launching ", obj, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        p4 = p4.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", p4, e);
                }
                googleApiActivity.f2115d = 1;
                finish();
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e10) {
            e = e10;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2115d);
        super.onSaveInstanceState(bundle);
    }
}
