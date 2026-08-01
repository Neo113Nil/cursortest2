package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes.dex */
public final class e extends com.bykv.vk.openvk.preload.a.d.a {
    private static final Reader c = new Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object d = new Object();
    private Object[] e;
    private int f;
    private String[] g;
    private int[] h;

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void a() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY);
        a(((com.bykv.vk.openvk.preload.a.i) g()).iterator());
        this.h[this.f - 1] = 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void b() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_ARRAY);
        s();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void c() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT);
        a(((com.bykv.vk.openvk.preload.a.n) g()).a.entrySet().iterator());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void d() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_OBJECT);
        s();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean e() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f = f();
        return (f == com.bykv.vk.openvk.preload.a.d.b.END_OBJECT || f == com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) ? false : true;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final com.bykv.vk.openvk.preload.a.d.b f() throws IOException {
        while (this.f != 0) {
            Object g = g();
            if (g instanceof Iterator) {
                boolean z = this.e[this.f - 2] instanceof com.bykv.vk.openvk.preload.a.n;
                Iterator it = (Iterator) g;
                if (!it.hasNext()) {
                    return z ? com.bykv.vk.openvk.preload.a.d.b.END_OBJECT : com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
                }
                if (z) {
                    return com.bykv.vk.openvk.preload.a.d.b.NAME;
                }
                a(it.next());
            } else {
                if (g instanceof com.bykv.vk.openvk.preload.a.n) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
                }
                if (g instanceof com.bykv.vk.openvk.preload.a.i) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
                }
                if (g instanceof p) {
                    p pVar = (p) g;
                    if (pVar.a instanceof String) {
                        return com.bykv.vk.openvk.preload.a.d.b.STRING;
                    }
                    if (pVar.a instanceof Boolean) {
                        return com.bykv.vk.openvk.preload.a.d.b.BOOLEAN;
                    }
                    if (pVar.a instanceof Number) {
                        return com.bykv.vk.openvk.preload.a.d.b.NUMBER;
                    }
                    throw new AssertionError();
                }
                if (g instanceof com.bykv.vk.openvk.preload.a.m) {
                    return com.bykv.vk.openvk.preload.a.d.b.NULL;
                }
                if (g == d) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
        return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
    }

    public final Object g() {
        return this.e[this.f - 1];
    }

    private Object s() {
        Object[] objArr = this.e;
        int i = this.f - 1;
        this.f = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void a(com.bykv.vk.openvk.preload.a.d.b bVar) throws IOException {
        if (f() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f() + t());
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String h() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) g()).next();
        String str = (String) entry.getKey();
        this.g[this.f - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String i() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f = f();
        if (f != com.bykv.vk.openvk.preload.a.d.b.STRING && f != com.bykv.vk.openvk.preload.a.d.b.NUMBER) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.STRING + " but was " + f + t());
        }
        String b = ((p) s()).b();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return b;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean j() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BOOLEAN);
        boolean f = ((p) s()).f();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void k() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NULL);
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final double l() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f = f();
        if (f != com.bykv.vk.openvk.preload.a.d.b.NUMBER && f != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + f + t());
        }
        double c2 = ((p) g()).c();
        if (!this.a && (Double.isNaN(c2) || Double.isInfinite(c2))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(c2)));
        }
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return c2;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final long m() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f = f();
        if (f != com.bykv.vk.openvk.preload.a.d.b.NUMBER && f != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + f + t());
        }
        long d2 = ((p) g()).d();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d2;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final int n() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b f = f();
        if (f != com.bykv.vk.openvk.preload.a.d.b.NUMBER && f != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + f + t());
        }
        int e = ((p) g()).e();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e = new Object[]{d};
        this.f = 1;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void o() throws IOException {
        if (f() == com.bykv.vk.openvk.preload.a.d.b.NAME) {
            h();
            this.g[this.f - 2] = AbstractJsonLexerKt.NULL;
        } else {
            s();
            int i = this.f;
            if (i > 0) {
                this.g[i - 1] = AbstractJsonLexerKt.NULL;
            }
        }
        int i2 = this.f;
        if (i2 > 0) {
            int[] iArr = this.h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String toString() {
        return getClass().getSimpleName();
    }

    public final void a(Object obj) {
        int i = this.f;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.e = Arrays.copyOf(objArr, i2);
            this.h = Arrays.copyOf(this.h, i2);
            this.g = (String[]) Arrays.copyOf(this.g, i2);
        }
        Object[] objArr2 = this.e;
        int i3 = this.f;
        this.f = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String p() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f) {
            Object[] objArr = this.e;
            Object obj = objArr[i];
            if (obj instanceof com.bykv.vk.openvk.preload.a.i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.h[i]).append(AbstractJsonLexerKt.END_LIST);
                }
            } else if (obj instanceof com.bykv.vk.openvk.preload.a.n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.g[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private String t() {
        return " at path " + p();
    }
}
