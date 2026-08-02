package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljz {
    private static final Object a = new Object();
    private static int b;

    public static String a(Context context, liw liwVar, String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (liwVar != liw.e || ljb.a(context).getBoolean("android.net.http.UseLegacyDefaultUserAgent", false)) {
            sb.append(context.getPackageName());
            sb.append('/');
            synchronized (a) {
                i = b;
                if (i == 0) {
                    try {
                        i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        b = i;
                    } catch (PackageManager.NameNotFoundException unused) {
                        throw new IllegalStateException("Cannot determine package version");
                    }
                }
            }
            sb.append(i);
        } else {
            sb.append("AndroidHttpClient");
        }
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str2 = Build.MODEL;
        if (str2.length() > 0) {
            sb.append("; ");
            sb.append(str2);
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            sb.append("; Build/");
            sb.append(str3);
        }
        sb.append("; Cronet/");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
