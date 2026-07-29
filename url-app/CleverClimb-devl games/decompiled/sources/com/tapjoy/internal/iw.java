package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class iw {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f8421a = Logger.getLogger(iw.class.getName());

    private iw() {
    }

    public static iu a(jd jdVar) {
        if (jdVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        return new iy(jdVar);
    }

    public static it a(jc jcVar) {
        if (jcVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        return new ix(jcVar);
    }

    public static jc a(final OutputStream outputStream) {
        final je jeVar = new je();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new jc() { // from class: com.tapjoy.internal.iw.1
            @Override // com.tapjoy.internal.jc
            public final void a(is isVar, long j) {
                jf.a(isVar.f8416b, 0L, j);
                while (j > 0) {
                    je.this.a();
                    iz izVar = isVar.f8415a;
                    int min = (int) Math.min(j, izVar.f8434c - izVar.f8433b);
                    outputStream.write(izVar.f8432a, izVar.f8433b, min);
                    izVar.f8433b += min;
                    long j2 = min;
                    j -= j2;
                    isVar.f8416b -= j2;
                    if (izVar.f8433b == izVar.f8434c) {
                        isVar.f8415a = izVar.a();
                        ja.a(izVar);
                    }
                }
            }

            @Override // com.tapjoy.internal.jc, java.io.Flushable
            public final void flush() {
                outputStream.flush();
            }

            @Override // com.tapjoy.internal.jc, java.io.Closeable, java.lang.AutoCloseable, com.tapjoy.internal.jd
            public final void close() {
                outputStream.close();
            }

            public final String toString() {
                return "sink(" + outputStream + ")";
            }
        };
    }

    public static jd a(final InputStream inputStream) {
        final je jeVar = new je();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new jd() { // from class: com.tapjoy.internal.iw.2
            @Override // com.tapjoy.internal.jd
            public final long b(is isVar, long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("byteCount < 0: " + j);
                }
                if (j == 0) {
                    return 0L;
                }
                try {
                    je.this.a();
                    iz c2 = isVar.c(1);
                    int read = inputStream.read(c2.f8432a, c2.f8434c, (int) Math.min(j, 8192 - c2.f8434c));
                    if (read == -1) {
                        return -1L;
                    }
                    c2.f8434c += read;
                    long j2 = read;
                    isVar.f8416b += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (iw.a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }

            @Override // com.tapjoy.internal.jd, java.lang.AutoCloseable
            public final void close() {
                inputStream.close();
            }

            public final String toString() {
                return "source(" + inputStream + ")";
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
