package t;

import android.os.Build;
import android.text.TextUtils;
import com.onesignal.core.activities.PermissionsActivity;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0644d extends u.f {
    public static boolean b(PermissionsActivity permissionsActivity, String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i7 >= 32 ? AbstractC0643c.a(permissionsActivity, str) : i7 == 31 ? AbstractC0642b.b(permissionsActivity, str) : AbstractC0641a.c(permissionsActivity, str);
        }
        return false;
    }
}
