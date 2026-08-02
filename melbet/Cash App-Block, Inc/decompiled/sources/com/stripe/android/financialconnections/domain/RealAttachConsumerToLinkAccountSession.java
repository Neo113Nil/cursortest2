package com.stripe.android.financialconnections.domain;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.JsonUtilsKt;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class RealAttachConsumerToLinkAccountSession {
    public final FinancialConnectionsSheetConfiguration configuration;
    public final FinancialConnectionsConsumerSessionRepositoryImpl consumerRepository;

    public RealAttachConsumerToLinkAccountSession(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl) {
        financialConnectionsSheetConfiguration.getClass();
        financialConnectionsConsumerSessionRepositoryImpl.getClass();
        this.configuration = financialConnectionsSheetConfiguration;
        this.consumerRepository = financialConnectionsConsumerSessionRepositoryImpl;
    }

    public final Object invoke(String str, ContinuationImpl continuationImpl) {
        String str2 = this.configuration.financialConnectionsSessionClientSecret;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl = this.consumerRepository;
        ConsumersApiServiceImpl consumersApiServiceImpl = financialConnectionsConsumerSessionRepositoryImpl.consumersApiService;
        String str3 = financialConnectionsConsumerSessionRepositoryImpl.requestSurface;
        Object executeRequestWithModelJsonParser = JsonUtilsKt.executeRequestWithModelJsonParser(consumersApiServiceImpl.stripeNetworkClient, consumersApiServiceImpl.stripeErrorJsonParser, ApiRequest.Factory.createPost$default(consumersApiServiceImpl.apiRequestFactory, "https://api.stripe.com/v1/consumers/attach_link_consumer_to_link_account_session", financialConnectionsConsumerSessionRepositoryImpl.provideApiRequestOptions.invoke(false), MapsKt__MapsKt.mapOf(new Pair("request_surface", str3), new Pair("credentials", Thread$State$EnumUnboxingLocalUtility.m("consumer_session_client_secret", str)), new Pair("link_account_session", str2))), SetupIntentJsonParser.INSTANCE, continuationImpl);
        return executeRequestWithModelJsonParser == CoroutineSingletons.COROUTINE_SUSPENDED ? executeRequestWithModelJsonParser : Unit.INSTANCE;
    }
}
