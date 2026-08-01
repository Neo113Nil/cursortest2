package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f implements Iterable, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final f f533i = new f(x.f648b);

    /* renamed from: r, reason: collision with root package name */
    public static final d f534r;

    /* renamed from: d, reason: collision with root package name */
    public int f535d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f536e;

    static {
        f534r = b.a() ? new d(1) : new d(0);
    }

    public f(byte[] bArr) {
        bArr.getClass();
        this.f536e = bArr;
    }

    public static int c(int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if ((i3 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i3 < 0) {
            kotlin.collections.i0.g(n0.l.f(i3, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i10 < i3) {
            a2.r.e(i3, i10, ", ", "Beginning index larger than ending index: ");
            return 0;
        }
        a2.r.e(i10, i11, " >= ", "End index: ");
        return 0;
    }

    public static f e(byte[] bArr, int i3, int i10) {
        byte[] copyOfRange;
        c(i3, i3 + i10, bArr.length);
        switch (f534r.f521a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i10 + i3);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i3, copyOfRange, 0, i10);
                break;
        }
        return new f(copyOfRange);
    }

    public byte b(int i3) {
        return this.f536e[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f) || size() != ((f) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof f)) {
            return obj.equals(this);
        }
        f fVar = (f) obj;
        int i3 = this.f535d;
        int i10 = fVar.f535d;
        if (i3 != 0 && i10 != 0 && i3 != i10) {
            return false;
        }
        int size = size();
        if (size > fVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > fVar.size()) {
            StringBuilder i11 = n0.l.i(size, "Ran off end of other: 0, ", ", ");
            i11.append(fVar.size());
            throw new IllegalArgumentException(i11.toString());
        }
        byte[] bArr = fVar.f536e;
        int g = g() + size;
        int g2 = g();
        int g10 = fVar.g();
        while (g2 < g) {
            if (this.f536e[g2] != bArr[g10]) {
                return false;
            }
            g2++;
            g10++;
        }
        return true;
    }

    public void f(int i3, byte[] bArr) {
        System.arraycopy(this.f536e, 0, bArr, 0, i3);
    }

    public int g() {
        return 0;
    }

    public byte h(int i3) {
        return this.f536e[i3];
    }

    public final int hashCode() {
        int i3 = this.f535d;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        int g = g();
        int i10 = size;
        for (int i11 = g; i11 < g + size; i11++) {
            i10 = (i10 * 31) + this.f536e[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f535d = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this);
    }

    public int size() {
        return this.f536e.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = c6.f.B(this);
        } else {
            int c10 = c(0, 47, size());
            concat = c6.f.B(c10 == 0 ? f533i : new e(this.f536e, g(), c10)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return v4.a.o(sb2, concat, "\">");
    }
}
