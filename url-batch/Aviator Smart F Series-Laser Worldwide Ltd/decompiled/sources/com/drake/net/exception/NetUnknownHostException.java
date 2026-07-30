package com.drake.net.exception;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.Request;

/* loaded from: classes3.dex */
public final class NetUnknownHostException extends HttpFailureException {
    public /* synthetic */ NetUnknownHostException(Request request, String str, Throwable th, int i8, o oVar) {
        this(request, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetUnknownHostException(Request request, String str, Throwable th) {
        super(request, str, th);
        s.checkNotNullParameter(request, "request");
    }
}
