package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class er implements Iterable, Serializable {
    public static final cr n = new cr(f41.b);
    public static final nj o;
    private static final long serialVersionUID = 1;
    public int m;

    static {
        o = q6.a() ? new nj(8) : new nj(6);
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            a.c(in1.l(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            a.c(q40.j("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        a.c(q40.j("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static cr c(byte[] bArr, int i, int i2) {
        byte[] copyOfRange;
        b(i, i + i2, bArr.length);
        switch (o.m) {
            case 6:
                copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                copyOfRange = new byte[i2];
                System.arraycopy(bArr, i, copyOfRange, 0, i2);
                break;
        }
        return new cr(copyOfRange);
    }

    public abstract byte a(int i);

    public abstract void d(int i, byte[] bArr);

    public abstract byte e(int i);

    public final int hashCode() {
        int i = this.m;
        if (i != 0) {
            return i;
        }
        int size = size();
        cr crVar = (cr) this;
        int f = crVar.f();
        int i2 = size;
        for (int i3 = f; i3 < f + size; i3++) {
            i2 = (i2 * 31) + crVar.p[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.m = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = mh2.f(this);
        } else {
            cr crVar = (cr) this;
            int b = b(0, 47, crVar.size());
            concat = mh2.f(b == 0 ? n : new ar(crVar.p, crVar.f(), b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return q40.p(sb, concat, "\">");
    }
}
