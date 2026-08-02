package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7162a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0451e f7163b;

    public C0426d(C0451e c0451e) {
        this.f7163b = c0451e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f7162a.get()) {
            this.f7163b.f7207e.set(false);
            C0451e c0451e = this.f7163b;
            c0451e.f7205c.postAtFrontOfQueue(c0451e.f);
            int i3 = this.f7163b.f7204b.get();
            while (i3 > 0) {
                try {
                    Thread.sleep(C0451e.f7201g);
                    if (this.f7163b.f7207e.get()) {
                        break;
                    } else {
                        i3--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i3 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f7163b.f7203a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0400c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f7163b.f7207e.get()) {
                Thread.sleep(C0451e.f7201g);
            }
        }
    }
}
