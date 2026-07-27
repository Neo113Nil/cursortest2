package androidx.datastore.preferences.protobuf;

import b2.AbstractC0279e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0212g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0212g f4436c = new C0212g(AbstractC0228x.f4509b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0210e f4437d;

    /* renamed from: a, reason: collision with root package name */
    public int f4438a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4439b;

    static {
        f4437d = AbstractC0208c.a() ? new C0210e(1) : new C0210e(0);
    }

    public C0212g(byte[] bArr) {
        bArr.getClass();
        this.f4439b = bArr;
    }

    public static int c(int i2, int i3, int i6) {
        int i7 = i3 - i2;
        if ((i2 | i3 | i7 | (i6 - i3)) >= 0) {
            return i7;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(B0.o.g(i2, "Beginning index: ", " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(B0.o.h("Beginning index larger than ending index: ", i2, i3, ", "));
        }
        throw new IndexOutOfBoundsException(B0.o.h("End index: ", i3, i6, " >= "));
    }

    public static C0212g d(byte[] bArr, int i2, int i3) {
        byte[] copyOfRange;
        c(i2, i2 + i3, bArr.length);
        switch (f4437d.f4432a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                copyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, copyOfRange, 0, i3);
                break;
        }
        return new C0212g(copyOfRange);
    }

    public byte b(int i2) {
        return this.f4439b[i2];
    }

    public void e(int i2, byte[] bArr) {
        System.arraycopy(this.f4439b, 0, bArr, 0, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0212g) || size() != ((C0212g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0212g)) {
            return obj.equals(this);
        }
        C0212g c0212g = (C0212g) obj;
        int i2 = this.f4438a;
        int i3 = c0212g.f4438a;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > c0212g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0212g.size()) {
            StringBuilder i6 = AbstractC0279e.i(size, "Ran off end of other: 0, ", ", ");
            i6.append(c0212g.size());
            throw new IllegalArgumentException(i6.toString());
        }
        int f3 = f() + size;
        int f6 = f();
        int f7 = c0212g.f();
        while (f6 < f3) {
            if (this.f4439b[f6] != c0212g.f4439b[f7]) {
                return false;
            }
            f6++;
            f7++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i2) {
        return this.f4439b[i2];
    }

    public final int hashCode() {
        int i2 = this.f4438a;
        if (i2 == 0) {
            int size = size();
            int f3 = f();
            int i3 = size;
            for (int i6 = f3; i6 < f3 + size; i6++) {
                i3 = (i3 * 31) + this.f4439b[i6];
            }
            i2 = i3 == 0 ? 1 : i3;
            this.f4438a = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0209d(this);
    }

    public int size() {
        return this.f4439b.length;
    }

    public final String toString() {
        C0212g c0211f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = B0.f.p(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int c2 = c(0, 47, size());
            if (c2 == 0) {
                c0211f = f4436c;
            } else {
                c0211f = new C0211f(this.f4439b, f(), c2);
            }
            sb2.append(B0.f.p(c0211f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return AbstractC0279e.h(sb3, sb, "\">");
    }
}
