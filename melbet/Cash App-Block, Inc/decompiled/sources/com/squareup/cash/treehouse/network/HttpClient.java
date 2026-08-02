package com.squareup.cash.treehouse.network;

import app.cash.zipline.ZiplineService;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public interface HttpClient extends ZiplineService {
    Object execute(HttpRequest httpRequest, Continuation continuation);
}
