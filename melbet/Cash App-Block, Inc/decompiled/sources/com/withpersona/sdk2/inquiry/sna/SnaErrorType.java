package com.withpersona.sdk2.inquiry.sna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class SnaErrorType {
    public static final /* synthetic */ SnaErrorType[] $VALUES = {new SnaErrorType("IntegrationError", 0), new SnaErrorType("InvalidCheckUrlError", 1), new SnaErrorType("ParsingError", 2), new SnaErrorType("UnknownError", 3), new SnaErrorType("TimeoutError", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    SnaErrorType EF5;

    public static SnaErrorType valueOf(String str) {
        return (SnaErrorType) Enum.valueOf(SnaErrorType.class, str);
    }

    public static SnaErrorType[] values() {
        return (SnaErrorType[]) $VALUES.clone();
    }
}
