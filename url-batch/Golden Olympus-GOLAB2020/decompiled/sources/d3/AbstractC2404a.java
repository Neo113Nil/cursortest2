package d3;

import android.content.Context;
import c3.AbstractC1381a;
import kotlin.jvm.internal.Intrinsics;
import p3.b;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2404a {
    public static final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        b.a(packageName);
        String c4 = AbstractC1381a.c(context, "tracer_mapping_uuid", null, 2, null);
        if (c4 == null || Intrinsics.areEqual(c4, "00000000-0000-0000-0000-000000000000")) {
            return null;
        }
        return c4;
    }
}
