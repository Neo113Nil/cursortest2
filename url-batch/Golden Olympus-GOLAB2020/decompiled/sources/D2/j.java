package D2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j {
    public static final boolean a(C0350c c0350c, String str) {
        Intrinsics.checkNotNullParameter(c0350c, "<this>");
        return c0350c.a(k.c(str));
    }

    public static final i b(x xVar, String key, Boolean bool) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return xVar.b(key, k.a(bool));
    }

    public static final i c(x xVar, String key, Number number) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return xVar.b(key, k.b(number));
    }

    public static final i d(x xVar, String key, String str) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return xVar.b(key, k.c(str));
    }

    public static final i e(x xVar, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C0350c c0350c = new C0350c();
        builderAction.invoke(c0350c);
        return xVar.b(key, c0350c.b());
    }

    public static final i f(x xVar, String key, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        x xVar2 = new x();
        builderAction.invoke(xVar2);
        return xVar.b(key, xVar2.a());
    }
}
