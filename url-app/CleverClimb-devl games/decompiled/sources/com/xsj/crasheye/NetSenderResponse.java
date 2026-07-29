package com.xsj.crasheye;

/* loaded from: classes2.dex */
public class NetSenderResponse {
    private String data;
    private Exception exception;
    private int responseCode;
    private Boolean sentSuccessfully = false;
    private String serverResponse;
    private String url;

    protected NetSenderResponse(String str, String str2) {
        this.url = str;
        this.data = str2;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    protected void setResponseCode(int i) {
        this.responseCode = i;
    }

    public Exception getException() {
        return this.exception;
    }

    protected void setException(Exception exc) {
        this.exception = exc;
    }

    public Boolean getSentSuccessfully() {
        return this.sentSuccessfully;
    }

    protected void setSentSuccessfully(Boolean bool) {
        this.sentSuccessfully = bool;
    }

    public String getServerResponse() {
        return this.serverResponse;
    }

    protected void setServerResponse(String str) {
        this.serverResponse = str;
    }

    public String getData() {
        return this.data;
    }

    protected void setData(String str) {
        this.data = str;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "NetSenderResponse [exception=" + this.exception + ", sendSuccessfully=" + this.sentSuccessfully + ", serverResponse=" + this.serverResponse + ", data=" + this.data + ", url=" + this.url + ", responseCode=" + this.responseCode + "]";
    }
}
