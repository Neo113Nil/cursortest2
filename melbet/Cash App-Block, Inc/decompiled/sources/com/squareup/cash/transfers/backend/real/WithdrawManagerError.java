package com.squareup.cash.transfers.backend.real;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/cash/transfers/backend/real/WithdrawManagerError;", "Lcom/squareup/cash/observability/types/ReportedError;", "NullCashOutFeeData", "InvalidCashOutFeeData", "Lcom/squareup/cash/transfers/backend/real/WithdrawManagerError$InvalidCashOutFeeData;", "Lcom/squareup/cash/transfers/backend/real/WithdrawManagerError$NullCashOutFeeData;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class WithdrawManagerError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Transfers.INSTANCE);
    public final String message;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/transfers/backend/real/WithdrawManagerError$InvalidCashOutFeeData;", "Lcom/squareup/cash/transfers/backend/real/WithdrawManagerError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvalidCashOutFeeData extends WithdrawManagerError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/transfers/backend/real/WithdrawManagerError$NullCashOutFeeData;", "Lcom/squareup/cash/transfers/backend/real/WithdrawManagerError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NullCashOutFeeData extends WithdrawManagerError {
        public static final NullCashOutFeeData INSTANCE = new NullCashOutFeeData("CashOutFeeData sync value is null when experiment is enabled");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NullCashOutFeeData);
        }

        public final int hashCode() {
            return 883154983;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NullCashOutFeeData";
        }
    }

    public WithdrawManagerError(String str) {
        this.message = str;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
