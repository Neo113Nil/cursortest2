package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3899sL extends InputStream {

    /* renamed from: A, reason: collision with root package name */
    public int f34232A;

    /* renamed from: B, reason: collision with root package name */
    public long f34233B;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f34234n;

    /* renamed from: u, reason: collision with root package name */
    public ByteBuffer f34235u;

    /* renamed from: v, reason: collision with root package name */
    public int f34236v;

    /* renamed from: w, reason: collision with root package name */
    public int f34237w;

    /* renamed from: x, reason: collision with root package name */
    public int f34238x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f34239y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f34240z;

    public final boolean b() {
        ByteBuffer byteBuffer;
        do {
            this.f34237w++;
            Iterator it = this.f34234n;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f34235u = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f34238x = this.f34235u.position();
        if (this.f34235u.hasArray()) {
            this.f34239y = true;
            this.f34240z = this.f34235u.array();
            this.f34232A = this.f34235u.arrayOffset();
            return true;
        }
        this.f34239y = false;
        this.f34233B = AbstractC3036cM.m(this.f34235u);
        this.f34240z = null;
        return true;
    }

    public final void g(int i) {
        int i4 = this.f34238x + i;
        this.f34238x = i4;
        if (i4 == this.f34235u.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f34237w == this.f34236v) {
            return -1;
        }
        if (this.f34239y) {
            int i = this.f34240z[this.f34238x + this.f34232A] & 255;
            g(1);
            return i;
        }
        int l12 = AbstractC3036cM.f29698c.l1(this.f34238x + this.f34233B) & 255;
        g(1);
        return l12;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        if (this.f34237w == this.f34236v) {
            return -1;
        }
        int limit = this.f34235u.limit();
        int i9 = this.f34238x;
        int i10 = limit - i9;
        if (i4 > i10) {
            i4 = i10;
        }
        if (this.f34239y) {
            System.arraycopy(this.f34240z, i9 + this.f34232A, bArr, i, i4);
            g(i4);
            return i4;
        }
        int position = this.f34235u.position();
        this.f34235u.position(this.f34238x);
        this.f34235u.get(bArr, i, i4);
        this.f34235u.position(position);
        g(i4);
        return i4;
    }
}
