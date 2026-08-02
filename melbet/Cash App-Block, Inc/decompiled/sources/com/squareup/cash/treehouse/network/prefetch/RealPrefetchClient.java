package com.squareup.cash.treehouse.network.prefetch;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Deferred;

/* loaded from: classes7.dex */
public final class RealPrefetchClient implements PrefetchClient {
    public LinkedHashMap httpResponses;

    @Override // com.squareup.cash.treehouse.network.prefetch.PrefetchClient
    public final Object awaitResponse(String str, Continuation continuation) {
        Deferred deferred = (Deferred) this.httpResponses.remove(str);
        if (deferred != null) {
            return deferred.await(continuation);
        }
        a$$ExternalSyntheticBUOutline0.m$1("No prefetched HTTP call ", str, ": already awaited?");
        return null;
    }
}
