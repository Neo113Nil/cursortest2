package org.apache.a.k;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.a.j;
import org.apache.a.w;
import org.apache.a.y;

/* compiled from: EntityUtils.java */
/* loaded from: classes2.dex */
public final class d {
    public static void a(j jVar) throws IOException {
        InputStream f;
        if (jVar == null || !jVar.g() || (f = jVar.f()) == null) {
            return;
        }
        f.close();
    }

    public static byte[] b(j jVar) throws IOException {
        if (jVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream f = jVar.f();
        if (f == null) {
            return null;
        }
        try {
            if (jVar.c() > 2147483647L) {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
            int c2 = (int) jVar.c();
            if (c2 < 0) {
                c2 = 4096;
            }
            a aVar = new a(c2);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = f.read(bArr);
                if (read != -1) {
                    aVar.a(bArr, 0, read);
                } else {
                    return aVar.b();
                }
            }
        } finally {
            f.close();
        }
    }

    public static String c(j jVar) throws y {
        w a2;
        if (jVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        if (jVar.d() == null) {
            return null;
        }
        org.apache.a.e[] e = jVar.d().e();
        if (e.length <= 0 || (a2 = e[0].a("charset")) == null) {
            return null;
        }
        return a2.b();
    }

    public static String a(j jVar, String str) throws IOException, y {
        if (jVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream f = jVar.f();
        if (f == null) {
            return null;
        }
        try {
            if (jVar.c() > 2147483647L) {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
            int c2 = (int) jVar.c();
            if (c2 < 0) {
                c2 = 4096;
            }
            String c3 = c(jVar);
            if (c3 == null) {
                c3 = str;
            }
            if (c3 == null) {
                c3 = "ISO-8859-1";
            }
            InputStreamReader inputStreamReader = new InputStreamReader(f, c3);
            b bVar = new b(c2);
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    bVar.a(cArr, 0, read);
                } else {
                    return bVar.toString();
                }
            }
        } finally {
            f.close();
        }
    }

    public static String d(j jVar) throws IOException, y {
        return a(jVar, null);
    }
}
