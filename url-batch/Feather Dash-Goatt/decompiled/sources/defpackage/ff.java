package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ff implements Iterable, Serializable {
    public static final ff g = new ff(ia0.b);
    public static final ef h;
    public int d = 0;
    public final byte[] e;

    static {
        h = f3.a() ? new j41(16) : new a60(16);
    }

    public ff(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            af.h(i, i2, ", ", "Beginning index larger than ending index: ");
            return 0;
        }
        af.h(i2, i3, " >= ", "End index: ");
        return 0;
    }

    public static ff d(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new ff(h.c(bArr, i, i2));
    }

    public byte a(int i) {
        return this.e[i];
    }

    public void e(byte[] bArr, int i) {
        System.arraycopy(this.e, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ff) || size() != ((ff) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return obj.equals(this);
        }
        ff ffVar = (ff) obj;
        int i = this.d;
        int i2 = ffVar.d;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > ffVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > ffVar.size()) {
            StringBuilder n = qy0.n("Ran off end of other: 0, ", size, ", ");
            n.append(ffVar.size());
            throw new IllegalArgumentException(n.toString());
        }
        byte[] bArr = ffVar.e;
        int f = f() + size;
        int f2 = f();
        int f3 = ffVar.f();
        while (f2 < f) {
            if (this.e[f2] != bArr[f3]) {
                return false;
            }
            f2++;
            f3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i) {
        return this.e[i];
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int size = size();
        int f = f();
        int i2 = size;
        for (int i3 = f; i3 < f + size; i3++) {
            i2 = (i2 * 31) + this.e[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.d = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cf(this);
    }

    public int size() {
        return this.e.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = ca0.j(this);
        } else {
            int b = b(0, 47, size());
            concat = ca0.j(b == 0 ? g : new df(this.e, f(), b)).concat("...");
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + concat + "\">";
    }
}
