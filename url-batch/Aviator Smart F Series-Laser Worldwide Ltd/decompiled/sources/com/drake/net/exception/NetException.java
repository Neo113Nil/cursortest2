package com.drake.net.exception;

import java.io.IOException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.Request;

/* loaded from: classes3.dex */
public class NetException extends IOException {
    private String occurred;
    private final Request request;

    public /* synthetic */ NetException(Request request, String str, Throwable th, int i8, o oVar) {
        this(request, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getMessage() == null) {
            str = "";
        } else {
            str = getMessage() + ' ';
        }
        sb.append(str);
        sb.append(getRequest().url());
        sb.append(this.occurred);
        return sb.toString();
    }

    public final String getOccurred() {
        return this.occurred;
    }

    public Request getRequest() {
        return this.request;
    }

    public final void setOccurred(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.occurred = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetException(Request request, String str, Throwable th) {
        super(str, th);
        s.checkNotNullParameter(request, "request");
        this.request = request;
        this.occurred = "";
    }
}
