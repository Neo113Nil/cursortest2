package E2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f587a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f588b;

    static {
        String[] strArr = new String[93];
        for (int i4 = 0; i4 < 32; i4++) {
            strArr[i4] = "\\u" + e(i4 >> 12) + e(i4 >> 8) + e(i4 >> 4) + e(i4);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f587a = strArr;
        byte[] bArr = new byte[93];
        for (int i5 = 0; i5 < 32; i5++) {
            bArr[i5] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f588b = bArr;
    }

    public static final byte[] a() {
        return f588b;
    }

    public static final String[] b() {
        return f587a;
    }

    public static final void c(StringBuilder sb, String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append('\"');
        int length = value.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = value.charAt(i5);
            String[] strArr = f587a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i4, i5);
                sb.append(strArr[charAt]);
                i4 = i5 + 1;
            }
        }
        if (i4 != 0) {
            sb.append((CharSequence) value, i4, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final Boolean d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.w(str, com.ironsource.mediationsdk.metadata.a.f17681g, true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.w(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char e(int i4) {
        int i5 = i4 & 15;
        return (char) (i5 < 10 ? i5 + 48 : i5 + 87);
    }
}
