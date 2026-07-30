package com.crrepa.ble.conn.bean;

import android.text.TextUtils;
import java.io.File;

/* loaded from: classes3.dex */
public class CRPConnectKitMessage {
    private String destPackageName;
    private String dstFilePath;
    private File file;
    private int messageId;
    private String msg;
    private Integer response;
    private String srcPackageName;

    public CRPConnectKitMessage() {
    }

    public CRPConnectKitMessage(int i8, String str, String str2, String str3) {
        this.messageId = i8;
        this.srcPackageName = str;
        this.destPackageName = str2;
        this.msg = str3;
    }

    public String getDestPackageName() {
        return this.destPackageName;
    }

    public String getDstFilePath() {
        if (TextUtils.isEmpty(this.dstFilePath)) {
            this.dstFilePath = "/";
        } else {
            if (!this.dstFilePath.startsWith("/")) {
                this.dstFilePath = "/" + this.dstFilePath;
            }
            if (!this.dstFilePath.endsWith("/")) {
                this.dstFilePath += "/";
            }
        }
        return this.dstFilePath;
    }

    public File getFile() {
        return this.file;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getResponse() {
        return this.response;
    }

    public String getSrcPackageName() {
        return this.srcPackageName;
    }

    public void setDestPackageName(String str) {
        this.destPackageName = str;
    }

    public void setDstFilePath(String str) {
        this.dstFilePath = str;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setMessageId(int i8) {
        this.messageId = i8;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setResponse(Integer num) {
        this.response = num;
    }

    public void setSrcPackageName(String str) {
        this.srcPackageName = str;
    }

    public String toString() {
        return "CRPConnectKitSendMessage{messageId=" + this.messageId + ", srcPackageName='" + this.srcPackageName + "', destPackageName='" + this.destPackageName + "', msg='" + this.msg + "', dstFilePath='" + this.dstFilePath + "', file=" + this.file + ", response=" + this.response + '}';
    }
}
