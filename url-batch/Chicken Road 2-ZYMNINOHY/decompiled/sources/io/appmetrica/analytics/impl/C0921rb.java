package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921rb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0947sb f12656a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0921rb(C0947sb c0947sb, String str) {
        super(str);
        this.f12656a = c0947sb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f12656a.f12725a) {
            C0947sb.a(this.f12656a);
            this.f12656a.f12729e = true;
            this.f12656a.f12725a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f12656a.f12726b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f12656a.f12726b);
                this.f12656a.f12726b.clear();
            }
            if (hashMap.size() > 0) {
                C0947sb.a(this.f12656a, hashMap);
                hashMap.clear();
            }
        }
    }
}
