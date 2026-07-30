package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public class IN extends AbstractC3551lx {

    /* renamed from: c, reason: collision with root package name */
    public TP f25550c;

    /* renamed from: d, reason: collision with root package name */
    public final FN f25551d = new FN();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f25552e;

    /* renamed from: f, reason: collision with root package name */
    public long f25553f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f25554g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25555h;

    static {
        A2.a("media3.decoder");
    }

    public IN(int i) {
        this.f25555h = i;
    }

    public void i() {
        this.f32624b = 0;
        ByteBuffer byteBuffer = this.f25552e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f25554g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final void j(int i) {
        ByteBuffer byteBuffer = this.f25552e;
        if (byteBuffer == null) {
            this.f25552e = m(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i + position;
        if (capacity >= i4) {
            this.f25552e = byteBuffer;
            return;
        }
        ByteBuffer m8 = m(i4);
        m8.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m8.put(byteBuffer);
        }
        this.f25552e = m8;
    }

    public final boolean k() {
        return h(1073741824);
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f25552e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f25554g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer m(int i) {
        int i4 = this.f25555h;
        if (i4 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i4 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f25552e;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(String.valueOf(capacity).length() + 21 + String.valueOf(i).length() + 1);
        AbstractC5051n.i(sb, "Buffer too small (", capacity, " < ", i);
        sb.append(")");
        throw new HN(sb.toString());
    }
}
