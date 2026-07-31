package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class us0 {
    @Nullable
    public static String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (String) a(context, vs0.f33734f.a());
    }

    @Nullable
    public static ArrayList b(@NotNull Context context) {
        List split$default;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = (String) a(context, vs0.f33735g.a());
        if (str == null || (split$default = StringsKt.split$default(str, new String[]{StringUtils.COMMA}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.z((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Nullable
    public static Boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Boolean) a(context, vs0.f33732d.a());
    }

    public static boolean d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) a(context, vs0.f33736h.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static boolean e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) a(context, vs0.f33731c.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public static Boolean f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Boolean) a(context, vs0.f33733e.a());
    }

    public static boolean g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) a(context, vs0.f33737i.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            } catch (Throwable unused) {
                ap0.c(new Object[0]);
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        } catch (Throwable unused2) {
            ap0.c(new Object[0]);
        }
        return null;
    }
}
