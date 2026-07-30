package com.drake.net.exception;

import com.drake.net.cache.a;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.Request;

/* loaded from: classes3.dex */
public final class NoCacheException extends NetException {
    public /* synthetic */ NoCacheException(Request request, String str, Throwable th, int i8, o oVar) {
        this(request, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : th);
    }

    @Override // com.drake.net.exception.NetException, java.lang.Throwable
    public String getLocalizedMessage() {
        return "cacheKey = " + a.Companion.key(getRequest()) + ' ' + super.getLocalizedMessage();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoCacheException(Request request, String str, Throwable th) {
        super(request, str, th);
        s.checkNotNullParameter(request, "request");
    }
}
