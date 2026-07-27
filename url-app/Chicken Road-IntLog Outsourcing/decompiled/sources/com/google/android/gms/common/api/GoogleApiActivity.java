package com.google.android.gms.common.api;

import A1.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b2.AbstractC0279e;
import l1.b;
import l1.f;
import n1.C1318e;
import o1.u;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4969b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f4970a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4970a = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                C1318e e3 = C1318e.e(this);
                if (i3 == -1) {
                    c cVar = e3.f11383m;
                    cVar.sendMessage(cVar.obtainMessage(3));
                } else if (i3 == 0) {
                    e3.f(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f4970a = 0;
            setResult(i3, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f4970a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4970a = bundle.getInt("resolution");
        }
        if (this.f4970a != 1) {
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
                u.g(num);
                f.f11010d.c(this, num.intValue(), this);
                this.f4970a = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f4970a = 1;
            } catch (ActivityNotFoundException e3) {
                if (extras.getBoolean("notify_manager", true)) {
                    C1318e.e(this).f(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String f3 = AbstractC0279e.f("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        f3 = f3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", f3, e3);
                }
                this.f4970a = 1;
                finish();
            } catch (IntentSender.SendIntentException e6) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e6);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4970a);
        super.onSaveInstanceState(bundle);
    }
}
