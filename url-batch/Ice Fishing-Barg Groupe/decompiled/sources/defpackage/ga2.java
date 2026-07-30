package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ga2 {
    public static final String[] PxuCJdSBwIXG;
    public static final byte[] lS5Rgt96tfkO;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + lS5Rgt96tfkO(i >> 12) + lS5Rgt96tfkO(i >> 8) + lS5Rgt96tfkO(i >> 4) + lS5Rgt96tfkO(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        PxuCJdSBwIXG = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        lS5Rgt96tfkO = bArr;
    }

    public static final void PxuCJdSBwIXG(StringBuilder sb, String str) {
        str.getClass();
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = PxuCJdSBwIXG;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char lS5Rgt96tfkO(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }
}
