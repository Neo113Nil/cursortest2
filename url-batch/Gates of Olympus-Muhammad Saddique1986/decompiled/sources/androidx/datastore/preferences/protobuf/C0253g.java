package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0253g implements Iterable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final C0253g f5064f = new C0253g(AbstractC0269x.f5136b);

    /* renamed from: g, reason: collision with root package name */
    public static final C0251e f5065g;

    /* renamed from: d, reason: collision with root package name */
    public int f5066d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5067e;

    static {
        f5065g = AbstractC0249c.a() ? new C0251e(1) : new C0251e(0);
    }

    public C0253g(byte[] bArr) {
        bArr.getClass();
        this.f5067e = bArr;
    }

    public static int c(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(A.k.g(i3, "Beginning index: ", " < 0"));
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException(A.k.f(i3, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(A.k.f(i4, i5, "End index: ", " >= "));
    }

    public static C0253g d(byte[] bArr, int i3, int i4) {
        byte[] copyOfRange;
        c(i3, i3 + i4, bArr.length);
        switch (f5065g.f5056a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, copyOfRange, 0, i4);
                break;
        }
        return new C0253g(copyOfRange);
    }

    public byte b(int i3) {
        return this.f5067e[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0253g) || size() != ((C0253g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0253g)) {
            return obj.equals(this);
        }
        C0253g c0253g = (C0253g) obj;
        int i3 = this.f5066d;
        int i4 = c0253g.f5066d;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > c0253g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0253g.size()) {
            StringBuilder k3 = A.k.k(size, "Ran off end of other: 0, ", ", ");
            k3.append(c0253g.size());
            throw new IllegalArgumentException(k3.toString());
        }
        int j3 = j() + size;
        int j4 = j();
        int j5 = c0253g.j();
        while (j4 < j3) {
            if (this.f5067e[j4] != c0253g.f5067e[j5]) {
                return false;
            }
            j4++;
            j5++;
        }
        return true;
    }

    public final int hashCode() {
        int i3 = this.f5066d;
        if (i3 == 0) {
            int size = size();
            int j3 = j();
            int i4 = size;
            for (int i5 = j3; i5 < j3 + size; i5++) {
                i4 = (i4 * 31) + this.f5067e[i5];
            }
            i3 = i4 == 0 ? 1 : i4;
            this.f5066d = i3;
        }
        return i3;
    }

    public void i(int i3, byte[] bArr) {
        System.arraycopy(this.f5067e, 0, bArr, 0, i3);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0250d(this);
    }

    public int j() {
        return 0;
    }

    public byte k(int i3) {
        return this.f5067e[i3];
    }

    public int size() {
        return this.f5067e.length;
    }

    public final String toString() {
        C0253g c0252f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = e0.c(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int c2 = c(0, 47, size());
            if (c2 == 0) {
                c0252f = f5064f;
            } else {
                c0252f = new C0252f(this.f5067e, j(), c2);
            }
            sb2.append(e0.c(c0252f));
            sb2.append("...");
            sb = sb2.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + sb + "\">";
    }
}
