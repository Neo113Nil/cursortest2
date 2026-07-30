package K3;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class f implements c {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final H2.b preferences;

    public f(H2.b preferences, com.onesignal.core.internal.config.c _configModelStore) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this.preferences = preferences;
        this._configModelStore = _configModelStore;
    }

    @Override // K3.c
    public void cacheIAMInfluenceType(J3.d influenceType) {
        Intrinsics.checkNotNullParameter(influenceType, "influenceType");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, influenceType.toString());
    }

    @Override // K3.c
    public void cacheNotificationInfluenceType(J3.d influenceType) {
        Intrinsics.checkNotNullParameter(influenceType, "influenceType");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, influenceType.toString());
    }

    @Override // K3.c
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // K3.c
    public String getCachedNotificationOpenId() {
        return this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // K3.c
    public J3.d getIamCachedInfluenceType() {
        return J3.d.Companion.fromString(this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, J3.d.UNATTRIBUTED.toString()));
    }

    @Override // K3.c
    public int getIamIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // K3.c
    public int getIamLimit() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    @Override // K3.c
    public JSONArray getLastIAMsReceivedData() {
        String string = this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // K3.c
    public JSONArray getLastNotificationsReceivedData() {
        String string = this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // K3.c
    public J3.d getNotificationCachedInfluenceType() {
        return J3.d.Companion.fromString(this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, J3.d.UNATTRIBUTED.toString()));
    }

    @Override // K3.c
    public int getNotificationIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // K3.c
    public int getNotificationLimit() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    @Override // K3.c
    public boolean isDirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    @Override // K3.c
    public boolean isIndirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    @Override // K3.c
    public boolean isUnattributedInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    @Override // K3.c
    public void saveIAMs(JSONArray iams) {
        Intrinsics.checkNotNullParameter(iams, "iams");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_IAMS_RECEIVED, iams.toString());
    }

    @Override // K3.c
    public void saveNotifications(JSONArray notifications) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, notifications.toString());
    }
}
