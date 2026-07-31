package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class so0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f11895a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f11896b;

    so0(String str) {
        this.f11896b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f11896b;
        int andIncrement = this.f11895a.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
