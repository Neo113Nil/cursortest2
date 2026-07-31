package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class va3<OutputT> extends ca3<OutputT> {

    /* renamed from: o, reason: collision with root package name */
    private static final ra3 f13282o;

    /* renamed from: p, reason: collision with root package name */
    private static final Logger f13283p = Logger.getLogger(va3.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private volatile Set<Throwable> f13284m = null;

    /* renamed from: n, reason: collision with root package name */
    private volatile int f13285n;

    static {
        Throwable th;
        ra3 ua3Var;
        ta3 ta3Var = null;
        try {
            ua3Var = new sa3(AtomicReferenceFieldUpdater.newUpdater(va3.class, Set.class, "m"), AtomicIntegerFieldUpdater.newUpdater(va3.class, "n"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            ua3Var = new ua3(ta3Var);
        }
        f13282o = ua3Var;
        if (th != null) {
            f13283p.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    va3(int i7) {
        this.f13285n = i7;
    }

    final int F() {
        return f13282o.a(this);
    }

    final Set<Throwable> H() {
        Set<Throwable> set = this.f13284m;
        if (set != null) {
            return set;
        }
        Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        L(newSetFromMap);
        f13282o.b(this, null, newSetFromMap);
        Set<Throwable> set2 = this.f13284m;
        set2.getClass();
        return set2;
    }

    final void K() {
        this.f13284m = null;
    }

    abstract void L(Set<Throwable> set);
}
