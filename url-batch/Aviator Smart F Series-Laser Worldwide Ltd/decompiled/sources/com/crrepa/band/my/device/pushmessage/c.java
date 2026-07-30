package com.crrepa.band.my.device.pushmessage;

import com.crrepa.band.my.model.MessageModel;
import java.util.List;

/* loaded from: classes2.dex */
public interface c {
    void disableNotificationListenerService();

    void enableNotificationListenerService();

    void renderMessageList(List<MessageModel> list);

    void renderMessageState(int i8, boolean z7);

    void renderNotificationListenerDialog();

    void requestCallPermission();

    void requestSMSPermission();
}
