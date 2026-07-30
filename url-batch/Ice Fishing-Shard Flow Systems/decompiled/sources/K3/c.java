package K3;

import org.json.JSONArray;

/* loaded from: classes.dex */
public interface c {
    void cacheIAMInfluenceType(J3.d dVar);

    void cacheNotificationInfluenceType(J3.d dVar);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    J3.d getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData();

    JSONArray getLastNotificationsReceivedData();

    J3.d getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
