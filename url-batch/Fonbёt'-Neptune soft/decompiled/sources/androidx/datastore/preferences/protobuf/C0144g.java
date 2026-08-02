package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0144g implements Iterable, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0144g f1685g = new C0144g(AbstractC0161y.f1762b);

    /* renamed from: h, reason: collision with root package name */
    public static final C0142e f1686h;

    /* renamed from: e, reason: collision with root package name */
    public int f1687e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1688f;

    static {
        f1686h = AbstractC0140c.a() ? new C0142e(1) : new C0142e(0);
    }

    public C0144g(byte[] bArr) {
        bArr.getClass();
        this.f1688f = bArr;
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static C0144g c(byte[] bArr, int i2, int i3) {
        byte[] copyOfRange;
        b(i2, i2 + i3, bArr.length);
        switch (f1686h.f1682a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                copyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, copyOfRange, 0, i3);
                break;
        }
        return new C0144g(copyOfRange);
    }

    public byte a(int i2) {
        return this.f1688f[i2];
    }

    public void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1688f, 0, bArr, 0, i2);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0144g) || size() != ((C0144g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0144g)) {
            return obj.equals(this);
        }
        C0144g c0144g = (C0144g) obj;
        int i2 = this.f1687e;
        int i3 = c0144g.f1687e;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > c0144g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0144g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0144g.size());
        }
        int e2 = e() + size;
        int e3 = e();
        int e4 = c0144g.e();
        while (e3 < e2) {
            if (this.f1688f[e3] != c0144g.f1688f[e4]) {
                return false;
            }
            e3++;
            e4++;
        }
        return true;
    }

    public byte f(int i2) {
        return this.f1688f[i2];
    }

    public final int hashCode() {
        int i2 = this.f1687e;
        if (i2 == 0) {
            int size = size();
            int e2 = e();
            int i3 = size;
            for (int i4 = e2; i4 < e2 + size; i4++) {
                i3 = (i3 * 31) + this.f1688f[i4];
            }
            i2 = i3 == 0 ? 1 : i3;
            this.f1687e = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0141d(this);
    }

    public int size() {
        return this.f1688f.length;
    }

    public final String toString() {
        C0144g c0143f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = i1.a.j(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b2 = b(0, 47, size());
            if (b2 == 0) {
                c0143f = f1685g;
            } else {
                c0143f = new C0143f(this.f1688f, e(), b2);
            }
            sb2.append(i1.a.j(c0143f));
            sb2.append("...");
            sb = sb2.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + sb + "\">";
    }
}
