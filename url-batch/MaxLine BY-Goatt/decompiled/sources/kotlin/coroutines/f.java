package kotlin.coroutines;

import defpackage.ww;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class f {
    public static CoroutineContext.Element a(CoroutineContext.Element element, g gVar) {
        gVar.getClass();
        if (Intrinsics.b(element.getKey(), gVar)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, g gVar) {
        gVar.getClass();
        return Intrinsics.b(element.getKey(), gVar) ? h.m : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == h.m ? element : (CoroutineContext) coroutineContext.y(element, new ww(14));
    }
}
