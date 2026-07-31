package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class w extends t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f13644a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f13645b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f13646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f13646c = aeVar;
        this.f13644a = taskCompletionSource2;
        this.f13645b = tVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        Object obj;
        AtomicInteger atomicInteger;
        s sVar;
        obj = this.f13646c.f13621g;
        synchronized (obj) {
            try {
                ae.o(this.f13646c, this.f13644a);
                atomicInteger = this.f13646c.f13627m;
                if (atomicInteger.getAndIncrement() > 0) {
                    sVar = this.f13646c.f13617c;
                    sVar.d("Already connected to the service.", new Object[0]);
                }
                ae.q(this.f13646c, this.f13645b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
