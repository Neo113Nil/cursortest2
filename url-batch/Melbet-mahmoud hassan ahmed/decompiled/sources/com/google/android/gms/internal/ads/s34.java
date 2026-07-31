package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class s34 {

    /* renamed from: a, reason: collision with root package name */
    private long f11647a;

    /* renamed from: b, reason: collision with root package name */
    private long f11648b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11649c;

    s34() {
    }

    private final long d(long j7) {
        return this.f11647a + Math.max(0L, ((this.f11648b - 529) * 1000000) / j7);
    }

    public final long a(c0 c0Var) {
        return d(c0Var.f3674z);
    }

    public final long b(c0 c0Var, z51 z51Var) {
        if (this.f11648b == 0) {
            this.f11647a = z51Var.f14954e;
        }
        if (this.f11649c) {
            return z51Var.f14954e;
        }
        ByteBuffer byteBuffer = z51Var.f14952c;
        Objects.requireNonNull(byteBuffer);
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            i7 = (i7 << 8) | (byteBuffer.get(i8) & 255);
        }
        int c7 = kd4.c(i7);
        if (c7 != -1) {
            long d7 = d(c0Var.f3674z);
            this.f11648b += c7;
            return d7;
        }
        this.f11649c = true;
        this.f11648b = 0L;
        this.f11647a = z51Var.f14954e;
        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return z51Var.f14954e;
    }

    public final void c() {
        this.f11647a = 0L;
        this.f11648b = 0L;
        this.f11649c = false;
    }
}
