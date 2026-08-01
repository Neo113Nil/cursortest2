package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: JsonWriter.java */
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final Writer f;
    private int[] g = new int[32];
    private int h = 0;
    private String i;
    private String j;
    private String k;

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.j = ":";
        this.e = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f = writer;
    }

    public final void c(String str) {
        if (str.length() == 0) {
            this.i = null;
            this.j = ":";
        } else {
            this.i = str;
            this.j = ": ";
        }
    }

    public c a() throws IOException {
        g();
        return a(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public c b() throws IOException {
        return a(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public c c() throws IOException {
        g();
        return a(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public c d() throws IOException {
        return a(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    private c a(int i, char c) throws IOException {
        j();
        a(i);
        this.f.write(c);
        return this;
    }

    private c a(int i, int i2, char c) throws IOException {
        int f = f();
        if (f != i2 && f != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Dangling name: " + this.k);
        }
        this.h--;
        if (f == i2) {
            h();
        }
        this.f.write(c);
        return this;
    }

    private void a(int i) {
        int i2 = this.h;
        int[] iArr = this.g;
        if (i2 == iArr.length) {
            this.g = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr2[i3] = i;
    }

    private int f() {
        int i = this.h;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.g[i - 1];
    }

    private void b(int i) {
        this.g[this.h - 1] = i;
    }

    public c a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.k != null) {
            throw new IllegalStateException();
        }
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.k = str;
        return this;
    }

    private void g() throws IOException {
        if (this.k != null) {
            i();
            d(this.k);
            this.k = null;
        }
    }

    public c b(String str) throws IOException {
        if (str == null) {
            return e();
        }
        g();
        j();
        d(str);
        return this;
    }

    public c e() throws IOException {
        if (this.k != null) {
            if (this.e) {
                g();
            } else {
                this.k = null;
                return this;
            }
        }
        j();
        this.f.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public c a(boolean z) throws IOException {
        g();
        j();
        this.f.write(z ? "true" : "false");
        return this;
    }

    public c a(Boolean bool) throws IOException {
        if (bool == null) {
            return e();
        }
        g();
        j();
        this.f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(long j) throws IOException {
        g();
        j();
        this.f.write(Long.toString(j));
        return this;
    }

    public c a(Number number) throws IOException {
        if (number == null) {
            return e();
        }
        g();
        String obj = number.toString();
        if (!this.c && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        j();
        this.f.append((CharSequence) obj);
        return this;
    }

    public void flush() throws IOException {
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f.close();
        int i = this.h;
        if (i > 1 || (i == 1 && this.g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.h = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(String str) throws IOException {
        int i;
        String str2;
        String[] strArr = this.d ? b : a;
        this.f.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.f.write(str, i2, i - i2);
                }
                this.f.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.f.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.f.write(str, i2, length - i2);
        }
        this.f.write(34);
    }

    private void h() throws IOException {
        if (this.i == null) {
            return;
        }
        this.f.write(10);
        int i = this.h;
        for (int i2 = 1; i2 < i; i2++) {
            this.f.write(this.i);
        }
    }

    private void i() throws IOException {
        int f = f();
        if (f == 5) {
            this.f.write(44);
        } else if (f != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        h();
        b(4);
    }

    private void j() throws IOException {
        int f = f();
        if (f == 1) {
            b(2);
            h();
            return;
        }
        if (f == 2) {
            this.f.append(AbstractJsonLexerKt.COMMA);
            h();
        } else {
            if (f != 4) {
                if (f != 6) {
                    if (f == 7) {
                        if (!this.c) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                b(7);
                return;
            }
            this.f.append((CharSequence) this.j);
            b(5);
        }
    }
}
