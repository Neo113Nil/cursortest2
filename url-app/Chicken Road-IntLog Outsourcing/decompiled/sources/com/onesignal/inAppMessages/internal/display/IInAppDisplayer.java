package com.onesignal.inAppMessages.internal.display;

import com.onesignal.inAppMessages.internal.InAppMessage;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IInAppDisplayer {
    void dismissCurrentInAppMessage();

    Object displayMessage(InAppMessage inAppMessage, InterfaceC1218d interfaceC1218d);

    Object displayPreviewMessage(String str, InterfaceC1218d interfaceC1218d);
}
