package com.moyoung.lib.ai.asrstream;

/* loaded from: classes4.dex */
public class d {
    private String answer;
    private String command;
    private String mode;
    private e result;
    private String sessionId;
    private String text;

    public String getAnswer() {
        return this.answer;
    }

    public String getCommand() {
        return this.command;
    }

    public String getMode() {
        return this.mode;
    }

    public e getResult() {
        return this.result;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getText() {
        return this.text;
    }

    public boolean hasAnswer() {
        String str = this.answer;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public boolean hasCommand() {
        String str = this.command;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public boolean isOfflineMode() {
        return "2pass-offline".equals(this.mode);
    }

    public void setAnswer(String str) {
        this.answer = str;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setResult(e eVar) {
        this.result = eVar;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        return "ASRResponse{mode='" + this.mode + "', text='" + this.text + "', answer='" + this.answer + "', command='" + this.command + "', sessionId='" + this.sessionId + "', result=" + this.result + '}';
    }
}
