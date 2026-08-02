package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hpa {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract boolean c(hpa hpaVar);

    public abstract byte[] d();

    public byte[] e() {
        return d();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hpa) {
            hpa hpaVar = (hpa) obj;
            if (b() == hpaVar.b() && c(hpaVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] e = e();
        int i = e[0] & 255;
        for (int i2 = 1; i2 < e.length; i2++) {
            i |= (e[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] e = e();
        int length = e.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : e) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
