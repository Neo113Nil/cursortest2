package t2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class E {
    public static final AbstractC3429D b(Object obj) {
        if (obj == AbstractC3433d.f46225a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (AbstractC3429D) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC3433d.f46225a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
