package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11636a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0573e f11637b;

    public C0548d(C0573e c0573e) {
        this.f11637b = c0573e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f11636a.get()) {
            this.f11637b.f11717e.set(false);
            C0573e c0573e = this.f11637b;
            c0573e.f11715c.postAtFrontOfQueue(c0573e.f11718f);
            int i4 = this.f11637b.f11714b.get();
            while (i4 > 0) {
                try {
                    Thread.sleep(C0573e.f11711g);
                    if (this.f11637b.f11717e.get()) {
                        break;
                    } else {
                        i4--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i4 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f11637b.f11713a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0522c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f11637b.f11717e.get()) {
                Thread.sleep(C0573e.f11711g);
            }
        }
    }
}
