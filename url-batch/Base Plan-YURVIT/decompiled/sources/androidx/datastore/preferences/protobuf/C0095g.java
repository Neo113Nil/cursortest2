package androidx.datastore.preferences.protobuf;

import a.AbstractC0086a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0095g implements Iterable, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0095g f1525g = new C0095g(AbstractC0112y.f1603b);

    /* renamed from: h, reason: collision with root package name */
    public static final C0093e f1526h;

    /* renamed from: e, reason: collision with root package name */
    public int f1527e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1528f;

    static {
        f1526h = AbstractC0091c.a() ? new C0093e(1) : new C0093e(0);
    }

    public C0095g(byte[] bArr) {
        bArr.getClass();
        this.f1528f = bArr;
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 >= 0) {
            if (i3 < i2) {
                throw new IndexOutOfBoundsException(L.d.f("Beginning index larger than ending index: ", i2, ", ", i3));
            }
            throw new IndexOutOfBoundsException(L.d.f("End index: ", i3, " >= ", i4));
        }
        throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
    }

    public static C0095g c(byte[] bArr, int i2, int i3) {
        byte[] copyOfRange;
        b(i2, i2 + i3, bArr.length);
        switch (f1526h.f1522a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                copyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, copyOfRange, 0, i3);
                break;
        }
        return new C0095g(copyOfRange);
    }

    public byte a(int i2) {
        return this.f1528f[i2];
    }

    public void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1528f, 0, bArr, 0, i2);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0095g) || size() != ((C0095g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0095g)) {
            return obj.equals(this);
        }
        C0095g c0095g = (C0095g) obj;
        int i2 = this.f1527e;
        int i3 = c0095g.f1527e;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > c0095g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0095g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0095g.size());
        }
        byte[] bArr = c0095g.f1528f;
        int e2 = e() + size;
        int e3 = e();
        int e4 = c0095g.e();
        while (e3 < e2) {
            if (this.f1528f[e3] != bArr[e4]) {
                return false;
            }
            e3++;
            e4++;
        }
        return true;
    }

    public byte f(int i2) {
        return this.f1528f[i2];
    }

    public final int hashCode() {
        int i2 = this.f1527e;
        if (i2 != 0) {
            return i2;
        }
        int size = size();
        int e2 = e();
        int i3 = size;
        for (int i4 = e2; i4 < e2 + size; i4++) {
            i3 = (i3 * 31) + this.f1528f[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.f1527e = i3;
        return i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0092d(this);
    }

    public int size() {
        return this.f1528f.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0086a.o(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b2 = b(0, 47, size());
            sb2.append(AbstractC0086a.o(b2 == 0 ? f1525g : new C0094f(this.f1528f, e(), b2)));
            sb2.append("...");
            sb = sb2.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + sb + "\">";
    }
}
