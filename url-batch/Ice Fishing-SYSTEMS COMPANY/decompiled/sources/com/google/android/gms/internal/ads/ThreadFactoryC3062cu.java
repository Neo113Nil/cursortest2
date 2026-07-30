package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.cu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC3062cu implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29764a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29765b;

    public /* synthetic */ ThreadFactoryC3062cu(String str) {
        this.f29764a = 0;
        this.f29765b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Object obj = this.f29765b;
        switch (this.f29764a) {
            case 0:
                String str = AbstractC3548lu.f32613a;
                return new Thread(runnable, (String) obj);
            default:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                if (newThread == null) {
                    throw new NullPointerException("Default ThreadFactory returned null thread");
                }
                newThread.setName("punch".concat(String.valueOf(newThread.getName())));
                return newThread;
        }
    }

    public /* synthetic */ ThreadFactoryC3062cu() {
        this.f29764a = 1;
        this.f29765b = Executors.defaultThreadFactory();
    }
}
