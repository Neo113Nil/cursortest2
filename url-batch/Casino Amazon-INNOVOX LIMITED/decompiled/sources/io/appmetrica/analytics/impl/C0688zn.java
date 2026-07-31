package io.appmetrica.analytics.impl;

import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.zn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0688zn implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f1603a = new CopyOnWriteArrayList();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Iterator it = this.f1603a.iterator();
        while (it.hasNext()) {
            ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
        }
    }
}
