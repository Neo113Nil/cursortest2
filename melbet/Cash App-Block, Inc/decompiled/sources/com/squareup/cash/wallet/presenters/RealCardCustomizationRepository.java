package com.squareup.cash.wallet.presenters;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import dev.zacsweers.metro.Provider;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes.dex */
public final class RealCardCustomizationRepository {
    public final Provider authenticatedOkHttpClient;
    public final StoryQueries cardCustomizationQueries;
    public final String endpoint;
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioDispatcher;
    public final SyncValueReader syncValueReader;

    public RealCardCustomizationRepository(CashAccountDatabaseImpl cashAccountDatabaseImpl, String str, Provider provider, CoroutineContext coroutineContext, ErrorReporter errorReporter, SyncValueReader syncValueReader) {
        provider.getClass();
        this.endpoint = str;
        this.authenticatedOkHttpClient = provider;
        this.ioDispatcher = coroutineContext;
        this.errorReporter = errorReporter;
        this.syncValueReader = syncValueReader;
        this.cardCustomizationQueries = cashAccountDatabaseImpl.cardCustomizationQueries;
    }

    public final FinishSetupTileBadgeCounter getCustomizationFor(String str) {
        str.getClass();
        Continuation continuation = null;
        return new FinishSetupTileBadgeCounter(21, FlowKt.flowOn(new SafeFlow(new TakeUntil$collectSafely$2(this, str, continuation, 3)), this.ioDispatcher), new RealPasscodeProvider$getPasscode$1(this, continuation, 13));
    }

    public final ChannelFlowTransformLatest getCustomizationImage() {
        return FlowKt.transformLatest(this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardTabScheme, new CardScheme(EmptyList.INSTANCE), new Matcher$$ExternalSyntheticLambda9(13)), new RealPasscodeProvider$getPasscode$1((Continuation) null, this, 14));
    }
}
