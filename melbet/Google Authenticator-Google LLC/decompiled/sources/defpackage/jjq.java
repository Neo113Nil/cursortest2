package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jjq implements Iterable, Serializable {
    public static final jjq d = new jjo(jky.a);
    private static final long serialVersionUID = 1;
    private int a = 0;

    static jjq A(byte[] bArr) {
        return bArr.length == 0 ? d : new jjo(bArr);
    }

    private static jjq l(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (jjq) it.next();
        }
        int i2 = i >>> 1;
        jjq l = l(it, i2);
        jjq l2 = l(it, i - i2);
        if (Integer.MAX_VALUE - l.c() < l2.c()) {
            throw new IllegalArgumentException("ByteString would be too long: " + l.c() + "+" + l2.c());
        }
        int[] iArr = jly.a;
        if (l2.c() == 0) {
            return l;
        }
        if (l.c() == 0) {
            return l2;
        }
        int c = l.c() + l2.c();
        if (c < 128) {
            return jly.C(l, l2);
        }
        if (l instanceof jly) {
            jly jlyVar = (jly) l;
            jjq jjqVar = jlyVar.e;
            if (jjqVar.c() + l2.c() < 128) {
                return new jly(jlyVar.c, jly.C(jjqVar, l2));
            }
            jjq jjqVar2 = jlyVar.c;
            if (jjqVar2.m() > jjqVar.m() && jlyVar.f > l2.m()) {
                return new jly(jjqVar2, new jly(jjqVar, l2));
            }
        }
        if (c >= jly.l(Math.max(l.m(), l2.m()) + 1)) {
            return new jly(l, l2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ima.a(l, arrayDeque);
        ima.a(l2, arrayDeque);
        jjq jjqVar3 = (jjq) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            jjqVar3 = new jly((jjq) arrayDeque.pop(), jjqVar3);
        }
        return jjqVar3;
    }

    static int o(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.ai(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.af(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a.af(i3, i2, "End index: ", " >= "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jjq q(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? d : l(iterable.iterator(), size);
    }

    public static jjq r(byte[] bArr) {
        return s(bArr, 0, bArr.length);
    }

    public static jjq s(byte[] bArr, int i, int i2) {
        try {
            return y(bArr, i, i2);
        } catch (jld e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static jjq t(String str) {
        return str.isEmpty() ? d : new jjo(str.getBytes(StandardCharsets.UTF_8));
    }

    static jjq u(byte[] bArr) {
        try {
            return A(bArr);
        } catch (jld e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static boolean w(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        o(i, i4, bArr.length);
        o(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    static jjq y(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return d;
        }
        o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new jjo(bArr2);
    }

    public static jjq z(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            jjq s = i2 == 0 ? null : s(bArr, 0, i2);
            if (s == null) {
                return q(arrayList);
            }
            arrayList.add(s);
            i = Math.min(i + i, 8192);
        }
    }

    @Deprecated
    public final void B(byte[] bArr, int i, int i2) {
        o(0, i2, c());
        o(i, i + i2, bArr.length);
        if (i2 > 0) {
            h(bArr, 0, i, i2);
        }
    }

    public abstract byte a(int i);

    protected abstract int b(int i, int i2, int i3);

    public abstract int c();

    public abstract jjq d(int i, int i2);

    public abstract jjq e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jjq)) {
            return false;
        }
        jjq jjqVar = (jjq) obj;
        int c = c();
        if (c != jjqVar.c()) {
            return false;
        }
        if (c == 0) {
            return true;
        }
        int i = this.a;
        int i2 = jjqVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return k(jjqVar);
        }
        return false;
    }

    public abstract jju f();

    public abstract ByteBuffer g();

    protected abstract void h(byte[] bArr, int i, int i2, int i3);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int c = c();
            i = b(c, 0, c);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract void i(jji jjiVar);

    public abstract void j(OutputStream outputStream);

    protected abstract boolean k(jjq jjqVar);

    protected abstract int m();

    public abstract boolean n();

    @Override // java.lang.Iterable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public jjm iterator() {
        return new jjj(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()), c() <= 50 ? jmg.a(this) : jmg.a(e(0, 47)).concat("..."));
    }

    public final boolean v() {
        return c() == 0;
    }

    public final byte[] x() {
        int c = c();
        if (c == 0) {
            return jky.a;
        }
        byte[] bArr = new byte[c];
        h(bArr, 0, 0, c);
        return bArr;
    }
}
