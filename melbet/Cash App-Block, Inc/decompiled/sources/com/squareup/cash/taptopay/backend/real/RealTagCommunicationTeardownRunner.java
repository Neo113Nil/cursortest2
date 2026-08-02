package com.squareup.cash.taptopay.backend.real;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class RealTagCommunicationTeardownRunner {
    public final CoroutineContext ioContext;
    public final CoroutineScope scope;
    public final ConcurrentLinkedQueue teardownInFlight = new ConcurrentLinkedQueue();

    public RealTagCommunicationTeardownRunner(CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.ioContext = coroutineContext;
        this.scope = coroutineScope;
    }
}
