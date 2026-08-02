package com.squareup.cash.support.chat.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PagingStatus {
    public static final /* synthetic */ PagingStatus[] $VALUES;
    public static final PagingStatus EXHAUSTED;
    public static final PagingStatus FAILED;
    public static final PagingStatus HAS_MORE;
    public static final PagingStatus LOADING;

    static {
        PagingStatus pagingStatus = new PagingStatus("EXHAUSTED", 0);
        EXHAUSTED = pagingStatus;
        PagingStatus pagingStatus2 = new PagingStatus("HAS_MORE", 1);
        HAS_MORE = pagingStatus2;
        PagingStatus pagingStatus3 = new PagingStatus("LOADING", 2);
        LOADING = pagingStatus3;
        PagingStatus pagingStatus4 = new PagingStatus("FAILED", 3);
        FAILED = pagingStatus4;
        $VALUES = new PagingStatus[]{pagingStatus, pagingStatus2, pagingStatus3, pagingStatus4};
    }

    public static PagingStatus valueOf(String str) {
        return (PagingStatus) Enum.valueOf(PagingStatus.class, str);
    }

    public static PagingStatus[] values() {
        return (PagingStatus[]) $VALUES.clone();
    }
}
