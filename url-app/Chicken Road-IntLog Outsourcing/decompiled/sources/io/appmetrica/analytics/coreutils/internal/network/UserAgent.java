package io.appmetrica.analytics.coreutils.internal.network;

import B0.o;
import B4.r;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;

/* loaded from: classes.dex */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append('.');
        sb.append(str3);
        sb.append(" (");
        INSTANCE.getClass();
        String str4 = Build.MODEL;
        String str5 = Build.MANUFACTURER;
        if (!r.O(str4, str5, false)) {
            str4 = str5 + ' ' + str4;
        }
        sb.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb.append("; Android ");
        return o.l(sb, Build.VERSION.RELEASE, ')');
    }
}
