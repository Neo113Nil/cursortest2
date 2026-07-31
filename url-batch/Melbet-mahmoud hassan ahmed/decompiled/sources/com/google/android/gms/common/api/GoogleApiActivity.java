package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import o3.e;
import r3.o;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: f, reason: collision with root package name */
    protected int f2457f = 0;

    @RecentlyNonNull
    public static Intent a(@RecentlyNonNull Context context, @RecentlyNonNull PendingIntent pendingIntent, int i7, boolean z6) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i7);
        intent.putExtra("notify_manager", z6);
        return intent;
    }

    private final void b() {
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
            e.l().m(this, ((Integer) o.i(num)).intValue(), 2, this);
            this.f2457f = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f2457f = 1;
        } catch (ActivityNotFoundException e7) {
            if (extras.getBoolean("notify_manager", true)) {
                q3.e.m(this).u(new o3.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String valueOf = String.valueOf(pendingIntent);
                StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(valueOf);
                sb.append(".");
                String sb2 = sb.toString();
                if (Build.FINGERPRINT.contains("generic")) {
                    sb2 = String.valueOf(sb2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", sb2, e7);
            }
            this.f2457f = 1;
            finish();
        } catch (IntentSender.SendIntentException e8) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i7, int i8, @RecentlyNonNull Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2457f = 0;
            setResult(i8, intent);
            if (booleanExtra) {
                q3.e m7 = q3.e.m(this);
                if (i8 == -1) {
                    m7.q();
                } else if (i8 == 0) {
                    m7.u(new o3.b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i7 == 2) {
            this.f2457f = 0;
            setResult(i8, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        this.f2457f = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2457f = bundle.getInt("resolution");
        }
        if (this.f2457f != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putInt("resolution", this.f2457f);
        super.onSaveInstanceState(bundle);
    }
}
