package oc;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface a {
    List<b> getInfluences();

    void onDirectInfluenceFromIAM(String str);

    void onDirectInfluenceFromNotification(String str);

    void onInAppMessageDismissed();

    void onInAppMessageDisplayed(String str);

    void onNotificationReceived(String str);
}
