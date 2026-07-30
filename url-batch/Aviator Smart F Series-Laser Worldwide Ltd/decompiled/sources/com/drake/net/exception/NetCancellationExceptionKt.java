package com.drake.net.exception;

import kotlin.jvm.internal.s;
import kotlinx.coroutines.i0;

/* loaded from: classes3.dex */
public final class NetCancellationExceptionKt {
    public static final NetCancellationException NetCancellationException(i0 i0Var, String str) {
        s.checkNotNullParameter(i0Var, "<this>");
        return new NetCancellationException(i0Var, str);
    }

    public static /* synthetic */ NetCancellationException NetCancellationException$default(i0 i0Var, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        return NetCancellationException(i0Var, str);
    }
}
