package pc;

import org.json.JSONArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements c {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final qa.b preferences;

    public f(qa.b bVar, com.onesignal.core.internal.config.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.preferences = bVar;
        this._configModelStore = bVar2;
    }

    @Override // pc.c
    public void cacheIAMInfluenceType(oc.d dVar) {
        dVar.getClass();
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, dVar.toString());
    }

    @Override // pc.c
    public void cacheNotificationInfluenceType(oc.d dVar) {
        dVar.getClass();
        this.preferences.saveString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, dVar.toString());
    }

    @Override // pc.c
    public void cacheNotificationOpenId(String str) {
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, str);
    }

    @Override // pc.c
    public String getCachedNotificationOpenId() {
        return this.preferences.getString("OneSignal", e.PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN, null);
    }

    @Override // pc.c
    public oc.d getIamCachedInfluenceType() {
        return oc.d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE, oc.d.UNATTRIBUTED.toString()));
    }

    @Override // pc.c
    public int getIamIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectIAMAttributionWindow();
    }

    @Override // pc.c
    public int getIamLimit() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIamLimit();
    }

    @Override // pc.c
    public JSONArray getLastIAMsReceivedData() {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // pc.c
    public JSONArray getLastNotificationsReceivedData() {
        String string = this.preferences.getString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, "[]");
        return string != null ? new JSONArray(string) : new JSONArray();
    }

    @Override // pc.c
    public oc.d getNotificationCachedInfluenceType() {
        return oc.d.Companion.fromString(this.preferences.getString("OneSignal", e.PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE, oc.d.UNATTRIBUTED.toString()));
    }

    @Override // pc.c
    public int getNotificationIndirectAttributionWindow() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getIndirectNotificationAttributionWindow();
    }

    @Override // pc.c
    public int getNotificationLimit() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().getNotificationLimit();
    }

    @Override // pc.c
    public boolean isDirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isDirectEnabled();
    }

    @Override // pc.c
    public boolean isIndirectInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isIndirectEnabled();
    }

    @Override // pc.c
    public boolean isUnattributedInfluenceEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getInfluenceParams().isUnattributedEnabled();
    }

    @Override // pc.c
    public void saveIAMs(JSONArray jSONArray) {
        jSONArray.getClass();
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_IAMS_RECEIVED, jSONArray.toString());
    }

    @Override // pc.c
    public void saveNotifications(JSONArray jSONArray) {
        jSONArray.getClass();
        this.preferences.saveString("OneSignal", e.PREFS_OS_LAST_NOTIFICATIONS_RECEIVED, jSONArray.toString());
    }
}
