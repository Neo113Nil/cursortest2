package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2557d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f38807a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2583e f38808b;

    public C2557d(C2583e c2583e) {
        this.f38808b = c2583e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f38807a.get()) {
            this.f38808b.f38894e.set(false);
            C2583e c2583e = this.f38808b;
            c2583e.f38892c.postAtFrontOfQueue(c2583e.f38895f);
            int i4 = this.f38808b.f38891b.get();
            while (i4 > 0) {
                try {
                    Thread.sleep(C2583e.f38888g);
                    if (this.f38808b.f38894e.get()) {
                        break;
                    } else {
                        i4--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i4 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f38808b.f38890a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2530c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f38808b.f38894e.get()) {
                Thread.sleep(C2583e.f38888g);
            }
        }
    }
}
