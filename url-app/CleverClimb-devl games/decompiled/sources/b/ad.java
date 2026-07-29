package b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: ResponseBody.java */
/* loaded from: classes.dex */
public abstract class ad implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private Reader f2056a;

    public abstract v a();

    public abstract long b();

    public abstract c.e c();

    public final Reader d() {
        Reader reader = this.f2056a;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(c(), e());
        this.f2056a = aVar;
        return aVar;
    }

    private Charset e() {
        v a2 = a();
        return a2 != null ? a2.a(b.a.c.e) : b.a.c.e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b.a.c.a(c());
    }

    public static ad a(v vVar, String str) {
        Charset charset = b.a.c.e;
        if (vVar != null && (charset = vVar.b()) == null) {
            charset = b.a.c.e;
            vVar = v.a(vVar + "; charset=utf-8");
        }
        c.c a2 = new c.c().a(str, charset);
        return a(vVar, a2.b(), a2);
    }

    public static ad a(v vVar, byte[] bArr) {
        return a(vVar, bArr.length, new c.c().c(bArr));
    }

    public static ad a(final v vVar, final long j, final c.e eVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        return new ad() { // from class: b.ad.1
            @Override // b.ad
            public v a() {
                return v.this;
            }

            @Override // b.ad
            public long b() {
                return j;
            }

            @Override // b.ad
            public c.e c() {
                return eVar;
            }
        };
    }

    /* compiled from: ResponseBody.java */
    static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        private final c.e f2060a;

        /* renamed from: b, reason: collision with root package name */
        private final Charset f2061b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2062c;

        /* renamed from: d, reason: collision with root package name */
        private Reader f2063d;

        a(c.e eVar, Charset charset) {
            this.f2060a = eVar;
            this.f2061b = charset;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f2062c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f2063d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f2060a.g(), b.a.c.a(this.f2060a, this.f2061b));
                this.f2063d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f2062c = true;
            if (this.f2063d != null) {
                this.f2063d.close();
            } else {
                this.f2060a.close();
            }
        }
    }
}
