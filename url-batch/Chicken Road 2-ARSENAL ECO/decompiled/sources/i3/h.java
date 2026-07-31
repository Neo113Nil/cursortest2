package i3;

import g2.InterfaceC0391a;
import h3.EnumC0407c;
import h3.EnumC0408d;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class h extends AbstractC0426a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f dataRepository, InterfaceC0391a timeProvider) {
        super(dataRepository, timeProvider);
        i.e(dataRepository, "dataRepository");
        i.e(timeProvider, "timeProvider");
    }

    @Override // i3.AbstractC0426a, i3.InterfaceC0427b
    public void cacheState() {
        f dataRepository = getDataRepository();
        EnumC0408d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = EnumC0408d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // i3.AbstractC0426a
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // i3.AbstractC0426a, i3.InterfaceC0427b
    public EnumC0407c getChannelType() {
        return EnumC0407c.NOTIFICATION;
    }

    @Override // i3.AbstractC0426a, i3.InterfaceC0427b
    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    @Override // i3.AbstractC0426a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // i3.AbstractC0426a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // i3.AbstractC0426a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e4) {
            com.onesignal.debug.internal.logging.b.error("Generating Notification tracker getLastChannelObjects JSONObject ", e4);
            return new JSONArray();
        }
    }

    @Override // i3.AbstractC0426a
    public void initInfluencedTypeFromCache() {
        EnumC0408d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // i3.AbstractC0426a
    public void saveChannelObjects(JSONArray channelObjects) {
        i.e(channelObjects, "channelObjects");
        getDataRepository().saveNotifications(channelObjects);
    }
}
