package com.squareup.cash.support.backend.real;

import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionMapper;
import com.squareup.protos.franklin.ui.PaymentHistoryData;

/* loaded from: classes.dex */
public final class RealSupportTransactionMapper implements SupportTransactionMapper {
    public final ErrorReporter errorReporter;

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentHistoryData.AmountTreatment.values().length];
            try {
                iArr[PaymentHistoryData.AmountTreatment.FADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentHistoryData.AmountTreatment.STRIKETHROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentHistoryData.AmountTreatment.STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealSupportTransactionMapper(ErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }
}
