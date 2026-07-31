package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ro3 extends OutputStream {

    /* renamed from: k, reason: collision with root package name */
    private static final byte[] f11304k = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    private int f11307h;

    /* renamed from: j, reason: collision with root package name */
    private int f11309j;

    /* renamed from: f, reason: collision with root package name */
    private final int f11305f = 128;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<uo3> f11306g = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private byte[] f11308i = new byte[128];

    ro3(int i7) {
    }

    private final void h(int i7) {
        this.f11306g.add(new qo3(this.f11308i));
        int length = this.f11307h + this.f11308i.length;
        this.f11307h = length;
        this.f11308i = new byte[Math.max(this.f11305f, Math.max(i7, length >>> 1))];
        this.f11309j = 0;
    }

    public final synchronized int b() {
        return this.f11307h + this.f11309j;
    }

    public final synchronized uo3 f() {
        int i7 = this.f11309j;
        byte[] bArr = this.f11308i;
        int length = bArr.length;
        if (i7 >= length) {
            this.f11306g.add(new qo3(bArr));
            this.f11308i = f11304k;
        } else if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i7));
            this.f11306g.add(new qo3(bArr2));
        }
        this.f11307h += this.f11309j;
        this.f11309j = 0;
        return uo3.I(this.f11306g);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i7) {
        if (this.f11309j == this.f11308i.length) {
            h(1);
        }
        byte[] bArr = this.f11308i;
        int i8 = this.f11309j;
        this.f11309j = i8 + 1;
        bArr[i8] = (byte) i7;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = this.f11308i;
        int length = bArr2.length;
        int i9 = this.f11309j;
        int i10 = length - i9;
        if (i8 <= i10) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f11309j += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i10);
        int i11 = i8 - i10;
        h(i11);
        System.arraycopy(bArr, i7 + i10, this.f11308i, 0, i11);
        this.f11309j = i11;
    }
}
