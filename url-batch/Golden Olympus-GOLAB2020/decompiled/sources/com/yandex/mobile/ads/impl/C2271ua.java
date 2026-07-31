package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import com.yandex.mobile.ads.impl.mc2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ua, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2271ua {
    private static mc2.a a(Throwable th) {
        return th instanceof MediaCodec.CryptoException ? mc2.a.f29016o : mc2.a.f28999D;
    }

    private static mc2.a b(Throwable th) {
        boolean z4;
        Throwable cause = th.getCause();
        if (cause != null && (((z4 = cause instanceof MediaCodec.CodecException)) || (cause instanceof IllegalStateException) || (cause instanceof IllegalArgumentException))) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            if (!(stackTrace.length == 0) && stackTrace[0].isNativeMethod() && Intrinsics.areEqual(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                String methodName = stackTrace[0].getMethodName();
                if (methodName == null) {
                    methodName = "";
                }
                if (Intrinsics.areEqual(methodName, "native_dequeueOutputBuffer")) {
                    return mc2.a.f29003b;
                }
                if (Intrinsics.areEqual(methodName, "native_dequeueInputBuffer")) {
                    return mc2.a.f29004c;
                }
                if (Intrinsics.areEqual(methodName, "native_stop")) {
                    return mc2.a.f29005d;
                }
                if (Intrinsics.areEqual(methodName, "native_setSurface")) {
                    return mc2.a.f29006e;
                }
                if (Intrinsics.areEqual(methodName, "releaseOutputBuffer")) {
                    return mc2.a.f29007f;
                }
                if (Intrinsics.areEqual(methodName, "native_queueSecureInputBuffer")) {
                    return mc2.a.f29008g;
                }
                if (z4) {
                    return mc2.a.f29009h;
                }
            }
        }
        return null;
    }

    @NotNull
    public static mc2 c(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new mc2(a(throwable), throwable);
    }
}
