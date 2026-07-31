package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class g implements Iterable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final g f682f = new g(y.f795b);

    /* renamed from: g, reason: collision with root package name */
    public static final e f683g;

    /* renamed from: d, reason: collision with root package name */
    public int f684d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f685e;

    static {
        f683g = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f685e = bArr;
    }

    public static int b(int i, int i8, int i9) {
        int i10 = i8 - i;
        if ((i | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i >= 0) {
            if (i8 < i) {
                throw new IndexOutOfBoundsException(a0.q.i("Beginning index larger than ending index: ", i, ", ", i8));
            }
            throw new IndexOutOfBoundsException(a0.q.i("End index: ", i8, " >= ", i9));
        }
        throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
    }

    public static g c(byte[] bArr, int i, int i8) {
        byte[] copyOfRange;
        b(i, i + i8, bArr.length);
        switch (f683g.f671a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i, i8 + i);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i, copyOfRange, 0, i8);
                break;
        }
        return new g(copyOfRange);
    }

    public byte a(int i) {
        return this.f685e[i];
    }

    public void e(byte[] bArr, int i) {
        System.arraycopy(this.f685e, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i = this.f684d;
        int i8 = gVar.f684d;
        if (i != 0 && i8 != 0 && i != i8) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder l3 = a0.q.l("Ran off end of other: 0, ", size, ", ");
            l3.append(gVar.size());
            throw new IllegalArgumentException(l3.toString());
        }
        byte[] bArr = gVar.f685e;
        int f6 = f() + size;
        int f8 = f();
        int f9 = gVar.f();
        while (f8 < f6) {
            if (this.f685e[f8] != bArr[f9]) {
                return false;
            }
            f8++;
            f9++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i) {
        return this.f685e[i];
    }

    public final int hashCode() {
        int i = this.f684d;
        if (i != 0) {
            return i;
        }
        int size = size();
        int f6 = f();
        int i8 = size;
        for (int i9 = f6; i9 < f6 + size; i9++) {
            i8 = (i8 * 31) + this.f685e[i9];
        }
        if (i8 == 0) {
            i8 = 1;
        }
        this.f684d = i8;
        return i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f685e.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = s6.a.o(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b8 = b(0, 47, size());
            sb2.append(s6.a.o(b8 == 0 ? f682f : new f(this.f685e, f(), b8)));
            sb2.append("...");
            sb = sb2.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + sb + "\">";
    }
}
