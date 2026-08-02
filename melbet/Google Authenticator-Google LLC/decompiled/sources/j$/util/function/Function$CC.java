package j$.util.function;

import java.util.function.Function;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$andThen(Function function, Function function2) {
        function2.getClass();
        return new a(function, function2, 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        function2.getClass();
        return new a(function, function2, 1);
    }
}
