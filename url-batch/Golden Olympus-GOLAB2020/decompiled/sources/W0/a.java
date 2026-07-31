package W0;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f9601a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i4 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (f9601a.matcher(String.valueOf(charAt)).matches()) {
                if (i4 % 2 == 0) {
                    charAt = '*';
                }
                i4++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String b(String str, boolean z4) {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_NONE);
        if (!TextUtils.isEmpty(str)) {
            if (z4) {
                sb.append(a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, b(str2, false));
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, b(str2, false));
    }
}
