package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class q {
    public static S5.e a(S5.e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.f();
        builder.f2522i = true;
        return builder.f2521e > 0 ? builder : S5.e.f2519m;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }
}
