package B6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f213a;

    static {
        Object n7;
        try {
            R5.l lVar = R5.n.f2421d;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            n7 = StringsKt.toIntOrNull(property);
        } catch (Throwable th) {
            R5.l lVar2 = R5.n.f2421d;
            n7 = V6.b.n(th);
        }
        if (n7 instanceof R5.m) {
            n7 = null;
        }
        Integer num = (Integer) n7;
        f213a = num != null ? num.intValue() : 2097152;
    }
}
