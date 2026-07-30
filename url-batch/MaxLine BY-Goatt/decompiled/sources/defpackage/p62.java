package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p62 implements pq {
    public final pn2 m;
    public final fq n;
    public boolean o;

    public p62(pn2 pn2Var) {
        pn2Var.getClass();
        this.m = pn2Var;
        this.n = new fq();
    }

    @Override // defpackage.pq
    public final void F(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r0 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.pq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long K() {
        fq fqVar;
        F(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean request = request(i2);
            fqVar = this.n;
            if (!request) {
                break;
            }
            byte n = fqVar.n(i);
            if ((n < 48 || n > 57) && ((n < 97 || n > 102) && (n < 65 || n > 70))) {
                break;
            }
            i = i2;
        }
        return fqVar.K();
    }

    public final boolean b() {
        if (this.o) {
            lh.g("closed");
            return false;
        }
        fq fqVar = this.n;
        return fqVar.m() && this.m.h(8192L, fqVar) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.m.close();
        fq fqVar = this.n;
        fqVar.skip(fqVar.n);
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return this.m.e();
    }

    public final long f(byte b, long j, long j2) {
        if (this.o) {
            lh.g("closed");
            return 0L;
        }
        if (0 > j2) {
            lh.c(q40.i(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long j3 = 0;
        while (j3 < j2) {
            fq fqVar = this.n;
            byte b2 = b;
            long j4 = j2;
            long o = fqVar.o(b2, j3, j4);
            if (o == -1) {
                long j5 = fqVar.n;
                if (j5 >= j4 || this.m.h(8192L, fqVar) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return o;
            }
        }
        return -1L;
    }

    @Override // defpackage.pn2
    public final long h(long j, fq fqVar) {
        fqVar.getClass();
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.o) {
            lh.g("closed");
            return 0L;
        }
        fq fqVar2 = this.n;
        if (fqVar2.n == 0 && this.m.h(8192L, fqVar2) == -1) {
            return -1L;
        }
        return fqVar2.h(Math.min(j, fqVar2.n), fqVar);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.o;
    }

    @Override // defpackage.pq
    public final dr k(long j) {
        F(j);
        return this.n.k(j);
    }

    public final int m() {
        F(4L);
        int readInt = this.n.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final long n() {
        char c;
        char c2;
        long j;
        F(8L);
        fq fqVar = this.n;
        if (fqVar.n < 8) {
            throw new EOFException();
        }
        ug2 ug2Var = fqVar.m;
        ug2Var.getClass();
        int i = ug2Var.b;
        int i2 = ug2Var.c;
        if (i2 - i < 8) {
            j = ((fqVar.readInt() & 4294967295L) << 32) | (4294967295L & fqVar.readInt());
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = ug2Var.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j2 = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (bArr[i3] & 255);
            fqVar.n -= 8;
            if (i4 == i2) {
                fqVar.m = ug2Var.a();
                xg2.a(ug2Var);
            } else {
                ug2Var.b = i4;
            }
            j = j3;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    public final short o() {
        F(2L);
        return this.n.v();
    }

    public final String p(long j) {
        F(j);
        return this.n.y(j, yt.b);
    }

    @Override // defpackage.pq
    public final String r() {
        return z(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        fq fqVar = this.n;
        if (fqVar.n == 0 && this.m.h(8192L, fqVar) == -1) {
            return -1;
        }
        return fqVar.read(byteBuffer);
    }

    @Override // defpackage.pq
    public final byte readByte() {
        F(1L);
        return this.n.readByte();
    }

    @Override // defpackage.pq
    public final int readInt() {
        F(4L);
        return this.n.readInt();
    }

    @Override // defpackage.pq
    public final short readShort() {
        F(2L);
        return this.n.readShort();
    }

    @Override // defpackage.pq
    public final boolean request(long j) {
        fq fqVar;
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return false;
        }
        if (this.o) {
            lh.g("closed");
            return false;
        }
        do {
            fqVar = this.n;
            if (fqVar.n >= j) {
                return true;
            }
        } while (this.m.h(8192L, fqVar) != -1);
        return false;
    }

    @Override // defpackage.pq
    public final void skip(long j) {
        if (this.o) {
            lh.g("closed");
            return;
        }
        while (j > 0) {
            fq fqVar = this.n;
            if (fqVar.n == 0 && this.m.h(8192L, fqVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, fqVar.n);
            fqVar.skip(min);
            j -= min;
        }
    }

    @Override // defpackage.pq
    public final fq t() {
        return this.n;
    }

    public final String toString() {
        return "buffer(" + this.m + ')';
    }

    @Override // defpackage.pq
    public final long x(n62 n62Var) {
        fq fqVar;
        long j = 0;
        while (true) {
            pn2 pn2Var = this.m;
            fqVar = this.n;
            if (pn2Var.h(8192L, fqVar) == -1) {
                break;
            }
            long b = fqVar.b();
            if (b > 0) {
                j += b;
                n62Var.u(b, fqVar);
            }
        }
        long j2 = fqVar.n;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        n62Var.u(j2, fqVar);
        return j3;
    }

    @Override // defpackage.pq
    public final String z(long j) {
        if (j < 0) {
            lh.c(q40.i(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long f = f((byte) 10, 0L, j2);
        fq fqVar = this.n;
        if (f != -1) {
            return f.a(f, fqVar);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && fqVar.n(j2 - 1) == 13 && request(j2 + 1) && fqVar.n(j2) == 10) {
            return f.a(j2, fqVar);
        }
        fq fqVar2 = new fq();
        fqVar.f(fqVar2, 0L, Math.min(32L, fqVar.n));
        throw new EOFException("\\n not found: limit=" + Math.min(fqVar.n, j) + " content=" + fqVar2.k(fqVar2.n).d() + (char) 8230);
    }
}
