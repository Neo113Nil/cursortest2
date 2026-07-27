package u;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import b2.AbstractC0279e;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1463d extends v.f {
    public static void b(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                throw new IllegalArgumentException(AbstractC0279e.h(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    strArr2[i6] = strArr[i7];
                    i6++;
                }
            }
        }
        AbstractC1460a.b(activity, strArr, i2);
    }

    public static boolean c(PermissionsActivity permissionsActivity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i2 >= 32 ? AbstractC1462c.a(permissionsActivity, str) : i2 == 31 ? AbstractC1461b.b(permissionsActivity, str) : AbstractC1460a.c(permissionsActivity, str);
        }
        return false;
    }
}
