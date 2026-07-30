package com.crrepa.ble.hisilicon.connectkit;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public class ConnectKitMessage {
    private String destPackageName;
    private int messageId;
    private int messageType;
    private String payload;
    private int response;
    private String srcPackageName;

    public ConnectKitMessage() {
    }

    public ConnectKitMessage(int i8, int i9, String str, String str2, String str3, int i10) {
        this.messageType = i8;
        this.messageId = i9;
        this.srcPackageName = str;
        this.destPackageName = str2;
        this.payload = str3;
        this.response = i10;
    }

    public String getDestPackageName() {
        return this.destPackageName;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public int getMessageType() {
        return this.messageType;
    }

    public String getPayload() {
        return this.payload;
    }

    public int getResponse() {
        return this.response;
    }

    public String getSrcPackageName() {
        return this.srcPackageName;
    }

    public void setDestPackageName(String str) {
        this.destPackageName = str;
    }

    public void setMessageId(int i8) {
        this.messageId = i8;
    }

    public void setMessageType(int i8) {
        this.messageType = i8;
    }

    public void setPayload(String str) {
        this.payload = str;
    }

    public void setResponse(int i8) {
        this.response = i8;
    }

    public void setSrcPackageName(String str) {
        this.srcPackageName = str;
    }

    public String toString() {
        return "ConnectKitMessage{messageType=" + this.messageType + ", messageId=" + this.messageId + ", srcPackageName='" + this.srcPackageName + "', destPackageName='" + this.destPackageName + "', payload='" + this.payload + "', response=" + this.response + '}';
    }
}
