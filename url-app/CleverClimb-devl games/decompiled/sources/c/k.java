package c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Okio.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f2203a = Logger.getLogger(k.class.getName());

    private k() {
    }

    public static e a(r rVar) {
        return new m(rVar);
    }

    public static d a(q qVar) {
        return new l(qVar);
    }

    private static q a(final OutputStream outputStream, final s sVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (sVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new q() { // from class: c.k.1
            @Override // c.q
            public void a_(c cVar, long j) throws IOException {
                t.a(cVar.f2186b, 0L, j);
                while (j > 0) {
                    s.this.g();
                    n nVar = cVar.f2185a;
                    int min = (int) Math.min(j, nVar.f2218c - nVar.f2217b);
                    outputStream.write(nVar.f2216a, nVar.f2217b, min);
                    nVar.f2217b += min;
                    long j2 = min;
                    j -= j2;
                    cVar.f2186b -= j2;
                    if (nVar.f2217b == nVar.f2218c) {
                        cVar.f2185a = nVar.a();
                        o.a(nVar);
                    }
                }
            }

            @Override // c.q, java.io.Flushable
            public void flush() throws IOException {
                outputStream.flush();
            }

            @Override // c.q, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                outputStream.close();
            }

            @Override // c.q
            public s a() {
                return s.this;
            }

            public String toString() {
                return "sink(" + outputStream + ")";
            }
        };
    }

    public static q a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        a c2 = c(socket);
        return c2.a(a(socket.getOutputStream(), c2));
    }

    public static r a(InputStream inputStream) {
        return a(inputStream, new s());
    }

    private static r a(final InputStream inputStream, final s sVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (sVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new r() { // from class: c.k.2
            @Override // c.r
            public long a(c cVar, long j) throws IOException {
                if (j < 0) {
                    throw new IllegalArgumentException("byteCount < 0: " + j);
                }
                if (j == 0) {
                    return 0L;
                }
                try {
                    s.this.g();
                    n e = cVar.e(1);
                    int read = inputStream.read(e.f2216a, e.f2218c, (int) Math.min(j, 8192 - e.f2218c));
                    if (read == -1) {
                        return -1L;
                    }
                    e.f2218c += read;
                    long j2 = read;
                    cVar.f2186b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (k.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }

            @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                inputStream.close();
            }

            @Override // c.r
            public s a() {
                return s.this;
            }

            public String toString() {
                return "source(" + inputStream + ")";
            }
        };
    }

    public static r b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        a c2 = c(socket);
        return c2.a(a(socket.getInputStream(), c2));
    }

    private static a c(final Socket socket) {
        return new a() { // from class: c.k.3
            @Override // c.a
            protected IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // c.a
            protected void a() {
                try {
                    socket.close();
                } catch (AssertionError e) {
                    if (k.a(e)) {
                        k.f2203a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    k.f2203a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                }
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
