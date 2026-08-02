package com.squareup.cash.worker;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface ApplicationWorker {
    Object work(Continuation continuation);
}
