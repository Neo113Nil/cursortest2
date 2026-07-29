package com.aiming.mdt.a;

import com.aiming.mdt.utils.C0282;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.aiming.mdt.a.ʻʼˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RejectedExecutionHandlerC0062 implements RejectedExecutionHandler {
    RejectedExecutionHandlerC0062() {
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C0282.m973("ReqExecutor", "execute rejected");
    }
}
