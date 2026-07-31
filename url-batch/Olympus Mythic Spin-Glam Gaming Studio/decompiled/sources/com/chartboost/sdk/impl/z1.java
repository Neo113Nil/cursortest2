package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class z1 implements Comparable {
    public final af b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final AtomicInteger g;
    public final AtomicReference h;
    public final AtomicInteger i;

    public z1(af afVar, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference atomicReference, AtomicInteger atomicInteger2, String str4) {
        this.b = afVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.g = atomicInteger;
        this.h = atomicReference;
        this.i = atomicInteger2;
        this.f = str4;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(z1 z1Var) {
        return this.b.b() - z1Var.b.b();
    }

    public void a(Executor executor, boolean z) {
        v1 v1Var;
        if ((this.g.decrementAndGet() == 0 || !z) && (v1Var = (v1) this.h.getAndSet(null)) != null) {
            executor.execute(new w1(v1Var, z, this.i.get()));
        }
    }
}
