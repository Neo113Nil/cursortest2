package h3;

import java.util.List;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0405a {
    List<C0406b> getInfluences();

    void onDirectInfluenceFromIAM(String str);

    void onDirectInfluenceFromNotification(String str);

    void onInAppMessageDismissed();

    void onInAppMessageDisplayed(String str);

    void onNotificationReceived(String str);
}
