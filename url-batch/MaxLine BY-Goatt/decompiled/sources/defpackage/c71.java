package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class c71 implements Closeable, Flushable {
    public static final String[] t = new String[128];
    public final Writer m;
    public int[] n;
    public int o;
    public final String p;
    public boolean q;
    public String r;
    public final boolean s;

    static {
        for (int i = 0; i <= 31; i++) {
            t[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c71(Writer writer) {
        int[] iArr = new int[32];
        this.n = iArr;
        this.o = 0;
        if (iArr.length == 0) {
            this.n = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.n;
        int i = this.o;
        this.o = i + 1;
        iArr2[i] = 6;
        this.p = ":";
        this.s = true;
        if (writer != null) {
            this.m = writer;
        } else {
            ch2.l("out == null");
            throw null;
        }
    }

    public final void b() {
        int n = n();
        if (n == 1) {
            this.n[this.o - 1] = 2;
            return;
        }
        Writer writer = this.m;
        if (n == 2) {
            writer.append(',');
            return;
        }
        if (n == 4) {
            writer.append((CharSequence) this.p);
            this.n[this.o - 1] = 5;
            return;
        }
        if (n != 6) {
            if (n != 7) {
                lh.g("Nesting problem.");
                return;
            } else if (!this.q) {
                lh.g("JSON must have only one top-level value.");
                return;
            }
        }
        this.n[this.o - 1] = 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.m.close();
        int i = this.o;
        if (i > 1 || (i == 1 && this.n[i - 1] != 7)) {
            dm0.j("Incomplete document");
        } else {
            this.o = 0;
        }
    }

    public final void f(int i, int i2, char c) {
        int n = n();
        if (n != i2 && n != i) {
            lh.g("Nesting problem.");
        } else if (this.r != null) {
            b71.q(this.r, "Dangling name: ");
        } else {
            this.o--;
            this.m.write(c);
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.o != 0) {
            this.m.flush();
        } else {
            lh.g("JsonWriter is closed.");
        }
    }

    public c71 m() {
        if (this.r != null) {
            if (!this.s) {
                this.r = null;
                return this;
            }
            p();
        }
        b();
        this.m.write("null");
        return this;
    }

    public final int n() {
        int i = this.o;
        if (i != 0) {
            return this.n[i - 1];
        }
        lh.g("JsonWriter is closed.");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(String str) {
        int i;
        String str2;
        Writer writer = this.m;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = t[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    writer.write(str, i2, i - i2);
                }
                writer.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                writer.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public final void p() {
        if (this.r != null) {
            int n = n();
            if (n == 5) {
                this.m.write(44);
            } else if (n != 3) {
                lh.g("Nesting problem.");
                return;
            }
            this.n[this.o - 1] = 4;
            o(this.r);
            this.r = null;
        }
    }
}
