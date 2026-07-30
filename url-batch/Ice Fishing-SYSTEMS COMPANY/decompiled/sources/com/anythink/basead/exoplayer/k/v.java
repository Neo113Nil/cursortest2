package com.anythink.basead.exoplayer.k;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8666a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f8667b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f8668c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i, int i4) {
            super("Priority too low [priority=" + i + ", highest=" + i4 + "]");
        }
    }

    public final void a() {
        synchronized (this.f8666a) {
            this.f8667b.add(0);
            this.f8668c = Math.max(this.f8668c, 0);
        }
    }

    public final void b() {
        synchronized (this.f8666a) {
            while (this.f8668c != 0) {
                try {
                    this.f8666a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c() {
        synchronized (this.f8666a) {
            this.f8667b.remove(0);
            this.f8668c = this.f8667b.isEmpty() ? Integer.MIN_VALUE : this.f8667b.peek().intValue();
            this.f8666a.notifyAll();
        }
    }

    private boolean b(int i) {
        boolean z8;
        synchronized (this.f8666a) {
            z8 = this.f8668c == i;
        }
        return z8;
    }

    public final void a(int i) {
        synchronized (this.f8666a) {
            try {
                if (this.f8668c != i) {
                    throw new a(i, this.f8668c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
