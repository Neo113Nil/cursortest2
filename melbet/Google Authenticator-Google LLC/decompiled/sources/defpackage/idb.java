package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idb {
    public Context a;
    public URI b;
    public Executor c;
    public Executor d;
    public Executor e;
    public ScheduledExecutorService f;
    public String g;
    public hac h;
    public icv i;
    public Integer j;
    public Integer k;
    public long l;
    public int m;
    public long n;
    public long o;
    public ifv p;
    public byte q;
    public iwp r;

    public final void a(long j) {
        this.n = j;
        this.q = (byte) (this.q | 4);
    }

    public final void b(long j) {
        this.o = j;
        this.q = (byte) (this.q | 8);
    }

    public final void c(int i) {
        this.m = i;
        this.q = (byte) (this.q | 2);
    }

    public final void d(hac hacVar) {
        if (hacVar == null) {
            throw new NullPointerException("Null recordNetworkMetricsToPrimes");
        }
        this.h = hacVar;
    }

    public final void e(ifv ifvVar) {
        if (ifvVar == null) {
            throw new NullPointerException("Null streamzWrapper");
        }
        this.p = ifvVar;
    }
}
