package T6;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements h {

    /* renamed from: d, reason: collision with root package name */
    public final w f2640d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2641e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2642i;

    public q(w source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f2640d = source;
        this.f2641e = new f();
    }

    public final boolean a() {
        if (this.f2642i) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f2641e;
        return fVar.d() && this.f2640d.o(8192L, fVar) == -1;
    }

    @Override // T6.w
    public final y b() {
        return this.f2640d.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f2642i) {
            return;
        }
        this.f2642i = true;
        this.f2640d.close();
        f fVar = this.f2641e;
        fVar.skip(fVar.f2617e);
    }

    public final long d(byte b7, long j, long j7) {
        if (this.f2642i) {
            throw new IllegalStateException("closed");
        }
        if (0 > j7) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j7).toString());
        }
        long j8 = 0;
        while (j8 < j7) {
            f fVar = this.f2641e;
            byte b8 = b7;
            long j9 = j7;
            long h7 = fVar.h(b8, j8, j9);
            if (h7 == -1) {
                long j10 = fVar.f2617e;
                if (j10 >= j9 || this.f2640d.o(8192L, fVar) == -1) {
                    break;
                }
                j8 = Math.max(j8, j10);
                b7 = b8;
                j7 = j9;
            } else {
                return h7;
            }
        }
        return -1L;
    }

    @Override // T6.h
    public final i e(long j) {
        y(j);
        return this.f2641e.e(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r2 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r2 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r3 = java.lang.Integer.toString(r4, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "toString(...)");
        r2.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[LOOP:2: B:23:0x0073->B:31:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g() {
        byte b7;
        f fVar;
        int i2;
        int i5;
        y(1L);
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            boolean h7 = h(i8);
            b7 = 102;
            fVar = this.f2641e;
            if (!h7) {
                break;
            }
            byte g7 = fVar.g(i7);
            if ((g7 < 48 || g7 > 57) && ((g7 < 97 || g7 > 102) && (g7 < 65 || g7 > 70))) {
                break;
            }
            i7 = i8;
        }
        long j = 0;
        if (fVar.f2617e == 0) {
            throw new EOFException();
        }
        long j7 = 0;
        int i9 = 0;
        boolean z7 = false;
        while (true) {
            r rVar = fVar.f2616d;
            Intrinsics.b(rVar);
            long j8 = j;
            byte[] bArr = rVar.f2643a;
            int i10 = rVar.f2644b;
            int i11 = rVar.f2645c;
            while (i10 < i11) {
                byte b8 = bArr[i10];
                if (b8 >= 48 && b8 <= 57) {
                    i5 = b8 - 48;
                } else if (b8 >= 97 && b8 <= b7) {
                    i5 = b8 - 87;
                } else if (b8 < 65 || b8 > 70) {
                    z7 = true;
                    if (i9 == 0) {
                        char[] cArr = U6.b.f2738a;
                        char[] cArr2 = {cArr[(b8 >> 4) & 15], cArr[b8 & 15]};
                        Intrinsics.checkNotNullParameter(cArr2, "<this>");
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(cArr2)));
                    }
                    if (i10 != i11) {
                        fVar.f2616d = rVar.a();
                        s.a(rVar);
                    } else {
                        rVar.f2644b = i10;
                    }
                    if (!!z7 || fVar.f2616d == null) {
                        break;
                    }
                    j = j8;
                    b7 = 102;
                } else {
                    i2 = b8 - 55;
                    if ((j7 & (-1152921504606846976L)) == j8) {
                        f fVar2 = new f();
                        fVar2.J(j7);
                        fVar2.H(b8);
                        throw new NumberFormatException("Number too large: ".concat(fVar2.t()));
                    }
                    j7 = (j7 << 4) | i2;
                    i10++;
                    i9++;
                    b7 = 102;
                }
                i2 = i5;
                if ((j7 & (-1152921504606846976L)) == j8) {
                }
            }
            if (i10 != i11) {
            }
            if (!z7) {
                break;
            }
            break;
        }
        fVar.f2617e -= i9;
        return j7;
    }

    public final boolean h(long j) {
        f fVar;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.f2642i) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f2641e;
            if (fVar.f2617e >= j) {
                return true;
            }
        } while (this.f2640d.o(8192L, fVar) != -1);
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2642i;
    }

    @Override // T6.h
    public final byte[] n() {
        w wVar = this.f2640d;
        f fVar = this.f2641e;
        fVar.G(wVar);
        return fVar.j(fVar.f2617e);
    }

    @Override // T6.w
    public final long o(long j, f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.f2642i) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f2641e;
        if (fVar.f2617e == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f2640d.o(8192L, fVar) == -1) {
                return -1L;
            }
        }
        return fVar.o(Math.min(j, fVar.f2617e), sink);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        f fVar = this.f2641e;
        if (fVar.f2617e == 0 && this.f2640d.o(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.read(sink);
    }

    @Override // T6.h
    public final byte readByte() {
        y(1L);
        return this.f2641e.readByte();
    }

    @Override // T6.h
    public final int readInt() {
        y(4L);
        return this.f2641e.readInt();
    }

    @Override // T6.h
    public final short readShort() {
        y(2L);
        return this.f2641e.readShort();
    }

    @Override // T6.h
    public final void skip(long j) {
        if (this.f2642i) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            f fVar = this.f2641e;
            if (fVar.f2617e == 0 && this.f2640d.o(8192L, fVar) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, fVar.f2617e);
            fVar.skip(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.f2640d + ')';
    }

    @Override // T6.h
    public final String u(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j7 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long d7 = d((byte) 10, 0L, j7);
        f fVar = this.f2641e;
        if (d7 != -1) {
            return U6.a.a(d7, fVar);
        }
        if (j7 < Long.MAX_VALUE && h(j7) && fVar.g(j7 - 1) == 13 && h(j7 + 1) && fVar.g(j7) == 10) {
            return U6.a.a(j7, fVar);
        }
        f fVar2 = new f();
        fVar.a(fVar2, 0L, Math.min(32, fVar.f2617e));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f2617e, j) + " content=" + fVar2.e(fVar2.f2617e).b() + (char) 8230);
    }

    @Override // T6.h
    public final void y(long j) {
        if (!h(j)) {
            throw new EOFException();
        }
    }
}
