package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wh {

    /* renamed from: a, reason: collision with root package name */
    private final rm f13822a = new rm(8);

    /* renamed from: b, reason: collision with root package name */
    private int f13823b;

    private final long b(bh bhVar) {
        int i7 = 0;
        bhVar.g(this.f13822a.f11225a, 0, 1, false);
        int i8 = this.f13822a.f11225a[0] & 255;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (i9 ^ (-1));
        bhVar.g(this.f13822a.f11225a, 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (this.f13822a.f11225a[i7] & 255) + (i11 << 8);
        }
        this.f13823b += i10 + 1;
        return i11;
    }

    public final boolean a(bh bhVar) {
        long c7 = bhVar.c();
        long j7 = 1024;
        if (c7 != -1 && c7 <= 1024) {
            j7 = c7;
        }
        int i7 = (int) j7;
        bhVar.g(this.f13822a.f11225a, 0, 4, false);
        long m7 = this.f13822a.m();
        this.f13823b = 4;
        while (m7 != 440786851) {
            int i8 = this.f13823b + 1;
            this.f13823b = i8;
            if (i8 == i7) {
                return false;
            }
            bhVar.g(this.f13822a.f11225a, 0, 1, false);
            m7 = ((m7 << 8) & (-256)) | (this.f13822a.f11225a[0] & 255);
        }
        long b7 = b(bhVar);
        long j8 = this.f13823b;
        if (b7 != Long.MIN_VALUE && (c7 == -1 || j8 + b7 < c7)) {
            while (true) {
                long j9 = this.f13823b;
                long j10 = j8 + b7;
                if (j9 < j10) {
                    if (b(bhVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b8 = b(bhVar);
                    if (b8 < 0) {
                        return false;
                    }
                    if (b8 != 0) {
                        bhVar.f((int) b8, false);
                        this.f13823b = (int) (this.f13823b + b8);
                    }
                } else if (j9 == j10) {
                    return true;
                }
            }
        }
        return false;
    }
}
