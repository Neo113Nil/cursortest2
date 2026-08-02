package kotlin.time;

import io.noties.markwon.LinkResolverDef;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes9.dex */
public abstract class InstantJvmKt {
    public static final Clock systemClock;

    static {
        Integer num = JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion;
        systemClock = (num == null || num.intValue() >= 26) ? new LinkResolverDef(21) : new y0();
    }

    public static final Instant systemClockNow() {
        return systemClock.now();
    }
}
