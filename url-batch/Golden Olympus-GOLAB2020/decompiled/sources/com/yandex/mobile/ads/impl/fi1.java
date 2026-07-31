package com.yandex.mobile.ads.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class fi1 {

    /* renamed from: a, reason: collision with root package name */
    private final b f25801a;

    /* renamed from: b, reason: collision with root package name */
    private final a f25802b;

    /* renamed from: c, reason: collision with root package name */
    private final wo f25803c;

    /* renamed from: d, reason: collision with root package name */
    private int f25804d;

    /* renamed from: e, reason: collision with root package name */
    private Object f25805e;

    /* renamed from: f, reason: collision with root package name */
    private Looper f25806f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25807g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25808h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25809i;

    public interface a {
    }

    public interface b {
        void a(int i4, Object obj);
    }

    public fi1(a aVar, b bVar, x42 x42Var, int i4, wo woVar, Looper looper) {
        this.f25802b = aVar;
        this.f25801a = bVar;
        this.f25806f = looper;
        this.f25803c = woVar;
    }

    public final synchronized void a(long j4) {
        boolean z4;
        if (!this.f25807g) {
            throw new IllegalStateException();
        }
        if (this.f25806f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        long b4 = this.f25803c.b() + j4;
        while (true) {
            z4 = this.f25809i;
            if (z4 || j4 <= 0) {
                break;
            }
            this.f25803c.getClass();
            wait(j4);
            j4 = b4 - this.f25803c.b();
        }
        if (!z4) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final Object b() {
        return this.f25805e;
    }

    public final b c() {
        return this.f25801a;
    }

    public final int d() {
        return this.f25804d;
    }

    public final fi1 e() {
        if (this.f25807g) {
            throw new IllegalStateException();
        }
        this.f25807g = true;
        ((j60) this.f25802b).c(this);
        return this;
    }

    public final Looper a() {
        return this.f25806f;
    }

    public final synchronized void a(boolean z4) {
        this.f25808h = z4 | this.f25808h;
        this.f25809i = true;
        notifyAll();
    }

    public final fi1 a(Object obj) {
        if (!this.f25807g) {
            this.f25805e = obj;
            return this;
        }
        throw new IllegalStateException();
    }

    public final fi1 a(int i4) {
        if (!this.f25807g) {
            this.f25804d = i4;
            return this;
        }
        throw new IllegalStateException();
    }
}
