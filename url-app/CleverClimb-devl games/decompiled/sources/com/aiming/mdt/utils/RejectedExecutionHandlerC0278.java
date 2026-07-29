package com.aiming.mdt.utils;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.aiming.mdt.utils.ʻʼʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RejectedExecutionHandlerC0278 implements RejectedExecutionHandler {
    RejectedExecutionHandlerC0278() {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C0282.m971("execute rejected");
    }
}
