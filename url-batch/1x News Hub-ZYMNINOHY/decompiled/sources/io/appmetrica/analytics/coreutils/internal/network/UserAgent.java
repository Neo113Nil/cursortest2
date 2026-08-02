package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import s2.n;

/* loaded from: classes.dex */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(str2);
        sb.append('.');
        sb.append(str3);
        sb.append(" (");
        INSTANCE.getClass();
        String str4 = Build.MODEL;
        String str5 = Build.MANUFACTURER;
        if (!n.X(str4, str5)) {
            str4 = str5 + ' ' + str4;
        }
        sb.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb.append("; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(')');
        return sb.toString();
    }
}
