package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.media.ResourceBusyException;
import com.yandex.mobile.ads.impl.C1909em;
import com.yandex.mobile.ads.impl.InterfaceC1837bm;
import com.yandex.mobile.ads.impl.InterfaceC2023jh;
import com.yandex.mobile.ads.impl.av0;
import com.yandex.mobile.ads.impl.mc2;
import com.yandex.mobile.ads.impl.pr0;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.wy;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fa1 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static mc2.a a(Throwable th) {
        mc2.a aVar;
        boolean z4;
        if (!(th instanceof qh1)) {
            if (th instanceof ji0) {
                return mc2.a.f29011j;
            }
            if (th instanceof av0.b) {
                return mc2.a.f29012k;
            }
            if (th instanceof uu0.b) {
                return mc2.a.f29013l;
            }
            if (th instanceof MediaCodec.CryptoException) {
                return mc2.a.f29016o;
            }
            if (th instanceof v30.a) {
                Throwable cause = ((v30.a) th).getCause();
                return cause == null ? mc2.a.f29018q : ((cause instanceof MediaDrmResetException) || (cause instanceof ResourceBusyException)) ? mc2.a.f29017p : ((cause instanceof MediaCodec.CryptoException) || (cause instanceof iq0)) ? mc2.a.f29016o : mc2.a.f29018q;
            }
            if (!(th instanceof zg0)) {
                return th instanceof xg0 ? ((xg0) th).getCause() instanceof SSLHandshakeException ? mc2.a.f29024w : mc2.a.f29025x : th instanceof wf1 ? mc2.a.f29026y : th instanceof pr0.g ? mc2.a.f29027z : ((th instanceof InterfaceC2023jh.a) || (th instanceof InterfaceC2023jh.b) || (th instanceof wy.h)) ? mc2.a.f28996A : th instanceof e32 ? mc2.a.f28997B : ((th instanceof InterfaceC1837bm.a) || (th instanceof C1909em.a)) ? mc2.a.f28998C : mc2.a.f29001F;
            }
            int i4 = ((zg0) th).f35589e;
            return i4 != 401 ? i4 != 403 ? i4 != 404 ? mc2.a.f29023v : mc2.a.f29022u : mc2.a.f29021t : mc2.a.f29020s;
        }
        Throwable cause2 = th.getCause();
        if (cause2 != null && (((z4 = cause2 instanceof MediaCodec.CodecException)) || (cause2 instanceof IllegalStateException) || (cause2 instanceof IllegalArgumentException))) {
            StackTraceElement[] stackTrace = cause2.getStackTrace();
            Intrinsics.checkNotNull(stackTrace);
            if (!(stackTrace.length == 0) && stackTrace[0].isNativeMethod() && Intrinsics.areEqual(stackTrace[0].getClassName(), "android.media.MediaCodec")) {
                String methodName = stackTrace[0].getMethodName();
                if (methodName == null) {
                    methodName = "";
                }
                if (Intrinsics.areEqual(methodName, "native_dequeueOutputBuffer")) {
                    aVar = mc2.a.f29003b;
                } else if (Intrinsics.areEqual(methodName, "native_dequeueInputBuffer")) {
                    aVar = mc2.a.f29004c;
                } else if (Intrinsics.areEqual(methodName, "native_stop")) {
                    aVar = mc2.a.f29005d;
                } else if (Intrinsics.areEqual(methodName, "native_setSurface")) {
                    aVar = mc2.a.f29006e;
                } else if (Intrinsics.areEqual(methodName, "releaseOutputBuffer")) {
                    aVar = mc2.a.f29007f;
                } else if (Intrinsics.areEqual(methodName, "native_queueSecureInputBuffer")) {
                    aVar = mc2.a.f29008g;
                } else if (z4) {
                    aVar = mc2.a.f29009h;
                }
                if (aVar == null) {
                    return aVar;
                }
                Throwable cause3 = th.getCause();
                mc2.a a4 = cause3 != null ? a(cause3) : null;
                return a4 == null ? mc2.a.f29000E : a4;
            }
        }
        aVar = null;
        if (aVar == null) {
        }
    }

    @NotNull
    public static mc2 a(@NotNull c60 throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new mc2(a((Throwable) throwable), throwable);
    }
}
