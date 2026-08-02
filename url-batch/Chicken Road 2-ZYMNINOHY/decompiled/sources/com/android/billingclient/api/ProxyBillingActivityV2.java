package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.fragment.app.C0194a0;
import b.AbstractActivityC0253n;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import d.C0373a;
import d.b;
import d.c;
import d.j;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC0253n {

    /* renamed from: a, reason: collision with root package name */
    public c f5739a;

    /* renamed from: b, reason: collision with root package name */
    public c f5740b;

    /* renamed from: c, reason: collision with root package name */
    public c f5741c;

    /* renamed from: d, reason: collision with root package name */
    public ResultReceiver f5742d;

    /* renamed from: e, reason: collision with root package name */
    public ResultReceiver f5743e;

    /* renamed from: f, reason: collision with root package name */
    public ResultReceiver f5744f;

    @Override // b.AbstractActivityC0253n, t.AbstractActivityC1415c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i4 = 0;
        this.f5739a = registerForActivityResult(new C0194a0(3), new b(this) { // from class: E1.Y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f558b;

            {
                this.f558b = this;
            }

            @Override // d.b
            public final void a(Object obj) {
                C0373a c0373a = (C0373a) obj;
                switch (i4) {
                    case 0:
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f558b;
                        proxyBillingActivityV2.getClass();
                        Intent intent = c0373a.f8060b;
                        int i5 = AbstractC0352w.e(intent, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f5742d;
                        if (resultReceiver != null) {
                            resultReceiver.send(i5, intent == null ? null : intent.getExtras());
                        }
                        int i6 = c0373a.f8059a;
                        if (i6 != -1 || i5 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i6 + " and billing's responseCode: " + i5);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f558b;
                        proxyBillingActivityV22.getClass();
                        Intent intent2 = c0373a.f8060b;
                        int i7 = AbstractC0352w.e(intent2, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.f5743e;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i7, intent2 == null ? null : intent2.getExtras());
                        }
                        int i8 = c0373a.f8059a;
                        if (i8 != -1 || i7 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i8 + " and billing's responseCode: " + i7);
                        }
                        proxyBillingActivityV22.finish();
                        break;
                    default:
                        ProxyBillingActivityV2 proxyBillingActivityV23 = this.f558b;
                        proxyBillingActivityV23.getClass();
                        Intent intent3 = c0373a.f8060b;
                        int i9 = c0373a.f8059a;
                        Bundle extras = intent3 == null ? null : intent3.getExtras();
                        if (i9 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i9);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i9);
                        }
                        int i10 = AbstractC0352w.e(intent3, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV23.f5744f;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i10, extras);
                        } else {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i10 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i10);
                        }
                        proxyBillingActivityV23.finish();
                        break;
                }
            }
        });
        final int i5 = 1;
        this.f5740b = registerForActivityResult(new C0194a0(3), new b(this) { // from class: E1.Y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f558b;

            {
                this.f558b = this;
            }

            @Override // d.b
            public final void a(Object obj) {
                C0373a c0373a = (C0373a) obj;
                switch (i5) {
                    case 0:
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f558b;
                        proxyBillingActivityV2.getClass();
                        Intent intent = c0373a.f8060b;
                        int i52 = AbstractC0352w.e(intent, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f5742d;
                        if (resultReceiver != null) {
                            resultReceiver.send(i52, intent == null ? null : intent.getExtras());
                        }
                        int i6 = c0373a.f8059a;
                        if (i6 != -1 || i52 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i6 + " and billing's responseCode: " + i52);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f558b;
                        proxyBillingActivityV22.getClass();
                        Intent intent2 = c0373a.f8060b;
                        int i7 = AbstractC0352w.e(intent2, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.f5743e;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i7, intent2 == null ? null : intent2.getExtras());
                        }
                        int i8 = c0373a.f8059a;
                        if (i8 != -1 || i7 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i8 + " and billing's responseCode: " + i7);
                        }
                        proxyBillingActivityV22.finish();
                        break;
                    default:
                        ProxyBillingActivityV2 proxyBillingActivityV23 = this.f558b;
                        proxyBillingActivityV23.getClass();
                        Intent intent3 = c0373a.f8060b;
                        int i9 = c0373a.f8059a;
                        Bundle extras = intent3 == null ? null : intent3.getExtras();
                        if (i9 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i9);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i9);
                        }
                        int i10 = AbstractC0352w.e(intent3, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV23.f5744f;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i10, extras);
                        } else {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i10 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i10);
                        }
                        proxyBillingActivityV23.finish();
                        break;
                }
            }
        });
        final int i6 = 2;
        this.f5741c = registerForActivityResult(new C0194a0(3), new b(this) { // from class: E1.Y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f558b;

            {
                this.f558b = this;
            }

            @Override // d.b
            public final void a(Object obj) {
                C0373a c0373a = (C0373a) obj;
                switch (i6) {
                    case 0:
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f558b;
                        proxyBillingActivityV2.getClass();
                        Intent intent = c0373a.f8060b;
                        int i52 = AbstractC0352w.e(intent, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f5742d;
                        if (resultReceiver != null) {
                            resultReceiver.send(i52, intent == null ? null : intent.getExtras());
                        }
                        int i62 = c0373a.f8059a;
                        if (i62 != -1 || i52 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i62 + " and billing's responseCode: " + i52);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f558b;
                        proxyBillingActivityV22.getClass();
                        Intent intent2 = c0373a.f8060b;
                        int i7 = AbstractC0352w.e(intent2, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.f5743e;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i7, intent2 == null ? null : intent2.getExtras());
                        }
                        int i8 = c0373a.f8059a;
                        if (i8 != -1 || i7 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i8 + " and billing's responseCode: " + i7);
                        }
                        proxyBillingActivityV22.finish();
                        break;
                    default:
                        ProxyBillingActivityV2 proxyBillingActivityV23 = this.f558b;
                        proxyBillingActivityV23.getClass();
                        Intent intent3 = c0373a.f8060b;
                        int i9 = c0373a.f8059a;
                        Bundle extras = intent3 == null ? null : intent3.getExtras();
                        if (i9 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i9);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i9);
                        }
                        int i10 = AbstractC0352w.e(intent3, "ProxyBillingActivityV2").f633a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV23.f5744f;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i10, extras);
                        } else {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i10 != 0) {
                            AbstractC0352w.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i10);
                        }
                        proxyBillingActivityV23.finish();
                        break;
                }
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f5742d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f5743e = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f5744f = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        AbstractC0352w.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f5742d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            c cVar = this.f5739a;
            i.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            i.d(intentSender, "pendingIntent.intentSender");
            cVar.a(new j(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f5743e = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            c cVar2 = this.f5740b;
            i.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            i.d(intentSender2, "pendingIntent.intentSender");
            cVar2.a(new j(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f5744f = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            c cVar3 = this.f5741c;
            i.e(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            i.d(intentSender3, "pendingIntent.intentSender");
            cVar3.a(new j(intentSender3, null, 0, 0));
        }
    }

    @Override // b.AbstractActivityC0253n, t.AbstractActivityC1415c, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5742d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f5743e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f5744f;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
