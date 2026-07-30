package com.drake.net.exception;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.Response;

/* loaded from: classes3.dex */
public class HttpResponseException extends NetException {
    private final Response response;

    public /* synthetic */ HttpResponseException(Response response, String str, Throwable th, int i8, o oVar) {
        this(response, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : th);
    }

    public Response getResponse() {
        return this.response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpResponseException(Response response, String str, Throwable th) {
        super(response.request(), str, th);
        s.checkNotNullParameter(response, "response");
        this.response = response;
    }
}
