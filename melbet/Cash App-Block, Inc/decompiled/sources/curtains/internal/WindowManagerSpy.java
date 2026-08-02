package curtains.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WindowManagerSpy {
    public static final Lazy mViewsField$delegate;
    public static final Lazy windowManagerClass$delegate;
    public static final Lazy windowManagerInstance$delegate;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        windowManagerClass$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) WindowSpy$windowField$2.INSTANCE$6);
        windowManagerInstance$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) WindowSpy$windowField$2.INSTANCE$7);
        mViewsField$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) WindowSpy$windowField$2.INSTANCE$5);
    }
}
