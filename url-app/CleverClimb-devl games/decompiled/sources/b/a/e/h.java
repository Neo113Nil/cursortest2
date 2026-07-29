package b.a.e;

import b.a.e.d;
import c.r;
import c.s;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Http2Reader.java */
/* loaded from: classes.dex */
final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f1958a = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    final d.a f1959b;

    /* renamed from: c, reason: collision with root package name */
    private final c.e f1960c;

    /* renamed from: d, reason: collision with root package name */
    private final a f1961d;
    private final boolean e;

    /* compiled from: Http2Reader.java */
    interface b {
        void a();

        void a(int i, int i2, int i3, boolean z);

        void a(int i, int i2, List<c> list) throws IOException;

        void a(int i, long j);

        void a(int i, b.a.e.b bVar);

        void a(int i, b.a.e.b bVar, c.f fVar);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, int i2, List<c> list);

        void a(boolean z, int i, c.e eVar, int i2) throws IOException;

        void a(boolean z, n nVar);
    }

    public h(c.e eVar, boolean z) {
        this.f1960c = eVar;
        this.e = z;
        this.f1961d = new a(this.f1960c);
        this.f1959b = new d.a(4096, this.f1961d);
    }

    public void a(b bVar) throws IOException {
        if (this.e) {
            if (!a(true, bVar)) {
                throw e.b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        c.f c2 = this.f1960c.c(e.f1913a.g());
        if (f1958a.isLoggable(Level.FINE)) {
            f1958a.fine(b.a.c.a("<< CONNECTION %s", c2.e()));
        }
        if (!e.f1913a.equals(c2)) {
            throw e.b("Expected a connection header but was %s", c2.a());
        }
    }

    public boolean a(boolean z, b bVar) throws IOException {
        try {
            this.f1960c.a(9L);
            int a2 = a(this.f1960c);
            if (a2 < 0 || a2 > 16384) {
                throw e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
            }
            byte i = (byte) (this.f1960c.i() & 255);
            if (z && i != 4) {
                throw e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(i));
            }
            byte i2 = (byte) (this.f1960c.i() & 255);
            int k = this.f1960c.k() & Integer.MAX_VALUE;
            if (f1958a.isLoggable(Level.FINE)) {
                f1958a.fine(e.a(true, k, a2, i, i2));
            }
            switch (i) {
                case 0:
                    b(bVar, a2, i2, k);
                    return true;
                case 1:
                    a(bVar, a2, i2, k);
                    return true;
                case 2:
                    c(bVar, a2, i2, k);
                    return true;
                case 3:
                    d(bVar, a2, i2, k);
                    return true;
                case 4:
                    e(bVar, a2, i2, k);
                    return true;
                case 5:
                    f(bVar, a2, i2, k);
                    return true;
                case 6:
                    g(bVar, a2, i2, k);
                    return true;
                case 7:
                    h(bVar, a2, i2, k);
                    return true;
                case 8:
                    i(bVar, a2, i2, k);
                    return true;
                default:
                    this.f1960c.h(a2);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    private void a(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        short i3 = (b2 & 8) != 0 ? (short) (this.f1960c.i() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            a(bVar, i2);
            i -= 5;
        }
        bVar.a(z, i2, -1, a(a(i, b2, i3), i3, b2, i2));
    }

    private List<c> a(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f1961d;
        this.f1961d.f1965d = i;
        aVar.f1962a = i;
        this.f1961d.e = s;
        this.f1961d.f1963b = b2;
        this.f1961d.f1964c = i2;
        this.f1959b.a();
        return this.f1959b.b();
    }

    private void b(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            throw e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short i3 = (b2 & 8) != 0 ? (short) (this.f1960c.i() & 255) : (short) 0;
        bVar.a(z, i2, this.f1960c, a(i, b2, i3));
        this.f1960c.h(i3);
    }

    private void c(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            throw e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        a(bVar, i2);
    }

    private void a(b bVar, int i) throws IOException {
        int k = this.f1960c.k();
        bVar.a(i, k & Integer.MAX_VALUE, (this.f1960c.i() & 255) + 1, (Integer.MIN_VALUE & k) != 0);
    }

    private void d(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int k = this.f1960c.k();
        b.a.e.b a2 = b.a.e.b.a(k);
        if (a2 == null) {
            throw e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(k));
        }
        bVar.a(i2, a2);
    }

    private void e(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            throw e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i != 0) {
                throw e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.a();
            return;
        }
        if (i % 6 != 0) {
            throw e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        n nVar = new n();
        for (int i3 = 0; i3 < i; i3 += 6) {
            short j = this.f1960c.j();
            int k = this.f1960c.k();
            switch (j) {
                case 2:
                    if (k != 0 && k != 1) {
                        throw e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    }
                    break;
                case 3:
                    j = 4;
                    break;
                case 4:
                    j = 7;
                    if (k < 0) {
                        throw e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                    break;
                case 5:
                    if (k < 16384 || k > 16777215) {
                        throw e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(k));
                    }
                    break;
                    break;
            }
            nVar.a(j, k);
        }
        bVar.a(false, nVar);
    }

    private void f(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 == 0) {
            throw e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short i3 = (b2 & 8) != 0 ? (short) (this.f1960c.i() & 255) : (short) 0;
        bVar.a(i2, this.f1960c.k() & Integer.MAX_VALUE, a(a(i - 4, b2, i3), i3, b2, i2));
    }

    private void g(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 8) {
            throw e.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw e.b("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.a((b2 & 1) != 0, this.f1960c.k(), this.f1960c.k());
    }

    private void h(b bVar, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            throw e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int k = this.f1960c.k();
        int k2 = this.f1960c.k();
        int i3 = i - 8;
        b.a.e.b a2 = b.a.e.b.a(k2);
        if (a2 == null) {
            throw e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(k2));
        }
        c.f fVar = c.f.f2190b;
        if (i3 > 0) {
            fVar = this.f1960c.c(i3);
        }
        bVar.a(k, a2, fVar);
    }

    private void i(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            throw e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long k = this.f1960c.k() & 2147483647L;
        if (k == 0) {
            throw e.b("windowSizeIncrement was 0", Long.valueOf(k));
        }
        bVar.a(i2, k);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1960c.close();
    }

    /* compiled from: Http2Reader.java */
    static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        int f1962a;

        /* renamed from: b, reason: collision with root package name */
        byte f1963b;

        /* renamed from: c, reason: collision with root package name */
        int f1964c;

        /* renamed from: d, reason: collision with root package name */
        int f1965d;
        short e;
        private final c.e f;

        @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public a(c.e eVar) {
            this.f = eVar;
        }

        @Override // c.r
        public long a(c.c cVar, long j) throws IOException {
            while (this.f1965d == 0) {
                this.f.h(this.e);
                this.e = (short) 0;
                if ((this.f1963b & 4) != 0) {
                    return -1L;
                }
                b();
            }
            long a2 = this.f.a(cVar, Math.min(j, this.f1965d));
            if (a2 == -1) {
                return -1L;
            }
            this.f1965d = (int) (this.f1965d - a2);
            return a2;
        }

        @Override // c.r
        public s a() {
            return this.f.a();
        }

        private void b() throws IOException {
            int i = this.f1964c;
            int a2 = h.a(this.f);
            this.f1965d = a2;
            this.f1962a = a2;
            byte i2 = (byte) (this.f.i() & 255);
            this.f1963b = (byte) (this.f.i() & 255);
            if (h.f1958a.isLoggable(Level.FINE)) {
                h.f1958a.fine(e.a(true, this.f1964c, this.f1962a, i2, this.f1963b));
            }
            this.f1964c = this.f.k() & Integer.MAX_VALUE;
            if (i2 != 9) {
                throw e.b("%s != TYPE_CONTINUATION", Byte.valueOf(i2));
            }
            if (this.f1964c != i) {
                throw e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    static int a(c.e eVar) throws IOException {
        return (eVar.i() & 255) | ((eVar.i() & 255) << 16) | ((eVar.i() & 255) << 8);
    }

    static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
