package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes3.dex */
final class j02 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f27434a = new sf1(8);

    /* renamed from: b, reason: collision with root package name */
    private int f27435b;

    private long a(lz lzVar) {
        int i4 = 0;
        lzVar.b(this.f27434a.c(), 0, 1, false);
        int i5 = this.f27434a.c()[0] & 255;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int i6 = UserVerificationMethods.USER_VERIFY_PATTERN;
        int i7 = 0;
        while ((i5 & i6) == 0) {
            i6 >>= 1;
            i7++;
        }
        int i8 = i5 & (~i6);
        lzVar.b(this.f27434a.c(), 1, i7, false);
        while (i4 < i7) {
            i4++;
            i8 = (this.f27434a.c()[i4] & 255) + (i8 << 8);
        }
        this.f27435b = i7 + 1 + this.f27435b;
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(lz lzVar) {
        long b4 = lzVar.b();
        long j4 = 1024;
        if (b4 != -1 && b4 <= 1024) {
            j4 = b4;
        }
        int i4 = (int) j4;
        lzVar.b(this.f27434a.c(), 0, 4, false);
        long v4 = this.f27434a.v();
        this.f27435b = 4;
        while (v4 != 440786851) {
            int i5 = this.f27435b + 1;
            this.f27435b = i5;
            if (i5 == i4) {
                return false;
            }
            lzVar.b(this.f27434a.c(), 0, 1, false);
            v4 = ((v4 << 8) & (-256)) | (this.f27434a.c()[0] & 255);
        }
        long a4 = a(lzVar);
        long j5 = this.f27435b;
        if (a4 != Long.MIN_VALUE && (b4 == -1 || j5 + a4 < b4)) {
            while (true) {
                long j6 = this.f27435b;
                long j7 = j5 + a4;
                if (j6 < j7) {
                    if (a(lzVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long a5 = a(lzVar);
                    if (a5 < 0 || a5 > 2147483647L) {
                        break;
                    }
                    if (a5 != 0) {
                        int i6 = (int) a5;
                        lzVar.a(false, i6);
                        this.f27435b += i6;
                    }
                } else if (j6 == j7) {
                    return true;
                }
            }
        }
        return false;
    }
}
