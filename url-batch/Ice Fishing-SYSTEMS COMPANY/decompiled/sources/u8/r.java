package u8;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class r implements g {

    /* renamed from: n, reason: collision with root package name */
    public final x f41308n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41309u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f41310v;

    public r(x source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f41308n = source;
        this.f41309u = new e();
    }

    public final short B() {
        D(2L);
        return this.f41309u.E();
    }

    public final String C(long j9) {
        if (j9 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j9).toString());
        }
        long j10 = j9 == Long.MAX_VALUE ? Long.MAX_VALUE : j9 + 1;
        long g9 = g((byte) 10, 0L, j10);
        e eVar = this.f41309u;
        if (g9 != -1) {
            return v8.a.a(g9, eVar);
        }
        if (j10 < Long.MAX_VALUE && S(j10) && eVar.k(j10 - 1) == 13 && S(j10 + 1) && eVar.k(j10) == 10) {
            return v8.a.a(j10, eVar);
        }
        e eVar2 = new e();
        eVar.a(eVar2, 0L, Math.min(32, eVar.f41277u));
        throw new EOFException("\\n not found: limit=" + Math.min(eVar.f41277u, j9) + " content=" + eVar2.B(eVar2.f41277u).c() + (char) 8230);
    }

    public final void D(long j9) {
        if (!S(j9)) {
            throw new EOFException();
        }
    }

    public final void E(long j9) {
        if (this.f41310v) {
            throw new IllegalStateException("closed");
        }
        while (j9 > 0) {
            e eVar = this.f41309u;
            if (eVar.f41277u == 0 && this.f41308n.f(8192L, eVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j9, eVar.f41277u);
            eVar.H(min);
            j9 -= min;
        }
    }

    @Override // u8.x
    public final z L() {
        return this.f41308n.L();
    }

    @Override // u8.g
    public final byte[] P() {
        x xVar = this.f41308n;
        e eVar = this.f41309u;
        eVar.W(xVar);
        return eVar.A(eVar.f41277u);
    }

    @Override // u8.g
    public final e Q() {
        return this.f41309u;
    }

    @Override // u8.g
    public final boolean S(long j9) {
        e eVar;
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (this.f41310v) {
            throw new IllegalStateException("closed");
        }
        do {
            eVar = this.f41309u;
            if (eVar.f41277u >= j9) {
                return true;
            }
        } while (this.f41308n.f(8192L, eVar) != -1);
        return false;
    }

    public final boolean b() {
        if (this.f41310v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41309u;
        return eVar.j() && this.f41308n.f(8192L, eVar) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f41310v) {
            return;
        }
        this.f41310v = true;
        this.f41308n.close();
        e eVar = this.f41309u;
        eVar.H(eVar.f41277u);
    }

    @Override // u8.x
    public final long f(long j9, e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        if (this.f41310v) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f41309u;
        if (eVar.f41277u == 0) {
            if (j9 == 0) {
                return 0L;
            }
            if (this.f41308n.f(8192L, eVar) == -1) {
                return -1L;
            }
        }
        return eVar.f(Math.min(j9, eVar.f41277u), sink);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(byte b9, long j9, long j10) {
        s sVar;
        long j11;
        long j12;
        if (this.f41310v) {
            throw new IllegalStateException("closed");
        }
        long j13 = 0;
        if (0 > j10) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j10).toString());
        }
        while (j13 < j10) {
            e eVar = this.f41309u;
            eVar.getClass();
            long j14 = 0;
            if (0 > j13 || j13 > j10) {
                StringBuilder sb = new StringBuilder("size=");
                sb.append(eVar.f41277u);
                com.anythink.basead.b.c.i.x(sb, " fromIndex=", j13, " toIndex=");
                sb.append(j10);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            long j15 = eVar.f41277u;
            long j16 = j10 > j15 ? j15 : j10;
            if (j13 != j16 && (sVar = eVar.f41276n) != null) {
                if (j15 - j13 < j13) {
                    while (j15 > j13) {
                        sVar = sVar.f41317g;
                        kotlin.jvm.internal.h.b(sVar);
                        j15 -= sVar.f41313c - sVar.f41312b;
                    }
                    long j17 = j13;
                    while (j15 < j16) {
                        j11 = -1;
                        int min = (int) Math.min(sVar.f41313c, (sVar.f41312b + j16) - j15);
                        for (int i = (int) ((sVar.f41312b + j17) - j15); i < min; i++) {
                            if (sVar.f41311a[i] == b9) {
                                j12 = (i - sVar.f41312b) + j15;
                                break;
                            }
                        }
                        j17 = j15 + (sVar.f41313c - sVar.f41312b);
                        sVar = sVar.f41316f;
                        kotlin.jvm.internal.h.b(sVar);
                        j15 = j17;
                    }
                } else {
                    j11 = -1;
                    while (true) {
                        long j18 = (sVar.f41313c - sVar.f41312b) + j14;
                        if (j18 > j13) {
                            break;
                        }
                        sVar = sVar.f41316f;
                        kotlin.jvm.internal.h.b(sVar);
                        j14 = j18;
                    }
                    long j19 = j13;
                    while (j14 < j16) {
                        long j20 = j19;
                        int min2 = (int) Math.min(sVar.f41313c, (sVar.f41312b + j16) - j14);
                        for (int i4 = (int) ((sVar.f41312b + j20) - j14); i4 < min2; i4++) {
                            if (sVar.f41311a[i4] == b9) {
                                j12 = (i4 - sVar.f41312b) + j14;
                                break;
                            }
                        }
                        j19 = (sVar.f41313c - sVar.f41312b) + j14;
                        sVar = sVar.f41316f;
                        kotlin.jvm.internal.h.b(sVar);
                        j14 = j19;
                    }
                    j12 = -1;
                }
                if (j12 == j11) {
                    return j12;
                }
                long j21 = eVar.f41277u;
                if (j21 >= j10 || this.f41308n.f(8192L, eVar) == j11) {
                    return j11;
                }
                j13 = Math.max(j13, j21);
            }
            j11 = -1;
            j12 = -1;
            if (j12 == j11) {
            }
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(h targetBytes) {
        long j9;
        long j10;
        long j11;
        kotlin.jvm.internal.h.e(targetBytes, "targetBytes");
        if (this.f41310v) {
            throw new IllegalStateException("closed");
        }
        long j12 = 0;
        while (true) {
            e eVar = this.f41309u;
            eVar.getClass();
            kotlin.jvm.internal.h.e(targetBytes, "targetBytes");
            long j13 = 0;
            if (j12 < 0) {
                throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
            }
            s sVar = eVar.f41276n;
            if (sVar != null) {
                long j14 = eVar.f41277u;
                long j15 = j14 - j12;
                byte[] bArr = targetBytes.f41279n;
                if (j15 < j12) {
                    while (j14 > j12) {
                        sVar = sVar.f41317g;
                        kotlin.jvm.internal.h.b(sVar);
                        j14 -= sVar.f41313c - sVar.f41312b;
                    }
                    if (bArr.length == 2) {
                        byte b9 = bArr[0];
                        byte b10 = bArr[1];
                        long j16 = j12;
                        while (j14 < eVar.f41277u) {
                            int i = sVar.f41313c;
                            for (int i4 = (int) ((sVar.f41312b + j16) - j14); i4 < i; i4++) {
                                byte b11 = sVar.f41311a[i4];
                                if (b11 == b9 || b11 == b10) {
                                    j11 = i4 - sVar.f41312b;
                                    j9 = j11 + j14;
                                    break;
                                }
                            }
                            j16 = (sVar.f41313c - sVar.f41312b) + j14;
                            sVar = sVar.f41316f;
                            kotlin.jvm.internal.h.b(sVar);
                            j14 = j16;
                        }
                    } else {
                        long j17 = j12;
                        while (j14 < eVar.f41277u) {
                            int i9 = sVar.f41313c;
                            for (int i10 = (int) ((sVar.f41312b + j17) - j14); i10 < i9; i10++) {
                                byte b12 = sVar.f41311a[i10];
                                for (byte b13 : bArr) {
                                    if (b12 == b13) {
                                        j11 = i10 - sVar.f41312b;
                                        j9 = j11 + j14;
                                        break;
                                    }
                                }
                            }
                            j17 = (sVar.f41313c - sVar.f41312b) + j14;
                            sVar = sVar.f41316f;
                            kotlin.jvm.internal.h.b(sVar);
                            j14 = j17;
                        }
                    }
                } else {
                    while (true) {
                        long j18 = (sVar.f41313c - sVar.f41312b) + j13;
                        if (j18 > j12) {
                            break;
                        }
                        sVar = sVar.f41316f;
                        kotlin.jvm.internal.h.b(sVar);
                        j13 = j18;
                    }
                    if (bArr.length == 2) {
                        byte b14 = bArr[0];
                        byte b15 = bArr[1];
                        long j19 = j12;
                        while (j13 < eVar.f41277u) {
                            int i11 = sVar.f41313c;
                            for (int i12 = (int) ((sVar.f41312b + j19) - j13); i12 < i11; i12++) {
                                byte b16 = sVar.f41311a[i12];
                                if (b16 == b14 || b16 == b15) {
                                    j10 = i12 - sVar.f41312b;
                                    j9 = j13 + j10;
                                    break;
                                }
                            }
                            j19 = (sVar.f41313c - sVar.f41312b) + j13;
                            sVar = sVar.f41316f;
                            kotlin.jvm.internal.h.b(sVar);
                            j13 = j19;
                        }
                    } else {
                        long j20 = j12;
                        while (j13 < eVar.f41277u) {
                            int i13 = sVar.f41313c;
                            for (int i14 = (int) ((sVar.f41312b + j20) - j13); i14 < i13; i14++) {
                                byte b17 = sVar.f41311a[i14];
                                for (byte b18 : bArr) {
                                    if (b17 == b18) {
                                        j10 = i14 - sVar.f41312b;
                                        j9 = j13 + j10;
                                        break;
                                    }
                                }
                            }
                            j20 = (sVar.f41313c - sVar.f41312b) + j13;
                            sVar = sVar.f41316f;
                            kotlin.jvm.internal.h.b(sVar);
                            j13 = j20;
                        }
                    }
                }
                if (j9 == -1) {
                    return j9;
                }
                long j21 = eVar.f41277u;
                if (this.f41308n.f(8192L, eVar) == -1) {
                    return -1L;
                }
                j12 = Math.max(j12, j21);
            }
            j9 = -1;
            if (j9 == -1) {
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f41310v;
    }

    public final byte j() {
        D(1L);
        return this.f41309u.z();
    }

    public final h k(long j9) {
        D(j9);
        return this.f41309u.B(j9);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        e eVar = this.f41309u;
        if (eVar.f41277u == 0 && this.f41308n.f(8192L, eVar) == -1) {
            return -1;
        }
        return eVar.read(sink);
    }

    public final String toString() {
        return "buffer(" + this.f41308n + ')';
    }

    public final int z() {
        D(4L);
        return this.f41309u.D();
    }
}
