package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ud4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f12757a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12758b;

    /* renamed from: c, reason: collision with root package name */
    private int f12759c;

    /* renamed from: d, reason: collision with root package name */
    private int f12760d;

    public ud4(byte[] bArr) {
        this.f12757a = bArr;
        this.f12758b = bArr.length;
    }

    public final int a() {
        return (this.f12759c * 8) + this.f12760d;
    }

    public final int b(int i7) {
        int i8 = this.f12759c;
        int min = Math.min(i7, 8 - this.f12760d);
        int i9 = i8 + 1;
        int i10 = ((this.f12757a[i8] & 255) >> this.f12760d) & (255 >> (8 - min));
        while (min < i7) {
            i10 |= (this.f12757a[i9] & 255) << min;
            min += 8;
            i9++;
        }
        c(i7);
        return ((-1) >>> (32 - i7)) & i10;
    }

    public final void c(int i7) {
        int i8;
        int i9 = i7 / 8;
        int i10 = this.f12759c + i9;
        this.f12759c = i10;
        int i11 = this.f12760d + (i7 - (i9 * 8));
        this.f12760d = i11;
        if (i11 > 7) {
            i10++;
            this.f12759c = i10;
            i11 -= 8;
            this.f12760d = i11;
        }
        boolean z6 = false;
        if (i10 >= 0 && (i10 < (i8 = this.f12758b) || (i10 == i8 && i11 == 0))) {
            z6 = true;
        }
        wu1.f(z6);
    }

    public final boolean d() {
        byte b7 = this.f12757a[this.f12759c];
        int i7 = this.f12760d;
        c(1);
        return 1 == (((b7 & 255) >> i7) & 1);
    }
}
