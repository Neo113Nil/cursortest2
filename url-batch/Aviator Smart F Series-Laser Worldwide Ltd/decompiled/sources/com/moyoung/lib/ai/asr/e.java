package com.moyoung.lib.ai.asr;

/* loaded from: classes4.dex */
public class e {
    private String filename;
    private String status;
    private String text;
    private long timestamp;

    public String getFilename() {
        return this.filename;
    }

    public String getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTimestamp(long j8) {
        this.timestamp = j8;
    }

    public String toString() {
        return "ASRResponse{status='" + this.status + "', text='" + this.text + "', filename='" + this.filename + "', timestamp=" + this.timestamp + '}';
    }
}
