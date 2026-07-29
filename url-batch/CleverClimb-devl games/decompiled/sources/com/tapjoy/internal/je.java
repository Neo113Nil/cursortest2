package com.tapjoy.internal;

import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
public class je {

    /* renamed from: a, reason: collision with root package name */
    public static final je f8438a = new je() { // from class: com.tapjoy.internal.je.1
        @Override // com.tapjoy.internal.je
        public final void a() {
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private boolean f8439b;

    /* renamed from: c, reason: collision with root package name */
    private long f8440c;

    public void a() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f8439b && this.f8440c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
