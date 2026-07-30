package p1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.provider.Telephony;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static String getDialPackageName(Context context) {
        return getPackageName(context, new Intent("android.intent.action.DIAL"), 268435456);
    }

    @Nullable
    private static String getPackageName(Context context, Intent intent, int i8) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, i8);
        if (resolveActivity != null) {
            return resolveActivity.activityInfo.packageName;
        }
        return null;
    }

    public static String getSmsPackageName(Context context) {
        return Telephony.Sms.getDefaultSmsPackage(context);
    }
}
