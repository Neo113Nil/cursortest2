package m7;

import org.greenrobot.eventbus.f;
import org.greenrobot.eventbus.g;

/* loaded from: classes5.dex */
public abstract class a {
    private static final a implementation;
    public final g defaultMainThreadSupport;
    public final f logger;

    static {
        implementation = b.isAndroidSDKAvailable() ? b.instantiateAndroidComponents() : null;
    }

    public a(f fVar, g gVar) {
        this.logger = fVar;
        this.defaultMainThreadSupport = gVar;
    }

    public static boolean areAvailable() {
        return implementation != null;
    }

    public static a get() {
        return implementation;
    }
}
