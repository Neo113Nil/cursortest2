package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class im3 implements Iterable, Serializable {
    public static final im3 o = new im3(sn3.b);
    public int m = 0;
    public final byte[] n;

    static {
        int i = cm3.a;
    }

    public im3(byte[] bArr) {
        bArr.getClass();
        this.n = bArr;
    }

    public static im3 d(byte[] bArr, int i, int i2) {
        e(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new im3(bArr2);
    }

    public static int e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public byte a(int i) {
        return this.n[i];
    }

    public byte b(int i) {
        return this.n[i];
    }

    public int c() {
        return this.n.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof im3) && c() == ((im3) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof im3)) {
                return obj.equals(this);
            }
            im3 im3Var = (im3) obj;
            int i = this.m;
            int i2 = im3Var.m;
            if (i == 0 || i2 == 0 || i == i2) {
                int c = c();
                if (c > im3Var.c()) {
                    int c2 = c();
                    StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 18 + String.valueOf(c2).length());
                    sb.append("Length too large: ");
                    sb.append(c);
                    sb.append(c2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (c <= im3Var.c()) {
                    byte[] bArr = im3Var.n;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < c) {
                        if (this.n[i3] == bArr[i4]) {
                            i3++;
                            i4++;
                        }
                    }
                    return true;
                }
                int c3 = im3Var.c();
                StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 27 + String.valueOf(c3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(c);
                sb2.append(", ");
                sb2.append(c3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.m;
        if (i != 0) {
            return i;
        }
        int c = c();
        int i2 = c;
        for (int i3 = 0; i3 < c; i3++) {
            i2 = (i2 * 31) + this.n[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.m = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zq(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int c = c();
        if (c() <= 50) {
            concat = yh2.s(this);
        } else {
            int e = e(0, 47, c());
            concat = yh2.s(e == 0 ? o : new gm3(e, this.n)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(c);
        sb.append(" contents=\"");
        return q40.p(sb, concat, "\">");
    }
}
