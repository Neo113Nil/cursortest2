package com.stripe.android.financialconnections.domain;

import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public final class PollAttachPaymentAccount {
    public final AttachedPaymentAccountRepository attachedPaymentAccountRepository;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final FinancialConnectionsAccountsRepositoryImpl repository;

    public PollAttachPaymentAccount(FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl, RealConsumerSessionRepository realConsumerSessionRepository, AttachedPaymentAccountRepository attachedPaymentAccountRepository, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
        financialConnectionsAccountsRepositoryImpl.getClass();
        realConsumerSessionRepository.getClass();
        attachedPaymentAccountRepository.getClass();
        financialConnectionsSheetConfiguration.getClass();
        this.repository = financialConnectionsAccountsRepositoryImpl;
        this.consumerSessionProvider = realConsumerSessionRepository;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.configuration = financialConnectionsSheetConfiguration;
    }

    public final Object invoke(SynchronizeSessionResponse synchronizeSessionResponse, FinancialConnectionsInstitution financialConnectionsInstitution, PaymentAccountParams paymentAccountParams, SuspendLambda suspendLambda) {
        Duration.Companion companion = Duration.Companion;
        return ErrorsKt.retryOnException(new PollTimingOptions(Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(1, DurationUnit.SECONDS)), 6), new RealSheetState$peek$3.AnonymousClass2(2, null, 11), new DataStoreImpl$readDataOrHandleCorruption$3(this, paymentAccountParams, financialConnectionsInstitution, synchronizeSessionResponse, null, 15), suspendLambda);
    }
}
