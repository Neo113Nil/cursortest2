package com.squareup.cash.timestampformatter.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TimestampFormatter$DisplayContext {
    public static final /* synthetic */ TimestampFormatter$DisplayContext[] $VALUES;
    public static final TimestampFormatter$DisplayContext IN_PHRASE;
    public static final TimestampFormatter$DisplayContext STANDALONE;

    static {
        TimestampFormatter$DisplayContext timestampFormatter$DisplayContext = new TimestampFormatter$DisplayContext("STANDALONE", 0);
        STANDALONE = timestampFormatter$DisplayContext;
        TimestampFormatter$DisplayContext timestampFormatter$DisplayContext2 = new TimestampFormatter$DisplayContext("IN_PHRASE", 1);
        IN_PHRASE = timestampFormatter$DisplayContext2;
        $VALUES = new TimestampFormatter$DisplayContext[]{timestampFormatter$DisplayContext, timestampFormatter$DisplayContext2};
    }

    public static TimestampFormatter$DisplayContext valueOf(String str) {
        return (TimestampFormatter$DisplayContext) Enum.valueOf(TimestampFormatter$DisplayContext.class, str);
    }

    public static TimestampFormatter$DisplayContext[] values() {
        return (TimestampFormatter$DisplayContext[]) $VALUES.clone();
    }
}
