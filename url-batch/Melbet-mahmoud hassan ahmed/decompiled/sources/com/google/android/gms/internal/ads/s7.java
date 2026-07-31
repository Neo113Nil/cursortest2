package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class s7 extends tu3 {

    /* renamed from: q, reason: collision with root package name */
    private Date f11685q;

    /* renamed from: r, reason: collision with root package name */
    private Date f11686r;

    /* renamed from: s, reason: collision with root package name */
    private long f11687s;

    /* renamed from: t, reason: collision with root package name */
    private long f11688t;

    /* renamed from: u, reason: collision with root package name */
    private double f11689u;

    /* renamed from: v, reason: collision with root package name */
    private float f11690v;

    /* renamed from: w, reason: collision with root package name */
    private dv3 f11691w;

    /* renamed from: x, reason: collision with root package name */
    private long f11692x;

    public s7() {
        super("mvhd");
        this.f11689u = 1.0d;
        this.f11690v = 1.0f;
        this.f11691w = dv3.f4346j;
    }

    @Override // com.google.android.gms.internal.ads.qu3
    public final void c(ByteBuffer byteBuffer) {
        long e7;
        g(byteBuffer);
        if (e() == 1) {
            this.f11685q = yu3.a(o7.f(byteBuffer));
            this.f11686r = yu3.a(o7.f(byteBuffer));
            this.f11687s = o7.e(byteBuffer);
            e7 = o7.f(byteBuffer);
        } else {
            this.f11685q = yu3.a(o7.e(byteBuffer));
            this.f11686r = yu3.a(o7.e(byteBuffer));
            this.f11687s = o7.e(byteBuffer);
            e7 = o7.e(byteBuffer);
        }
        this.f11688t = e7;
        this.f11689u = o7.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f11690v = ((short) ((r1[1] & 255) | ((short) ((r1[0] << 8) & 65280)))) / 256.0f;
        o7.d(byteBuffer);
        o7.e(byteBuffer);
        o7.e(byteBuffer);
        this.f11691w = new dv3(o7.b(byteBuffer), o7.b(byteBuffer), o7.b(byteBuffer), o7.b(byteBuffer), o7.a(byteBuffer), o7.a(byteBuffer), o7.a(byteBuffer), o7.b(byteBuffer), o7.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f11692x = o7.e(byteBuffer);
    }

    public final long h() {
        return this.f11688t;
    }

    public final long i() {
        return this.f11687s;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f11685q + ";modificationTime=" + this.f11686r + ";timescale=" + this.f11687s + ";duration=" + this.f11688t + ";rate=" + this.f11689u + ";volume=" + this.f11690v + ";matrix=" + this.f11691w + ";nextTrackId=" + this.f11692x + "]";
    }
}
