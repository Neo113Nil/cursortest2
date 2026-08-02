package com.squareup.cash.work.presenters.shift;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/work/presenters/shift/RepositoryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RepositoryException extends Exception {
    public final String message;

    public RepositoryException(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RepositoryException) && Intrinsics.areEqual(this.message, ((RepositoryException) obj).message);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RepositoryException(message=", this.message, ")");
    }
}
