package com.moyoung.lib.ai.asr;

/* loaded from: classes4.dex */
public class c {
    private String code;
    private String message;
    private String status;
    private long timestamp;

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTimestamp(long j8) {
        this.timestamp = j8;
    }

    public String toString() {
        return "ASRErrorResponse{status='" + this.status + "', code='" + this.code + "', message='" + this.message + "', timestamp=" + this.timestamp + '}';
    }
}
