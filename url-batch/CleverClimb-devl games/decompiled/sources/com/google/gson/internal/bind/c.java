package com.google.gson.internal.bind;

import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes2.dex */
public final class c extends com.google.gson.c.a {

    /* renamed from: b, reason: collision with root package name */
    private static final Reader f6589b = new Reader() { // from class: com.google.gson.internal.bind.c.1
        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6590c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Object[] f6591d;
    private int e;
    private String[] f;
    private int[] g;

    @Override // com.google.gson.c.a
    public void a() throws IOException {
        a(com.google.gson.c.b.BEGIN_ARRAY);
        a(((com.google.gson.g) t()).iterator());
        this.g[this.e - 1] = 0;
    }

    @Override // com.google.gson.c.a
    public void b() throws IOException {
        a(com.google.gson.c.b.END_ARRAY);
        u();
        u();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public void c() throws IOException {
        a(com.google.gson.c.b.BEGIN_OBJECT);
        a(((m) t()).a().iterator());
    }

    @Override // com.google.gson.c.a
    public void d() throws IOException {
        a(com.google.gson.c.b.END_OBJECT);
        u();
        u();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public boolean e() throws IOException {
        com.google.gson.c.b f = f();
        return (f == com.google.gson.c.b.END_OBJECT || f == com.google.gson.c.b.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.c.a
    public com.google.gson.c.b f() throws IOException {
        if (this.e == 0) {
            return com.google.gson.c.b.END_DOCUMENT;
        }
        Object t = t();
        if (t instanceof Iterator) {
            boolean z = this.f6591d[this.e - 2] instanceof m;
            Iterator it = (Iterator) t;
            if (!it.hasNext()) {
                return z ? com.google.gson.c.b.END_OBJECT : com.google.gson.c.b.END_ARRAY;
            }
            if (z) {
                return com.google.gson.c.b.NAME;
            }
            a(it.next());
            return f();
        }
        if (t instanceof m) {
            return com.google.gson.c.b.BEGIN_OBJECT;
        }
        if (t instanceof com.google.gson.g) {
            return com.google.gson.c.b.BEGIN_ARRAY;
        }
        if (t instanceof o) {
            o oVar = (o) t;
            if (oVar.r()) {
                return com.google.gson.c.b.STRING;
            }
            if (oVar.a()) {
                return com.google.gson.c.b.BOOLEAN;
            }
            if (oVar.q()) {
                return com.google.gson.c.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (t instanceof l) {
            return com.google.gson.c.b.NULL;
        }
        if (t == f6590c) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    private Object t() {
        return this.f6591d[this.e - 1];
    }

    private Object u() {
        Object[] objArr = this.f6591d;
        int i = this.e - 1;
        this.e = i;
        Object obj = objArr[i];
        this.f6591d[this.e] = null;
        return obj;
    }

    private void a(com.google.gson.c.b bVar) throws IOException {
        if (f() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + f() + v());
    }

    @Override // com.google.gson.c.a
    public String g() throws IOException {
        a(com.google.gson.c.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) t()).next();
        String str = (String) entry.getKey();
        this.f[this.e - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.google.gson.c.a
    public String h() throws IOException {
        com.google.gson.c.b f = f();
        if (f != com.google.gson.c.b.STRING && f != com.google.gson.c.b.NUMBER) {
            throw new IllegalStateException("Expected " + com.google.gson.c.b.STRING + " but was " + f + v());
        }
        String c2 = ((o) u()).c();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return c2;
    }

    @Override // com.google.gson.c.a
    public boolean i() throws IOException {
        a(com.google.gson.c.b.BOOLEAN);
        boolean h = ((o) u()).h();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return h;
    }

    @Override // com.google.gson.c.a
    public void j() throws IOException {
        a(com.google.gson.c.b.NULL);
        u();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public double k() throws IOException {
        com.google.gson.c.b f = f();
        if (f != com.google.gson.c.b.NUMBER && f != com.google.gson.c.b.STRING) {
            throw new IllegalStateException("Expected " + com.google.gson.c.b.NUMBER + " but was " + f + v());
        }
        double d2 = ((o) t()).d();
        if (!q() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + d2);
        }
        u();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return d2;
    }

    @Override // com.google.gson.c.a
    public long l() throws IOException {
        com.google.gson.c.b f = f();
        if (f != com.google.gson.c.b.NUMBER && f != com.google.gson.c.b.STRING) {
            throw new IllegalStateException("Expected " + com.google.gson.c.b.NUMBER + " but was " + f + v());
        }
        long f2 = ((o) t()).f();
        u();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return f2;
    }

    @Override // com.google.gson.c.a
    public int m() throws IOException {
        com.google.gson.c.b f = f();
        if (f != com.google.gson.c.b.NUMBER && f != com.google.gson.c.b.STRING) {
            throw new IllegalStateException("Expected " + com.google.gson.c.b.NUMBER + " but was " + f + v());
        }
        int g = ((o) t()).g();
        u();
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return g;
    }

    @Override // com.google.gson.c.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6591d = new Object[]{f6590c};
        this.e = 1;
    }

    @Override // com.google.gson.c.a
    public void n() throws IOException {
        if (f() == com.google.gson.c.b.NAME) {
            g();
            this.f[this.e - 2] = "null";
        } else {
            u();
            if (this.e > 0) {
                this.f[this.e - 1] = "null";
            }
        }
        if (this.e > 0) {
            int[] iArr = this.g;
            int i = this.e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // com.google.gson.c.a
    public String toString() {
        return getClass().getSimpleName();
    }

    public void o() throws IOException {
        a(com.google.gson.c.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) t()).next();
        a(entry.getValue());
        a(new o((String) entry.getKey()));
    }

    private void a(Object obj) {
        if (this.e == this.f6591d.length) {
            Object[] objArr = new Object[this.e * 2];
            int[] iArr = new int[this.e * 2];
            String[] strArr = new String[this.e * 2];
            System.arraycopy(this.f6591d, 0, objArr, 0, this.e);
            System.arraycopy(this.g, 0, iArr, 0, this.e);
            System.arraycopy(this.f, 0, strArr, 0, this.e);
            this.f6591d = objArr;
            this.g = iArr;
            this.f = strArr;
        }
        Object[] objArr2 = this.f6591d;
        int i = this.e;
        this.e = i + 1;
        objArr2[i] = obj;
    }

    @Override // com.google.gson.c.a
    public String p() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.e) {
            if (this.f6591d[i] instanceof com.google.gson.g) {
                i++;
                if (this.f6591d[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.g[i]);
                    sb.append(']');
                }
            } else if (this.f6591d[i] instanceof m) {
                i++;
                if (this.f6591d[i] instanceof Iterator) {
                    sb.append('.');
                    if (this.f[i] != null) {
                        sb.append(this.f[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private String v() {
        return " at path " + p();
    }
}
