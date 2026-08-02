package com.android.billingclient.api;

import E1.C0036l;
import E1.C0037m;
import E1.U;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.l1;
import io.appmetrica.analytics.BuildConfig;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f5733a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5734b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5735c;

    /* renamed from: d, reason: collision with root package name */
    public int f5736d;

    /* renamed from: e, reason: collision with root package name */
    public long f5737e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5738f;

    public final Intent a(int i4, long j4) {
        Intent b4 = b();
        b4.putExtra("RESPONSE_CODE", 6);
        b4.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        C0036l a3 = C0037m.a();
        a3.f630a = 6;
        a3.f632c = "An internal error occurred.";
        C0037m a4 = a3.a();
        int i5 = U.f526a;
        b4.putExtra("FAILURE_LOGGING_PAYLOAD", U.b(i4, 2, a4, null, l1.BROADCAST_ACTION_UNSPECIFIED).a());
        b4.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        b4.putExtra("billingClientTransactionId", j4);
        b4.putExtra("wasServiceAutoReconnected", this.f5738f);
        return b4;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i4, int i5, Intent intent) {
        Intent a3;
        int i6;
        ResultReceiver resultReceiver;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 100 || i4 == 110) {
            int i7 = AbstractC0352w.e(intent, "ProxyBillingActivity").f633a;
            if (i5 == -1) {
                if (i7 != 0) {
                    i5 = -1;
                } else {
                    i5 = -1;
                    if (intent != null) {
                        AbstractC0352w.h("ProxyBillingActivity", "Got null data with resultCode " + i5 + "!");
                        a3 = a(i5 != -1 ? i5 != 0 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? 117 : 118 : BuildConfig.API_LEVEL : 115 : 114 : 113, this.f5737e);
                    } else if (intent.getExtras() != null) {
                        String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                        if (string != null) {
                            a3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                            a3.setPackage(getApplicationContext().getPackageName());
                            a3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                            a3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        } else {
                            Intent b4 = b();
                            b4.putExtras(intent.getExtras());
                            b4.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            a3 = b4;
                        }
                        a3.putExtra("billingClientTransactionId", this.f5737e);
                        a3.putExtra("wasServiceAutoReconnected", this.f5738f);
                    } else {
                        AbstractC0352w.h("ProxyBillingActivity", "Got null bundle!");
                        a3 = a(22, this.f5737e);
                    }
                    if (i4 == 110) {
                        a3.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(a3);
                }
            }
            AbstractC0352w.h("ProxyBillingActivity", "Activity finished with resultCode " + i5 + " and billing's responseCode: " + i7);
            if (intent != null) {
            }
            if (i4 == 110) {
            }
            sendBroadcast(a3);
        } else if (i4 == 101) {
            if (intent == null) {
                AbstractC0352w.h("ProxyBillingActivity", "Got null intent!");
            } else {
                int i8 = AbstractC0352w.f6025a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    AbstractC0352w.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i6 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver = this.f5733a;
                    if (resultReceiver != null) {
                        resultReceiver.send(i6, intent == null ? null : intent.getExtras());
                    }
                }
            }
            i6 = 0;
            resultReceiver = this.f5733a;
            if (resultReceiver != null) {
            }
        } else {
            AbstractC0352w.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i4 + "; skipping...");
        }
        this.f5734b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC0352w.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f5734b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f5733a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f5735c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f5736d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f5737e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f5738f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        AbstractC0352w.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f5736d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f5735c = true;
                this.f5736d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f5733a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f5736d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f5737e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f5738f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f5734b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5736d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e4) {
            AbstractC0352w.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e4);
            ResultReceiver resultReceiver = this.f5733a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent a3 = a(137, this.f5737e);
                if (this.f5735c) {
                    a3.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(a3);
            }
            this.f5734b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f5734b) {
            Intent b4 = b();
            b4.putExtra("RESPONSE_CODE", 1);
            b4.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f5735c) {
                b4.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i4 = this.f5736d;
            if (i4 == 110 || i4 == 100) {
                b4.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                b4.putExtra("billingClientTransactionId", this.f5737e);
            }
            sendBroadcast(b4);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5733a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f5734b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f5735c);
        bundle.putInt("activity_code", this.f5736d);
        bundle.putLong("billingClientTransactionId", this.f5737e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f5738f);
    }
}
