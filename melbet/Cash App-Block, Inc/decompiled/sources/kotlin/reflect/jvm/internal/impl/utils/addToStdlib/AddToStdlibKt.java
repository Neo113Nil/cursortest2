package kotlin.reflect.jvm.internal.impl.utils.addToStdlib;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class AddToStdlibKt {
    static {
        new ConcurrentHashMap();
    }

    public static final Void shouldNotBeCalled(String str) {
        str.getClass();
        throw new IllegalStateException(str.toString());
    }

    public static /* synthetic */ Void shouldNotBeCalled$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}
