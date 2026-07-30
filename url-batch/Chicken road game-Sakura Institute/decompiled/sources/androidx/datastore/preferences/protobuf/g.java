package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class g implements Iterable, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final g f816h = new g(x.f923b);

    /* renamed from: i, reason: collision with root package name */
    public static final e f817i;

    /* renamed from: f, reason: collision with root package name */
    public int f818f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f819g;

    static {
        f817i = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f819g = bArr;
    }

    public static int g(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(a0.m.g(i7, "Beginning index: ", " < 0"));
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(r6.i.b(i8, i9, "End index: ", " >= "));
    }

    public static g m(byte[] bArr, int i7, int i8) {
        byte[] copyOfRange;
        g(i7, i7 + i8, bArr.length);
        switch (f817i.f804a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i8 + i7);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i7, copyOfRange, 0, i8);
                break;
        }
        return new g(copyOfRange);
    }

    public byte a(int i7) {
        return this.f819g[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i7 = this.f818f;
        int i8 = gVar.f818f;
        if (i7 != 0 && i8 != 0 && i7 != i8) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder n8 = a0.m.n(size, "Ran off end of other: 0, ", ", ");
            n8.append(gVar.size());
            throw new IllegalArgumentException(n8.toString());
        }
        byte[] bArr = gVar.f819g;
        int x8 = x() + size;
        int x9 = x();
        int x10 = gVar.x();
        while (x9 < x8) {
            if (this.f819g[x9] != bArr[x10]) {
                return false;
            }
            x9++;
            x10++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f818f;
        if (i7 != 0) {
            return i7;
        }
        int size = size();
        int x8 = x();
        int i8 = size;
        for (int i9 = x8; i9 < x8 + size; i9++) {
            i8 = (i8 * 31) + this.f819g[i9];
        }
        if (i8 == 0) {
            i8 = 1;
        }
        this.f818f = i8;
        return i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f819g.length;
    }

    public final String toString() {
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = d1.c(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int g9 = g(0, 47, size());
            sb2.append(d1.c(g9 == 0 ? f816h : new f(this.f819g, x(), g9)));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return a0.m.m(sb3, sb, "\">");
    }

    public void w(int i7, byte[] bArr) {
        System.arraycopy(this.f819g, 0, bArr, 0, i7);
    }

    public int x() {
        return 0;
    }

    public byte y(int i7) {
        return this.f819g[i7];
    }
}
