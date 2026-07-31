package i3;

import h3.EnumC0408d;
import org.json.JSONArray;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0428c {
    void cacheIAMInfluenceType(EnumC0408d enumC0408d);

    void cacheNotificationInfluenceType(EnumC0408d enumC0408d);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    EnumC0408d getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData();

    JSONArray getLastNotificationsReceivedData();

    EnumC0408d getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
