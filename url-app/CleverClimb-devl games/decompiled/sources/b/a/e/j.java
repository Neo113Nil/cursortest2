package b.a.e;

import b.a.e.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Http2Writer.java */
/* loaded from: classes.dex */
final class j implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f1979b = Logger.getLogger(e.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private final c.d f1981c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1982d;
    private boolean g;
    private final c.c e = new c.c();

    /* renamed from: a, reason: collision with root package name */
    final d.b f1980a = new d.b(this.e);
    private int f = 16384;

    public j(c.d dVar, boolean z) {
        this.f1981c = dVar;
        this.f1982d = z;
    }

    public synchronized void a() throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (this.f1982d) {
            if (f1979b.isLoggable(Level.FINE)) {
                f1979b.fine(b.a.c.a(">> CONNECTION %s", e.f1913a.e()));
            }
            this.f1981c.c(e.f1913a.h());
            this.f1981c.flush();
        }
    }

    public synchronized void a(n nVar) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        this.f = nVar.d(this.f);
        if (nVar.c() != -1) {
            this.f1980a.a(nVar.c());
        }
        a(0, 0, (byte) 4, (byte) 1);
        this.f1981c.flush();
    }

    public synchronized void a(int i, int i2, List<c> list) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        this.f1980a.a(list);
        long b2 = this.e.b();
        int min = (int) Math.min(this.f - 4, b2);
        long j = min;
        a(i, min + 4, (byte) 5, b2 == j ? (byte) 4 : (byte) 0);
        this.f1981c.g(i2 & Integer.MAX_VALUE);
        this.f1981c.a_(this.e, j);
        if (b2 > j) {
            b(i, b2 - j);
        }
    }

    public synchronized void b() throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        this.f1981c.flush();
    }

    public synchronized void a(boolean z, int i, int i2, List<c> list) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        a(z, i, list);
    }

    public synchronized void a(int i, b bVar) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (bVar.g == -1) {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte) 3, (byte) 0);
        this.f1981c.g(bVar.g);
        this.f1981c.flush();
    }

    public int c() {
        return this.f;
    }

    public synchronized void a(boolean z, int i, c.c cVar, int i2) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        a(i, z ? (byte) 1 : (byte) 0, cVar, i2);
    }

    void a(int i, byte b2, c.c cVar, int i2) throws IOException {
        a(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.f1981c.a_(cVar, i2);
        }
    }

    public synchronized void b(n nVar) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        int i = 0;
        a(0, nVar.b() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (nVar.a(i)) {
                this.f1981c.h(i == 4 ? 3 : i == 7 ? 4 : i);
                this.f1981c.g(nVar.b(i));
            }
            i++;
        }
        this.f1981c.flush();
    }

    public synchronized void a(boolean z, int i, int i2) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f1981c.g(i);
        this.f1981c.g(i2);
        this.f1981c.flush();
    }

    public synchronized void a(int i, b bVar, byte[] bArr) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (bVar.g == -1) {
            throw e.a("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f1981c.g(i);
        this.f1981c.g(bVar.g);
        if (bArr.length > 0) {
            this.f1981c.c(bArr);
        }
        this.f1981c.flush();
    }

    public synchronized void a(int i, long j) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        a(i, 4, (byte) 8, (byte) 0);
        this.f1981c.g((int) j);
        this.f1981c.flush();
    }

    public void a(int i, int i2, byte b2, byte b3) throws IOException {
        if (f1979b.isLoggable(Level.FINE)) {
            f1979b.fine(e.a(false, i, i2, b2, b3));
        }
        if (i2 > this.f) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw e.a("reserved bit set: %s", Integer.valueOf(i));
        }
        a(this.f1981c, i2);
        this.f1981c.i(b2 & 255);
        this.f1981c.i(b3 & 255);
        this.f1981c.g(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.g = true;
        this.f1981c.close();
    }

    private static void a(c.d dVar, int i) throws IOException {
        dVar.i((i >>> 16) & 255);
        dVar.i((i >>> 8) & 255);
        dVar.i(i & 255);
    }

    private void b(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min(this.f, j);
            long j2 = min;
            j -= j2;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f1981c.a_(this.e, j2);
        }
    }

    void a(boolean z, int i, List<c> list) throws IOException {
        if (this.g) {
            throw new IOException("closed");
        }
        this.f1980a.a(list);
        long b2 = this.e.b();
        int min = (int) Math.min(this.f, b2);
        long j = min;
        byte b3 = b2 == j ? (byte) 4 : (byte) 0;
        if (z) {
            b3 = (byte) (b3 | 1);
        }
        a(i, min, (byte) 1, b3);
        this.f1981c.a_(this.e, j);
        if (b2 > j) {
            b(i, b2 - j);
        }
    }
}
