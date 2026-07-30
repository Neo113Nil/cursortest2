package com.crrepa.band.my.device.ai.chat.delegate;

import com.crrepa.band.my.device.ai.chat.x;

/* loaded from: classes2.dex */
public abstract class c {
    protected volatile String currentQid;
    protected String wholeAnswer = "";
    protected boolean isFromWatch = false;
    protected boolean isStreamChat = true;
    private boolean isResponseEnded = true;

    public abstract void clearCurrentTopic();

    public String getWholeAnswer() {
        return this.wholeAnswer;
    }

    public boolean isResponseEnded() {
        return this.isResponseEnded;
    }

    public abstract void requestChatGPT(String str, String str2, x xVar);

    public void resetWholeAnswer() {
        this.wholeAnswer = "";
    }

    public void setResponseEnded(boolean z7) {
        this.isResponseEnded = z7;
    }

    public void setWholeAnswer(String str) {
        this.wholeAnswer = str;
    }
}
