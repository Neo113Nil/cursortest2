package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class aa4 {

    /* renamed from: d, reason: collision with root package name */
    public static final t94 f2701d = new t94(0, -9223372036854775807L, null);

    /* renamed from: e, reason: collision with root package name */
    public static final t94 f2702e = new t94(1, -9223372036854775807L, null);

    /* renamed from: f, reason: collision with root package name */
    public static final t94 f2703f = new t94(2, -9223372036854775807L, null);

    /* renamed from: g, reason: collision with root package name */
    public static final t94 f2704g = new t94(3, -9223372036854775807L, null);

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f2705a = n13.l("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* renamed from: b, reason: collision with root package name */
    private u94<? extends v94> f2706b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f2707c;

    public aa4(String str) {
    }

    public static t94 b(boolean z6, long j7) {
        return new t94(z6 ? 1 : 0, j7, null);
    }

    public final <T extends v94> long a(T t6, r94<T> r94Var, int i7) {
        Looper myLooper = Looper.myLooper();
        wu1.b(myLooper);
        this.f2707c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new u94(this, myLooper, t6, r94Var, i7, elapsedRealtime).c(0L);
        return elapsedRealtime;
    }

    public final void g() {
        u94<? extends v94> u94Var = this.f2706b;
        wu1.b(u94Var);
        u94Var.a(false);
    }

    public final void h() {
        this.f2707c = null;
    }

    public final void i(int i7) {
        IOException iOException = this.f2707c;
        if (iOException != null) {
            throw iOException;
        }
        u94<? extends v94> u94Var = this.f2706b;
        if (u94Var != null) {
            u94Var.b(i7);
        }
    }

    public final void j(x94 x94Var) {
        u94<? extends v94> u94Var = this.f2706b;
        if (u94Var != null) {
            u94Var.a(true);
        }
        this.f2705a.execute(new y94(x94Var));
        this.f2705a.shutdown();
    }

    public final boolean k() {
        return this.f2707c != null;
    }

    public final boolean l() {
        return this.f2706b != null;
    }
}
