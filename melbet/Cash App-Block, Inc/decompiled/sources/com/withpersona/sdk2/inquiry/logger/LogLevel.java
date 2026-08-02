package com.withpersona.sdk2.inquiry.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class LogLevel {
    public static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel Error;

    /* JADX INFO: Fake field, exist only in values array */
    LogLevel EF0;

    static {
        LogLevel logLevel = new LogLevel("Debug", 0);
        LogLevel logLevel2 = new LogLevel("Warning", 1);
        LogLevel logLevel3 = new LogLevel("Error", 2);
        Error = logLevel3;
        $VALUES = new LogLevel[]{logLevel, logLevel2, logLevel3};
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
