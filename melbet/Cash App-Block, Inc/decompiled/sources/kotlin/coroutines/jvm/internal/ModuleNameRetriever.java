package kotlin.coroutines.jvm.internal;

import papa.internal.LaunchTracker;

/* loaded from: classes.dex */
public final class ModuleNameRetriever {
    public static final ModuleNameRetriever INSTANCE = new ModuleNameRetriever();
    public static LaunchTracker cache;
    public static final LaunchTracker notOnJava9;

    static {
        Object obj = null;
        notOnJava9 = new LaunchTracker(obj, obj, obj);
    }
}
