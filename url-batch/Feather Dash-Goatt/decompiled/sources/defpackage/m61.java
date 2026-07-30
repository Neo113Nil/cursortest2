package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m61 implements Function1 {
    public static final m61 d = new m61();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.a(obj, Boolean.FALSE)) {
            return new hi(hi.g);
        }
        obj.getClass();
        return new hi(la0.c(((Integer) obj).intValue()));
    }
}
