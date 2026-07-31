package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Mb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Nb f37974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mb(Nb nb, String str) {
        super(str);
        this.f37974a = nb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f37974a.f37999a) {
            Nb.a(this.f37974a);
            this.f37974a.f38003e = true;
            this.f37974a.f37999a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f37974a.f38000b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f37974a.f38000b);
                this.f37974a.f38000b.clear();
            }
            if (hashMap.size() > 0) {
                Nb.a(this.f37974a, hashMap);
                hashMap.clear();
            }
        }
    }
}
