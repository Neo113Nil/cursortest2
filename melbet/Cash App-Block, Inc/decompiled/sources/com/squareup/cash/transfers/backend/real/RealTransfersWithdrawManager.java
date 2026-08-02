package com.squareup.cash.transfers.backend.real;

import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.cash.transfers.backend.real.WithdrawManagerError;

/* loaded from: classes7.dex */
public final class RealTransfersWithdrawManager implements TransfersWithdrawManager {
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final SyncValueReader syncValueReader;

    public RealTransfersWithdrawManager(RealP2pSettingsManager realP2pSettingsManager, SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager, ErrorReporter errorReporter) {
        this.p2pSettingsManager = realP2pSettingsManager;
        this.syncValueReader = syncValueReader;
        this.featureFlagManager = featureFlagManager;
        this.errorReporter = errorReporter;
    }

    public final void throwInvalidFeeData(String str) {
        WithdrawManagerError.InvalidCashOutFeeData invalidCashOutFeeData = new WithdrawManagerError.InvalidCashOutFeeData("CashOutFeeData is invalid: ".concat(str));
        this.errorReporter.report(invalidCashOutFeeData, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        throw invalidCashOutFeeData;
    }
}
