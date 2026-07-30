package com.crrepa.band.my.device.ai.chat.delegate;

import com.crrepa.band.my.device.ai.chat.delegate.child.d;
import com.crrepa.band.my.device.ai.chat.delegate.child.e;
import com.crrepa.band.my.device.ai.chat.x;
import com.crrepa.band.my.device.ai.helper.AIProvider;

/* loaded from: classes2.dex */
public class a {
    private c chatDelegate;

    private void initDelegate() {
        if (this.chatDelegate != null) {
            return;
        }
        if (AIProvider.getProviderType() == 0) {
            this.chatDelegate = new d();
        } else if (AIProvider.getProviderType() == 1) {
            this.chatDelegate = new com.crrepa.band.my.device.ai.chat.delegate.child.c();
        } else {
            this.chatDelegate = new e();
        }
    }

    public void clearCurrentTopic() {
        c cVar = this.chatDelegate;
        if (cVar != null) {
            cVar.clearCurrentTopic();
        }
    }

    public c getChatDelegate() {
        initDelegate();
        return this.chatDelegate;
    }

    public void requestChatGPT(String str, x xVar) {
        if (com.crrepa.band.my.device.ai.helper.d.isUnauthorizedAndShowTips()) {
            this.chatDelegate.setResponseEnded(true);
            xVar.onFail(-1, "Unauthorized");
            return;
        }
        String uuid = com.crrepa.band.my.device.ai.helper.d.getUUID();
        this.chatDelegate.currentQid = uuid;
        c cVar = this.chatDelegate;
        cVar.wholeAnswer = "";
        cVar.requestChatGPT(str, uuid, xVar);
        com.crrepa.band.my.device.ai.helper.d.logChatEvent(this.chatDelegate.isFromWatch);
    }
}
