package com.moyoung.lib.ai.asrstream;

/* loaded from: classes4.dex */
public class e {
    private String contentType;
    private String emotion;
    private int endTime;
    private String language;
    private int startTime;
    private String text;

    public String getContentType() {
        return this.contentType;
    }

    public String getEmotion() {
        return this.emotion;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public String getText() {
        return this.text;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setEmotion(String str) {
        this.emotion = str;
    }

    public void setEndTime(int i8) {
        this.endTime = i8;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setStartTime(int i8) {
        this.startTime = i8;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        return "ASRResult{language='" + this.language + "', emotion='" + this.emotion + "', contentType='" + this.contentType + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", text='" + this.text + "'}";
    }
}
