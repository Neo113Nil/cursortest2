package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public abstract class u extends Service {

    private static class a {
        static int a() {
            return UserVerificationMethods.USER_VERIFY_NONE;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) u.class), a.a() | UserVerificationMethods.USER_VERIFY_PATTERN);
    }
}
