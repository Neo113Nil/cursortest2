package com.android.billingclient.api;

import A0.f;
import U1.C0080a;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import b0.r;
import b0.s;
import c.m;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import e.C0309f;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends m {

    /* renamed from: t, reason: collision with root package name */
    public f f2645t;

    /* renamed from: u, reason: collision with root package name */
    public f f2646u;
    public ResultReceiver v;

    /* renamed from: w, reason: collision with root package name */
    public ResultReceiver f2647w;

    @Override // c.m, t.AbstractActivityC1188a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2645t = h(new C0080a(23), new r(this));
        this.f2646u = h(new C0080a(23), new s(this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.v = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f2647w = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC0248o0.f("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.v = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            f fVar = this.f2645t;
            j.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            j.d(intentSender, "pendingIntent.intentSender");
            fVar.I(new C0309f(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f2647w = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            f fVar2 = this.f2646u;
            j.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            j.d(intentSender2, "pendingIntent.intentSender");
            fVar2.I(new C0309f(intentSender2, null, 0, 0));
        }
    }

    @Override // c.m, t.AbstractActivityC1188a, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.v;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2647w;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
