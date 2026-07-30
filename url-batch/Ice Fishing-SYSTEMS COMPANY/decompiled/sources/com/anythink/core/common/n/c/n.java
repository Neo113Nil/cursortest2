package com.anythink.core.common.n.c;

import android.os.Build;
import com.anythink.core.common.n.c.a.AnonymousClass1;
import com.anythink.core.common.n.c.a.AnonymousClass2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f16048a = Logger.getLogger(n.class.getName());

    private n() {
    }

    public static e a(w wVar) {
        return new r(wVar);
    }

    public static v b(File file) {
        if (file != null) {
            return a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static v c(File file) {
        if (file != null) {
            return a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static d a(v vVar) {
        return new q(vVar);
    }

    private static v a(OutputStream outputStream) {
        return a(outputStream, new x());
    }

    private static v b(Path path, OpenOption... openOptionArr) {
        OutputStream newOutputStream;
        if (path != null) {
            newOutputStream = Files.newOutputStream(path, openOptionArr);
            return a(newOutputStream);
        }
        throw new IllegalArgumentException("path == null");
    }

    private static a c(final Socket socket) {
        return new a() { // from class: com.anythink.core.common.n.c.n.4
            @Override // com.anythink.core.common.n.c.a
            public final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.anythink.core.common.n.c.a
            public final void a() {
                try {
                    socket.close();
                } catch (AssertionError e6) {
                    if (n.a(e6)) {
                        n.f16048a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
                        return;
                    }
                    throw e6;
                } catch (Exception e9) {
                    n.f16048a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
                }
            }
        };
    }

    private static v a(final OutputStream outputStream, final x xVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (xVar != null) {
            return new v() { // from class: com.anythink.core.common.n.c.n.1
                @Override // com.anythink.core.common.n.c.v
                public final void a(c cVar, long j9) {
                    y.a(cVar.f16005c, 0L, j9);
                    while (j9 > 0) {
                        x.this.g();
                        s sVar = cVar.f16004b;
                        int min = (int) Math.min(j9, sVar.f16074e - sVar.f16073d);
                        outputStream.write(sVar.f16072c, sVar.f16073d, min);
                        int i = sVar.f16073d + min;
                        sVar.f16073d = i;
                        long j10 = min;
                        j9 -= j10;
                        cVar.f16005c -= j10;
                        if (i == sVar.f16074e) {
                            cVar.f16004b = sVar.c();
                            t.a(sVar);
                        }
                    }
                }

                @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    outputStream.close();
                }

                @Override // com.anythink.core.common.n.c.v, java.io.Flushable
                public final void flush() {
                    outputStream.flush();
                }

                public final String toString() {
                    return "sink(" + outputStream + ")";
                }

                @Override // com.anythink.core.common.n.c.v
                public final x a() {
                    return x.this;
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static w b(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                a c4 = c(socket);
                return c4.new AnonymousClass2(a(socket.getInputStream(), c4));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static v a(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                a c4 = c(socket);
                return c4.new AnonymousClass1(a(socket.getOutputStream(), c4));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static w a(InputStream inputStream) {
        return a(inputStream, new x());
    }

    private static w a(final InputStream inputStream, final x xVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (xVar != null) {
            return new w() { // from class: com.anythink.core.common.n.c.n.2
                @Override // com.anythink.core.common.n.c.w
                public final x a() {
                    return x.this;
                }

                @Override // com.anythink.core.common.n.c.w
                public final long a_(c cVar, long j9) {
                    if (j9 < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j9)));
                    }
                    if (j9 == 0) {
                        return 0L;
                    }
                    try {
                        x.this.g();
                        s g9 = cVar.g(1);
                        int read = inputStream.read(g9.f16072c, g9.f16074e, (int) Math.min(j9, 8192 - g9.f16074e));
                        if (read == -1) {
                            return -1L;
                        }
                        g9.f16074e += read;
                        long j10 = read;
                        cVar.f16005c += j10;
                        return j10;
                    } catch (AssertionError e6) {
                        if (n.a(e6)) {
                            throw new IOException(e6);
                        }
                        throw e6;
                    }
                }

                @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    inputStream.close();
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static w a(File file) {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    private static w a(Path path, OpenOption... openOptionArr) {
        File file;
        InputStream newInputStream;
        if (path != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                newInputStream = Files.newInputStream(path, openOptionArr);
                return a(newInputStream);
            }
            file = path.toFile();
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static v a() {
        return new v() { // from class: com.anythink.core.common.n.c.n.3
            @Override // com.anythink.core.common.n.c.v
            public final void a(c cVar, long j9) {
                cVar.i(j9);
            }

            @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // com.anythink.core.common.n.c.v, java.io.Flushable
            public final void flush() {
            }

            @Override // com.anythink.core.common.n.c.v
            public final x a() {
                return x.f16083c;
            }
        };
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
