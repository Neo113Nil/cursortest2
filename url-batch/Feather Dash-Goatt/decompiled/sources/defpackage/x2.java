package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 extends c40 implements Function2 {
    public static final x2 m = new x2(2, nk0.class, "min", "min(II)I", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
