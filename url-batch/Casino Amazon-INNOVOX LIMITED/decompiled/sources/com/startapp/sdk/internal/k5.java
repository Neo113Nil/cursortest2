package com.startapp.sdk.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class k5 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f298a = new AtomicInteger();
    public final /* synthetic */ String b;

    public k5(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "startapp-" + this.b + TokenBuilder.TOKEN_DELIMITER + this.f298a.incrementAndGet());
    }
}
