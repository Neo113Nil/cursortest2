package curtains.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class WindowSpy {
    public static final Lazy decorViewClass$delegate;
    public static final Lazy windowField$delegate;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        decorViewClass$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) WindowSpy$windowField$2.INSTANCE$8);
        windowField$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) WindowSpy$windowField$2.INSTANCE);
    }
}
