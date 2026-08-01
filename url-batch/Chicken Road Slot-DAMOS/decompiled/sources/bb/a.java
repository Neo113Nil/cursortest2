package bb;

import com.onesignal.inAppMessages.internal.c;
import com.onesignal.inAppMessages.internal.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface a {
    void onMessageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, c cVar);

    void onMessageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, c cVar);

    void onMessagePageChanged(com.onesignal.inAppMessages.internal.a aVar, g gVar);

    void onMessageWasDismissed(com.onesignal.inAppMessages.internal.a aVar);

    void onMessageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar);

    void onMessageWillDismiss(com.onesignal.inAppMessages.internal.a aVar);

    void onMessageWillDisplay(com.onesignal.inAppMessages.internal.a aVar);
}
