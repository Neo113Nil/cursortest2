package com.tapjoy.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;

/* loaded from: classes2.dex */
final class iy implements iu {

    /* renamed from: a, reason: collision with root package name */
    public final is f8429a = new is();

    /* renamed from: b, reason: collision with root package name */
    public final jd f8430b;

    /* renamed from: c, reason: collision with root package name */
    boolean f8431c;

    iy(jd jdVar) {
        if (jdVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f8430b = jdVar;
    }

    @Override // com.tapjoy.internal.jd
    public final long b(is isVar, long j) {
        if (isVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f8431c) {
            throw new IllegalStateException("closed");
        }
        if (this.f8429a.f8416b == 0 && this.f8430b.b(this.f8429a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f8429a.b(isVar, Math.min(j, this.f8429a.f8416b));
    }

    @Override // com.tapjoy.internal.iu
    public final boolean b() {
        if (this.f8431c) {
            throw new IllegalStateException("closed");
        }
        return this.f8429a.b() && this.f8430b.b(this.f8429a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.tapjoy.internal.iu
    public final byte c() {
        a(1L);
        return this.f8429a.c();
    }

    @Override // com.tapjoy.internal.iu
    public final iv b(long j) {
        a(j);
        return this.f8429a.b(j);
    }

    @Override // com.tapjoy.internal.iu
    public final String c(long j) {
        a(j);
        return this.f8429a.c(j);
    }

    @Override // com.tapjoy.internal.iu
    public final int e() {
        a(4L);
        return jf.a(this.f8429a.d());
    }

    @Override // com.tapjoy.internal.iu
    public final long f() {
        a(8L);
        return this.f8429a.f();
    }

    @Override // com.tapjoy.internal.iu
    public final void d(long j) {
        if (this.f8431c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f8429a.f8416b == 0 && this.f8430b.b(this.f8429a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f8429a.f8416b);
            this.f8429a.d(min);
            j -= min;
        }
    }

    @Override // com.tapjoy.internal.jd, java.lang.AutoCloseable
    public final void close() {
        if (this.f8431c) {
            return;
        }
        this.f8431c = true;
        this.f8430b.close();
        is isVar = this.f8429a;
        try {
            isVar.d(isVar.f8416b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return "buffer(" + this.f8430b + ")";
    }

    @Override // com.tapjoy.internal.iu
    public final void a(long j) {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f8431c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            if (this.f8429a.f8416b >= j) {
                z = true;
                break;
            } else if (this.f8430b.b(this.f8429a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                z = false;
                break;
            }
        }
        if (!z) {
            throw new EOFException();
        }
    }
}
