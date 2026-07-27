package a3;

import M2.J;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0425c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2.a[] f4946a = new C2.a[0];

    /* renamed from: b, reason: collision with root package name */
    public static final b3.t f4947b = new b3.t("NULL", 0);

    public static final Object a(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, C2.a frame) {
        Object h4;
        Object c4 = b3.v.c(coroutineContext, obj2);
        try {
            y yVar = new y(frame, coroutineContext);
            if (function2 instanceof E2.a) {
                J.d(2, function2);
                h4 = function2.h(obj, yVar);
            } else {
                h4 = D2.f.c(function2, obj, yVar);
            }
            b3.v.a(coroutineContext, c4);
            if (h4 == D2.a.f2163d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return h4;
        } catch (Throwable th) {
            b3.v.a(coroutineContext, c4);
            throw th;
        }
    }
}
