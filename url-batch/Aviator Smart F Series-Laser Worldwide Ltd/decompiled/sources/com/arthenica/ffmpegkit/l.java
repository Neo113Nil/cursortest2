package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class l {
    private final Level level;
    private final String message;
    private final long sessionId;

    public l(long j8, Level level, String str) {
        this.sessionId = j8;
        this.level = level;
        this.message = str;
    }

    public Level getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public String toString() {
        return "Log{sessionId=" + this.sessionId + ", level=" + this.level + ", message='" + this.message + "'}";
    }
}
