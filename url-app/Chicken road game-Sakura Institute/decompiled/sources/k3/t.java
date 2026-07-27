package k3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7477a;

    static {
        String[] strArr = new String[93];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u" + b(i2 >> 12) + b(i2 >> 8) + b(i2 >> 4) + b(i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f7477a = strArr;
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

    public static final void a(StringBuilder sb, String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append('\"');
        int length = value.length();
        int i2 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = value.charAt(i4);
            String[] strArr = f7477a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i2, i4);
                sb.append(strArr[charAt]);
                i2 = i4 + 1;
            }
        }
        if (i2 != 0) {
            sb.append((CharSequence) value, i2, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char b(int i2) {
        int i4 = i2 & 15;
        return (char) (i4 < 10 ? i4 + 48 : i4 + 87);
    }
}
