package pc;

import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, sa.a aVar) {
        super(fVar, aVar);
        fVar.getClass();
        aVar.getClass();
    }

    @Override // pc.a, pc.b
    public void cacheState() {
        f dataRepository = getDataRepository();
        oc.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = oc.d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // pc.a
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // pc.a, pc.b
    public oc.c getChannelType() {
        return oc.c.NOTIFICATION;
    }

    @Override // pc.a, pc.b
    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    @Override // pc.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // pc.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // pc.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e2) {
            com.onesignal.debug.internal.logging.b.error("Generating Notification tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    @Override // pc.a
    public void initInfluencedTypeFromCache() {
        oc.d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // pc.a
    public void saveChannelObjects(JSONArray jSONArray) {
        jSONArray.getClass();
        getDataRepository().saveNotifications(jSONArray);
    }
}
