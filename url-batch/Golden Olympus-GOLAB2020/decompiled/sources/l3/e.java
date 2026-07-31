package l3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f41343a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f41344b;

    static {
        Charset charset = Charsets.UTF_8;
        byte[] bytes = "\r\n".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f41343a = bytes;
        byte[] bytes2 = "--".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        f41344b = bytes2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(StringBuilder sb, String str) {
        sb.append('\"');
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\"' || charAt == '\\' || charAt == '\r') {
                for (int i5 = 0; i5 < str.length(); i5++) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 == '\"' || charAt2 == '\\' || charAt2 == '\r') {
                        sb.append('\\');
                    }
                    sb.append(charAt2);
                }
                sb.append('\"');
            }
        }
        sb.append(str);
        sb.append('\"');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(String str) {
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            i4 += charAt <= 127 ? 1 : charAt <= 2047 ? 2 : 3;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(OutputStream outputStream, String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt <= 127) {
                outputStream.write(charAt);
            } else if (charAt <= 2047) {
                outputStream.write((charAt >> 6) | 192);
                outputStream.write((charAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            } else {
                outputStream.write((charAt >> '\f') | 224);
                outputStream.write(((charAt >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                outputStream.write((charAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            }
        }
    }
}
