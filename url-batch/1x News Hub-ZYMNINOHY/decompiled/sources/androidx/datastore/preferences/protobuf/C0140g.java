package androidx.datastore.preferences.protobuf;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0140g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0140g f2294c = new C0140g(AbstractC0157y.f2365b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0138e f2295d;

    /* renamed from: a, reason: collision with root package name */
    public int f2296a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2297b;

    static {
        f2295d = AbstractC0136c.a() ? new C0138e(1) : new C0138e(0);
    }

    public C0140g(byte[] bArr) {
        bArr.getClass();
        this.f2297b = bArr;
    }

    public static int c(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0033i.i(i3, "Beginning index: ", " < 0"));
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0033i.g(i4, i5, "End index: ", " >= "));
    }

    public static C0140g d(byte[] bArr, int i3, int i4) {
        byte[] copyOfRange;
        c(i3, i3 + i4, bArr.length);
        switch (f2295d.f2292a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, copyOfRange, 0, i4);
                break;
        }
        return new C0140g(copyOfRange);
    }

    public byte b(int i3) {
        return this.f2297b[i3];
    }

    public void e(int i3, byte[] bArr) {
        System.arraycopy(this.f2297b, 0, bArr, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0140g) || size() != ((C0140g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0140g)) {
            return obj.equals(this);
        }
        C0140g c0140g = (C0140g) obj;
        int i3 = this.f2296a;
        int i4 = c0140g.f2296a;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > c0140g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0140g.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0140g.size());
        }
        int f = f() + size;
        int f3 = f();
        int f4 = c0140g.f();
        while (f3 < f) {
            if (this.f2297b[f3] != c0140g.f2297b[f4]) {
                return false;
            }
            f3++;
            f4++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i3) {
        return this.f2297b[i3];
    }

    public final int hashCode() {
        int i3 = this.f2296a;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        int f = f();
        int i4 = size;
        for (int i5 = f; i5 < f + size; i5++) {
            i4 = (i4 * 31) + this.f2297b[i5];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f2296a = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0137d(this);
    }

    public int size() {
        return this.f2297b.length;
    }

    public final String toString() {
        C0140g c0139f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0129a.m(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int c3 = c(0, 47, size());
            if (c3 == 0) {
                c0139f = f2294c;
            } else {
                c0139f = new C0139f(this.f2297b, f(), c3);
            }
            sb2.append(AbstractC0129a.m(c0139f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC0033i.m(sb3, sb, "\">");
    }
}
