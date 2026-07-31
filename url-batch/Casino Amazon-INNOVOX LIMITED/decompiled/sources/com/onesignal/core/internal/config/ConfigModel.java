package com.onesignal.core.internal.config;

import androidx.work.WorkRequest;
import com.onesignal.common.modeling.Model;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.http.OneSignalService;
import com.onesignal.user.internal.jwt.JwtRequirement;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ConfigModel.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0086\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010q2\u0007\u0010\u0087\u0001\u001a\u00020\u00042\u0007\u0010\u0088\u0001\u001a\u00020LH\u0014J\u001e\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00042\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0014R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R$\u0010$\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R$\u0010+\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R$\u0010.\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R$\u00101\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R(\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR$\u00108\u001a\u0002072\u0006\u0010\u0003\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0002072\u0006\u0010\u0003\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R$\u0010@\u001a\u0002072\u0006\u0010\u0003\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\u0011\u0010C\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR$\u0010G\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0016\"\u0004\bH\u0010\u0018R$\u0010I\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u0016\"\u0004\bK\u0010\u0018R(\u0010M\u001a\u0004\u0018\u00010L2\b\u0010\u0003\u001a\u0004\u0018\u00010L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010R\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0010\"\u0004\bT\u0010\u0012R$\u0010U\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010\u0010\"\u0004\bW\u0010\u0012R$\u0010X\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u0010\"\u0004\bZ\u0010\u0012R$\u0010[\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u0010\"\u0004\b]\u0010\u0012R$\u0010^\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\u0010\"\u0004\b`\u0010\u0012R(\u0010a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010\u0007\"\u0004\bc\u0010\tR$\u0010d\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R\u0011\u0010g\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR$\u0010k\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010\u0016\"\u0004\bm\u0010\u0018R(\u0010n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010\u0007\"\u0004\bp\u0010\tR0\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00040q2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010w\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010\u0010\"\u0004\by\u0010\u0012R$\u0010z\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010\u0016\"\u0004\b|\u0010\u0018R'\u0010~\u001a\u00020}2\u0006\u0010\u0003\u001a\u00020}8@@@X\u0080\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0083\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u0016\"\u0005\b\u0085\u0001\u0010\u0018¨\u0006\u008c\u0001"}, d2 = {"Lcom/onesignal/core/internal/config/ConfigModel;", "Lcom/onesignal/common/modeling/Model;", "()V", "value", "", "apiUrl", "getApiUrl", "()Ljava/lang/String;", "setApiUrl", "(Ljava/lang/String;)V", "appId", "getAppId", "setAppId", "", "backgroundFetchNotificationPermissionInterval", "getBackgroundFetchNotificationPermissionInterval", "()J", "setBackgroundFetchNotificationPermissionInterval", "(J)V", "", "clearGroupOnSummaryClick", "getClearGroupOnSummaryClick", "()Z", "setClearGroupOnSummaryClick", "(Z)V", "consentGiven", "getConsentGiven", "()Ljava/lang/Boolean;", "setConsentGiven", "(Ljava/lang/Boolean;)V", "consentRequired", "getConsentRequired", "setConsentRequired", "disableGMSMissingPrompt", "getDisableGMSMissingPrompt", "setDisableGMSMissingPrompt", "enterprise", "getEnterprise", "setEnterprise", "fcmParams", "Lcom/onesignal/core/internal/config/FCMConfigModel;", "getFcmParams", "()Lcom/onesignal/core/internal/config/FCMConfigModel;", "fetchIAMMinInterval", "getFetchIAMMinInterval", "setFetchIAMMinInterval", "firebaseAnalytics", "getFirebaseAnalytics", "setFirebaseAnalytics", "foregroundFetchNotificationPermissionInterval", "getForegroundFetchNotificationPermissionInterval", "setForegroundFetchNotificationPermissionInterval", "googleProjectNumber", "getGoogleProjectNumber", "setGoogleProjectNumber", "", "httpGetTimeout", "getHttpGetTimeout", "()I", "setHttpGetTimeout", "(I)V", "httpRetryAfterParseFailFallback", "getHttpRetryAfterParseFailFallback", "setHttpRetryAfterParseFailFallback", "httpTimeout", "getHttpTimeout", "setHttpTimeout", "influenceParams", "Lcom/onesignal/core/internal/config/InfluenceConfigModel;", "getInfluenceParams", "()Lcom/onesignal/core/internal/config/InfluenceConfigModel;", "isInitializedWithRemote", "setInitializedWithRemote", "locationShared", "getLocationShared", "setLocationShared", "Lorg/json/JSONArray;", "notificationChannels", "getNotificationChannels", "()Lorg/json/JSONArray;", "setNotificationChannels", "(Lorg/json/JSONArray;)V", "opRepoDefaultFailRetryBackoff", "getOpRepoDefaultFailRetryBackoff", "setOpRepoDefaultFailRetryBackoff", "opRepoExecutionInterval", "getOpRepoExecutionInterval", "setOpRepoExecutionInterval", "opRepoPostCreateDelay", "getOpRepoPostCreateDelay", "setOpRepoPostCreateDelay", "opRepoPostCreateRetryUpTo", "getOpRepoPostCreateRetryUpTo", "setOpRepoPostCreateRetryUpTo", "opRepoPostWakeDelay", "getOpRepoPostWakeDelay", "setOpRepoPostWakeDelay", "pushSubscriptionId", "getPushSubscriptionId", "setPushSubscriptionId", "receiveReceiptEnabled", "getReceiveReceiptEnabled", "setReceiveReceiptEnabled", "remoteLoggingParams", "Lcom/onesignal/core/internal/config/RemoteLoggingConfigModel;", "getRemoteLoggingParams", "()Lcom/onesignal/core/internal/config/RemoteLoggingConfigModel;", "restoreTTLFilter", "getRestoreTTLFilter", "setRestoreTTLFilter", "sdkRemoteFeatureFlagMetadata", "getSdkRemoteFeatureFlagMetadata", "setSdkRemoteFeatureFlagMetadata", "", "sdkRemoteFeatureFlags", "getSdkRemoteFeatureFlags", "()Ljava/util/List;", "setSdkRemoteFeatureFlags", "(Ljava/util/List;)V", "sessionFocusTimeout", "getSessionFocusTimeout", "setSessionFocusTimeout", "unsubscribeWhenNotificationsDisabled", "getUnsubscribeWhenNotificationsDisabled", "setUnsubscribeWhenNotificationsDisabled", "Lcom/onesignal/user/internal/jwt/JwtRequirement;", "useIdentityVerification", "getUseIdentityVerification$com_onesignal_core", "()Lcom/onesignal/user/internal/jwt/JwtRequirement;", "setUseIdentityVerification$com_onesignal_core", "(Lcom/onesignal/user/internal/jwt/JwtRequirement;)V", "userRejectedGMSUpdate", "getUserRejectedGMSUpdate", "setUserRejectedGMSUpdate", "createListForProperty", "property", "jsonArray", "createModelForProperty", "jsonObject", "Lorg/json/JSONObject;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigModel extends Model {

    /* compiled from: ConfigModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JwtRequirement.values().length];
            try {
                iArr[JwtRequirement.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JwtRequirement.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JwtRequirement.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConfigModel() {
        super(null, null, 3, null);
    }

    public final boolean isInitializedWithRemote() {
        return getBooleanProperty("isInitializedWithRemote", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$isInitializedWithRemote$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setInitializedWithRemote(boolean z) {
        Model.setBooleanProperty$default(this, "isInitializedWithRemote", z, null, false, 12, null);
    }

    public final String getAppId() {
        return Model.getStringProperty$default(this, "appId", null, 2, null);
    }

    public final void setAppId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Model.setStringProperty$default(this, "appId", value, null, false, 12, null);
    }

    public final String getPushSubscriptionId() {
        return Model.getOptStringProperty$default(this, "pushSubscriptionId", null, 2, null);
    }

    public final void setPushSubscriptionId(String str) {
        Model.setOptStringProperty$default(this, "pushSubscriptionId", str, null, false, 12, null);
    }

    public final String getApiUrl() {
        return getStringProperty("apiUrl", new Function0<String>() { // from class: com.onesignal.core.internal.config.ConfigModel$apiUrl$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return OneSignalService.ONESIGNAL_API_BASE_URL;
            }
        });
    }

    public final void setApiUrl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Model.setStringProperty$default(this, "apiUrl", value, null, false, 12, null);
    }

    public final Boolean getConsentRequired() {
        return Model.getOptBooleanProperty$default(this, "consentRequired", null, 2, null);
    }

    public final void setConsentRequired(Boolean bool) {
        Model.setOptBooleanProperty$default(this, "consentRequired", bool, null, false, 12, null);
    }

    public final Boolean getConsentGiven() {
        return Model.getOptBooleanProperty$default(this, "consentGiven", null, 2, null);
    }

    public final void setConsentGiven(Boolean bool) {
        Model.setOptBooleanProperty$default(this, "consentGiven", bool, null, false, 12, null);
    }

    public final boolean getLocationShared() {
        return getBooleanProperty("locationShared", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$locationShared$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setLocationShared(boolean z) {
        Model.setBooleanProperty$default(this, "locationShared", z, null, false, 12, null);
    }

    public final boolean getDisableGMSMissingPrompt() {
        return getBooleanProperty("disableGMSMissingPrompt", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$disableGMSMissingPrompt$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setDisableGMSMissingPrompt(boolean z) {
        Model.setBooleanProperty$default(this, "disableGMSMissingPrompt", z, null, false, 12, null);
    }

    public final boolean getUserRejectedGMSUpdate() {
        return getBooleanProperty("userRejectedGMSUpdate", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$userRejectedGMSUpdate$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setUserRejectedGMSUpdate(boolean z) {
        Model.setBooleanProperty$default(this, "userRejectedGMSUpdate", z, null, false, 12, null);
    }

    public final boolean getUnsubscribeWhenNotificationsDisabled() {
        return getBooleanProperty("unsubscribeWhenNotificationsDisabled", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$unsubscribeWhenNotificationsDisabled$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setUnsubscribeWhenNotificationsDisabled(boolean z) {
        Model.setBooleanProperty$default(this, "unsubscribeWhenNotificationsDisabled", z, null, false, 12, null);
    }

    public final int getHttpTimeout() {
        return getIntProperty("httpTimeout", new Function0<Integer>() { // from class: com.onesignal.core.internal.config.ConfigModel$httpTimeout$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 120000;
            }
        });
    }

    public final void setHttpTimeout(int i) {
        Model.setIntProperty$default(this, "httpTimeout", i, null, false, 12, null);
    }

    public final int getHttpGetTimeout() {
        return getIntProperty("httpGetTimeout", new Function0<Integer>() { // from class: com.onesignal.core.internal.config.ConfigModel$httpGetTimeout$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 60000;
            }
        });
    }

    public final void setHttpGetTimeout(int i) {
        Model.setIntProperty$default(this, "httpGetTimeout", i, null, false, 12, null);
    }

    public final int getHttpRetryAfterParseFailFallback() {
        return getIntProperty("httpRetryAfterParseFailFallback", new Function0<Integer>() { // from class: com.onesignal.core.internal.config.ConfigModel$httpRetryAfterParseFailFallback$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 60;
            }
        });
    }

    public final void setHttpRetryAfterParseFailFallback(int i) {
        Model.setIntProperty$default(this, "httpRetryAfterParseFailFallback", i, null, false, 12, null);
    }

    public final long getSessionFocusTimeout() {
        return getLongProperty("sessionFocusTimeout", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$sessionFocusTimeout$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            }
        });
    }

    public final void setSessionFocusTimeout(long j) {
        Model.setLongProperty$default(this, "sessionFocusTimeout", j, null, false, 12, null);
    }

    public final long getOpRepoExecutionInterval() {
        return getLongProperty("opRepoExecutionInterval", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$opRepoExecutionInterval$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return 5000L;
            }
        });
    }

    public final void setOpRepoExecutionInterval(long j) {
        Model.setLongProperty$default(this, "opRepoExecutionInterval", j, null, false, 12, null);
    }

    public final long getOpRepoPostWakeDelay() {
        return getLongProperty("opRepoPostWakeDelay", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$opRepoPostWakeDelay$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return 200L;
            }
        });
    }

    public final void setOpRepoPostWakeDelay(long j) {
        Model.setLongProperty$default(this, "opRepoPostWakeDelay", j, null, false, 12, null);
    }

    public final long getOpRepoPostCreateDelay() {
        return getLongProperty("opRepoPostCreateDelay", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$opRepoPostCreateDelay$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return 5000L;
            }
        });
    }

    public final void setOpRepoPostCreateDelay(long j) {
        Model.setLongProperty$default(this, "opRepoPostCreateDelay", j, null, false, 12, null);
    }

    public final long getOpRepoPostCreateRetryUpTo() {
        return getLongProperty("opRepoPostCreateRetryUpTo", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$opRepoPostCreateRetryUpTo$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return 60000L;
            }
        });
    }

    public final void setOpRepoPostCreateRetryUpTo(long j) {
        Model.setLongProperty$default(this, "opRepoPostCreateRetryUpTo", j, null, false, 12, null);
    }

    public final long getOpRepoDefaultFailRetryBackoff() {
        return getLongProperty("opRepoDefaultFailRetryBackoff", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$opRepoDefaultFailRetryBackoff$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return 15000L;
            }
        });
    }

    public final void setOpRepoDefaultFailRetryBackoff(long j) {
        Model.setLongProperty$default(this, "opRepoDefaultFailRetryBackoff", j, null, false, 12, null);
    }

    public final long getFetchIAMMinInterval() {
        return getLongProperty("fetchIAMMinInterval", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$fetchIAMMinInterval$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            }
        });
    }

    public final void setFetchIAMMinInterval(long j) {
        Model.setLongProperty$default(this, "fetchIAMMinInterval", j, null, false, 12, null);
    }

    public final long getForegroundFetchNotificationPermissionInterval() {
        return getLongProperty("foregroundFetchNotificationPermissionInterval", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$foregroundFetchNotificationPermissionInterval$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return 1000L;
            }
        });
    }

    public final void setForegroundFetchNotificationPermissionInterval(long j) {
        Model.setLongProperty$default(this, "foregroundFetchNotificationPermissionInterval", j, null, false, 12, null);
    }

    public final long getBackgroundFetchNotificationPermissionInterval() {
        return getLongProperty("backgroundFetchNotificationPermissionInterval", new Function0<Long>() { // from class: com.onesignal.core.internal.config.ConfigModel$backgroundFetchNotificationPermissionInterval$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return 86400000L;
            }
        });
    }

    public final void setBackgroundFetchNotificationPermissionInterval(long j) {
        Model.setLongProperty$default(this, "backgroundFetchNotificationPermissionInterval", j, null, false, 12, null);
    }

    public final String getGoogleProjectNumber() {
        return Model.getOptStringProperty$default(this, "googleProjectNumber", null, 2, null);
    }

    public final void setGoogleProjectNumber(String str) {
        Model.setOptStringProperty$default(this, "googleProjectNumber", str, null, false, 12, null);
    }

    public final boolean getEnterprise() {
        return getBooleanProperty("enterprise", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$enterprise$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setEnterprise(boolean z) {
        Model.setBooleanProperty$default(this, "enterprise", z, null, false, 12, null);
    }

    public final JwtRequirement getUseIdentityVerification$com_onesignal_core() {
        return JwtRequirement.INSTANCE.fromBoolean(Model.getOptBooleanProperty$default(this, "useIdentityVerification", null, 2, null));
    }

    public final void setUseIdentityVerification$com_onesignal_core(JwtRequirement value) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(value, "value");
        ConfigModel configModel = this;
        int i = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
        if (i == 1) {
            bool = null;
        } else if (i == 2) {
            bool = false;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bool = true;
        }
        Model.setOptBooleanProperty$default(configModel, "useIdentityVerification", bool, null, false, 12, null);
    }

    public final JSONArray getNotificationChannels() {
        String optStringProperty = getOptStringProperty("notificationChannels", new Function0<String>() { // from class: com.onesignal.core.internal.config.ConfigModel$notificationChannels$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return null;
            }
        });
        if (optStringProperty == null) {
            optStringProperty = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        return new JSONArray(optStringProperty);
    }

    public final void setNotificationChannels(JSONArray jSONArray) {
        Model.setOptStringProperty$default(this, "notificationChannels", jSONArray != null ? jSONArray.toString() : null, null, false, 12, null);
    }

    public final boolean getFirebaseAnalytics() {
        return getBooleanProperty("firebaseAnalytics", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$firebaseAnalytics$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setFirebaseAnalytics(boolean z) {
        Model.setBooleanProperty$default(this, "firebaseAnalytics", z, null, false, 12, null);
    }

    public final boolean getRestoreTTLFilter() {
        return getBooleanProperty("restoreTTLFilter", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$restoreTTLFilter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return true;
            }
        });
    }

    public final void setRestoreTTLFilter(boolean z) {
        Model.setBooleanProperty$default(this, "restoreTTLFilter", z, null, false, 12, null);
    }

    public final boolean getReceiveReceiptEnabled() {
        return getBooleanProperty("receiveReceiptEnabled", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$receiveReceiptEnabled$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        });
    }

    public final void setReceiveReceiptEnabled(boolean z) {
        Model.setBooleanProperty$default(this, "receiveReceiptEnabled", z, null, false, 12, null);
    }

    public final boolean getClearGroupOnSummaryClick() {
        return getBooleanProperty("clearGroupOnSummaryClick", new Function0<Boolean>() { // from class: com.onesignal.core.internal.config.ConfigModel$clearGroupOnSummaryClick$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return true;
            }
        });
    }

    public final void setClearGroupOnSummaryClick(boolean z) {
        Model.setBooleanProperty$default(this, "clearGroupOnSummaryClick", z, null, false, 12, null);
    }

    public final List<String> getSdkRemoteFeatureFlags() {
        return getListProperty("sdkRemoteFeatureFlags", new Function0<List<? extends String>>() { // from class: com.onesignal.core.internal.config.ConfigModel$sdkRemoteFeatureFlags$1
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends String> invoke() {
                return CollectionsKt.emptyList();
            }
        });
    }

    public final void setSdkRemoteFeatureFlags(List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Model.setListProperty$default(this, "sdkRemoteFeatureFlags", value, null, false, 12, null);
    }

    public final String getSdkRemoteFeatureFlagMetadata() {
        return Model.getOptStringProperty$default(this, "sdkRemoteFeatureFlagMetadata", null, 2, null);
    }

    public final void setSdkRemoteFeatureFlagMetadata(String str) {
        Model.setOptStringProperty$default(this, "sdkRemoteFeatureFlagMetadata", str, null, false, 12, null);
    }

    public final InfluenceConfigModel getInfluenceParams() {
        Object anyProperty = getAnyProperty("influenceParams", new Function0<Object>() { // from class: com.onesignal.core.internal.config.ConfigModel$influenceParams$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new InfluenceConfigModel(ConfigModel.this, "influenceParams");
            }
        });
        Intrinsics.checkNotNull(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.InfluenceConfigModel");
        return (InfluenceConfigModel) anyProperty;
    }

    public final FCMConfigModel getFcmParams() {
        Object anyProperty = getAnyProperty("fcmParams", new Function0<Object>() { // from class: com.onesignal.core.internal.config.ConfigModel$fcmParams$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new FCMConfigModel(ConfigModel.this, "fcmParams");
            }
        });
        Intrinsics.checkNotNull(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.FCMConfigModel");
        return (FCMConfigModel) anyProperty;
    }

    public final RemoteLoggingConfigModel getRemoteLoggingParams() {
        Object anyProperty = getAnyProperty("remoteLoggingParams", new Function0<Object>() { // from class: com.onesignal.core.internal.config.ConfigModel$remoteLoggingParams$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new RemoteLoggingConfigModel(ConfigModel.this, "remoteLoggingParams");
            }
        });
        Intrinsics.checkNotNull(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.RemoteLoggingConfigModel");
        return (RemoteLoggingConfigModel) anyProperty;
    }

    @Override // com.onesignal.common.modeling.Model
    protected Model createModelForProperty(String property, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (Intrinsics.areEqual(property, "influenceParams")) {
            InfluenceConfigModel influenceConfigModel = new InfluenceConfigModel(this, "influenceParams");
            influenceConfigModel.initializeFromJson(jsonObject);
            return influenceConfigModel;
        }
        if (Intrinsics.areEqual(property, "fcmParams")) {
            FCMConfigModel fCMConfigModel = new FCMConfigModel(this, "influenceParams");
            fCMConfigModel.initializeFromJson(jsonObject);
            return fCMConfigModel;
        }
        if (!Intrinsics.areEqual(property, "remoteLoggingParams")) {
            return null;
        }
        RemoteLoggingConfigModel remoteLoggingConfigModel = new RemoteLoggingConfigModel(this, "remoteLoggingParams");
        remoteLoggingConfigModel.initializeFromJson(jsonObject);
        return remoteLoggingConfigModel;
    }

    @Override // com.onesignal.common.modeling.Model
    protected List<?> createListForProperty(String property, JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        if (!Intrinsics.areEqual(property, "sdkRemoteFeatureFlags")) {
            return null;
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String optString = jsonArray.optString(i, "");
            Intrinsics.checkNotNull(optString);
            if (!StringsKt.isBlank(optString)) {
                createListBuilder.add(optString);
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
