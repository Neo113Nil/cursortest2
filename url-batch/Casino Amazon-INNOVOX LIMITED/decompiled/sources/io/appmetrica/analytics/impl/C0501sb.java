package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0501sb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0526tb f1483a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0501sb(C0526tb c0526tb, String str) {
        super(str);
        this.f1483a = c0526tb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f1483a.f1498a) {
            C0526tb.a(this.f1483a);
            this.f1483a.e = true;
            this.f1483a.f1498a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f1483a.b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f1483a.b);
                this.f1483a.b.clear();
            }
            if (hashMap.size() > 0) {
                C0526tb.a(this.f1483a, hashMap);
                hashMap.clear();
            }
        }
    }
}
