package com.onesignal.core.internal.config;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends com.onesignal.common.modeling.i {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends wd.p implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 86400000L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends wd.p implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new com.onesignal.core.internal.config.c(a.this, "fcmParams");
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends wd.p implements Function0 {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 30000L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i extends wd.p implements Function0 {
        public static final i INSTANCE = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 1000L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends wd.p implements Function0 {
        public static final j INSTANCE = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 60000;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class k extends wd.p implements Function0 {
        public static final k INSTANCE = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 60;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class l extends wd.p implements Function0 {
        public static final l INSTANCE = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 120000;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class m extends wd.p implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new com.onesignal.core.internal.config.d(a.this, "influenceParams");
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class q extends wd.p implements Function0 {
        public static final q INSTANCE = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 15000L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class r extends wd.p implements Function0 {
        public static final r INSTANCE = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 5000L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class s extends wd.p implements Function0 {
        public static final s INSTANCE = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 5000L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class t extends wd.p implements Function0 {
        public static final t INSTANCE = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 60000L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class u extends wd.p implements Function0 {
        public static final u INSTANCE = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 200L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class x extends wd.p implements Function0 {
        public static final x INSTANCE = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 30000L;
        }
    }

    public a() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.i
    public com.onesignal.common.modeling.i createModelForProperty(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        if (Intrinsics.a(str, "influenceParams")) {
            com.onesignal.core.internal.config.d dVar = new com.onesignal.core.internal.config.d(this, "influenceParams");
            dVar.initializeFromJson(jSONObject);
            return dVar;
        }
        if (!Intrinsics.a(str, "fcmParams")) {
            return null;
        }
        com.onesignal.core.internal.config.c cVar = new com.onesignal.core.internal.config.c(this, "influenceParams");
        cVar.initializeFromJson(jSONObject);
        return cVar;
    }

    public final String getApiUrl() {
        return getStringProperty("apiUrl", C0013a.INSTANCE);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    public final long getBackgroundFetchNotificationPermissionInterval() {
        return getLongProperty("backgroundFetchNotificationPermissionInterval", b.INSTANCE);
    }

    public final boolean getClearGroupOnSummaryClick() {
        return getBooleanProperty("clearGroupOnSummaryClick", c.INSTANCE);
    }

    public final Boolean getConsentGiven() {
        return com.onesignal.common.modeling.i.getOptBooleanProperty$default(this, "consentGiven", null, 2, null);
    }

    public final Boolean getConsentRequired() {
        return com.onesignal.common.modeling.i.getOptBooleanProperty$default(this, "consentRequired", null, 2, null);
    }

    public final boolean getDisableGMSMissingPrompt() {
        return getBooleanProperty("disableGMSMissingPrompt", d.INSTANCE);
    }

    public final boolean getEnterprise() {
        return getBooleanProperty("enterprise", e.INSTANCE);
    }

    public final com.onesignal.core.internal.config.c getFcmParams() {
        Object anyProperty = getAnyProperty("fcmParams", new f());
        anyProperty.getClass();
        return (com.onesignal.core.internal.config.c) anyProperty;
    }

    public final long getFetchIAMMinInterval() {
        return getLongProperty("fetchIAMMinInterval", g.INSTANCE);
    }

    public final boolean getFirebaseAnalytics() {
        return getBooleanProperty("firebaseAnalytics", h.INSTANCE);
    }

    public final long getForegroundFetchNotificationPermissionInterval() {
        return getLongProperty("foregroundFetchNotificationPermissionInterval", i.INSTANCE);
    }

    public final String getGoogleProjectNumber() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "googleProjectNumber", null, 2, null);
    }

    public final int getHttpGetTimeout() {
        return getIntProperty("httpGetTimeout", j.INSTANCE);
    }

    public final int getHttpRetryAfterParseFailFallback() {
        return getIntProperty("httpRetryAfterParseFailFallback", k.INSTANCE);
    }

    public final int getHttpTimeout() {
        return getIntProperty("httpTimeout", l.INSTANCE);
    }

    public final com.onesignal.core.internal.config.d getInfluenceParams() {
        Object anyProperty = getAnyProperty("influenceParams", new m());
        anyProperty.getClass();
        return (com.onesignal.core.internal.config.d) anyProperty;
    }

    public final boolean getLocationShared() {
        return getBooleanProperty("locationShared", o.INSTANCE);
    }

    public final JSONArray getNotificationChannels() {
        String optStringProperty = getOptStringProperty("notificationChannels", p.INSTANCE);
        if (optStringProperty == null) {
            optStringProperty = "[]";
        }
        return new JSONArray(optStringProperty);
    }

    public final long getOpRepoDefaultFailRetryBackoff() {
        return getLongProperty("opRepoDefaultFailRetryBackoff", q.INSTANCE);
    }

    public final long getOpRepoExecutionInterval() {
        return getLongProperty("opRepoExecutionInterval", r.INSTANCE);
    }

    public final long getOpRepoPostCreateDelay() {
        return getLongProperty("opRepoPostCreateDelay", s.INSTANCE);
    }

    public final long getOpRepoPostCreateRetryUpTo() {
        return getLongProperty("opRepoPostCreateRetryUpTo", t.INSTANCE);
    }

    public final long getOpRepoPostWakeDelay() {
        return getLongProperty("opRepoPostWakeDelay", u.INSTANCE);
    }

    public final String getPushSubscriptionId() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "pushSubscriptionId", null, 2, null);
    }

    public final boolean getReceiveReceiptEnabled() {
        return getBooleanProperty("receiveReceiptEnabled", v.INSTANCE);
    }

    public final boolean getRestoreTTLFilter() {
        return getBooleanProperty("restoreTTLFilter", w.INSTANCE);
    }

    public final long getSessionFocusTimeout() {
        return getLongProperty("sessionFocusTimeout", x.INSTANCE);
    }

    public final boolean getUnsubscribeWhenNotificationsDisabled() {
        return getBooleanProperty("unsubscribeWhenNotificationsDisabled", y.INSTANCE);
    }

    public final boolean getUseIdentityVerification() {
        return getBooleanProperty("useIdentityVerification", z.INSTANCE);
    }

    public final boolean getUserRejectedGMSUpdate() {
        return getBooleanProperty("userRejectedGMSUpdate", a0.INSTANCE);
    }

    public final boolean isInitializedWithRemote() {
        return getBooleanProperty("isInitializedWithRemote", n.INSTANCE);
    }

    public final void setApiUrl(String str) {
        str.getClass();
        com.onesignal.common.modeling.i.setStringProperty$default(this, "apiUrl", str, null, false, 12, null);
    }

    public final void setAppId(String str) {
        str.getClass();
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    public final void setBackgroundFetchNotificationPermissionInterval(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "backgroundFetchNotificationPermissionInterval", j3, null, false, 12, null);
    }

    public final void setClearGroupOnSummaryClick(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "clearGroupOnSummaryClick", z10, null, false, 12, null);
    }

    public final void setConsentGiven(Boolean bool) {
        com.onesignal.common.modeling.i.setOptBooleanProperty$default(this, "consentGiven", bool, null, false, 12, null);
    }

    public final void setConsentRequired(Boolean bool) {
        com.onesignal.common.modeling.i.setOptBooleanProperty$default(this, "consentRequired", bool, null, false, 12, null);
    }

    public final void setDisableGMSMissingPrompt(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "disableGMSMissingPrompt", z10, null, false, 12, null);
    }

    public final void setEnterprise(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "enterprise", z10, null, false, 12, null);
    }

    public final void setFetchIAMMinInterval(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "fetchIAMMinInterval", j3, null, false, 12, null);
    }

    public final void setFirebaseAnalytics(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "firebaseAnalytics", z10, null, false, 12, null);
    }

    public final void setForegroundFetchNotificationPermissionInterval(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "foregroundFetchNotificationPermissionInterval", j3, null, false, 12, null);
    }

    public final void setGoogleProjectNumber(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "googleProjectNumber", str, null, false, 12, null);
    }

    public final void setHttpGetTimeout(int i3) {
        com.onesignal.common.modeling.i.setIntProperty$default(this, "httpGetTimeout", i3, null, false, 12, null);
    }

    public final void setHttpRetryAfterParseFailFallback(int i3) {
        com.onesignal.common.modeling.i.setIntProperty$default(this, "httpRetryAfterParseFailFallback", i3, null, false, 12, null);
    }

    public final void setHttpTimeout(int i3) {
        com.onesignal.common.modeling.i.setIntProperty$default(this, "httpTimeout", i3, null, false, 12, null);
    }

    public final void setInitializedWithRemote(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "isInitializedWithRemote", z10, null, false, 12, null);
    }

    public final void setLocationShared(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "locationShared", z10, null, false, 12, null);
    }

    public final void setNotificationChannels(JSONArray jSONArray) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "notificationChannels", jSONArray != null ? jSONArray.toString() : null, null, false, 12, null);
    }

    public final void setOpRepoDefaultFailRetryBackoff(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "opRepoDefaultFailRetryBackoff", j3, null, false, 12, null);
    }

    public final void setOpRepoExecutionInterval(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "opRepoExecutionInterval", j3, null, false, 12, null);
    }

    public final void setOpRepoPostCreateDelay(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "opRepoPostCreateDelay", j3, null, false, 12, null);
    }

    public final void setOpRepoPostCreateRetryUpTo(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "opRepoPostCreateRetryUpTo", j3, null, false, 12, null);
    }

    public final void setOpRepoPostWakeDelay(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "opRepoPostWakeDelay", j3, null, false, 12, null);
    }

    public final void setPushSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "pushSubscriptionId", str, null, false, 12, null);
    }

    public final void setReceiveReceiptEnabled(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "receiveReceiptEnabled", z10, null, false, 12, null);
    }

    public final void setRestoreTTLFilter(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "restoreTTLFilter", z10, null, false, 12, null);
    }

    public final void setSessionFocusTimeout(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "sessionFocusTimeout", j3, null, false, 12, null);
    }

    public final void setUnsubscribeWhenNotificationsDisabled(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "unsubscribeWhenNotificationsDisabled", z10, null, false, 12, null);
    }

    public final void setUseIdentityVerification(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "useIdentityVerification", z10, null, false, 12, null);
    }

    public final void setUserRejectedGMSUpdate(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "userRejectedGMSUpdate", z10, null, false, 12, null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.config.a$a, reason: collision with other inner class name */
    public static final class C0013a extends wd.p implements Function0 {
        public static final C0013a INSTANCE = new C0013a();

        public C0013a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "https://api.onesignal.com/";
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a0 extends wd.p implements Function0 {
        public static final a0 INSTANCE = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends wd.p implements Function0 {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends wd.p implements Function0 {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends wd.p implements Function0 {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends wd.p implements Function0 {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class n extends wd.p implements Function0 {
        public static final n INSTANCE = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class o extends wd.p implements Function0 {
        public static final o INSTANCE = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class p extends wd.p implements Function0 {
        public static final p INSTANCE = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return null;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class v extends wd.p implements Function0 {
        public static final v INSTANCE = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class w extends wd.p implements Function0 {
        public static final w INSTANCE = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class y extends wd.p implements Function0 {
        public static final y INSTANCE = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class z extends wd.p implements Function0 {
        public static final z INSTANCE = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }
}
