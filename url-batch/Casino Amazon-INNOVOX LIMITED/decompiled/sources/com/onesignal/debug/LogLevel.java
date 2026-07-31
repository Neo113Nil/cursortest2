package com.onesignal.debug;

import com.onesignal.core.BuildConfig;
import io.opentelemetry.semconv.OtelAttributes;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/onesignal/debug/LogLevel;", "", "(Ljava/lang/String;I)V", "NONE", "FATAL", OtelAttributes.OtelStatusCodeValues.ERROR, "WARN", "INFO", "DEBUG", "VERBOSE", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LogLevel NONE = new LogLevel("NONE", 0);
    public static final LogLevel FATAL = new LogLevel("FATAL", 1);
    public static final LogLevel ERROR = new LogLevel(OtelAttributes.OtelStatusCodeValues.ERROR, 2);
    public static final LogLevel WARN = new LogLevel("WARN", 3);
    public static final LogLevel INFO = new LogLevel("INFO", 4);
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 5);
    public static final LogLevel VERBOSE = new LogLevel("VERBOSE", 6);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{NONE, FATAL, ERROR, WARN, INFO, DEBUG, VERBOSE};
    }

    @JvmStatic
    public static final LogLevel fromInt(int i) {
        return INSTANCE.fromInt(i);
    }

    @JvmStatic
    public static final LogLevel fromString(String str) {
        return INSTANCE.fromString(str);
    }

    public static EnumEntries<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    private LogLevel(String str, int i) {
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: LogLevel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/onesignal/debug/LogLevel$Companion;", "", "()V", "fromInt", "Lcom/onesignal/debug/LogLevel;", "value", "", "fromString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LogLevel fromInt(int value) {
            return LogLevel.values()[value];
        }

        @JvmStatic
        public final LogLevel fromString(String value) {
            if (value == null) {
                return null;
            }
            try {
                String upperCase = value.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return LogLevel.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
