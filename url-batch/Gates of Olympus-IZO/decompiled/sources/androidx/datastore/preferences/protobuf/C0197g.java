package androidx.datastore.preferences.protobuf;

import H2.AbstractC0080b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0197g implements Iterable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final C0197g f3863f = new C0197g(AbstractC0213x.f3935b);

    /* renamed from: g, reason: collision with root package name */
    public static final C0195e f3864g;

    /* renamed from: d, reason: collision with root package name */
    public int f3865d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f3866e;

    static {
        f3864g = AbstractC0193c.a() ? new C0195e(1) : new C0195e(0);
    }

    public C0197g(byte[] bArr) {
        bArr.getClass();
        this.f3866e = bArr;
    }

    public static int c(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0080b.i("Beginning index: ", i3, " < 0"));
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0080b.g(i4, i5, "End index: ", " >= "));
    }

    public static C0197g d(byte[] bArr, int i3, int i4) {
        byte[] copyOfRange;
        c(i3, i3 + i4, bArr.length);
        switch (f3864g.f3855a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, copyOfRange, 0, i4);
                break;
        }
        return new C0197g(copyOfRange);
    }

    public byte b(int i3) {
        return this.f3866e[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0197g) || size() != ((C0197g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0197g)) {
            return obj.equals(this);
        }
        C0197g c0197g = (C0197g) obj;
        int i3 = this.f3865d;
        int i4 = c0197g.f3865d;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > c0197g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0197g.size()) {
            StringBuilder l3 = AbstractC0080b.l("Ran off end of other: 0, ", size, ", ");
            l3.append(c0197g.size());
            throw new IllegalArgumentException(l3.toString());
        }
        int j3 = j() + size;
        int j4 = j();
        int j5 = c0197g.j();
        while (j4 < j3) {
            if (this.f3866e[j4] != c0197g.f3866e[j5]) {
                return false;
            }
            j4++;
            j5++;
        }
        return true;
    }

    public final int hashCode() {
        int i3 = this.f3865d;
        if (i3 == 0) {
            int size = size();
            int j3 = j();
            int i4 = size;
            for (int i5 = j3; i5 < j3 + size; i5++) {
                i4 = (i4 * 31) + this.f3866e[i5];
            }
            i3 = i4 == 0 ? 1 : i4;
            this.f3865d = i3;
        }
        return i3;
    }

    public void i(int i3, byte[] bArr) {
        System.arraycopy(this.f3866e, 0, bArr, 0, i3);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0194d(this);
    }

    public int j() {
        return 0;
    }

    public byte k(int i3) {
        return this.f3866e[i3];
    }

    public int size() {
        return this.f3866e.length;
    }

    public final String toString() {
        C0197g c0196f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = e0.c(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int c3 = c(0, 47, size());
            if (c3 == 0) {
                c0196f = f3863f;
            } else {
                c0196f = new C0196f(this.f3866e, j(), c3);
            }
            sb2.append(e0.c(c0196f));
            sb2.append("...");
            sb = sb2.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + sb + "\">";
    }
}
