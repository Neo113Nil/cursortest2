package com.crrepa.band.my.device.watchface.model;

/* loaded from: classes2.dex */
public class StoreWatchFacePreviewBean {
    private Integer code;
    private String file;
    private String message;
    private String preview;

    public Integer getCode() {
        return this.code;
    }

    public String getFile() {
        return this.file;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPreview() {
        return this.preview;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setFile(String str) {
        this.file = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPreview(String str) {
        this.preview = str;
    }

    public String toString() {
        return "StoreWatchFacePreviewBean{code=" + this.code + ", message='" + this.message + "', preview='" + this.preview + "', file='" + this.file + "'}";
    }
}
