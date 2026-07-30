package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0191g implements Iterable, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final C0191g f3498i = new C0191g(AbstractC0207x.f3572b);

    /* renamed from: l, reason: collision with root package name */
    public static final C0189e f3499l;

    /* renamed from: d, reason: collision with root package name */
    public int f3500d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f3501e;

    static {
        f3499l = AbstractC0187c.a() ? new C0189e(1) : new C0189e(0);
    }

    public C0191g(byte[] bArr) {
        bArr.getClass();
        this.f3501e = bArr;
    }

    public static int b(int i2, int i5, int i7) {
        int i8 = i5 - i2;
        if ((i2 | i5 | i8 | (i7 - i5)) >= 0) {
            return i8;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C4.p.h(i2, "Beginning index: ", " < 0"));
        }
        if (i5 < i2) {
            throw new IndexOutOfBoundsException(C4.p.j("Beginning index larger than ending index: ", ", ", i2, i5));
        }
        throw new IndexOutOfBoundsException(C4.p.j("End index: ", " >= ", i5, i7));
    }

    public static C0191g c(byte[] bArr, int i2, int i5) {
        byte[] copyOfRange;
        b(i2, i2 + i5, bArr.length);
        switch (f3499l.f3494a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i2, i5 + i2);
                break;
            default:
                copyOfRange = new byte[i5];
                System.arraycopy(bArr, i2, copyOfRange, 0, i5);
                break;
        }
        return new C0191g(copyOfRange);
    }

    public byte a(int i2) {
        return this.f3501e[i2];
    }

    public void d(byte[] bArr, int i2) {
        System.arraycopy(this.f3501e, 0, bArr, 0, i2);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0191g) || size() != ((C0191g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0191g)) {
            return obj.equals(this);
        }
        C0191g c0191g = (C0191g) obj;
        int i2 = this.f3500d;
        int i5 = c0191g.f3500d;
        if (i2 != 0 && i5 != 0 && i2 != i5) {
            return false;
        }
        int size = size();
        if (size > c0191g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0191g.size()) {
            StringBuilder k7 = C4.p.k(size, "Ran off end of other: 0, ", ", ");
            k7.append(c0191g.size());
            throw new IllegalArgumentException(k7.toString());
        }
        byte[] bArr = c0191g.f3501e;
        int e7 = e() + size;
        int e8 = e();
        int e9 = c0191g.e();
        while (e8 < e7) {
            if (this.f3501e[e8] != bArr[e9]) {
                return false;
            }
            e8++;
            e9++;
        }
        return true;
    }

    public byte f(int i2) {
        return this.f3501e[i2];
    }

    public final int hashCode() {
        int i2 = this.f3500d;
        if (i2 != 0) {
            return i2;
        }
        int size = size();
        int e7 = e();
        int i5 = size;
        for (int i7 = e7; i7 < e7 + size; i7++) {
            i5 = (i5 * 31) + this.f3501e[i7];
        }
        if (i5 == 0) {
            i5 = 1;
        }
        this.f3500d = i5;
        return i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0188d(this);
    }

    public int size() {
        return this.f3501e.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = O6.g.E(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b7 = b(0, 47, size());
            sb2.append(O6.g.E(b7 == 0 ? f3498i : new C0190f(this.f3501e, e(), b7)));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return r4.f.f(sb3, sb, "\">");
    }
}
