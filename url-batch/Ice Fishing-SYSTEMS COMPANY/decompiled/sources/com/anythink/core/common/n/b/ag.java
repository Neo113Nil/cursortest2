package com.anythink.core.common.n.b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public abstract class ag implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private Reader f15682a;

    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15686a;

        /* renamed from: b, reason: collision with root package name */
        private final Charset f15687b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15688c;

        /* renamed from: d, reason: collision with root package name */
        private Reader f15689d;

        public a(com.anythink.core.common.n.c.e eVar, Charset charset) {
            this.f15686a = eVar;
            this.f15687b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f15688c = true;
            Reader reader = this.f15689d;
            if (reader != null) {
                reader.close();
            } else {
                this.f15686a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i4) {
            if (this.f15688c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f15689d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f15686a.i(), com.anythink.core.common.n.b.a.c.a(this.f15686a, this.f15687b));
                this.f15689d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i4);
        }
    }

    private static ag a(x xVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (xVar != null) {
            Charset a9 = xVar.a((Charset) null);
            if (a9 == null) {
                xVar = x.b(xVar + "; charset=utf-8");
            } else {
                charset = a9;
            }
        }
        com.anythink.core.common.n.c.c b9 = new com.anythink.core.common.n.c.c().b(str, charset);
        return a(xVar, b9.b(), b9);
    }

    private InputStream e() {
        return c().i();
    }

    private byte[] f() {
        long b9 = b();
        if (b9 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(b9)));
        }
        com.anythink.core.common.n.c.e c4 = c();
        try {
            byte[] y6 = c4.y();
            c4.close();
            if (b9 == -1 || b9 == y6.length) {
                return y6;
            }
            StringBuilder sb = new StringBuilder("Content-Length (");
            sb.append(b9);
            sb.append(") and stream length (");
            throw new IOException(AbstractC5051n.e(y6.length, ") disagree", sb));
        } catch (Throwable th) {
            if (c4 != null) {
                try {
                    c4.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Reader g() {
        Reader reader = this.f15682a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(c(), h());
        this.f15682a = aVar;
        return aVar;
    }

    private Charset h() {
        x a9 = a();
        return a9 != null ? a9.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public abstract x a();

    public abstract long b();

    public abstract com.anythink.core.common.n.c.e c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.anythink.core.common.n.b.a.c.a(c());
    }

    public final String d() {
        com.anythink.core.common.n.c.e c4 = c();
        try {
            String a9 = c4.a(com.anythink.core.common.n.b.a.c.a(c4, h()));
            c4.close();
            return a9;
        } catch (Throwable th) {
            if (c4 != null) {
                try {
                    c4.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ag a(x xVar, byte[] bArr) {
        return a(xVar, bArr.length, new com.anythink.core.common.n.c.c().d(bArr));
    }

    private static ag a(x xVar, com.anythink.core.common.n.c.f fVar) {
        return a(xVar, fVar.j(), new com.anythink.core.common.n.c.c().d(fVar));
    }

    public static ag a(final x xVar, final long j9, final com.anythink.core.common.n.c.e eVar) {
        if (eVar != null) {
            return new ag() { // from class: com.anythink.core.common.n.b.ag.1
                @Override // com.anythink.core.common.n.b.ag
                public final x a() {
                    return x.this;
                }

                @Override // com.anythink.core.common.n.b.ag
                public final long b() {
                    return j9;
                }

                @Override // com.anythink.core.common.n.b.ag
                public final com.anythink.core.common.n.c.e c() {
                    return eVar;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
