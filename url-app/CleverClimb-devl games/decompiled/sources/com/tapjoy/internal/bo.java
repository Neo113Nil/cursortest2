package com.tapjoy.internal;

import com.tapjoy.internal.bn;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class bo extends bn {

    /* renamed from: a, reason: collision with root package name */
    public static final bn.a f7857a = new bn.a() { // from class: com.tapjoy.internal.bo.1
        @Override // com.tapjoy.internal.bn.a
        public final bn a(Reader reader) {
            return new bo(reader);
        }

        @Override // com.tapjoy.internal.bn.a
        public final bn a(String str) {
            return new bo(new StringReader(str));
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final Reader f7859c;
    private bs k;
    private String l;
    private String m;
    private int n;
    private int o;
    private boolean p;

    /* renamed from: b, reason: collision with root package name */
    private final cj f7858b = new cj();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7860d = false;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 1;
    private int i = 1;
    private final List j = new ArrayList();

    public bo(Reader reader) {
        a(bq.EMPTY_DOCUMENT);
        this.p = false;
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f7859c = reader;
    }

    @Override // com.tapjoy.internal.bp
    public final void f() {
        a(bs.BEGIN_ARRAY);
    }

    @Override // com.tapjoy.internal.bp
    public final void g() {
        a(bs.END_ARRAY);
    }

    @Override // com.tapjoy.internal.bp
    public final void h() {
        a(bs.BEGIN_OBJECT);
    }

    @Override // com.tapjoy.internal.bp
    public final void i() {
        a(bs.END_OBJECT);
    }

    private void a(bs bsVar) {
        k();
        if (this.k != bsVar) {
            throw new IllegalStateException("Expected " + bsVar + " but was " + k());
        }
        t();
    }

    @Override // com.tapjoy.internal.bp
    public final boolean j() {
        k();
        return (this.k == bs.END_OBJECT || this.k == bs.END_ARRAY) ? false : true;
    }

    @Override // com.tapjoy.internal.bp
    public final bs k() {
        if (this.k != null) {
            return this.k;
        }
        switch ((bq) this.j.get(this.j.size() - 1)) {
            case EMPTY_DOCUMENT:
                b(bq.NONEMPTY_DOCUMENT);
                bs v = v();
                if (this.f7860d || this.k == bs.BEGIN_ARRAY || this.k == bs.BEGIN_OBJECT) {
                    return v;
                }
                throw new IOException("Expected JSON document to start with '[' or '{' but was " + this.k);
            case EMPTY_ARRAY:
                return a(true);
            case NONEMPTY_ARRAY:
                return a(false);
            case EMPTY_OBJECT:
                return b(true);
            case DANGLING_NAME:
                int y = y();
                if (y != 58) {
                    if (y == 61) {
                        z();
                        if ((this.f < this.g || a(1)) && this.e[this.f] == '>') {
                            this.f++;
                        }
                    } else {
                        throw d("Expected ':'");
                    }
                }
                b(bq.NONEMPTY_OBJECT);
                return v();
            case NONEMPTY_OBJECT:
                return b(false);
            case NONEMPTY_DOCUMENT:
                try {
                    bs v2 = v();
                    if (this.f7860d) {
                        return v2;
                    }
                    throw d("Expected EOF");
                } catch (EOFException unused) {
                    bs bsVar = bs.END_DOCUMENT;
                    this.k = bsVar;
                    return bsVar;
                }
            case CLOSED:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    private bs t() {
        k();
        bs bsVar = this.k;
        this.k = null;
        this.m = null;
        this.l = null;
        return bsVar;
    }

    @Override // com.tapjoy.internal.bp
    public final String l() {
        k();
        if (this.k != bs.NAME) {
            throw new IllegalStateException("Expected a name but was " + k());
        }
        String str = this.l;
        t();
        return str;
    }

    @Override // com.tapjoy.internal.bp
    public final String m() {
        k();
        if (this.k != bs.STRING && this.k != bs.NUMBER) {
            throw new IllegalStateException("Expected a string but was " + k());
        }
        String str = this.m;
        t();
        return str;
    }

    @Override // com.tapjoy.internal.bp
    public final boolean n() {
        k();
        if (this.k != bs.BOOLEAN) {
            throw new IllegalStateException("Expected a boolean but was " + this.k);
        }
        boolean z = this.m == "true";
        t();
        return z;
    }

    @Override // com.tapjoy.internal.bp
    public final void o() {
        k();
        if (this.k != bs.NULL) {
            throw new IllegalStateException("Expected null but was " + this.k);
        }
        t();
    }

    @Override // com.tapjoy.internal.bp
    public final double p() {
        k();
        if (this.k != bs.STRING && this.k != bs.NUMBER) {
            throw new IllegalStateException("Expected a double but was " + this.k);
        }
        double parseDouble = Double.parseDouble(this.m);
        t();
        return parseDouble;
    }

    @Override // com.tapjoy.internal.bp
    public final long q() {
        long j;
        k();
        if (this.k != bs.STRING && this.k != bs.NUMBER) {
            throw new IllegalStateException("Expected a long but was " + this.k);
        }
        try {
            j = Long.parseLong(this.m);
        } catch (NumberFormatException unused) {
            double parseDouble = Double.parseDouble(this.m);
            long j2 = (long) parseDouble;
            if (j2 != parseDouble) {
                throw new NumberFormatException(this.m);
            }
            j = j2;
        }
        t();
        return j;
    }

    @Override // com.tapjoy.internal.bp
    public final int r() {
        int i;
        k();
        if (this.k != bs.STRING && this.k != bs.NUMBER) {
            throw new IllegalStateException("Expected an int but was " + this.k);
        }
        try {
            i = Integer.parseInt(this.m);
        } catch (NumberFormatException unused) {
            double parseDouble = Double.parseDouble(this.m);
            int i2 = (int) parseDouble;
            if (i2 != parseDouble) {
                throw new NumberFormatException(this.m);
            }
            i = i2;
        }
        t();
        return i;
    }

    @Override // com.tapjoy.internal.bp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = null;
        this.k = null;
        this.j.clear();
        this.j.add(bq.CLOSED);
        this.f7859c.close();
    }

    @Override // com.tapjoy.internal.bp
    public final void s() {
        k();
        if (this.k == bs.END_ARRAY || this.k == bs.END_OBJECT) {
            throw new IllegalStateException("Expected a value but was " + this.k);
        }
        this.p = true;
        int i = 0;
        do {
            try {
                bs t = t();
                if (t != bs.BEGIN_ARRAY && t != bs.BEGIN_OBJECT) {
                    if (t == bs.END_ARRAY || t == bs.END_OBJECT) {
                        i--;
                    }
                }
                i++;
            } finally {
                this.p = false;
            }
        } while (i != 0);
    }

    private bq u() {
        return (bq) this.j.remove(this.j.size() - 1);
    }

    private void a(bq bqVar) {
        this.j.add(bqVar);
    }

    private void b(bq bqVar) {
        this.j.set(this.j.size() - 1, bqVar);
    }

    private bs a(boolean z) {
        if (z) {
            b(bq.NONEMPTY_ARRAY);
        } else {
            int y = y();
            if (y != 44) {
                if (y != 59) {
                    if (y == 93) {
                        u();
                        bs bsVar = bs.END_ARRAY;
                        this.k = bsVar;
                        return bsVar;
                    }
                    throw d("Unterminated array");
                }
                z();
            }
        }
        int y2 = y();
        if (y2 != 44 && y2 != 59) {
            if (y2 != 93) {
                this.f--;
                return v();
            }
            if (z) {
                u();
                bs bsVar2 = bs.END_ARRAY;
                this.k = bsVar2;
                return bsVar2;
            }
        }
        z();
        this.f--;
        this.m = "null";
        bs bsVar3 = bs.NULL;
        this.k = bsVar3;
        return bsVar3;
    }

    private bs b(boolean z) {
        if (z) {
            if (y() == 125) {
                u();
                bs bsVar = bs.END_OBJECT;
                this.k = bsVar;
                return bsVar;
            }
            this.f--;
        } else {
            int y = y();
            if (y != 44 && y != 59) {
                if (y == 125) {
                    u();
                    bs bsVar2 = bs.END_OBJECT;
                    this.k = bsVar2;
                    return bsVar2;
                }
                throw d("Unterminated object");
            }
        }
        int y2 = y();
        if (y2 != 34) {
            if (y2 == 39) {
                z();
            } else {
                z();
                this.f--;
                this.l = c(false);
                if (this.l.length() == 0) {
                    throw d("Expected name");
                }
                b(bq.DANGLING_NAME);
                bs bsVar3 = bs.NAME;
                this.k = bsVar3;
                return bsVar3;
            }
        }
        this.l = a((char) y2);
        b(bq.DANGLING_NAME);
        bs bsVar32 = bs.NAME;
        this.k = bsVar32;
        return bsVar32;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private bs v() {
        bs bsVar;
        int i;
        int i2;
        char c2;
        int y = y();
        if (y != 34) {
            if (y != 39) {
                if (y == 91) {
                    a(bq.EMPTY_ARRAY);
                    bs bsVar2 = bs.BEGIN_ARRAY;
                    this.k = bsVar2;
                    return bsVar2;
                }
                if (y == 123) {
                    a(bq.EMPTY_OBJECT);
                    bs bsVar3 = bs.BEGIN_OBJECT;
                    this.k = bsVar3;
                    return bsVar3;
                }
                this.f--;
                this.m = c(true);
                if (this.o == 0) {
                    throw d("Expected literal value");
                }
                if (this.n != -1) {
                    if (this.o == 4 && (('n' == this.e[this.n] || 'N' == this.e[this.n]) && (('u' == this.e[this.n + 1] || 'U' == this.e[this.n + 1]) && (('l' == this.e[this.n + 2] || 'L' == this.e[this.n + 2]) && ('l' == this.e[this.n + 3] || 'L' == this.e[this.n + 3]))))) {
                        this.m = "null";
                        bsVar = bs.NULL;
                    } else if (this.o == 4 && (('t' == this.e[this.n] || 'T' == this.e[this.n]) && (('r' == this.e[this.n + 1] || 'R' == this.e[this.n + 1]) && (('u' == this.e[this.n + 2] || 'U' == this.e[this.n + 2]) && ('e' == this.e[this.n + 3] || 'E' == this.e[this.n + 3]))))) {
                        this.m = "true";
                        bsVar = bs.BOOLEAN;
                    } else if (this.o == 5 && (('f' == this.e[this.n] || 'F' == this.e[this.n]) && (('a' == this.e[this.n + 1] || 'A' == this.e[this.n + 1]) && (('l' == this.e[this.n + 2] || 'L' == this.e[this.n + 2]) && (('s' == this.e[this.n + 3] || 'S' == this.e[this.n + 3]) && ('e' == this.e[this.n + 4] || 'E' == this.e[this.n + 4])))))) {
                        this.m = "false";
                        bsVar = bs.BOOLEAN;
                    } else {
                        this.m = this.f7858b.a(this.e, this.n, this.o);
                        char[] cArr = this.e;
                        int i3 = this.n;
                        int i4 = this.o;
                        char c3 = cArr[i3];
                        if (c3 == '-') {
                            int i5 = i3 + 1;
                            i = i5;
                            c3 = cArr[i5];
                        } else {
                            i = i3;
                        }
                        if (c3 == '0') {
                            i2 = i + 1;
                            c2 = cArr[i2];
                        } else if (c3 >= '1' && c3 <= '9') {
                            i2 = i + 1;
                            c2 = cArr[i2];
                            while (c2 >= '0' && c2 <= '9') {
                                i2++;
                                c2 = cArr[i2];
                            }
                        } else {
                            bsVar = bs.STRING;
                        }
                        if (c2 == '.') {
                            i2++;
                            c2 = cArr[i2];
                            while (c2 >= '0' && c2 <= '9') {
                                i2++;
                                c2 = cArr[i2];
                            }
                        }
                        if (c2 == 'e' || c2 == 'E') {
                            int i6 = i2 + 1;
                            char c4 = cArr[i6];
                            if (c4 == '+' || c4 == '-') {
                                i6++;
                                c4 = cArr[i6];
                            }
                            if (c4 >= '0' && c4 <= '9') {
                                i2 = i6 + 1;
                                char c5 = cArr[i2];
                                while (c5 >= '0' && c5 <= '9') {
                                    i2++;
                                    c5 = cArr[i2];
                                }
                            } else {
                                bsVar = bs.STRING;
                            }
                        }
                        if (i2 == i3 + i4) {
                            bsVar = bs.NUMBER;
                        }
                    }
                    this.k = bsVar;
                    if (this.k == bs.STRING) {
                        z();
                    }
                    return this.k;
                }
                bsVar = bs.STRING;
                this.k = bsVar;
                if (this.k == bs.STRING) {
                }
                return this.k;
            }
            z();
        }
        this.m = a((char) y);
        bs bsVar4 = bs.STRING;
        this.k = bsVar4;
        return bsVar4;
    }

    private boolean a(int i) {
        for (int i2 = 0; i2 < this.f; i2++) {
            if (this.e[i2] == '\n') {
                this.h++;
                this.i = 1;
            } else {
                this.i++;
            }
        }
        if (this.g != this.f) {
            this.g -= this.f;
            System.arraycopy(this.e, this.f, this.e, 0, this.g);
        } else {
            this.g = 0;
        }
        this.f = 0;
        do {
            int read = this.f7859c.read(this.e, this.g, this.e.length - this.g);
            if (read == -1) {
                return false;
            }
            this.g += read;
            if (this.h == 1 && this.i == 1 && this.g > 0 && this.e[0] == 65279) {
                this.f++;
                this.i--;
            }
        } while (this.g < i);
        return true;
    }

    private int w() {
        int i = this.h;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (this.e[i2] == '\n') {
                i++;
            }
        }
        return i;
    }

    private int x() {
        int i = this.i;
        for (int i2 = 0; i2 < this.f; i2++) {
            i = this.e[i2] == '\n' ? 1 : i + 1;
        }
        return i;
    }

    private int y() {
        int i;
        while (true) {
            boolean z = true;
            if (this.f < this.g || a(1)) {
                char[] cArr = this.e;
                int i2 = this.f;
                this.f = i2 + 1;
                char c2 = cArr[i2];
                if (c2 != '\r' && c2 != ' ') {
                    if (c2 == '#') {
                        z();
                        A();
                    } else if (c2 != '/') {
                        switch (c2) {
                            case '\t':
                            case '\n':
                                break;
                            default:
                                return c2;
                        }
                    } else {
                        if (this.f == this.g && !a(1)) {
                            return c2;
                        }
                        z();
                        char c3 = this.e[this.f];
                        if (c3 == '*') {
                            this.f++;
                            while (true) {
                                if (this.f + "*/".length() <= this.g || a("*/".length())) {
                                    while (i < "*/".length()) {
                                        i = this.e[this.f + i] == "*/".charAt(i) ? i + 1 : 0;
                                    }
                                } else {
                                    z = false;
                                }
                                this.f++;
                            }
                            if (!z) {
                                throw d("Unterminated comment");
                            }
                            this.f += 2;
                        } else {
                            if (c3 != '/') {
                                return c2;
                            }
                            this.f++;
                            A();
                        }
                    }
                }
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    private void z() {
        if (!this.f7860d) {
            throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void A() {
        char c2;
        do {
            if (this.f >= this.g && !a(1)) {
                return;
            }
            char[] cArr = this.e;
            int i = this.f;
            this.f = i + 1;
            c2 = cArr[i];
            if (c2 == '\r') {
                return;
            }
        } while (c2 != '\n');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private String a(char c2) {
        StringBuilder sb = null;
        do {
            int i = this.f;
            while (this.f < this.g) {
                char[] cArr = this.e;
                int i2 = this.f;
                this.f = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    if (this.p) {
                        return "skipped!";
                    }
                    if (sb == null) {
                        return this.f7858b.a(this.e, i, (this.f - i) - 1);
                    }
                    sb.append(this.e, i, (this.f - i) - 1);
                    return sb.toString();
                }
                if (c3 == '\\') {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.e, i, (this.f - i) - 1);
                    if (this.f == this.g && !a(1)) {
                        throw d("Unterminated escape sequence");
                    }
                    char[] cArr2 = this.e;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    char c4 = cArr2[i3];
                    if (c4 == 'b') {
                        c4 = '\b';
                    } else if (c4 == 'f') {
                        c4 = '\f';
                    } else if (c4 == 'n') {
                        c4 = '\n';
                    } else if (c4 != 'r') {
                        switch (c4) {
                            case 't':
                                c4 = '\t';
                                break;
                            case 'u':
                                if (this.f + 4 > this.g && !a(4)) {
                                    throw d("Unterminated escape sequence");
                                }
                                String a2 = this.f7858b.a(this.e, this.f, 4);
                                this.f += 4;
                                c4 = (char) Integer.parseInt(a2, 16);
                                break;
                                break;
                        }
                    } else {
                        c4 = '\r';
                    }
                    sb.append(c4);
                    i = this.f;
                }
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.e, i, this.f - i);
        } while (a(1));
        throw d("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String c(boolean z) {
        this.n = -1;
        int i = 0;
        this.o = 0;
        String str = null;
        StringBuilder sb = null;
        do {
            int i2 = 0;
            while (true) {
                if (this.f + i2 < this.g) {
                    switch (this.e[this.f + i2]) {
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        case ' ':
                        case ',':
                        case ':':
                        case '[':
                        case ']':
                        case '{':
                        case '}':
                            break;
                        case '#':
                        case '/':
                        case ';':
                        case '=':
                        case '\\':
                            z();
                            break;
                        default:
                            i2++;
                    }
                } else if (i2 < this.e.length) {
                    if (!a(i2 + 1)) {
                        this.e[this.g] = 0;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.e, this.f, i2);
                    this.o += i2;
                    this.f += i2;
                }
            }
            i = i2;
            if (!z && sb == null) {
                this.n = this.f;
            } else if (!this.p) {
                str = "skipped!";
            } else if (sb == null) {
                str = this.f7858b.a(this.e, this.f, i);
            } else {
                sb.append(this.e, this.f, i);
                str = sb.toString();
            }
            this.o += i;
            this.f += i;
            return str;
        } while (a(1));
        if (!z) {
        }
        if (!this.p) {
        }
        this.o += i;
        this.f += i;
        return str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" near ");
        StringBuilder sb2 = new StringBuilder();
        int min = Math.min(this.f, 20);
        sb2.append(this.e, this.f - min, min);
        sb2.append(this.e, this.f, Math.min(this.g - this.f, 20));
        sb.append((Object) sb2);
        return sb.toString();
    }

    private IOException d(String str) {
        throw new bu(str + " at line " + w() + " column " + x());
    }
}
