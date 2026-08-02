package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980yb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1005zb f8640a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980yb(C1005zb c1005zb, String str) {
        super(str);
        this.f8640a = c1005zb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f8640a.f8668a) {
            C1005zb.a(this.f8640a);
            this.f8640a.f8672e = true;
            this.f8640a.f8668a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f8640a.f8669b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f8640a.f8669b);
                this.f8640a.f8669b.clear();
            }
            if (hashMap.size() > 0) {
                C1005zb.a(this.f8640a, hashMap);
                hashMap.clear();
            }
        }
    }
}
