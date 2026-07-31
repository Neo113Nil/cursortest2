package c3;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import p3.b;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1381a {
    public static final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Class<?> cls = Class.forName("ru.ok.tracer.Tracer");
            return (String) cls.getMethod("getAppToken", null).invoke(cls.getField("INSTANCE").get(null), null);
        } catch (Exception unused) {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            b.a(packageName);
            String c4 = c(context, "tracer_app_token", null, 2, null);
            if (c4 == null || Intrinsics.areEqual(c4, "0000000000000000000000000000000000000000000")) {
                return null;
            }
            return c4;
        }
    }

    public static final String b(Context context, String name, String defPackage) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defPackage, "defPackage");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(name, "string", defPackage);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static /* synthetic */ String c(Context context, String str, String packageName, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        }
        return b(context, str, packageName);
    }
}
