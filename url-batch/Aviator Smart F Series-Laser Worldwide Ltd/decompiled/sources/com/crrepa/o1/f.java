package com.crrepa.o1;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f extends com.crrepa.t1.a {
    private static final Reader U = new a();
    private static final Object V = new Object();
    private Object[] Q;
    private int R;
    private String[] S;
    private int[] T;

    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i8, int i9) {
            throw new AssertionError();
        }
    }

    public f(com.crrepa.l1.h hVar) {
        super(U);
        this.Q = new Object[32];
        this.R = 0;
        this.S = new String[32];
        this.T = new int[32];
        a(hVar);
    }

    private Object B() {
        return this.Q[this.R - 1];
    }

    private Object C() {
        Object[] objArr = this.Q;
        int i8 = this.R - 1;
        this.R = i8;
        Object obj = objArr[i8];
        objArr[i8] = null;
        return obj;
    }

    private String k() {
        return " at path " + h();
    }

    com.crrepa.l1.h A() {
        com.crrepa.t1.c t7 = t();
        if (t7 != com.crrepa.t1.c.NAME && t7 != com.crrepa.t1.c.END_ARRAY && t7 != com.crrepa.t1.c.END_OBJECT && t7 != com.crrepa.t1.c.END_DOCUMENT) {
            com.crrepa.l1.h hVar = (com.crrepa.l1.h) B();
            z();
            return hVar;
        }
        throw new IllegalStateException("Unexpected " + t7 + " when reading a JsonElement.");
    }

    public void D() {
        a(com.crrepa.t1.c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) B()).next();
        a(entry.getValue());
        a(new com.crrepa.l1.k((String) entry.getKey()));
    }

    @Override // com.crrepa.t1.a
    public void a() {
        a(com.crrepa.t1.c.BEGIN_ARRAY);
        a(((com.crrepa.l1.g) B()).iterator());
        this.T[this.R - 1] = 0;
    }

    @Override // com.crrepa.t1.a
    public void b() {
        a(com.crrepa.t1.c.BEGIN_OBJECT);
        a(((com.crrepa.l1.j) B()).w().iterator());
    }

    @Override // com.crrepa.t1.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Q = new Object[]{V};
        this.R = 1;
    }

    @Override // com.crrepa.t1.a
    public void f() {
        a(com.crrepa.t1.c.END_ARRAY);
        C();
        C();
        int i8 = this.R;
        if (i8 > 0) {
            int[] iArr = this.T;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    @Override // com.crrepa.t1.a
    public void g() {
        a(com.crrepa.t1.c.END_OBJECT);
        C();
        C();
        int i8 = this.R;
        if (i8 > 0) {
            int[] iArr = this.T;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    @Override // com.crrepa.t1.a
    public String h() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i8 = 0;
        while (true) {
            int i9 = this.R;
            if (i8 >= i9) {
                return sb.toString();
            }
            Object[] objArr = this.Q;
            Object obj = objArr[i8];
            if (obj instanceof com.crrepa.l1.g) {
                i8++;
                if (i8 < i9 && (objArr[i8] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.T[i8]);
                    sb.append(']');
                }
            } else if ((obj instanceof com.crrepa.l1.j) && (i8 = i8 + 1) < i9 && (objArr[i8] instanceof Iterator)) {
                sb.append('.');
                String str = this.S[i8];
                if (str != null) {
                    sb.append(str);
                }
            }
            i8++;
        }
    }

    @Override // com.crrepa.t1.a
    public boolean i() {
        com.crrepa.t1.c t7 = t();
        return (t7 == com.crrepa.t1.c.END_OBJECT || t7 == com.crrepa.t1.c.END_ARRAY) ? false : true;
    }

    @Override // com.crrepa.t1.a
    public boolean l() {
        a(com.crrepa.t1.c.BOOLEAN);
        boolean d8 = ((com.crrepa.l1.k) C()).d();
        int i8 = this.R;
        if (i8 > 0) {
            int[] iArr = this.T;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return d8;
    }

    @Override // com.crrepa.t1.a
    public double m() {
        com.crrepa.t1.c t7 = t();
        com.crrepa.t1.c cVar = com.crrepa.t1.c.NUMBER;
        if (t7 != cVar && t7 != com.crrepa.t1.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + t7 + k());
        }
        double g8 = ((com.crrepa.l1.k) B()).g();
        if (!j() && (Double.isNaN(g8) || Double.isInfinite(g8))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + g8);
        }
        C();
        int i8 = this.R;
        if (i8 > 0) {
            int[] iArr = this.T;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return g8;
    }

    @Override // com.crrepa.t1.a
    public int n() {
        com.crrepa.t1.c t7 = t();
        com.crrepa.t1.c cVar = com.crrepa.t1.c.NUMBER;
        if (t7 != cVar && t7 != com.crrepa.t1.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + t7 + k());
        }
        int i8 = ((com.crrepa.l1.k) B()).i();
        C();
        int i9 = this.R;
        if (i9 > 0) {
            int[] iArr = this.T;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return i8;
    }

    @Override // com.crrepa.t1.a
    public long o() {
        com.crrepa.t1.c t7 = t();
        com.crrepa.t1.c cVar = com.crrepa.t1.c.NUMBER;
        if (t7 != cVar && t7 != com.crrepa.t1.c.STRING) {
            throw new IllegalStateException("Expected " + cVar + " but was " + t7 + k());
        }
        long n8 = ((com.crrepa.l1.k) B()).n();
        C();
        int i8 = this.R;
        if (i8 > 0) {
            int[] iArr = this.T;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
        return n8;
    }

    @Override // com.crrepa.t1.a
    public String p() {
        a(com.crrepa.t1.c.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) B()).next();
        String str = (String) entry.getKey();
        this.S[this.R - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.crrepa.t1.a
    public void q() {
        a(com.crrepa.t1.c.NULL);
        C();
        int i8 = this.R;
        if (i8 > 0) {
            int[] iArr = this.T;
            int i9 = i8 - 1;
            iArr[i9] = iArr[i9] + 1;
        }
    }

    @Override // com.crrepa.t1.a
    public String r() {
        com.crrepa.t1.c t7 = t();
        com.crrepa.t1.c cVar = com.crrepa.t1.c.STRING;
        if (t7 == cVar || t7 == com.crrepa.t1.c.NUMBER) {
            String q8 = ((com.crrepa.l1.k) C()).q();
            int i8 = this.R;
            if (i8 > 0) {
                int[] iArr = this.T;
                int i9 = i8 - 1;
                iArr[i9] = iArr[i9] + 1;
            }
            return q8;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + t7 + k());
    }

    @Override // com.crrepa.t1.a
    public com.crrepa.t1.c t() {
        if (this.R == 0) {
            return com.crrepa.t1.c.END_DOCUMENT;
        }
        Object B = B();
        if (B instanceof Iterator) {
            boolean z7 = this.Q[this.R - 2] instanceof com.crrepa.l1.j;
            Iterator it = (Iterator) B;
            if (!it.hasNext()) {
                return z7 ? com.crrepa.t1.c.END_OBJECT : com.crrepa.t1.c.END_ARRAY;
            }
            if (z7) {
                return com.crrepa.t1.c.NAME;
            }
            a(it.next());
            return t();
        }
        if (B instanceof com.crrepa.l1.j) {
            return com.crrepa.t1.c.BEGIN_OBJECT;
        }
        if (B instanceof com.crrepa.l1.g) {
            return com.crrepa.t1.c.BEGIN_ARRAY;
        }
        if (!(B instanceof com.crrepa.l1.k)) {
            if (B instanceof com.crrepa.l1.i) {
                return com.crrepa.t1.c.NULL;
            }
            if (B == V) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        com.crrepa.l1.k kVar = (com.crrepa.l1.k) B;
        if (kVar.y()) {
            return com.crrepa.t1.c.STRING;
        }
        if (kVar.w()) {
            return com.crrepa.t1.c.BOOLEAN;
        }
        if (kVar.x()) {
            return com.crrepa.t1.c.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.crrepa.t1.a
    public String toString() {
        return f.class.getSimpleName() + k();
    }

    @Override // com.crrepa.t1.a
    public void z() {
        if (t() == com.crrepa.t1.c.NAME) {
            p();
            this.S[this.R - 2] = "null";
        } else {
            C();
            int i8 = this.R;
            if (i8 > 0) {
                this.S[i8 - 1] = "null";
            }
        }
        int i9 = this.R;
        if (i9 > 0) {
            int[] iArr = this.T;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    private void a(com.crrepa.t1.c cVar) {
        if (t() == cVar) {
            return;
        }
        throw new IllegalStateException("Expected " + cVar + " but was " + t() + k());
    }

    private void a(Object obj) {
        int i8 = this.R;
        Object[] objArr = this.Q;
        if (i8 == objArr.length) {
            int i9 = i8 * 2;
            this.Q = Arrays.copyOf(objArr, i9);
            this.T = Arrays.copyOf(this.T, i9);
            this.S = (String[]) Arrays.copyOf(this.S, i9);
        }
        Object[] objArr2 = this.Q;
        int i10 = this.R;
        this.R = i10 + 1;
        objArr2[i10] = obj;
    }
}
