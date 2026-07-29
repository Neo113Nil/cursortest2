package com.google.gson.c;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f6504a = new String[128];

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f6505b;

    /* renamed from: c, reason: collision with root package name */
    private final Writer f6506c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f6507d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            f6504a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        f6504a[34] = "\\\"";
        f6504a[92] = "\\\\";
        f6504a[9] = "\\t";
        f6504a[8] = "\\b";
        f6504a[10] = "\\n";
        f6504a[13] = "\\r";
        f6504a[12] = "\\f";
        f6505b = (String[]) f6504a.clone();
        f6505b[60] = "\\u003c";
        f6505b[62] = "\\u003e";
        f6505b[38] = "\\u0026";
        f6505b[61] = "\\u003d";
        f6505b[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.g = ":";
        this.k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f6506c = writer;
    }

    public final void c(String str) {
        if (str.length() == 0) {
            this.f = null;
            this.g = ":";
        } else {
            this.f = str;
            this.g = ": ";
        }
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public boolean g() {
        return this.h;
    }

    public final void c(boolean z) {
        this.i = z;
    }

    public final boolean h() {
        return this.i;
    }

    public final void d(boolean z) {
        this.k = z;
    }

    public final boolean i() {
        return this.k;
    }

    public c b() throws IOException {
        j();
        return a(1, "[");
    }

    public c c() throws IOException {
        return a(1, 2, "]");
    }

    public c d() throws IOException {
        j();
        return a(3, "{");
    }

    public c e() throws IOException {
        return a(3, 5, "}");
    }

    private c a(int i, String str) throws IOException {
        m();
        a(i);
        this.f6506c.write(str);
        return this;
    }

    private c a(int i, int i2, String str) throws IOException {
        int a2 = a();
        if (a2 != i2 && a2 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.j != null) {
            throw new IllegalStateException("Dangling name: " + this.j);
        }
        this.e--;
        if (a2 == i2) {
            k();
        }
        this.f6506c.write(str);
        return this;
    }

    private void a(int i) {
        if (this.e == this.f6507d.length) {
            int[] iArr = new int[this.e * 2];
            System.arraycopy(this.f6507d, 0, iArr, 0, this.e);
            this.f6507d = iArr;
        }
        int[] iArr2 = this.f6507d;
        int i2 = this.e;
        this.e = i2 + 1;
        iArr2[i2] = i;
    }

    private int a() {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f6507d[this.e - 1];
    }

    private void b(int i) {
        this.f6507d[this.e - 1] = i;
    }

    public c a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.j != null) {
            throw new IllegalStateException();
        }
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.j = str;
        return this;
    }

    private void j() throws IOException {
        if (this.j != null) {
            l();
            d(this.j);
            this.j = null;
        }
    }

    public c b(String str) throws IOException {
        if (str == null) {
            return f();
        }
        j();
        m();
        d(str);
        return this;
    }

    public c f() throws IOException {
        if (this.j != null) {
            if (this.k) {
                j();
            } else {
                this.j = null;
                return this;
            }
        }
        m();
        this.f6506c.write("null");
        return this;
    }

    public c a(boolean z) throws IOException {
        j();
        m();
        this.f6506c.write(z ? "true" : "false");
        return this;
    }

    public c a(Boolean bool) throws IOException {
        if (bool == null) {
            return f();
        }
        j();
        m();
        this.f6506c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(long j) throws IOException {
        j();
        m();
        this.f6506c.write(Long.toString(j));
        return this;
    }

    public c a(Number number) throws IOException {
        if (number == null) {
            return f();
        }
        j();
        String obj = number.toString();
        if (!this.h && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m();
        this.f6506c.append((CharSequence) obj);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6506c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6506c.close();
        int i = this.e;
        if (i > 1 || (i == 1 && this.f6507d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(String str) throws IOException {
        int i;
        String str2;
        String[] strArr = this.i ? f6505b : f6504a;
        this.f6506c.write("\"");
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.f6506c.write(str, i2, i - i2);
                }
                this.f6506c.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.f6506c.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.f6506c.write(str, i2, length - i2);
        }
        this.f6506c.write("\"");
    }

    private void k() throws IOException {
        if (this.f == null) {
            return;
        }
        this.f6506c.write("\n");
        int i = this.e;
        for (int i2 = 1; i2 < i; i2++) {
            this.f6506c.write(this.f);
        }
    }

    private void l() throws IOException {
        int a2 = a();
        if (a2 == 5) {
            this.f6506c.write(44);
        } else if (a2 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        b(4);
    }

    private void m() throws IOException {
        switch (a()) {
            case 1:
                b(2);
                k();
                return;
            case 2:
                this.f6506c.append(',');
                k();
                return;
            case 3:
            case 5:
            default:
                throw new IllegalStateException("Nesting problem.");
            case 4:
                this.f6506c.append((CharSequence) this.g);
                b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
        }
        b(7);
    }
}
