package com.crrepa.band.my.device.ai.chat.model;

import com.artillery.ctc.base.LargeModel;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.helper.d;

/* loaded from: classes2.dex */
public class AIChatRecordEntity {
    private Long id;
    private transient boolean isResponseEnded;
    private transient boolean isTtsPlaying;
    private String msg;
    private String msgType;
    private int role;
    private long timeMillis;
    private String ttsFilePath;

    public AIChatRecordEntity(Long l8, long j8, int i8, String str, String str2, String str3) {
        this.isResponseEnded = false;
        this.isTtsPlaying = false;
        this.id = l8;
        this.timeMillis = j8;
        this.role = i8;
        this.msg = str;
        this.msgType = str2;
        this.ttsFilePath = str3;
    }

    public void addMsg(String str) {
        this.msg += str;
    }

    public Long getId() {
        return this.id;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsgType() {
        return this.msgType;
    }

    public int getRole() {
        return this.role;
    }

    public long getTimeMillis() {
        return this.timeMillis;
    }

    public String getTtsFilePath() {
        return this.ttsFilePath;
    }

    public boolean isMe() {
        return this.role == 1;
    }

    public boolean isResponseEnded() {
        return this.isResponseEnded;
    }

    public boolean isTtsPlaying() {
        return this.isTtsPlaying;
    }

    public void setAssistantMsg(String str) {
        this.msg = str;
        this.role = 0;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setIsResponseEnded(boolean z7) {
        this.isResponseEnded = z7;
    }

    public void setIsTtsPlaying(boolean z7) {
        this.isTtsPlaying = z7;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setMsgType(String str) {
        this.msgType = str;
    }

    public void setRole(int i8) {
        this.role = i8;
    }

    public void setTimeMillis(long j8) {
        this.timeMillis = j8;
    }

    public void setTtsFilePath(String str) {
        this.ttsFilePath = str;
    }

    public void setUserMsg(String str) {
        this.msg = str;
        this.role = 1;
    }

    public AIChatRecordEntity() {
        this.msg = "";
        this.isResponseEnded = false;
        this.isTtsPlaying = false;
    }

    public void setMsgType() {
        if (d.isMultipleMode()) {
            LargeModel selectedLargeModel = AIProvider.getSelectedLargeModel();
            if (selectedLargeModel == null) {
                this.msgType = com.crrepa.band.my.device.ai.chat.delegate.child.d.DEFAULT_LARGE_MODEL_TYPE;
            } else {
                this.msgType = selectedLargeModel.type;
            }
        }
    }
}
