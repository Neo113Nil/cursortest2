package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0109d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1204a = new AtomicBoolean(true);
    public final /* synthetic */ C0134e b;

    public C0109d(C0134e c0134e) {
        this.b = c0134e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f1204a.get()) {
            this.b.e.set(false);
            C0134e c0134e = this.b;
            c0134e.c.postAtFrontOfQueue(c0134e.f);
            int i = this.b.b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C0134e.g);
                    if (this.b.e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.b.f1225a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0083c) it.next()).onAppNotResponding();
                }
            }
            while (!this.b.e.get()) {
                Thread.sleep(C0134e.g);
            }
        }
    }
}
