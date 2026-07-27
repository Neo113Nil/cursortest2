package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f8019a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0602e f8020b;

    public C0577d(C0602e c0602e) {
        this.f8020b = c0602e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f8019a.get()) {
            this.f8020b.f8065e.set(false);
            C0602e c0602e = this.f8020b;
            c0602e.f8063c.postAtFrontOfQueue(c0602e.f8066f);
            int i2 = this.f8020b.f8062b.get();
            while (i2 > 0) {
                try {
                    Thread.sleep(C0602e.f8059g);
                    if (this.f8020b.f8065e.get()) {
                        break;
                    } else {
                        i2--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i2 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f8020b.f8061a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0551c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f8020b.f8065e.get()) {
                try {
                    Thread.sleep(C0602e.f8059g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
