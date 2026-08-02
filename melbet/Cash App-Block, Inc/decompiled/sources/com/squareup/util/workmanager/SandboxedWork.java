package com.squareup.util.workmanager;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public interface SandboxedWork {
    Object work(SandboxedCoroutineWorker sandboxedCoroutineWorker, ContinuationImpl continuationImpl);
}
