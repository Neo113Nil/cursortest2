package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lz implements q70 {

    /* renamed from: b, reason: collision with root package name */
    private final fv f28805b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28806c;

    /* renamed from: d, reason: collision with root package name */
    private long f28807d;

    /* renamed from: f, reason: collision with root package name */
    private int f28809f;

    /* renamed from: g, reason: collision with root package name */
    private int f28810g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f28808e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f28804a = new byte[Base64Utils.IO_BUFFER_SIZE];

    static {
        k60.a("goog.exo.extractor");
    }

    public lz(iv ivVar, long j4, long j5) {
        this.f28805b = ivVar;
        this.f28807d = j4;
        this.f28806c = j5;
    }

    public final boolean a(boolean z4, int i4) {
        int i5 = this.f28809f + i4;
        byte[] bArr = this.f28808e;
        if (i5 > bArr.length) {
            int i6 = u82.f32873a;
            this.f28808e = Arrays.copyOf(this.f28808e, Math.max(65536 + i5, Math.min(bArr.length * 2, i5 + 524288)));
        }
        int i7 = this.f28810g - this.f28809f;
        while (i7 < i4) {
            boolean z5 = z4;
            int i8 = i4;
            i7 = a(this.f28808e, this.f28809f, i8, i7, z5);
            if (i7 == -1) {
                return false;
            }
            this.f28810g = this.f28809f + i7;
            i4 = i8;
            z4 = z5;
        }
        this.f28809f += i4;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final void b(int i4) {
        a(false, i4);
    }

    public final int c(byte[] bArr, int i4, int i5) {
        lz lzVar;
        int min;
        int i6 = this.f28809f + i5;
        byte[] bArr2 = this.f28808e;
        if (i6 > bArr2.length) {
            int i7 = u82.f32873a;
            this.f28808e = Arrays.copyOf(this.f28808e, Math.max(65536 + i6, Math.min(bArr2.length * 2, i6 + 524288)));
        }
        int i8 = this.f28810g;
        int i9 = this.f28809f;
        int i10 = i8 - i9;
        if (i10 == 0) {
            lzVar = this;
            min = lzVar.a(this.f28808e, i9, i5, 0, true);
            if (min == -1) {
                return -1;
            }
            lzVar.f28810g += min;
        } else {
            lzVar = this;
            min = Math.min(i5, i10);
        }
        System.arraycopy(lzVar.f28808e, lzVar.f28809f, bArr, i4, min);
        lzVar.f28809f += min;
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final long d() {
        return this.f28807d + this.f28809f;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        lz lzVar;
        int i6 = this.f28810g;
        int i7 = 0;
        if (i6 != 0) {
            int min = Math.min(i6, i5);
            System.arraycopy(this.f28808e, 0, bArr, i4, min);
            d(min);
            i7 = min;
        }
        if (i7 == 0) {
            lzVar = this;
            i7 = lzVar.a(bArr, i4, i5, 0, true);
        } else {
            lzVar = this;
        }
        if (i7 != -1) {
            lzVar.f28807d += i7;
        }
        return i7;
    }

    private void d(int i4) {
        int i5 = this.f28810g - i4;
        this.f28810g = i5;
        this.f28809f = 0;
        byte[] bArr = this.f28808e;
        byte[] bArr2 = i5 < bArr.length - 524288 ? new byte[65536 + i5] : bArr;
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        this.f28808e = bArr2;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final long b() {
        return this.f28806c;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final boolean b(byte[] bArr, int i4, int i5, boolean z4) {
        if (!a(z4, i5)) {
            return false;
        }
        System.arraycopy(this.f28808e, this.f28809f - i5, bArr, i4, i5);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final void b(byte[] bArr, int i4, int i5) {
        a(bArr, i4, i5, false);
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final long a() {
        return this.f28807d;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final void a(byte[] bArr, int i4, int i5) {
        b(bArr, i4, i5, false);
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final boolean a(byte[] bArr, int i4, int i5, boolean z4) {
        int i6;
        int i7 = this.f28810g;
        if (i7 == 0) {
            i6 = 0;
        } else {
            int min = Math.min(i7, i5);
            System.arraycopy(this.f28808e, 0, bArr, i4, min);
            d(min);
            i6 = min;
        }
        while (i6 < i5 && i6 != -1) {
            i6 = a(bArr, i4, i5, i6, z4);
        }
        if (i6 != -1) {
            this.f28807d += i6;
        }
        return i6 != -1;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final void c() {
        this.f28809f = 0;
    }

    public final int c(int i4) {
        lz lzVar;
        int min = Math.min(this.f28810g, i4);
        d(min);
        if (min == 0) {
            byte[] bArr = this.f28804a;
            lzVar = this;
            min = lzVar.a(bArr, 0, Math.min(i4, bArr.length), 0, true);
        } else {
            lzVar = this;
        }
        if (min != -1) {
            lzVar.f28807d += min;
        }
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.q70
    public final void a(int i4) {
        int min = Math.min(this.f28810g, i4);
        d(min);
        int i5 = min;
        while (i5 < i4 && i5 != -1) {
            i5 = a(this.f28804a, -i5, Math.min(i4, this.f28804a.length + i5), i5, false);
        }
        if (i5 != -1) {
            this.f28807d += i5;
        }
    }

    private int a(byte[] bArr, int i4, int i5, int i6, boolean z4) {
        if (!Thread.interrupted()) {
            int read = this.f28805b.read(bArr, i4 + i6, i5 - i6);
            if (read != -1) {
                return i6 + read;
            }
            if (i6 == 0 && z4) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
