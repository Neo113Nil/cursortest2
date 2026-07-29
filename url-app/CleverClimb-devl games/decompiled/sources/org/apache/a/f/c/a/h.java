package org.apache.a.f.c.a;

import java.util.Date;
import java.util.concurrent.locks.Condition;

/* compiled from: WaitingThread.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Condition f9817a;

    /* renamed from: b, reason: collision with root package name */
    private final f f9818b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f9819c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9820d;

    public h(Condition condition, f fVar) {
        if (condition == null) {
            throw new IllegalArgumentException("Condition must not be null.");
        }
        this.f9817a = condition;
        this.f9818b = fVar;
    }

    public boolean a(Date date) throws InterruptedException {
        boolean z;
        if (this.f9819c != null) {
            throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.f9819c);
        }
        if (this.f9820d) {
            throw new InterruptedException("Operation interrupted");
        }
        this.f9819c = Thread.currentThread();
        try {
            if (date != null) {
                z = this.f9817a.awaitUntil(date);
            } else {
                this.f9817a.await();
                z = true;
            }
            if (this.f9820d) {
                throw new InterruptedException("Operation interrupted");
            }
            this.f9819c = null;
            return z;
        } catch (Throwable th) {
            this.f9819c = null;
            throw th;
        }
    }

    public void a() {
        if (this.f9819c == null) {
            throw new IllegalStateException("Nobody waiting on this object.");
        }
        this.f9817a.signalAll();
    }

    public void b() {
        this.f9820d = true;
        this.f9817a.signalAll();
    }
}
