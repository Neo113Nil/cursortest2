package com.xsj.crasheye;

/* loaded from: classes2.dex */
public class DataSaverResponse {
    private String data;
    private Exception exception;
    private String filepath;
    private Boolean savedSuccessfully;

    protected DataSaverResponse(String str, String str2) {
        this.data = str;
        this.filepath = str2;
    }

    public Exception getException() {
        return this.exception;
    }

    protected void setException(Exception exc) {
        this.exception = exc;
    }

    public Boolean getSavedSuccessfully() {
        return this.savedSuccessfully;
    }

    protected void setSavedSuccessfully(Boolean bool) {
        this.savedSuccessfully = bool;
    }

    public String getData() {
        return this.data;
    }

    public String getFilepath() {
        return this.filepath;
    }

    public String toString() {
        return "DataSaverResponse [data=" + this.data + ", filepath=" + this.filepath + ", exception=" + this.exception + ", savedSuccessfully=" + this.savedSuccessfully + "]";
    }
}
