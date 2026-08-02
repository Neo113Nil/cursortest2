package com.squareup.protos.cash.local.client.app.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhi;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens extends zzhi {
    public final ReportMarketingMessageViewedRequest.MarketingMessageTokenList value;

    public ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens(ReportMarketingMessageViewedRequest.MarketingMessageTokenList marketingMessageTokenList) {
        marketingMessageTokenList.getClass();
        this.value = marketingMessageTokenList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) && Intrinsics.areEqual(this.value, ((ReportMarketingMessageViewedRequest$ViewedTarget$MarketingMessageTokens) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MarketingMessageTokens(value=" + this.value + ")";
    }
}
