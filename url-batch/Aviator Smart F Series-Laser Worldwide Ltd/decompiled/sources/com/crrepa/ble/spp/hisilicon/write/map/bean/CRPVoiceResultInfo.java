package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPVoiceResultInfo {
    private int code;
    private int isEnded;
    private int type;
    private String voiceContent;

    public int getCode() {
        return this.code;
    }

    public int getIsEnded() {
        return this.isEnded;
    }

    public int getType() {
        return this.type;
    }

    public String getVoiceContent() {
        return this.voiceContent;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setIsEnded(int i8) {
        this.isEnded = i8;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public void setVoiceContent(String str) {
        this.voiceContent = str;
    }

    public String toString() {
        return "CRPVoiceResultInfo{code=" + this.code + ", isEnded=" + this.isEnded + ", type=" + this.type + ", voiceContent='" + this.voiceContent + "'}";
    }
}
