package org.apache.a.f.c.a;

import java.util.concurrent.TimeUnit;
import org.apache.a.c.o;

/* compiled from: BasicPoolEntry.java */
/* loaded from: classes2.dex */
public class b extends org.apache.a.f.c.b {
    private final long f;
    private long g;
    private long h;
    private long i;

    public b(org.apache.a.c.d dVar, org.apache.a.c.b.b bVar, long j, TimeUnit timeUnit) {
        super(dVar, bVar);
        if (bVar == null) {
            throw new IllegalArgumentException("HTTP route may not be null");
        }
        this.f = System.currentTimeMillis();
        if (j > 0) {
            this.h = this.f + timeUnit.toMillis(j);
        } else {
            this.h = Long.MAX_VALUE;
        }
        this.i = this.h;
    }

    protected final o c() {
        return this.f9824b;
    }

    protected final org.apache.a.c.b.b d() {
        return this.f9825c;
    }

    @Override // org.apache.a.f.c.b
    protected void b() {
        super.b();
    }

    public void a(long j, TimeUnit timeUnit) {
        this.g = System.currentTimeMillis();
        this.i = Math.min(this.h, j > 0 ? this.g + timeUnit.toMillis(j) : Long.MAX_VALUE);
    }

    public boolean a(long j) {
        return j >= this.i;
    }
}
