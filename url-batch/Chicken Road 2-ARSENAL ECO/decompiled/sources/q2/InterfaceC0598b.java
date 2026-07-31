package q2;

import com.onesignal.common.events.d;
import com.onesignal.inAppMessages.internal.c;
import com.onesignal.inAppMessages.internal.g;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0598b extends d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    void messageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, c cVar);

    void messageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, c cVar);

    void messagePageChanged(com.onesignal.inAppMessages.internal.a aVar, g gVar);

    void messageWasDismissed(com.onesignal.inAppMessages.internal.a aVar);

    void messageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar);

    void messageWillDismiss(com.onesignal.inAppMessages.internal.a aVar);

    void messageWillDisplay(com.onesignal.inAppMessages.internal.a aVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
