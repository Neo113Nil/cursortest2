package com.drake.net.exception;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public class URLParseException extends Exception {
    private String occurred;

    /* JADX WARN: Multi-variable type inference failed */
    public URLParseException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return super.getLocalizedMessage() + this.occurred;
    }

    public final String getOccurred() {
        return this.occurred;
    }

    public final void setOccurred(String str) {
        s.checkNotNullParameter(str, "<set-?>");
        this.occurred = str;
    }

    public /* synthetic */ URLParseException(String str, Throwable th, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : th);
    }

    public URLParseException(String str, Throwable th) {
        super(str, th);
        this.occurred = "";
    }
}
