package com.moat.analytics.mobile.tjy;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
class at implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f7238a;

    at(as asVar) {
        this.f7238a = asVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "MoatStatus");
        thread.setDaemon(true);
        return thread;
    }
}
