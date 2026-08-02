package kotlin.reflect.jvm.internal.impl.platform;

import kotlin.collections.CollectionsKt;

/* loaded from: classes9.dex */
public final class PlatformUtilKt {
    public static final String getPresentableDescription(TargetPlatform targetPlatform) {
        targetPlatform.getClass();
        return CollectionsKt.joinToString$default(targetPlatform.getComponentPlatforms(), "/", null, null, 0, null, null, 62);
    }
}
