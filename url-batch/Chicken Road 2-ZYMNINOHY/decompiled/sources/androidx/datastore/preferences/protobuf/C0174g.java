package androidx.datastore.preferences.protobuf;

import E.AbstractC0005f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0174g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0174g f4635c = new C0174g(AbstractC0191y.f4713b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0172e f4636d;

    /* renamed from: a, reason: collision with root package name */
    public int f4637a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4638b;

    static {
        f4636d = AbstractC0170c.a() ? new C0172e(1) : new C0172e(0);
    }

    public C0174g(byte[] bArr) {
        bArr.getClass();
        this.f4638b = bArr;
    }

    public static int c(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0005f.k(i4, "Beginning index: ", " < 0"));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0005f.i(i5, i6, "End index: ", " >= "));
    }

    public static C0174g d(byte[] bArr, int i4, int i5) {
        byte[] copyOfRange;
        c(i4, i4 + i5, bArr.length);
        switch (f4636d.f4632a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i4, i5 + i4);
                break;
            default:
                copyOfRange = new byte[i5];
                System.arraycopy(bArr, i4, copyOfRange, 0, i5);
                break;
        }
        return new C0174g(copyOfRange);
    }

    public byte b(int i4) {
        return this.f4638b[i4];
    }

    public void e(int i4, byte[] bArr) {
        System.arraycopy(this.f4638b, 0, bArr, 0, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0174g) || size() != ((C0174g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0174g)) {
            return obj.equals(this);
        }
        C0174g c0174g = (C0174g) obj;
        int i4 = this.f4637a;
        int i5 = c0174g.f4637a;
        if (i4 != 0 && i5 != 0 && i4 != i5) {
            return false;
        }
        int size = size();
        if (size > c0174g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0174g.size()) {
            StringBuilder r4 = AbstractC0005f.r(size, "Ran off end of other: 0, ", ", ");
            r4.append(c0174g.size());
            throw new IllegalArgumentException(r4.toString());
        }
        byte[] bArr = c0174g.f4638b;
        int f4 = f() + size;
        int f5 = f();
        int f6 = c0174g.f();
        while (f5 < f4) {
            if (this.f4638b[f5] != bArr[f6]) {
                return false;
            }
            f5++;
            f6++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i4) {
        return this.f4638b[i4];
    }

    public final int hashCode() {
        int i4 = this.f4637a;
        if (i4 != 0) {
            return i4;
        }
        int size = size();
        int f4 = f();
        int i5 = size;
        for (int i6 = f4; i6 < f4 + size; i6++) {
            i5 = (i5 * 31) + this.f4638b[i6];
        }
        if (i5 == 0) {
            i5 = 1;
        }
        this.f4637a = i5;
        return i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0171d(this);
    }

    public int size() {
        return this.f4638b.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = O3.l.o(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int c4 = c(0, 47, size());
            sb2.append(O3.l.o(c4 == 0 ? f4635c : new C0173f(this.f4638b, f(), c4)));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC0005f.q(sb3, sb, "\">");
    }
}
