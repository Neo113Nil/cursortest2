package com.squareup.cash.treehouse.network.prefetch;

import app.cash.zipline.ZiplineService;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public interface PrefetchClient extends ZiplineService {
    Object awaitResponse(String str, Continuation continuation);
}
