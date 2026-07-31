package c1;

import o2.a0;
import w0.m;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f1815a = new a0(8);

    /* renamed from: b, reason: collision with root package name */
    private int f1816b;

    private long a(m mVar) {
        int i7 = 0;
        mVar.n(this.f1815a.d(), 0, 1);
        int i8 = this.f1815a.d()[0] & 255;
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
        mVar.n(this.f1815a.d(), 1, i10);
        while (i7 < i10) {
            i7++;
            i11 = (this.f1815a.d()[i7] & 255) + (i11 << 8);
        }
        this.f1816b += i10 + 1;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(m mVar) {
        long a7 = mVar.a();
        long j7 = 1024;
        if (a7 != -1 && a7 <= 1024) {
            j7 = a7;
        }
        int i7 = (int) j7;
        mVar.n(this.f1815a.d(), 0, 4);
        long E = this.f1815a.E();
        this.f1816b = 4;
        while (E != 440786851) {
            int i8 = this.f1816b + 1;
            this.f1816b = i8;
            if (i8 == i7) {
                return false;
            }
            mVar.n(this.f1815a.d(), 0, 1);
            E = ((E << 8) & (-256)) | (this.f1815a.d()[0] & 255);
        }
        long a8 = a(mVar);
        long j8 = this.f1816b;
        if (a8 == Long.MIN_VALUE) {
            return false;
        }
        if (a7 != -1 && j8 + a8 >= a7) {
            return false;
        }
        while (true) {
            int i9 = this.f1816b;
            long j9 = j8 + a8;
            if (i9 >= j9) {
                return ((long) i9) == j9;
            }
            if (a(mVar) == Long.MIN_VALUE) {
                return false;
            }
            long a9 = a(mVar);
            if (a9 < 0 || a9 > 2147483647L) {
                break;
            }
            if (a9 != 0) {
                int i10 = (int) a9;
                mVar.o(i10);
                this.f1816b += i10;
            }
        }
    }
}
