package com.squareup.cash.work.presenters.pay;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PayHistoryListPresenter$FetchResult {
    public final Integer nextOffset;
    public final List stubs;

    public PayHistoryListPresenter$FetchResult(List list, Integer num) {
        this.stubs = list;
        this.nextOffset = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayHistoryListPresenter$FetchResult)) {
            return false;
        }
        PayHistoryListPresenter$FetchResult payHistoryListPresenter$FetchResult = (PayHistoryListPresenter$FetchResult) obj;
        return this.stubs.equals(payHistoryListPresenter$FetchResult.stubs) && Intrinsics.areEqual(this.nextOffset, payHistoryListPresenter$FetchResult.nextOffset);
    }

    public final int hashCode() {
        int hashCode = this.stubs.hashCode() * 31;
        Integer num = this.nextOffset;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FetchResult(stubs=" + this.stubs + ", nextOffset=" + this.nextOffset + ")";
    }
}
