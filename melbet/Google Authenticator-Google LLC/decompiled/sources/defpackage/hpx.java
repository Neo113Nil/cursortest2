package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hpx {
    public static final hpx d = new hpu("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final hpx e = new hpu("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final hpx f = new hpw("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final hpx g;

    static {
        new hpw("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        g = new hpt(new hps("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i);

    public abstract int c(int i);

    public abstract int d(int i);

    public CharSequence e(CharSequence charSequence) {
        throw null;
    }

    public final String g(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(d(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] h(CharSequence charSequence) {
        try {
            CharSequence e2 = e(charSequence);
            int c = c(e2.length());
            byte[] bArr = new byte[c];
            int a = a(bArr, e2);
            if (a == c) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (hpv e3) {
            throw new IllegalArgumentException(e3);
        }
    }
}
