package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class j implements Comparable<j> {

    /* renamed from: a, reason: collision with root package name */
    final int f3840a;

    /* renamed from: b, reason: collision with root package name */
    final String f3841b;

    /* renamed from: c, reason: collision with root package name */
    final String f3842c;

    /* renamed from: d, reason: collision with root package name */
    final String f3843d;
    final AtomicInteger e;
    final AtomicInteger f;
    private final com.chartboost.sdk.Libraries.i g;
    private final AtomicReference<h> h;
    private final long i;

    j(com.chartboost.sdk.Libraries.i iVar, int i, String str, String str2, String str3, AtomicInteger atomicInteger, AtomicReference<h> atomicReference, long j, AtomicInteger atomicInteger2) {
        this.g = iVar;
        this.f3840a = i;
        this.f3841b = str;
        this.f3842c = str2;
        this.f3843d = str3;
        this.e = atomicInteger;
        this.h = atomicReference;
        this.i = j;
        this.f = atomicInteger2;
        atomicInteger.incrementAndGet();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        return this.f3840a - jVar.f3840a;
    }

    void a(Executor executor, boolean z) {
        h andSet;
        if ((this.e.decrementAndGet() == 0 || !z) && (andSet = this.h.getAndSet(null)) != null) {
            executor.execute(new i(andSet, z, (int) TimeUnit.NANOSECONDS.toMillis(this.g.b() - this.i), this.f.get()));
        }
    }
}
