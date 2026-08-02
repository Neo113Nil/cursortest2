package com.startapp.sdk.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class u5 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4506a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4507b;

    public u5(String str) {
        this.f4507b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "startapp-" + this.f4507b + TokenBuilder.TOKEN_DELIMITER + this.f4506a.incrementAndGet());
    }
}
