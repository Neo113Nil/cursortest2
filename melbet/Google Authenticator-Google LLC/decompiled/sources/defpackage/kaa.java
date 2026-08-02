package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaa {
    static final hpx c;
    public Object[] d;
    public int e;
    public static final Logger a = Logger.getLogger(kaa.class.getName());
    public static final ixc f = new ixc();
    public static final jzr b = new khc(1);

    static {
        hpx hpxVar = hpx.d;
        hpw hpwVar = (hpw) hpxVar;
        if (hpwVar.c != null) {
            hpxVar = new hpu(hpwVar.b, null);
        }
        c = hpxVar;
    }

    public kaa(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    public static byte[] l(InputStream inputStream) {
        try {
            int i = hpz.a;
            return hpz.a(inputStream, new ArrayDeque(20), 0);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int n() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void o(int i) {
        Object[] objArr = new Object[i];
        if (!j()) {
            System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void p(int i, byte[] bArr) {
        this.d[i + i] = bArr;
    }

    private final void q(int i, Object obj) {
        if (this.d instanceof byte[][]) {
            o(n());
        }
        this.d[i + i + 1] = obj;
    }

    public final int a() {
        int i = this.e;
        return i + i;
    }

    public final Iterable b(jzw jzwVar) {
        if (j()) {
            return null;
        }
        int i = 0;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (Arrays.equals(jzwVar.b, k(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e(i2, jzwVar));
            } else {
                p(i, k(i2));
                q(i, d(i2));
                i++;
            }
        }
        Arrays.fill(this.d, i + i, a(), (Object) null);
        this.e = i;
        return arrayList;
    }

    public final Object c(jzw jzwVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(jzwVar.b, k(i)));
        return e(i, jzwVar);
    }

    public final Object d(int i) {
        return this.d[i + i + 1];
    }

    public final Object e(int i, jzw jzwVar) {
        jzt b2;
        Object d = d(i);
        if (d instanceof byte[]) {
            return jzwVar.a((byte[]) d);
        }
        hvh hvhVar = (hvh) d;
        return (!jzwVar.c() || (b2 = hvh.b(jzwVar)) == null) ? jzwVar.a(hvhVar.d()) : b2.b(hvhVar.c());
    }

    public final void f(jzw jzwVar) {
        if (j()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!Arrays.equals(jzwVar.b, k(i2))) {
                p(i, k(i2));
                q(i, d(i2));
                i++;
            }
        }
        Arrays.fill(this.d, i + i, a(), (Object) null);
        this.e = i;
    }

    public final void g(kaa kaaVar) {
        if (kaaVar.j()) {
            return;
        }
        int n = n() - a();
        if (j() || n < kaaVar.a()) {
            o(a() + kaaVar.a());
        }
        System.arraycopy(kaaVar.d, 0, this.d, a(), kaaVar.a());
        this.e += kaaVar.e;
    }

    public final void h(jzw jzwVar, Object obj) {
        jzwVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == n()) {
            int a2 = a();
            o(Math.max(a2 + a2, 8));
        }
        p(this.e, jzwVar.b);
        boolean c2 = jzwVar.c();
        int i = this.e;
        if (c2) {
            jzt b2 = hvh.b(jzwVar);
            b2.getClass();
            q(i, new hvh(b2, obj));
        } else {
            this.d[i + i + 1] = jzwVar.b(obj);
        }
        this.e++;
    }

    public final boolean i(jzw jzwVar) {
        for (int i = 0; i < this.e; i++) {
            if (Arrays.equals(jzwVar.b, k(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return this.e == 0;
    }

    public final byte[] k(int i) {
        return (byte[]) this.d[i + i];
    }

    public final byte[] m(int i) {
        Object d = d(i);
        return d instanceof byte[] ? (byte[]) d : ((hvh) d).d();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(k(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.g(m(i)));
            } else {
                sb.append(new String(m(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public kaa() {
    }
}
