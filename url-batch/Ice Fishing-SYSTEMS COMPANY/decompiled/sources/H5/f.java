package H5;

import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class f implements c {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final F4.b preferences;

    public f(F4.b preferences, com.onesignal.core.internal.config.c _configModelStore) {
        kotlin.jvm.internal.h.e(preferences, "preferences");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        this.preferences = preferences;
        this._configModelStore = _configModelStore;
    }

    @Override // H5.c
    public void cacheIAMInfluenceType(G5.d influenceType) {
        kotlin.jvm.internal.h.e(influenceType, "influenceType");
        this.preferences.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, influenceType.toString());
    }

    @Override // H5.c
    public void cacheNotificationInfluenceType(G5.d influenceType) {
        kotlin.jvm.internal.h.e(influenceType, "influenceType");
        this.preferences.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, influenceType.toString());
    }

    @Override // H5.c
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // H5.c
    public String getCachedNotificationOpenId() {
        return this.preferences.getString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // H5.c
    public G5.d getIamCachedInfluenceType() {
        return G5.d.Companion.fromString(this.preferences.getString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, G5.d.UNATTRIBUTED.toString()));
    }

    @Override // H5.c
    public int getIamIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // H5.c
    public int getIamLimit() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    @Override // H5.c
    public JSONArray getLastIAMsReceivedData() {
        String string = this.preferences.getString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // H5.c
    public JSONArray getLastNotificationsReceivedData() {
        String string = this.preferences.getString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // H5.c
    public G5.d getNotificationCachedInfluenceType() {
        return G5.d.Companion.fromString(this.preferences.getString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, G5.d.UNATTRIBUTED.toString()));
    }

    @Override // H5.c
    public int getNotificationIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // H5.c
    public int getNotificationLimit() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    @Override // H5.c
    public boolean isDirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    @Override // H5.c
    public boolean isIndirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    @Override // H5.c
    public boolean isUnattributedInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    @Override // H5.c
    public void saveIAMs(JSONArray iams) {
        kotlin.jvm.internal.h.e(iams, "iams");
        this.preferences.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_LAST_IAMS_RECEIVED, iams.toString());
    }

    @Override // H5.c
    public void saveNotifications(JSONArray notifications) {
        kotlin.jvm.internal.h.e(notifications, "notifications");
        this.preferences.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, notifications.toString());
    }
}
