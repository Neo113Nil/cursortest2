package com.google.maps.android;

import a6.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Status {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status OK = new Status("OK", 0);
    public static final Status ZERO_RESULTS = new Status("ZERO_RESULTS", 1);
    public static final Status NOT_FOUND = new Status("NOT_FOUND", 2);
    public static final Status REQUEST_DENIED = new Status("REQUEST_DENIED", 3);
    public static final Status OVER_QUERY_LIMIT = new Status("OVER_QUERY_LIMIT", 4);
    public static final Status INVALID_REQUEST = new Status("INVALID_REQUEST", 5);
    public static final Status UNKNOWN_ERROR = new Status("UNKNOWN_ERROR", 6);

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{OK, ZERO_RESULTS, NOT_FOUND, REQUEST_DENIED, OVER_QUERY_LIMIT, INVALID_REQUEST, UNKNOWN_ERROR};
    }

    static {
        Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.enumEntries($values);
    }

    private Status(String str, int i8) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
