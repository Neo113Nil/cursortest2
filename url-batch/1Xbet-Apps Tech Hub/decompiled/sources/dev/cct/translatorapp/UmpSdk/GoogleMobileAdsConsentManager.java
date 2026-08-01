package dev.cct.translatorapp.UmpSdk;

import android.app.Activity;
import android.content.Context;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import dev.cct.translatorapp.UmpSdk.GoogleMobileAdsConsentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoogleMobileAdsConsentManager.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, d2 = {"Ldev/cct/translatorapp/UmpSdk/GoogleMobileAdsConsentManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "canRequestAds", "", "getCanRequestAds", "()Z", "consentInformation", "Lcom/google/android/ump/ConsentInformation;", "isPrivacyOptionsRequired", "gatherConsent", "", "activity", "Landroid/app/Activity;", "onConsentGatheringCompleteListener", "Ldev/cct/translatorapp/UmpSdk/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;", "showPrivacyOptionsForm", "onConsentFormDismissedListener", "Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;", "Companion", "OnConsentGatheringCompleteListener", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogleMobileAdsConsentManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile GoogleMobileAdsConsentManager instance;
    private final ConsentInformation consentInformation;

    /* compiled from: GoogleMobileAdsConsentManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Ldev/cct/translatorapp/UmpSdk/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;", "", "consentGatheringComplete", "", "error", "Lcom/google/android/ump/FormError;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnConsentGatheringCompleteListener {
        void consentGatheringComplete(FormError error);
    }

    public /* synthetic */ GoogleMobileAdsConsentManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private GoogleMobileAdsConsentManager(Context context) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(context);
        Intrinsics.checkNotNullExpressionValue(consentInformation, "getConsentInformation(context)");
        this.consentInformation = consentInformation;
    }

    public final boolean getCanRequestAds() {
        return this.consentInformation.canRequestAds();
    }

    public final boolean isPrivacyOptionsRequired() {
        return this.consentInformation.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
    }

    public final void gatherConsent(final Activity activity, final OnConsentGatheringCompleteListener onConsentGatheringCompleteListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConsentGatheringCompleteListener, "onConsentGatheringCompleteListener");
        this.consentInformation.requestConsentInfoUpdate(activity, new ConsentRequestParameters.Builder().setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).build()).build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: dev.cct.translatorapp.UmpSdk.GoogleMobileAdsConsentManager$$ExternalSyntheticLambda1
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                GoogleMobileAdsConsentManager.gatherConsent$lambda$1(activity, onConsentGatheringCompleteListener);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: dev.cct.translatorapp.UmpSdk.GoogleMobileAdsConsentManager$$ExternalSyntheticLambda2
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                GoogleMobileAdsConsentManager.gatherConsent$lambda$2(GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener.this, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsent$lambda$1(Activity activity, final OnConsentGatheringCompleteListener onConsentGatheringCompleteListener) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(onConsentGatheringCompleteListener, "$onConsentGatheringCompleteListener");
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: dev.cct.translatorapp.UmpSdk.GoogleMobileAdsConsentManager$$ExternalSyntheticLambda0
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                GoogleMobileAdsConsentManager.gatherConsent$lambda$1$lambda$0(GoogleMobileAdsConsentManager.OnConsentGatheringCompleteListener.this, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsent$lambda$1$lambda$0(OnConsentGatheringCompleteListener onConsentGatheringCompleteListener, FormError formError) {
        Intrinsics.checkNotNullParameter(onConsentGatheringCompleteListener, "$onConsentGatheringCompleteListener");
        onConsentGatheringCompleteListener.consentGatheringComplete(formError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gatherConsent$lambda$2(OnConsentGatheringCompleteListener onConsentGatheringCompleteListener, FormError formError) {
        Intrinsics.checkNotNullParameter(onConsentGatheringCompleteListener, "$onConsentGatheringCompleteListener");
        onConsentGatheringCompleteListener.consentGatheringComplete(formError);
    }

    public final void showPrivacyOptionsForm(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConsentFormDismissedListener, "onConsentFormDismissedListener");
        UserMessagingPlatform.showPrivacyOptionsForm(activity, onConsentFormDismissedListener);
    }

    /* compiled from: GoogleMobileAdsConsentManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/UmpSdk/GoogleMobileAdsConsentManager$Companion;", "", "()V", "instance", "Ldev/cct/translatorapp/UmpSdk/GoogleMobileAdsConsentManager;", "getInstance", "context", "Landroid/content/Context;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GoogleMobileAdsConsentManager getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            GoogleMobileAdsConsentManager googleMobileAdsConsentManager = GoogleMobileAdsConsentManager.instance;
            if (googleMobileAdsConsentManager == null) {
                synchronized (this) {
                    googleMobileAdsConsentManager = GoogleMobileAdsConsentManager.instance;
                    if (googleMobileAdsConsentManager == null) {
                        googleMobileAdsConsentManager = new GoogleMobileAdsConsentManager(context, null);
                        Companion companion = GoogleMobileAdsConsentManager.INSTANCE;
                        GoogleMobileAdsConsentManager.instance = googleMobileAdsConsentManager;
                    }
                }
            }
            return googleMobileAdsConsentManager;
        }
    }
}
