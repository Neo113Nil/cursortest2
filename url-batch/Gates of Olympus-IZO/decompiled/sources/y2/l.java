package y2;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f8857a;

    static {
        String[] strArr = new String[93];
        for (int i3 = 0; i3 < 32; i3++) {
            strArr[i3] = "\\u" + b(i3 >> 12) + b(i3 >> 8) + b(i3 >> 4) + b(i3);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f8857a = strArr;
        byte[] bArr = new byte[93];
        for (int i4 = 0; i4 < 32; i4++) {
            bArr[i4] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
    }

    public static final void a(StringBuilder sb, String str) {
        Z1.i.f(str, "value");
        sb.append('\"');
        int length = str.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            String[] strArr = f8857a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i3, i4);
                sb.append(strArr[charAt]);
                i3 = i4 + 1;
            }
        }
        if (i3 != 0) {
            sb.append((CharSequence) str, i3, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char b(int i3) {
        int i4 = i3 & 15;
        return (char) (i4 < 10 ? i4 + 48 : i4 + 87);
    }
}
