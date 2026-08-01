package fa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    private Boolean clearGroupOnSummaryClick;
    private Boolean disableGMSMissingPrompt;
    private Boolean enterprise;
    private a fcmParams;
    private Boolean firebaseAnalytics;
    private String googleProjectNumber;
    private c influenceParams;
    private Boolean locationShared;
    private JSONArray notificationChannels;
    private Long opRepoExecutionInterval;
    private Boolean receiveReceiptEnabled;
    private Boolean requiresUserPrivacyConsent;
    private Boolean restoreTTLFilter;
    private Boolean unsubscribeWhenNotificationsDisabled;
    private Boolean useIdentityVerification;

    public /* synthetic */ d(String str, Boolean bool, Boolean bool2, JSONArray jSONArray, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Long l10, c cVar, a aVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? null : bool2, (i3 & 8) != 0 ? null : jSONArray, (i3 & 16) != 0 ? null : bool3, (i3 & 32) != 0 ? null : bool4, (i3 & 64) != 0 ? null : bool5, (i3 & 128) != 0 ? null : bool6, (i3 & 256) != 0 ? null : bool7, (i3 & 512) != 0 ? null : bool8, (i3 & 1024) != 0 ? null : bool9, (i3 & 2048) != 0 ? null : bool10, (i3 & 4096) != 0 ? null : l10, cVar, aVar);
    }

    public final Boolean getClearGroupOnSummaryClick() {
        return this.clearGroupOnSummaryClick;
    }

    public final Boolean getDisableGMSMissingPrompt() {
        return this.disableGMSMissingPrompt;
    }

    public final Boolean getEnterprise() {
        return this.enterprise;
    }

    public final a getFcmParams() {
        return this.fcmParams;
    }

    public final Boolean getFirebaseAnalytics() {
        return this.firebaseAnalytics;
    }

    public final String getGoogleProjectNumber() {
        return this.googleProjectNumber;
    }

    public final c getInfluenceParams() {
        return this.influenceParams;
    }

    public final Boolean getLocationShared() {
        return this.locationShared;
    }

    public final JSONArray getNotificationChannels() {
        return this.notificationChannels;
    }

    public final Long getOpRepoExecutionInterval() {
        return this.opRepoExecutionInterval;
    }

    public final Boolean getReceiveReceiptEnabled() {
        return this.receiveReceiptEnabled;
    }

    public final Boolean getRequiresUserPrivacyConsent() {
        return this.requiresUserPrivacyConsent;
    }

    public final Boolean getRestoreTTLFilter() {
        return this.restoreTTLFilter;
    }

    public final Boolean getUnsubscribeWhenNotificationsDisabled() {
        return this.unsubscribeWhenNotificationsDisabled;
    }

    public final Boolean getUseIdentityVerification() {
        return this.useIdentityVerification;
    }

    public final void setClearGroupOnSummaryClick(Boolean bool) {
        this.clearGroupOnSummaryClick = bool;
    }

    public final void setDisableGMSMissingPrompt(Boolean bool) {
        this.disableGMSMissingPrompt = bool;
    }

    public final void setEnterprise(Boolean bool) {
        this.enterprise = bool;
    }

    public final void setFcmParams(a aVar) {
        aVar.getClass();
        this.fcmParams = aVar;
    }

    public final void setFirebaseAnalytics(Boolean bool) {
        this.firebaseAnalytics = bool;
    }

    public final void setGoogleProjectNumber(String str) {
        this.googleProjectNumber = str;
    }

    public final void setInfluenceParams(c cVar) {
        cVar.getClass();
        this.influenceParams = cVar;
    }

    public final void setLocationShared(Boolean bool) {
        this.locationShared = bool;
    }

    public final void setNotificationChannels(JSONArray jSONArray) {
        this.notificationChannels = jSONArray;
    }

    public final void setOpRepoExecutionInterval(Long l10) {
        this.opRepoExecutionInterval = l10;
    }

    public final void setReceiveReceiptEnabled(Boolean bool) {
        this.receiveReceiptEnabled = bool;
    }

    public final void setRequiresUserPrivacyConsent(Boolean bool) {
        this.requiresUserPrivacyConsent = bool;
    }

    public final void setRestoreTTLFilter(Boolean bool) {
        this.restoreTTLFilter = bool;
    }

    public final void setUnsubscribeWhenNotificationsDisabled(Boolean bool) {
        this.unsubscribeWhenNotificationsDisabled = bool;
    }

    public final void setUseIdentityVerification(Boolean bool) {
        this.useIdentityVerification = bool;
    }

    public d(String str, Boolean bool, Boolean bool2, JSONArray jSONArray, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Long l10, c cVar, a aVar) {
        cVar.getClass();
        aVar.getClass();
        this.googleProjectNumber = str;
        this.enterprise = bool;
        this.useIdentityVerification = bool2;
        this.notificationChannels = jSONArray;
        this.firebaseAnalytics = bool3;
        this.restoreTTLFilter = bool4;
        this.clearGroupOnSummaryClick = bool5;
        this.receiveReceiptEnabled = bool6;
        this.disableGMSMissingPrompt = bool7;
        this.unsubscribeWhenNotificationsDisabled = bool8;
        this.locationShared = bool9;
        this.requiresUserPrivacyConsent = bool10;
        this.opRepoExecutionInterval = l10;
        this.influenceParams = cVar;
        this.fcmParams = aVar;
    }
}
