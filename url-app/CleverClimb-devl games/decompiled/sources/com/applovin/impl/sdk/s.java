package com.applovin.impl.sdk;

import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private int f3368a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<com.applovin.impl.sdk.ad.j> f3369b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f3370c;

    s(int i) {
        a(i);
        this.f3369b = new LinkedList();
        this.f3370c = new Object();
    }

    int a() {
        int size;
        synchronized (this.f3370c) {
            size = this.f3369b.size();
        }
        return size;
    }

    void a(int i) {
        if (i > 25) {
            i = 25;
        }
        this.f3368a = i;
    }

    void a(com.applovin.impl.sdk.ad.j jVar) {
        synchronized (this.f3370c) {
            if (a() <= 25) {
                this.f3369b.offer(jVar);
            }
        }
    }

    int b() {
        return this.f3368a;
    }

    boolean c() {
        boolean z;
        synchronized (this.f3370c) {
            z = a() >= this.f3368a;
        }
        return z;
    }

    boolean d() {
        boolean z;
        synchronized (this.f3370c) {
            z = a() == 0;
        }
        return z;
    }

    com.applovin.impl.sdk.ad.j e() {
        com.applovin.impl.sdk.ad.j poll;
        try {
            synchronized (this.f3370c) {
                poll = !d() ? this.f3369b.poll() : null;
            }
            return poll;
        } catch (Exception unused) {
            return null;
        }
    }

    com.applovin.impl.sdk.ad.j f() {
        com.applovin.impl.sdk.ad.j peek;
        synchronized (this.f3370c) {
            peek = this.f3369b.peek();
        }
        return peek;
    }
}
