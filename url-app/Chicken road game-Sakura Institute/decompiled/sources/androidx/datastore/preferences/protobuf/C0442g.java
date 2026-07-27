package androidx.datastore.preferences.protobuf;

import A.AbstractC0017m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0442g implements Iterable, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final C0442g f5338i = new C0442g(AbstractC0458x.f5410b);

    /* renamed from: j, reason: collision with root package name */
    public static final C0440e f5339j;

    /* renamed from: d, reason: collision with root package name */
    public int f5340d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f5341e;

    static {
        f5339j = AbstractC0438c.a() ? new C0440e(1) : new C0440e(0);
    }

    public C0442g(byte[] bArr) {
        bArr.getClass();
        this.f5341e = bArr;
    }

    public static int h(int i2, int i4, int i5) {
        int i6 = i4 - i2;
        if ((i2 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0017m.h(i2, "Beginning index: ", " < 0"));
        }
        if (i4 < i2) {
            throw new IndexOutOfBoundsException(r0.B.b(i2, i4, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(r0.B.b(i4, i5, "End index: ", " >= "));
    }

    public static C0442g j(byte[] bArr, int i2, int i4) {
        byte[] copyOfRange;
        h(i2, i2 + i4, bArr.length);
        switch (f5339j.f5330a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i2, i4 + i2);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i2, copyOfRange, 0, i4);
                break;
        }
        return new C0442g(copyOfRange);
    }

    public byte B(int i2) {
        return this.f5341e[i2];
    }

    public byte e(int i2) {
        return this.f5341e[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0442g) || size() != ((C0442g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0442g)) {
            return obj.equals(this);
        }
        C0442g c0442g = (C0442g) obj;
        int i2 = this.f5340d;
        int i4 = c0442g.f5340d;
        if (i2 != 0 && i4 != 0 && i2 != i4) {
            return false;
        }
        int size = size();
        if (size > c0442g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0442g.size()) {
            StringBuilder o4 = AbstractC0017m.o(size, "Ran off end of other: 0, ", ", ");
            o4.append(c0442g.size());
            throw new IllegalArgumentException(o4.toString());
        }
        int w4 = w() + size;
        int w5 = w();
        int w6 = c0442g.w();
        while (w5 < w4) {
            if (this.f5341e[w5] != c0442g.f5341e[w6]) {
                return false;
            }
            w5++;
            w6++;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = this.f5340d;
        if (i2 == 0) {
            int size = size();
            int w4 = w();
            int i4 = size;
            for (int i5 = w4; i5 < w4 + size; i5++) {
                i4 = (i4 * 31) + this.f5341e[i5];
            }
            i2 = i4 == 0 ? 1 : i4;
            this.f5340d = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0439d(this);
    }

    public void s(byte[] bArr, int i2) {
        System.arraycopy(this.f5341e, 0, bArr, 0, i2);
    }

    public int size() {
        return this.f5341e.length;
    }

    public final String toString() {
        C0442g c0441f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = e0.c(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int h4 = h(0, 47, size());
            if (h4 == 0) {
                c0441f = f5338i;
            } else {
                c0441f = new C0441f(this.f5341e, w(), h4);
            }
            sb2.append(e0.c(c0441f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC0017m.n(sb3, sb, "\">");
    }

    public int w() {
        return 0;
    }
}
