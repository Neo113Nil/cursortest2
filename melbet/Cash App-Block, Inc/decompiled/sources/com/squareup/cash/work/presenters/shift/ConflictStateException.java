package com.squareup.cash.work.presenters.shift;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\n\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/work/presenters/shift/ConflictStateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConflictStateException extends Exception {
    public static final ConflictStateException INSTANCE = new ConflictStateException();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ConflictStateException);
    }

    public final int hashCode() {
        return -1028077548;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ConflictStateException";
    }
}
