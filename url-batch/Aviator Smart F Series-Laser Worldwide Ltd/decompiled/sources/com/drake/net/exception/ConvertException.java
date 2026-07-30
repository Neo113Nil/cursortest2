package com.drake.net.exception;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class ConvertException extends HttpResponseException {
    private Object tag;

    public /* synthetic */ ConvertException(Response response, String str, Throwable th, Object obj, int i8, o oVar) {
        this(response, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : th, (i8 & 8) != 0 ? null : obj);
    }

    public final Object getTag() {
        return this.tag;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertException(Response response, String str, Throwable th, Object obj) {
        super(response, str, th);
        s.checkNotNullParameter(response, "response");
        this.tag = obj;
    }
}
