package D;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Arrays;
import java.util.HashSet;
import t0.AbstractC5051n;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0287g extends E.e {
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (TextUtils.isEmpty(strArr[i4])) {
                throw new IllegalArgumentException(AbstractC5051n.g(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i9 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i9] = strArr[i10];
                    i9++;
                }
            }
        }
        if (activity instanceof InterfaceC0286f) {
            ((InterfaceC0286f) activity).validateRequestPermissionsRequestCode(i);
        }
        AbstractC0283c.b(activity, strArr, i);
    }

    public static boolean e(PermissionsActivity permissionsActivity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i >= 32 ? AbstractC0285e.a(permissionsActivity, str) : i == 31 ? AbstractC0284d.b(permissionsActivity, str) : AbstractC0283c.c(permissionsActivity, str);
        }
        return false;
    }
}
