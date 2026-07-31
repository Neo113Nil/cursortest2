package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jh1;
import com.yandex.mobile.ads.impl.tn1;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wn1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f34147a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34148b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final z32 f34149c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final vn1 f34150d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedQueue<un1> f34151e;

    public wn1(@NotNull a42 taskRunner, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f34147a = 5;
        this.f34148b = timeUnit.toNanos(5L);
        this.f34149c = taskRunner.e();
        this.f34150d = new vn1(this, v82.f33556g + " ConnectionPool");
        this.f34151e = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(@NotNull C2202ra address, @NotNull tn1 call, @Nullable List<ps1> list, boolean z4) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<un1> it = this.f34151e.iterator();
        while (it.hasNext()) {
            un1 next = it.next();
            Intrinsics.checkNotNull(next);
            synchronized (next) {
                if (z4) {
                    try {
                        if (next.h()) {
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (next.a(address, list)) {
                    call.a(next);
                    return true;
                }
                Unit unit2 = Unit.f41027a;
            }
        }
        return false;
    }

    public final void b(@NotNull un1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!v82.f33555f || Thread.holdsLock(connection)) {
            this.f34151e.add(connection);
            this.f34149c.a(this.f34150d, 0L);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final long a(long j4) {
        Iterator<un1> it = this.f34151e.iterator();
        int i4 = 0;
        long j5 = Long.MIN_VALUE;
        un1 un1Var = null;
        int i5 = 0;
        while (it.hasNext()) {
            un1 next = it.next();
            Intrinsics.checkNotNull(next);
            synchronized (next) {
                if (a(next, j4) > 0) {
                    i5++;
                } else {
                    i4++;
                    long c4 = j4 - next.c();
                    if (c4 > j5) {
                        un1Var = next;
                        j5 = c4;
                    }
                    Unit unit = Unit.f41027a;
                }
            }
        }
        long j6 = this.f34148b;
        if (j5 < j6 && i4 <= this.f34147a) {
            if (i4 > 0) {
                return j6 - j5;
            }
            if (i5 > 0) {
                return j6;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(un1Var);
        synchronized (un1Var) {
            if (!un1Var.b().isEmpty()) {
                return 0L;
            }
            if (un1Var.c() + j5 != j4) {
                return 0L;
            }
            un1Var.l();
            this.f34151e.remove(un1Var);
            v82.a(un1Var.m());
            if (this.f34151e.isEmpty()) {
                this.f34149c.a();
            }
            return 0L;
        }
    }

    public final boolean a(@NotNull un1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (v82.f33555f && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.d() && this.f34147a != 0) {
            this.f34149c.a(this.f34150d, 0L);
            return false;
        }
        connection.l();
        this.f34151e.remove(connection);
        if (!this.f34151e.isEmpty()) {
            return true;
        }
        this.f34149c.a();
        return true;
    }

    private final int a(un1 un1Var, long j4) {
        if (v82.f33555f && !Thread.holdsLock(un1Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + un1Var);
        }
        ArrayList b4 = un1Var.b();
        int i4 = 0;
        while (i4 < b4.size()) {
            Reference reference = (Reference) b4.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.connection.RealCall.CallReference");
                String str = "A connection to " + un1Var.k().a().k() + " was leaked. Did you forget to close a response body?";
                int i5 = jh1.f27657c;
                jh1.a.a().a(((tn1.b) reference).a(), str);
                b4.remove(i4);
                un1Var.l();
                if (b4.isEmpty()) {
                    un1Var.a(j4 - this.f34148b);
                    return 0;
                }
            }
        }
        return b4.size();
    }
}
