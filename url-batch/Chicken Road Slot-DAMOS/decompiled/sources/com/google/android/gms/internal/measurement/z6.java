package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z6 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f3043a = Executors.defaultThreadFactory();

    public z6(d7 d7Var) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3043a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
