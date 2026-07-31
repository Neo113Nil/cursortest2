package i3;

import f2.InterfaceC0365b;
import h3.EnumC0408d;
import kotlin.jvm.internal.i;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class f implements InterfaceC0428c {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final InterfaceC0365b preferences;

    public f(InterfaceC0365b preferences, com.onesignal.core.internal.config.c _configModelStore) {
        i.e(preferences, "preferences");
        i.e(_configModelStore, "_configModelStore");
        this.preferences = preferences;
        this._configModelStore = _configModelStore;
    }

    @Override // i3.InterfaceC0428c
    public void cacheIAMInfluenceType(EnumC0408d influenceType) {
        i.e(influenceType, "influenceType");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, influenceType.toString());
    }

    @Override // i3.InterfaceC0428c
    public void cacheNotificationInfluenceType(EnumC0408d influenceType) {
        i.e(influenceType, "influenceType");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, influenceType.toString());
    }

    @Override // i3.InterfaceC0428c
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // i3.InterfaceC0428c
    public String getCachedNotificationOpenId() {
        return this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // i3.InterfaceC0428c
    public EnumC0408d getIamCachedInfluenceType() {
        return EnumC0408d.Companion.fromString(this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, EnumC0408d.UNATTRIBUTED.toString()));
    }

    @Override // i3.InterfaceC0428c
    public int getIamIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // i3.InterfaceC0428c
    public int getIamLimit() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    @Override // i3.InterfaceC0428c
    public JSONArray getLastIAMsReceivedData() {
        String string = this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // i3.InterfaceC0428c
    public JSONArray getLastNotificationsReceivedData() {
        String string = this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // i3.InterfaceC0428c
    public EnumC0408d getNotificationCachedInfluenceType() {
        return EnumC0408d.Companion.fromString(this.preferences.getString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, EnumC0408d.UNATTRIBUTED.toString()));
    }

    @Override // i3.InterfaceC0428c
    public int getNotificationIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // i3.InterfaceC0428c
    public int getNotificationLimit() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    @Override // i3.InterfaceC0428c
    public boolean isDirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    @Override // i3.InterfaceC0428c
    public boolean isIndirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    @Override // i3.InterfaceC0428c
    public boolean isUnattributedInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    @Override // i3.InterfaceC0428c
    public void saveIAMs(JSONArray iams) {
        i.e(iams, "iams");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_IAMS_RECEIVED, iams.toString());
    }

    @Override // i3.InterfaceC0428c
    public void saveNotifications(JSONArray notifications) {
        i.e(notifications, "notifications");
        this.preferences.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, notifications.toString());
    }
}
