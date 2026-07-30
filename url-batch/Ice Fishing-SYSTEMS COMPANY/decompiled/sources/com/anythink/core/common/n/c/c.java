package com.anythink.core.common.n.c;

import com.google.android.gms.internal.ads.CL;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c implements d, e, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    static final int f16002a = 65533;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f16003d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b, reason: collision with root package name */
    s f16004b;

    /* renamed from: c, reason: collision with root package name */
    long f16005c;

    private c B() {
        return this;
    }

    private List<Integer> C() {
        if (this.f16004b == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        s sVar = this.f16004b;
        arrayList.add(Integer.valueOf(sVar.f16074e - sVar.f16073d));
        s sVar2 = this.f16004b;
        while (true) {
            sVar2 = sVar2.f16077h;
            if (sVar2 == this.f16004b) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(sVar2.f16074e - sVar2.f16073d));
        }
    }

    private f D() {
        return c("MD5");
    }

    private f E() {
        return c("SHA-1");
    }

    private f F() {
        return c("SHA-256");
    }

    private f G() {
        return c("SHA-512");
    }

    private c H() {
        c cVar = new c();
        if (this.f16005c == 0) {
            return cVar;
        }
        s a9 = this.f16004b.a();
        cVar.f16004b = a9;
        a9.i = a9;
        a9.f16077h = a9;
        s sVar = this.f16004b;
        while (true) {
            sVar = sVar.f16077h;
            if (sVar == this.f16004b) {
                cVar.f16005c = this.f16005c;
                return cVar;
            }
            cVar.f16004b.i.a(sVar.a());
        }
    }

    private f I() {
        long j9 = this.f16005c;
        if (j9 <= 2147483647L) {
            int i = (int) j9;
            return i == 0 ? f.f16016b : new u(this, i);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f16005c);
    }

    private a J() {
        a aVar = new a();
        if (aVar.f16008a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.f16008a = this;
        aVar.f16009b = false;
        return aVar;
    }

    private a K() {
        return a(new a());
    }

    @Override // com.anythink.core.common.n.c.d
    public final /* bridge */ /* synthetic */ d A() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final void a(long j9) {
        if (this.f16005c < j9) {
            throw new EOFException();
        }
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j9) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j9 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
        }
        long j10 = this.f16005c;
        if (j10 == 0) {
            return -1L;
        }
        if (j9 > j10) {
            j9 = j10;
        }
        cVar.a(this, j9);
        return j9;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.e
    public final c c() {
        return this;
    }

    public final /* synthetic */ Object clone() {
        c cVar = new c();
        if (this.f16005c == 0) {
            return cVar;
        }
        s a9 = this.f16004b.a();
        cVar.f16004b = a9;
        a9.i = a9;
        a9.f16077h = a9;
        s sVar = this.f16004b;
        while (true) {
            sVar = sVar.f16077h;
            if (sVar == this.f16004b) {
                cVar.f16005c = this.f16005c;
                return cVar;
            }
            cVar.f16004b.i.a(sVar.a());
        }
    }

    @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.anythink.core.common.n.c.e
    public final c d() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d
    public final OutputStream e() {
        return new OutputStream() { // from class: com.anythink.core.common.n.c.c.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return c.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                c.this.l((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i4) {
                c.this.c(bArr, i, i4);
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j9 = this.f16005c;
        if (j9 != cVar.f16005c) {
            return false;
        }
        long j10 = 0;
        if (j9 == 0) {
            return true;
        }
        s sVar = this.f16004b;
        s sVar2 = cVar.f16004b;
        int i = sVar.f16073d;
        int i4 = sVar2.f16073d;
        while (j10 < this.f16005c) {
            long min = Math.min(sVar.f16074e - i, sVar2.f16074e - i4);
            int i9 = 0;
            while (i9 < min) {
                int i10 = i + 1;
                int i11 = i4 + 1;
                if (sVar.f16072c[i] != sVar2.f16072c[i4]) {
                    return false;
                }
                i9++;
                i = i10;
                i4 = i11;
            }
            if (i == sVar.f16074e) {
                sVar = sVar.f16077h;
                i = sVar.f16073d;
            }
            if (i4 == sVar2.f16074e) {
                sVar2 = sVar2.f16077h;
                i4 = sVar2.f16073d;
            }
            j10 += min;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.d
    public final d f() {
        return this;
    }

    @Override // com.anythink.core.common.n.c.d, com.anythink.core.common.n.c.v, java.io.Flushable
    public final void flush() {
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean g() {
        return this.f16005c == 0;
    }

    public final int hashCode() {
        s sVar = this.f16004b;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = sVar.f16074e;
            for (int i9 = sVar.f16073d; i9 < i4; i9++) {
                i = (i * 31) + sVar.f16072c[i9];
            }
            sVar = sVar.f16077h;
        } while (sVar != this.f16004b);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6 A[EDGE_INSN: B:46:0x00a6->B:40:0x00a6 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r() {
        if (this.f16005c == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        boolean z8 = false;
        long j9 = -7;
        long j10 = 0;
        boolean z9 = false;
        do {
            s sVar = this.f16004b;
            byte[] bArr = sVar.f16072c;
            int i4 = sVar.f16073d;
            int i9 = sVar.f16074e;
            while (i4 < i9) {
                byte b9 = bArr[i4];
                if (b9 >= 48 && b9 <= 57) {
                    int i10 = 48 - b9;
                    if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i10 < j9)) {
                        c l9 = new c().o(j10).l((int) b9);
                        if (!z8) {
                            l9.k();
                        }
                        throw new NumberFormatException("Number too large: " + l9.u());
                    }
                    j10 = (j10 * 10) + i10;
                } else if (b9 == 45 && i == 0) {
                    j9--;
                    z8 = true;
                } else {
                    if (i == 0) {
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(b9));
                    }
                    z9 = true;
                    if (i4 != i9) {
                        this.f16004b = sVar.c();
                        t.a(sVar);
                    } else {
                        sVar.f16073d = i4;
                    }
                    if (!z9) {
                        break;
                    }
                }
                i4++;
                i++;
            }
            if (i4 != i9) {
            }
            if (!z9) {
            }
        } while (this.f16004b != null);
        this.f16005c -= i;
        return z8 ? j10 : -j10;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        s sVar = this.f16004b;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), sVar.f16074e - sVar.f16073d);
        byteBuffer.put(sVar.f16072c, sVar.f16073d, min);
        int i = sVar.f16073d + min;
        sVar.f16073d = i;
        this.f16005c -= min;
        if (i == sVar.f16074e) {
            this.f16004b = sVar.c();
            t.a(sVar);
        }
        return min;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[EDGE_INSN: B:40:0x009c->B:37:0x009c BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    @Override // com.anythink.core.common.n.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s() {
        int i;
        if (this.f16005c == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i4 = 0;
        boolean z8 = false;
        long j9 = 0;
        do {
            s sVar = this.f16004b;
            byte[] bArr = sVar.f16072c;
            int i9 = sVar.f16073d;
            int i10 = sVar.f16074e;
            while (i9 < i10) {
                byte b9 = bArr[i9];
                if (b9 >= 48 && b9 <= 57) {
                    i = b9 - 48;
                } else if (b9 >= 97 && b9 <= 102) {
                    i = b9 - 87;
                } else if (b9 >= 65 && b9 <= 70) {
                    i = b9 - 55;
                } else {
                    if (i4 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b9));
                    }
                    z8 = true;
                    if (i9 != i10) {
                        this.f16004b = sVar.c();
                        t.a(sVar);
                    } else {
                        sVar.f16073d = i9;
                    }
                    if (!z8) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j9) != 0) {
                    throw new NumberFormatException("Number too large: " + new c().n(j9).l((int) b9).u());
                }
                j9 = (j9 << 4) | i;
                i9++;
                i4++;
            }
            if (i9 != i10) {
            }
            if (!z8) {
            }
        } while (this.f16004b != null);
        this.f16005c -= i4;
        return j9;
    }

    @Override // com.anythink.core.common.n.c.e
    public final f t() {
        return new f(y());
    }

    public final String toString() {
        long j9 = this.f16005c;
        if (j9 <= 2147483647L) {
            int i = (int) j9;
            return (i == 0 ? f.f16016b : new u(this, i)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f16005c);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String u() {
        try {
            return a(this.f16005c, y.f16087a);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String v() {
        long a9 = a((byte) 10);
        if (a9 != -1) {
            return g(a9);
        }
        long j9 = this.f16005c;
        if (j9 != 0) {
            return e(j9);
        }
        return null;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String w() {
        return f(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            s g9 = g(1);
            int min = Math.min(i, 8192 - g9.f16074e);
            byteBuffer.get(g9.f16072c, g9.f16074e, min);
            i -= min;
            g9.f16074e += min;
        }
        this.f16005c += remaining;
        return remaining;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int x() {
        int i;
        int i4;
        int i9;
        if (this.f16005c == 0) {
            throw new EOFException();
        }
        byte c4 = c(0L);
        if ((c4 & com.anythink.core.common.s.a.c.f16474a) == 0) {
            i = c4 & Byte.MAX_VALUE;
            i9 = 0;
            i4 = 1;
        } else if ((c4 & 224) == 192) {
            i = c4 & 31;
            i4 = 2;
            i9 = 128;
        } else if ((c4 & 240) == 224) {
            i = c4 & 15;
            i4 = 3;
            i9 = 2048;
        } else {
            if ((c4 & 248) != 240) {
                i(1L);
                return f16002a;
            }
            i = c4 & 7;
            i4 = 4;
            i9 = com.anythink.basead.exoplayer.b.aX;
        }
        long j9 = i4;
        if (this.f16005c < j9) {
            StringBuilder l9 = CL.l(i4, "size < ", ": ");
            l9.append(this.f16005c);
            l9.append(" (to read code point prefixed 0x");
            l9.append(Integer.toHexString(c4));
            l9.append(")");
            throw new EOFException(l9.toString());
        }
        for (int i10 = 1; i10 < i4; i10++) {
            long j10 = i10;
            byte c9 = c(j10);
            if ((c9 & 192) != 128) {
                i(j10);
                return f16002a;
            }
            i = (i << 6) | (c9 & com.anythink.core.common.s.a.c.f16476c);
        }
        i(j9);
        return i > 1114111 ? f16002a : ((i < 55296 || i > 57343) && i >= i9) ? i : f16002a;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] y() {
        try {
            return h(this.f16005c);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    public final void z() {
        try {
            i(this.f16005c);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    private c a(OutputStream outputStream) {
        long j9 = this.f16005c;
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        y.a(j9, 0L, j9);
        if (j9 != 0) {
            s sVar = this.f16004b;
            long j10 = 0;
            while (true) {
                int i = sVar.f16074e;
                int i4 = sVar.f16073d;
                if (j10 < i - i4) {
                    break;
                }
                j10 -= i - i4;
                sVar = sVar.f16077h;
            }
            while (j9 > 0) {
                int min = (int) Math.min(sVar.f16074e - r5, j9);
                outputStream.write(sVar.f16072c, (int) (sVar.f16073d + j10), min);
                j9 -= min;
                sVar = sVar.f16077h;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String e(long j9) {
        return a(j9, y.f16087a);
    }

    @Override // com.anythink.core.common.n.c.e
    public final String f(long j9) {
        if (j9 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j9)));
        }
        long j10 = j9 != Long.MAX_VALUE ? j9 + 1 : Long.MAX_VALUE;
        long a9 = a((byte) 10, 0L, j10);
        if (a9 != -1) {
            return g(a9);
        }
        if (j10 < this.f16005c && c(j10 - 1) == 13 && c(j10) == 10) {
            return g(j10);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, this.f16005c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16005c, j9) + " content=" + cVar.t().g() + (char) 8230);
    }

    public final String g(long j9) {
        if (j9 > 0) {
            long j10 = j9 - 1;
            if (c(j10) == 13) {
                String e6 = e(j10);
                i(2L);
                return e6;
            }
        }
        String e9 = e(j9);
        i(1L);
        return e9;
    }

    @Override // com.anythink.core.common.n.c.e
    public final e h() {
        return n.a(new p(this));
    }

    @Override // com.anythink.core.common.n.c.e
    public final InputStream i() {
        return new InputStream() { // from class: com.anythink.core.common.n.c.c.2
            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(c.this.f16005c, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                c cVar = c.this;
                if (cVar.f16005c > 0) {
                    return cVar.k() & 255;
                }
                return -1;
            }

            public final String toString() {
                return c.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i4) {
                return c.this.a(bArr, i, i4);
            }
        };
    }

    public final long j() {
        long j9 = this.f16005c;
        if (j9 == 0) {
            return 0L;
        }
        s sVar = this.f16004b.i;
        return (sVar.f16074e >= 8192 || !sVar.f16076g) ? j9 : j9 - (r3 - sVar.f16073d);
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte k() {
        long j9 = this.f16005c;
        if (j9 == 0) {
            throw new IllegalStateException("size == 0");
        }
        s sVar = this.f16004b;
        int i = sVar.f16073d;
        int i4 = sVar.f16074e;
        int i9 = i + 1;
        byte b9 = sVar.f16072c[i];
        this.f16005c = j9 - 1;
        if (i9 != i4) {
            sVar.f16073d = i9;
            return b9;
        }
        this.f16004b = sVar.c();
        t.a(sVar);
        return b9;
    }

    @Override // com.anythink.core.common.n.c.e
    public final short l() {
        long j9 = this.f16005c;
        if (j9 < 2) {
            throw new IllegalStateException("size < 2: " + this.f16005c);
        }
        s sVar = this.f16004b;
        int i = sVar.f16073d;
        int i4 = sVar.f16074e;
        if (i4 - i < 2) {
            return (short) (((k() & 255) << 8) | (k() & 255));
        }
        byte[] bArr = sVar.f16072c;
        int i9 = i + 1;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i9] & 255) | i10;
        this.f16005c = j9 - 2;
        if (i11 == i4) {
            this.f16004b = sVar.c();
            t.a(sVar);
        } else {
            sVar.f16073d = i11;
        }
        return (short) i12;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int m() {
        long j9 = this.f16005c;
        if (j9 < 4) {
            throw new IllegalStateException("size < 4: " + this.f16005c);
        }
        s sVar = this.f16004b;
        int i = sVar.f16073d;
        int i4 = sVar.f16074e;
        if (i4 - i < 4) {
            return ((k() & 255) << 24) | ((k() & 255) << 16) | ((k() & 255) << 8) | (k() & 255);
        }
        byte[] bArr = sVar.f16072c;
        int i9 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = (bArr[i9] & 255) | i10;
        this.f16005c = j9 - 4;
        if (i11 != i4) {
            sVar.f16073d = i11;
            return i12;
        }
        this.f16004b = sVar.c();
        t.a(sVar);
        return i12;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long n() {
        long j9 = this.f16005c;
        if (j9 < 8) {
            throw new IllegalStateException("size < 8: " + this.f16005c);
        }
        s sVar = this.f16004b;
        int i = sVar.f16073d;
        int i4 = sVar.f16074e;
        if (i4 - i < 8) {
            return ((m() & 4294967295L) << 32) | (4294967295L & m());
        }
        byte[] bArr = sVar.f16072c;
        int i9 = i + 7;
        long j10 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i10 = i + 8;
        long j11 = j10 | (bArr[i9] & 255);
        this.f16005c = j9 - 8;
        if (i10 != i4) {
            sVar.f16073d = i10;
            return j11;
        }
        this.f16004b = sVar.c();
        t.a(sVar);
        return j11;
    }

    @Override // com.anythink.core.common.n.c.e
    public final short o() {
        return y.a(l());
    }

    @Override // com.anythink.core.common.n.c.e
    public final int p() {
        return y.a(m());
    }

    @Override // com.anythink.core.common.n.c.e
    public final long q() {
        return y.a(n());
    }

    public final byte c(long j9) {
        int i;
        long j10 = j9;
        y.a(this.f16005c, j10, 1L);
        long j11 = this.f16005c;
        if (j11 - j10 > j10) {
            s sVar = this.f16004b;
            while (true) {
                int i4 = sVar.f16074e;
                int i9 = sVar.f16073d;
                long j12 = i4 - i9;
                if (j10 < j12) {
                    return sVar.f16072c[i9 + ((int) j10)];
                }
                j10 -= j12;
                sVar = sVar.f16077h;
            }
        } else {
            long j13 = j10 - j11;
            s sVar2 = this.f16004b;
            do {
                sVar2 = sVar2.i;
                int i10 = sVar2.f16074e;
                i = sVar2.f16073d;
                j13 += i10 - i;
            } while (j13 < 0);
            return sVar2.f16072c[i + ((int) j13)];
        }
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final c i(int i) {
        s g9 = g(4);
        byte[] bArr = g9.f16072c;
        int i4 = g9.f16074e;
        bArr[i4] = (byte) ((i >>> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[i4 + 1] = (byte) ((i >>> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[i4 + 2] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[i4 + 3] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
        g9.f16074e = i4 + 4;
        this.f16005c += 4;
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final byte[] h(long j9) {
        y.a(this.f16005c, 0L, j9);
        if (j9 <= 2147483647L) {
            byte[] bArr = new byte[(int) j9];
            b(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j9)));
    }

    @Override // com.anythink.core.common.n.c.e
    public final void i(long j9) {
        while (j9 > 0) {
            if (this.f16004b != null) {
                int min = (int) Math.min(j9, r0.f16074e - r0.f16073d);
                long j10 = min;
                this.f16005c -= j10;
                j9 -= j10;
                s sVar = this.f16004b;
                int i = sVar.f16073d + min;
                sVar.f16073d = i;
                if (i == sVar.f16074e) {
                    this.f16004b = sVar.c();
                    t.a(sVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public c f16008a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16009b;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f16011d;

        /* renamed from: g, reason: collision with root package name */
        private s f16014g;

        /* renamed from: c, reason: collision with root package name */
        public long f16010c = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f16012e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f16013f = -1;

        private long b(long j9) {
            c cVar = this.f16008a;
            if (cVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f16009b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j10 = cVar.f16005c;
            if (j9 <= j10) {
                if (j9 < 0) {
                    throw new IllegalArgumentException("newSize < 0: ".concat(String.valueOf(j9)));
                }
                long j11 = j10 - j9;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    c cVar2 = this.f16008a;
                    s sVar = cVar2.f16004b.i;
                    int i = sVar.f16074e;
                    long j12 = i - sVar.f16073d;
                    if (j12 > j11) {
                        sVar.f16074e = (int) (i - j11);
                        break;
                    }
                    cVar2.f16004b = sVar.c();
                    t.a(sVar);
                    j11 -= j12;
                }
                this.f16014g = null;
                this.f16010c = j9;
                this.f16011d = null;
                this.f16012e = -1;
                this.f16013f = -1;
            } else if (j9 > j10) {
                long j13 = j9 - j10;
                boolean z8 = true;
                while (j13 > 0) {
                    s g9 = this.f16008a.g(1);
                    int min = (int) Math.min(j13, 8192 - g9.f16074e);
                    int i4 = g9.f16074e + min;
                    g9.f16074e = i4;
                    j13 -= min;
                    if (z8) {
                        this.f16014g = g9;
                        this.f16010c = j10;
                        this.f16011d = g9.f16072c;
                        this.f16012e = i4 - min;
                        this.f16013f = i4;
                        z8 = false;
                    }
                }
            }
            this.f16008a.f16005c = j9;
            return j10;
        }

        public final int a() {
            long j9 = this.f16010c;
            if (j9 != this.f16008a.f16005c) {
                return j9 == -1 ? a(0L) : a(j9 + (this.f16013f - this.f16012e));
            }
            throw new IllegalStateException();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f16008a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f16008a = null;
            this.f16014g = null;
            this.f16010c = -1L;
            this.f16011d = null;
            this.f16012e = -1;
            this.f16013f = -1;
        }

        public final int a(long j9) {
            if (j9 >= -1) {
                c cVar = this.f16008a;
                long j10 = cVar.f16005c;
                if (j9 <= j10) {
                    if (j9 != -1 && j9 != j10) {
                        s sVar = cVar.f16004b;
                        s sVar2 = this.f16014g;
                        long j11 = 0;
                        if (sVar2 != null) {
                            long j12 = this.f16010c - (this.f16012e - sVar2.f16073d);
                            if (j12 > j9) {
                                sVar2 = sVar;
                                sVar = sVar2;
                                j10 = j12;
                            } else {
                                j11 = j12;
                            }
                        } else {
                            sVar2 = sVar;
                        }
                        if (j10 - j9 > j9 - j11) {
                            while (true) {
                                int i = sVar2.f16074e;
                                int i4 = sVar2.f16073d;
                                if (j9 < (i - i4) + j11) {
                                    break;
                                }
                                j11 += i - i4;
                                sVar2 = sVar2.f16077h;
                            }
                        } else {
                            while (j10 > j9) {
                                sVar = sVar.i;
                                j10 -= sVar.f16074e - sVar.f16073d;
                            }
                            sVar2 = sVar;
                            j11 = j10;
                        }
                        if (this.f16009b && sVar2.f16075f) {
                            s b9 = sVar2.b();
                            c cVar2 = this.f16008a;
                            if (cVar2.f16004b == sVar2) {
                                cVar2.f16004b = b9;
                            }
                            sVar2 = sVar2.a(b9);
                            sVar2.i.c();
                        }
                        this.f16014g = sVar2;
                        this.f16010c = j9;
                        this.f16011d = sVar2.f16072c;
                        int i9 = sVar2.f16073d + ((int) (j9 - j11));
                        this.f16012e = i9;
                        int i10 = sVar2.f16074e;
                        this.f16013f = i10;
                        return i10 - i9;
                    }
                    this.f16014g = null;
                    this.f16010c = j9;
                    this.f16011d = null;
                    this.f16012e = -1;
                    this.f16013f = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j9 + " > size=" + this.f16008a.f16005c);
        }

        private long a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: ".concat(String.valueOf(i)));
            }
            if (i <= 8192) {
                c cVar = this.f16008a;
                if (cVar != null) {
                    if (this.f16009b) {
                        long j9 = cVar.f16005c;
                        s g9 = cVar.g(i);
                        int i4 = 8192 - g9.f16074e;
                        g9.f16074e = 8192;
                        long j10 = i4;
                        this.f16008a.f16005c = j9 + j10;
                        this.f16014g = g9;
                        this.f16010c = j9;
                        this.f16011d = g9.f16072c;
                        this.f16012e = 8192 - i4;
                        this.f16013f = 8192;
                        return j10;
                    }
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
                throw new IllegalStateException("not attached to a buffer");
            }
            throw new IllegalArgumentException("minByteCount > Segment.SIZE: ".concat(String.valueOf(i)));
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final f d(long j9) {
        return new f(h(j9));
    }

    public final long b() {
        return this.f16005c;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c j(int i) {
        return k((int) y.a((short) i));
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean b(long j9) {
        return this.f16005c >= j9;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final c q(long j9) {
        s g9 = g(8);
        byte[] bArr = g9.f16072c;
        int i = g9.f16074e;
        bArr[i] = (byte) ((j9 >>> 56) & 255);
        bArr[i + 1] = (byte) ((j9 >>> 48) & 255);
        bArr[i + 2] = (byte) ((j9 >>> 40) & 255);
        bArr[i + 3] = (byte) ((j9 >>> 32) & 255);
        bArr[i + 4] = (byte) ((j9 >>> 24) & 255);
        bArr[i + 5] = (byte) ((j9 >>> 16) & 255);
        bArr[i + 6] = (byte) ((j9 >>> 8) & 255);
        bArr[i + 7] = (byte) (j9 & 255);
        g9.f16074e = i + 8;
        this.f16005c += 8;
        return this;
    }

    private c b(OutputStream outputStream) {
        long j9 = this.f16005c;
        if (outputStream != null) {
            y.a(j9, 0L, j9);
            s sVar = this.f16004b;
            while (j9 > 0) {
                int min = (int) Math.min(j9, sVar.f16074e - sVar.f16073d);
                outputStream.write(sVar.f16072c, sVar.f16073d, min);
                int i = sVar.f16073d + min;
                sVar.f16073d = i;
                long j10 = min;
                this.f16005c -= j10;
                j9 -= j10;
                if (i == sVar.f16074e) {
                    s c4 = sVar.c();
                    this.f16004b = c4;
                    t.a(sVar);
                    sVar = c4;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final s g(int i) {
        if (i > 0 && i <= 8192) {
            s sVar = this.f16004b;
            if (sVar == null) {
                s a9 = t.a();
                this.f16004b = a9;
                a9.i = a9;
                a9.f16077h = a9;
                return a9;
            }
            s sVar2 = sVar.i;
            return (sVar2.f16074e + i > 8192 || !sVar2.f16076g) ? sVar2.a(t.a()) : sVar2;
        }
        throw new IllegalArgumentException();
    }

    private c a(OutputStream outputStream, long j9, long j10) {
        if (outputStream != null) {
            long j11 = j10;
            y.a(this.f16005c, 0L, j11);
            if (j11 != 0) {
                s sVar = this.f16004b;
                while (true) {
                    int i = sVar.f16074e;
                    int i4 = sVar.f16073d;
                    if (j9 < i - i4) {
                        break;
                    }
                    j9 -= i - i4;
                    sVar = sVar.f16077h;
                }
                while (j11 > 0) {
                    int min = (int) Math.min(sVar.f16074e - r10, j11);
                    outputStream.write(sVar.f16072c, (int) (sVar.f16073d + j9), min);
                    j11 -= min;
                    sVar = sVar.f16077h;
                    j9 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    private f e(f fVar) {
        return a("HmacSHA1", fVar);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c d(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final c p(long j9) {
        return q(y.a(j9));
    }

    private f g(f fVar) {
        return a("HmacSHA512", fVar);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final c k(int i) {
        s g9 = g(2);
        byte[] bArr = g9.f16072c;
        int i4 = g9.f16074e;
        bArr[i4] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[i4 + 1] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
        g9.f16074e = i4 + 2;
        this.f16005c += 2;
        return this;
    }

    private f n(int i) {
        if (i == 0) {
            return f.f16016b;
        }
        return new u(this, i);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final c h(int i) {
        return i(y.a(i));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final c o(long j9) {
        boolean z8;
        if (j9 == 0) {
            return l(48);
        }
        int i = 1;
        if (j9 < 0) {
            j9 = -j9;
            if (j9 < 0) {
                return b("-9223372036854775808");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        if (j9 >= 100000000) {
            i = j9 < 1000000000000L ? j9 < 10000000000L ? j9 < com.anythink.basead.exoplayer.b.f6545h ? 9 : 10 : j9 < 100000000000L ? 11 : 12 : j9 < 1000000000000000L ? j9 < 10000000000000L ? 13 : j9 < 100000000000000L ? 14 : 15 : j9 < 100000000000000000L ? j9 < 10000000000000000L ? 16 : 17 : j9 < 1000000000000000000L ? 18 : 19;
        } else if (j9 >= 10000) {
            i = j9 < 1000000 ? j9 < 100000 ? 5 : 6 : j9 < 10000000 ? 7 : 8;
        } else if (j9 >= 100) {
            i = j9 < 1000 ? 3 : 4;
        } else if (j9 >= 10) {
            i = 2;
        }
        if (z8) {
            i++;
        }
        s g9 = g(i);
        byte[] bArr = g9.f16072c;
        int i4 = g9.f16074e + i;
        while (j9 != 0) {
            i4--;
            bArr[i4] = f16003d[(int) (j9 % 10)];
            j9 /= 10;
        }
        if (z8) {
            bArr[i4 - 1] = 45;
        }
        g9.f16074e += i;
        this.f16005c += i;
        return this;
    }

    private f f(f fVar) {
        return a("HmacSHA256", fVar);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final c n(long j9) {
        if (j9 == 0) {
            return l(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j9)) / 4) + 1;
        s g9 = g(numberOfTrailingZeros);
        byte[] bArr = g9.f16072c;
        int i = g9.f16074e;
        for (int i4 = (i + numberOfTrailingZeros) - 1; i4 >= i; i4--) {
            bArr[i4] = f16003d[(int) (15 & j9)];
            j9 >>>= 4;
        }
        g9.f16074e += numberOfTrailingZeros;
        this.f16005c += numberOfTrailingZeros;
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(c cVar, long j9) {
        long j10 = this.f16005c;
        if (j10 >= j9) {
            cVar.a(this, j9);
        } else {
            cVar.a(this, j10);
            throw new EOFException();
        }
    }

    public final c a(c cVar, long j9, long j10) {
        if (cVar != null) {
            long j11 = j9;
            y.a(this.f16005c, j11, j10);
            if (j10 != 0) {
                cVar.f16005c += j10;
                s sVar = this.f16004b;
                while (true) {
                    int i = sVar.f16074e;
                    int i4 = sVar.f16073d;
                    if (j11 < i - i4) {
                        break;
                    }
                    j11 -= i - i4;
                    sVar = sVar.f16077h;
                }
                s sVar2 = sVar;
                long j12 = j10;
                while (j12 > 0) {
                    s a9 = sVar2.a();
                    int i9 = (int) (a9.f16073d + j11);
                    a9.f16073d = i9;
                    a9.f16074e = Math.min(i9 + ((int) j12), a9.f16074e);
                    s sVar3 = cVar.f16004b;
                    if (sVar3 == null) {
                        a9.i = a9;
                        a9.f16077h = a9;
                        cVar.f16004b = a9;
                    } else {
                        sVar3.i.a(a9);
                    }
                    j12 -= a9.f16074e - a9.f16073d;
                    sVar2 = sVar2.f16077h;
                    j11 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long c(f fVar) {
        return b(fVar, 0L);
    }

    private f c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            s sVar = this.f16004b;
            if (sVar != null) {
                byte[] bArr = sVar.f16072c;
                int i = sVar.f16073d;
                messageDigest.update(bArr, i, sVar.f16074e - i);
                s sVar2 = this.f16004b;
                while (true) {
                    sVar2 = sVar2.f16077h;
                    if (sVar2 == this.f16004b) {
                        break;
                    }
                    byte[] bArr2 = sVar2.f16072c;
                    int i4 = sVar2.f16073d;
                    messageDigest.update(bArr2, i4, sVar2.f16074e - i4);
                }
            }
            return f.a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final void b(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a9 = a(bArr, i, bArr.length - i);
            if (a9 == -1) {
                throw new EOFException();
            }
            i += a9;
        }
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c c(byte[] bArr, int i, int i4) {
        if (bArr != null) {
            long j9 = i4;
            y.a(bArr.length, i, j9);
            int i9 = i4 + i;
            while (i < i9) {
                s g9 = g(1);
                int min = Math.min(i9 - i, 8192 - g9.f16074e);
                System.arraycopy(bArr, i, g9.f16072c, g9.f16074e, min);
                i += min;
                g9.f16074e += min;
            }
            this.f16005c += j9;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    private c a(OutputStream outputStream, long j9) {
        if (outputStream != null) {
            y.a(this.f16005c, 0L, j9);
            s sVar = this.f16004b;
            long j10 = j9;
            while (j10 > 0) {
                int min = (int) Math.min(j10, sVar.f16074e - sVar.f16073d);
                outputStream.write(sVar.f16072c, sVar.f16073d, min);
                int i = sVar.f16073d + min;
                sVar.f16073d = i;
                long j11 = min;
                this.f16005c -= j11;
                j10 -= j11;
                if (i == sVar.f16074e) {
                    s c4 = sVar.c();
                    this.f16004b = c4;
                    t.a(sVar);
                    sVar = c4;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c l(int i) {
        s g9 = g(1);
        byte[] bArr = g9.f16072c;
        int i4 = g9.f16074e;
        g9.f16074e = i4 + 1;
        bArr[i4] = (byte) i;
        this.f16005c++;
        return this;
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar) {
        return a(fVar, 0L);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long b(f fVar, long j9) {
        int i;
        int i4;
        long j10 = 0;
        if (j9 >= 0) {
            s sVar = this.f16004b;
            if (sVar == null) {
                return -1L;
            }
            long j11 = this.f16005c;
            if (j11 - j9 < j9) {
                while (j11 > j9) {
                    sVar = sVar.i;
                    j11 -= sVar.f16074e - sVar.f16073d;
                }
            } else {
                while (true) {
                    long j12 = (sVar.f16074e - sVar.f16073d) + j10;
                    if (j12 >= j9) {
                        break;
                    }
                    sVar = sVar.f16077h;
                    j10 = j12;
                }
                j11 = j10;
            }
            if (fVar.j() == 2) {
                byte b9 = fVar.b(0);
                byte b10 = fVar.b(1);
                while (j11 < this.f16005c) {
                    byte[] bArr = sVar.f16072c;
                    i = (int) ((sVar.f16073d + j9) - j11);
                    int i9 = sVar.f16074e;
                    while (i < i9) {
                        byte b11 = bArr[i];
                        if (b11 == b9 || b11 == b10) {
                            i4 = sVar.f16073d;
                            return (i - i4) + j11;
                        }
                        i++;
                    }
                    j11 += sVar.f16074e - sVar.f16073d;
                    sVar = sVar.f16077h;
                    j9 = j11;
                }
                return -1L;
            }
            byte[] l9 = fVar.l();
            while (j11 < this.f16005c) {
                byte[] bArr2 = sVar.f16072c;
                i = (int) ((sVar.f16073d + j9) - j11);
                int i10 = sVar.f16074e;
                while (i < i10) {
                    byte b12 = bArr2[i];
                    for (byte b13 : l9) {
                        if (b12 == b13) {
                            i4 = sVar.f16073d;
                            return (i - i4) + j11;
                        }
                    }
                    i++;
                }
                j11 += sVar.f16074e - sVar.f16073d;
                sVar = sVar.f16077h;
                j9 = j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    private c a(InputStream inputStream) {
        a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    private c a(InputStream inputStream, long j9) {
        if (j9 >= 0) {
            a(inputStream, j9, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
    }

    private void a(InputStream inputStream, long j9, boolean z8) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j9 <= 0 && !z8) {
                return;
            }
            s g9 = g(1);
            int read = inputStream.read(g9.f16072c, g9.f16074e, (int) Math.min(j9, 8192 - g9.f16074e));
            if (read == -1) {
                if (!z8) {
                    throw new EOFException();
                }
                return;
            } else {
                g9.f16074e += read;
                long j10 = read;
                this.f16005c += j10;
                j9 -= j10;
            }
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(o oVar) {
        int a9 = a(oVar, false);
        if (a9 == -1) {
            return -1;
        }
        try {
            i(oVar.f16054a[a9].j());
            return a9;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r20 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(o oVar, boolean z8) {
        int i;
        int i4;
        int i9;
        s sVar;
        int i10;
        int i11;
        s sVar2 = this.f16004b;
        int i12 = -2;
        if (sVar2 == null) {
            if (z8) {
                return -2;
            }
            return oVar.indexOf(f.f16016b);
        }
        byte[] bArr = sVar2.f16072c;
        int i13 = sVar2.f16073d;
        int i14 = sVar2.f16074e;
        int[] iArr = oVar.f16055b;
        s sVar3 = sVar2;
        int i15 = 0;
        int i16 = -1;
        loop0: while (true) {
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            int i19 = i15 + 2;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i16 = i20;
            }
            if (sVar3 != null) {
                if (i18 >= 0) {
                    int i21 = i13 + 1;
                    int i22 = bArr[i13] & 255;
                    int i23 = i19 + i18;
                    while (i19 != i23) {
                        i = i12;
                        if (i22 == iArr[i19]) {
                            i4 = iArr[i19 + i18];
                            if (i21 == i14) {
                                sVar3 = sVar3.f16077h;
                                i9 = sVar3.f16073d;
                                bArr = sVar3.f16072c;
                                i14 = sVar3.f16074e;
                                if (sVar3 == sVar2) {
                                    sVar3 = null;
                                }
                            } else {
                                i9 = i21;
                            }
                            if (i4 >= 0) {
                                return i4;
                            }
                            i15 = -i4;
                            i13 = i9;
                            i12 = i;
                        } else {
                            i19++;
                            i12 = i;
                        }
                    }
                    break loop0;
                }
                int i24 = (i18 * (-1)) + i19;
                while (true) {
                    int i25 = i13 + 1;
                    int i26 = i19 + 1;
                    if ((bArr[i13] & 255) != iArr[i19]) {
                        break loop0;
                    }
                    boolean z9 = i26 == i24;
                    if (i25 == i14) {
                        s sVar4 = sVar3.f16077h;
                        i11 = sVar4.f16073d;
                        byte[] bArr2 = sVar4.f16072c;
                        i10 = sVar4.f16074e;
                        if (sVar4 != sVar2) {
                            sVar = sVar4;
                            bArr = bArr2;
                        } else {
                            if (!z9) {
                                break loop0;
                            }
                            bArr = bArr2;
                            sVar = null;
                        }
                    } else {
                        sVar = sVar3;
                        i10 = i14;
                        i11 = i25;
                    }
                    if (z9) {
                        i4 = iArr[i26];
                        i = i12;
                        i9 = i11;
                        i14 = i10;
                        sVar3 = sVar;
                        break;
                    }
                    i13 = i11;
                    i14 = i10;
                    sVar3 = sVar;
                    i19 = i26;
                }
            } else {
                break;
            }
        }
        return i16;
    }

    private a b(a aVar) {
        if (aVar.f16008a == null) {
            aVar.f16008a = this;
            aVar.f16009b = false;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(v vVar) {
        long j9 = this.f16005c;
        if (j9 > 0) {
            vVar.a(this, j9);
        }
        return j9;
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(Charset charset) {
        try {
            return a(this.f16005c, charset);
        } catch (EOFException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // com.anythink.core.common.n.c.e
    public final String a(long j9, Charset charset) {
        y.a(this.f16005c, 0L, j9);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j9 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j9)));
        }
        if (j9 == 0) {
            return "";
        }
        s sVar = this.f16004b;
        int i = sVar.f16073d;
        if (i + j9 > sVar.f16074e) {
            return new String(h(j9), charset);
        }
        String str = new String(sVar.f16072c, i, (int) j9, charset);
        int i4 = (int) (sVar.f16073d + j9);
        sVar.f16073d = i4;
        this.f16005c -= j9;
        if (i4 == sVar.f16074e) {
            this.f16004b = sVar.c();
            t.a(sVar);
        }
        return str;
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    @Override // com.anythink.core.common.n.c.e
    public final int a(byte[] bArr, int i, int i4) {
        y.a(bArr.length, i, i4);
        s sVar = this.f16004b;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i4, sVar.f16074e - sVar.f16073d);
        System.arraycopy(sVar.f16072c, sVar.f16073d, bArr, i, min);
        int i9 = sVar.f16073d + min;
        sVar.f16073d = i9;
        this.f16005c -= min;
        if (i9 == sVar.f16074e) {
            this.f16004b = sVar.c();
            t.a(sVar);
        }
        return min;
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c d(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str) {
        return b(str, 0, str.length());
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, int i, int i4) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i4 >= i) {
            if (i4 > str.length()) {
                StringBuilder l9 = CL.l(i4, "endIndex > string.length: ", " > ");
                l9.append(str.length());
                throw new IllegalArgumentException(l9.toString());
            }
            while (i < i4) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    s g9 = g(1);
                    byte[] bArr = g9.f16072c;
                    int i9 = g9.f16074e - i;
                    int min = Math.min(i4, 8192 - i9);
                    int i10 = i + 1;
                    bArr[i + i9] = (byte) charAt2;
                    while (true) {
                        i = i10;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i10 = i + 1;
                        bArr[i + i9] = (byte) charAt;
                    }
                    int i11 = g9.f16074e;
                    int i12 = (i9 + i) - i11;
                    g9.f16074e = i11 + i12;
                    this.f16005c += i12;
                } else {
                    if (charAt2 < 2048) {
                        l((charAt2 >> 6) | 192);
                        l((charAt2 & '?') | 128);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i13 = i + 1;
                        char charAt3 = i13 < i4 ? str.charAt(i13) : (char) 0;
                        if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i14 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + com.anythink.basead.exoplayer.b.aX;
                            l((i14 >> 18) | 240);
                            l(((i14 >> 12) & 63) | 128);
                            l(((i14 >> 6) & 63) | 128);
                            l((i14 & 63) | 128);
                            i += 2;
                        } else {
                            l(63);
                            i = i13;
                        }
                    } else {
                        l((charAt2 >> '\f') | 224);
                        l(((charAt2 >> 6) & 63) | 128);
                        l((charAt2 & '?') | 128);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(AbstractC5051n.c(i4, i, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c m(int i) {
        if (i < 128) {
            l(i);
            return this;
        }
        if (i < 2048) {
            l((i >> 6) | 192);
            l((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                l(63);
                return this;
            }
            l((i >> 12) | 224);
            l(((i >> 6) & 63) | 128);
            l((i & 63) | 128);
            return this;
        }
        if (i <= 1114111) {
            l((i >> 18) | 240);
            l(((i >> 12) & 63) | 128);
            l(((i >> 6) & 63) | 128);
            l((i & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, Charset charset) {
        return b(str, 0, str.length(), charset);
    }

    @Override // com.anythink.core.common.n.c.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c b(String str, int i, int i4, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i4 >= i) {
            if (i4 > str.length()) {
                StringBuilder l9 = CL.l(i4, "endIndex > string.length: ", " > ");
                l9.append(str.length());
                throw new IllegalArgumentException(l9.toString());
            }
            if (charset != null) {
                if (charset.equals(y.f16087a)) {
                    return b(str, i, i4);
                }
                byte[] bytes = str.substring(i, i4).getBytes(charset);
                return c(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(AbstractC5051n.c(i4, i, "endIndex < beginIndex: ", " < "));
    }

    @Override // com.anythink.core.common.n.c.d
    public final long a(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j9 = 0;
        while (true) {
            long a_ = wVar.a_(this, 8192L);
            if (a_ == -1) {
                return j9;
            }
            j9 += a_;
        }
    }

    @Override // com.anythink.core.common.n.c.d
    public final d a(w wVar, long j9) {
        while (j9 > 0) {
            long a_ = wVar.a_(this, j9);
            if (a_ == -1) {
                throw new EOFException();
            }
            j9 -= a_;
        }
        return this;
    }

    @Override // com.anythink.core.common.n.c.v
    public final void a(c cVar, long j9) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            y.a(cVar.f16005c, 0L, j9);
            while (j9 > 0) {
                s sVar = cVar.f16004b;
                if (j9 < sVar.f16074e - sVar.f16073d) {
                    s sVar2 = this.f16004b;
                    s sVar3 = sVar2 != null ? sVar2.i : null;
                    if (sVar3 != null && sVar3.f16076g) {
                        if ((sVar3.f16074e + j9) - (sVar3.f16075f ? 0 : sVar3.f16073d) <= 8192) {
                            sVar.a(sVar3, (int) j9);
                            cVar.f16005c -= j9;
                            this.f16005c += j9;
                            return;
                        }
                    }
                    cVar.f16004b = sVar.a((int) j9);
                }
                s sVar4 = cVar.f16004b;
                long j10 = sVar4.f16074e - sVar4.f16073d;
                cVar.f16004b = sVar4.c();
                s sVar5 = this.f16004b;
                if (sVar5 == null) {
                    this.f16004b = sVar4;
                    sVar4.i = sVar4;
                    sVar4.f16077h = sVar4;
                } else {
                    sVar5.i.a(sVar4).d();
                }
                cVar.f16005c -= j10;
                this.f16005c += j10;
                j9 -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9) {
        return a(b9, 0L, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9, long j9) {
        return a(b9, j9, Long.MAX_VALUE);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(byte b9, long j9, long j10) {
        s sVar;
        long j11 = j9;
        long j12 = j10;
        long j13 = 0;
        if (j11 >= 0 && j12 >= j11) {
            long j14 = this.f16005c;
            if (j12 > j14) {
                j12 = j14;
            }
            if (j11 == j12 || (sVar = this.f16004b) == null) {
                return -1L;
            }
            if (j14 - j11 < j11) {
                while (j14 > j11) {
                    sVar = sVar.i;
                    j14 -= sVar.f16074e - sVar.f16073d;
                }
            } else {
                while (true) {
                    long j15 = (sVar.f16074e - sVar.f16073d) + j13;
                    if (j15 >= j11) {
                        break;
                    }
                    sVar = sVar.f16077h;
                    j13 = j15;
                }
                j14 = j13;
            }
            while (j14 < j12) {
                byte[] bArr = sVar.f16072c;
                int min = (int) Math.min(sVar.f16074e, (sVar.f16073d + j12) - j14);
                for (int i = (int) ((sVar.f16073d + j11) - j14); i < min; i++) {
                    if (bArr[i] == b9) {
                        return (i - sVar.f16073d) + j14;
                    }
                }
                j14 += sVar.f16074e - sVar.f16073d;
                sVar = sVar.f16077h;
                j11 = j14;
            }
            return -1L;
        }
        throw new IllegalArgumentException("size=" + this.f16005c + " fromIndex=" + j11 + " toIndex=" + j12);
    }

    @Override // com.anythink.core.common.n.c.e
    public final long a(f fVar, long j9) {
        if (fVar.j() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j10 = 0;
        if (j9 >= 0) {
            s sVar = this.f16004b;
            long j11 = -1;
            if (sVar == null) {
                return -1L;
            }
            long j12 = this.f16005c;
            if (j12 - j9 < j9) {
                while (j12 > j9) {
                    sVar = sVar.i;
                    j12 -= sVar.f16074e - sVar.f16073d;
                }
            } else {
                while (true) {
                    long j13 = (sVar.f16074e - sVar.f16073d) + j10;
                    if (j13 >= j9) {
                        break;
                    }
                    sVar = sVar.f16077h;
                    j10 = j13;
                }
                j12 = j10;
            }
            byte b9 = fVar.b(0);
            int j14 = fVar.j();
            long j15 = (this.f16005c - j14) + 1;
            long j16 = j12;
            long j17 = j9;
            while (j16 < j15) {
                byte[] bArr = sVar.f16072c;
                long j18 = j11;
                int min = (int) Math.min(sVar.f16074e, (sVar.f16073d + j15) - j16);
                for (int i = (int) ((sVar.f16073d + j17) - j16); i < min; i++) {
                    if (bArr[i] == b9 && a(sVar, i + 1, fVar, j14)) {
                        return (i - sVar.f16073d) + j16;
                    }
                }
                j16 += sVar.f16074e - sVar.f16073d;
                sVar = sVar.f16077h;
                j17 = j16;
                j11 = j18;
            }
            return j11;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j9, f fVar) {
        return a(j9, fVar, fVar.j());
    }

    @Override // com.anythink.core.common.n.c.e
    public final boolean a(long j9, f fVar, int i) {
        if (j9 < 0 || i < 0 || this.f16005c - j9 < i || fVar.j() < i) {
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (c(i4 + j9) != fVar.b(i4)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(s sVar, int i, f fVar, int i4) {
        int i9 = sVar.f16074e;
        byte[] bArr = sVar.f16072c;
        for (int i10 = 1; i10 < i4; i10++) {
            if (i == i9) {
                sVar = sVar.f16077h;
                bArr = sVar.f16072c;
                i = sVar.f16073d;
                i9 = sVar.f16074e;
            }
            if (bArr[i] != fVar.b(i10)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // com.anythink.core.common.n.c.v
    public final x a() {
        return x.f16083c;
    }

    private f a(String str, f fVar) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(fVar.k(), str));
            s sVar = this.f16004b;
            if (sVar != null) {
                byte[] bArr = sVar.f16072c;
                int i = sVar.f16073d;
                mac.update(bArr, i, sVar.f16074e - i);
                s sVar2 = this.f16004b;
                while (true) {
                    sVar2 = sVar2.f16077h;
                    if (sVar2 == this.f16004b) {
                        break;
                    }
                    byte[] bArr2 = sVar2.f16072c;
                    int i4 = sVar2.f16073d;
                    mac.update(bArr2, i4, sVar2.f16074e - i4);
                }
            }
            return f.a(mac.doFinal());
        } catch (InvalidKeyException e6) {
            throw new IllegalArgumentException(e6);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public final a a(a aVar) {
        if (aVar.f16008a == null) {
            aVar.f16008a = this;
            aVar.f16009b = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }
}
