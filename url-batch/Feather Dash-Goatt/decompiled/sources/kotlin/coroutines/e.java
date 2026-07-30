package kotlin.coroutines;

import defpackage.e9;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        if (Intrinsics.a(element.getKey(), fVar)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        return Intrinsics.a(element.getKey(), fVar) ? g.d : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.d ? element : (CoroutineContext) coroutineContext.p(element, new e9(5, (byte) 0));
    }
}
