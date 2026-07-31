package K0;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f808a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f809b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    public static String a(String str) {
        return b(str, "SHA-256");
    }

    private static String b(String str, String str2) {
        String str3;
        String str4;
        try {
            try {
                return c(MessageDigest.getInstance(str2).digest(str.getBytes("UTF-8")));
            } catch (NoSuchAlgorithmException unused) {
                str3 = f808a;
                str4 = "encrypt NoSuchAlgorithmException";
                Logger.w(str3, str4);
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = f808a;
            str4 = "encrypt UnsupportedEncodingException";
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4 & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i4 = 1;
        if (str.length() == 1) {
            return "*";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < str.length(); i5++) {
            String str2 = str.charAt(i5) + "";
            if (f809b.matcher(str2).matches()) {
                if (i4 % 2 == 0) {
                    str2 = "*";
                }
                i4++;
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }
}
