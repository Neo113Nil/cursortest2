package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class m6 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f8428c = n6.f8944b;

    /* renamed from: a, reason: collision with root package name */
    private final List<l6> f8429a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f8430b = false;

    m6() {
    }

    public final synchronized void a(String str, long j7) {
        if (this.f8430b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f8429a.add(new l6(str, j7, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j7;
        this.f8430b = true;
        if (this.f8429a.size() == 0) {
            j7 = 0;
        } else {
            j7 = this.f8429a.get(r1.size() - 1).f7839c - this.f8429a.get(0).f7839c;
        }
        if (j7 <= 0) {
            return;
        }
        long j8 = this.f8429a.get(0).f7839c;
        n6.a("(%-4d ms) %s", Long.valueOf(j7), str);
        for (l6 l6Var : this.f8429a) {
            long j9 = l6Var.f7839c;
            n6.a("(+%-4d) [%2d] %s", Long.valueOf(j9 - j8), Long.valueOf(l6Var.f7838b), l6Var.f7837a);
            j8 = j9;
        }
    }

    protected final void finalize() {
        if (this.f8430b) {
            return;
        }
        b("Request on the loose");
        n6.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
