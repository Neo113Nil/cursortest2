package com.android.billingclient.api;

import B1.g;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.l;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import e.AbstractC0402c;
import e.C0408i;
import f.C0414b;
import h2.C0482c;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0402c f4937a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0402c f4938b;

    /* renamed from: c, reason: collision with root package name */
    public ResultReceiver f4939c;

    /* renamed from: d, reason: collision with root package name */
    public ResultReceiver f4940d;

    @Override // androidx.activity.l, u.AbstractActivityC1467h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4937a = registerForActivityResult(new C0414b(), new C0482c(6, this));
        this.f4938b = registerForActivityResult(new C0414b(), new g(5, this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f4939c = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f4940d = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        AbstractC0357o0.f("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f4939c = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            AbstractC0402c abstractC0402c = this.f4937a;
            i.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            i.d(intentSender, "pendingIntent.intentSender");
            abstractC0402c.a(new C0408i(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f4940d = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            AbstractC0402c abstractC0402c2 = this.f4938b;
            i.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            i.d(intentSender2, "pendingIntent.intentSender");
            abstractC0402c2.a(new C0408i(intentSender2, null, 0, 0));
        }
    }

    @Override // androidx.activity.l, u.AbstractActivityC1467h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f4939c;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f4940d;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
