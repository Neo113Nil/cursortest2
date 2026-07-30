package com.drake.net.exception;

import com.drake.net.a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.i0;

/* loaded from: classes3.dex */
public final class NetCancellationException extends CancellationException {
    public /* synthetic */ NetCancellationException(i0 i0Var, String str, int i8, o oVar) {
        this(i0Var, (i8 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetCancellationException(i0 coroutineScope, String str) {
        super(str);
        s.checkNotNullParameter(coroutineScope, "coroutineScope");
        a.cancelGroup(coroutineScope.getCoroutineContext().get(g0.Key));
    }
}
