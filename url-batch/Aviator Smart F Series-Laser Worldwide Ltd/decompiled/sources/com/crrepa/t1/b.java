package com.crrepa.t1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class b implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f13832j = new String[128];

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f13833k;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f13834a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f13835b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f13836c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f13837d;

    /* renamed from: e, reason: collision with root package name */
    private String f13838e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13839f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13840g;

    /* renamed from: h, reason: collision with root package name */
    private String f13841h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13842i;

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            f13832j[i8] = String.format("\\u%04x", Integer.valueOf(i8));
        }
        String[] strArr = f13832j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f13833k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        a(6);
        this.f13838e = ":";
        this.f13842i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f13834a = writer;
    }

    private void j() {
        if (this.f13837d == null) {
            return;
        }
        this.f13834a.write(10);
        int i8 = this.f13836c;
        for (int i9 = 1; i9 < i8; i9++) {
            this.f13834a.write(this.f13837d);
        }
    }

    private int l() {
        int i8 = this.f13836c;
        if (i8 != 0) {
            return this.f13835b[i8 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void m() {
        if (this.f13841h != null) {
            a();
            d(this.f13841h);
            this.f13841h = null;
        }
    }

    public b a(double d8) {
        m();
        if (this.f13839f || !(Double.isNaN(d8) || Double.isInfinite(d8))) {
            b();
            this.f13834a.append((CharSequence) Double.toString(d8));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d8);
    }

    public b b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f13841h != null) {
            throw new IllegalStateException();
        }
        if (this.f13836c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f13841h = str;
        return this;
    }

    public b c() {
        m();
        return a(1, '[');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f13834a.close();
        int i8 = this.f13836c;
        if (i8 > 1 || (i8 == 1 && this.f13835b[i8 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f13836c = 0;
    }

    public b d() {
        m();
        return a(3, '{');
    }

    public b e() {
        return a(1, 2, ']');
    }

    public b f() {
        return a(3, 5, '}');
    }

    public void flush() {
        if (this.f13836c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f13834a.flush();
    }

    public final boolean g() {
        return this.f13842i;
    }

    public final boolean h() {
        return this.f13840g;
    }

    public boolean i() {
        return this.f13839f;
    }

    public b k() {
        if (this.f13841h != null) {
            if (!this.f13842i) {
                this.f13841h = null;
                return this;
            }
            m();
        }
        b();
        this.f13834a.write("null");
        return this;
    }

    private b a(int i8, char c8) {
        b();
        a(i8);
        this.f13834a.write(c8);
        return this;
    }

    private void b() {
        int l8 = l();
        if (l8 == 1) {
            b(2);
        } else {
            if (l8 != 2) {
                if (l8 == 4) {
                    this.f13834a.append((CharSequence) this.f13838e);
                    b(5);
                    return;
                }
                if (l8 != 6) {
                    if (l8 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f13839f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                b(7);
                return;
            }
            this.f13834a.append(',');
        }
        j();
    }

    public final void c(String str) {
        String str2;
        if (str.length() == 0) {
            this.f13837d = null;
            str2 = ":";
        } else {
            this.f13837d = str;
            str2 = ": ";
        }
        this.f13838e = str2;
    }

    public b d(boolean z7) {
        m();
        b();
        this.f13834a.write(z7 ? "true" : "false");
        return this;
    }

    public b e(String str) {
        if (str == null) {
            return k();
        }
        m();
        b();
        d(str);
        return this;
    }

    private b a(int i8, int i9, char c8) {
        int l8 = l();
        if (l8 != i9 && l8 != i8) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f13841h != null) {
            throw new IllegalStateException("Dangling name: " + this.f13841h);
        }
        this.f13836c--;
        if (l8 == i9) {
            j();
        }
        this.f13834a.write(c8);
        return this;
    }

    private void b(int i8) {
        this.f13835b[this.f13836c - 1] = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d(String str) {
        int i8;
        String str2;
        String[] strArr = this.f13840g ? f13833k : f13832j;
        this.f13834a.write(34);
        int length = str.length();
        int i9 = 0;
        while (i8 < length) {
            char charAt = str.charAt(i8);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i8 = str2 == null ? i8 + 1 : 0;
                if (i9 < i8) {
                    this.f13834a.write(str, i9, i8 - i9);
                }
                this.f13834a.write(str2);
                i9 = i8 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i9 < i8) {
                }
                this.f13834a.write(str2);
                i9 = i8 + 1;
            }
        }
        if (i9 < length) {
            this.f13834a.write(str, i9, length - i9);
        }
        this.f13834a.write(34);
    }

    public final void c(boolean z7) {
        this.f13842i = z7;
    }

    public b a(long j8) {
        m();
        b();
        this.f13834a.write(Long.toString(j8));
        return this;
    }

    public final void b(boolean z7) {
        this.f13839f = z7;
    }

    public b a(Boolean bool) {
        if (bool == null) {
            return k();
        }
        m();
        b();
        this.f13834a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public b a(Number number) {
        if (number == null) {
            return k();
        }
        m();
        String obj = number.toString();
        if (this.f13839f || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            b();
            this.f13834a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public b a(String str) {
        if (str == null) {
            return k();
        }
        m();
        b();
        this.f13834a.append((CharSequence) str);
        return this;
    }

    private void a() {
        int l8 = l();
        if (l8 == 5) {
            this.f13834a.write(44);
        } else if (l8 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        j();
        b(4);
    }

    private void a(int i8) {
        int i9 = this.f13836c;
        int[] iArr = this.f13835b;
        if (i9 == iArr.length) {
            this.f13835b = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f13835b;
        int i10 = this.f13836c;
        this.f13836c = i10 + 1;
        iArr2[i10] = i8;
    }

    public final void a(boolean z7) {
        this.f13840g = z7;
    }
}
