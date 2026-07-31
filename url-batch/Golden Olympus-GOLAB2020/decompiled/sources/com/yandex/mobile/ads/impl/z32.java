package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a42;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z32 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a42 f35450a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35451b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35452c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private w32 f35453d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f35454e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35455f;

    public z32(@NotNull a42 taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f35450a = taskRunner;
        this.f35451b = name;
        this.f35454e = new ArrayList();
    }

    public final void a(@NotNull w32 task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f35450a) {
            if (!this.f35452c) {
                if (a(task, j4, false)) {
                    this.f35450a.a(this);
                }
                Unit unit = Unit.f41027a;
            } else if (task.a()) {
                if (a42.f23153i.isLoggable(Level.FINE)) {
                    x32.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (a42.f23153i.isLoggable(Level.FINE)) {
                    x32.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean b() {
        w32 w32Var = this.f35453d;
        if (w32Var != null) {
            Intrinsics.checkNotNull(w32Var);
            if (w32Var.a()) {
                this.f35455f = true;
            }
        }
        boolean z4 = false;
        for (int size = this.f35454e.size() - 1; -1 < size; size--) {
            if (((w32) this.f35454e.get(size)).a()) {
                w32 w32Var2 = (w32) this.f35454e.get(size);
                if (a42.f23153i.isLoggable(Level.FINE)) {
                    x32.b(w32Var2, this, "canceled");
                }
                this.f35454e.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    @Nullable
    public final w32 c() {
        return this.f35453d;
    }

    public final boolean d() {
        return this.f35455f;
    }

    @NotNull
    public final ArrayList e() {
        return this.f35454e;
    }

    @NotNull
    public final String f() {
        return this.f35451b;
    }

    public final boolean g() {
        return this.f35452c;
    }

    @NotNull
    public final a42 h() {
        return this.f35450a;
    }

    public final void i() {
        this.f35455f = false;
    }

    public final void j() {
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f35450a) {
            try {
                this.f35452c = true;
                if (b()) {
                    this.f35450a.a(this);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final String toString() {
        return this.f35451b;
    }

    public final boolean a(@NotNull w32 task, long j4, boolean z4) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.a(this);
        long a4 = this.f35450a.d().a();
        long j5 = a4 + j4;
        int indexOf = this.f35454e.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j5) {
                a42 a42Var = a42.f23152h;
                if (a42.b.a().isLoggable(Level.FINE)) {
                    x32.b(task, this, "already scheduled");
                }
                return false;
            }
            this.f35454e.remove(indexOf);
        }
        task.a(j5);
        a42 a42Var2 = a42.f23152h;
        if (a42.b.a().isLoggable(Level.FINE)) {
            if (z4) {
                str = "run again after " + x32.a(j5 - a4);
            } else {
                str = "scheduled after " + x32.a(j5 - a4);
            }
            x32.b(task, this, str);
        }
        ArrayList arrayList = this.f35454e;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i4 = -1;
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (((w32) obj).c() - a4 > j4) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            i4 = this.f35454e.size();
        }
        this.f35454e.add(i4, task);
        return i4 == 0;
    }

    public final void a(@Nullable w32 w32Var) {
        this.f35453d = w32Var;
    }

    public final void a() {
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f35450a) {
            try {
                if (b()) {
                    this.f35450a.a(this);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
