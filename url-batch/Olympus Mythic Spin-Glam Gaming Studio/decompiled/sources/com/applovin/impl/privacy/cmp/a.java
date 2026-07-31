package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.d2;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class a {
    private final k a;
    private final o b;
    private ConsentForm c;
    private int d;

    /* renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    public interface InterfaceC0082a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.o());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.c != null) {
            this.c = null;
        }
        this.d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.o()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0082a interfaceC0082a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0082a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.a.c(x4.c7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.a.a(x4.b7);
        return num.intValue() < 0 || this.d < num.intValue();
    }

    public void b(Activity activity, final k0 k0Var, final InterfaceC0082a interfaceC0082a) {
        if (this.c == null) {
            b("Failed to show - not ready yet");
            interfaceC0082a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda6
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    a.this.a(k0Var, interfaceC0082a, formError);
                }
            });
        }
    }

    public void a(final Activity activity, k0 k0Var, final InterfaceC0082a interfaceC0082a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (n7.c(this.a) && k0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.a.n0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda0
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                a.this.a(activity, interfaceC0082a);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda1
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                a.this.b(interfaceC0082a, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final FormError formError, final k0 k0Var, final InterfaceC0082a interfaceC0082a) {
        a("Retrying to load and show consent form...");
        this.d++;
        UserMessagingPlatform.loadConsentForm(k.o(), new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda4
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                a.this.a(interfaceC0082a, formError, k0Var, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda5
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError2) {
                a.this.a(interfaceC0082a, formError, formError2);
            }
        });
    }

    private void b(String str) {
        if (o.a()) {
            this.b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, final InterfaceC0082a interfaceC0082a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean isConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + isConsentFormAvailable);
        if (!isConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0082a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            return;
        }
        if (consentStatus != 2) {
            b("Failed to load with consent status: " + consentStatus);
            interfaceC0082a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, "Consent form not required for consent status: " + consentStatus));
            return;
        }
        a("Successfully requested consent info");
        a("Loading consent form...");
        UserMessagingPlatform.loadConsentForm(activity, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda2
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                a.this.a(interfaceC0082a, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda3
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                a.this.a(interfaceC0082a, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0082a interfaceC0082a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.c = consentForm;
        interfaceC0082a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0082a interfaceC0082a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0082a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final k0 k0Var, final InterfaceC0082a interfaceC0082a, final FormError formError) {
        if (formError != null) {
            String valueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap hashMap = new HashMap(2);
            hashMap.put("error_code", valueOf);
            hashMap.put("error_message", message);
            this.a.D().a(d2.O0, "googleConsentFormDismissed", hashMap);
            if (c(valueOf)) {
                a("Consent form was dismissed due to error: " + message);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a(formError, k0Var, interfaceC0082a);
                    }
                });
                return;
            }
            b("Failed to show with error: " + message);
            interfaceC0082a.onFlowShowFailed(a(formError, "Consent form show failed"));
            return;
        }
        a("Consent form finished showing");
        interfaceC0082a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0082a interfaceC0082a, FormError formError, k0 k0Var, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.c = consentForm;
        Activity u0 = this.a.u0();
        if (u0 == null) {
            interfaceC0082a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(u0, k0Var, interfaceC0082a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0082a interfaceC0082a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0082a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r1 != 4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CmpErrorImpl a(FormError formError, String str) {
        AppLovinCmpError.Code code = AppLovinCmpError.Code.UNSPECIFIED;
        int errorCode = formError.getErrorCode();
        if (errorCode != 1 && errorCode != 2) {
            if (errorCode == 3) {
                code = AppLovinCmpError.Code.INTEGRATION_ERROR;
            }
            return new CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
        }
        code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        return new CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
    }

    private void a(String str) {
        if (o.a()) {
            this.b.a("GoogleCmpAdapter", str);
        }
    }
}
