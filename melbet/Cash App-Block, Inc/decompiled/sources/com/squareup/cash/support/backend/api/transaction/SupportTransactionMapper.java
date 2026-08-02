package com.squareup.cash.support.backend.api.transaction;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes.dex */
public interface SupportTransactionMapper {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/support/backend/api/transaction/SupportTransactionMapper$SupportInvalidColorFormatError", "Lcom/squareup/cash/observability/types/ReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public final class SupportInvalidColorFormatError extends ReportedError {
        public final String message;
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Support.INSTANCE);
        public final Map metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("", Thread$State$EnumUnboxingLocalUtility.m("owner_id", "#cash-support-android"));

        public SupportInvalidColorFormatError(String str) {
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

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }
}
