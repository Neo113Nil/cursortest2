package com.amplitude.reactnative;

import com.facebook.common.callercontext.ContextChain;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: AndroidLogger.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/amplitude/reactnative/Logger;", "", "logMode", "Lcom/amplitude/reactnative/Logger$LogMode;", "getLogMode", "()Lcom/amplitude/reactnative/Logger$LogMode;", "setLogMode", "(Lcom/amplitude/reactnative/Logger$LogMode;)V", "debug", "", StackTraceHelper.MESSAGE_KEY, "", "error", "info", "warn", "LogMode", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Logger {
    void debug(String message);

    void error(String message);

    LogMode getLogMode();

    void info(String message);

    void setLogMode(LogMode logMode);

    void warn(String message);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AndroidLogger.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amplitude/reactnative/Logger$LogMode;", "", ContextChain.TAG_INFRA, "", "<init>", "(Ljava/lang/String;II)V", "DEBUG", "INFO", "WARN", "ERROR", "OFF", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LogMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LogMode[] $VALUES;
        public static final LogMode DEBUG = new LogMode("DEBUG", 0, 1);
        public static final LogMode INFO = new LogMode("INFO", 1, 2);
        public static final LogMode WARN = new LogMode("WARN", 2, 3);
        public static final LogMode ERROR = new LogMode("ERROR", 3, 4);
        public static final LogMode OFF = new LogMode("OFF", 4, 5);

        private static final /* synthetic */ LogMode[] $values() {
            return new LogMode[]{DEBUG, INFO, WARN, ERROR, OFF};
        }

        public static EnumEntries<LogMode> getEntries() {
            return $ENTRIES;
        }

        private LogMode(String str, int i, int i2) {
        }

        static {
            LogMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static LogMode valueOf(String str) {
            return (LogMode) Enum.valueOf(LogMode.class, str);
        }

        public static LogMode[] values() {
            return (LogMode[]) $VALUES.clone();
        }
    }
}
