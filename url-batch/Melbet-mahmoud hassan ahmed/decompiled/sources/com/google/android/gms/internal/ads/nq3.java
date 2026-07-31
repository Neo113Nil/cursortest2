package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class nq3 extends InputStream {

    /* renamed from: f, reason: collision with root package name */
    private Iterator<ByteBuffer> f9219f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f9220g;

    /* renamed from: h, reason: collision with root package name */
    private int f9221h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f9222i;

    /* renamed from: j, reason: collision with root package name */
    private int f9223j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9224k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f9225l;

    /* renamed from: m, reason: collision with root package name */
    private int f9226m;

    /* renamed from: n, reason: collision with root package name */
    private long f9227n;

    nq3(Iterable<ByteBuffer> iterable) {
        this.f9219f = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f9221h++;
        }
        this.f9222i = -1;
        if (f()) {
            return;
        }
        this.f9220g = kq3.f7589e;
        this.f9222i = 0;
        this.f9223j = 0;
        this.f9227n = 0L;
    }

    private final void b(int i7) {
        int i8 = this.f9223j + i7;
        this.f9223j = i8;
        if (i8 == this.f9220g.limit()) {
            f();
        }
    }

    private final boolean f() {
        this.f9222i++;
        if (!this.f9219f.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f9219f.next();
        this.f9220g = next;
        this.f9223j = next.position();
        if (this.f9220g.hasArray()) {
            this.f9224k = true;
            this.f9225l = this.f9220g.array();
            this.f9226m = this.f9220g.arrayOffset();
        } else {
            this.f9224k = false;
            this.f9227n = gt3.m(this.f9220g);
            this.f9225l = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte i7;
        if (this.f9222i == this.f9221h) {
            return -1;
        }
        if (this.f9224k) {
            i7 = this.f9225l[this.f9223j + this.f9226m];
        } else {
            i7 = gt3.i(this.f9223j + this.f9227n);
        }
        b(1);
        return i7 & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        if (this.f9222i == this.f9221h) {
            return -1;
        }
        int limit = this.f9220g.limit();
        int i9 = this.f9223j;
        int i10 = limit - i9;
        if (i8 > i10) {
            i8 = i10;
        }
        if (this.f9224k) {
            System.arraycopy(this.f9225l, i9 + this.f9226m, bArr, i7, i8);
        } else {
            int position = this.f9220g.position();
            this.f9220g.get(bArr, i7, i8);
        }
        b(i8);
        return i8;
    }
}
